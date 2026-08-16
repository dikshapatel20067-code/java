import java.util.*;
public class Conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


    if(age>18){
        System.out.println("you are an adult");
    }
    else{
        System.out.println("you are not an adult");
    }

    if(x%2==0){
      System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
    
    if(a==b){
        System.out.println("the numbers are equale");
    }
    else if(a>b){
        System.out.println("the first number is greater");
    }
    else{
        System.out.println("the second number is greater");
    }

  }
}