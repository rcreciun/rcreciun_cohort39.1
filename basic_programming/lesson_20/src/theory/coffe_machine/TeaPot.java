package theory.coffe_machine;

public class TeaPot {

    //  температура до которой будет разогревать содержимое чайник,
    //  не поднимая ее выше. Нпример надо разогреть детское питание до 40 С
    // или вскипятить воду для зеленого чая - ±90 С
    private int temperature;

    // объем чайника
    private double volume;

    // производитель
    private String manufacturer;

    private static final int ROOM_TEMPERATURE = 20;
    private static final int MAX_TEMPERATURE = 130;


    //тк температура может изменяться в ходе работы чайника,
    // мы не будем требовать указать ее в конструкторе,
    // но для корректного функционирования обязательно знать объем чайника
    public TeaPot(double volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;

        // по умолчанию задали комнатную температуру:
        this.temperature = ROOM_TEMPERATURE;
    }

    // метод для кипячения воды, принимает значение до которой надо разогреть воду в чайнике.
    // Но есть определенные ограничения - чайник не может принять температуру ниже комнатной,
    // тк чайник не может остудить воду и чайник не может принять значение выше 130 С,
    // тк это предел до которого в этом чайнике можно разогреть воду.
    // по сути, метод boilWater - аналог метода setTemperature
    public void boilWater(int targetTemperature) {
        if (targetTemperature < ROOM_TEMPERATURE) {
            System.out.println("Температура ниже комнатной, чайник не в состоянии охлаждать жидкости");
        } else if (targetTemperature > MAX_TEMPERATURE) {
            System.out.println("Температура выше максимально допустимой, максимальная допустимая температура - 130 С");
        }

        this.temperature = targetTemperature;
    }

    // тк абсолютно не логично изменение объема чайника, то метод setVolume - отсутствует,
    // но при этом есть метод, который нам скажет объем чайника:
    public double getVolume() {
        return this.volume;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void showInfo() {
        System.out.printf("Чайник объемом %.2f, произведенный %s в данный момент поддерживает температуру %d\n",
                this.volume, this.manufacturer, this.temperature);
    }

    @Override
    public String toString() {
        String answer = "Чайник объемом " + this.volume +
                ", произвденный " + this.manufacturer + " в данный момент поддерживает температуру " + this.temperature;

        return answer;
    }


    //samePot.equals(bigPot)
    // this - это "samePot" и все его поля
    // obj - это "bigPot".
    // Но так как мы наследуемя от класса Object, мы не можем в аргументах сразу указать,
    // что к нам приходит искючительно тип данных TeaPot, тк данный метод определен в оригинальном классе по-другому
    // и мы не можем изменять сигнатуру метода: "boolean equals(Object obj)" (не можем изменить тип возвращаемого
    // значения) и аргументы.
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof TeaPot)) {
            return false;
        }

        TeaPot pot = (TeaPot) obj;

        if (this.volume == pot.volume) {
            if (this.manufacturer.equals(pot.manufacturer)) {
                System.out.println("чайники одинаковые по совокупности признаков - объем и производитель");
                return true;
            } else {
                System.out.println("У чайников разный производитель");
                return false;
            }
        } else {
            System.out.println("У чайников разный объем");
            return false;
        }

        // return (this.volume == pot.volume) && (this.manufacturer.equals(pot.manufacturer));
        // return (this.volume == ((TeaPot) obj).volume) && (this.manufacturer.equals(((TeaPot) obj).manufacturer));
    }
}
