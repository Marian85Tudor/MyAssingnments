package MyCodes;

import org.w3c.dom.ls.LSOutput;

public class IfElseIf {
    public static void main(String[] args) {

        int diameter = 45;

        if (diameter >= 60 && diameter <= 24) {
            System.out.println("First compare is good");
        } else if (diameter == 45 && diameter == 45) {
            System.out.println("Two compare is good");
        } else if (diameter >= 90 && diameter >= 80) {
            System.out.println("three compare is good");
        } else {
            System.out.println("I dont know");
        }
    }

}
