import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddLength extends Question {

    @Override
    public void Run() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String str = reader.readLine();

        if (str.length() % 2 == 1) {
            System.out.println(str.charAt((str.length() - 1)/ 2));
        }
        else {
            System.out.println("Even");
        }
    }
}
