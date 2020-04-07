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
        Converter converter = new Converter("flour","cups",1.0,"millilitres");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(126.8,result,0.001);
    }

    @Test
    public void flourCupsToGConversion(){
        Converter converter = new Converter("flour","cups",1.0,"grams");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(240.00,result,0.001);
    }

    @Test
    public void flourMlToGConversion(){
        Converter converter = new Converter("flour","millilitres",100.0,"grams");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(52.83,result,0.001);
    }

    @Test
    public void flourGToMlConversion(){
        Converter converter = new Converter("flour","grams",100.0,"millilitres");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(189.27,result,0.001);
    }

    @Test
    public void flourGToCupsConversion(){
        Converter converter = new Converter("flour","grams",240.0,"cups");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(1.0,result,0.001);
    }

    @Test
    public void flourMlToCupsConversion(){
        Converter converter = new Converter("flour","millilitres",240.0,"cups");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(0.53,result,0.001);
    }

    @Test
    public void invalidIngredient(){
        Converter converter = new Converter("potato","millilitres",240.0,"cups");
        converter.convert();
        Double result = converter.conversion();
        assertEquals(0.0,result,0.001);
    }


}
