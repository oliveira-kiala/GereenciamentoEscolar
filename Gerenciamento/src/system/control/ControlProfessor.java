/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.control;

import system.model.Professor;
import system.visao.CadastroProfessor1;
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
        p.setTitulo((String) frame.TextTitulo.getSelectedItem());
        p.setEstado((String) frame.Estado.getSelectedItem());
        p.setDiscipl((String) frame.TextDisciplina.getSelectedItem());
        p.setSexo((String) frame.sexo_sexo.getSelectedItem());
        p.setTelef(frame.jTextTelef.getText());
        
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
            frame.jTextTelef.setText("");
            //frame.TextTitulo.setText("");
            //frame.Estado.setText("");
           //frame.TextDisciplina.setText("");

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
                    + "\n" + p.getEstado() + ""
                    + "\n" + p.getTelef() + ""
                    + "\n" + p.getDiscipl());
        }

    }
}
