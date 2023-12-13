package teachers_code;

public class PassportOfSomeCountry {
    private String dateOfBirth;
    private String name;
    private long number;

    // доступно из всех точек приложения. Из других директорий тоже
    public static String date = "13 dec 2023";

    // доступно только в тойже директории, а также наследникам данного класса (урок 18)
    protected static String citizenship = "general citizenship";

    // если модификатора доступа нет, то это означает, что данный участок кода имеет модификатор
    // default (package-private). По большей части, одинаков с protected
    // доступно только из тойже директории. Даже если вызывать данное поле/метод из вложенной папки или папки
    // выше по уровню, то доступа не будет
    static String countryName = "country";
}
