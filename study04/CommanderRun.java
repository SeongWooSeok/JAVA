package study04;

import java.util.Calendar;

public class CommanderRun {
	public static void main(String[] args) {
		//객체 생성
		Calendar cal = Calendar.getInstance();
		
		//get
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.JANUARY)+">1월");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.TUESDAY);
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"처");
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.PM));
		System.out.println(Calendar.PM);
	
		
		
		
		
		
		
		

	}

}
