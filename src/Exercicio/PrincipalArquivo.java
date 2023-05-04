package Exercicio;

import java.io.IOException;

public class PrincipalArquivo {

    public static void main(String[] args) throws IOException{
    String caminho1 = "C:\\Users\\11513288\\IdeaProjects\\Concatenacao\\src\\Projeto\\ArquivoNome.txt";
    String caminho2 = "C:\\Users\\11513288\\IdeaProjects\\Concatenacao\\src\\Projeto\\ArquivoSobrenome.txt";
    String caminho3 = "C:\\Users\\11513288\\IdeaProjects\\Concatenacao\\src\\Projeto\\NomeSobrenome.txt";

    ManipuladorArquivo.leitor(caminho1);
    ManipuladorArquivo.leitor(caminho2);
    ManipuladorArquivo.Sobrescreve(caminho1, caminho2, caminho3);

    }


}
