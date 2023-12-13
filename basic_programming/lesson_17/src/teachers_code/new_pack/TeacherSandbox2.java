package teachers_code.new_pack;

import teachers_code.Gym;
import teachers_code.PassportOfSomeCountry;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        Gym ilyas = new Gym("Ilyas GymPass", "green towel");
        Gym maksym = new Gym("Maksym GymPass", "red towel");

        System.out.println("ilyas.getMemberName() = " + ilyas.getMemberName());
        System.out.println("ilyas.getColorOfTowel() = " + ilyas.getColorOfTowel());

        System.out.println("maksym.getColorOfTowel() = " + maksym.getColorOfTowel());
        System.out.println("maksym.getMemberName() = " + maksym.getMemberName());

        // я могу так сделать только потому что данный метод статичный.
        // Тк эти значения в любом случае общие для всего класса, у меня нет потребности создавать экземпляр класса
        System.out.println("Gym.getOpenTime() = " + Gym.getOpenTime());
        System.out.println("Gym.getWeight() = " + Gym.getWeight());

        System.out.println("ilyas.getOpenTime() = " + ilyas.getOpenTime());

        ilyas.memberName = "sdvfsvs";

        System.out.println("ilyas.getMemberName() = " + ilyas.getMemberName());
        // тк поле memberName имеет модификатор доступа public, смысл в в геттерах и стеттерах отпадает,
        // тк мы свободно можем мнеять значение это переменной, как в обычной переменной.
        System.out.println("ilyas.memberName = " + ilyas.memberName);

        // данная строка закоментированна, тк приводит к ошибке.
        // я пытаюсь вызвать не статичный метод у целого класса,
        // то есть это буквально означает: "скажи мне имя пользователя",
        // если бы я прибежал в тренажерный зал и спрашивал на ресепшене

        // System.out.println("Gym.getMemberName() = " + Gym.getMemberName());

    }
}
