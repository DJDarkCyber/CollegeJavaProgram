import java.util.Scanner;
import java.util.*;
import java.io.*;
class Queue{
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;
  Queue(){
    front = -1;
    rear = -1;
  }
  boolean isFull(){
    if (front == 0 && rear == SIZE - 1){
      return true;
    }
    return false;
  }
  boolean isEmpty(){
    if (front == -1)
    return true;
    else
    return false;
  }
  void enQueue(int element){
    if (isFull()){
      System.out.println("Queue is full \n");
    }
    else{
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("\n Inserted " + element);
    }
  }
  int deQueue(){
  int element;
  if (isEmpty()){
    System.out.println("\n Queue is empty \n");
    return (-1);
    }
    else{
      element = items[front];
      if (front >= rear)
      {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
    else
    {
      front++;
    }
    System.out.println("\n Deleted -> " + element);
    return (element);
  }
  }
  void display(){
      /* Function to display elements of Queue */
      int i;
      if (isEmpty()){
        System.out.println("Empty Queue \n");
      }
      else
      {
        System.out.println("\nFront index-> " + front);
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
        System.out.print(items[i] + " ");
        System.out.println("\nRear index-> " + rear);
      }
    }
    public static void main(String[] args){
    int e=1;
    Queue q = new Queue();
    System.out.println("program to perform stack operations \n");
    Scanner sc=new Scanner(System.in);
    while(e!=0)
    {
    System.out.println("1.enqueue 2.dequeue 3.display 4.exit");
    System.out.println("\n enter your choice :");
    int ch=sc.nextInt();
    switch(ch)
    {
    case 1:
    System.out.println("\n enter the element to be pushed");
    int ele=sc.nextInt();
    q.enQueue(ele);break;
    case 2:
    int dequeue;
    dequeue=q.deQueue();
    System.out.println("\n the deleted element is");
    System.out.println(dequeue+"");
    break;
    case 3:
    System.out.println("\n elements in the queue are");
    q.display();
    break;
    case 4:
    e=0;
    }
    }
  }
}
