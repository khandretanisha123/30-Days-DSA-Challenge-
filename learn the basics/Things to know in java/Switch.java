
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        switch (grade) {
            case "D" :
                System.out.println("pass");
                break;
            case  "C":
                System.out.println("good");
                break;
            case "B" :
                System.out.println("nice");
                break;
            case "A" :
                System.out.println("Excellent");
            default:
                System.out.println("fail");
        }
    }
    
}
