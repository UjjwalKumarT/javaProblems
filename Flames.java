import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class String_compression {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
        System.out.println(" Enter value of a ");
		String a= sc.next();
        System.out.println("Enter value of b");
		String b= sc.next();
		String c= a+b;
		String d;
		int len = c.length();
		for(int i=0; i<len-1;i++){
			for(int j=i+1; j<len; j++){
		  	if(c.charAt(i) != c.charAt(j) ){
				d = c.charAt(i);
			  }
			  else{
				  continue;
			  }
		}
		}
		int nlength = d.length();
		if(nlength % 6 == 1){
			System.out.println("Friends");
			break;
		}
		else if(nlength % 6 ==2){
			System.out.println("Love");
			break;
		}
		else if(nlength % 6 ==3){
			System.out.println("Affection");

		}
		else if (nlength % 6 == 4){
			System.out.println(" Marriage");
			break;
		}
		else if(nlength % 6 == 5){
			System.out.println("Enemy");
			break;
		}
		else  {
			System.out.println("Siblings");
			break;
		}

	}
}
