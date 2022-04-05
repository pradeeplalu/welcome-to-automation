package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    //main method
    public static void main(String[] args) {


        ArrayList<String> objArray = new ArrayList<String>();
        objArray.add("Scrum");
        objArray.add("Java");
        objArray.add("Jira");
        objArray.add("Selenium");
        objArray.add("Cucumber");
        objArray.add("Postman");
        objArray.add("Rest Assured");
        for (String i : objArray) {
            System.out.println(i);
        }

    }
}





