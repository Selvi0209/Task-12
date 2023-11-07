import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Fig");

        // Print the ArrayList before removing elements
        System.out.println("ArrayList before removing elements:");
        for (String item : stringList) {
            System.out.println(item);
        }

        // Remove all elements from the ArrayList
        stringList.clear();

        // Print the ArrayList after removing elements
        System.out.println("\nArrayList after removing elements:");
        for (String item : stringList) {
            System.out.println(item);
        }
    }
}