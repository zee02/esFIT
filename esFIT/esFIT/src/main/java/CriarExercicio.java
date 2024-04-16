import javax.swing.*;

public class CriarExercicio extends JFrame {

    private JPanel painelPrincipal;
    private JButton guardarButton;
    private JButton facilButton;
    private JButton medioButton;
    private JButton dificilButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public CriarExercicio(String title){
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }
}
