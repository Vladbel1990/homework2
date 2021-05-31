import java.util.Random;

public class homework {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители:");
        for (Participant winner : competition.getLastWinner()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Person("Oleg", 500, 500);
        Participant cat = new Cat("Brasik", 200, 1500);
        Participant robot = new Robot("Altron", 150, 5000);

    }


}
