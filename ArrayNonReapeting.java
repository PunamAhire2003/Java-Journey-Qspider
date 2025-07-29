import java.util.*;

class ArrayNonReapeting {
    public static void main(String[] args) {
        String str = "HHello";
        char[] arr = str.toCharArray();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character is: " + arr[i]);
                found = true;
                break; // stop after first non-repeating char is found
            }
        }

        if (!found) {
            System.out.println("Character not found");
        }
    }
}
