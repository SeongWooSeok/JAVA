package study10_3;

public class dbWorkClass {
	public static void dbworkClass(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbworkClass(new OracleDao());
		dbworkClass(new MysqlDao());
	}
}
