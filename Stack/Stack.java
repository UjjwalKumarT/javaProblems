package TOP10_ARRAY_QUESTION.Stack;
import java.util.Stack;
import java.util.*;
import java.io.*;

public class Stack {
    public static void main(String[] args){
        
        Stack<Integer> s=new Stack<Integer>(); 
        s.Push(10);
        //s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.size());
    }
    
}
