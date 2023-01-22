import java.util.Scanner;
import java.io.File;
class FileInfo
{
public static String getFileExtension(File f1)
{
String fileName = f1.getName();
if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
return fileName.substring(fileName.lastIndexOf(".")+1);
else return "Folder";
}
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("\nEnter the filename: ");
String s=input.nextLine();
File f1=new File(s);
if(f1.exists())
{
System.out.println("\nDETAILS ABOUT THE FILE");
System.out.println(" --------------------- ");
System.out.println(" File exists in : "+f1.getAbsolutePath());
System.out.println("\n Is file?
:"+f1.isFile());System.out.println(" Is Directory?
:"+f1.isDirectory());
System.out.println("\n Is Readable?
:"+f1.canRead());
System.out.println(" Is Writable?
:"+f1.canWrite());
System.out.println("\n Type
:"+getFileExtension(f1));
System.out.println("\n Length of the File :"+f1.length()+" Bytes");
else
{
}
}
System.out.println("File does not exist");
}
}
