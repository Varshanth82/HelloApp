public class helloworld {
    public static void main(String[] args) {

        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String joinedNames = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}