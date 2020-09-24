package segurtasuna;

import junit.framework.TestCase;

public class OrdezkatzeHiztegiaTest extends TestCase {
    OrdezkatzeHiztegia ordezkatzeHiztegia = null;

    public void setUp() throws Exception {
        super.setUp();
        ordezkatzeHiztegia = new OrdezkatzeHiztegia();
    }

    public void tearDown() {
    }

    public void testZifratu() {
        assertEquals("BPMZTVBMBWWZWBJZGVB", ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE"));
    }
    public void testDeszifratu() {

        assertEquals("EZGAUDEGERRARENALDE",
                ordezkatzeHiztegia.deszifratu(
                        ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE")));

    }
}