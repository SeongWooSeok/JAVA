package study10_3;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
	
	default void run() {
		select();
		insert();
		update();
		delete();
	}
}
