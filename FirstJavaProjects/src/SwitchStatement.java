public class SwitchStatement {
    public static void main(String[] args) {
        int value = 2;
        switch ((value - 1)) {
            case 1: {
                System.out.println("Value : " + value);
            }

            default:
                System.out.println("Default");

        }
    }
}
