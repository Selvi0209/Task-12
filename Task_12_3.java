import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
	
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employees to the TreeMap
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Jane Smith");
        employeeMap.put(103, "Alice Johnson");
        employeeMap.put(104, "Bob Williams");
        employeeMap.put(105, "Eve Brown");

        // Print names of all employees in alphabetical order
        System.out.println("Names of Employees in Alphabetical Order:");

        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}