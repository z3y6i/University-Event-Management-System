package randoop.register;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterRegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration15 = new model.Registration(0, (int) (byte) 1);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event18 = eventRegistrationDAO0.getEventById((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        model.Event event4 = new model.Event(35, "hi!", "20/10/2026", "Lab 101");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lab 101" + "'", str6, "Lab 101");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Registration registration15 = new model.Registration(0, 0);
        boolean boolean16 = eventRegistrationDAO11.registerStudent(registration15);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event19 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO23 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList24 = eventRegistrationDAO23.getAllEvents();
        model.Event event26 = eventRegistrationDAO23.getEventById((int) (short) 10);
        model.Registration registration29 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean30 = eventRegistrationDAO23.registerStudent(registration29);
        model.Registration registration33 = new model.Registration((int) (short) 0, 0);
        int int34 = registration33.getEventId();
        boolean boolean35 = eventRegistrationDAO23.registerStudent(registration33);
        boolean boolean38 = eventRegistrationDAO23.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO39 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList40 = eventRegistrationDAO39.getAllEvents();
        model.Event event42 = eventRegistrationDAO39.getEventById((int) (short) 10);
        model.Registration registration45 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean46 = eventRegistrationDAO39.registerStudent(registration45);
        int int47 = registration45.getEventId();
        boolean boolean48 = eventRegistrationDAO23.registerStudent(registration45);
        boolean boolean51 = eventRegistrationDAO23.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration54 = new model.Registration(10, (int) 'a');
        boolean boolean55 = eventRegistrationDAO23.registerStudent(registration54);
        int int56 = registration54.getEventId();
        boolean boolean57 = eventRegistrationDAO0.registerStudent(registration54);
        java.util.List<model.Event> eventList58 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList59 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList40);
        org.junit.Assert.assertNull(event42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(eventList58);
        org.junit.Assert.assertNotNull(eventList59);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        int int7 = event6.getEventId();
        java.lang.String str8 = event6.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        int int8 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        model.Event event4 = new model.Event((int) '4', "", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Registration registration15 = new model.Registration(0, 0);
        int int16 = registration15.getEventId();
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(eventList19);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        model.Registration registration2 = new model.Registration((int) (byte) 10, (int) (short) -1);
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        model.Event event4 = new model.Event(10, "hi!", "Lab 101", "Lab 101");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) '#', (int) (byte) 1);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean12 = eventRegistrationService0.registerForEvent(0, (int) '#');
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        int int24 = registration22.getEventId();
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        model.Event event27 = eventRegistrationDAO0.getEventById((int) ' ');
        java.util.List<model.Event> eventList28 = eventRegistrationDAO0.getAllEvents();
        boolean boolean31 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(event27);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO8 = new data.EventRegistrationDAO();
        boolean boolean11 = eventRegistrationDAO8.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO8.getAllEvents();
        model.Event event14 = eventRegistrationDAO8.getEventById((int) (byte) 1);
        model.Event event16 = eventRegistrationDAO8.getEventById((int) (short) 0);
        model.Registration registration19 = new model.Registration(0, (int) (byte) 100);
        boolean boolean20 = eventRegistrationDAO8.registerStudent(registration19);
        model.Event event22 = eventRegistrationDAO8.getEventById((int) (byte) 0);
        model.Registration registration25 = new model.Registration(0, (int) '#');
        int int26 = registration25.getEventId();
        boolean boolean27 = eventRegistrationDAO8.registerStudent(registration25);
        boolean boolean28 = eventRegistrationDAO0.registerStudent(registration25);
        boolean boolean31 = eventRegistrationDAO0.isAlreadyRegistered(52, (int) (short) 100);
        model.Event event33 = eventRegistrationDAO0.getEventById(10);
        model.Registration registration36 = new model.Registration(0, (int) (byte) 100);
        int int37 = registration36.getStudentId();
        int int38 = registration36.getStudentId();
        int int39 = registration36.getEventId();
        int int40 = registration36.getEventId();
        boolean boolean41 = eventRegistrationDAO0.registerStudent(registration36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(event22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(event33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        model.Event event4 = new model.Event(100, "", "hi!", "20/10/2026");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration15 = new model.Registration((int) (byte) 10, 1);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        model.Registration registration19 = new model.Registration((int) (byte) 0, (int) '#');
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration19);
        int int21 = registration19.getEventId();
        java.lang.Class<?> wildcardClass22 = registration19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        model.Registration registration2 = new model.Registration((int) ' ', (int) (short) 10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration(0, 0);
        int int23 = registration22.getEventId();
        boolean boolean24 = eventRegistrationDAO16.registerStudent(registration22);
        int int25 = registration22.getStudentId();
        boolean boolean26 = eventRegistrationDAO0.registerStudent(registration22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Registration registration15 = new model.Registration(0, 0);
        boolean boolean16 = eventRegistrationDAO11.registerStudent(registration15);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event19 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        data.EventRegistrationDAO eventRegistrationDAO22 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList23 = eventRegistrationDAO22.getAllEvents();
        model.Event event25 = eventRegistrationDAO22.getEventById((int) (short) 10);
        model.Registration registration28 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean29 = eventRegistrationDAO22.registerStudent(registration28);
        model.Registration registration32 = new model.Registration((int) (short) 0, 0);
        int int33 = registration32.getEventId();
        boolean boolean34 = eventRegistrationDAO22.registerStudent(registration32);
        boolean boolean37 = eventRegistrationDAO22.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration40 = new model.Registration(0, (int) (short) 10);
        boolean boolean41 = eventRegistrationDAO22.registerStudent(registration40);
        data.EventRegistrationDAO eventRegistrationDAO42 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList43 = eventRegistrationDAO42.getAllEvents();
        model.Event event45 = eventRegistrationDAO42.getEventById((int) (short) 10);
        model.Registration registration48 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean49 = eventRegistrationDAO42.registerStudent(registration48);
        model.Registration registration52 = new model.Registration((int) (short) 0, 0);
        int int53 = registration52.getEventId();
        boolean boolean54 = eventRegistrationDAO42.registerStudent(registration52);
        boolean boolean57 = eventRegistrationDAO42.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO58 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList59 = eventRegistrationDAO58.getAllEvents();
        model.Event event61 = eventRegistrationDAO58.getEventById((int) (short) 10);
        model.Registration registration64 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean65 = eventRegistrationDAO58.registerStudent(registration64);
        model.Registration registration68 = new model.Registration((int) (short) 0, 0);
        int int69 = registration68.getEventId();
        boolean boolean70 = eventRegistrationDAO58.registerStudent(registration68);
        boolean boolean73 = eventRegistrationDAO58.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO74 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList75 = eventRegistrationDAO74.getAllEvents();
        model.Event event77 = eventRegistrationDAO74.getEventById((int) (short) 10);
        model.Registration registration80 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean81 = eventRegistrationDAO74.registerStudent(registration80);
        int int82 = registration80.getEventId();
        boolean boolean83 = eventRegistrationDAO58.registerStudent(registration80);
        int int84 = registration80.getStudentId();
        boolean boolean85 = eventRegistrationDAO42.registerStudent(registration80);
        boolean boolean86 = eventRegistrationDAO22.registerStudent(registration80);
        boolean boolean87 = eventRegistrationDAO0.registerStudent(registration80);
        java.util.List<model.Event> eventList88 = eventRegistrationDAO0.getAllEvents();
        boolean boolean91 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertNull(event25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(eventList43);
        org.junit.Assert.assertNull(event45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(eventList59);
        org.junit.Assert.assertNull(event61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(eventList75);
        org.junit.Assert.assertNull(event77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(eventList88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration((int) (short) 10, (int) (byte) 100);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Registration registration14 = new model.Registration(10, (-1));
        int int15 = registration14.getEventId();
        int int16 = registration14.getStudentId();
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration14);
        int int18 = registration14.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str12 = event11.getName();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AI Workshop" + "'", str12, "AI Workshop");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration15 = new model.Registration((int) (byte) 10, 1);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        model.Registration registration19 = new model.Registration((int) (byte) 0, (int) '#');
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration19);
        data.EventRegistrationDAO eventRegistrationDAO21 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList22 = eventRegistrationDAO21.getAllEvents();
        model.Event event24 = eventRegistrationDAO21.getEventById((int) (short) 10);
        model.Registration registration27 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean28 = eventRegistrationDAO21.registerStudent(registration27);
        model.Registration registration31 = new model.Registration((int) (short) 0, 0);
        int int32 = registration31.getEventId();
        boolean boolean33 = eventRegistrationDAO21.registerStudent(registration31);
        boolean boolean36 = eventRegistrationDAO21.isAlreadyRegistered((int) '4', (int) '4');
        model.Event event38 = eventRegistrationDAO21.getEventById(10);
        model.Registration registration41 = new model.Registration((int) '#', 0);
        boolean boolean42 = eventRegistrationDAO21.registerStudent(registration41);
        boolean boolean43 = eventRegistrationDAO0.registerStudent(registration41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertNull(event24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(event38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event17 = eventRegistrationService0.showEventDetails((int) (byte) -1);
        model.Event event19 = eventRegistrationService0.showEventDetails(35);
        boolean boolean22 = eventRegistrationService0.registerForEvent((int) ' ', (int) '#');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "", "");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getDate();
        event4.showDetails();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        model.Registration registration2 = new model.Registration(1, (int) (short) 10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str7 = event6.getName();
        java.lang.String str8 = event6.getLocation();
        java.lang.String str9 = event6.getName();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lab 101" + "'", str8, "Lab 101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AI Workshop" + "'", str9, "AI Workshop");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        int int7 = event4.getEventId();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        model.Registration registration2 = new model.Registration(52, 10);
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        model.Event event4 = new model.Event(100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered(1, 10);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList16 = eventRegistrationDAO12.getAllEvents();
        model.Event event18 = eventRegistrationDAO12.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO19 = new data.EventRegistrationDAO();
        boolean boolean22 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO19.getAllEvents();
        boolean boolean26 = eventRegistrationDAO19.isAlreadyRegistered(10, (int) 'a');
        boolean boolean29 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Registration registration34 = new model.Registration(0, 0);
        boolean boolean35 = eventRegistrationDAO30.registerStudent(registration34);
        boolean boolean36 = eventRegistrationDAO19.registerStudent(registration34);
        boolean boolean37 = eventRegistrationDAO12.registerStudent(registration34);
        data.EventRegistrationDAO eventRegistrationDAO38 = new data.EventRegistrationDAO();
        boolean boolean41 = eventRegistrationDAO38.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList42 = eventRegistrationDAO38.getAllEvents();
        model.Registration registration45 = new model.Registration(0, 0);
        int int46 = registration45.getEventId();
        boolean boolean47 = eventRegistrationDAO38.registerStudent(registration45);
        model.Registration registration50 = new model.Registration(0, (int) (byte) -1);
        boolean boolean51 = eventRegistrationDAO38.registerStudent(registration50);
        boolean boolean52 = eventRegistrationDAO12.registerStudent(registration50);
        boolean boolean53 = eventRegistrationDAO0.registerStudent(registration50);
        java.util.List<model.Event> eventList54 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO55 = new data.EventRegistrationDAO();
        model.Event event57 = eventRegistrationDAO55.getEventById((int) (short) 0);
        model.Registration registration60 = new model.Registration((int) (short) 0, 0);
        boolean boolean61 = eventRegistrationDAO55.registerStudent(registration60);
        int int62 = registration60.getEventId();
        boolean boolean63 = eventRegistrationDAO0.registerStudent(registration60);
        data.EventRegistrationDAO eventRegistrationDAO64 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList65 = eventRegistrationDAO64.getAllEvents();
        model.Registration registration68 = new model.Registration((int) (short) 0, 0);
        int int69 = registration68.getEventId();
        boolean boolean70 = eventRegistrationDAO64.registerStudent(registration68);
        int int71 = registration68.getEventId();
        boolean boolean72 = eventRegistrationDAO0.registerStudent(registration68);
        model.Event event74 = eventRegistrationDAO0.getEventById((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertNotNull(event18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(eventList42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(eventList54);
        org.junit.Assert.assertNull(event57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(eventList65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(event74);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        int int14 = event13.getEventId();
        event13.showDetails();
        java.lang.String str16 = event13.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "20/10/2026" + "'", str16, "20/10/2026");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        model.Event event10 = eventRegistrationService0.showEventDetails(32);
        model.Event event12 = eventRegistrationService0.showEventDetails(52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Registration registration15 = new model.Registration(0, 0);
        boolean boolean16 = eventRegistrationDAO11.registerStudent(registration15);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event19 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO23 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList24 = eventRegistrationDAO23.getAllEvents();
        model.Event event26 = eventRegistrationDAO23.getEventById((int) (short) 10);
        model.Registration registration29 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean30 = eventRegistrationDAO23.registerStudent(registration29);
        model.Registration registration33 = new model.Registration((int) (short) 0, 0);
        int int34 = registration33.getEventId();
        boolean boolean35 = eventRegistrationDAO23.registerStudent(registration33);
        boolean boolean38 = eventRegistrationDAO23.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO39 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList40 = eventRegistrationDAO39.getAllEvents();
        model.Event event42 = eventRegistrationDAO39.getEventById((int) (short) 10);
        model.Registration registration45 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean46 = eventRegistrationDAO39.registerStudent(registration45);
        int int47 = registration45.getEventId();
        boolean boolean48 = eventRegistrationDAO23.registerStudent(registration45);
        boolean boolean51 = eventRegistrationDAO23.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration54 = new model.Registration(10, (int) 'a');
        boolean boolean55 = eventRegistrationDAO23.registerStudent(registration54);
        int int56 = registration54.getEventId();
        boolean boolean57 = eventRegistrationDAO0.registerStudent(registration54);
        java.util.List<model.Event> eventList58 = eventRegistrationDAO0.getAllEvents();
        boolean boolean61 = eventRegistrationDAO0.isAlreadyRegistered(52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList40);
        org.junit.Assert.assertNull(event42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(eventList58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        model.Registration registration2 = new model.Registration(0, (int) '#');
        int int3 = registration2.getStudentId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails(1);
        boolean boolean18 = eventRegistrationService0.registerForEvent((int) (byte) 1, 10);
        java.util.List<model.Event> eventList19 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList20 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNotNull(event15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        model.Event event8 = eventRegistrationDAO0.getEventById(1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(event8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getName();
        java.lang.String str11 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        boolean boolean14 = eventRegistrationDAO7.isAlreadyRegistered(10, (int) 'a');
        boolean boolean17 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Registration registration22 = new model.Registration(0, 0);
        boolean boolean23 = eventRegistrationDAO18.registerStudent(registration22);
        boolean boolean24 = eventRegistrationDAO7.registerStudent(registration22);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList27 = eventRegistrationDAO0.getAllEvents();
        boolean boolean30 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 10, 100);
        model.Event event32 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event34 = eventRegistrationDAO0.getEventById((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(eventList26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(event32);
        org.junit.Assert.assertNull(event34);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, 0);
        int int7 = registration6.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        int int9 = registration6.getStudentId();
        int int10 = registration6.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        model.Registration registration2 = new model.Registration(100, (int) (short) 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        model.Event event4 = new model.Event((int) (byte) 10, "20/10/2026", "20/10/2026", "20/10/2026");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        model.Event event4 = new model.Event((int) '#', "", "Lab 101", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) ' ');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        model.Event event4 = new model.Event((int) (short) 0, "20/10/2026", "20/10/2026", "");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        model.Event event15 = eventRegistrationDAO0.getEventById((int) (short) 10);
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration(0, 0);
        boolean boolean5 = eventRegistrationDAO0.registerStudent(registration4);
        model.Registration registration8 = new model.Registration((int) 'a', (int) 'a');
        int int9 = registration8.getStudentId();
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration8);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) -1);
        model.Event event10 = eventRegistrationService0.showEventDetails(100);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) 'a');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById(35);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        model.Event event17 = eventRegistrationDAO0.getEventById((int) (short) -1);
        model.Registration registration20 = new model.Registration(32, (int) '#');
        boolean boolean21 = eventRegistrationDAO0.registerStudent(registration20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        model.Event event4 = new model.Event(0, "", "", "Lab 101");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        model.Registration registration2 = new model.Registration((int) (byte) 0, 35);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        model.Event event10 = eventRegistrationService0.showEventDetails((int) (short) 10);
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (short) 1, 10);
        model.Event event15 = eventRegistrationService0.showEventDetails(97);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(event15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (byte) 10);
        boolean boolean19 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 35);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        boolean boolean24 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (byte) 10, (int) (short) 0);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean19 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 1, (int) '#');
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        boolean boolean23 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList24 = eventRegistrationDAO20.getAllEvents();
        model.Event event26 = eventRegistrationDAO20.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO27 = new data.EventRegistrationDAO();
        boolean boolean30 = eventRegistrationDAO27.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList31 = eventRegistrationDAO27.getAllEvents();
        boolean boolean34 = eventRegistrationDAO27.isAlreadyRegistered(10, (int) 'a');
        boolean boolean37 = eventRegistrationDAO27.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO38 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList39 = eventRegistrationDAO38.getAllEvents();
        model.Registration registration42 = new model.Registration(0, 0);
        boolean boolean43 = eventRegistrationDAO38.registerStudent(registration42);
        boolean boolean44 = eventRegistrationDAO27.registerStudent(registration42);
        boolean boolean45 = eventRegistrationDAO20.registerStudent(registration42);
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration42);
        model.Event event48 = eventRegistrationDAO0.getEventById(0);
        boolean boolean51 = eventRegistrationDAO0.isAlreadyRegistered(52, 35);
        java.util.List<model.Event> eventList52 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertNotNull(event26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(eventList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(event48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(eventList52);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        boolean boolean14 = eventRegistrationDAO7.isAlreadyRegistered(10, (int) 'a');
        boolean boolean17 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Registration registration22 = new model.Registration(0, 0);
        boolean boolean23 = eventRegistrationDAO18.registerStudent(registration22);
        boolean boolean24 = eventRegistrationDAO7.registerStudent(registration22);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        data.EventRegistrationDAO eventRegistrationDAO26 = new data.EventRegistrationDAO();
        boolean boolean29 = eventRegistrationDAO26.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList30 = eventRegistrationDAO26.getAllEvents();
        model.Registration registration33 = new model.Registration(0, 0);
        int int34 = registration33.getEventId();
        boolean boolean35 = eventRegistrationDAO26.registerStudent(registration33);
        model.Registration registration38 = new model.Registration(0, (int) (byte) -1);
        boolean boolean39 = eventRegistrationDAO26.registerStudent(registration38);
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration38);
        data.EventRegistrationDAO eventRegistrationDAO41 = new data.EventRegistrationDAO();
        boolean boolean44 = eventRegistrationDAO41.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event46 = eventRegistrationDAO41.getEventById((int) '#');
        java.util.List<model.Event> eventList47 = eventRegistrationDAO41.getAllEvents();
        boolean boolean50 = eventRegistrationDAO41.isAlreadyRegistered((int) (short) 0, (int) '#');
        data.EventRegistrationDAO eventRegistrationDAO51 = new data.EventRegistrationDAO();
        boolean boolean54 = eventRegistrationDAO51.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList55 = eventRegistrationDAO51.getAllEvents();
        model.Event event57 = eventRegistrationDAO51.getEventById((int) (byte) 1);
        model.Event event59 = eventRegistrationDAO51.getEventById((int) (short) 0);
        model.Registration registration62 = new model.Registration(0, (int) (byte) 100);
        boolean boolean63 = eventRegistrationDAO51.registerStudent(registration62);
        model.Event event65 = eventRegistrationDAO51.getEventById((int) (byte) 0);
        model.Event event67 = eventRegistrationDAO51.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList68 = eventRegistrationDAO51.getAllEvents();
        model.Event event70 = eventRegistrationDAO51.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList71 = eventRegistrationDAO51.getAllEvents();
        model.Registration registration74 = new model.Registration((int) (short) 0, 0);
        int int75 = registration74.getEventId();
        int int76 = registration74.getStudentId();
        boolean boolean77 = eventRegistrationDAO51.registerStudent(registration74);
        boolean boolean78 = eventRegistrationDAO41.registerStudent(registration74);
        boolean boolean79 = eventRegistrationDAO0.registerStudent(registration74);
        model.Event event81 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Registration registration84 = new model.Registration((int) '#', (int) (byte) 0);
        boolean boolean85 = eventRegistrationDAO0.registerStudent(registration84);
        java.util.List<model.Event> eventList86 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(event46);
        org.junit.Assert.assertNotNull(eventList47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(eventList55);
        org.junit.Assert.assertNotNull(event57);
        org.junit.Assert.assertNull(event59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(event65);
        org.junit.Assert.assertNull(event67);
        org.junit.Assert.assertNotNull(eventList68);
        org.junit.Assert.assertNull(event70);
        org.junit.Assert.assertNotNull(eventList71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(event81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(eventList86);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Registration registration15 = new model.Registration(0, 0);
        boolean boolean16 = eventRegistrationDAO11.registerStudent(registration15);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO0.registerStudent(registration20);
        int int22 = registration20.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean12 = eventRegistrationService0.registerForEvent(100, 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) (byte) 1, 52);
        java.util.List<model.Event> eventList17 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList18 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNotNull(eventList18);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        model.Registration registration26 = new model.Registration((int) (short) 0, 0);
        int int27 = registration26.getEventId();
        boolean boolean28 = eventRegistrationDAO16.registerStudent(registration26);
        boolean boolean31 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO32 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList33 = eventRegistrationDAO32.getAllEvents();
        model.Event event35 = eventRegistrationDAO32.getEventById((int) (short) 10);
        model.Registration registration38 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean39 = eventRegistrationDAO32.registerStudent(registration38);
        int int40 = registration38.getEventId();
        boolean boolean41 = eventRegistrationDAO16.registerStudent(registration38);
        int int42 = registration38.getStudentId();
        boolean boolean43 = eventRegistrationDAO0.registerStudent(registration38);
        java.util.List<model.Event> eventList44 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO45 = new data.EventRegistrationDAO();
        boolean boolean48 = eventRegistrationDAO45.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO49 = new data.EventRegistrationDAO();
        boolean boolean52 = eventRegistrationDAO49.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList53 = eventRegistrationDAO49.getAllEvents();
        boolean boolean56 = eventRegistrationDAO49.isAlreadyRegistered(10, (int) 'a');
        boolean boolean59 = eventRegistrationDAO49.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO60 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList61 = eventRegistrationDAO60.getAllEvents();
        model.Registration registration64 = new model.Registration(0, 0);
        boolean boolean65 = eventRegistrationDAO60.registerStudent(registration64);
        boolean boolean66 = eventRegistrationDAO49.registerStudent(registration64);
        model.Registration registration69 = new model.Registration((int) (byte) -1, (int) '#');
        int int70 = registration69.getEventId();
        boolean boolean71 = eventRegistrationDAO49.registerStudent(registration69);
        boolean boolean72 = eventRegistrationDAO45.registerStudent(registration69);
        int int73 = registration69.getEventId();
        boolean boolean74 = eventRegistrationDAO0.registerStudent(registration69);
        model.Event event76 = eventRegistrationDAO0.getEventById((int) '#');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNull(event35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(eventList44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(eventList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(eventList61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(event76);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent(1, (int) (byte) 100);
        boolean boolean16 = eventRegistrationService0.registerForEvent(100, 1);
        model.Event event18 = eventRegistrationService0.showEventDetails((int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(event18);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration(0, 0);
        boolean boolean5 = eventRegistrationDAO0.registerStudent(registration4);
        data.EventRegistrationDAO eventRegistrationDAO6 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO6.getAllEvents();
        model.Event event9 = eventRegistrationDAO6.getEventById((int) (short) 10);
        model.Registration registration12 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean13 = eventRegistrationDAO6.registerStudent(registration12);
        model.Registration registration16 = new model.Registration((int) (short) 0, 0);
        int int17 = registration16.getEventId();
        boolean boolean18 = eventRegistrationDAO6.registerStudent(registration16);
        boolean boolean19 = eventRegistrationDAO0.registerStudent(registration16);
        java.util.List<model.Event> eventList20 = eventRegistrationDAO0.getAllEvents();
        boolean boolean23 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (-1));
        model.Event event25 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(event25);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        boolean boolean14 = eventRegistrationDAO7.isAlreadyRegistered(10, (int) 'a');
        boolean boolean17 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Registration registration22 = new model.Registration(0, 0);
        boolean boolean23 = eventRegistrationDAO18.registerStudent(registration22);
        boolean boolean24 = eventRegistrationDAO7.registerStudent(registration22);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList27 = eventRegistrationDAO0.getAllEvents();
        model.Event event29 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(eventList26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertNull(event29);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList8 = eventRegistrationDAO7.getAllEvents();
        model.Event event10 = eventRegistrationDAO7.getEventById((int) (short) 10);
        model.Registration registration13 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean14 = eventRegistrationDAO7.registerStudent(registration13);
        model.Registration registration17 = new model.Registration((int) (short) 0, 0);
        int int18 = registration17.getEventId();
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration17);
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration17);
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        model.Event event23 = eventRegistrationDAO0.getEventById(32);
        model.Event event25 = eventRegistrationDAO0.getEventById(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertNull(event25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        model.Event event17 = eventRegistrationDAO0.getEventById((int) 'a');
        model.Event event19 = eventRegistrationDAO0.getEventById(1);
        boolean boolean22 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 100, 35);
        model.Registration registration25 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean26 = eventRegistrationDAO0.registerStudent(registration25);
        model.Event event28 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        model.Event event30 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        model.Registration registration33 = new model.Registration(0, 35);
        int int34 = registration33.getEventId();
        boolean boolean35 = eventRegistrationDAO0.registerStudent(registration33);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(event28);
        org.junit.Assert.assertNull(event30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Registration registration9 = new model.Registration(0, (int) '#');
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration9);
        int int11 = registration9.getEventId();
        int int12 = registration9.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str15 = event14.getName();
        java.lang.String str16 = event14.getName();
        event14.showDetails();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AI Workshop" + "'", str15, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AI Workshop" + "'", str16, "AI Workshop");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) ' ', (int) 'a');
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass10 = eventList9.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered(1, 10);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList16 = eventRegistrationDAO12.getAllEvents();
        model.Event event18 = eventRegistrationDAO12.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO19 = new data.EventRegistrationDAO();
        boolean boolean22 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO19.getAllEvents();
        boolean boolean26 = eventRegistrationDAO19.isAlreadyRegistered(10, (int) 'a');
        boolean boolean29 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Registration registration34 = new model.Registration(0, 0);
        boolean boolean35 = eventRegistrationDAO30.registerStudent(registration34);
        boolean boolean36 = eventRegistrationDAO19.registerStudent(registration34);
        boolean boolean37 = eventRegistrationDAO12.registerStudent(registration34);
        data.EventRegistrationDAO eventRegistrationDAO38 = new data.EventRegistrationDAO();
        boolean boolean41 = eventRegistrationDAO38.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList42 = eventRegistrationDAO38.getAllEvents();
        model.Registration registration45 = new model.Registration(0, 0);
        int int46 = registration45.getEventId();
        boolean boolean47 = eventRegistrationDAO38.registerStudent(registration45);
        model.Registration registration50 = new model.Registration(0, (int) (byte) -1);
        boolean boolean51 = eventRegistrationDAO38.registerStudent(registration50);
        boolean boolean52 = eventRegistrationDAO12.registerStudent(registration50);
        boolean boolean53 = eventRegistrationDAO0.registerStudent(registration50);
        java.util.List<model.Event> eventList54 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList55 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertNotNull(event18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(eventList42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(eventList54);
        org.junit.Assert.assertNotNull(eventList55);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO5 = new data.EventRegistrationDAO();
        boolean boolean8 = eventRegistrationDAO5.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO5.getAllEvents();
        model.Registration registration12 = new model.Registration(0, 0);
        int int13 = registration12.getEventId();
        boolean boolean14 = eventRegistrationDAO5.registerStudent(registration12);
        boolean boolean17 = eventRegistrationDAO5.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        boolean boolean21 = eventRegistrationDAO18.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO18.getAllEvents();
        model.Event event24 = eventRegistrationDAO18.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO25 = new data.EventRegistrationDAO();
        boolean boolean28 = eventRegistrationDAO25.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList29 = eventRegistrationDAO25.getAllEvents();
        boolean boolean32 = eventRegistrationDAO25.isAlreadyRegistered(10, (int) 'a');
        boolean boolean35 = eventRegistrationDAO25.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO36 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList37 = eventRegistrationDAO36.getAllEvents();
        model.Registration registration40 = new model.Registration(0, 0);
        boolean boolean41 = eventRegistrationDAO36.registerStudent(registration40);
        boolean boolean42 = eventRegistrationDAO25.registerStudent(registration40);
        boolean boolean43 = eventRegistrationDAO18.registerStudent(registration40);
        int int44 = registration40.getEventId();
        boolean boolean45 = eventRegistrationDAO5.registerStudent(registration40);
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration40);
        boolean boolean49 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, (int) (byte) -1);
        data.EventRegistrationDAO eventRegistrationDAO50 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList51 = eventRegistrationDAO50.getAllEvents();
        model.Registration registration54 = new model.Registration((int) (short) 0, 0);
        int int55 = registration54.getEventId();
        boolean boolean56 = eventRegistrationDAO50.registerStudent(registration54);
        model.Event event58 = eventRegistrationDAO50.getEventById((int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO59 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList60 = eventRegistrationDAO59.getAllEvents();
        model.Registration registration63 = new model.Registration((int) (short) 0, 0);
        int int64 = registration63.getEventId();
        boolean boolean65 = eventRegistrationDAO59.registerStudent(registration63);
        model.Registration registration68 = new model.Registration(0, (int) '#');
        boolean boolean69 = eventRegistrationDAO59.registerStudent(registration68);
        int int70 = registration68.getEventId();
        boolean boolean71 = eventRegistrationDAO50.registerStudent(registration68);
        boolean boolean72 = eventRegistrationDAO0.registerStudent(registration68);
        int int73 = registration68.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertNotNull(event24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(eventList29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(eventList37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(eventList51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(event58);
        org.junit.Assert.assertNotNull(eventList60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event17 = eventRegistrationService0.showEventDetails((int) (byte) -1);
        model.Event event19 = eventRegistrationService0.showEventDetails(35);
        model.Event event21 = eventRegistrationService0.showEventDetails(52);
        model.Event event23 = eventRegistrationService0.showEventDetails(1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(event23);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        model.Event event4 = new model.Event(97, "20/10/2026", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO8 = new data.EventRegistrationDAO();
        boolean boolean11 = eventRegistrationDAO8.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO8.getAllEvents();
        model.Event event14 = eventRegistrationDAO8.getEventById((int) (byte) 1);
        model.Event event16 = eventRegistrationDAO8.getEventById((int) (short) 0);
        model.Registration registration19 = new model.Registration(0, (int) (byte) 100);
        boolean boolean20 = eventRegistrationDAO8.registerStudent(registration19);
        model.Event event22 = eventRegistrationDAO8.getEventById((int) (byte) 0);
        model.Registration registration25 = new model.Registration(0, (int) '#');
        int int26 = registration25.getEventId();
        boolean boolean27 = eventRegistrationDAO8.registerStudent(registration25);
        boolean boolean28 = eventRegistrationDAO0.registerStudent(registration25);
        data.EventRegistrationDAO eventRegistrationDAO29 = new data.EventRegistrationDAO();
        boolean boolean32 = eventRegistrationDAO29.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList33 = eventRegistrationDAO29.getAllEvents();
        model.Event event35 = eventRegistrationDAO29.getEventById((int) (byte) 1);
        model.Event event37 = eventRegistrationDAO29.getEventById((-1));
        data.EventRegistrationDAO eventRegistrationDAO38 = new data.EventRegistrationDAO();
        model.Event event40 = eventRegistrationDAO38.getEventById((int) (short) 0);
        model.Registration registration43 = new model.Registration((int) (short) 0, 0);
        boolean boolean44 = eventRegistrationDAO38.registerStudent(registration43);
        boolean boolean45 = eventRegistrationDAO29.registerStudent(registration43);
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(event22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNotNull(event35);
        org.junit.Assert.assertNull(event37);
        org.junit.Assert.assertNull(event40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById(35);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) (short) 10);
        java.util.List<model.Event> eventList19 = eventRegistrationDAO0.getAllEvents();
        model.Event event21 = eventRegistrationDAO0.getEventById(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        model.Event event16 = eventRegistrationDAO0.getEventById(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        boolean boolean4 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) ' ');
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        model.Event event16 = eventRegistrationDAO0.getEventById((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        boolean boolean14 = eventRegistrationDAO7.isAlreadyRegistered(10, (int) 'a');
        boolean boolean17 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Registration registration22 = new model.Registration(0, 0);
        boolean boolean23 = eventRegistrationDAO18.registerStudent(registration22);
        boolean boolean24 = eventRegistrationDAO7.registerStudent(registration22);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList27 = eventRegistrationDAO0.getAllEvents();
        boolean boolean30 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 10, 100);
        model.Event event32 = eventRegistrationDAO0.getEventById((int) (short) 100);
        boolean boolean35 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(eventList26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(event32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        int int24 = registration22.getEventId();
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        model.Event event27 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration30 = new model.Registration(0, (int) '#');
        int int31 = registration30.getStudentId();
        boolean boolean32 = eventRegistrationDAO0.registerStudent(registration30);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(event27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        model.Event event4 = new model.Event((int) ' ', "", "hi!", "AI Workshop");
        int int5 = event4.getEventId();
        event4.showDetails();
        java.lang.String str7 = event4.getLocation();
        int int8 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails((int) '#');
        boolean boolean16 = eventRegistrationService0.registerForEvent(0, 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        model.Event event4 = new model.Event((int) (short) 1, "", "Lab 101", "hi!");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        model.Event event4 = new model.Event(32, "AI Workshop", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (byte) 10);
        boolean boolean19 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 35);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        model.Event event23 = eventRegistrationDAO0.getEventById((int) '#');
        model.Registration registration26 = new model.Registration(100, 100);
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        model.Event event9 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(event9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        model.Registration registration26 = new model.Registration((int) (short) 0, 0);
        int int27 = registration26.getEventId();
        boolean boolean28 = eventRegistrationDAO16.registerStudent(registration26);
        boolean boolean31 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO32 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList33 = eventRegistrationDAO32.getAllEvents();
        model.Event event35 = eventRegistrationDAO32.getEventById((int) (short) 10);
        model.Registration registration38 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean39 = eventRegistrationDAO32.registerStudent(registration38);
        int int40 = registration38.getEventId();
        boolean boolean41 = eventRegistrationDAO16.registerStudent(registration38);
        int int42 = registration38.getStudentId();
        boolean boolean43 = eventRegistrationDAO0.registerStudent(registration38);
        data.EventRegistrationDAO eventRegistrationDAO44 = new data.EventRegistrationDAO();
        model.Event event46 = eventRegistrationDAO44.getEventById((int) (short) 0);
        model.Registration registration49 = new model.Registration((int) (short) 0, 0);
        boolean boolean50 = eventRegistrationDAO44.registerStudent(registration49);
        boolean boolean51 = eventRegistrationDAO0.registerStudent(registration49);
        model.Event event53 = eventRegistrationDAO0.getEventById(0);
        data.EventRegistrationDAO eventRegistrationDAO54 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList55 = eventRegistrationDAO54.getAllEvents();
        model.Event event57 = eventRegistrationDAO54.getEventById((int) (short) 10);
        model.Registration registration60 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean61 = eventRegistrationDAO54.registerStudent(registration60);
        model.Registration registration64 = new model.Registration((int) (short) 0, 0);
        int int65 = registration64.getEventId();
        boolean boolean66 = eventRegistrationDAO54.registerStudent(registration64);
        boolean boolean69 = eventRegistrationDAO54.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO70 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList71 = eventRegistrationDAO70.getAllEvents();
        model.Event event73 = eventRegistrationDAO70.getEventById((int) (short) 10);
        model.Registration registration76 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean77 = eventRegistrationDAO70.registerStudent(registration76);
        int int78 = registration76.getEventId();
        boolean boolean79 = eventRegistrationDAO54.registerStudent(registration76);
        boolean boolean82 = eventRegistrationDAO54.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration85 = new model.Registration(10, (int) 'a');
        boolean boolean86 = eventRegistrationDAO54.registerStudent(registration85);
        int int87 = registration85.getEventId();
        int int88 = registration85.getStudentId();
        boolean boolean89 = eventRegistrationDAO0.registerStudent(registration85);
        int int90 = registration85.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNull(event35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(event46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(event53);
        org.junit.Assert.assertNotNull(eventList55);
        org.junit.Assert.assertNull(event57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(eventList71);
        org.junit.Assert.assertNull(event73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 97 + "'", int87 == 97);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(1);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) '#', (int) (short) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered(100, (int) (short) 0);
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered(97, 35);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (short) 10);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO4 = new data.EventRegistrationDAO();
        boolean boolean7 = eventRegistrationDAO4.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList8 = eventRegistrationDAO4.getAllEvents();
        boolean boolean11 = eventRegistrationDAO4.isAlreadyRegistered(10, (int) 'a');
        boolean boolean14 = eventRegistrationDAO4.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO15 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList16 = eventRegistrationDAO15.getAllEvents();
        model.Registration registration19 = new model.Registration(0, 0);
        boolean boolean20 = eventRegistrationDAO15.registerStudent(registration19);
        boolean boolean21 = eventRegistrationDAO4.registerStudent(registration19);
        model.Registration registration24 = new model.Registration((int) (byte) -1, (int) '#');
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO4.registerStudent(registration24);
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration24);
        java.util.List<model.Event> eventList28 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO29 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList30 = eventRegistrationDAO29.getAllEvents();
        model.Event event32 = eventRegistrationDAO29.getEventById((int) (short) 10);
        model.Registration registration35 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean36 = eventRegistrationDAO29.registerStudent(registration35);
        model.Registration registration39 = new model.Registration((int) (short) 0, 0);
        int int40 = registration39.getEventId();
        boolean boolean41 = eventRegistrationDAO29.registerStudent(registration39);
        model.Registration registration44 = new model.Registration((int) (byte) 100, (int) (short) 0);
        boolean boolean45 = eventRegistrationDAO29.registerStudent(registration44);
        int int46 = registration44.getEventId();
        int int47 = registration44.getStudentId();
        int int48 = registration44.getStudentId();
        boolean boolean49 = eventRegistrationDAO0.registerStudent(registration44);
        java.util.List<model.Event> eventList50 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertNotNull(eventList30);
        org.junit.Assert.assertNull(event32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(eventList50);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        model.Event event14 = eventRegistrationService0.showEventDetails(1);
        event14.showDetails();
        int int16 = event14.getEventId();
        java.lang.String str17 = event14.getLocation();
        int int18 = event14.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lab 101" + "'", str17, "Lab 101");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        model.Registration registration2 = new model.Registration((int) (short) 100, 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        model.Event event4 = new model.Event((int) (short) 1, "20/10/2026", "Lab 101", "hi!");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        event4.showDetails();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getName();
        java.lang.String str11 = event4.getName();
        java.lang.String str12 = event4.getName();
        java.lang.String str13 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getDate();
        java.lang.String str12 = event4.getLocation();
        event4.showDetails();
        int int14 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "hi!");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Registration registration17 = new model.Registration(0, (int) '#');
        int int18 = registration17.getEventId();
        boolean boolean19 = eventRegistrationDAO0.registerStudent(registration17);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList23 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertNotNull(eventList23);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        model.Event event4 = new model.Event(32, "AI Workshop", "hi!", "20/10/2026");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        model.Event event4 = new model.Event(97, "hi!", "Lab 101", "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        model.Event event17 = eventRegistrationDAO0.getEventById((int) 'a');
        model.Event event19 = eventRegistrationDAO0.getEventById(1);
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList21 = eventRegistrationDAO20.getAllEvents();
        model.Registration registration24 = new model.Registration((int) (short) 0, 0);
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO20.registerStudent(registration24);
        int int27 = registration24.getEventId();
        int int28 = registration24.getStudentId();
        int int29 = registration24.getStudentId();
        boolean boolean30 = eventRegistrationDAO0.registerStudent(registration24);
        model.Event event32 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(event32);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 10, 52);
        model.Event event12 = eventRegistrationService0.showEventDetails(10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent(100, (int) (short) 1);
        model.Event event18 = eventRegistrationService0.showEventDetails(32);
        boolean boolean21 = eventRegistrationService0.registerForEvent((int) ' ', (int) '#');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(event18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) (byte) 0, 32);
        boolean boolean20 = eventRegistrationService0.registerForEvent((int) 'a', (-1));
        java.lang.Class<?> wildcardClass21 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        model.Registration registration26 = new model.Registration((int) (short) 0, 0);
        int int27 = registration26.getEventId();
        boolean boolean28 = eventRegistrationDAO16.registerStudent(registration26);
        boolean boolean31 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO32 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList33 = eventRegistrationDAO32.getAllEvents();
        model.Event event35 = eventRegistrationDAO32.getEventById((int) (short) 10);
        model.Registration registration38 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean39 = eventRegistrationDAO32.registerStudent(registration38);
        int int40 = registration38.getEventId();
        boolean boolean41 = eventRegistrationDAO16.registerStudent(registration38);
        int int42 = registration38.getStudentId();
        boolean boolean43 = eventRegistrationDAO0.registerStudent(registration38);
        model.Event event45 = eventRegistrationDAO0.getEventById(97);
        java.util.List<model.Event> eventList46 = eventRegistrationDAO0.getAllEvents();
        boolean boolean49 = eventRegistrationDAO0.isAlreadyRegistered(10, 10);
        java.lang.Class<?> wildcardClass50 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNull(event35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(event45);
        org.junit.Assert.assertNotNull(eventList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO8 = new data.EventRegistrationDAO();
        boolean boolean11 = eventRegistrationDAO8.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO8.getAllEvents();
        model.Event event14 = eventRegistrationDAO8.getEventById((int) (byte) 1);
        model.Event event16 = eventRegistrationDAO8.getEventById((int) (short) 0);
        model.Registration registration19 = new model.Registration(0, (int) (byte) 100);
        boolean boolean20 = eventRegistrationDAO8.registerStudent(registration19);
        model.Event event22 = eventRegistrationDAO8.getEventById((int) (byte) 0);
        model.Registration registration25 = new model.Registration(0, (int) '#');
        int int26 = registration25.getEventId();
        boolean boolean27 = eventRegistrationDAO8.registerStudent(registration25);
        boolean boolean28 = eventRegistrationDAO0.registerStudent(registration25);
        java.util.List<model.Event> eventList29 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(event22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(eventList29);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        model.Event event4 = new model.Event((int) '#', "", "Lab 101", "");
        int int5 = event4.getEventId();
        event4.showDetails();
        event4.showDetails();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        java.lang.Class<?> wildcardClass7 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (short) 10);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        int int14 = event13.getEventId();
        int int15 = event13.getEventId();
        java.lang.String str16 = event13.getName();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AI Workshop" + "'", str16, "AI Workshop");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        model.Registration registration2 = new model.Registration(97, (int) '4');
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, 0);
        int int7 = registration6.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList13 = eventRegistrationDAO12.getAllEvents();
        model.Event event15 = eventRegistrationDAO12.getEventById((int) (short) 10);
        model.Registration registration18 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean19 = eventRegistrationDAO12.registerStudent(registration18);
        model.Registration registration22 = new model.Registration((int) (short) 0, 0);
        int int23 = registration22.getEventId();
        boolean boolean24 = eventRegistrationDAO12.registerStudent(registration22);
        boolean boolean27 = eventRegistrationDAO12.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration30 = new model.Registration(0, (int) (short) 10);
        boolean boolean31 = eventRegistrationDAO12.registerStudent(registration30);
        data.EventRegistrationDAO eventRegistrationDAO32 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList33 = eventRegistrationDAO32.getAllEvents();
        model.Event event35 = eventRegistrationDAO32.getEventById((int) (short) 10);
        model.Registration registration38 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean39 = eventRegistrationDAO32.registerStudent(registration38);
        model.Registration registration42 = new model.Registration((int) (short) 0, 0);
        int int43 = registration42.getEventId();
        boolean boolean44 = eventRegistrationDAO32.registerStudent(registration42);
        boolean boolean47 = eventRegistrationDAO32.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO48 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList49 = eventRegistrationDAO48.getAllEvents();
        model.Event event51 = eventRegistrationDAO48.getEventById((int) (short) 10);
        model.Registration registration54 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean55 = eventRegistrationDAO48.registerStudent(registration54);
        model.Registration registration58 = new model.Registration((int) (short) 0, 0);
        int int59 = registration58.getEventId();
        boolean boolean60 = eventRegistrationDAO48.registerStudent(registration58);
        boolean boolean63 = eventRegistrationDAO48.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO64 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList65 = eventRegistrationDAO64.getAllEvents();
        model.Event event67 = eventRegistrationDAO64.getEventById((int) (short) 10);
        model.Registration registration70 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean71 = eventRegistrationDAO64.registerStudent(registration70);
        int int72 = registration70.getEventId();
        boolean boolean73 = eventRegistrationDAO48.registerStudent(registration70);
        int int74 = registration70.getStudentId();
        boolean boolean75 = eventRegistrationDAO32.registerStudent(registration70);
        boolean boolean76 = eventRegistrationDAO12.registerStudent(registration70);
        int int77 = registration70.getEventId();
        boolean boolean78 = eventRegistrationDAO0.registerStudent(registration70);
        int int79 = registration70.getEventId();
        int int80 = registration70.getEventId();
        int int81 = registration70.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNull(event35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(eventList49);
        org.junit.Assert.assertNull(event51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(eventList65);
        org.junit.Assert.assertNull(event67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 35 + "'", int77 == 35);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 35 + "'", int80 == 35);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        int int13 = registration11.getEventId();
        int int14 = registration11.getStudentId();
        int int15 = registration11.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent(35, (int) '#');
        model.Event event10 = eventRegistrationService0.showEventDetails(1);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        model.Event event15 = eventRegistrationService0.showEventDetails(35);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(event10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNull(event15);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        event4.showDetails();
        java.lang.String str13 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        model.Event event4 = new model.Event((-1), "20/10/2026", "AI Workshop", "");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        int int24 = registration22.getEventId();
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        boolean boolean28 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', 1);
        model.Event event30 = eventRegistrationDAO0.getEventById((int) (short) 100);
        boolean boolean33 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (short) 10);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(event30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO9 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList10 = eventRegistrationDAO9.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (short) 0, 0);
        int int14 = registration13.getEventId();
        boolean boolean15 = eventRegistrationDAO9.registerStudent(registration13);
        model.Registration registration18 = new model.Registration(0, (int) '#');
        boolean boolean19 = eventRegistrationDAO9.registerStudent(registration18);
        int int20 = registration18.getEventId();
        boolean boolean21 = eventRegistrationDAO0.registerStudent(registration18);
        java.lang.Class<?> wildcardClass22 = registration18.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList17 = eventRegistrationDAO16.getAllEvents();
        model.Event event19 = eventRegistrationDAO16.getEventById((int) (short) 10);
        model.Registration registration22 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean23 = eventRegistrationDAO16.registerStudent(registration22);
        int int24 = registration22.getEventId();
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        model.Event event27 = eventRegistrationDAO0.getEventById((int) ' ');
        model.Registration registration30 = new model.Registration((int) '#', 35);
        int int31 = registration30.getEventId();
        boolean boolean32 = eventRegistrationDAO0.registerStudent(registration30);
        int int33 = registration30.getStudentId();
        int int34 = registration30.getStudentId();
        int int35 = registration30.getStudentId();
        int int36 = registration30.getEventId();
        int int37 = registration30.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(event27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        model.Event event4 = new model.Event(100, "Lab 101", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        model.Event event5 = eventRegistrationService0.showEventDetails(35);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean12 = eventRegistrationService0.registerForEvent(100, 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        int int7 = event4.getEventId();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AI Workshop" + "'", str9, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AI Workshop" + "'", str11, "AI Workshop");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Registration registration17 = new model.Registration(0, 0);
        boolean boolean18 = eventRegistrationDAO0.registerStudent(registration17);
        int int19 = registration17.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 1);
        model.Event event16 = eventRegistrationService0.showEventDetails(52);
        boolean boolean19 = eventRegistrationService0.registerForEvent((int) '4', (int) (short) 10);
        model.Event event21 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        boolean boolean24 = eventRegistrationService0.registerForEvent(32, 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 1);
        model.Event event16 = eventRegistrationService0.showEventDetails(52);
        boolean boolean19 = eventRegistrationService0.registerForEvent((int) '4', (int) (short) 10);
        boolean boolean22 = eventRegistrationService0.registerForEvent(32, 35);
        java.util.List<model.Event> eventList23 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList24 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertNotNull(eventList24);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Registration registration15 = new model.Registration(0, 0);
        boolean boolean16 = eventRegistrationDAO11.registerStudent(registration15);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration15);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO0.registerStudent(registration20);
        data.EventRegistrationDAO eventRegistrationDAO22 = new data.EventRegistrationDAO();
        boolean boolean25 = eventRegistrationDAO22.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList26 = eventRegistrationDAO22.getAllEvents();
        model.Registration registration29 = new model.Registration(0, 0);
        int int30 = registration29.getEventId();
        boolean boolean31 = eventRegistrationDAO22.registerStudent(registration29);
        boolean boolean34 = eventRegistrationDAO22.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO35 = new data.EventRegistrationDAO();
        boolean boolean38 = eventRegistrationDAO35.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList39 = eventRegistrationDAO35.getAllEvents();
        model.Event event41 = eventRegistrationDAO35.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO42 = new data.EventRegistrationDAO();
        boolean boolean45 = eventRegistrationDAO42.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList46 = eventRegistrationDAO42.getAllEvents();
        boolean boolean49 = eventRegistrationDAO42.isAlreadyRegistered(10, (int) 'a');
        boolean boolean52 = eventRegistrationDAO42.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO53 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList54 = eventRegistrationDAO53.getAllEvents();
        model.Registration registration57 = new model.Registration(0, 0);
        boolean boolean58 = eventRegistrationDAO53.registerStudent(registration57);
        boolean boolean59 = eventRegistrationDAO42.registerStudent(registration57);
        boolean boolean60 = eventRegistrationDAO35.registerStudent(registration57);
        int int61 = registration57.getEventId();
        boolean boolean62 = eventRegistrationDAO22.registerStudent(registration57);
        boolean boolean63 = eventRegistrationDAO0.registerStudent(registration57);
        int int64 = registration57.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(eventList26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList39);
        org.junit.Assert.assertNotNull(event41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(eventList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(eventList54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }
}

