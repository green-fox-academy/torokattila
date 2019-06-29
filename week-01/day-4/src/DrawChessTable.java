public class DrawChessTable {

    public static void main(String[] args) {
        int width = 8;
        int height = 8;

        for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                        if ((i % 2 == 0) && (j % 2 == 0))
                            System.out.print("%");
                        else if ((i % 2 == 1) && (j % 2 == 1))
                            System.out.print("%");
                        else
                            System.out.print(" ");
                }
                System.out.println("");
            }

        }
}
