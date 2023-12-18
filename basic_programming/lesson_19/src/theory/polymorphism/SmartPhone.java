package theory.polymorphism;

public class SmartPhone extends SmartDevice {
    private int cameraResolution;

    public SmartPhone(int cameraResolution) {
        super();
        this.cameraResolution = cameraResolution;
    }

    public void takePhoto() {
        if (cameraResolution > 0) {
            System.out.println("Taking a photo with resolution: " + cameraResolution + " megapixels.");
        }
    }

    // ... Дополнительные уникальные методы и свойства ...
}