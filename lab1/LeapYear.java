public class LeapYear {

    /**
     * Determines if the given year is a leap year.
     *
     * @param year the year to be analyzed
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Prints whether the given year is a leap year.
     *
     * @param year the year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /**
     * Main method to run the program. Expects year as command line arguments.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java LeapYear 2000");
        } else {
            for (int i = 0; i < args.length; i++) {
                try {
                    int year = Integer.parseInt(args[i]);
                    checkLeapYear(year);
                } catch (NumberFormatException e) {
                    System.out.printf("%s is not a valid number.\n", args[i]);
                }
            }
        }
    }
}