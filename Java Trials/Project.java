import java.util.*;

public class Project {
    public static void main(String[] args) {
        double property_value = 0;
        double assessment_value = 0;
        double property_tax = 0;
        Scanner takeinput = new Scanner(System.in);
        System.out.println("Enter the property's actual value:");
        property_value = takeinput.nextDouble();
        System.out.println("Enter the property's actual value entered is: Rs " + property_value);
        assessment_value = property_value * 0.6;
        System.out.println("The Assessment Value is: RS " + assessment_value);
        property_tax = assessment_value * 0.0064;
        System.out.println("The Property Tax is: Rs " + property_tax);

    }
}