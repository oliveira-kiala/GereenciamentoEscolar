
package system.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class funcoes {

    public void guardar(String mensagem, String arquivo) throws IOException,StringIndexOutOfBoundsException{

        FileWriter fileWriter = new FileWriter(arquivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\r\n";
        bufferedWriter.write(msg);
        bufferedWriter.flush();
        bufferedWriter.close();

    }
    public static String ler(String mensagem) throws IOException {
        FileReader fileReader = new FileReader(mensagem);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = "";
        while (bufferedReader.ready()) {
            linha += bufferedReader.readLine();
           
        }

        bufferedReader.close();
        return linha;
    }
  }


