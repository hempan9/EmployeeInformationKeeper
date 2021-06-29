import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createNewFile {
    public void writeFile() throws IOException {
        Scanner s = new Scanner((System.in));
        System.out.println("Enter the name of new file: ");
        String file = s.next();
        File alFile = new File(file);
        if (alFile.exists()){
            System.out.println("File name already exists: pick another name.");
        }
        else {
            FileWriter neFile = new FileWriter(file);
            neFile.write("\t\t\tThis file is created to maintain the record of check cashing. \n\t\t\t\tNina Mini Mart\n\t\t\t\t4564 Mansfiled Highway, \n\t\t\t\tDenton,Texas, 71234\n*************************************************************************\n\nCustomers Name\t\tCustomers Phone\t\tCompany Name\t\tCompany Address\t\tCheck Amount\n\n");
            neFile.close();
        }}}
