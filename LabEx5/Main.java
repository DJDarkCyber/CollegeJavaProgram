import java.util.*;
interface Shape
{
void printArea();
}
class Rectangle implements Shape
{
int area, length,height;
public void printArea()
{
System.out.println("\n Rectangle\n ---------- ");
Scanner input = new Scanner(System.in);
System.out.printf("Enter Length of Rectangle : ");
this.length = input.nextInt();
System.out.printf("Enter Breadth of Rectangle : ");
this.height = input.nextInt();
this.area = this.length*this.height;
System.out.println("Area of the Rectangle is : " + this.area);
}
}
class Triangle implements Shape
{
double area = 0.0;
int length,height ;
public void printArea()
{
System.out.println("\n Triangle\n --------- ");
Scanner input = new Scanner(System.in);
System.out.printf("Enter Length of Triangle : ");
this.length = input.nextInt();
System.out.printf("Enter Height of Triangle : ");
this.height = input.nextInt();
this.area = 0.5 * this.length * this.height;
System.out.println("Area of the Triangle is : " + this.area);
}
}
class Circle implements Shape
{
double area = 0.0;
int length;
public void printArea()
{
System.out.println("\n Circle\n -------- ");
Scanner input = new Scanner(System.in);
System.out.printf("Enter Radius of Circle : ");
this.length = input.nextInt();
this.area = Math.PI * this.length * this.length;
System.out.println("Area of the Circle is : "+this.area);}
}
class Main
{
public static void main(String[] args)
{
System.out.println("\n-------------\nFinding Area\n ------------ ");
Shape rt = new Rectangle();
rt.printArea();
Shape tr = new Triangle();
tr.printArea();
Shape cr = new Circle();
cr.printArea();
}
}
