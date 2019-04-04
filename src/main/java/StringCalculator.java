public class StringCalculator {

    /*
    1. Create a simple String calculator with a method int Add(string numbers)
    2. The method can take 0, 1 or 2 numbers, and will return their sum for example “” or “1” or “1,2”.
       Otherwise throw a RunTimeException.
    3. For an empty string it will return 0
    4. Allow the Add method to handle an unknown amount of numbers/ Multiple numbers
    5. Allow the Add method to handle new lines between numbers (instead of commas).
    6. The method can only take positive integers. If the numbers are not integers, throw UnSupportedOperationException.
    7. Numbers greater than or equal to 1000 should be ignored
    8. The method can take 0, 1 or 2 numbers, and will return their subtraction (for an empty string it will return 0) for example “” or “1” or “1,2”.
       Otherwise throw a RunTimeException.
    9. Delimiters can be of any length
    */

    public static int add(String numbers) {
        String[] stringArray = numbers.split(",|n|//[-]|-|\n");
//        int[] integerArray = new int[2];
        int[] integerArray = new int[stringArray.length];
        int result =0;
        if(numbers == "") {
            return 0;
        }
//        if(stringArray.length > 2)  {
//            throw new RuntimeException();
//        }
        for(int element=0; element < stringArray.length ; element ++) {
            integerArray[element] = Integer.parseInt(stringArray[element]);
            if(integerArray[element] < 0) {
                throw new UnsupportedOperationException();
            }
            if(integerArray[element] >= 1000) {
                integerArray[element] =0;
            }
            result = integerArray[element] + result;
        }

        return result;
    }
}
