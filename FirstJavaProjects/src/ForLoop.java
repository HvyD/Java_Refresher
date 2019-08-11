public class ForLoop {
    public static void main(String[] args) {

        /*

        for(initialization ; condition ; increment){

            //statements

        }

        */

        for (int i = 1, j = 1; i <= 15 && j < 10 ; i++, j++){
            System.out.println(i + " : I Love java : " + j);
        }


        for (;;){
            System.out.println("Yes");
            System.out.println("No");
        }

    }
}
