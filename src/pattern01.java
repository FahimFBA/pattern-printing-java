public class pattern01 {
    public static void main(String[] args) {
        pattern01(4);
    }

    static void pattern01(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
