import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
    public void readFileD() throws IOException {
        String readDat;
        System.out.println("Enter the filename to read data from: ");
        Scanner s = new Scanner(System.in);
        String fileR = s.next();
        try{
       FileReader fReader = new FileReader(fileR);
        Scanner reader = new Scanner(fReader);
        while(reader.hasNext()){
            readDat = reader.nextLine();
            System.out.println(readDat);
        }
            System.out.println("*****************End of file******************");
        fReader.close();
    }
    catch(Exception e){
        System.out.println("No such file found: \n");
    }
}}
