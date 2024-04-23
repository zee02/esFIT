import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarTreino extends JFrame{


    private JPanel panel1;
    private JButton btnMais;
    private JComboBox comboEx1;
    private JSpinner spinnerRep;
    private JSpinner spinnerPeso;
    private JButton btnGuardar;
    private JLabel lblEx1;
    private JLabel lblPeso;
    private JLabel lblReps;
    private JLabel lblEx2;
    private JComboBox comboEx2;
    private JLabel lblReps2;
    private JSpinner spinnerReps2;
    private JSpinner spinnerPeso2;
    private JButton btnMais2;
    private JLabel lblPeso2;

    public CriarTreino(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();


        btnMais2.setVisible(false);
        lblPeso2.setVisible(false);
        lblEx2.setVisible(false);
        comboEx2.setVisible(false);
        lblReps2.setVisible(false);
        spinnerReps2.setVisible(false);
        spinnerPeso2.setVisible(false);


        btnGuardar.addActionListener(e -> {
            try {

                int peso1 = (Integer) spinnerPeso.getValue();
                int peso2 = (Integer) spinnerPeso2.getValue();
                int reps1 = (Integer) spinnerRep.getValue();
                int reps2 = (Integer) spinnerReps2.getValue();
                String exercicio1 = (String) comboEx1.getSelectedItem();
                String exercicio2 = (String) comboEx2.getSelectedItem();

                if(reps1 < 0 || reps2 < 0) {
                    JOptionPane.showMessageDialog(null, "Error: Repetições não podem ser menores que 0!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if(peso1 < 0 || peso2 < 0) {
                    JOptionPane.showMessageDialog(null, "Error: Peso não pode ser menor que 0!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (reps1 > 999 || reps2 > 999) {
                    JOptionPane.showMessageDialog(null, "Erro: Repetições não podem ser maiores que 999!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if(peso1 > 999 || peso2 > 999) {
                    JOptionPane.showMessageDialog(null, "Erro: Peso não pode ser maior que 999!","Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if(exercicio1.isBlank() || (lblEx2.isVisible() && exercicio2.isBlank())){

                    JOptionPane.showMessageDialog(null, "Erro: Exercício não pode estar em branco!","Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }


                File file = new File("trainingData.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter writer = new PrintWriter(fileWriter);

                writer.println("--------------------");
                writer.println("Exercicio 1: " + comboEx1.getSelectedItem());
                writer.println("Repetições: " + spinnerRep.getValue());
                writer.println("Peso: " + spinnerPeso.getValue());

                if (lblEx2.isVisible()) {
                    writer.println("Exercicio 2: " + comboEx2.getSelectedItem());
                    writer.println("Repetições: " + spinnerReps2.getValue());
                    writer.println("Peso: " + spinnerPeso2.getValue());
                }

                writer.close();

                JOptionPane.showMessageDialog(null, "Treino guardado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        btnMais.addActionListener(e -> {
            lblEx2.setVisible(true);
            comboEx2.setVisible(true);
            lblReps2.setVisible(true);
            spinnerReps2.setVisible(true);
            spinnerPeso2.setVisible(true);
            btnMais2.setVisible(true);
            lblPeso2.setVisible(true);
        });

        comboEx1.addItem("");
        comboEx1.addItem("Leg Press");
        comboEx1.addItem("Supino");
        comboEx1.addItem("Puxada");

        comboEx2.addItem("");
        comboEx2.addItem("Leg Press");
        comboEx2.addItem("Supino");
        comboEx2.addItem("Puxada");





    }




    public static void main(String[] args) {
        // Pass a String when creating a new CriarTreino
        JFrame frame = new CriarTreino("CriarTreino");
        frame.setVisible(true);

    }


}


