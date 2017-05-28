package ua.training.view;


public class View {

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printInNewLineMessage(String message) {
        printMessage(message);
        System.out.println();
    }

}
