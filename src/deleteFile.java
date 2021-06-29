import java.io.File;
import java.util.Scanner;

public class deleteFile {
    public void delFile() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the file to delete: ");

        String fName = s.next();
        File file = new File(fName);
            if (file.exists()==true) {
                System.out.println("Are you sure you want to delete file: y/n?:" + fName);
                char choice = s.next().charAt(0);
                if (choice == 'Y' || choice == 'y') { file.delete();
                System.out.println("Deleted 1 file: "+fName);
            }
                 }
            else{
                System.out.println("No file found with name: "+fName);
            }

    }
}
