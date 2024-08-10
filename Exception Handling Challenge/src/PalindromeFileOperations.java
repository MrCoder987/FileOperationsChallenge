import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeFileOperations {
    public boolean isPalindrome(String wordFromFile) {
        char[] word = wordFromFile.toCharArray();
        int i=0, j=word.length-1;
        //boolean flag;
        while (i != j) {
            if (word[i] == word[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


    // 1
    public void createFileAndWriteInputFile() {
        File fileObj = new File("input.txt");
        Scanner sc = new Scanner(System.in);
        try {
            if(fileObj.createNewFile()) {
                System.out.println("File created : " + fileObj.getAbsolutePath());
            }
            else {
                System.out.println("File already exists.");
            }
            System.out.println("Enter the words to be written into input file: ");
            String inputWords = sc.nextLine();
            FileWriter fileWriter = new FileWriter("input.txt");
            fileWriter.write(inputWords);
            fileWriter.close();
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void readFileContentForPalindromes() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String word = sc.next();
            System.out.println(word);
            if (isPalindrome(word)) {
                createPalindromeFile(word);
                //System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is NOT a palindrome");
            }
        }
        sc.close();
    }

    public void createPalindromeFile(String word) {
        try {
            FileWriter fileWriter = new FileWriter("PalindromeSample.txt");
            fileWriter.write(word + " is a palindrome");
            fileWriter.close();
            System.out.println("Successfully written to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
