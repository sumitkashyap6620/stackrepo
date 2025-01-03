package stackrepo;
import java.util.Stack;
import java.util.Scanner;
public class balancedbracket {
    // function for balanced bracket verification :-
    static void CheckBracket(String B ){
    Stack<Character> s = new Stack<>();
    int l = B.length();
     
    for(int i = 0 ; i < l ; i++ ){
        if(s.isEmpty() == true && B.charAt(i) == ')'){
            s.push(')');
            
      }
        else {
        if (B.charAt(i)==')' && s.peek() == '(' )s.pop();
        else 
            s.push(B.charAt(i));
       }
    }  
    if (s.size() == 0)System.out.println("Brackets are Balanced :-");
     else System.out.println("Brackets are not Balanced :-");
     System.out.println("brackets to remove become a balance bracket : "+s.size());
    }
    public static void main(String[] args) {
    System.out.print("give any series of'(' ')' brackets to check balanced bracket :-\n");
        Scanner sc = new Scanner (System.in);
        String B =sc.next();
        CheckBracket(B);
        sc.close();
    }
}
