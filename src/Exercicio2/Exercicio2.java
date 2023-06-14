package Exercicio2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio2 extends JFrame{
    private JTextField textUser;
    private JPasswordField textSenha;
    private JButton logar1;
    private JButton cancelar;
    public JPanel panelEx2;
public Exercicio2() {
    logar1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = textUser.getText();
            String senha = new String(textSenha.getPassword());
            if (user.equals("admin") && senha.equals("admin"))
            {
                JOptionPane.showMessageDialog(null,"Logado com sucesso");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Usuario ou senha invalidos");
            }
        }
    });
    cancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textUser.setText("");
            textSenha.setText("");
        }
    });
}
}
