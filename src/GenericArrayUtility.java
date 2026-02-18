import java.util.Arrays;
public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        // Handle null cases
        if (a == null && b == null) {
            // Both arrays are null
            return null;
        }
       // First array is null
        if (a == null) {

            return b;
        }
        //// Second array is null
        if (b == null) {

            return a;
        }

        // Both arrays are non-null
        int newLength = a.length + b.length;

        // Create a new array using the runtime type of array 'a'
        T[] mergedArray = Arrays.copyOf(a, newLength);

        // Copy elements from array 'b' into the merged array
        // Starting at position a.length
        System.arraycopy(b, 0, mergedArray, a.length, b.length);

        return mergedArray;
    }
}