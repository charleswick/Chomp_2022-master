import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public int bestX,bestY,bestZ,a,b,c,row,column,x,y,z,currentX,currentY,currentZ;


    public ArrayList<int[]> lifeBoards = new ArrayList<int[]>();
    public ArrayList<int[]> deathBoards = new ArrayList<int[]>();
    public ArrayList<int[]> resultingBoards = new ArrayList<int[]>();
    public ArrayList<int[]> finalTempBoards = new ArrayList<int[]>();
    int[] bestXArray;
    int[] bestYArray;
    int[] bestZArray;




    public MyPlayer() {
        columns = new int[10];
        deathBoards.add(new int[]{1, 0, 0,0 , 0});
        for (int x = 1; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (x >= y && y >= z) {
                        boolean isDeathBoard = false;
                        System.out.println(x + " " + " " + y + " " + z);
                        ArrayList<int[]> tempBoards = new ArrayList<int[]>();

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
                        while (b >= 1 ) {
                            if (b == c) {
                                b = b - 1;
                                c = c - 1;



                            }
                            if (b > c) {
                                b = b - 1;

                            }
                            System.out.println(x + " " + " " + b + " " + (c));
                            tempBoards.add(new int[]{a, b, c});

                        }

                        b = y;
                        c = z;
                        while (a >= 2 ) {



                            if(a==b){
                                b=b-1;
                            }
                            if (a==c){

                                c=c-1;
                            }
                            a = a - 1;

                            System.out.println(a + " " + " " + b + " " + (c));
                            tempBoards.add(new int[]{a, b, c});

                        }
//

//


                        for (int q = 0; q < tempBoards.size(); q++) {
                            int[] g = tempBoards.get(q);
                            System.out.println(Arrays.toString(g));
                        }
//
                        boolean isLifeBoard = false;
                        for (int u = 0; u < tempBoards.size(); u++) {

                            for (int g = 0; g < deathBoards.size(); g++) {
                              //  System.out.println(Arrays.toString(deathBoards.get(g)));

                                if (tempBoards.get(u)[0] == deathBoards.get(g)[0] && tempBoards.get(u)[1] == deathBoards.get(g)[1] && tempBoards.get(u)[2] == deathBoards.get(g)[2]) {
                                    System.out.println("the board is a life board");
                                    isLifeBoard=true;
//                                    int counter =0;
//                                    bestXArray[counter]=tempBoards.get(u)[0];
//                                    bestYArray[counter]=tempBoards.get(u)[1];
//                                    bestZArray[counter]=tempBoards.get(u)[2];
//                                    counter++;
                                    bestX=tempBoards.get(u)[0];
                                    bestY=tempBoards.get(u)[1];
                                    bestZ=tempBoards.get(u)[2];


                                    if(bestZ!=z){
                                        column=2;
                                        row=bestZ;
                                    }
                                    if(bestY!=y){
                                        column=1;
                                        row=bestY;
                                    }
                                    if(bestX!=x){
                                        column=0;
                                        row=bestX;
                                    }
                                    System.out.println(column+""+row);







                                    System.out.println("Best move:"+tempBoards.get(u)[0]+""+tempBoards.get(u)[1]+""+tempBoards.get(u)[2]);




                                }
//

                            }

                        }

                        if(isLifeBoard==false){
                            deathBoards.add(new int[]{x, y, z,row,column});

                        }
                        else {
                            lifeBoards.add(new int[]{x, y, z,row,column});
                            System.out.println("Best move: ");

                        }
                    }
//
                    System.out.println("");


                }


            }


        }
        System.out.println("life boards ");
        for (int q = 0; q < lifeBoards.size(); q++) {
            int[] g = lifeBoards.get(q);
            System.out.println(Arrays.toString(g));
        }
                    System.out.println("Death boards:");
                    for(int q=0; q<deathBoards.size();q++){
                        int[] r=deathBoards.get(q);
                        System.out.println(Arrays.toString(r));
                    }


    }
    public void checkBoard(){}







    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        currentX=0;
        currentY=0;
        currentZ=0;

        for (int r = 0; r < gameBoard[0].length; r++) {
            for (int c = 0; c < gameBoard[0].length; c++) {


            }
            if(gameBoard[r][0].isAlive){
                currentX++;
            }
            if(gameBoard[r][1].isAlive){
                currentY++;
            }
            if(gameBoard[r][2].isAlive){
                currentZ++;
            }
        }
        System.out.println("Current X:"+currentX+"Current Y:"+currentY+"Current Z:"+currentZ);

        for (int q = 0; q < lifeBoards.size(); q++) {
           if (currentX==lifeBoards.get(q)[0]&&currentY==lifeBoards.get(q)[1]&&currentZ==lifeBoards.get(q)[2]){
               row=lifeBoards.get(q)[3];
               column=lifeBoards.get(q)[4];
           }
        }
        for(int g = 0; g< deathBoards.size(); g++){
            if (currentX==deathBoards.get(g)[0]&&currentY==deathBoards.get(g)[1]&&currentZ==deathBoards.get(g)[2]){
                row=deathBoards.get(g)[3];
                column=deathBoards.get(g)[4];
            }

        }

       // if x == 3, move column to 1
        // if y == 3, move column to 2
        // if y == 2, row is 2
        // if y == 1, row is 1
        // if y ==0, row is 0
        //TODO make best x and best y variables

        //IF BEST X ISNT EQUAL TO CURRENT X --> CLICK IN THAT COLUMN
        //IF BEST X ISNT EQUAL TO CURRENT X, CLICK IN BEST X ROW
        System.out.println(bestY);
        System.out.println(y);
//        if(bestX!=a){
//            column=0;
//            row=bestX;
//        }
//        if(bestY!=b){
//            column=1;
//            row=bestY;
//        }
//        if(bestZ!=c){
//            column=2;
//            row=bestZ;
//        }
        System.out.println(bestX+""+bestY+""+bestZ);
        System.out.println(row);
        System.out.println(column);
//        row = 1;
//        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
