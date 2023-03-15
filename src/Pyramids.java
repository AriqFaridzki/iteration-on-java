public class Pyramids {

    public void print_Pyramids(){
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
