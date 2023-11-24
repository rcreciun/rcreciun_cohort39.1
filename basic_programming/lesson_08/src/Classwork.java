import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter season:");
//        String str = scanner.nextLine(); // "afvafvafvqrvqrevc"
//        Seasons seasons = Seasons.WINTER;
//
//        if (str == "winter") {
//            seasons = Seasons.WINTER;
//        } else if (str == "spring") {
//            seasons = Seasons.SPRING;
//        }


        Seasons currentSeason = Seasons.COLD_MID_SEASON;

        if (currentSeason == Seasons.AUTUMN) {
            System.out.println("Сейчас осень, готовим препараты для нормализации сна");
        } else if (currentSeason == Seasons.WINTER) {
            System.out.println("Сейчас зима, готовим препараты для борьбы с простудой");
        } else if (currentSeason == Seasons.SPRING) {
            System.out.println("Сейчас весна, готовим витамины");
        } else if (currentSeason == Seasons.SUMMER){
            System.out.println("Сейчас лето, готовим препараты для борьбы с насекомыми");
        } else {
            System.err.println("Error! UNKNOW SEASON " + currentSeason);
        }

        System.out.println(currentSeason);
    }

    enum Seasons {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,
        COLD_MID_SEASON,
        WARM_MID_SEASON
    }
}
