package application;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final Game game;

    public DrawPanel(Game game) {
        this.game = game;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g.create();
        this.game.draw(graphics2D);
        repaint();
    }
}
