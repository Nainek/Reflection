package ua.training.model.windows;


public class WindowWithText extends Window{

    private String textInWindow;
    private String textColor;

    public WindowWithText(int leftCoordinate, int rightCoordinate, int topCoordinate, int botoomCoordinate, String color, String textInWindow, String textColor) {
        super(leftCoordinate, rightCoordinate, topCoordinate, botoomCoordinate, color);
        this.textInWindow = textInWindow;
        this.textColor = textColor;
    }
    public WindowWithText() {
        super();
        this.textInWindow = "Default text";
        this.textColor = "Default text color";
    }



    public String getTestInWindow() {
        return textInWindow;
    }

    public void setTestInWindow(String testInWindow) {
        this.textInWindow = testInWindow;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    @Override
    public String toString() {
        return "WindowWithText{" +
                "testInWindow='" + textInWindow + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
