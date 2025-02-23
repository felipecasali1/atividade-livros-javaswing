package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
        setSize(360, 480);
        setLocationRelativeTo(null);
        
        addLivros = new JButton("ADICIONAR LIVRO");
        delLivros = new JButton("REMOVER LIVRO");
        editLivros = new JButton("EDITAR LIVRO");
        verLivros = new JButton("VISUALIZAR LIVROS");
        painel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        Dimension tamanhoBotao = new Dimension(240, 80);
        addLivros.setPreferredSize(tamanhoBotao);
        delLivros.setPreferredSize(tamanhoBotao);
        editLivros.setPreferredSize(tamanhoBotao);
        verLivros.setPreferredSize(tamanhoBotao);
        
        painel.add(addLivros);
        painel.add(delLivros);
        painel.add(editLivros);
        painel.add(verLivros);
        add(painel, BorderLayout.CENTER);
        
    }
    
    private void actions() {
        addLivros.addActionListener((e) -> {
            new TelaAddLivro();
        });
        delLivros.addActionListener((e) -> {
            new TelaDelLivro();
        });
        editLivros.addActionListener((e) -> {
            new TelaEditLivro();
        });
        verLivros.addActionListener((e) -> {
            new TelaVerLivro();
        });
    }
}
