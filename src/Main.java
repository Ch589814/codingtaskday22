import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Integer arrays
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {4, 5, 6};

        Integer[] mergedIntArray = GenericArrayUtility.mergeArrays(intArray1, intArray2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedIntArray));

        // String arrays
        String[] stringArray1 = {"orange", "lemon", "apple"};
        String[] stringArray2 = {"cherry", "date"};

        String[] mergedStringArray = GenericArrayUtility.mergeArrays(stringArray1, stringArray2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStringArray));


        //  First array is null
        Integer[] nullArray = null;
        Integer[] array = {10, 20, 30};
        Integer[] result1 = GenericArrayUtility.mergeArrays(nullArray, array);
        System.out.println("Merge null and [10, 20, 30]: " + Arrays.toString(result1));

        // Second array is null
        Integer[] array2 = {100, 200};
        Integer[] result2 = GenericArrayUtility.mergeArrays(array2, nullArray);
        System.out.println("Merge [100, 200] and null: " + Arrays.toString(result2));

        //  Both arrays are null
        Integer[] result3 = GenericArrayUtility.mergeArrays(nullArray, nullArray);
        System.out.println("Merge null and null: " + Arrays.toString(result3));

        //  Empty arrays
        Integer[] emptyArray1 = {};
        Integer[] emptyArray2 = {5, 6};
        Integer[] result4 = GenericArrayUtility.mergeArrays(emptyArray1, emptyArray2);
        System.out.println("merged empty and [5,6]:" + Arrays.toString(result4));
    }
}