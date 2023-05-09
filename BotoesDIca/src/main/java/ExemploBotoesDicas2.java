import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBotoesDicas2 extends JFrame{
    JButton botao1,botao2;
    public ExemploBotoesDicas2(){
    super("Exemplo de Botões com Dica");
    Container tela = getContentPane();
    tela.setLayout(null);
    botao1 = new JButton("Olá");
    botao2 = new JButton("Sair");
    botao1.setBounds(100,50,100,20);
    botao2.setBounds(100,100,100,20);
    botao1.setToolTipText("Botão usado para abrir algo");
    botao2.setToolTipText("Botão que será usado para sair");
    //para alterar a cor da dica
    UIManager.put("ToolTip.background",SystemColor.info);
    tela.add(botao1);
    tela.add(botao2);
    setSize(300,200);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String args[]){
        ExemploBotoesDicas2 app = new ExemploBotoesDicas2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}