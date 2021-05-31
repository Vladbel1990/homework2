public interface Participant {

    int run();

    int jump();

    default boolean passObstacle(Obstacle obstacle) {
        return doAction(obstacle);
    }

    private boolean doAction(Obstacle obstacle) {
        return obstacle.passObstacleBy(this);
    }
}
