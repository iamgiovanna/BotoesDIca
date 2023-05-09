import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploTraduzir extends JFrame{
    JButton botao;
    public ExemploTraduzir(){
        super("Exemplo de Botões Traduzidos");
        Container tela = getContentPane();
        tela.setLayout(null);
        botao = new JButton("Sair");
        botao.setBounds(100,50,100,20);
        botao.setToolTipText("Botão que finaliza a janela");
        tela.add(botao);
        botao.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        int opcao;

        Object[] botoes = {"Sim","Não"};
        opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechara janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        if (opcao==JOptionPane.YES_OPTION)
        System.exit(0); }});
               setSize(300,200);
               setVisible(true);
               setLocationRelativeTo(null);
           
    }
    public static void main(String args[]){
                ExemploTraduzir app = new ExemploTraduzir();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
