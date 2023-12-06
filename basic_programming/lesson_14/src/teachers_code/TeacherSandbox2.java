package teachers_code;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        String str = "hello";
        str.toUpperCase();
    }

    // public static Photo createPhoto(Camera camera) {
    //  сложня логика обработки изображения
    // формируется новый объект типа "Photo"
    // Photo myPhoto = new Photo();
    //      return myPhoto;
    //

    public static String createJavaConspect(String[] data) {
        String answer = "";

        for (int i = 0; i < data.length; i++) {
            if (data[i].contains("java")) {
                answer = data[i];
                break;
            }
        }

        return answer;
    }

    // from to

    public static double[] createStatement(String startOfPeriod, String endOfPeriod) {
        double[] statement = {};
        // .... слодная логика как заполнить этот массив statement

        // обязательный блок return
        return statement;
    }

    // НЕЛЕГАЛЬНАЯ СТРУКТУРА!!! можно указать лишь один тип данных в сигнатуре метода
    // если нам требуется вернуть несколько значений, то мы обязаны скомбинировать их в какую-то структуру данных,
    // например в массив
    /**
    public static int, String someMethod() {
        return 12, "sdfsd";
    }
     */

    // в примере ниже мы попытались решить проблему, когда метод возвращает более 1 переменной, для этого
    // воспользовались структурой данных - массивом
    // легально поступить так (используя структуры данных):
    public static String[] someMethod() {
        String[] result = {"hello", "true", "123"};

        //обязательный блок, который вернет переменную типа String[]
        return result;
    }
}
