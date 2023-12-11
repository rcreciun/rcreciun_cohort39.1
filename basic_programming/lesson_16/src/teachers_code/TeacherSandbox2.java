package teachers_code;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        // создали объект 1
        Automobile vw =     new Automobile("white", "polo", 180);

        // создали объект 2, никак не влияет на объект 1
        Automobile toyota = new Automobile("red", "auris", 230);


        // создали объект 3, ссылка на который теперь хранитсья в переменной vw, то есть ссылку
        // на объект 1 теперь не хранит ни одна переменная
        vw = new Automobile("black", "passat", 279);


        // то есть, кажды раз, когда мы вызываем конструктор (new Automobile(...)) мы создаем новый объект в памяти джавы

        toyota.showInfo();
        vw.showInfo();

        System.out.println("\nпытаемся увеличить скорость для конкретного автомобиля vw");
        vw.accelerate(100);
        vw.showInfo();
        System.out.println("убедились, что для toyota ничего не изменилось:");
        toyota.showInfo();

        System.out.println("\nпытаемся увеличить скорость для конкретного автомобиля vw выше максимальной скорости");
        vw.accelerate(300);
        vw.showInfo();

        System.out.println("\nпытаемся сбросить скорость, но используем для этого объект toyota, вместо vw");
        toyota.decelerate(100);

        vw.showInfo();
        toyota.showInfo();
    }
}
