package theory.coffe_machine;

import java.time.ZoneId;

public class Usage {
    public static void main(String[] args) {
        coffeeMachineUsage();
    }


    static void clockUsage() {
        Clock clock = new Clock(ZoneId.of("Europe/Berlin"));
        clock.showTime();

        // Меняем временную зону
        clock.setTimeZone(ZoneId.of("America/Chicago"));
        clock.showTime();

        ClockInterface justClock = new Clock(ZoneId.of("Europe/Paris"));
        ClockInterface clockOnCoffeeMachine = new CoffeeMakerMachine("Milele", "Asia/Tokyo");



    }

    static void potUsage () {
        TeaPot pot = new TeaPot(2.2, "SMEG");
        TeaPot bigPot = new TeaPot(15.0, "Siemens");
        TeaPot samePot = new TeaPot(15.0, "Siemens");
        TeaPot boschPot = new TeaPot(15.0, "Bosch");

        pot.boilWater(300);
        pot.boilWater(0);
        pot.boilWater(80);

        pot.showInfo();

        System.out.println(pot.toString());
        System.out.println(bigPot.toString());

        System.out.println("samePot == bigPot = " + (samePot == bigPot));
        System.out.println("samePot.equals(bigPot) = " + samePot.equals(bigPot));
        System.out.println("samePot.equals(samePot) = " + samePot.equals(samePot));
        System.out.println("bigPot.equals(boschPot) = " + bigPot.equals(boschPot));
    }

    static void coffeeMachineUsage() {
        CoffeeMakerMachine coffeeMakerMachine = new CoffeeMakerMachine("Bosch", "Europe/Berlin");

        coffeeMakerMachine.fillCoffeeMachineResources();

        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();
        coffeeMakerMachine.cookEspressoCoffee();

        coffeeMakerMachine.showTime();
    }
}
