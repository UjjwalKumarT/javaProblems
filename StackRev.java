import java.util.*;
public class StackRev {
    public static void main(String[]args){
    Stack<String>stack = new Stack<String>();
    String s = newton;
    Char [] arr= new char[s.length()];
    for(int i=0; i<s.length(); i++){
        stack.push(charAt(i));
    }
    for(int i =0; i< s.length(); i++){
        arr[i]= stack.push(charAt(i));
    }
    while(!stack.empty()){
    System.out.println(stack.peek()+" ");
    stack.pop();
    }
}
}
