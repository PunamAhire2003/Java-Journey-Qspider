class Armstrong1 {
    public static void main(String[] args) {
        int num = 156;   // Keep original number to compare later
        int originalNumber=num;;   // Copy to a working variable
        int sum = 0;                // Initialize sum
        int rem;                    // To store remainder (digit)

        while (num > 0) {
            rem = num % 10;                     // Extract last digit
            int cube = rem * rem * rem;         // Cube of digit
            sum = sum + cube;                   // Add cube to sum
            num = num / 10;                     // Remove last digit
        }

        if (sum ==originalNumber) {
            System.out.println( " is an Armstrong number.");
        } else {
            System.out.println( " is NOT an Armstrong number.");
        }
    }
}
