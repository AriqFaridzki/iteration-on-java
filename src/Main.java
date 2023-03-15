public class Main {
    public static void main(String[] args) {


//        for (int i = 1; i < 10; i+= 2) {
////            System.out.println("a ");
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//
//        }

        for (int i = 0; i <= 5; i++) {
//            System.out.println(" ");

            for (int k = 0; k <= 5-i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");


        }

    }
}

