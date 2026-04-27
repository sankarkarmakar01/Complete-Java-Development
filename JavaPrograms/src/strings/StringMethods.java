package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sankar Karmakar";

        //* Inspection Methods (Getting Info)
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.charAt(5));

        //* Comparison Methods
        System.out.println(name.equals("Sankar Karmakar"));
        System.out.println(name.equalsIgnoreCase("sankar karmakar"));
        System.out.println("D".compareTo("B"));
        System.out.println(name.startsWith("Sankar"));
        System.out.println(name.endsWith("kar"));

        //* Transformation Methods (The "Modifiers")
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("    Sankar   ".trim());
        System.out.println("sankar       ".strip()); // smarter version of trim()
        System.out.println("Sankar".replace("S","A"));
        System.out.println(name.substring(2,6));


        //* Search & Location Methods
        System.out.println(name.indexOf("an"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.contains("Karmakar"));

        //* Splitting and Joining
        String colors = "Red,Blue,Green";
        String[] colorArr = colors.split(",");
        System.out.println(Arrays.toString(colorArr));
        String joined = String.join("-", "01", "02", "2026");
        System.out.println(joined);

        // Value Conversion (Static Methods)
        int score = 100;
        String s = String.valueOf(score); // "100"
        System.out.println(s);

    }
}
