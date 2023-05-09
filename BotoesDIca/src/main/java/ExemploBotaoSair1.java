import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    public class ExemploBotaoSair1 extends JFrame{
    JButton botao;
    public ExemploBotaoSair1(){
        super("Exemplo de Botões com Diálogos de confirmação");
        Container tela = getContentPane();
        tela.setLayout(null);
        botao = new JButton("Sair");
        botao.setBounds(100,50,100,20);
        botao.setToolTipText("Botão que finaliza a janela");
        tela.add(botao);
        botao.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        int opcao;
        opcao=JOptionPane.showConfirmDialog(null,
        "Deseja mesmo fechar a janela?",
        "Fechar",JOptionPane.YES_NO_OPTION);
        if (opcao==JOptionPane.YES_OPTION)
        System.exit(0);
        }});
        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
        }
        public static void main(String args[]){
        ExemploBotaoSair1 app = new ExemploBotaoSair1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}