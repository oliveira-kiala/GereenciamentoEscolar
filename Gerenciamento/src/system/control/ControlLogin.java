package system.control;

import system.model.Login;
import system.visao.Interface;
import system.visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author oliveira kiala
 */
public class ControlLogin implements ActionListener {

    private TelaLogin frame2;

    funcoes func = new funcoes();

    public ControlLogin(TelaLogin frame2) {
        this.frame2 = frame2;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Login g = new Login();

        g.setUsuario1(frame2.usuario1.getText());
        g.setSenha1(frame2.senha1.getText());

        if ("login".equals(ae.getActionCommand())) {

            try {

                if ("1234".equals(frame2.senha1.getText())) {
                    func.guardar(frame2.usuario1.getText(), "C:\\Users\\Paulo\\Documents\\TRAB\\login.txt");
                    Interface tela = new Interface();
                    tela.setVisible(true);
                    frame2.dispose();

                    JOptionPane.showMessageDialog(null, "Usuario logado");

                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }

        }

    }

}
