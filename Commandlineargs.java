
public class Commandlineargs {

	public static void main(String[] args) {
		int eid = Integer.parseInt(args[0]);
		String ename = args[1];
		float salary = Float.parseFloat(args[2]);
		String address = args[3];
		String email = args[4];
		byte age = Byte.parseByte(args[5]);

		System.out.println("Employee Info:");
		System.out.println(eid + " " + ename + "  " + salary + " " + address + " " + email + " " + age);

	}

}
