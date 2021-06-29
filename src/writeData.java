import java.io.*;
import java.util.Scanner;

public class writeData {
    static         Scanner s = new Scanner(System.in);

    public void addData() throws IOException {
        String array[] = new String[6];
        System.out.println("Enter filename to write data: ");
        String fName =s.next();
        File f = new File(fName);
        if(f.exists()) {
            FileWriter fr = new FileWriter(f, true);
            System.out.println("Enter Name, phone, company name, address(company) and amount shown in check:\n");
            for (int i = 0; i <array.length; i++) {
                array[i] = s.nextLine();
                fr.write(array[i] + "\t\t");
            }
            fr.write("\n");
            fr.close();
        }
        else
        {
            System.out.println("No file with name "+fName+" found.");
            System.out.println("You want to create new file instead Y/N");
            char choice = s.next().charAt(0);
            if(choice =='Y'||choice=='y') {
                createNewFile c = new createNewFile();
                c.writeFile();
            }
            else
                System.out.println("Try again!");
        }
    }
}
