import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        PalindromeChecker obj = new PalindromeChecker();
        String textToBeChecked = obj.takeInput();
        boolean palindromeResult = obj.CheckPalindrome(textToBeChecked);
        obj.displayResult(palindromeResult);
    }
}

class PalindromeChecker
{
    String text;

    String takeInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        return text = input.next();
    }

    boolean CheckPalindrome(String text)
    {
        boolean isPalindrome = true;
        char[] c = text.toCharArray();
        for(int i=0; i<c.length/2; i++)
        {
            if(c[i] != c[c.length-1-i])
            {
                isPalindrome = false;
                break;
            }
        }
        return  isPalindrome;
    }

    void displayResult(boolean value)
    {
        if(value)
        {
            System.out.println("Text is a Palindrome");
        }
        else
        {
            System.out.println("Text is not a Palindrome");
        }
    }
}
