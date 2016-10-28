/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import system.model.Funcionario;
import system.visao.CadastroFuncionario;

/**
 *
 * @author oliveira kiala
 */
public class ControlFuncionario implements ActionListener {

    private CadastroFuncionario frame3;

    public ControlFuncionario(CadastroFuncionario frame) {
        this.frame3 = frame;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent ae) {

        Funcionario a = new Funcionario();

        a.setNome(frame3.Textnome.getText());
        a.setCodigo(frame3.jTextCodigo.getText());
        a.setCargo(frame3.jTextCargo.getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame3.Textnome.setText("");
            frame3.jTextCodigo.setText("");
            frame3.jTextCargo.setText("");

        }

        if ("Cadastrar".equals(ae.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Nome :"+a.getNome() + "\n Codigo :" + a.getCodigo() + "\nCargo : " + a.getCargo());
            //JOptionPane.showMessageDialog(null, a.getNome() + ""
              //      + "\n" + a.getCodigo() + ""
                //    + "\n" + a.getCargo());
            
        }

    }

}
