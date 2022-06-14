package Advanced.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class RealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = getMatrix(scanner, 8, 8);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if("q".equals(matrix[i][j])){
                    boolean realQueen = true;
                    for (int a=0; a<8;a++){
                        if(("q".equals(matrix[a][j]) && a!=i) || ("q".equals(matrix[i][a]) && a!=j)){
                            realQueen = false;
                            break;
                        }
                    }
                    int RDiagonal=0;
                    int CDiagonal=0;
                    int cycle = 8;
                    if(i<j){
                        CDiagonal = j - i;
                        cycle = 8-CDiagonal;
                    }
                    if(i>j){
                        RDiagonal = i-j;
                        cycle = 8-RDiagonal;
                    }
                    for (int a=0; a<cycle;a++){
                        if("q".equals(matrix[RDiagonal][CDiagonal]) && RDiagonal!=i){
                            realQueen = false;
                            break;
                        }
                        RDiagonal++;
                        CDiagonal++;
                    }
                    if(i+j<8){
                        RDiagonal = 0;
                        CDiagonal = i+j;
                        cycle = i+j+1;
                    }
                    else {
                        RDiagonal = i+j-7;
                        CDiagonal = 7;
                        cycle = 8- RDiagonal;
                    }
                    for (int a=0; a<cycle;a++){
                        if("q".equals(matrix[RDiagonal][CDiagonal]) && RDiagonal!=i){
                            realQueen = false;
                            break;
                        }
                        RDiagonal++;
                        CDiagonal--;
                    }
                    if (realQueen) System.out.println(i + " " + j);
                }
            }
        }
    }

    private static String[][] getMatrix(Scanner scanner, int row, int col) {
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
}

