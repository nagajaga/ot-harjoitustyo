package com.mycompany.unicafe;

import static org.junit.Assert.*;

import com.mycompany.unicafe.Kassapaate;

import org.junit.Before;
import org.junit.Test;

public class KassapaateTest {

    Kassapaate kassapaate;
    Maksukortti kortti;

    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        kortti = new Maksukortti(500);
    }

    @Test
    public void luotuKassapaateOikein() {
        assertEquals(100000, kassapaate.kassassaRahaa());
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }

    @Test
    public void rahaKasvaaSyoEdullisesti() {
        assertEquals(10, kassapaate.syoEdullisesti(250));
        assertEquals(100240, kassapaate.kassassaRahaa());
        assertEquals(10, kassapaate.syoEdullisesti(10));
        assertEquals(100240, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }

    @Test
    public void rahaKasvaaSyoMaukkaasti() {
        assertEquals(10, kassapaate.syoMaukkaasti(410));
        assertEquals(100400, kassapaate.kassassaRahaa());
        assertEquals(10, kassapaate.syoMaukkaasti(10));
        assertEquals(100400, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }

    @Test
    public void korttiOstoToimiiEdullisesti() {
        kassapaate.syoEdullisesti(kortti);
        assertTrue(kassapaate.syoEdullisesti(kortti));
        assertFalse(kassapaate.syoEdullisesti(kortti));
        assertEquals(2, kassapaate.edullisiaLounaitaMyyty());
        assertEquals(100000, kassapaate.kassassaRahaa());

    }

    @Test
    public void korttiOstoToimiiMaukkaasti() {
        assertTrue(kassapaate.syoMaukkaasti(kortti));
        assertFalse(kassapaate.syoMaukkaasti(kortti));
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
        assertEquals(100000, kassapaate.kassassaRahaa());

    }

    @Test
    public void korttiNostoMuuttaaSaoldoaJaKassarahaa(){
        kassapaate.lataaRahaaKortille(kortti, 100);
        kassapaate.lataaRahaaKortille(kortti, -1);
        assertEquals(600,kortti.saldo());
        assertEquals(100100, kassapaate.kassassaRahaa());
    }

}