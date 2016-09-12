
package Control;

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

    public ControlInterface(Interface frame3) {
        this.frame3 = frame3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ("CadastoProfessor".equalsIgnoreCase(ae.getActionCommand())) {

            CadastroProfessor1 objeto = new CadastroProfessor1();
            //PainelPrincipal1.add(objeto);
            objeto.setVisible(true);

        }
    }

}
