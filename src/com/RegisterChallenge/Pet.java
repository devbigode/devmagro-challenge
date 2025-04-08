package src.com.RegisterChallenge;

import java.util.InputMismatchException;

public class Pet extends Address{

    private String name;
    private String lastName;
    private String age;
    private double weight;
    private String breed;
    private Type type;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()){
            throw new RuntimeException("O nome não foi preenchido.");
        }

        String nameModify = name.replaceAll("[^a-zA-Z]", "");

        if (nameModify.isEmpty()){
            throw new InputMismatchException("Não é permitido o uso de caracteres especiais.");
        }

        this.name = nameModify;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isBlank()){
            throw new RuntimeException("O sobrenome não foi preenchido.");
        }

        String lastNameModify = lastName.replaceAll("[^a-zA-Z]", "");

        if (lastNameModify.isEmpty()){
            throw new InputMismatchException("Não é permitido o uso de caracteres especiais.");
        }

        this.lastName = lastNameModify;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        age = age.replaceAll("[^0-9,.]", "").replace(",", ".");
        double ageModify = Double.parseDouble(age);

        if (ageModify > 240){
            throw new RuntimeException("A idade informada é muito alta.");
        }

        if (ageModify < 12){
            double ageDouble = ageModify / 12;
            this.age = String.valueOf(ageDouble);
        } else{
            this.age = String.valueOf(ageModify);
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0.5 || weight > 60){
            throw new RuntimeException("O peso informado está fora da normalidade.");
        }

        this.weight = weight;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed) {
        String breedModify = breed.replaceAll("[^a-zA-Z]", "");

        if (breedModify.isEmpty()){
            throw new InputMismatchException("Não é permitido o uso de caracteres especiais.");
        }

        this.breed = breedModify;
    }

    public Type getType() {

        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", type=" + type +
                ", sex=" + sex +
                ", number=" + getNumber() +
                ", city='" + getCity() + '\'' +
                ", street='" + getStreet() + '\'' +
                '}';
    }
}
