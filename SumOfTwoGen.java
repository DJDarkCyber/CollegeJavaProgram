class Addition<T> {
T num1;
T num2;
Addition(T num1, T num2) {
this.num1 = num1;
this.num2 = num2;
}
public void add() {
if(num1 instanceof Integer && num2 instanceof Integer) {
System.out.println("The sum of the integers is: " + ((Integer)num1
+ (Integer)num2));
}
else if(num1 instanceof Double && num2 instanceof Double) {
System.out.println("The sum of the doubles is: " + ((Double)num1
+ (Double)num2));
}
else {
System.out.println("Invalid input");
}
}
}
public class Main {
public static void main(String[] args) {
Addition<Integer> iob = new Addition<Integer>(5, 10);
iob.add();
Addition<Double> dob = new Addition<Double>(5.5, 10.5);
dob.add();
}
}
