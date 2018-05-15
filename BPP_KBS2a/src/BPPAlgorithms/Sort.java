package BPPAlgorithms;

/**
 *
 * @author Christiaan
 */
import BPP.Product;
import java.util.*;

class Sort {

    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col) {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                    final int[] entry2) {

                // To sort in descending order revert 
                // the '>' Operator
                if (entry1[col] < entry2[col]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });  // End of function call sort().
    }

    public static ArrayList<Product> sortProductsInOrderBySize(ArrayList<Product> productArray, boolean desc) {
        int OrderSize = productArray.size();

        ArrayList<Product> newArray = new ArrayList<>();

        int[][] product2dArray = new int[OrderSize][2];

        for (int n = 0; n < OrderSize; n++) {
            product2dArray[n][0] = productArray.get(n).getProductId();
            product2dArray[n][1] = productArray.get(n).getSize();
        }

        sortbyColumn(product2dArray, 1);

        for (int i = 0; i < product2dArray.length; i++) {
            for (int j = 0; j < product2dArray[i].length; j++) {
            }
            newArray.add(productArray.get(product2dArray[i][0]-1));
        }
        return newArray;
    }
}
