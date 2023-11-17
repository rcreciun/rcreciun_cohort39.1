public class LogicalOperationsPractice {

    public static void main(String[] args) {

        // Задача 1: Использование оператора НЕ (!)
        boolean isRainy = true;
        boolean shouldTakeUmbrella = false; // Измените это значение
        System.out.println("Нужно брать зонт: " + shouldTakeUmbrella);

        // Задача 2: Использование оператора И (&&)
        boolean isWeekend = true;
        boolean isSunny = false;
        boolean goForAWalk = false; // Измените это значение
        System.out.println("Пойти на прогулку: " + goForAWalk);

        // Задача 3: Использование оператора ИЛИ (||)
        boolean isHoliday = false;
        boolean haveFreeTime = true;
        boolean canRelax = false; // Измените это значение
        System.out.println("Можно отдыхать: " + canRelax);

        // Задача 4: Сложное условие с И и ИЛИ
        boolean isSnowing = false;
        boolean isWinter = true;
        boolean likesWinter = true;
        boolean goSkiing = false; // Измените это значение
        System.out.println("Пойти кататься на лыжах: " + goSkiing);

        // Задача 5: Использование оператора XOR (^)
        boolean isEvening = true;
        boolean isMorning = false;
        boolean watchMovie = false; // Измените это значение
        System.out.println("Смотреть фильм вечером: " + watchMovie);

        // Задача 6: Сложное условие с несколькими операторами (температура выше 20, дождь не идет)
        int temperature = 20;
        boolean isRaining = false;
        boolean goForARun = false; // Измените это значение
        System.out.println("Пойти на пробежку: " + goForARun);
    }
}
