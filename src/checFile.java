import java.io.File;
import java.util.Scanner;

public class checFile {
    public void chFile(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a filename to check: ");
        String fName = s.next();
        File f = new File(fName);
        if(f.exists()){
            System.out.println("File exists"+f);
            }
        else
            System.out.println("File not found:");
    }}


