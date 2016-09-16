package Control;

import Model.Login;
import Visao.Interface;
import Visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author oliveira kiala
 */
public class ControlLogin implements ActionListener {

    private TelaLogin frame2;

    public ControlLogin(TelaLogin frame2) {
        this.frame2 = frame2;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Login g = new Login();

        g.setUsuario1(frame2.usuario1.getText());
        g.setSenha1(frame2.senha1.getText());

        if ("login".equals(ae.getActionCommand())) {
            if ("adm".equals(frame2.usuario1.getText()) && "1234".equals(frame2.senha1.getText())) {
                Interface tela = new Interface();
                tela.setVisible(true);
                frame2.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }
            //JOptionPane.showMessageDialog(null, g.getUsuario1() + ""
                //    + "\n" + g.getSenha1() + "");

        }

    }

}
