package singleton;

public class SingletonTest {

	public static void main(String[] args) {

		ConnectionPool pool1 = ConnectionPool.getInstance();
		
		ConnectionPool pool2 = ConnectionPool.getInstance();
		
		System.out.println(pool1 == pool2);
	}

}
