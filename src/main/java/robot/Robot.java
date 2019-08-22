package robot;

import java.util.Scanner;

public class Robot {

    private int batteryLevel;
    private String robotName;
    private boolean isRobotOn;

    public Robot(int batteryLevel, String robotName, boolean isRobotOn) {
        this.batteryLevel = batteryLevel;
        this.robotName = robotName;
        this.isRobotOn = isRobotOn;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public boolean isRobotOn() {
        return isRobotOn;
    }

    public void setRobotOn(boolean robotOn) {
        isRobotOn = robotOn;
    }

    public void turnRobotOn() {
        if (this.isRobotOn == true) {
            System.out.println("Robot is allready on. Enter command");
        } else if (this.isRobotOn == false) {
            System.out.println("Robot switched to ON");
            this.isRobotOn = true;
        }
    }

    public void turnRobotOff() {
        if (this.isRobotOn == true) {
            System.out.println("I`m turning myself OFF");
            this.isRobotOn = false;
        } else if (this.isRobotOn == false) {
            System.out.println("I`m allready OFF");
        }
    }

    public void chargeRobot() {
        if (isRobotOn) {
            System.out.println("To charge robot, you must firstly turn robot off");
        } else {
            this.batteryLevel = 100;
            System.out.println("Battery level " + this.getBatteryLevel() + "%.");
        }
    }

    public void moveRobot(RobotMoves robotMoves) {
        if (this.isRobotOn()) {
            if (this.getBatteryLevel() > robotMoves.getBatteryUsage()) {
                switch (robotMoves) {
                    case STEP_LEFT:
                        System.out.println("Making step to my left side");
                        this.batteryLevel -= robotMoves.getBatteryUsage();
                        System.out.println("Battery level after move " + getBatteryLevel());
                        break;
                    case STEP_RIGHT:
                        System.out.println("Making step to my right side");
                        this.batteryLevel -= robotMoves.getBatteryUsage();
                        System.out.println("Battery level after move " + getBatteryLevel());
                        break;
                    case WAVE_LEFT_HAND:
                        System.out.println("I am waving to You with my left hand");
                        this.batteryLevel -= robotMoves.getBatteryUsage();
                        System.out.println("Battery level after move " + getBatteryLevel());
                        break;
                    case WAVE_RIGHT_HAND:
                        System.out.println("I am waving to You with my right hand");
                        this.batteryLevel -= robotMoves.getBatteryUsage();
                        System.out.println("Battery level after move " + getBatteryLevel());
                        break;
                }

            } else {
                System.out.println("Battery level to low to make a move. Please charge robot first");
            }
        } else {
            System.out.println("You must turn robot on before asking him to move");
        }
    }

    public void console() {
        boolean operate = true;

        System.out.println("Welcome to robot stering console.");
        System.out.println("1 - turn on robot");
        System.out.println("2 - turn off robot");
        System.out.println("3 - charge robot");
        System.out.println("4 - move robot left");
        System.out.println("5 - move robot right");
        System.out.println("6 - wave left hand");
        System.out.println("7 - wave right hand");
        System.out.println("8 - log out from console");

        do {
            System.out.println("Enter command");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    this.turnRobotOn();
                    break;
                case 2:
                    this.turnRobotOff();
                    break;
                case 3:
                    chargeRobot();
                    break;
                case 4:
                    moveRobot(RobotMoves.STEP_LEFT);
                    break;
                case 5:
                    moveRobot(RobotMoves.STEP_RIGHT);
                    break;
                case 6:
                    moveRobot(RobotMoves.WAVE_LEFT_HAND);
                    break;
                case 7:
                    moveRobot(RobotMoves.WAVE_RIGHT_HAND);
                    break;
                case 8:
                    System.out.println("Turning console off");
                    operate = false;
            }
        } while (operate);
    }
}
