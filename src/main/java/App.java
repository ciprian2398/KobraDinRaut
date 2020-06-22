import application.DrawPanel;
import application.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App extends JFrame {

    Game game = new Game();

    public App() throws HeadlessException {
        setLayout(new BorderLayout());
        add(new DrawPanel(game), BorderLayout.CENTER);
        addActionListeners();
        setTitle("KobraDinRaut");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

    private void addActionListeners() {
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                game.processEvent(e);
            }
        });
    }
}
