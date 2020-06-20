package application;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final Game game;

    public DrawPanel() {
        this.game = new Game();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g.create();
        this.game.nextFrame(graphics2D);
        repaint();
    }
}
