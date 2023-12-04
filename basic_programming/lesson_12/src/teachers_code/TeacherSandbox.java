package teachers_code;

public class TeacherSandbox {
    public static void main(String[] args) {
        // args[0] - основа для теста
        // args[1] - мясная начинка
        // args[2] - соус
        // args[3] - сыр

        if (args.length != 4) {
            System.err.println("incorrect length of array args!");
            return;
        }

        System.out.printf(
                "Ваша пицца будет на основе %s, с начинкой из %s, соусом %s и сыром %s. Приятного аппетита!\n",
                args[0], args[1], args[2], args[3]);
    }
}
