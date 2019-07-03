import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(29, 0, 51), new Color(238, 130, 238)};
        drawSquare(graphics, 40, Color.RED);

        for(int i = 0; i < colors.length; i++) {
            drawSquare(graphics, 320 - i * 40, colors[i]);
        }
    }


    public static void drawSquare(Graphics input, int size, Color rectColor) {
        input.setColor(rectColor);
        input.fillRect(160 - size / 2, 160 - size / 2, size, size);
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