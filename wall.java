public class wall implements Obstacle {


    private final int height;

    public wall(int height); {
        this.height = height;

    }


    @Override
    public boolean passObstacleBY(Participant participant) {
        if (participant.jump() >= height) {
            System.out.println("Участник " + participant + " успешно перепрыгнул дистанцию");
            return true;
        }
        else {

            System.out.println("Участник " + participant + "не смог перепрыгуть стену" +);
        }

    }
}

