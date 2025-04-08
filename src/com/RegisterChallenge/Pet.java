package src.com.RegisterChallenge;

public class Pet extends Address{

    private String name;
    private String lastName;
    private double age;
    private double weight;
    private String breed;
    private Type type;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
