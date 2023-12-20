package theory.coffe_machine;

public class CoffeeMakerMachine {
    // производитель
    private String manufacturer;

    // значения в процентах кофе, вода и молоко
    private int coffeeBeansPercent;
    private int waterLevelPercent;
    private int milkLevelPercent;

    public CoffeeMakerMachine(String manufacturer) {
        this.manufacturer = manufacturer;
        // мы обязаны проинициализировать не статичные поля, следовательно:
        this.coffeeBeansPercent = 0;
        this.waterLevelPercent = 0;
        this.milkLevelPercent = 0;
    }

    // для упрощения логики, заполнение всех необходимых ресурсов до максимума производится в методе ниже:
    public void fillCoffeeMachineResources() {
        this.coffeeBeansPercent = 100;
        this.waterLevelPercent = 100;
        this.milkLevelPercent = 100;
    }

    public void cookAmericanoCoffee() {
        if (coffeeBeansPercent <  10) {
            System.out.println("недостаточно кофейного зерна");
            return;
        }

        if (waterLevelPercent < 15) {
            System.out.println("недостаточно воды");
            return;
        }

        this.coffeeBeansPercent -= 10;
        this.waterLevelPercent -= 15;
        System.out.println("ваш американо готов");
    }

    public void cookLatteCoffee() {
        if (coffeeBeansPercent <  15) {
            System.out.println("недостаточно кофейного зерна");
            return;
        }

        if (waterLevelPercent < 10) {
            System.out.println("недостаточно воды");
            return;
        }

        if (milkLevelPercent < 10) {
            System.out.println("недостаточно молока");
            return;
        }

        this.coffeeBeansPercent -= 10;
        this.waterLevelPercent -= 10;
        this.milkLevelPercent -= 10;

        System.out.println("ваш латте готов");

    }

    public void cookEspressoCoffee() {
        if (coffeeBeansPercent <  20) {
            System.out.println("недостаточно кофейного зерна");
            return;
        }

        if (waterLevelPercent < 7) {
            System.out.println("недостаточно воды");
            return;
        }

        this.coffeeBeansPercent -= 20;
        this.waterLevelPercent -= 7;

        System.out.println("ваш эспрессо готов");
    }
}
