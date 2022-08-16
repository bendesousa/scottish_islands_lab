import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tires");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"

        System.out.println(scottishIslands);

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
        System.out.println(scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        scottishIslands.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(scottishIslands);

//        9. Print out all the islands using a for loop
        for (String islands : scottishIslands){
            System.out.println(islands);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("Even numbers:");
        int[] array_numbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        for (int i = 0; i < array_numbers.length; i++){
            if (array_numbers[i] % 2 == 0){
                System.out.println(array_numbers[i]);
            }
        }

//        2. Print the difference between the largest and smallest value
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (final int val: array_numbers){
            if (val < min)
                min = val;
            if (val >max)
                max = val;
        }
        System.out.println("The difference of the largest and smallest values is " + (max-min));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < array_numbers.length; i++) {
            for (int j = 1; j < array_numbers.length; j++){
                if (array_numbers[i]==array_numbers[j]){
                    break;

                }
            }
        } System.out.println("True");

//        4. Print the sum of the numbers,
        int sum = 0;
        for (int i = 0; i < array_numbers.length; i++){
            sum = sum + array_numbers[i];
        }
        System.out.println("The sum of the values within the array list is " + sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.
        int sum2 = 0;
        for (int i = 0; i <= 7; i++){
            sum2 = sum2 + array_numbers[i];
        }
        System.out.println("The sum of the lucky numbers is " + sum2);

    }

}
