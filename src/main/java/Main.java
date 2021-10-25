import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("welcome to the calculator game");
        boolean stillPlaying = true;

        while(stillPlaying) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String info = myObj.nextLine();  // Read user input
            String[] infoArray = info.split(" ");

            Calculator calculator = new Calculator();
            String type = infoArray[0];
            int firstNum = Integer.parseInt(infoArray[1]);
            int secondNum = Integer.parseInt(infoArray[2]);

            if(type.equals("add")) {
                System.out.println(calculator.add(firstNum, secondNum));
            } else if (type.equals("subtract")) {
                System.out.println(calculator.subtract(firstNum, secondNum));
            } else if (type.equals("divide")) {
                System.out.println(calculator.divide(firstNum, secondNum));
            } else if (type.equals("multiply")) {
                System.out.println(calculator.multiply(firstNum, secondNum));
            } else if (type.equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(firstNum));
            } else if (type.equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(firstNum));
            } else if (type.equals("DONE")) {
                System.out.println("BYEEE");
                stillPlaying = false;
            }

        }

    }
}
