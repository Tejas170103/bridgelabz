import java.util.*;
public class assig3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1:" );
        String s1=sc.next();
        System.out.println("enter s2");
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("equal strings");
        }else{
            System.out.println("not equals");
        }
    }
}
