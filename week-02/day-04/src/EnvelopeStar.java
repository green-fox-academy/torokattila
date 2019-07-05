import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {

    static int lines = 16;
    static int dist = 160 / lines;

    public static void mainDraw(Graphics graphics) {

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                drawStar(graphics, j * 320, i * 320);
            }
        }

    }


    public static void drawStar(Graphics graphics, int x, int y) {
        for(int i = 1; i <= lines; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(Math.abs(x -(dist * i)), 160, 160, Math.abs(y - 160 -(dist * i)));
        }
    }


    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
