package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;

public class TelaVerLivro extends JDialog {
    private JTable jtTabela;
    private JButton jbSair;

    public TelaVerLivro() {
        init();
    }
    
    private void init() {
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(480, 360);
        setTitle("Visualizar Livros");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        
    }
}
