import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        String[] leap = {"0","1","2","3","4","5","6","7","8","9"};
        int[] years = {2002, 2003, 2004, 2005, 2006,2007,2008,2009,2010,2011};
        String[] names = {"ayse","ugur","kaan","muhammed","emre","batu","nur","yagmur","oguz","irmak"};

        for(int counter=0; counter<10;counter++){
                if ((years[counter] % 4 == 0 && years[counter] % 100 != 0) || years[counter] % 400 == 0){
                    leap[counter]= "yes";
                }
                else
                    leap[counter]= "no";
        }
        for(int counter=0; counter<10;counter++){
            System.out.println(names[counter]);
            System.out.println(years[counter]);
            System.out.println(leap[counter]);}

        double[][] matrix1 = new double[22][33];
        double[][] matrix2 = new double[33][1];
        for(int row=0; row<22; row++){
            for(int column=0; column<33; column++){
                int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            matrix1[row][column]= randomNum;
            }
        }
        for(int row=0; row<33; row++){
            int randomNum2 = ThreadLocalRandom.current().nextInt(20, 25 + 1);
            matrix2[row][0]= randomNum2;
        }
        System.out.println(matrix1[2][2]);
        System.out.println(matrix2[31][0]);
        System.out.println(funcs.toString(funcs.multiplyByMatrix(matrix1,matrix2)));
        int y=0;
        Scanner myObj = new Scanner(System.in);









    }





    }

