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

    public MedicineCart(String name) {
        this.name = name;
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
