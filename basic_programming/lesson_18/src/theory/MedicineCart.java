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

        // с учетом того, что при регистрации мы узнаем лишь одно значение - name,
        // все остальные поля будут проинициализированы значениями по умолчанию, что равносильно:
        // (не обязательно это писать)
        this.age = 0;
        this.gender = null;
        this.weight = 0.0;
        this.isPregnant = false;

    }

    // конструктор, который позволяет указать при регистрации только имя и возраст
    public MedicineCart(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // конструктор для анонимного использования нашего медицинского сервиса.
    // Для его использования необходимо указать пол и возраст. Тк это теже самые типы данных, что в конструкторе
    //  MedicineCart(String name, int age), единственное что остается - поменять эти ТИПЫ данных местами, то есть
    //  MedicineCart(String gender, int age) - ВЫЗОВЕТ ОШИБКУ!!!
    //  MedicineCart(int age, String gender) - будет корректно соседствовать с уже существующим конструктором,
    //  потому что с точки зрения JVM они разные: MedicineCart(String, int) != MedicineCart(int, String)


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
