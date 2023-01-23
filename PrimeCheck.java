import java.util.Scanner;interface PrimeCheck {
boolean isPrime(int num);
}
class PrimeNumberCheck implements PrimeCheck {
public boolean isPrime(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}
class Main {
public static void main(String[] args) {
PrimeNumberCheck primeCheck = new PrimeNumberCheck();
Scanner in = new Scanner(System.in);
int num;
System.out.println("enter a number to check : ");
num = in.nextInt();
if (primeCheck.isPrime(num)) {
System.out.println(num + " is a prime number.");
} else {
System.out.println(num + " is not a prime number.");
}
}
}
