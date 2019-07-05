import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int parts = 64;
        int lines = 16;
        double sqr = (int)(Math.sqrt(parts));


        for(int i = 0; i < sqr; i++) {
            for(int j = 0; j < sqr; j++) {
                canvasParts(graphics, ((int)(parts/(sqr/2))), lines, ((int)(j * (320/parts * sqr))), (int)(i * (320/parts * sqr)));
            }
        }
    }

    public static void canvasParts(Graphics input, int parts, int lines, int x, int y) {
        int area = 320 / (parts / 2);
        for (int i = 1; i < lines; i++) {
            input.setColor(Color.green);
            input.drawLine(x, y + (area / lines * i), x + (area / lines * i), y + area);
            input.setColor(Color.magenta);
            input.drawLine((area / lines * i) + x, y, area + x, y + (area / lines * i));
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
