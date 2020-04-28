package ingredientconverter.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import ingredientconverter.converter.Converter;
/**
 * A class that handles the graphical user interface.
 */
public class ConverterUI extends Application {
    /**
     * The graphical user interface is created here.
     */
    @Override
    public void start(Stage window) {
        Converter converter = new Converter();
        Label ingredientLabel = new Label("Ingredient: ");
        TextField ingredient = new TextField();
        Label fromLabel = new Label("Convert from: ");
        TextField fromUnit = new TextField();
        Label quantityLabel = new Label("Quantity: ");
        TextField quantity = new TextField();
        Label toLabel = new Label("Convert to: ");
        TextField toUnit = new TextField();
        Label newAmt = new Label("");

        Button convertButton = new Button("Convert!");
        convertButton.setOnAction((event) -> {
            converter.convert(ingredient.getText(), fromUnit.getText(), Double.parseDouble(quantity.getText()), toUnit.getText());
            newAmt.setText(String.valueOf(converter.conversion())+ " " + toUnit.getText());
        });
        GridPane components = new GridPane();
        components.add(ingredientLabel, 0, 0);
        components.add(ingredient, 1, 0);
        components.add(fromLabel, 0, 1);
        components.add(fromUnit, 1, 1);
        components.add(quantityLabel, 0, 2);
        components.add(quantity, 1, 2);
        components.add(toLabel, 0, 3);
        components.add(toUnit, 1, 3);
        components.add(convertButton, 1, 4);
        components.add(newAmt, 1, 5);

        components.setHgap(10);
        components.setVgap(10);
        components.setPadding(new Insets(10, 10, 10, 10));

        Scene show = new Scene(components);

        window.setTitle("Converter");
        window.setScene(show);
        window.show();
    }
    /**
     * The GUI is initialized here.
     * @param args Standard main method for class.
     */
    public static void main(String[] args) {
        launch(args);
    }
}