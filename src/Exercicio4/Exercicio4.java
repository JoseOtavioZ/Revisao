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
            if (comboBox1.getSelectedIndex()==0)
            {
                //produto
                Produto produto= new Produto();
                produto.setProdutoNome(textNomeProduto.getText());
                produto.setProdutoCusto(Double.valueOf(textCusto.getText()));
                produto.setVenda(Double.valueOf(textPrecoVenda.getText()));
                produto.setPis(Double.valueOf(textPis.getText()));
                produto.setCofins(Double.valueOf(textCofins.getText()));
                produto.setIcms(Double.valueOf(textIcms.getText()));
                produto.setDifal(Double.valueOf(textDifal.getText()));
                produto.setValorFrete(Double.valueOf(textField8.getText()));
            }
            else if(comboBox1.getSelectedIndex()==1)
            {
                //serviço
                Servico servico=new Servico();
                servico.setProdutoNome(textNomeProduto.getText());
                servico.setProdutoCusto(Double.valueOf(textCusto.getText()));
                servico.setVenda(Double.valueOf(textPrecoVenda.getText()));
                servico.setPis(Double.valueOf(textPis.getText()));
                servico.setCofins(Double.valueOf(textCofins.getText()));
                servico.setIcms(Double.valueOf(textIcms.getText()));
                servico.setDifal(Double.valueOf(textDifal.getText()));
                servico.setValorISS(Double.valueOf(textField8.getText()));
            }












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
