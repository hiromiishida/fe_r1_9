public class Main {
    public static void main(String[] args) {
        char[][] A = new char[8][8];
        char[][] B = new char[8][8];

        A[0][0] = ' ';
        A[0][1] = '*';
        A[0][2] = '*';
        A[0][3] = '*';
        A[0][4] = '*';
        A[0][5] = '*';
        A[0][6] = '*';
        A[0][7] = ' ';

        A[1][0] = ' ';
        A[1][1] = '*';
        A[1][2] = ' ';
        A[1][3] = ' ';
        A[1][4] = ' ';
        A[1][5] = ' ';
        A[1][6] = ' ';
        A[1][7] = ' ';

        A[2][0] = ' ';
        A[2][1] = '*';
        A[2][2] = ' ';
        A[2][3] = ' ';
        A[2][4] = ' ';
        A[2][5] = ' ';
        A[2][6] = ' ';
        A[2][7] = ' ';

        A[3][0] = ' ';
        A[3][1] = '*';
        A[3][2] = '*';
        A[3][3] = '*';
        A[3][4] = '*';
        A[3][5] = ' ';
        A[3][6] = ' ';
        A[3][7] = ' ';

        A[4][0] = ' ';
        A[4][1] = '*';
        A[4][2] = ' ';
        A[4][3] = ' ';
        A[4][4] = ' ';
        A[4][5] = ' ';
        A[4][6] = ' ';
        A[4][7] = ' ';

        A[5][0] = ' ';
        A[5][1] = '*';
        A[5][2] = ' ';
        A[5][3] = ' ';
        A[5][4] = ' ';
        A[5][5] = ' ';
        A[5][6] = ' ';
        A[5][7] = ' ';

        A[6][0] = ' ';
        A[6][1] = '*';
        A[6][2] = ' ';
        A[6][3] = ' ';
        A[6][4] = ' ';
        A[6][5] = ' ';
        A[6][6] = ' ';
        A[6][7] = ' ';

        A[7][0] = ' ';
        A[7][1] = '*';
        A[7][2] = ' ';
        A[7][3] = ' ';
        A[7][4] = ' ';
        A[7][5] = ' ';
        A[7][6] = ' ';
        A[7][7] = ' ';

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                B[j][7 - i] = A[i][j];
            }
        }

        // 確認のために表示
        for (int y = 0; y <= 7; y++) {
            for (int x = 0; x <= 7; x++) {
                System.out.print(B[y][x]);
            }
            System.out.println();
        }
    }
}