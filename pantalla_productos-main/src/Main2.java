import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }
}
