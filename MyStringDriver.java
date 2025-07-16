// Custom exception class
class MyStringIndexOutOfBoundsException extends RuntimeException {
    public MyStringIndexOutOfBoundsException(String message) {
        super(message);
    }
}

// Final class so it cannot be extended
final class MyString {
    char[] arr;

    // No-arg constructor
    public MyString() {
        arr = new char[0];
    }

    // String constructor
    public MyString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
    }

    // StringBuffer constructor
    public MyString(StringBuffer sb) {
        this(sb.toString());
    }

    // StringBuilder constructor
    public MyString(StringBuilder sb) {
        this(sb.toString());
    }

    // char[] constructor
    public MyString(char[] arr) {
        this.arr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    // char[] partial constructor
    public MyString(char[] arr, int start, int count) {
        if ((start + count) > arr.length)
            throw new MyStringIndexOutOfBoundsException(
                "INVALID[" + start + ", " + start + "+" + count +
                "] out of bounds for length " + arr.length);

        this.arr = new char[count];
        for (int i = start, j = 0; i < (start + count); i++, j++) {
            this.arr[j] = arr[i];
        }
    }

    // toString override
    @Override
    public String toString() {
        String str = "";
        for (char ele : arr)
            str += ele;
        return str;
    }
}

// Main driver class
public class MyStringDriver {
    public static void main(String[] args) {
        // Create character array for a-z
        char[] arr = new char[26];
        for (char ch = 'a'; ch <= 'z'; ch++) {
            arr[ch - 97] = ch;
        }

        // Create custom MyString from part of array (c to g)
        MyString char1 = new MyString(arr, 2, 5);
        System.out.println(char1);  // Output: cdefg
    }
}
