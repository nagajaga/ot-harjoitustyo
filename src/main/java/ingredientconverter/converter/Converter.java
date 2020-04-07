package ingredientconverter.converter;

public class Converter {

    private Double newAmount;
    private String ingredientName;
    private String fromUnit;
    private Double amount;
    private String toUnit;

    public Converter(String ingredientName, String fromUnit, Double amount, String toUnit) {
        this.ingredientName = ingredientName;
        this.fromUnit = fromUnit;
        this.amount = amount;
        this.toUnit = toUnit;
        newAmount = amount;
    }

    public void convert() {
        if (ingredientName.equals("flour")) {
            convertFlour();
        } else {
            newAmount = 0.0;
        }

    }

    public void convertFlour() {
        if (fromUnit.equals("grams")) {
            if (toUnit.equals("millilitres")) {
                newAmount = amount * 1.8927;
            } else if (toUnit.equals("cups")) {
                newAmount = amount / 240;
            }
        } else if (fromUnit.equals("millilitres")) {
            if (toUnit.equals("grams")) {
                newAmount = amount / 1.8927;
            } else if (toUnit.equals("cups")) {
                newAmount = (amount / 1.8927) / 240;
            }
        } else if (fromUnit.equals("cups")) {
            if (toUnit.equals("grams")) {
                newAmount = amount * 240;
            } else if (toUnit.equals("millilitres")) {
                newAmount = (amount / 1.8927) * 240;
            }
        }
    }

    public Double conversion() {
        return Math.round(newAmount * 100.0) / 100.0;

    }
}
