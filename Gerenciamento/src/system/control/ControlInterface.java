package system.control;

import system.visao.CadastroProfessor1;
import system.visao.Interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import system.visao.CadastroAcademico;
import system.visao.CadastroFuncionario;
import system.visao.TelaLogin;

public class ControlInterface implements ActionListener {

    private Interface frame3;
    private Object PainelPrincipal1;

    funcoes func = new funcoes();
    TelaLogin log = new TelaLogin();

    public ControlInterface(Interface frame3) {
        this.frame3 = frame3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ("academico".equalsIgnoreCase(ae.getActionCommand())) {

            try {
                frame3.PainelPrincipal1.removeAll();

                func.guardar("O usuario acessou area academica", "C:\\Users\\oliveira\\Documents\\gerenciamentoescolar\\Relatorio.txt");
                CadastroAcademico tela = new CadastroAcademico();
                frame3.PainelPrincipal1.add(tela);
                tela.setVisible(true);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }

        }

        if ("professor".equalsIgnoreCase(ae.getActionCommand())) {

            try {
                frame3.PainelPrincipal1.removeAll();
                func.guardar("O usuario acessou area de cadastro professor", "C:\\Users\\oliveira\\Documents\\gerenciamentoescolar\\Relatorio.txt");
                CadastroProfessor1 tela2 = new CadastroProfessor1();
                frame3.PainelPrincipal1.add(tela2);
                tela2.setVisible(true);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }

        }

        if ("funcionario".equalsIgnoreCase(ae.getActionCommand())) {

            try {
                frame3.PainelPrincipal1.removeAll();
                func.guardar("O usuario acessou area de cadastro funcionario", "C:\\Users\\oliveira\\Documents\\gerenciamentoescolar\\Relatorio.txt");
                CadastroFuncionario tela3 = new CadastroFuncionario();
                frame3.PainelPrincipal1.add(tela3);
                tela3.setVisible(true);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }

        }

    }

}
