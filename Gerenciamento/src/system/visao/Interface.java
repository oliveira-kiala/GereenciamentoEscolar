package system.visao;

import system.control.ControlInterface;
import javax.swing.JTable;

public class Interface extends javax.swing.JFrame {
    
    ControlInterface listener = new ControlInterface(this);
    
    
    public Interface() {
        initComponents();
       

    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        PainelPrincipal1 = new javax.swing.JDesktopPane();
        BarraMenu1 = new javax.swing.JMenuBar();
        Menucadastro1 = new javax.swing.JMenu();
        MenuItemCadastroAcademico2 = new javax.swing.JMenuItem();
        MenuItemCadastroFuncionario3 = new javax.swing.JMenuItem();
        MenuItemCadastroProfessor1 = new javax.swing.JMenuItem();
        Menurelatorio2 = new javax.swing.JMenu();
        MenuItemRelatorioProfessor3 = new javax.swing.JMenuItem();
        MenuItemRelatorioAcademico4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Escolar");

        javax.swing.GroupLayout PainelPrincipal1Layout = new javax.swing.GroupLayout(PainelPrincipal1);
        PainelPrincipal1.setLayout(PainelPrincipal1Layout);
        PainelPrincipal1Layout.setHorizontalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        PainelPrincipal1Layout.setVerticalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 923, Short.MAX_VALUE)
        );

        BarraMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Menucadastro1.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\GereenciamentoEscolar\\Gerenciamento\\src\\imagens\\cadastros .png")); // NOI18N
        Menucadastro1.setText("Cadastro   ");
        Menucadastro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        MenuItemCadastroAcademico2.addActionListener(listener);
        MenuItemCadastroAcademico2.setActionCommand("academico");
        MenuItemCadastroAcademico2.setText("Acadêmico");
        /*
        */
        Menucadastro1.add(MenuItemCadastroAcademico2);

        MenuItemCadastroFuncionario3.addActionListener(listener);
        MenuItemCadastroFuncionario3.setActionCommand("funcionario");
        MenuItemCadastroFuncionario3.setText("Funcionario");
        Menucadastro1.add(MenuItemCadastroFuncionario3);

        MenuItemCadastroProfessor1.addActionListener(listener);
        MenuItemCadastroProfessor1.setActionCommand("professor");
        MenuItemCadastroProfessor1.setText("Professor");
        Menucadastro1.add(MenuItemCadastroProfessor1);

        BarraMenu1.add(Menucadastro1);

        Menurelatorio2.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\GereenciamentoEscolar\\Gerenciamento\\src\\imagens\\relatorio.jpg")); // NOI18N
        Menurelatorio2.setText("Relatório");
        Menurelatorio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        MenuItemRelatorioProfessor3.setText("Professor");
        Menurelatorio2.add(MenuItemRelatorioProfessor3);

        MenuItemRelatorioAcademico4.setText("Acadêmico");
        Menurelatorio2.add(MenuItemRelatorioAcademico4);

        BarraMenu1.add(Menurelatorio2);

        setJMenuBar(BarraMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal1)
        );

        setSize(new java.awt.Dimension(2016, 1039));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu1;
    public javax.swing.JMenuItem MenuItemCadastroAcademico2;
    public javax.swing.JMenuItem MenuItemCadastroFuncionario3;
    public javax.swing.JMenuItem MenuItemCadastroProfessor1;
    private javax.swing.JMenuItem MenuItemRelatorioAcademico4;
    private javax.swing.JMenuItem MenuItemRelatorioProfessor3;
    private javax.swing.JMenu Menucadastro1;
    private javax.swing.JMenu Menurelatorio2;
    public javax.swing.JDesktopPane PainelPrincipal1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
