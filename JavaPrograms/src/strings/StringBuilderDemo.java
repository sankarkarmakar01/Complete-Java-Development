package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Initialize with a starting string
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder);

        // Append
        stringBuilder.append(" is");
        stringBuilder.append(" awesome");
        System.out.println(stringBuilder);

        // Insert
        stringBuilder.insert(0,"Learning ");
        System.out.println(stringBuilder);

        // Replace
        stringBuilder.replace(23,30,"powerful");
        System.out.println(stringBuilder);

        // reverse
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // Convert back to String to use elsewhere
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
