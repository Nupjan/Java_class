
import javax.swing.*;

public class JframeTutorial {
    public static void main(String[] args) {
        JFrame w1 = new JFrame("Biggest Window");
        JFrame w2 = new JFrame("Big WIndow");
        JFrame w3 = new JFrame("Small Window");

        w1.setSize(500, 250);
        w2.setSize(250, 125);
        w3.setSize(125, 65);

        w1.setVisible(true);
        w2.setVisible(true);
        w3.setVisible(true);

        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
