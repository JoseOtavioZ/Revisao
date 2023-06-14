package Exercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio1 extends JFrame{
    private JComboBox comboBox1;
    private JButton exibirButton;
    private JTextArea textArea1;
    public JPanel panelEx1;

    public Exercicio1() {
    exibirButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (comboBox1.getSelectedIndex()==0)
            {
                textArea1.setText("Polimorfismo permite que objetos de diferentes classes sejam tratados de forma uniforme e flexível,\npossibilitando a implementação de comportamentos específicos para cada classe. Isso promove\na reutilização de código e a extensibilidade do sistema.");
            }
            else if (comboBox1.getSelectedIndex()==1)
            {
                textArea1.setText("Herança em Java permite que uma classe herde características e comportamentos de outra classe,\nfacilitando a reutilização de código e a criação de estruturas flexíveis.");
            }
            else if (comboBox1.getSelectedIndex()==2)
            {
                textArea1.setText("Encapsulamento protege os atributos e métodos de uma classe, controlando seu acesso e fornecendo\numa interface consistente para interagir com ela. Isso aumenta a segurança, facilita a manutenção\ne promove a reutilização do código.");
            }
            else if (comboBox1.getSelectedIndex()==3)
            {
                textArea1.setText("Sobrecarga permite criar vários métodos com o mesmo nome, mas diferentes parâmetros. Isso oferece\nflexibilidade na chamada dos métodos e melhora a legibilidade do código.");
            }
        }
    });
}
}
