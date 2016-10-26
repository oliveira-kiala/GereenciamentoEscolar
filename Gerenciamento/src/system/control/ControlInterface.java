package system.control;

import javax.swing.JTable;
import system.visao.CadastroAcademico;
import system.visao.CadastroProfessor1;
import system.visao.Interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import system.visao.CadastroFuncionario;

/**
 *
 * @author oliveira kiala
 */
public class ControlInterface implements ActionListener {

    private Interface frame3;
    private Object PainelPrincipal1;

    public ControlInterface(Interface frame3) {
        this.frame3 = frame3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ("academico".equalsIgnoreCase(ae.getActionCommand())) {
            CadastroAcademico tela1 = new CadastroAcademico();
            frame3.PainelPrincipal1.add(tela1);
            tela1.setVisible(true);
        }
        if ("professor".equalsIgnoreCase(ae.getActionCommand())) {
            CadastroProfessor1 tela2 = new CadastroProfessor1();
            frame3.PainelPrincipal1.add(tela2);
            tela2.setVisible(true);
        }
        if ("funcionario".equalsIgnoreCase(ae.getActionCommand())) {
            CadastroFuncionario tela3 = new CadastroFuncionario();
            frame3.PainelPrincipal1.add(tela3);
            tela3.setVisible(true);
        }

    }

}
