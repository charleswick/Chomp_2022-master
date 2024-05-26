import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;


    public ArrayList<Array> lifeBoards = new ArrayList<Array>();
    public ArrayList<Array> deathBoards = new ArrayList<Array>();



    public MyPlayer() {
        columns = new int[10];
        for (int x =1; x<4; x++){
            for (int y =0; y<4; y++) {
                for (int z = 0; z < 4;z++){
                    if (x>=y && y>=z){
                        System.out.println(x+" " +" "+ y + " "+ z);
                        System.out.println("resulting boards:");
                        int a = x;
                        int b = y;
                        int c = z;
                        while (c>=1){
                            c=c-1;

                            System.out.println (x+" " +" "+ y + " "+ (c));


                        }
                        c=z;
                        while (b>=1&& c>=1){
                            if(b==c){
                                b=b-1;
                                c=c-1;
                                System.out.println (x+" " +" "+ b + " "+ (c));

                            }
                            if(b>c){
                                b=b-1;

                                System.out.println (x+" " +" "+ b + " "+ (c));


                            }

                        }

                        b=y;
                        c=z;
//                        System.out.println("a: "+ a );
//                        System.out.println("b: "+ b );
//
//                        System.out.println("c: "+ c );

                        while (a>=2&&b>=1&&c>=1){

                            if(a>b){

                                a=a-1;
                                System.out.println (a+" " +" "+ b + " "+ (c));

                            }


                            if(a==b && a==c){

                                a=a-1;
                                b=b-1;
                                c=c-1;
                                System.out.println (a+" " +" "+ b + " "+ (c));

                            }
                            if(a==b && b>c){
                                a=a-1;
                                b=b-1;
                                System.out.println (a+" " +" "+ b + " "+ (c));

                            }


                        }
                        while (a>=2&&b>=1&&c==0) {


                            boolean doOnce = false;
                            if ((a > b && b == 1 && doOnce) == false) {
                                doOnce = true;
                                System.out.println(a + " " + " " + (b - 1) + " " + (c));
                                a = a - 1;
                                System.out.println(a + " " + " " + b + " " + (c));


                            }
                            if ((a > b && b == 1 && doOnce) == true) {

                                a = a - 1;
                                System.out.println(a + " " + " " + b + " " + (c));


                            }

                            if (a == b) {
                                b = b - 1;
                                System.out.println(a + " " + " " + b + " " + (c));


                            }

//                            while (a==3 &&b==1&&c==0){
//                                if(a>b){
//
//                                    a=a-1;
//                                    System.out.println (a+" " +" "+ b + " "+ (c));
//
//
//
//                                }
//
//
//                                if(a==b && a==c){
//
//                                    a=a-1;
//                                    b=b-1;
//                                    c=c-1;
//                                    System.out.println (a+" " +" "+ b + " "+ (c));
//
//                                }
//                                if(a==b && b>c){
//                                    a=a-1;
//                                    b=b-1;
//                                    System.out.println (a+" " +" "+ b + " "+ (c));
//
//                                }
//                                if(a>b && b>c){
//                                    a=a-1;
//                                    b=b-1;
//                                    System.out.println (a+" " +" "+ b + " "+ (c));
//
//
//                                }
//
//                            }


                        }






                    }

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
