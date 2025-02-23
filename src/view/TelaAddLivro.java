package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddLivro extends JDialog {
    private JLabel jlTitulo;
    private JLabel jlAutor;
    private JLabel jlAno;
    private JTextField jtTitulo;
    private JTextField jtAutor;
    private JTextField jtAno;
    private JPanel painel;
    private JButton jbCadastrar;
    private JButton jbSair;
    
    public TelaAddLivro() {
        init();
    }
    
    private void init() {
        setVisible(true);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(480, 360);
        setTitle("Adicionar Livro");
        setLocationRelativeTo(null);
        
        jlTitulo = new JLabel("Título");
        jlAutor = new JLabel("Autor");
        jlAno = new JLabel("Ano de publicação");
        jtTitulo = new JTextField();
        jtAutor = new JTextField();
        jtAno = new JTextField();
        jbCadastrar = new JButton("Cadastrar");
        jbSair = new JButton("Sair");
        
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlAutor.setHorizontalAlignment(JLabel.CENTER);
        jlAno.setHorizontalAlignment(JLabel.CENTER);
        
        painel = new JPanel(new GridLayout(8, 1, 5, 5));
        painel.add(jlTitulo);
        painel.add(jtTitulo);
        painel.add(jlAutor);
        painel.add(jtAutor);
        painel.add(jlAno);
        painel.add(jtAno);
        painel.add(jbCadastrar);
        painel.add(jbSair);
        add(painel, BorderLayout.CENTER);
        
    }
}
