public class pattern04 {
    public static void main(String[] args) {
        pattern04(4);
    }

    static void pattern04(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
