public class multiDimensionalArray {
    public static void main(String[] args) {
        //2D array == is an array in which every value is array.
        //            It is useful for storing matrix data

        //We can put all of them in one array

//        String [][] groceries = {{"apple", "Banana", "orange"}
//                               ,{"potato", "onion", "carrots"},
//                                {"Chicken", "Beef", "fish"}};

//        groceries[0][0] = "Pineapple";  // first index apply to the row, the second index apply to the column
//        groceries[1][0] = "Celery";

        //To change anything in it
//        for(String[] food : groceries) {
//            for(String foodName : food) {
//                System.out.print(foodName+ " ");
//            }
//            System.out.println();
//        }

        //Mini project
        char[][] telephone = {{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};

        for(char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
