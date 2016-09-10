/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Professor;
import Visao.CadastroProfessor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlProfessor implements ActionListener {

    private CadastroProfessor frame;

    public ControlProfessor(CadastroProfessor frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //salvar
        //excluir
        //localizar

        Professor p = new Professor();

        p.setNome(frame.Textnome.getText());
        p.setTitulo(frame.TextTitulo.getText());
        p.setNumMatricula(frame.matricula.getText());
        p.setCpf(frame.TextCPF.getText());
        p.setRg(frame.TextRG.getText());
        p.setDiscipl(frame.TextDisciplina.getText());
        p.setCep(frame.CEP.getText());
        p.setCidade_Munic(frame.CidadeMunic.getText());
        p.setEstado(frame.Estado.getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame.Textnome.setText("");
            frame.TextTitulo.setText("");
            frame.matricula.setText("");
            frame.TextCPF.setText("");
            frame.TextRG.setText("");
            frame.TextDisciplina.setText("");
            frame.CEP.setText("");
            frame.CidadeMunic.setText("");
            frame.Estado.setText("");
        }

        if ("Cadastrar".equals(ae.getActionCommand())) {

            JOptionPane.showMessageDialog(null, p.getNome() + ""
                    + "\n" + p.getTitulo() + ""
                    + "\n" + p.getNumMatricula() + ""
                    + "\n" + p.getCpf() + ""
                    + "\n" + p.getRg() + ""
                    + "\n" + p.getDiscipl() + ""
                    + "\n" + p.getCep() + ""
                    + "\n" + p.getCidade_Munic() + ""
                    + "\n" + p.getEstado());
        }

    }
}
