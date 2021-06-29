import java.util.Scanner;

public class askUserData {
    public static void inputData() {
        String data[] = new String[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name, age and phone:");
        for (int i = 0; i < data.length; i++) {
            data[i] = s.nextLine();
        }
    }

}
