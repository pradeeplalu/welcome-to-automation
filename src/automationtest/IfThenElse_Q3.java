package automationtest;

public class IfThenElse_Q3 {

    public static void main(String[] args) {


        int age = 18;


        if (isTeen(age) == true) {
            System.out.println(age + " - true");
        } else {
            System.out.println(age + " - false");
        }

    }


    public static boolean isTeen(int age1) {
        if (age1 <= 18) {
            return true;
        } else {
            return false;
        }

    }
}

