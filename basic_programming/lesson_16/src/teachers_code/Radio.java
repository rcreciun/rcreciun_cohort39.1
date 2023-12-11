package teachers_code;

public class Radio {
    private int volume;
    private String currentStation;
    private boolean isOn;

    // Конструктор класса Radio
    public Radio() {
        this.volume = 0; // Начальный уровень громкости
        this.currentStation = "Не выбрана"; // Начальная радиостанция
        this.isOn = false; // Радио изначально выключено
    }

    // Метод для включения радио
    public void turnOn() {
        isOn = true;
        System.out.println("Радио включено.");
    }

    // Метод для выключения радио
    public void turnOff() {
        isOn = false;
        System.out.println("Радио выключено.");
    }

    // Метод для смены радиостанции
    public void changeStation(String station) {
        if (isOn) {
            currentStation = station;
            System.out.println("Переключено на станцию: " + station);
        } else {
            System.out.println("Радио выключено. Смена станции невозможна.");
        }
    }

    // Метод для регулировки громкости
    public void adjustVolume(int level) {
        if (isOn) {
            volume = level;
            System.out.println("Громкость установлена на уровень: " + level);
        } else {
            System.out.println("Радио выключено. Регулировка громкости невозможна.");
        }
    }

    // Геттеры и сеттеры
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}
