import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Exemplo 1: Utilizando BorderLayout
class LojaDeDocesBorderLayout extends JFrame {

    private JTextField quantidadeField;
    private JComboBox<String> docesComboBox;
    private JLabel totalLabel;

    public LojaDeDocesBorderLayout() {
        setLayout(new BorderLayout());

        // Painel de seleção de doces
        JPanel painelDoces = new JPanel();
        String[] doces = {"Brigadeiro", "Paçoca", "Cajuzinho"};
        docesComboBox = new JComboBox<>(doces);
        painelDoces.add(new JLabel("Selecione o doce:"));
        painelDoces.add(docesComboBox);
        add(painelDoces, BorderLayout.NORTH);

        // Painel de quantidade
        JPanel painelQuantidade = new JPanel();
        quantidadeField = new JTextField(5);
        painelQuantidade.add(new JLabel("Quantidade:"));
        painelQuantidade.add(quantidadeField);
        add(painelQuantidade, BorderLayout.CENTER);

        // Painel de botão e total
        JPanel painelBotaoTotal = new JPanel();
        JButton pedirButton = new JButton("Pedir");
        pedirButton.addActionListener(new PedirButtonActionListener());
        totalLabel = new JLabel("Total: R$ 0,00");
        painelBotaoTotal.add(pedirButton);
        painelBotaoTotal.add(totalLabel);
        add(painelBotaoTotal, BorderLayout.SOUTH);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class PedirButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int quantidade = Integer.parseInt(quantidadeField.getText());
            String doceSelecionado = (String) docesComboBox.getSelectedItem();
            double preco = getPrecoDoce(doceSelecionado);
            double total = quantidade * preco;
            totalLabel.setText(String.format("Total: R$ %.2f", total));
        }
    }

    private double getPrecoDoce(String doce) {
        switch (doce) {
            case "Brigadeiro":
                return 2.50;
            case "Paçoca":
                return 3.00;
            case "Cajuzinho":
                return 2.00;
            default:
                return 0.00;
        }
    }
}

// Exemplo 2: Utilizando GridLayout
class LojaDeDocesGridLayout extends JFrame {

    private JTextField quantidadeField;
    private JComboBox<String> docesComboBox;
    private JLabel totalLabel;

    public LojaDeDocesGridLayout() {
        setLayout(new GridLayout(3, 2));

        // Linha 1: seleção de doces
        add(new JLabel("Selecione o doce:"));
        String[] doces = {"Brigadeiro", "Paçoca", "Cajuzinho"};
        docesComboBox = new JComboBox<>(doces);
        add(docesComboBox);

        // Linha 2: quantidade
        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField(5);
        add(quantidadeField);

        // Linha 3: botão e total
        JButton pedirButton = new JButton("Pedir");
        pedirButton.addActionListener(new PedirButtonActionListener());
        add(pedirButton);
        totalLabel = new JLabel("Total: R$ 0,00");
        add(totalLabel);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class PedirButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int quantidade = Integer.parseInt(quantidadeField.getText());
            String doceSelecionado = (String) docesComboBox.getSelectedItem();
            double preco = getPrecoDoce(doceSelecionado);
            double total = quantidade * preco;
            totalLabel.setText(String.format("Total: R$ %.2f", total));
        }
    }

    private double getPrecoDoce(String doce) {
        switch (doce) {
            case "Brigadeiro":
                return 2.50;
            case "Paçoca":
                return 3.00;
            case "Cajuzinho":
                return 2.00;
            default:
                return 0.00;
        }
    }
}

public class LojaDeDoces {
    public static void main(String[] args) {
        new LojaDeDocesBorderLayout();
        new LojaDeDocesGridLayout();
    }
}