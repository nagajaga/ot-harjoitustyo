package ingredientconverter.converter;
import java.util.*;
/**
 * A class that takes the given inputs and performs conversions
 * based on formulas in the Convertibles.java class.
 */
public class Converter {

    private Double newAmount;
    private String ingredientName;
    private String fromUnit;
    private Double amount;
    private String toUnit;
    private ArrayList<Convertible> convertibles;

    public Converter() {
        this.convertibles = new ArrayList<Convertible>();
        this.convertibles.add(new Convertible("flour",126.8));
        this.convertibles.add(new Convertible("sugar",201.0));
        this.convertibles.add(new Convertible("butter",227.0));

    }
    /**
     * The method takes given parameters and performs conversions
     * based on the formulas in the Convertible.java class.
     * @param ingredientName Ingredient name given by user.
     * @param fromUnit Unit to convert from.
     * @param amount Amount given by user.
     * @param toUnit Unit to convert into.
     */
    public void convert(String ingredientName, String fromUnit, Double amount, String toUnit) {
        this.ingredientName = ingredientName;
        this.fromUnit = fromUnit;
        this.amount = amount;
        this.toUnit = toUnit;
        newAmount = this.amount;
        for(int i = 0; i < this.convertibles.size(); i++) {
            if(this.ingredientName.equals(this.convertibles.get(i).getName())) {
                if(this.fromUnit.equals("cups") && this.toUnit.equals("grams")) {
                    newAmount = this.amount * this.convertibles.get(i).cupsToGrams();
                } else if (this.fromUnit.equals("cups") && this.toUnit.equals("millilitres")) {
                    newAmount = this.amount * this.convertibles.get(i).cupsToMl();
                } else if (this.fromUnit.equals("millilitres") && this.toUnit.equals("grams")) {
                    newAmount = this.amount * this.convertibles.get(i).mlToGrams();
                } else if (this.fromUnit.equals("millilitres") && this.toUnit.equals("cups")) {
                    newAmount = this.amount * this.convertibles.get(i).mlToCups();
                } else if (this.fromUnit.equals("grams") && this.toUnit.equals("millilitres")) {
                    newAmount = this.amount * this.convertibles.get(i).gramsToMl();
                } else if (this.fromUnit.equals("grams") && this.toUnit.equals("cups")) {
                    newAmount = this.amount * this.convertibles.get(i).gramsToCups();
                }
            } 
        }
    }

    /**
     * Rounds up the conversion to a 2 decimal point Double.
     * @return Returns a 2 decimal point Double, with the amount after conversion.
     */
    public Double conversion() {
        return Math.round(newAmount * 100.0) / 100.0;

    }
}
