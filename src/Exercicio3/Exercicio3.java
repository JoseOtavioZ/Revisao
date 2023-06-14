package Exercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Exercicio3 extends JFrame
{
    private JComboBox game;
    private JButton jogarButton;
    public JPanel panelEx3;

    public Exercicio3()
    {
    jogarButton.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(3);
            //0=pedra, 1=papel,2=tesoura

            int escolha=game.getSelectedIndex();

            if (escolha==0)//pedra
            {
                if (numeroAleatorio==0)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Pedra\n EMPATOU!!");
                }
                else if (numeroAleatorio==1)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu papel\n DERROTA!!");
                }
                else if(numeroAleatorio==2)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Tesoura\n VITORIA!!");
                }
            }
            else if (escolha==1)//papel
            {
                if (numeroAleatorio==0)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Pedra\n VITORIA!!");
                }
                else if (numeroAleatorio==1)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu papel\n EMPATOU!!");
                }
                else if(numeroAleatorio==2)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Tesoura\n DERROTA!!");
                }
            }
            else if (escolha==2)//tesoura
            {
                if (numeroAleatorio==0)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Pedra\n DERROTA!!");
                }
                else if (numeroAleatorio==1)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu papel\n VITORIA!!");
                }
                else if(numeroAleatorio==2)
                {
                    JOptionPane.showMessageDialog(null,"O seu oponente escolheu Tesoura\n EMPATOU!!");
                }
            }
        }
    });
}
}
