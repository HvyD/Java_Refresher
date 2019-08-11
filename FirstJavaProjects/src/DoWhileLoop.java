public class DoWhileLoop {
    public static void main(String[] args) {

        /*

        do {

            // Statements

        } while ( condition )
        */

        int counter = 1;

        do {
            System.out.println(counter + " I love Java");
            counter++;
        } while (counter < 0);

        System.out.println("Outside the loop");

    }
}