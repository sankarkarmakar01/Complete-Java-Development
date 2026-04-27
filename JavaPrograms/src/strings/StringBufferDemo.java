package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        // 1. Initialization
        // We start with an initial capacity (default is 16 characters + "User: ")
        StringBuffer stringBuffer = new StringBuffer("User: ");

        // 2. append() - Adding data to the end
        stringBuffer.append("Alex");
        stringBuffer.append(" | ID: ");
        stringBuffer.append(1024);
        // Current state: "User: Alex | ID: 1024"

        // 3. insert() - Adding data at a specific index
        // Let's add the status right after "User: "
        stringBuffer.insert(6, "[Admin] ");
        // Current state: "User: [Admin] Alex | ID: 1024"

        // 4. replace() - Changing a specific portion
        // Let's change "Admin" to "SuperUser"
        // replace(start, end, string) -> end index is exclusive
        stringBuffer.replace(7, 12, "SuperUser");
        // Current state: "User: [SuperUser] Alex | ID: 1024"

        // 5. delete() - Removing characters
        // Let's remove the ID part
        stringBuffer.delete(21, 31);
        // Current state: "User: [SuperUser] Alex"

        // 6. reverse() - A unique tool in the Buffer/Builder classes
        stringBuffer.reverse();
        // Current state: "xelA ]resUrepuS[ :resU"

        // Reverse it back to normal
        stringBuffer.reverse();

        // 7. capacity() vs length()
        // length() is the number of characters; capacity() is the total allocated memory
        System.out.println("Final String: " + stringBuffer.toString());
        System.out.println("Characters: " + stringBuffer.length());
        System.out.println("Memory Capacity: " + stringBuffer.capacity());
    }
}