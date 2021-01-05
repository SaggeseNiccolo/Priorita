/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calendario_saggese;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CalendarioTest {
    
    public CalendarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcolaNumero1() {
        System.out.println("calcolaNumero");
        Calendario instance = new Calendario(17, 7, 2020);
        int expResult = 199;
        int result = instance.calcolaNumero();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcolaGiorno1() {
        System.out.println("calcolaGiorno");
        Calendario instance = new Calendario(17, 7, 2020);
        String expResult = "Venerdi";
        String result = instance.calcolaGiorno();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcolaNumero2() {
        System.out.println("calcolaNumero");
        Calendario instance = new Calendario(8, 1, 2020);
        int expResult = 8;
        int result = instance.calcolaNumero();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcolaGiorno2() {
        System.out.println("calcolaGiorno");
        Calendario instance = new Calendario(8, 1, 2020);
        String expResult = "Mercoledi";
        String result = instance.calcolaGiorno();
        assertEquals(expResult, result);
    }
    
}
