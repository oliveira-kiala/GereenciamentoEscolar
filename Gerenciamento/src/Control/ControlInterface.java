
package Control;

import javax.swing.JTable;
import Visao.CadastroAcademico;
import Visao.CadastroProfessor1;
import Visao.Interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

         
    }

}
