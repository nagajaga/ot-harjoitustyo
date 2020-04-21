package ingredientconverter.io;
import java.util.*;
import ingredientconverter.converter.Converter;

public class InputHandler {
    private Scanner reader;
    
    public InputHandler(Scanner reader){
        this.reader = reader;
        
    }

    public void run(){
        System.out.println("Ingredient converter");
        while(true) {
            System.out.println("Enter the ingredient you wish to convert: (x to shut down)");
            String ingredientName = reader.nextLine();
            if(ingredientName.equals("x")) {
                break;
            }
            System.out.println("Choose the unit of measurement you wish to convert FROM");
            listUnits();
            String fromUnit = reader.nextLine();            
            System.out.println("Enter the amount: ");
            double amount = Double.parseDouble(reader.nextLine());
            System.out.println("Choose the unit of measurement you wish to convert TO");
            listUnits();
            String toUnit = reader.nextLine();
            Converter converter = new Converter();
            converter.convert(ingredientName,fromUnit,amount,toUnit);
            Double rounded = converter.conversion();            
            System.out.println(amount + " " + fromUnit + " of " +  ingredientName + " is equal to " + rounded + " " + toUnit + ".");
        }
    }
    public void listUnits(){        
        System.out.println("grams");
        System.out.println("millilitres");
        System.out.println("cups");
    }
}