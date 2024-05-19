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
                        System.out.println("resulting boards:");
                        for (int t =x; t<4; t++){
                            for (int r =y; r<4; r++) {
                                for (int w = z; w < 4; r++) {
                                    if (x>=y && y>=z){

                                        System.out.println(x+" " +" "+ y + " "+ (z-1));
                                        System.out.println(x+" " +" "+ y + " "+ z);
                                    }
                                }
                            }
                        }

                        }
                        //TODO make for loops to print out the possible boards
//                        if(z>0&& x>=y && y>=z){
//                            if(z>=1){
//                                System.out.println(x+" " +" "+ y + " "+ (z-1));
//
//                            }
//                            if(z>=2){
//                                System.out.println(x+" " +" "+ y + " "+ (z-2));
//
//                            }
//                            if (z>=3){
//                                System.out.println(x+" " +" "+ y + " "+ (z-3));
//
//                            }
//
//
//                        }
//                        if (y>0 && z>0 && x>=y && y>=z){
//                            if(z>=1&&y>=1){
//                                System.out.println(x+" " +" "+ (y-1) + " "+ (z-1));
//
//                            }
//                            if(z>=2&&y>=2){
//                                System.out.println(x+" " +" "+ (y-2) + " "+ (z-2));
//                            }
//                            if (z>=3&&y>=3){
//                                System.out.println(x+" " +" "+ (y-3) + " "+ (z-3));
//
//                            }
//
//
//
//                        }
//                        if (x>1 &&y>0 && z>0 && x>=y && y>=z){
//                            if(z>=1&&y>=1){
//                                System.out.println((x-1)+" " +" "+ (y-1) + " "+ (z-1));
//
//                            }
//                            if(z>=2&&y>=2){
//                                System.out.println((x-2)+" " +" "+ (y-2) + " "+ (z-2));
//                            }
//
//
//
//                        }
                        System.out.println("");




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
