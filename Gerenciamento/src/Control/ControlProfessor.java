/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Professor;
import Visao.CadastroProfessor1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlProfessor implements ActionListener {

    private CadastroProfessor1 frame;

    public ControlProfessor(CadastroProfessor1 frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //salvar
        //excluir
        //localizar

        Professor p = new Professor();

        p.setNome(frame.Textnome.getText());
        p.setEmail(frame.jTextEmail.getText());
        p.setCodigo(frame.codigo.getText());
        p.setEndereco(frame.jTextEndereco.getText());
        p.setCidade(frame.Cidade.getText());
        p.setBairro(frame.jTextBairro.getText());
        p.setCpf(frame.TextCPF.getText());
        p.setCep(frame.CEP.getText());
        p.setRg(frame.TextRG.getText());
        //p.setTitulo(frame.TextTitulo.getText());
        p.setMasculino(frame.jRadioMasculino.getText());
        p.setFemenino(frame.jRadioFemenino.getText());
        //p.setEstado(frame.Estado.getText());
        p.setTelef(frame.jTextTelef.getText());
        //p.setEstado(frame. TextDisciplina .getText());

        if ("Limpar".equalsIgnoreCase(ae.getActionCommand())) {
            frame.Textnome.setText("");
            frame.jTextEmail.setText("");
            frame.codigo.setText("");
            frame.jTextEndereco.setText("");
            frame.Cidade.setText("");
            frame.jTextBairro.setText("");
            frame.TextCPF.setText("");
            frame.CEP.setText("");
            frame.TextRG.setText("");
            // frame.TextTitulo.setText("");
            frame.jRadioMasculino.setText("");
            frame.jRadioFemenino.setText("");
            //  frame.Estado.setText("");
            frame.jTextTelef.setText("");
           // frame.TextDisciplina.setText("");

        }

        if ("Cadastrar".equals(ae.getActionCommand())) {

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
                    + "\n" + p.getMasculino() + ""
                    + "\n" + p.getFemenino() + ""
                    + "\n" + p.getEstado() + ""
                    + "\n" + p.getTelef() + ""
                    + "\n" + p.getDiscipl());
        }

    }
}
