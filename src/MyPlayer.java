import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;


    public ArrayList<int[]> lifeBoards = new ArrayList<int[]>();
    public ArrayList<int[]> deathBoards = new ArrayList<int[]>();
    public ArrayList<int[]> resultingBoards = new ArrayList<int[]>();
    public ArrayList<int[]> tempBoards = new ArrayList<int[]>();
    public ArrayList<int[]> finalTempBoards = new ArrayList<int[]>();



    public MyPlayer() {
        columns = new int[10];
        deathBoards.add(new int[]{1, 0, 0});
        for (int x = 1; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (x >= y && y >= z) {
                        boolean isDeathBoard = false;
                        System.out.println(x + " " + " " + y + " " + z);
                        System.out.println("resulting boards:");
                        int a = x;
                        int b = y;
                        int c = z;
                        while (c >= 1) {
                            c = c - 1;

                            System.out.println(x + " " + " " + y + " " + (c));
                            tempBoards.add(new int[]{a, b, c});


                        }
                        c = z;
                        while (b >= 1 && c >= 1) {
                            if (b == c) {
                                b = b - 1;
                                c = c - 1;
                                System.out.println(x + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }
                            if (b > c) {
                                b = b - 1;

                                System.out.println(x + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }

                        }

                        b = y;
                        c = z;
                        while(a>=2 && b==0 &&c==0){
                            a=a-1;

                            System.out.println(a + " " + " " + b + " " + (c));
                            tempBoards.add(new int[]{a, b, c});

                        }
//

                        while (a >= 2 && b >= 1 && c >= 1) {

                            if (a > b) {

                                a = a - 1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }


                            if (a == b && a == c) {

                                a = a - 1;
                                b = b - 1;
                                c = c - 1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }
                            if (a == b && b > c) {
                                a = a - 1;
                                b = b - 1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }


                        }
                        while (a >= 2 && b >= 1 && c == 0) {
                           // System.out.println("or");

                            boolean doOnce = false;
                            if (a > b && b == 1 && !doOnce) {
                                System.out.println(doOnce);
                                doOnce = true;
                                System.out.println(a + " " + " " + (b - 1) + " " + (c));
                                tempBoards.add(new int[]{a, (b - 1), c});


                              //  a = a - 1;

                                System.out.println((a-1) + " " + " " + b + " " + (c));

                                tempBoards.add(new int[]{(a-1), b, c});
                                a=a-1;


                            }
                            if ((a > b && b == 1 && doOnce) == true) {

                                a = a - 1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }

                            if (a == b) {

                                b = b - 1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});


                            }
                            if(a>b){
                                a=a-1;
                                System.out.println(a + " " + " " + b + " " + (c));
                                tempBoards.add(new int[]{a, b, c});



                            }


                        }
                        while (a == 1 && b == 1 && c == 0) {
                            b = b - 1;
                            System.out.println(a + " " + " " + b + " " + (c));
                            tempBoards.add(new int[]{a, b, c});


                        }
                        while (a == 2 && b == 0 && c == 0) {
                            a = a - 1;
                            System.out.println(a + " " + " " + b + " " + (c));
                            tempBoards.add(new int[]{a, b, c});


                        }




                    }
//                    for(int q=0; q<tempBoards.size();q++){
//                        int[] g=tempBoards.get(q);
//                        System.out.println(Arrays.toString(g));
//                    }
//                    System.out.println("ytytytytyty");
//                    for(int q=0; q<deathBoards.size();q++){
//                        int[] r=deathBoards.get(q);
//                        System.out.println(Arrays.toString(r));
//                    }
//
//
//                    boolean b = tempBoards.retainAll(deathBoards);
//                    tempBoards.retainAll(deathBoards);
//                    System.out.println(b);
//                    System.out.println("aggaggagagga");
//                    for(int q=0; q<tempBoards.size();q++){
//                      int[] g=tempBoards.get(q);
//                       System.out.println(Arrays.toString(g));
//                   }
//                    System.out.println("----------");
//                    for(int q=0; q<deathBoards.size();q++){
//                        int[] r=deathBoards.get(q);
//                        System.out.println(Arrays.toString(r));
//                    }
                    for (int u =0; u< tempBoards.size(); u++){
                        for (int g =0; g<deathBoards.size(); g++){

                            if(tempBoards.get(u)[0]==deathBoards.get(g)[0]&&tempBoards.get(u)[1]==deathBoards.get(g)[1]&&tempBoards.get(u)[2]==deathBoards.get(g)[2]){
                                System.out.println("the board is a life board");
                                lifeBoards.add(new int[]{x,y,z});
                            }
                            else {
                                deathBoards.add(new int[]{x,y,z});
                               //THE PROBLEM ARISES HERE
                            }

                        }

                    }
//
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
