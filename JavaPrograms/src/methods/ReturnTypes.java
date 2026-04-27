package methods;

public class ReturnTypes {

    //* No return type
    public static void shout(String message) {
        System.out.println(message.toUpperCase() + "!!!");
        // No return statement needed here.
    }

    //* Primitive Return Types
    public static int getAgeInMonths(int years) {
        return years * 12; // The 'int' contract is fulfilled
    }

    //* Object and Reference Return Types
    public static String formatName(String first, String last) {
        return last + ", " + first; // Returns a String object
    }

    //* Multiple Exit Points (Conditional Returns)
    public static String checkWeather(int temperature) {
        if (temperature > 30) {
            return "Hot";
        } else if (temperature < 10) {
            return "Cold";
        }

        return "Mild"; // If you remove this line, the code won't compile!
    }

    public static void main(String[] args) {
        shout("hello");
        int myAgeMonths = getAgeInMonths(25);
        System.out.println(myAgeMonths);
        System.out.println(formatName("Sankar","Karmakar"));
        System.out.println(checkWeather(40));
    }
}
