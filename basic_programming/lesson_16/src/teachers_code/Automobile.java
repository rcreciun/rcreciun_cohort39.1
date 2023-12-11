package teachers_code;

public class Automobile {
    private String color;
    private String brand;
    private int currentSpeed;
    private int maxSpeed;

    // Конструктор класса Automobile
    public Automobile(String color, String brand, int maxSpeed) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0; // Начальная скорость равна 0
    }

    // Метод для ускорения автомобиля
    public void accelerate(int speed) {
        currentSpeed += speed;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    // Метод для замедления автомобиля
    public void decelerate(int speed) {
        currentSpeed -= speed;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    // Метод для отображения информации об автомобиле
    public void showInfo() {
        System.out.println("Автомобиль марки " + brand + ", цвет: " + color + ", текущая скорость: " + currentSpeed +
                " км/ч, максимальная скорость: " + maxSpeed + " км/ч.");
    }


    // Геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

