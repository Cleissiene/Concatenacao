package Exercicio;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException {
        //String path = "C:\Users\11513288\Desktop\Projeto\ArquivosNomes.txt";

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }


    public static void escritor(String path) throws IOException {
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path));
        String linha = " ";
        Scanner in = new Scanner((System.in));
        System.out.println("\nUna nome e sobrenome: ");
        linha = in.nextLine();
        buffWriter.append(linha + "\n");
        buffWriter.close();
    }

    public static void Sobrescreve(String caminho1, String caminho2, String caminho3) throws IOException {

        BufferedReader nome = new BufferedReader(new FileReader(caminho1));
        BufferedReader sobrenome = new BufferedReader(new FileReader(caminho2));
        BufferedWriter nomeSobrenome = new BufferedWriter(new FileWriter(caminho3));

        String linhaNome, linhaSobrenome;

        while ((linhaNome = nome.readLine()) != null && (linhaSobrenome = sobrenome.readLine()) != null) {
            nomeSobrenome.write(linhaNome + " " + linhaSobrenome + "\n");

        }

        nome.close();
        sobrenome.close();
        nomeSobrenome.close();


    }
}