package system.visao;

import java.io.IOException;
import system.control.ControlLogin;
import javax.swing.JOptionPane;
import system.control.funcoes;
import static system.control.funcoes.ler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oliveira kiala
 */
public class TelaLogin extends javax.swing.JFrame {

    private static TelaLogin frame2;

    // private static TelaLogin frame2;
    private ControlLogin listener = new ControlLogin(this);
    funcoes func = new funcoes();

    public TelaLogin() {
        initComponents();

        try {

            String dado = funcoes.ler("C:\\Users\\oliveira\\Desktop\\documentos\\login.txt");

            for (int i = 30; i < dado.length(); i++) {
                char c = dado.charAt(32);
                String p = Character.toString(c);

                usuario1.setText(p);
            }
            //String str = new String(x);
            //usuario1.setText(str);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "nao tem arquivo");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoLogin = new javax.swing.JButton();
        usuario1 = new javax.swing.JTextField();
        senha1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        botaoLogin.addActionListener(listener);
        botaoLogin.setActionCommand("login");
        botaoLogin.setText("Fazer Login");
        getContentPane().add(botaoLogin);
        botaoLogin.setBounds(210, 280, 100, 23);
        getContentPane().add(usuario1);
        usuario1.setBounds(110, 110, 300, 30);
        getContentPane().add(senha1);
        senha1.setBounds(110, 190, 300, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 70, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 390);

        setSize(new java.awt.Dimension(515, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPasswordField senha1;
    public javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
