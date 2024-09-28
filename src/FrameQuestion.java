import javax.swing.*;
import java.io.IOException;

public class FrameQuestion extends Question{
    @Override
    public void Run() throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(200, 300);
        frame.setTitle("My First Frame");
        frame.setLocation(100, 50);
        frame.setVisible(true);
    }
}
