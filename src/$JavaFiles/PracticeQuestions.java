package $JavaFiles;

import java.util.*;

public class PracticeQuestions {
    public static void main(String[] args) {
        int x, y, z, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        x = scan.nextInt();
        System.out.print("Enter your second number: ");
        y = scan.nextInt();
        System.out.print("Enter your third number: ");
        z = scan.nextInt();
        sum = x + y + z;
        System.out.println("The sum of the three numbers is: " + sum);
        scan.close();
    }
}

class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class SumOfTheTwoNumbers {
    public static void main(String[] args) {
        int a = 200, b = 300, sum = a+b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}

class EvenOrOdd {
    public static void main(String[] args) {
        int a = 51, b = 122;
        if (a % 2 == 0) {
            System.out.println("Its even");
        } else {
            System.out.println("Its odd");
        }
        if (b % 2 == 0) {
            System.out.println("Its even");
        } else {
            System.out.println("Its odd");
        }

        // with user input
        int x;  
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        x = scan.nextInt();
        if (x % 2 ==0) {
            System.out.println("Its even");
        } else {
            System.out.println("Its odd");
        }
        scan.close();
    }
}

class CountingNumbers {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class StringConcat {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = "Programming";
        System.out.println(string1 + " " + string2);
    }
}

class CountWords {
  public static void main(String[] args) {
    String words = "One Two Three Four Five Six Seven Eight Nine Ten";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}