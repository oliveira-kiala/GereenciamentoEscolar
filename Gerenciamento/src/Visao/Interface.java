package Visao;

import Control.ControlInterface;
import javax.swing.JTable;
/**
 *
 * @author oliveira kiala
 */
public class Interface extends javax.swing.JFrame {
    /**
     * Creates new form Interface
     */
    
    ControlInterface listener = new ControlInterface(this);
    
    
    public Interface() {
        initComponents();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        PainelPrincipal1 = new javax.swing.JDesktopPane();
        BarraMenu1 = new javax.swing.JMenuBar();
        Menucadastro1 = new javax.swing.JMenu();
        MenuItemCadastroProfessor1 = new javax.swing.JMenuItem();
        MenuItemCadastroAcademico2 = new javax.swing.JMenuItem();
        Menurelatorio2 = new javax.swing.JMenu();
        MenuItemRelatorioProfessor3 = new javax.swing.JMenuItem();
        MenuItemRelatorioAcademico4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Escolar");

        javax.swing.GroupLayout PainelPrincipal1Layout = new javax.swing.GroupLayout(PainelPrincipal1);
        PainelPrincipal1.setLayout(PainelPrincipal1Layout);
        PainelPrincipal1Layout.setHorizontalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        PainelPrincipal1Layout.setVerticalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        Menucadastro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastros .png"))); // NOI18N
        Menucadastro1.setText("Cadastro   ");
        Menucadastro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        MenuItemCadastroProfessor1.addActionListener(listener);
        MenuItemCadastroProfessor1.setActionCommand("professor");
        MenuItemCadastroProfessor1.setText("Professor");
        MenuItemCadastroProfessor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroProfessor1ActionPerformed(evt);
            }
        });
        Menucadastro1.add(MenuItemCadastroProfessor1);

        MenuItemCadastroAcademico2.addActionListener(listener);
        MenuItemCadastroAcademico2.setActionCommand("academico");
        MenuItemCadastroAcademico2.setText("Acadêmico");
        MenuItemCadastroAcademico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroAcademico2ActionPerformed(evt);
            }
        });
        Menucadastro1.add(MenuItemCadastroAcademico2);

        BarraMenu1.add(Menucadastro1);

        Menurelatorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.jpg"))); // NOI18N
        Menurelatorio2.setText("Relatório");
        Menurelatorio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        MenuItemRelatorioProfessor3.setText("Professor");
        MenuItemRelatorioProfessor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRelatorioProfessor3ActionPerformed(evt);
            }
        });
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

        setSize(new java.awt.Dimension(685, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadastroProfessor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroProfessor1ActionPerformed
        
    }//GEN-LAST:event_MenuItemCadastroProfessor1ActionPerformed

    private void MenuItemRelatorioProfessor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRelatorioProfessor3ActionPerformed

        /*CadastroProfessor1 objeto = new CadastroProfessor1();
          PainelPrincipal1.add(objeto);
          objeto.setVisible(true);*/


    }//GEN-LAST:event_MenuItemRelatorioProfessor3ActionPerformed

    private void MenuItemCadastroAcademico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroAcademico2ActionPerformed
       /* CadastroAcademico objeto = new CadastroAcademico();
          PainelPrincipal1.add(objeto);
          objeto.setVisible(true);*/
    }//GEN-LAST:event_MenuItemCadastroAcademico2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu1;
    public javax.swing.JMenuItem MenuItemCadastroAcademico2;
    public javax.swing.JMenuItem MenuItemCadastroProfessor1;
    private javax.swing.JMenuItem MenuItemRelatorioAcademico4;
    private javax.swing.JMenuItem MenuItemRelatorioProfessor3;
    private javax.swing.JMenu Menucadastro1;
    private javax.swing.JMenu Menurelatorio2;
    public javax.swing.JDesktopPane PainelPrincipal1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    // End of variables declaration//GEN-END:variables
}
