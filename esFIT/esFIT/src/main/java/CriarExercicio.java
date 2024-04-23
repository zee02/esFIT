import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarExercicio extends JFrame {

    private JPanel painelPrincipal;
    private JButton guardarButton;
    private JButton facilButton;
    private JButton medioButton;
    private JButton dificilButton;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JComboBox comboBox2;
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
                facilButton.setBackground(Color.GREEN);
                medioButton.setBackground(Color.WHITE);
                dificilButton.setBackground(Color.WHITE);
            }
        });

        medioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dificuldade = "Médio";
                facilButton.setBackground(Color.WHITE);
                medioButton.setBackground(Color.YELLOW);
                dificilButton.setBackground(Color.WHITE);
            }
        });

        dificilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dificuldade = "Difícil";
                dificilButton.setBackground(Color.RED);
                medioButton.setBackground(Color.WHITE);
                facilButton.setBackground(Color.WHITE);
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Erro: Não foi encontrado um nome", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String nomeExercicio = textArea1.getText();
                    String grupoMuscular = comboBox2.getSelectedItem().toString();
                    String materiais = comboBox1.getSelectedItem().toString();


                    try {
                        File file = new File("infoExercicios.txt");
                        FileWriter fileWriter = new FileWriter(file, true);
                        PrintWriter writer = new PrintWriter(fileWriter);

                        writer.println("--------------------");
                        writer.println("Exercicio 1: " + nomeExercicio);
                        writer.println("Grupo Muscular: " + grupoMuscular);
                        writer.println("Materiais: " + materiais);

                        writer.close();

                        JOptionPane.showMessageDialog(null, "Exercicio guardado com sucesso!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }
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

        comboBox2.addItem("Polia");
        comboBox2.addItem("Cabos");
        comboBox2.addItem("Halteres");
        comboBox2.addItem("Barra");
        comboBox2.addItem("Elásticos");
        comboBox2.addItem("Bola Medicinal");
        comboBox2.addItem("Nenhum");


    }
    public static void main(String[] args){
        JFrame frame = new CriarExercicio("Criar Exercicio");
        frame.setVisible(true);
    }
}
