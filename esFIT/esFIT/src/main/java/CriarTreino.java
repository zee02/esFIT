import javax.swing.*;

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
            JOptionPane.showMessageDialog(null, "Treino guardado com sucesso!");
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

        comboEx1.addItem("Leg Press");
        comboEx1.addItem("Supino");
        comboEx1.addItem("Puxada");


    }


    public static void main(String[] args) {
        JFrame frame = new CriarTreino("Criar Treino");
        frame.setVisible(true);
    }
}
