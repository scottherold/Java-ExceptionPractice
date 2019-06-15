import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        // Create a List mixed of strings and integers
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Loops through the ArrayList and try casting them as an 'int'
        for (int i = 0; i < myList.size(); i++) {
            // Try attempts potentially erroneous code
            try {
                Integer castedValue = (Integer) myList.get(i);
                // On exception, print this
            } catch (ClassCastException e) {
                // Error statement
                System.out.println("Error: " + myList.get(i) + " is not a number!");

                // Continues loop
                continue;
            };
        }
    }
}