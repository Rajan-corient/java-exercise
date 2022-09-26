class Main {

    public static boolean checkPalindrome(int num) { 
        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 3553;
        // check if reversedNum and originalNum are equal
        if (checkPalindrome(num)) {
            System.out.println(num + " is Palindrome.");
        }
        else {
            System.out.println(num + " is not Palindrome.");
        }
    }
}