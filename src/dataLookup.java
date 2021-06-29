import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class dataLookup {
    static  Scanner s =new Scanner(System.in);
    public void lookup()  {
        System.out.println("Enter a filename to start lookup: ");
        String fName = s.next();
        try{
        File f = new File(fName);
        Scanner fReader = new Scanner(f);

        if (f.exists()){
            String found;

            System.out.println("Enter a name of person to lookup: ");
            String findData = s.next();
            while(fReader.hasNext()){
                found = fReader.nextLine().toLowerCase(Locale.ROOT);
                if(found.contains(findData.toLowerCase(Locale.ROOT))){
                    System.out.println(found.toUpperCase());

                }

            }
            System.out.println("*****************End of search results******************");

        }
        else
            System.out.println("No file found.Try again! ");}
        catch (Exception e){
            System.out.println("File not found. Try Again.");
        }
    }
}
