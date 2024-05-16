import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];
        for (int x =1; x<4; x++){
            for (int y =0; y<4; y++) {
                for (int z = 0; z < 4;z++){
                    if (x>=y && y>=z){
                        System.out.println(x+" " +" "+ y + " "+ z);

                    }



                }

            }

        }


    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
