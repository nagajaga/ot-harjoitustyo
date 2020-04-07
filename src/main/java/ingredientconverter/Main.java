package ingredientconverter;
import java.util.*;
import ingredientconverter.io.InputHandler;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(reader);
        inputHandler.run();
    }
}