import java.util.*;

class PascalTriangle{
    public static void main(String args[]){
        System.out.println("Pascals Triangle");

        int N = 5;
        int[][] result = solve(N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve (int N){

        int[][] res = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                if(j == 0 || i == j){
                    res[i][j] = 1;
                }else{
                    res[i][j] = res[i-1][j] + res[i-1][j-1];
                }
            }
        }
        return res;
    }
}