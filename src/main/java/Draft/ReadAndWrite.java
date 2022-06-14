package Draft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(readerTerminal());

//        System.out.println(readerFile().toString());

//        writerFile("New Line");
    }

    public static String readerTerminal(){
        Scanner scanTerminal = new Scanner(System.in);
        return scanTerminal.nextLine();
    }

    public static List<String> readerFile() throws FileNotFoundException {
        File file1 = new File("src/main/resources/Read&Write.txt");
        List<String> result = new ArrayList<>();

        try(Scanner scannerFile = new Scanner(file1)){
            while (scannerFile.hasNext()){
                result.add(scannerFile.nextLine());
            }
        }
        return result;
    }

    public static void writerFile(String inputStr) throws FileNotFoundException {
        File file1 = new File("src/main/resources/Read&Write.txt");
        try(PrintWriter printWriter = new PrintWriter(file1)){
            printWriter.println(inputStr);
        }
    }
}
