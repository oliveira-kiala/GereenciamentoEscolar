package system.control;

import system.model.Login;
import system.visao.Interface;
import system.visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
 public void guardar(String mensagem, String arquivo) throws IOException {

        FileWriter fileWriter = new FileWriter(arquivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close();

    }
 public  String ler(String mensagem) throws IOException {
        FileReader fileReader = new FileReader(mensagem);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String linha = "";
        while (bufferedReader.ready()) {
            linha += bufferedReader.readLine();
            System.out.println(linha);
        }

        bufferedReader.close();
        return linha;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Login g = new Login();

        g.setUsuario1(frame2.usuario1.getText());
        g.setSenha1(frame2.senha1.getText());

         if ("login".equals(ae.getActionCommand())) {

            try {
                
              
                
                //if ("adm".equals(frame2.usuario1.getText()) && "1234".equals(frame2.senha1.getText())) {
                guardar(frame2.usuario1.getText(), "C:\\Users\\oliveira\\Desktop\\documentos\\login.txt");
                Interface tela = new Interface();
                tela.setVisible(true);
                frame2.dispose();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            } finally {

                JOptionPane.showMessageDialog(null, "final");

            }

        }

    }

}
