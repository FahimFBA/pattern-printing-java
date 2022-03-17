public class pattern06 {
    public static void main(String[] args) {
        pattern06(5);
    }

    static void pattern06(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalNumberofColumnsInRow = row > n ? 2 * n - row : row;
            
            int numberOfSpaces = n - totalNumberofColumnsInRow;
            for(int s = 0; s < numberOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < totalNumberofColumnsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
