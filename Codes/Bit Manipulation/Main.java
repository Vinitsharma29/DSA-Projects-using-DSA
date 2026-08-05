// Bit manipulation
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to get its bit:");
        int no = sc.nextInt();

        int pos = 2;
        int bitmask = 1 << pos;

        // Get Bit
        System.out.println("Get Bit");
        if ((bitmask & no) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }

        // Set Bit
        System.out.println("Set Bit");
        int newno = bitmask | no;
        System.out.println("Number is: " + newno);

        // Clear Bit
        System.out.println("Clear Bit");
        int clearbit = no & (~bitmask);
        System.out.println("Number is: " + clearbit);

        // Update Bit
        System.out.println("Update Bit");
        System.out.println("Enter update value (0 or 1):");
        int operation = sc.nextInt();

        if (operation == 0) {
            // Clear the bit
            int updatedNo = no & (~bitmask);
            System.out.println("Updated Number: " + updatedNo);
        } else if (operation == 1) {
            // Set the bit
            int updatedNo = no | bitmask;
            System.out.println("Updated Number: " + updatedNo);
        } else {
            System.out.println("Invalid input! Enter only 0 or 1.");
        }

        sc.close();
    }
}
