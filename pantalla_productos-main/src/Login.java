import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField Usuario;
    private JButton INICIARSESIONButton;
    private JButton REGISTRARSEButton;
    private JButton SALIRButton;
    private JLabel LUsu;
    private JLabel LContra;
    private JPanel Login;
    private JPasswordField Contrasena;

    public Login() {
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica las credenciales
                String usuarioIngresado = Usuario.getText();
                String contrasenaIngresada = new String(Contrasena.getPassword());

                if (usuarioIngresado.equals("trabajo grupal") && contrasenaIngresada.equals("123456")) {
                    // Credenciales correctas, abre la pantalla de registro de productos
                    productos registroProductos = new productos();
                    registroProductos.setVisible(true);

                    // Cierra la pantalla de login
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Login);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        REGISTRARSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí podrías implementar la lógica para abrir otra pantalla de registro si es necesario
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
    }
}



