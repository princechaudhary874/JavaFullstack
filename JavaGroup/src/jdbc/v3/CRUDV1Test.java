package jdbc.v3;

public class CRUDV1Test {

	public static void main(String[] args) {
		int pid=10;//Read from user
		String name="Roshan Rajput";//Read from user
		String address="Ram";//Read from user
		boolean result=new CRUDV1().insert(pid, name, address);
		if (result) {
			System.out.println("Insert record successfully!");
		} else {
			System.out.println("Error to insert record");
		}

	}

}
