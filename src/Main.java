import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("********************************************************************");
        System.out.println("\t\t\tCheck Cashing Directory");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("This is very simple command line interface program to keep records." +
                "\nUsing this program users can create, find and make chenges to files." +
                "\nIt is very easy to use. User need to make choice 1-8 listed to the menu provoided.");
        System.out.println("********************************************************************");

        while (true) {
            System.out.println("Enter your Choice: ");
            System.out.println("1. Create a new file: ");
            System.out.println("2. Read data from existing file: ");
            System.out.println("3. Make new entry to existing file: ");
            System.out.println("4. View files and get File Information:");
            System.out.println("5. Search entry from file.");
            System.out.println("6. Delete file");
            System.out.println("7. About");
            System.out.println("8. Exit ");
            char choice;
            Scanner s = new Scanner(System.in);
            choice = s.next().charAt(0);
            switch (choice) {
                case '1':
                    createNewFile w = new createNewFile();
                    w.writeFile();
                    break;
                case '2':
                    readFile re = new readFile();
                    re.readFileD();
                    break;
                case '3':
                    writeData r = new writeData();
                    r.addData();

                    break;
                case '4':

                    fileInfo f = new fileInfo();
                    f.listFiless();
                    f.fileProperties();
                    break;
                case '5':
                    dataLookup d = new dataLookup();
                    d.lookup();
                    break;
                case '6':
                    deleteFile del = new deleteFile();
                    del.delFile();

                    break;

                case '7':
                    System.out.println("\t\tProject: CheckCashDirectory\n\t\tAuthor: Hemanta Pant\n\t\t© All right reserved.\n\t\tCreated on May,21,2021\n\t\t\tv1.0");
                    break;
                case '8':
                    System.out.println("Bye !");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input !\n Input range 1-8 only: ");
            }
        }


    }
}
