public class helloworld {
    public static void main(String[] args) {

        String name;

        // If user provides name → use it
        if (args.length > 0) {
            name = args[0];
        } else {
            // Default value
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}