import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileInfo {
    public void listFiless() throws IOException {
        File f = new File("."); // current directory
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory:");
            } else {
                System.out.print("     file:");
            }
            System.out.println(file.getCanonicalPath());
        }
    }
    public void fileProperties(){
        Scanner s = new Scanner(System.in);
       // System.out.println("The files in this dir are: ");
        //File fDir = new File("/Users/hobject/");
        System.out.println("Enter filename to view info: ");
        String fName = s.next();
        File f = new File(fName);
        if(f.exists()){
            System.out.println("File name: "+f.getName());
            System.out.println("Absolute Path: "+f.getAbsolutePath());
            System.out.println("Writable: "+f.canWrite());
            System.out.println("Readable: "+ f.canRead());
            System.out.println("Executable: "+f.canExecute());
            System.out.println("File size in bytes: "+f.length());
            System.out.println(f.getPath());

        }
        else
            System.out.println("No such file found in this directory: ");
    }
}
