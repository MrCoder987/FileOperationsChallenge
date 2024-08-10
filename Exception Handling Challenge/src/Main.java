import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PalindromeFileOperations pc = new PalindromeFileOperations();

        //Creating a new file and writing the user input into it
        pc.createFileAndWriteInputFile();

        //checking for palindromes from the words written into the file, and creating a new file appending the palindrome words alone
        pc.readFileContentForPalindromes();
    }
}