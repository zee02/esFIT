import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriarExercicio extends JFrame {

    private JPanel painelPrincipal;
    private JButton guardarButton;
    private JButton facilButton;
    private JButton medioButton;
    private JButton dificilButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JComboBox comboBox1;
    private String dificuldade;

    public CriarExercicio(String title){
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        facilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dificuldade = "Fácil";
            }
        });

        medioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dificuldade = "Médio";
            }
        });

        comboBox1.addItem("Costas");
        comboBox1.addItem("Braços");
        comboBox1.addItem("Peito");
        comboBox1.addItem("Pernas");
        comboBox1.addItem("UpperBody");
        comboBox1.addItem("LowerBody");
        comboBox1.addItem("FullBody");
        comboBox1.addItem("Core");
        dificilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dificuldade = "Difícil";
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exerciseName = textArea1.getText();
                String muscleGroup = textArea2.getText();
                String materials = comboBox1.getSelectedItem().toString();

                System.out.println("\nExercise Name: " + exerciseName);
                System.out.println("Muscle Group: " + muscleGroup);
                System.out.println("Materials: " + materials);
                System.out.println("Difficulty: " + dificuldade);
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new CriarExercicio("Criar Exercicio");
        frame.setVisible(true);
    }
}
