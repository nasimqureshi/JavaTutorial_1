
import  java.util.*;
public class Conditions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        if(x % 2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//     ?????????////////Conditional Statemant???????????????????????????????????????????????????????????
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else {
            if(a > b) {
                System.out.println("a is grater than b");
            }else {
                System.out.println("a is lesser than b");
            }
        }
    }

}
