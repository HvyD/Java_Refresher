public class SwitchCase {
    public static void main(String[] args) {

        /*

        switch (variable / expression) {
            case value:
                //statement;
                break;
            case value:
                //statement;
                break;
        }

        Rules :
        * Variable in switch statement can only be int, byte, short, char, String, enum, Integer, Byte, Short, Character
        * Case label cannot have a variable, it has to be a constant
        * Case label has to be of the same data type of the variable or expression result in switch parenthesis


        */

        final int i = 0;
        int month = 1;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Hey Default");
        }
        System.out.println("Out of switch case");

    }
}
