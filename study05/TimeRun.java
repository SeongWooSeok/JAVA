package study05;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import javax.print.attribute.standard.DateTimeAtCompleted;

import study01.Sysout;

public class TimeRun {
	public static void main(String[] args) {
		//java.time 기본 클래스
		//LocalDate(날짜) , LocalTime(시간), LocalDateTime(모두)
		//ZonedDateTime
		//차이 Period(날짜), Duration(시간)
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		date = LocalDate.of(2022, 07, 24);
		time = LocalTime.of(12, 55, 38);
		zdt = ZonedDateTime.of(dt, ZoneId.of("America/New_York"));
		System.out.println(date);
		System.out.println(time);
		System.out.println(zdt);
		//받아오기
		System.out.println();
		
		System.out.println(date.getYear()); //연도
		System.out.println(date.getMonthValue()); //월
		System.out.println(date.getMonth()); //월(Month 영문)
		System.out.println(date.getDayOfMonth()); //일
		System.out.println(date.getDayOfYear()); //일(365일기준)
		System.out.println(date.getDayOfWeek());//요일
		System.out.println(date.getDayOfWeek().getValue());
		System.out.println(date.lengthOfMonth());//달의 총 일수
		System.out.println(date.lengthOfYear());//년의 총수
		System.out.println(date.isLeapYear());//윤년
		
		System.out.println(time.getHour());//시
		System.out.println(time.getMinute());//분
		System.out.println(time.getSecond());//초
		System.out.println(time.getNano());//나노초
		
		//값을 변경
		System.out.println(date.withYear(2002));		
		System.out.println(date.withMonth(12));		
		System.out.println(date.withDayOfMonth(25));
		System.out.println(date.withDayOfYear(120));
		System.out.println(date);
		System.out.println(time.withHour(1));
		System.out.println(time.withMinute(26));
		System.out.println(time.withSecond(30));
		System.out.println(time.withNano(1234));
		LocalDate date2 = date.withYear(2002);
		System.out.println(date2);
		System.out.println(time);
		
		//날짜 계산
		System.out.println(date2.plusYears(20));
		System.out.println(date2.plusMonths(5));
		System.out.println(date2.plusWeeks(1));
		System.out.println(date2.plusDays(7));
		System.out.println(date2.minusYears(2));
		System.out.println(date2.minusMonths(1));
		System.out.println(date2.minusWeeks(2));
		System.out.println(date2.minusDays(7));
		
		LocalTime time2 = LocalTime.now();
		String sAmpm;
		if(time2.get(ChronoField.AMPM_OF_DAY)==0) {
			sAmpm = "오전";
		}else {
			sAmpm = "오후";
		}
		System.out.println("지금 " +sAmpm+" "+time2.getHour()+"시 "+time2.get(ChronoField.CLOCK_HOUR_OF_AMPM)+"시");
		
		//YEAR 연도
		System.out.println(dt.get(ChronoField.YEAR));
		//MONTH_OF_YEAR 월
		System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
		//일
		System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
		//요일
		System.out.println(dt.get(ChronoField.DAY_OF_WEEK));
		//오전오후
		System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
		//시(0~23)
		System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
		//시(0~24)
		System.out.println(dt.get(ChronoField.CLOCK_HOUR_OF_DAY));
		//시(0~11)
		System.out.println(dt.get(ChronoField.HOUR_OF_AMPM));
		//시(1~12)
		System.out.println(dt.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		//분
		System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR));
		//초
		System.out.println(dt.get(ChronoField.SECOND_OF_MINUTE));
		//연도의 일수
		System.out.println(dt.get(ChronoField.DAY_OF_YEAR));
		
		LocalDate date3 = LocalDate.of(2015, 6, 15);
		LocalDate date4 = LocalDate.of(2015, 5, 15);	
		LocalTime time3 = LocalTime.of(15, 30, 25);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2015, 6,15,15,30,30);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = date3.atTime(time3);
		System.out.println(dateTime3);
		LocalDateTime dateTime4 = time3.atDate(date3);
		System.out.println(dateTime4);
		
		LocalDate date5 = dateTime2.toLocalDate();
		LocalTime time5 = dateTime2.toLocalTime();
		System.out.println(date5);
		System.out.println(time5);
		
		//isAfter() isBefore() isEqual()
		System.out.println(date3+" "+date4);
		System.out.println(date3.isAfter(date4));
		System.out.println(date3.isBefore(date4));
		System.out.println(date3.isEqual(date4));
		
		//TemporalAdjusters 필요한 계산
		LocalDate dt1 = LocalDate.now();
		System.out.println(dt1);
		LocalDate nextYear = dt1.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(nextYear);
		LocalDate nextMon = dt1.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(nextMon);
		
		LocalDate dow1 = dt1.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
		System.out.println(dow1);
		LocalDate dow2 = dt1.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.println(dow2);		
		LocalDate dow3 = dt1.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println(dow3);		
		LocalDate dow4 = dt1.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println(dow4);		
		LocalDate dow5 = dt1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(dow5);
		LocalDate dow6 = dt1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println(dow6);
		LocalDate dow7 = dt1.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(dow7);
		
		//period duration
		LocalDate lDate1 = LocalDate.of(2002, 7, 8);
		LocalDate lDate2 = LocalDate.of(2018, 7, 8);
		LocalTime lTime1 = LocalTime.of(8, 30, 12);
		LocalTime lTime2 = LocalTime.of(15, 16, 22);
		
		Period pe = Period.between(lDate1, lDate2);
		Duration du = Duration.between(lTime1, lTime2);
		
		System.out.println(pe);
		System.out.println(pe.getYears());
		System.out.println(pe.getMonths());
		System.out.println(pe.getDays());
		System.out.println(du);
		System.out.println(du.getSeconds());
		LocalTime se = LocalTime.of(0, 0, 0).plusSeconds(du.getSeconds());
		System.out.println(se.getHour());
		System.out.println(se.getMinute());
		System.out.println(se.getSecond());
		
		System.out.println(pe);
		System.out.println(du);
		System.out.println(pe.toTotalMonths());
		System.out.println(du.toMinutes());
		System.out.println(pe.withYears(1));
		System.out.println(du.withSeconds(100));
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter form =  DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일  a HH시mm분").withLocale(Locale.forLanguageTag("ko"));
		System.out.println(ldt.format(form));
		
		
		LocalDate startDate = LocalDate.of(1939, 9, 1);
		LocalDate endDate = LocalDate.of(1945, 9, 2);

		long months = ChronoUnit.MONTHS.between(startDate, endDate);
		long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
		long days = ChronoUnit.DAYS.between(startDate, endDate);

		System.out.println("Months: " + months);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);

		LocalTime startTime = LocalTime.of(10, 35, 40);
		LocalTime endTime = LocalTime.of(10, 36, 50, 800);

		long hours = ChronoUnit.HOURS.between(startTime, endTime);
		long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
		long seconds = ChronoUnit.SECONDS.between(startTime, endTime);

		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
