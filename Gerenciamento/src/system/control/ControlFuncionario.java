package system.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import system.model.Funcionario;
import system.visao.CadastroFuncionario;

public class ControlFuncionario implements ActionListener {

    private CadastroFuncionario frame3;
    private Object JoptionPane;
    
    Validacao val = new Validacao();
    
    Funcionario a = new Funcionario();

    public ControlFuncionario(CadastroFuncionario frame) {
        this.frame3 = frame;
    }

    void ObrigarCampos() {

        if (frame3.Textnome.getText().length() > 0 && frame3.jTextCargo.getText().length() > 0 && frame3.jTextCodigo.getText().length() > 0) {
            JOptionPane.showMessageDialog(null, "Nome :" + a.getNome() + "\n Codigo :" + a.getCodigo() + "\nCargo : " + a.getCargo());
        } else {
            JOptionPane.showMessageDialog(null, "Todos Os capos são Obrigatorio");

        }
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent ae) {

        a.setNome(frame3.Textnome.getText());
        a.setCodigo(frame3.jTextCodigo.getText());
        a.setCargo(frame3.jTextCargo.getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame3.Textnome.setText("");
            frame3.jTextCodigo.setText("");
            frame3.jTextCargo.setText("");

        }

        if ("Cadastrar".equals(ae.getActionCommand())) {
            ObrigarCampos();
        }
    }
}
