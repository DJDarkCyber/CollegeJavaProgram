import java.io.*;
class MyException extends Exception
{
MyException(String message)
{
super(message);
}
}
class ExceptMain
{
public static void main(String a[])
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.printf("Enter a positive number : ");
int no=Integer.parseInt(br.readLine());
if(no<0)
{
throw new MyException(" Number must be positive ");
}
System.out.println(" Number:" +no);
}
catch(MyException e)
{System.out.println("Caught the Exception");
System.out.println(e.getMessage());
System.out.println("Exception Handled ...... !");
}
catch(Exception e)
{
System.out.println("Enter numbers ... Exception Handled!");
}
}
}
