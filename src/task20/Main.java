package task20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Parallelepiped parallelepiped = new Parallelepiped();
        System.out.println("----------Parallelepiped---------");
        try {
            System.out.println("Set height: ");
            parallelepiped.setHeight(scanner.nextInt());
            validate(parallelepiped.getHeight());

            System.out.println("Set length: ");
            parallelepiped.setLength(scanner.nextInt());
            validate(parallelepiped.getLength());

            System.out.println("Set width: ");
            parallelepiped.setWidth(scanner.nextInt());
            validate(parallelepiped.getWidth());

            System.out.println("Total surface area: " + parallelepiped.totalSurfaceArea());
            System.out.println("Volume            : " + parallelepiped.volume());

        } catch (InputMismatchException e) {
            System.out.println("Exception caught: " + e + ": Parallelepiped sides can not be letters!");
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e);
        }


    }
    public static void validate(int input) throws InvalidInputException{
        if (input > 20){
            throw new InvalidInputException("Number cannot be over 20!");
        } else if (input < 0) {
            throw new InvalidInputException("Number should be positive!");
        }
    }

}