package system.control;

import system.model.Academico;
import system.visao.CadastroAcademico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlAcademico implements ActionListener {

    private CadastroAcademico frame1;
    Academico a = new Academico();

    public ControlAcademico(CadastroAcademico frame) {
        this.frame1 = frame;
    }

    public void ObrigarCampos() {
        if (frame1.Textnome.getText().length() > 0 && frame1.jTextemail.getText().length() > 0
                && frame1.Textcurso.getText().length() > 0 && frame1.Textserie.getText().length() > 0
                && frame1.jTextGrau.getText().length() > 0 
                && frame1.TextRG.getText().length() > 0 && frame1.Textmatricula.getText().length() > 0
                && frame1.Texttelefone.getText().length() > 0 && frame1.Textnascimento.getText().length() > 0
                && frame1.TextCEP.getText().length() > 0 && frame1.Textcidade.getText().length() > 0) {
            JOptionPane.showMessageDialog(null, a.getNome() + ""
                    + "\n" + a.getEmail()
                    + "\n" + a.getCurso() + ""
                    + "\n" + a.getSerie() + ""
                    + "\n" + a.getGrau() + ""
                    + "\n" + a.getRg() + ""
                    + "\n" + a.getNum_Matric() + ""
                    + "\n" + a.getTelef() + ""
                    + "\n" + a.getData_Nasc() + ""
                    + "\n" + a.getSexo() + ""
                    + "\n" + a.getCep() + ""
                    + "\n" + a.getCidade() + ""
                    + "\n" + a.getEstado());

        } else {
            JOptionPane.showMessageDialog(null, "Todos Os capos são Obrigatorio");
        }
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent ae) {

        a.setNome(frame1.Textnome.getText());
        a.setEmail(frame1.jTextemail.getText());
        a.setCurso(frame1.Textcurso.getText());
        a.setSerie(frame1.Textserie.getText());
        a.setGrau(frame1.Textgrau.getText());
        a.setRg(frame1.TextRG.getText());
        a.setNum_Matric(frame1.Textmatricula.getText());
        a.setTelef(frame1.Texttelefone.getText());
        a.setCep(frame1.TextCEP.getText());
        a.setCidade(frame1.Textcidade.getText());
        a.setSexo((String) frame1.sexo_sexo.getSelectedItem());
        a.setEstado((String) frame1.jComboEstado.getSelectedItem());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame1.Textnome.setText("");
            frame1.jTextemail.setText("");
            frame1.Textcurso.setText("");
            frame1.Textserie.setText("");
            frame1.Textgrau.setText("");
            frame1.TextRG.setText("");
            frame1.Textmatricula.setText("");
            frame1.Texttelefone.setText("");
            frame1.Textnascimento.setText("");
            frame1.TextCEP.setText("");
            frame1.Textcidade.setText("");
        }

        if ("Cadastrar".equals(ae.getActionCommand())) {
            ObrigarCampos();

        }

    }
}
