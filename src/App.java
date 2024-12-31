import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaradas as variaveis referentes aos caminhos de entrada e saida de dados
        String path = "/Users/vitoramaral/Java/Arquivos/dados.csv";
        String outputPath = "/Users/vitoramaral/Java/Arquivos/saida.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            String line; // Variavel usada para armazenar temporariamente a linha atual que está sendo
                         // processada.
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                // Criar uma nova instância de Produto
                Produto prod = new Produto(nome, preco, quantidade);
                System.out.println(prod);

                // Escrita no arquivo de saida de dados
                bw.write(prod.toString());
                bw.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
