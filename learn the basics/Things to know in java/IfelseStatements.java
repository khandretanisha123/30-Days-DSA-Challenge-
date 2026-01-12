import java.util.*;
public class IfelseStatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("It is eligible for vote");
        }
        else{
            System.out.println("It is not eligible for vote");
        }
    }
}