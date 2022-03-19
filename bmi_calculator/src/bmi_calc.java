import java.util.Scanner;

// (mass / height^2) * 703
public class bmi_calc {
    public static void main(String[] args){
        // [OBJs]
        Scanner input = new Scanner(System.in);

        //[Print/UI]
        System.out.println("Enter Weight [KG] ");
        double weight = input.nextDouble();
        System.out.println("Enter Height [CM] ");
        double height = input.nextDouble();
        System.out.println("[LBS] " + weight + "height" + height);

        double bmi = (weight / Math.pow(height, 2)) * 703;
        System.out.println("[BMI] " + bmi);

    }
}
