import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) ' ');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (short) 100);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) (short) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (byte) 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) -1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) (byte) -1);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "hi!", "", localDate82, 10);
        java.time.LocalDate localDate88 = null;
        boolean boolean90 = createEventService0.createEvent("hi!", "", "", localDate88, (int) 'a');
        java.lang.Class<?> wildcardClass91 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) ' ');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) ' ');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '#');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) '4');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "", localDate22, (int) (short) 100);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) '4');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (-1));
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (short) 0);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "hi!", "", localDate76, (int) (byte) -1);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "", "", localDate82, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (short) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) '4');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "hi!", localDate76, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (byte) 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) -1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) (byte) -1);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("hi!", "", "", localDate82, 10);
        java.time.LocalDate localDate88 = null;
        boolean boolean90 = createEventService0.createEvent("", "", "", localDate88, (int) (short) 10);
        java.time.LocalDate localDate94 = null;
        boolean boolean96 = createEventService0.createEvent("hi!", "hi!", "", localDate94, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (-1));
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, (int) '4');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "hi!", "hi!", localDate16, (int) (short) 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) (short) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 0);
        java.lang.Class<?> wildcardClass37 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) (short) 1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) 'a');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (byte) -1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (byte) 0);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "", localDate70, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, (int) '#');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) (short) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "", localDate64, (int) (byte) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) ' ');
        java.lang.Class<?> wildcardClass73 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, (int) (short) 0);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (short) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (byte) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "", localDate64, (int) '#');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "", localDate70, (int) ' ');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (byte) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) -1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "", localDate70, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) (short) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) ' ');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "", "hi!", localDate4, (int) (byte) -1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) '4');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 10);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (byte) 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, (-1));
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "hi!", localDate76, (int) (byte) 100);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "hi!", "", localDate82, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (byte) 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, 10);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, 100);
        java.lang.Class<?> wildcardClass43 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) (byte) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) '#');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (-1));
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) (byte) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, (int) (byte) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) ' ');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate64, 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "", localDate70, 10);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, (int) 'a');
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "", "hi!", localDate82, (int) (byte) 1);
        java.time.LocalDate localDate88 = null;
        boolean boolean90 = createEventService0.createEvent("", "hi!", "hi!", localDate88, (int) (byte) 0);
        java.time.LocalDate localDate94 = null;
        boolean boolean96 = createEventService0.createEvent("hi!", "", "", localDate94, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (short) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate64, 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (short) 1);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) (byte) -1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '#');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) '4');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (byte) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) (short) -1);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (byte) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "hi!", localDate16, (int) (short) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (int) (short) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) (byte) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (-1));
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "hi!", localDate70, (int) (byte) 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, 100);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "hi!", "hi!", localDate82, (int) (short) 10);
        java.time.LocalDate localDate88 = null;
        boolean boolean90 = createEventService0.createEvent("hi!", "", "hi!", localDate88, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) ' ');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) '#');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) '4');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (short) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "hi!", "hi!", localDate76, (int) (byte) -1);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate82, (int) 'a');
        java.lang.Class<?> wildcardClass85 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, 10);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) '4');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 0);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, (int) '4');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "hi!", "hi!", localDate16, (int) (byte) 10);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (-1));
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, (int) (byte) 1);
        java.lang.Class<?> wildcardClass73 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "", localDate16, (int) ' ');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) (byte) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) '#');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '#');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (byte) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 0);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) '#');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, (int) (short) 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) '#');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) (short) -1);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) 'a');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) '4');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, 10);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, 100);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("hi!", "", "hi!", localDate82, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (byte) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) '#');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, 0);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, (int) (short) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (short) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "hi!", localDate16, (int) (short) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "hi!", localDate16, (int) (short) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (-1));
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (byte) -1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, (int) (byte) 10);
        java.lang.Class<?> wildcardClass43 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (byte) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 0);
        java.lang.Class<?> wildcardClass49 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) '#');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (-1));
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (short) 1);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (-1));
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (byte) 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) (short) 1);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (int) (short) -1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, 100);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) '4');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, 0);
        java.lang.Class<?> wildcardClass25 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, (int) (byte) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (byte) -1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) (short) 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "hi!", localDate70, (int) (short) 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (byte) 1);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, 0);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (byte) 10);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) ' ');
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "", "", localDate82, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (-1));
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (byte) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) '#');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, 100);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, (int) (byte) 0);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("hi!", "", "", localDate82, (int) '#');
        java.lang.Class<?> wildcardClass85 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, (int) (short) 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "", "hi!", localDate10, 100);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (short) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) (byte) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) '#');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, (int) (short) 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (-1));
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (byte) 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (short) 0);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, (int) (short) 0);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (short) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) 1);
        java.lang.Class<?> wildcardClass73 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (int) (byte) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, 100);
        java.lang.Class<?> wildcardClass31 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 1);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) -1);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 10);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) (byte) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, 0);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (byte) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.lang.Class<?> wildcardClass43 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) '4');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, (int) '#');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "hi!", localDate76, 1);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (short) -1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (byte) -1);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, (int) (byte) 100);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "hi!", localDate76, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) 'a');
        java.lang.Class<?> wildcardClass43 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) ' ');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) '#');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) '4');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "", localDate70, (int) 'a');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "", localDate76, (int) (byte) 1);
        java.time.LocalDate localDate82 = null;
        boolean boolean84 = createEventService0.createEvent("", "", "hi!", localDate82, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (short) 0);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) (byte) -1);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) ' ');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, (int) (short) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "", localDate16, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, 100);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) '#');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, 0);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "", localDate64, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (int) (short) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) 'a');
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, (int) (short) -1);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "", localDate16, (int) ' ');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, (int) (byte) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 1);
        java.lang.Class<?> wildcardClass37 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) '4');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) 0);
        java.lang.Class<?> wildcardClass49 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) (byte) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) 'a');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (byte) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "hi!", "", localDate76, (-1));
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (short) 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "", localDate10, (int) 'a');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (byte) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 100);
        java.lang.Class<?> wildcardClass37 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (byte) 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) (short) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "", localDate70, (int) '4');
        java.lang.Class<?> wildcardClass73 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, (int) '4');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "hi!", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (int) (byte) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, (int) (short) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) ' ');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate28, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (short) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) ' ');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (byte) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) 'a');
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, (int) (byte) 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "", "hi!", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "hi!", "", localDate16, (int) '#');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (int) (byte) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) 1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "", "hi!", localDate10, (int) (byte) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, (int) (byte) 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (short) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, (int) (byte) -1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) 'a');
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, (int) (short) 0);
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate64, (int) (short) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (short) 0);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "hi!", "hi!", localDate76, (int) (short) 100);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, (int) '4');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "", "", localDate16, (int) '4');
        java.lang.Class<?> wildcardClass19 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (short) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) ' ');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) 'a');
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "hi!", localDate52, 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "hi!", localDate64, 0);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "", localDate70, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (int) (short) -1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate10, (int) (short) 1);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 10);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) ' ');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, 0);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (-1));
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) 'a');
        java.lang.Class<?> wildcardClass55 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "", localDate16, (int) '#');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "", localDate22, (int) (short) 100);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (byte) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, 1);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) ' ');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (byte) 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "hi!", "hi!", localDate76, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '4');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (-1));
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (short) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) ' ');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (short) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) ' ');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (short) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) 'a');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) (short) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, 100);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "", localDate40, (int) (byte) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "hi!", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (byte) 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (short) 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "", localDate70, (int) '#');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "", "hi!", localDate76, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "", "", localDate64, (int) (byte) 10);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, (int) (byte) 100);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("", "hi!", "", localDate76, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (int) (byte) 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (int) '#');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) (byte) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, (int) 'a');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) (short) 1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) 'a');
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "hi!", localDate22, (int) (byte) 10);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, (int) '#');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) (byte) 0);
        java.lang.Class<?> wildcardClass49 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, (int) 'a');
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "", localDate22, (int) '4');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate28, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("", "hi!", "hi!", localDate4, (int) (byte) 1);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "", localDate16, 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (-1));
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, 10);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, (int) (byte) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) (byte) -1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "", "", localDate70, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) '4');
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "", localDate34, (int) (byte) -1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, (int) (byte) 10);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "hi!", localDate46, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, (int) (short) 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "", localDate64, (int) (byte) 10);
        java.lang.Class<?> wildcardClass67 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "hi!", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) '#');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (short) 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "hi!", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, 100);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, (int) ' ');
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "hi!", "", localDate76, 100);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "hi!", "hi!", localDate10, (int) '4');
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("", "hi!", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "hi!", localDate22, (int) (byte) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 100);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "", "", localDate34, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "", "hi!", localDate40, (int) (byte) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "", localDate52, 100);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "hi!", localDate58, 10);
        java.lang.Class<?> wildcardClass61 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) -1);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 1);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (byte) 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) '4');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "hi!", localDate52, (int) ' ');
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "hi!", localDate58, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "", localDate40, (int) (short) 1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "", localDate46, (int) (byte) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "", "", localDate52, (int) (byte) 1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "", localDate70, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (byte) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, 0);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) (byte) 10);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "", localDate76, (int) (short) 100);
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, 1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) 10);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "", "", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "hi!", localDate64, (int) ' ');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "", localDate34, (-1));
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) 0);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "", localDate46, (int) (short) -1);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "hi!", localDate52, (int) (short) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "", localDate58, (int) ' ');
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "", "hi!", localDate64, (int) 'a');
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate70, 0);
        java.lang.Class<?> wildcardClass73 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "hi!", "hi!", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (byte) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "hi!", localDate40, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate40, (-1));
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "hi!", "", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) 100);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "", localDate22, (int) (short) 0);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "hi!", "", localDate28, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (byte) -1);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate58, 0);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("", "hi!", "", localDate64, 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "hi!", "hi!", localDate70, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "hi!", localDate4, 100);
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("", "", "hi!", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate16, (int) (byte) -1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("", "", "", localDate22, (int) (short) 100);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "hi!", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate34, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, (int) (byte) 1);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) (short) 1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("hi!", "", "", localDate28, (int) (short) 10);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "hi!", localDate34, (int) (short) 10);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "", localDate40, 100);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "", "", localDate46, (int) (byte) 0);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "", "", localDate58, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate22, (int) '#');
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "hi!", "", localDate28, (int) (byte) 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("", "hi!", "hi!", localDate34, (int) (short) 100);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("hi!", "", "hi!", localDate40, (int) (byte) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("", "", "hi!", localDate46, (int) (short) 100);
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        business.CreateEventService createEventService0 = new business.CreateEventService();
        java.time.LocalDate localDate4 = null;
        boolean boolean6 = createEventService0.createEvent("hi!", "", "", localDate4, (-1));
        java.time.LocalDate localDate10 = null;
        boolean boolean12 = createEventService0.createEvent("hi!", "hi!", "", localDate10, 0);
        java.time.LocalDate localDate16 = null;
        boolean boolean18 = createEventService0.createEvent("hi!", "", "hi!", localDate16, 0);
        java.time.LocalDate localDate22 = null;
        boolean boolean24 = createEventService0.createEvent("hi!", "", "", localDate22, (int) (byte) -1);
        java.time.LocalDate localDate28 = null;
        boolean boolean30 = createEventService0.createEvent("", "", "", localDate28, 0);
        java.time.LocalDate localDate34 = null;
        boolean boolean36 = createEventService0.createEvent("hi!", "", "", localDate34, 0);
        java.time.LocalDate localDate40 = null;
        boolean boolean42 = createEventService0.createEvent("", "hi!", "", localDate40, (int) (short) -1);
        java.time.LocalDate localDate46 = null;
        boolean boolean48 = createEventService0.createEvent("hi!", "hi!", "hi!", localDate46, (int) 'a');
        java.time.LocalDate localDate52 = null;
        boolean boolean54 = createEventService0.createEvent("", "hi!", "", localDate52, (int) (short) 0);
        java.time.LocalDate localDate58 = null;
        boolean boolean60 = createEventService0.createEvent("", "hi!", "", localDate58, (int) (short) 10);
        java.time.LocalDate localDate64 = null;
        boolean boolean66 = createEventService0.createEvent("hi!", "hi!", "", localDate64, (int) (short) 1);
        java.time.LocalDate localDate70 = null;
        boolean boolean72 = createEventService0.createEvent("", "", "hi!", localDate70, (int) (short) 1);
        java.time.LocalDate localDate76 = null;
        boolean boolean78 = createEventService0.createEvent("hi!", "", "hi!", localDate76, (int) ' ');
        java.lang.Class<?> wildcardClass79 = createEventService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }
}

