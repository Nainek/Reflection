package ua.training.model.windows;


import ua.training.controller.RunnableMethod;

public class Window {

    private int leftCoordinate;
    private int rightCoordinate;
    private int topCoordinate;
    private int botoomCoordinate;

    private String color;

    @RunnableMethod
    public int calculateHeight(){
        return topCoordinate - botoomCoordinate;
    }

    public Window() {
        this.leftCoordinate = 0;
        this.rightCoordinate = 0;
        this.topCoordinate = 0;
        this.botoomCoordinate = 0;
        this.color = "Default";
    }

    public Window(int leftCoordinate, int rightCoordinate, int topCoordinate, int botoomCoordinate, String color) {
        this.leftCoordinate = leftCoordinate;
        this.rightCoordinate = rightCoordinate;
        this.topCoordinate = topCoordinate;
        this.botoomCoordinate = botoomCoordinate;
        this.color = color;
    }

    public int getLeftCoordinate() {
        return leftCoordinate;
    }

    public void setLeftCoordinate(int leftCoordinate) {
        this.leftCoordinate = leftCoordinate;
    }

    public int getRightCoordinate() {
        return rightCoordinate;
    }

    public void setRightCoordinate(int rightCoordinate) {
        this.rightCoordinate = rightCoordinate;
    }

    public int getTopCoordinate() {
        return topCoordinate;
    }

    public void setTopCoordinate(int topCoordinate) {
        this.topCoordinate = topCoordinate;
    }

    public int getBotoomCoordinate() {
        return botoomCoordinate;
    }

    public void setBotoomCoordinate(int botoomCoordinate) {
        this.botoomCoordinate = botoomCoordinate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Window{" +
                "leftCoordinate=" + leftCoordinate +
                ", rightCoordinate=" + rightCoordinate +
                ", topCoordinate=" + topCoordinate +
                ", botoomCoordinate=" + botoomCoordinate +
                ", color='" + color + '\'' +
                '}';
    }
}
