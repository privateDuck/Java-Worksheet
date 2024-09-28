import java.io.IOException;
import java.util.Scanner;

public class LengthQuestion extends Question{
    @Override
    public void Run() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length in centimeters: ");
        if (sc.hasNextFloat()) {
            float length = sc.nextFloat() / 2.54f;
            float ft = (length / 12.0f);
            float ift = (float) (ft - Math.floor(ft)) * 12.0f;
            ft = (float) Math.floor(ft);
            System.out.printf("The length is %d feet and %f inches", (int)ft, ift);
        }
    }
}
