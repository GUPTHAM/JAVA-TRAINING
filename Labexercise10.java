
public class Labexercise10 {
//variable to keep track of objects  
	private static int count;

//constructor of the class  
	public Labexercise10() {
// increase the count variable by 1  
		count++;
	}

	public static void main(String args[]) {
//creating objects  
		Labexercise10 ob1 = new Labexercise10();
		Labexercise10 ob2 = new Labexercise10();
		Labexercise10 ob3 = new Labexercise10();
		Labexercise10 ob4 = new Labexercise10();
		Labexercise10 ob5 = new Labexercise10();
//prints number of objects  
		System.out.print("Total Number of Objects: " + Labexercise10.count);
	}
}