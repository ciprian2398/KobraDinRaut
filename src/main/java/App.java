import application.DrawPanel;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App() throws HeadlessException {
        setLayout(new BorderLayout());
        add(new DrawPanel(), BorderLayout.CENTER);
        setTitle("KobraDinRaut");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
