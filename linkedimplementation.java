package stackrepo;
import  java.util.Scanner;

 class node {
    int value ;
    node next ;
 }
 class Stack{
node head = new node ();
int counter = 0 ;
// push function :-
void push (int x ){
node temp = new node ();
temp.value = x ;
temp.next = head ;
head = temp ;
counter++;
System.out.println();
}
// pull function :-
void pull(){
    head = head.next;
    counter--;
}
// size function :-
void size (){
System.out.println("Size of stack is :- "+counter+"\n");
}
// peak value function :-
void peak(){
node t = new node ();
int p = 0 ;
t = head ;
while(t.next!=null){
    if(t.value>p){
p = t.value ;
t = t.next ;
}
else t =t.next ;
}
System.out.println("Maximum value is :- "+p+"\n");
}
//function to print Stack :-  
void displaystack(){
node t = new node();
t = head ;
while (t.next != null){
    System.out.print(t.value +" ");
    t = t.next ;
}
System.out.println("\n");
}
 }
public class linkedimplementation {
    public static void main(String []args){
     Scanner sc = new Scanner(System.in);
        Stack s = new Stack ();
        int x = 0 ;
    do{System.out.println("To push press 1 : \nTo pull press 2 : \nTo print stack press 3 : \nTo get size of your Stack press 4 : \nTo get the peek value press 5 : \n");
    int a = sc.nextInt();
    System.out.println();
    switch (a){
// for push operation :-
        case 1 :
        System.out.print("give value to push :");
        a = sc.nextInt();
       s.push(a);
       break ;
 // fro pull operation :-
      case 2 :
      s.pull();
      break ;
 // for display the Stack :-
      case 3 :
      s.displaystack();
      break ;
 // for display size of Stack :-
      case 4 :
      s.size();
      break ;
 // for display highest value :-
      case 5 :
      s.peak();
      break ;             
    }

}while(x == 0) ;
sc.close();    
    }
}
