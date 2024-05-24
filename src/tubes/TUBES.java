package tubes;

public class TUBES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Launch the SignUp GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
}
