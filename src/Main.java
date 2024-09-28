import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Question q1 = new OddLength();
        Question q2 = new NameQuestion();
        Question q3 = new LengthQuestion();
        Question q4 = new FrameQuestion();
        Question q5 = new CircleQuestion();
        // q1.Run();
        // q2.Run();
        q3.Run();
        // q4.Run();
        // q5.Run();
    }
}