import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
	
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employees to the TreeMap
        employeeMap.put(101, "Karthick");
        employeeMap.put(102, "Nihara");
        employeeMap.put(103, "Sathvik");
        employeeMap.put(104, "Selvi");
        employeeMap.put(105, "Kakoo");

        // Print names of all employees in alphabetical order
        System.out.println("Names of Employees in Alphabetical Order:");

        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}