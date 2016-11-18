package system.control;

import system.model.Professor;
import system.visao.CadastroProfessor1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlProfessor implements ActionListener {

    private CadastroProfessor1 frame = null;
    Professor p = new Professor();

    public ControlProfessor(CadastroProfessor1 frame) {
        this.frame = frame;
    }

    public void ObrigarCampos() {
        if (frame.Textnome.getText().length() > 0 && frame.jTextEmail.getText().length() > 0 && frame.codigo.getText().length() > 0
                && frame.CEP.getText().length() > 0 && frame.Cidade.getText().length() > 0 && frame.jTextBairro.getText().length() > 0
                && frame.CEP.getText().length() > 0 && frame.CEP.getText().length() > 0 && frame.TextRG.getText().length() > 0 && frame.jTextTelef.getText().length() > 0) {
            JOptionPane.showMessageDialog(null, p.getNome() + ""
                    + "\n" + p.getNome() + ""
                    + "\n" + p.getEmail() + ""
                    + "\n" + p.getCodigo() + ""
                    + "\n" + p.getEndereco() + ""
                    + "\n" + p.getCidade() + ""
                    + "\n" + p.getBairro() + ""
                    + "\n" + p.getCpf() + ""
                    + "\n" + p.getCep() + ""
                    + "\n" + p.getRg() + ""
                    + "\n" + p.getTitulo() + ""
                    + "\n" + p.getEstado() + ""
                    + "\n" + p.getTelef() + ""
                    + "\n" + p.getDiscipl());
        } else {
            JOptionPane.showMessageDialog(null, "Todos Os capos são Obrigatorio");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //salvar
        //excluir
        //localizar

        p.setNome(frame.Textnome.getText());
        p.setEmail(frame.jTextEmail.getText());
        p.setCodigo(frame.codigo.getText());
        p.setEndereco(frame.CEP.getText());
        p.setCidade(frame.Cidade.getText());
        p.setBairro(frame.jTextBairro.getText());
        p.setCpf(frame.TextCPF.getText());
        p.setCep(frame.CEP.getText());
        p.setRg(frame.TextRG.getText());
        p.setTitulo((String) frame.TextTitulo.getSelectedItem());
        p.setEstado((String) frame.Estado.getSelectedItem());
        p.setDiscipl((String) frame.TextDisciplina.getSelectedItem());
        p.setSexo((String) frame.sexo_sexo.getSelectedItem());
        p.setTelef(frame.jTextTelef.getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame.Textnome.setText("");
            frame.jTextEmail.setText("");
            frame.codigo.setText("");
            frame.CEP.setText("");
            frame.Cidade.setText("");
            frame.jTextBairro.setText("");
            frame.TextCPF.setText("");
            frame.CEP.setText("");
            frame.TextRG.setText("");
            frame.jTextTelef.setText("");

        }

        if ("Cadastrar".equals(ae.getActionCommand())) {
            ObrigarCampos();
        }

    }
}
