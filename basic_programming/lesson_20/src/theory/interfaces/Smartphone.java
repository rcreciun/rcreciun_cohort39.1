package theory.interfaces;

/**
 * Каждый интерфейс (Phone, Camera, MusicPlayer) определяет набор абстрактных методов, представляющих функциональность
 * соответствующего устройства.
 * <p>
 * Класс Smartphone реализует все эти интерфейсы, предоставляя конкретные реализации для
 * каждого метода. Это означает, что Smartphone обладает функциональностью телефона, камеры и музыкального плеера.
 * <p>
 * Реализация нескольких интерфейсов позволяет классу Smartphone быть гибким и многофункциональным, что характерно для
 * современных смартфонов.
 */
public class Smartphone implements Phone, Camera, MusicPlayer {
    private String model;
    private int ramSize; // Размер оперативной памяти в ГБ
    private double screenSize; // Размер экрана в дюймах

    /**
     * Конструктор для создания экземпляра смартфона.
     *
     * @param model Модель смартфона.
     * @param ramSize Размер оперативной памяти в ГБ.
     * @param screenSize Размер экрана в дюймах.
     */
    public Smartphone(String model, int ramSize, double screenSize) {
        this.model = model;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
    }

    @Override
    public void makeCall(String number) {
        System.out.println(model + ": Making a call to " + number);
    }

    @Override
    public void receiveCall(String caller) {
        System.out.println(model + ": Receiving a call from " + caller);
    }

    @Override
    public void takePhoto() {
        System.out.println(model + ": Taking a photo");
    }

    @Override
    public void recordVideo() {
        System.out.println(model + ": Recording video");
    }

    @Override
    public void playMusic(String track) {
        System.out.println(model + ": Playing music: " + track);
    }

    @Override
    public void stopMusic() {
        System.out.println(model + ": Music stopped");
    }

    // Дополнительные методы и свойства класса Smartphone
}
