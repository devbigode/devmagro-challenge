package src.com.RegisterChallenge;

import java.io.*;
import java.security.Permission;
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

            while (true){
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

                input.nextLine();

                if (choice == 6){
                    break;
                }

                if (choice == 1){
                    Pet pet = new Pet();

                    System.out.println(questionsList.getFirst()); // #1
                    pet.setName(input.nextLine());
                    pet.setLastName(input.nextLine());

                    System.out.println(questionsList.get(1)); // #2

                    String typePet = input.nextLine();

                    if (typePet.equalsIgnoreCase("Cachorro")){
                        pet.setType(Type.DOG);
                    }

                    if (typePet.equalsIgnoreCase("Gato")){
                        pet.setType(Type.CAT);
                    }

                    System.out.println(questionsList.get(2)); // #3

                    String sexPet = input.nextLine();

                    if (sexPet.equalsIgnoreCase("Macho")){
                        pet.setSex(Sex.MALE);
                    }

                    if (sexPet.equalsIgnoreCase("Fêmea")){
                        pet.setSex(Sex.FEMALE);
                    }

                    System.out.println(questionsList.get(3)); // #4

                    System.out.print("    - Número da casa: ");
                    int number = input.nextInt();
                    input.nextLine();
                    pet.setNumber(number);

                    System.out.print("    - Cidade: ");
                    String city = input.nextLine();
                    pet.setCity(city);

                    System.out.print("    - Rua: ");
                    String street = input.nextLine();
                    pet.setStreet(street);

                    System.out.println(questionsList.get(4)); // #5
                    pet.setAge(input.nextDouble());

                    System.out.println(questionsList.get(5)); // #6
                    pet.setWeight(input.nextDouble());
                    input.nextLine();

                    System.out.println(questionsList.get(6)); // #7
                    pet.setBreed(input.nextLine());

                    System.out.println(pet);

                }
            }

        } catch (FileNotFoundException fnfe){
            System.out.println("Arquivo não encontrado ou inexistente.❌" + fnfe);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }

    }
}
