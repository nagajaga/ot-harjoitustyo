package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti != null);
    }

    @Test
    public void saldoOikeinAlussa() {
        assertEquals("saldo: 0.10", kortti.toString());
    }

    @Test
    public void rahanKasvattaminenToimii() {
        kortti.lataaRahaa(10);
        assertEquals(20, kortti.saldo());
    }

    @Test
    public void saldoVaheneeKunRahaaTarpeeksi() {
        kortti.otaRahaa(5);
        assertEquals(5, kortti.saldo());
        assertTrue(kortti.otaRahaa(3));
    }

    @Test
    public void saldoEiMuutuJosRahaaEiTarpeeksi() {
        kortti.otaRahaa(11);
        assertEquals(10, kortti.saldo());
        assertFalse(kortti.otaRahaa(11));
    }

}
