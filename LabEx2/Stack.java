import java.util.Scanner;
import java.util.*;
import java.io.*;
class Stack{
  final int max=100;
  int s[]=new int[max];
  int top=-1;
  void push(int ele){
    if(top>=max-1)System.out.println("stack overflow");
    else
    s[++top]=ele;
  }
  int pop(){
    int z=0;
    if(top==-1)
    System.out.println("stack underflow");
    else
    z=s[top--];
    return z;
  }
  void display(){
    if(top==-1)
    System.out.println("Stack empty");
    else{
    for(int i=top;i>-1;i--)
      System.out.println(s[i]+"");
    }
  }
  public static void main(String args[]){
    int q=1;
    Stack m = new Stack();
    System.out.println("program to perform stack operations");
    Scanner sc=new Scanner(System.in);
    while(q!=0){
      System.out.println("enter 1.push 2.pop 3.display 4.exit");
      System.out.println("enter your choice");
      int ch=sc.nextInt();
      switch(ch)
      {
      case 1:
        System.out.println("enter the element to be pushed");
        int ele=sc.nextInt();
        m.push(ele);
        break;
      case 2:
        int popele;
        popele=m.pop();
        System.out.println("the poped element is ");
        System.out.println(popele+"");
        break;
      case 3:
        System.out.println("elements in the stack are");m.display();
        break;
      case 4:
        q=0;
      }
    }
  }
}
