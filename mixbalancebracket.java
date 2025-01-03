package stackrepo;
import java.util.Scanner;
import java.util.Stack;
public class mixbalancebracket {
    static void CheckBalanced(String x){
        Stack<Character> s = new Stack<>();
        int l = x.length();
        for(int i = 0 ; i<l ; i++){
            if((x.charAt(i) == '}' || x.charAt(i) == ')' || x.charAt(i) == ']' ) && s.size() == 0  ){
            s.push('}');
            break  ;      
            }
            else if(x.charAt(i) == '}' || x.charAt(i) == ')' || x.charAt(i) == ']' ){
               if (x.charAt(i) == ')' && s.peek() == '(' || x.charAt(i) == '}' && s.peek() == '{' || x.charAt(i) == ']' && s.peek() == '[' ) s.pop();
               else {s.push('}');
               break;} 
            }
            else s.push(x.charAt(i)); }
        if (s.size() == 0 )System.out.println("blanced bracket :-");
      else System.out.println("not balanced bracket :-");   
   
    }  
    public static void main(String[] args) {
        System.out.println("Give the series of '{'  '}'  '['  ']'  '('  ')' Types of brackets to check brackets are balance or not :- ");
       Scanner sc = new Scanner(System.in);
        String x = sc.next();
        CheckBalanced(x);
        sc.close();
    }
}
