package Exercicio;

import java.io.IOException;

public class PrincipalArquivo {

    public static void main(String[] args) throws IOException{
    String path = "C:\\Users\\11513288\\Desktop\\Projeto\\ArquivosNomes.txt";
    String path2 = "C:\\Users\\11513288\\Desktop\\Projeto\\SobreNomes.txt";
    String path3 = "C:\\Users\\11513288\\Desktop\\Projeto\\NomeSobrenome.txt";

    ManipuladorArquivo.leitor(path);
    ManipuladorArquivo.leitor(path2);
    ManipuladorArquivo.escritor(path3);


    }
    Writer arquivo = new BufferedWriter(new FileWriter("arquivo", true));
        arquivo.append("Mais conteudo");
        arquivo.close();

}
