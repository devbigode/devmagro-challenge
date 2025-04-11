package src.com.RegisterChallenge.functions;

import java.io.*;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import src.com.RegisterChallenge.*;

public class Function {
    public static Pet registerPet(List<String> questionsList){
        Scanner input = new Scanner(System.in);
        Pet petObj = new Pet();

        System.out.println(questionsList.getFirst()); // #1
        petObj.setName(input.nextLine());
        petObj.setLastName(input.nextLine());

        System.out.println(questionsList.get(1)); // #2

        String typePet = input.nextLine();

        if (typePet.equalsIgnoreCase("Cachorro")){
            petObj.setType(Type.DOG);
        }

        if (typePet.equalsIgnoreCase("Gato")){
            petObj.setType(Type.CAT);
        }

        System.out.println(questionsList.get(2)); // #3

        String sexPet = input.nextLine();

        if (sexPet.equalsIgnoreCase("Macho")){
            petObj.setSex(Sex.MALE);
        }

        if (sexPet.equalsIgnoreCase("Fêmea")){
            petObj.setSex(Sex.FEMALE);
        }

        System.out.println(questionsList.get(3)); // #4

        System.out.print("    - Número da casa: ");
        String number = input.nextLine();
        petObj.setNumber(number);

        System.out.print("    - Cidade: ");
        String city = input.nextLine();
        petObj.setCity(city);

        System.out.print("    - Rua: ");
        String street = input.nextLine();
        petObj.setStreet(street);

        System.out.println(questionsList.get(4)); // #5
        petObj.setAge(input.nextLine());

        System.out.println(questionsList.get(5)); // #6
        petObj.setWeight(input.nextDouble());
        input.nextLine();

        System.out.println(questionsList.get(6)); // #7
        petObj.setBreed(input.nextLine());

        return petObj;
    }

    public static void toFile(Pet petObj){
        Calendar c = Calendar.getInstance();

        String dateInFile = (c.get(Calendar.YEAR)
                + "" + c.get(Calendar.MONTH)
                + c.get(Calendar.DAY_OF_MONTH)
                + "T" + c.get(Calendar.HOUR)
                + c.get(Calendar.MINUTE) + "-");

        File file = new File("C:\\Users\\sescp\\Desktop\\devmagro-challenge\\petsCadastrados\\"
                + dateInFile
                + petObj.getName().toUpperCase()
                + petObj.getLastName().toUpperCase()
                + ".txt");

        try {
            boolean boolFile = file.createNewFile();
            System.out.println("Arquivo criado com sucesso!🆗");

            PrintWriter printWriter = new PrintWriter(file);

            printWriter.println("1 - " + petObj.getName() + " " + petObj.getLastName());
            printWriter.println("2 - " + petObj.getType());
            printWriter.println("3 - " + petObj.getSex());
            printWriter.println("4 - " + petObj.getStreet()
                    + ", " + petObj.getNumber()
                    + ", " + petObj.getCity());
            printWriter.println("5 - " + petObj.getAge() + " anos");
            printWriter.println("6 - " + petObj.getWeight() + " kg");
            printWriter.println("7 - " + petObj.getBreed());

            printWriter.close();

        } catch (IOException ioe) {
            throw new RuntimeException("Erro ao criar o arquivo.❌" + ioe);
        }
    }
}
