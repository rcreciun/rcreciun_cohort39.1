package theory;

// медицинское приложение, которое собирает анамнез пациента
public class MedicineCart {
    // возраст
    private int age;
    // вес, в кг
    private double weight;
    // имя пациента
    private String name;
    // пол пациента
    private String gender;
    // беременный ли пациент или нет
    private boolean isPregnant;

    // конструктор, который позволяет указать при регистрации только имя

    public MedicineCart(String name) {
        this.name = name;
    }

    // конструктор, который позволяет указать при регистрации только имя и возраст
    public MedicineCart(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // конструктор, который позволяет заполнить сразу все данные
    public MedicineCart(int age, double weight, String name, String gender, boolean isPregnant) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.isPregnant = isPregnant;
    }

    // геттеры и сеттеры реализованы так,
    // тк пока не требуется проверять логичность доступа к полям
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }
}
