import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no to add");
		int a = sc.nextInt();
		System.out.println("enter second no. to add");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sumation of no. is"+" "+ sum);
	}
}