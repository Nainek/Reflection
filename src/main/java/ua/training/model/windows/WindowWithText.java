package ua.training.model.windows;


public class WindowWithText extends Window{

    private String testInWindow;
    private String textColor;

    public WindowWithText(int leftCoordinate, int rightCoordinate, int topCoordinate, int botoomCoordinate, String color, String testInWindow, String textColor) {
        super(leftCoordinate, rightCoordinate, topCoordinate, botoomCoordinate, color);
        this.testInWindow = testInWindow;
        this.textColor = textColor;
    }

    public String getTestInWindow() {
        return testInWindow;
    }

    public void setTestInWindow(String testInWindow) {
        this.testInWindow = testInWindow;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
