public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int row=0; row<number; row++) {
                for(int column=0; column<number; column++) {
                    if ((row == 0) || (row == number-1) || (column==0) || (column == number-1) || (column==row) || (column == number - row -1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


        }
    }
}

//        *****   5 stars
//        ** **   2 stars space 2 stars
//        * * *   1 star space 1 star space 1 star
//        ** **   2 stars space 2 stars
//        *****   5 stars