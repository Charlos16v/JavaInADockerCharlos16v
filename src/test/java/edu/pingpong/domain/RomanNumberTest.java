package edu.pingpong.domain;

import edu.pingpong.romans.domain.RomanNumber;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    public static RomanNumber romanNumber;

    @BeforeClass
    public static void setupRomanNumber() {
        romanNumber = new RomanNumber();
        romanNumber.initRegexList();
    }

    @Test
    public void isValidTest() {
        String testCase = "IIIY";
        romanNumber.setRomanNumber(testCase);
        assertFalse(romanNumber.isValidRomanNumber());
    }

    // SUMMATIVE TESTS

    @Test
    public void SymbolITest() {
        String testCaseI = "I";
        romanNumber.setRomanNumber(testCaseI);
        assertEquals(1, romanNumber.convertToDecimal());
        String testCaseII = "II";
        romanNumber.setRomanNumber(testCaseII);
        assertEquals(2, romanNumber.convertToDecimal());
        String testCaseIII = "III";
        romanNumber.setRomanNumber(testCaseIII);
        assertEquals(3, romanNumber.convertToDecimal());
    }


    @Test
    public void SymbolVTest() {
        String testCaseV = "V";
        romanNumber.setRomanNumber(testCaseV);
        assertEquals(5, romanNumber.convertToDecimal());

        String testCaseVI = "VI";
        romanNumber.setRomanNumber(testCaseVI);
        assertEquals(6, romanNumber.convertToDecimal());

        String testCaseVII = "VII";
        romanNumber.setRomanNumber(testCaseVII);
        assertEquals(7, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolLTest() {
        String testCaseL = "L";
        romanNumber.setRomanNumber(testCaseL);
        assertEquals(50, romanNumber.convertToDecimal());

        String testCaseLI = "LI";
        romanNumber.setRomanNumber(testCaseLI);
        assertEquals(51, romanNumber.convertToDecimal());

        String testCaseLX = "LX";
        romanNumber.setRomanNumber(testCaseLX);
        assertEquals(60, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolCTest() {
        String testCaseC = "C";
        romanNumber.setRomanNumber(testCaseC);
        assertEquals(100, romanNumber.convertToDecimal());

        String testCaseCL = "CL";
        romanNumber.setRomanNumber(testCaseCL);
        assertEquals(150, romanNumber.convertToDecimal());

        String testCaseCV = "CV";
        romanNumber.setRomanNumber(testCaseCV);
        assertEquals(105, romanNumber.convertToDecimal());

        String testCaseCX = "CX";
        romanNumber.setRomanNumber(testCaseCX);
        assertEquals(110, romanNumber.convertToDecimal());

        String testCaseCI = "CI";
        romanNumber.setRomanNumber(testCaseCI);
        assertEquals(101, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolDTest() {
        String TestCaseD = "D";
        romanNumber.setRomanNumber(TestCaseD);
        assertEquals(500, romanNumber.convertToDecimal());

        String TestCaseDI = "DI";
        romanNumber.setRomanNumber(TestCaseDI);
        assertEquals(501, romanNumber.convertToDecimal());

        String TestCaseDC = "DC";
        romanNumber.setRomanNumber(TestCaseDC);
        assertEquals(600, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolMTest() {
        String TestCaseM = "M";
        romanNumber.setRomanNumber(TestCaseM);
        assertEquals(1000, romanNumber.convertToDecimal());

        String TestCaseMD = "MD";
        romanNumber.setRomanNumber(TestCaseMD);
        assertEquals(1500, romanNumber.convertToDecimal());

        String TestCaseMVI = "MVI";
        romanNumber.setRomanNumber(TestCaseMVI);
        assertEquals(1006, romanNumber.convertToDecimal());

        String testCaseMM = "MM";
        romanNumber.setRomanNumber(testCaseMM);
        assertEquals(2000, romanNumber.convertToDecimal());

        String testCaseMMM = "MMM";
        romanNumber.setRomanNumber(testCaseMMM);
        assertEquals(3000, romanNumber.convertToDecimal());

        String testCaseCM = "CM";
        romanNumber.setRomanNumber(testCaseCM);
        assertEquals(900, romanNumber.convertToDecimal());

        String testCaseMMMCCC = "MMMCCC";
        romanNumber.setRomanNumber(testCaseMMMCCC);
        assertEquals(3300, romanNumber.convertToDecimal());
    }

    // SUBTRACTIVE TESTS

    @Test
    public void SymbolIVTest() {
        String testCaseIV = "IV";
        romanNumber.setRomanNumber(testCaseIV);
        assertEquals(4, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolIXTest() {
        String testCaseIX = "IX";
        romanNumber.setRomanNumber(testCaseIX);
        assertEquals(9, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolXIVTest() {
        String testCaseXIV = "XIV";
        romanNumber.setRomanNumber(testCaseXIV);
        assertEquals(14, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolXLTest() {
        String testCaseXL = "XL";
        romanNumber.setRomanNumber(testCaseXL);
        assertEquals(40, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolXCTest() {
        String testCaseXC = "XC";
        romanNumber.setRomanNumber(testCaseXC);
        assertEquals(90, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolCDTest() {
        String testCaseCD = "CD";
        romanNumber.setRomanNumber(testCaseCD);
        assertEquals(400, romanNumber.convertToDecimal());

        String testCaseCDIV = "CDIV";
        romanNumber.setRomanNumber(testCaseCDIV);
        assertEquals(404, romanNumber.convertToDecimal());
    }

    @Test
    public void SymbolCMTest() {
        String testCaseCM = "CM";
        romanNumber.setRomanNumber(testCaseCM);
        assertEquals(900, romanNumber.convertToDecimal());
    }
}
