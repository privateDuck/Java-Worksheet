import java.io.IOException;
import java.util.Scanner;

public class NameQuestion extends Question{

    @Override
    public void Run() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String fname = sc.next();
        String mname = sc.next();
        String lname = sc.next();
        System.out.printf("%s, %s %c.", lname, fname, mname.charAt(0));
    }
}
