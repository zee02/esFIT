import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConsultarTreinos extends JFrame{
    private JButton btnVoltar;
    private JButton btnConfiguracoes;
    private JButton btnOrdenar;
    private JPanel painelPrincipal;
    private static JScrollPane scrollPane1;
    private static JTextArea textArea1;
    private String[] treinos;

    public ConsultarTreinos(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);
        btnConfiguracoes.addActionListener(this::btnConfiguracoesActionPerformed);
    }

    private void btnVoltarActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void btnConfiguracoesActionPerformed(ActionEvent e) {
        // Completar a lista com valores aleatorios
        treinos = new String[100];
        for (int i = 0; i < 100; i++) {
            treinos[i] = "Treino " + i;
        }
        // Adicionar a lista ao JList
        System.out.println(treinos);
    }


    public static void main(String[] args) {
        new ConsultarTreinos().setVisible(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setLineWrap(true);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.getVerticalScrollBar();
    }
}
