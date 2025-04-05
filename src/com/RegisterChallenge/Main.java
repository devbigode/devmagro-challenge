package src.com.RegisterChallenge;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            /* 1. Buscar as perguntas no arquivo */

            /* Procura o arquivo */
            InputStream file = new FileInputStream("formulario.txt");
            System.out.println("Arquivo encontrado com sucesso.🆗\n");

            /* Ler o conteúdo do arquivo (linha por linha) */
            InputStreamReader reader = new InputStreamReader(file);
            BufferedReader br = new BufferedReader(reader);

            /* Acessa os valores lidos */
            List<String> questionsList = new ArrayList<>();

            for (String line = br.readLine(); line != null; line = br.readLine()) {
                if (!line.isBlank()){
                    questionsList.add(line);
                }
            }

            /* Exibe somente as perguntas */
            //questionsList.forEach(System.out::println);

            /* 2. Menu */

            int choice;

            do {
                System.out.println("1. Cadastrar um novo pet\n" +
                        "2. Alterar os dados do pet cadastrado\n" +
                        "3. Deletar um pet cadastrado\n" +
                        "4. Listar todos os pets cadastrados\n" +
                        "5. Listar pets por algum critério (idade, nome, raça)\n" +
                        "6. Sair\n");

                System.out.println("O que deseja fazer? (1 a 6)");

                choice = input.nextInt();

            } while (choice < 1 || choice > 6);



        } catch (FileNotFoundException fnfe){
            System.out.println("Arquivo não encontrado ou inexistente.❌" + fnfe);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }

    }
}
