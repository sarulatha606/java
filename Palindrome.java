package javaprogram;

public class Palindrome {
	public static void main(String arg[]) {
		String name="deer";
		boolean isPalindrome= checkPalindrome(name);
	
        if (isPalindrome) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
    	str = str.toLowerCase();
    	int start = 0, end = str.length() - 1;
    
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
	}

