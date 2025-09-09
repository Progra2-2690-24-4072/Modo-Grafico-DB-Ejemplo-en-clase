package prueba;

import javax.swing.SwingUtilities;

public class Prueba {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PersonasForm().setVisible(true));
    }
}
