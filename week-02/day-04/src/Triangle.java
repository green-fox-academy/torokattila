import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    static int sideSize = 10;
    static int halfSize = sideSize / 2;
    static int rows = 30;

    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i <= rows / 2; i++) {
            graphics.drawLine(160 + (sideSize * i), 0 + (sideSize * 2 * i),(160 - rows * halfSize) + (sideSize * 2 * i), rows * sideSize);
            graphics.drawLine(160 - (sideSize * i), 0 + (sideSize * 2 * i),(160 + rows * halfSize) - (sideSize * 2 * i), rows * sideSize);
            graphics.drawLine(160 - (sideSize * i), 0 + (sideSize * 2 * i),160 + (sideSize * i),0 + (sideSize * 2 * i));
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
