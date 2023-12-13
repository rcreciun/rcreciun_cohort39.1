package teachers_code;

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


    }
}
