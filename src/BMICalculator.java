/**
 * Create a Body Mass Index application that calculate your BMI
 *
 */

import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Body Maa Index Calculator\n");
        System.out.println("Enter your Weight in Kilograms: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your Height in Meters: ");
        float height = scanner.nextFloat();

        float BMI = weight / (height *height);
        System.out.println("Your Body Mass Index is " + BMI);

        if (BMI <= 18.5){
            System.out.println("You are Underweight");
        }
        else if(BMI >= 19 && BMI <= 24.9){
            System.out.println("Congratulations!, Your Weight is Normal");
        }
        else if(BMI > 25 && BMI < 29.9){
            System.out.println("You are Overweight");
        }
        else if(BMI > 30){
            System.out.println("You are Obese");
        }

    }
}