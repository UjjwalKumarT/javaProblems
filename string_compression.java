import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      int t;
                Scanner sc=new Scanner(System.in);
                t = sc.nextInt();
                while(t>0){
                String s = sc.next();
                int n=s.length();
                int count=1;
                for(int i=0; i < n-1; i++){
                    if(s.charAt(i) != s.charAt(i+1)){
                         System.out.printf("%c%d", s.charAt(i), count);
                         count=1;
                        }
                    else{
                        count++;
                    }
                }
                System.out.printf("%c%d", s.charAt(n-1), count);
                
					  

                }}}

