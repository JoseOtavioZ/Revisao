package Exercicio4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio4 extends JFrame{
    private JTextField textNomeProduto;
    private JTextField textCusto;
    private JTextField textPrecoVenda;
    private JTextField textPis;
    private JTextField textCofins;
    private JTextField textIcms;
    private JTextField textDifal;
    private JTextField textField8;
    private JButton calcularButton;
    public JPanel panelEx4;
    private JComboBox comboBox1;
    private JTextField textResult;

    public Exercicio4(){
        super();
        calcularButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String produtoNome = textNomeProduto.getText();
            double produtoCusto = Double.valueOf(textCusto.getText());
            double venda = Double.valueOf(textPrecoVenda.getText());
            double pis = Double.valueOf(textPis.getText());
            double cofins = Double.valueOf(textCofins.getText());
            double icms = Double.valueOf(textIcms.getText());
            double difal = Double.valueOf(textDifal.getText());
            double frete = 0;
            double result = 0;
            double iss=0;
            if (comboBox1.getSelectedIndex() == 0) {
                result = ((venda - produtoCusto - pis - cofins - icms - difal - frete) / venda) * 100;
                textResult.setText(String.valueOf(result));
            } else if (comboBox1.getSelectedIndex() == 1) {
                result = ((venda - produtoCusto - pis - cofins - icms - difal-iss) / venda) * 100;
                textResult.setText(String.valueOf(result));
            }
        }
    });
}
}
