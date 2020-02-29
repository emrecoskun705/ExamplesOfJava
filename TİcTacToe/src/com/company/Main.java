package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        String[] table1 = table();
        printTable(table1);
        System.out.println();
        boolean game = true;
        int start = random.nextInt(2);

        System.out.println("Player1 name:");
        String player1 = scanner.nextLine();
        System.out.println("Player2 name:");
        String player2 = scanner.nextLine();
        int a;

        String decision1;
        String decision2;
        if(start==0) {
            System.out.println(player1+ " will start first");
            decision1 = decision();
            decision2 = decision1.equals("X") ? "O" : "X";
            a = 2;
        } else {
            System.out.println(player2 + " will start first");
            decision2 = decision();
            decision1 = decision2.equals("X") ? "O" : "X";
            a = 1;
        }

        int cnt = 0;

        while (game) {
            String turn;
            if(a % 2 == 0) {
                turn = player1;
            } else {
                turn = player2;
            }
            a++;

            System.out.println("Choose your decision: " + turn);
            if(turn.equals(player1)) {
                table1[move(table1)] = decision1;
            } else {
                table1[move(table1)] = decision2;
            }
            printTable(table1);
            System.out.println();
            game = !winOrLose(table1);
            if(!game) {
                System.out.println("Congratulations " + turn);
            } else if(cnt == 8) {
                System.out.println("Tie");
                game = false;
            }
            cnt++;

        }

    }

    private static String[] table() {
        String[] arr = new String[3 * 3];
        for(int i=0; i<3*3; i++) {
                arr[i] = "#";
        }
        return arr;
    }

    private static void printTable(String[] arr) {
        int row =(int) Math.sqrt(arr.length);
        for(int i=0; i<row*row; i++) {
//            System.out.println(row);
            if((i) % row == 0) {
                System.out.println();
            }
            System.out.print(arr[i] + "\t");
        }
    }

    private static int move(String[] table) {
        System.out.println("Choose row");
        while(true) {

            int column = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Choose column");
            int row = scanner.nextInt();
            scanner.nextLine();

            int totalLength = table.length;
            int finalMove = (int) Math.sqrt(totalLength) * (column - 1) + row - 1;
            if(finalMove <= (totalLength - 1) && (!table[finalMove].equals("X") && !table[finalMove].equals("O"))) {
                return finalMove;
            }
            System.out.println("Invalid finalMove");
        }
    }

    private static  String decision() {
        System.out.println("Choose X or O");
        while (true) {
            String choose = scanner.nextLine().toUpperCase();
            if(choose.equals("X") || choose.equals("O")) {
                return choose;
            }
            System.out.println("It's not valid try again");
        }
    }






    private static boolean winOrLose(String[] table) {
        // row
        return(table[0].equals("X") && table[1].equals("X")&& table[2].equals("X") ||
            table[3].equals("X") && table[4].equals("X")&& table[5].equals("X") || 
                table[6].equals("X") && table[7].equals("X")&& table[8].equals("X") ||
                table[0].equals("O") && table[1].equals("O")&& table[2].equals("O") ||
                table[3].equals("O") && table[4].equals("O")&& table[5].equals("O") ||
                table[6].equals("O") && table[7].equals("O")&& table[8].equals("O") ||
                //column
                table[0].equals("X") && table[3].equals("X")&& table[6].equals("X") ||
                table[1].equals("X") && table[4].equals("X")&& table[7].equals("X") ||
                table[2].equals("X") && table[5].equals("X")&& table[8].equals("X") ||
                table[0].equals("O") && table[3].equals("O")&& table[6].equals("O") ||
                table[1].equals("O") && table[4].equals("O")&& table[7].equals("O") ||
                table[2].equals("O") && table[5].equals("O")&& table[8].equals("O") ||
                //diagonal
                table[0].equals("X") && table[4].equals("X")&& table[8].equals("X") ||
                table[6].equals("X") && table[4].equals("X")&& table[2].equals("X") ||
                table[0].equals("O") && table[4].equals("O")&& table[8].equals("O") ||
                table[6].equals("O") && table[4].equals("O")&& table[2].equals("O")
        );
    }





}
