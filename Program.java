//import stuff here

//Your code here
// Online Java Compiler
// Use this editor to write, compile and run your Java code 
import java.util.Scanner;
import java.lang.Math.*;

class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter another Number");
        int num2 = scanner.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        double avg = (num1+num2)/2.0;
        int dis = Math.abs(sub);
        int max = Math.abs(add+dis)/2;
        int min = Math.abs(add-dis)/2;
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Average:"+avg);
        System.out.println("Distance:"+dis);
        System.out.println("Max Value:"+max);
        System.out.println("Min Value:"+min);


        
    }
}
//Paste console output below:
/*
Enter a Number
13
Enter another Number
20
Addition:33
Subtraction:-7
Multiplication:260
Average:16.5
Distance:7
Max Value:20
Min Value:13

*/
