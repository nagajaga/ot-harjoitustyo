/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientconverter.converter;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joel
 */
public class ConverterTest {
    
    public ConverterTest() {
    }
    
    @Test
    public void flourCupsToMlConversion(){
        Converter converter = new Converter();
        converter.convert("flour","cups",1.0,"millilitres");
        Double result = converter.conversion();
        assertEquals(240,result,0.001);
    }

    @Test
    public void flourCupsToGConversion(){
        Converter converter = new Converter();
        converter.convert("flour","cups",1.0,"grams");
        Double result = converter.conversion();
        assertEquals(126.8,result,0.001);
    }

    @Test
    public void flourMlToGConversion(){
        Converter converter = new Converter();
        converter.convert("flour","millilitres",100.0,"grams");
        Double result = converter.conversion();
        assertEquals(52.83,result,0.001);
    }

    @Test
    public void flourGToMlConversion(){
        Converter converter = new Converter();
        converter.convert("flour","grams",100.0,"millilitres");
        Double result = converter.conversion();
        assertEquals(189.27,result,0.001);
    }

    @Test
    public void flourGToCupsConversion(){
        Converter converter = new Converter();
        converter.convert("flour","grams",240.0,"cups");
        Double result = converter.conversion();
        assertEquals(1.89,result,0.001);
    }

    @Test
    public void flourMlToCupsConversion(){
        Converter converter = new Converter();
        converter.convert("flour","millilitres",240.0,"cups");
        Double result = converter.conversion();
        assertEquals(1.0,result,0.001);
    }

    @Test
    public void invalidIngredient(){
        Converter converter = new Converter();
        converter.convert("potato","millilitres",240.0,"cups");
        Double result = converter.conversion();
        assertEquals(0.0,result,0.001);
    }

    @Test
    public void butterCupsToML(){
        Converter converter = new Converter();
        converter.convert("butter","cups", 1.0 ,"millilitres");
        Double result = converter.conversion();
        assertEquals(240, result, 0.001);
    }
    
    @Test
    public void butterCupsToG(){
        Converter converter = new Converter();
        converter.convert("butter","cups", 1.0 ,"grams");
        Double result = converter.conversion();
        assertEquals(227, result, 0.001);
    }

    @Test
    public void butterMlToCups(){
        Converter converter = new Converter();
        converter.convert("butter","millilitres", 240.0 ,"cups");
        Double result = converter.conversion();
        assertEquals(1, result, 0.001);
    }

    @Test
    public void butterGramsToCups(){
        Converter converter = new Converter();
        converter.convert("butter","grams", 227.0 ,"cups");
        Double result = converter.conversion();
        assertEquals(1, result, 0.001);
    }

    @Test
    public void butterGramsToML(){
        Converter converter = new Converter();
        converter.convert("butter","grams", 227.0 ,"millilitres");
        Double result = converter.conversion();
        assertEquals(240, result, 0.001);
    }

    @Test
    public void butterMlToGrams(){
        Converter converter = new Converter();
        converter.convert("butter","millilitres", 240.0 ,"grams");
        Double result = converter.conversion();
        assertEquals(227, result, 0.001);
    }

    @Test
    public void sugarCupsToML(){
        Converter converter = new Converter();
        converter.convert("sugar","cups", 1.0 ,"millilitres");
        Double result = converter.conversion();
        assertEquals(240, result, 0.001);
    }
    
    @Test
    public void sugarCupsToG(){
        Converter converter = new Converter();
        converter.convert("sugar","cups", 1.0 ,"grams");
        Double result = converter.conversion();
        assertEquals(201, result, 0.001);
    }

    @Test
    public void sugarMlToCups(){
        Converter converter = new Converter();
        converter.convert("sugar","millilitres", 240.0 ,"cups");
        Double result = converter.conversion();
        assertEquals(1, result, 0.001);
    }

    @Test
    public void sugarGramsToCups(){
        Converter converter = new Converter();
        converter.convert("sugar","grams", 201.0 ,"cups");
        Double result = converter.conversion();
        assertEquals(1, result, 0.001);
    }

    @Test
    public void sugarGramsToML(){
        Converter converter = new Converter();
        converter.convert("sugar","grams", 201.0 ,"millilitres");
        Double result = converter.conversion();
        assertEquals(240, result, 0.001);
    }

    @Test
    public void sugarMlToGrams(){
        Converter converter = new Converter();
        converter.convert("sugar","millilitres", 240.0 ,"grams");
        Double result = converter.conversion();
        assertEquals(201, result, 0.001);
    }


}
