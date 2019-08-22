package robot;

public enum RobotMoves {
    STEP_LEFT(6),
    STEP_RIGHT(6),
    WAVE_LEFT_HAND(4),
    WAVE_RIGHT_HAND(4);


    private int batteryUsage;

    RobotMoves(int batteryUsage) {
        this.batteryUsage = batteryUsage;

    }

    public int getBatteryUsage() {
        return batteryUsage;
    }
}
