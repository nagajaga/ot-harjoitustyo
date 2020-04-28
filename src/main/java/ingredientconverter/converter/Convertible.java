package ingredientconverter.converter;

/**
 * A class that stores conversion formulas and returns them. The amount of grams
 * in one cup is used to calculate all conversions for any given ingredient.
 */
public class Convertible {
    private String ingredientName;
    private Double gramsInCup;

    /**
     * Constructor for convertibles.
     * 
     * @param ingredientName Name of the ingredient.
     * @param gramsInCup     How many grams are in one cup.
     */
    public Convertible(String ingredientName, Double gramsInCup) {
        this.ingredientName = ingredientName;
        this.gramsInCup = gramsInCup;
    }

    public Double gramsToCups() {
        return 1 / this.gramsInCup;
    }

    public Double gramsToMl() {
        return 240 / this.gramsInCup;
    }

    public Double mlToGrams() {
        return this.gramsInCup / 240;
    }

    public Double mlToCups() {
        return 1 / 240.0;
    }

    public Double cupsToGrams() {
        return this.gramsInCup;
    }

    public Double cupsToMl() {
        return 240.0;
    }

    public String getName() {
        return this.ingredientName;
    }
}