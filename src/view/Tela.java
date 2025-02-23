package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela extends JFrame {
    private JButton addLivros;
    private JButton delLivros;
    private JButton editLivros;
    private JButton verLivros;
    private JPanel painel;

    public Tela() {
        init();
        actions();
    }
    
    private void init() {
        setVisible(true);
        setTitle("Controle de Livros");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(720, 480);
        
        addLivros = new JButton("Adicionar livro");
        delLivros = new JButton("Remover livro");
        editLivros = new JButton("Editar livro");
        verLivros = new JButton("Visualizar livros");
        painel = new JPanel(new FlowLayout(1, 480, 10));
        painel.add(addLivros);
        painel.add(delLivros);
        painel.add(editLivros);
        painel.add(verLivros);
        add(painel, BorderLayout.CENTER);
        
    }
    
    private void actions() {
        
    }
}
