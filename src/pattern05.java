public class pattern05 {
    public static void main(String[] args) {
        pattern05(5);
    }
    static void pattern05(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColumnsInRow = row > n ? 2 * n - row :  row;
            for(int col = 0; col < totalColumnsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
