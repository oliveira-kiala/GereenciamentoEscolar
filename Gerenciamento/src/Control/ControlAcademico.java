/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Academico;
import Visao.CadastroAcademico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author oliveira kiala
 */
public class ControlAcademico implements ActionListener {

    private CadastroAcademico frame1;

    public ControlAcademico(CadastroAcademico frame) {
        this.frame1 = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Academico a = new Academico();

        a.setNome(frame1.Textnome.getText());
        a.setCurso(frame1.Textcurso.getText());
        a.setSerie(Integer.parseInt(frame1.Textserie.getText()));
        a.setGrau(Integer.parseInt(frame1.Textgrau.getText()));
        a.setRg(frame1.TextRG.getText());
        a.setNum_Matric(Integer.parseInt(frame1.Textmatricula.getText()));
        a.setTelef(frame1.Texttelefone.getText());
        a.setData_Nasc(frame1.Textnascimento.getText());
        a.setSexo(frame1.Textsexo.getText());
        a.setCep(frame1.TextCEP.getText());
        a.setCidade(frame1.Textcidade.getText());
        a.setEstado(frame1.Textestado.getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame1.Textnome.setText("");
            frame1.Textcurso.setText("");
            frame1.Textserie.setText("");
            frame1.Textgrau.setText("");
            frame1.TextRG.setText("");
            frame1.Textmatricula.setText("");
            frame1.Texttelefone.setText("");
            frame1.Textnascimento.setText("");
            frame1.Textsexo.setText("");
            frame1.TextCEP.setText("");
            frame1.Textcidade.setText("");
            frame1.Textestado.setText("");
        }

        if ("Cadastrar".equals(ae.getActionCommand())) {

            JOptionPane.showMessageDialog(null, a.getNome() + ""
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
                    + "\n" + a.getEstado() + "");

        }

    }
}
