public class ArraySearch {
    public static void main(String[] args) {
        int[] number = {1, 2, 4, 5, 2, 67, 8, 2};
        int target = 2;
        boolean found = false; // ✅ Initialize to false

        for(int i = 0; i < number.length; i++) {
            if(number[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
            }
        }

        // ✅ Check after the loop completes
        if(!found) {
            System.out.println("Element not found");
        }

        //This is the way to find how you can search through an Array
    }
}