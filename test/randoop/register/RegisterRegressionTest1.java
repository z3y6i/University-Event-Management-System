package randoop.register;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterRegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        model.Event event4 = new model.Event(0, "", "", "20/10/2026");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, (int) (byte) 1);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        model.Event event10 = eventRegistrationService0.showEventDetails(35);
        model.Event event12 = eventRegistrationService0.showEventDetails(10);
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        model.Registration registration2 = new model.Registration((int) (short) -1, 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        model.Event event4 = new model.Event((int) (byte) 1, "", "hi!", "hi!");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        model.Event event4 = new model.Event((int) ' ', "20/10/2026", "Lab 101", "");
        event4.showDetails();
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getName();
        int int12 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration(0, (int) (byte) 100);
        int int6 = registration5.getStudentId();
        int int7 = registration5.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration5);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass12 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        model.Event event4 = new model.Event(52, "AI Workshop", "", "20/10/2026");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration(0, (int) (byte) 100);
        int int11 = registration10.getStudentId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) 'a');
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean7 = eventRegistrationService0.registerForEvent(97, (int) (short) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        model.Event event27 = eventRegistrationDAO0.getEventById(0);
        java.util.List<model.Event> eventList28 = eventRegistrationDAO0.getAllEvents();
        model.Event event30 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.util.List<model.Event> eventList31 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(event30);
        org.junit.Assert.assertNotNull(eventList31);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.String str20 = event19.getDate();
        java.lang.String str21 = event19.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "20/10/2026" + "'", str20, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20/10/2026" + "'", str21, "20/10/2026");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, (int) (byte) 1);
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) '4');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        model.Event event21 = eventRegistrationDAO0.getEventById(100);
        model.Registration registration24 = new model.Registration(32, 32);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str9 = event4.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AI Workshop" + "'", str9, "AI Workshop");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        model.Event event10 = eventRegistrationService0.showEventDetails(35);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        data.EventRegistrationDAO eventRegistrationDAO4 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO4.getAllEvents();
        model.Event event7 = eventRegistrationDAO4.getEventById((int) (short) 10);
        model.Registration registration10 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean11 = eventRegistrationDAO4.registerStudent(registration10);
        int int12 = registration10.getStudentId();
        boolean boolean13 = eventRegistrationDAO0.registerStudent(registration10);
        int int14 = registration10.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        int int26 = registration22.getStudentId();
        int int27 = registration22.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList16 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(eventList16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        model.Event event29 = eventRegistrationDAO0.getEventById((int) (short) 100);
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
        org.junit.Assert.assertNull(event29);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str6 = event5.getName();
        java.lang.String str7 = event5.getLocation();
        int int8 = event5.getEventId();
        int int9 = event5.getEventId();
        java.lang.String str10 = event5.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20/10/2026" + "'", str10, "20/10/2026");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        model.Registration registration2 = new model.Registration((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO0.getAllEvents();
        boolean boolean8 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(event10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        model.Registration registration2 = new model.Registration(10, (int) 'a');
        int int3 = registration2.getStudentId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        int int7 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent(0, 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(10);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        boolean boolean4 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent((-1), 1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        boolean boolean19 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList20 = eventRegistrationDAO16.getAllEvents();
        boolean boolean23 = eventRegistrationDAO16.isAlreadyRegistered(10, (int) 'a');
        boolean boolean26 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO27 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList28 = eventRegistrationDAO27.getAllEvents();
        model.Registration registration31 = new model.Registration(0, 0);
        boolean boolean32 = eventRegistrationDAO27.registerStudent(registration31);
        boolean boolean33 = eventRegistrationDAO16.registerStudent(registration31);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        int int37 = registration36.getEventId();
        boolean boolean38 = eventRegistrationDAO16.registerStudent(registration36);
        boolean boolean39 = eventRegistrationDAO12.registerStudent(registration36);
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration36);
        boolean boolean43 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass44 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        data.EventRegistrationDAO eventRegistrationDAO28 = new data.EventRegistrationDAO();
        boolean boolean31 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList32 = eventRegistrationDAO28.getAllEvents();
        boolean boolean35 = eventRegistrationDAO28.isAlreadyRegistered(10, (int) 'a');
        boolean boolean38 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO39 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList40 = eventRegistrationDAO39.getAllEvents();
        model.Registration registration43 = new model.Registration(0, 0);
        boolean boolean44 = eventRegistrationDAO39.registerStudent(registration43);
        boolean boolean45 = eventRegistrationDAO28.registerStudent(registration43);
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration43);
        model.Event event48 = eventRegistrationDAO0.getEventById(0);
        data.EventRegistrationDAO eventRegistrationDAO49 = new data.EventRegistrationDAO();
        boolean boolean52 = eventRegistrationDAO49.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList53 = eventRegistrationDAO49.getAllEvents();
        model.Event event55 = eventRegistrationDAO49.getEventById((int) (byte) 1);
        model.Registration registration58 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int59 = registration58.getEventId();
        boolean boolean60 = eventRegistrationDAO49.registerStudent(registration58);
        data.EventRegistrationDAO eventRegistrationDAO61 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList62 = eventRegistrationDAO61.getAllEvents();
        model.Event event64 = eventRegistrationDAO61.getEventById((int) (short) 10);
        model.Registration registration67 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean68 = eventRegistrationDAO61.registerStudent(registration67);
        model.Registration registration71 = new model.Registration((int) (short) 0, 0);
        int int72 = registration71.getEventId();
        boolean boolean73 = eventRegistrationDAO61.registerStudent(registration71);
        boolean boolean76 = eventRegistrationDAO61.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO77 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList78 = eventRegistrationDAO77.getAllEvents();
        model.Event event80 = eventRegistrationDAO77.getEventById((int) (short) 10);
        model.Registration registration83 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean84 = eventRegistrationDAO77.registerStudent(registration83);
        int int85 = registration83.getEventId();
        boolean boolean86 = eventRegistrationDAO61.registerStudent(registration83);
        boolean boolean87 = eventRegistrationDAO49.registerStudent(registration83);
        boolean boolean88 = eventRegistrationDAO0.registerStudent(registration83);
        java.util.List<model.Event> eventList89 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(event48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(eventList53);
        org.junit.Assert.assertNotNull(event55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(eventList62);
        org.junit.Assert.assertNull(event64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(eventList78);
        org.junit.Assert.assertNull(event80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 35 + "'", int85 == 35);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(eventList89);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        int int22 = registration19.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        int int11 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent(1, (int) (byte) 100);
        model.Event event15 = eventRegistrationService0.showEventDetails(52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(event15);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        model.Event event4 = new model.Event(0, "hi!", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (byte) 10);
        boolean boolean19 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 1, (int) '4');
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) 'a');
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (byte) 0, 97);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        model.Registration registration2 = new model.Registration(35, (int) '4');
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        boolean boolean19 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList20 = eventRegistrationDAO16.getAllEvents();
        boolean boolean23 = eventRegistrationDAO16.isAlreadyRegistered(10, (int) 'a');
        boolean boolean26 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO27 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList28 = eventRegistrationDAO27.getAllEvents();
        model.Registration registration31 = new model.Registration(0, 0);
        boolean boolean32 = eventRegistrationDAO27.registerStudent(registration31);
        boolean boolean33 = eventRegistrationDAO16.registerStudent(registration31);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        int int37 = registration36.getEventId();
        boolean boolean38 = eventRegistrationDAO16.registerStudent(registration36);
        boolean boolean39 = eventRegistrationDAO12.registerStudent(registration36);
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration36);
        boolean boolean43 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 1);
        data.EventRegistrationDAO eventRegistrationDAO44 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList45 = eventRegistrationDAO44.getAllEvents();
        model.Event event47 = eventRegistrationDAO44.getEventById((int) (short) 10);
        model.Registration registration50 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean51 = eventRegistrationDAO44.registerStudent(registration50);
        model.Registration registration54 = new model.Registration((int) (short) 0, 0);
        int int55 = registration54.getEventId();
        boolean boolean56 = eventRegistrationDAO44.registerStudent(registration54);
        boolean boolean59 = eventRegistrationDAO44.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO60 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList61 = eventRegistrationDAO60.getAllEvents();
        model.Event event63 = eventRegistrationDAO60.getEventById((int) (short) 10);
        model.Registration registration66 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean67 = eventRegistrationDAO60.registerStudent(registration66);
        int int68 = registration66.getEventId();
        boolean boolean69 = eventRegistrationDAO44.registerStudent(registration66);
        boolean boolean72 = eventRegistrationDAO44.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration75 = new model.Registration(10, (int) 'a');
        boolean boolean76 = eventRegistrationDAO44.registerStudent(registration75);
        int int77 = registration75.getEventId();
        boolean boolean78 = eventRegistrationDAO0.registerStudent(registration75);
        int int79 = registration75.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(eventList45);
        org.junit.Assert.assertNull(event47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(eventList61);
        org.junit.Assert.assertNull(event63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event17 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        java.util.List<model.Event> eventList18 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList19 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList20 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        model.Event event4 = new model.Event(0, "", "", "20/10/2026");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        boolean boolean16 = eventRegistrationService0.registerForEvent(35, 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 0, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) ' ');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (short) 1, 32);
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        model.Registration registration2 = new model.Registration((int) (short) 10, 52);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        model.Registration registration2 = new model.Registration((int) '#', 0);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        int int12 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        int int7 = event4.getEventId();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        java.lang.String str7 = event4.getName();
        int int8 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 1);
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        boolean boolean18 = eventRegistrationService0.registerForEvent((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        model.Event event4 = new model.Event(35, "20/10/2026", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        boolean boolean14 = eventRegistrationDAO11.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO11.getAllEvents();
        model.Event event17 = eventRegistrationDAO11.getEventById((int) (byte) 1);
        model.Event event19 = eventRegistrationDAO11.getEventById((int) (short) 0);
        model.Registration registration22 = new model.Registration(0, (int) (byte) 100);
        boolean boolean23 = eventRegistrationDAO11.registerStudent(registration22);
        int int24 = registration22.getEventId();
        int int25 = registration22.getStudentId();
        boolean boolean26 = eventRegistrationDAO0.registerStudent(registration22);
        model.Registration registration29 = new model.Registration((int) (byte) 0, (int) (short) 100);
        int int30 = registration29.getStudentId();
        boolean boolean31 = eventRegistrationDAO0.registerStudent(registration29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str14 = event13.getName();
        int int15 = event13.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AI Workshop" + "'", str14, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        int int21 = registration20.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration20);
        int int23 = registration20.getStudentId();
        int int24 = registration20.getStudentId();
        int int25 = registration20.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(0);
        boolean boolean14 = eventRegistrationService0.registerForEvent(0, 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        model.Event event4 = new model.Event((int) (short) 1, "", "Lab 101", "");
        int int5 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getName();
        event4.showDetails();
        int int10 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        model.Event event42 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList43 = eventRegistrationDAO0.getAllEvents();
        model.Event event45 = eventRegistrationDAO0.getEventById(0);
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
        org.junit.Assert.assertNull(event42);
        org.junit.Assert.assertNotNull(eventList43);
        org.junit.Assert.assertNull(event45);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        model.Event event4 = new model.Event((int) (short) 1, "20/10/2026", "", "AI Workshop");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getDate();
        event4.showDetails();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        model.Registration registration2 = new model.Registration((int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO6 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO6.getAllEvents();
        model.Registration registration10 = new model.Registration(0, 0);
        boolean boolean11 = eventRegistrationDAO6.registerStudent(registration10);
        int int12 = registration10.getStudentId();
        boolean boolean13 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) (short) -1);
        model.Event event18 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) -1);
        model.Event event11 = eventRegistrationService0.showEventDetails(1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(event11);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        int int12 = registration9.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        model.Event event4 = new model.Event((int) (byte) 1, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass5 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(35, 52);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (short) 100);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        model.Event event4 = new model.Event((int) (byte) 100, "", "", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        model.Event event4 = new model.Event(32, "hi!", "20/10/2026", "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        boolean boolean23 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList24 = eventRegistrationDAO20.getAllEvents();
        model.Event event26 = eventRegistrationDAO20.getEventById((int) (byte) 1);
        model.Registration registration29 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int30 = registration29.getEventId();
        boolean boolean31 = eventRegistrationDAO20.registerStudent(registration29);
        java.util.List<model.Event> eventList32 = eventRegistrationDAO20.getAllEvents();
        model.Registration registration35 = new model.Registration(0, (int) (byte) 1);
        boolean boolean36 = eventRegistrationDAO20.registerStudent(registration35);
        int int37 = registration35.getStudentId();
        boolean boolean38 = eventRegistrationDAO0.registerStudent(registration35);
        boolean boolean41 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (-1));
        boolean boolean44 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertNotNull(event26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        model.Registration registration2 = new model.Registration(35, (int) (byte) 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        model.Registration registration2 = new model.Registration((int) (short) 0, 10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Event event14 = eventRegistrationDAO0.getEventById(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        model.Event event13 = eventRegistrationService0.showEventDetails(10);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass15 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        model.Event event4 = new model.Event(0, "", "", "20/10/2026");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        event4.showDetails();
        java.lang.String str12 = event4.getDate();
        java.lang.String str13 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        event4.showDetails();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        java.util.List<model.Event> eventList20 = eventRegistrationService0.showEvents();
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
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(35, 52);
        model.Event event13 = eventRegistrationService0.showEventDetails(52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) '#');
        data.EventRegistrationDAO eventRegistrationDAO10 = new data.EventRegistrationDAO();
        boolean boolean13 = eventRegistrationDAO10.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList14 = eventRegistrationDAO10.getAllEvents();
        model.Event event16 = eventRegistrationDAO10.getEventById((int) (byte) 1);
        model.Event event18 = eventRegistrationDAO10.getEventById((int) (short) 0);
        model.Registration registration21 = new model.Registration(0, (int) (byte) 100);
        boolean boolean22 = eventRegistrationDAO10.registerStudent(registration21);
        model.Event event24 = eventRegistrationDAO10.getEventById((int) (byte) 0);
        model.Event event26 = eventRegistrationDAO10.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList27 = eventRegistrationDAO10.getAllEvents();
        model.Event event29 = eventRegistrationDAO10.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList30 = eventRegistrationDAO10.getAllEvents();
        model.Registration registration33 = new model.Registration((int) (short) 0, 0);
        int int34 = registration33.getEventId();
        int int35 = registration33.getStudentId();
        boolean boolean36 = eventRegistrationDAO10.registerStudent(registration33);
        boolean boolean37 = eventRegistrationDAO0.registerStudent(registration33);
        model.Event event39 = eventRegistrationDAO0.getEventById((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(event16);
        org.junit.Assert.assertNull(event18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(event24);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertNull(event29);
        org.junit.Assert.assertNotNull(eventList30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(event39);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (byte) 10, (int) (byte) 10);
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        model.Event event4 = new model.Event((int) (short) 10, "Lab 101", "hi!", "");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean7 = eventRegistrationService0.registerForEvent(32, (int) (short) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (short) 1);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) '4');
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        model.Registration registration21 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int22 = registration21.getStudentId();
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(eventList21);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        model.Registration registration2 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) '4');
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 0);
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', (int) '#');
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Event event17 = eventRegistrationDAO14.getEventById((int) (short) 10);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO14.registerStudent(registration20);
        model.Registration registration24 = new model.Registration((int) (short) 0, 0);
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO14.registerStudent(registration24);
        boolean boolean29 = eventRegistrationDAO14.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Event event33 = eventRegistrationDAO30.getEventById((int) (short) 10);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean37 = eventRegistrationDAO30.registerStudent(registration36);
        int int38 = registration36.getEventId();
        boolean boolean39 = eventRegistrationDAO14.registerStudent(registration36);
        model.Event event41 = eventRegistrationDAO14.getEventById((int) ' ');
        model.Registration registration44 = new model.Registration((int) '#', 35);
        int int45 = registration44.getEventId();
        boolean boolean46 = eventRegistrationDAO14.registerStudent(registration44);
        int int47 = registration44.getStudentId();
        int int48 = registration44.getStudentId();
        boolean boolean49 = eventRegistrationDAO0.registerStudent(registration44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertNull(event33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(event41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        event5.showDetails();
        java.lang.String str7 = event5.getLocation();
        java.lang.String str8 = event5.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lab 101" + "'", str8, "Lab 101");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', (int) (short) 0);
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass6 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        boolean boolean17 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        java.lang.Class<?> wildcardClass20 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO6 = new data.EventRegistrationDAO();
        boolean boolean9 = eventRegistrationDAO6.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event11 = eventRegistrationDAO6.getEventById((int) '#');
        java.util.List<model.Event> eventList12 = eventRegistrationDAO6.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO13 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList14 = eventRegistrationDAO13.getAllEvents();
        model.Event event16 = eventRegistrationDAO13.getEventById((int) (short) 10);
        model.Registration registration19 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean20 = eventRegistrationDAO13.registerStudent(registration19);
        int int21 = registration19.getEventId();
        boolean boolean22 = eventRegistrationDAO6.registerStudent(registration19);
        int int23 = registration19.getEventId();
        boolean boolean24 = eventRegistrationDAO0.registerStudent(registration19);
        java.util.List<model.Event> eventList25 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(eventList25);
        org.junit.Assert.assertNotNull(eventList26);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, 52);
        model.Event event13 = eventRegistrationService0.showEventDetails(100);
        boolean boolean16 = eventRegistrationService0.registerForEvent(97, (int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        int int47 = registration42.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) ' ');
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        boolean boolean9 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        boolean boolean33 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) (byte) 100);
        java.util.List<model.Event> eventList34 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList34);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        int int13 = registration11.getEventId();
        java.lang.Class<?> wildcardClass14 = registration11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        model.Event event10 = eventRegistrationDAO0.getEventById((-1));
        model.Event event12 = eventRegistrationDAO0.getEventById(100);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList8 = eventRegistrationDAO7.getAllEvents();
        model.Event event10 = eventRegistrationDAO7.getEventById((int) (short) 10);
        model.Registration registration13 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean14 = eventRegistrationDAO7.registerStudent(registration13);
        int int15 = registration13.getEventId();
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration13);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(eventList17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass12 = eventList11.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        model.Event event4 = new model.Event((int) (short) 0, "Lab 101", "20/10/2026", "Lab 101");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str6 = event5.getName();
        java.lang.String str7 = event5.getLocation();
        java.lang.String str8 = event5.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Event event17 = eventRegistrationDAO0.getEventById(1);
        boolean boolean20 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) '#');
        model.Event event22 = eventRegistrationDAO0.getEventById(35);
        boolean boolean25 = eventRegistrationDAO0.isAlreadyRegistered(0, (-1));
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(event22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, (int) (byte) 1);
        model.Event event12 = eventRegistrationService0.showEventDetails(0);
        boolean boolean15 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        model.Event event10 = eventRegistrationDAO0.getEventById((int) 'a');
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(event12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO13 = new data.EventRegistrationDAO();
        boolean boolean16 = eventRegistrationDAO13.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO13.getAllEvents();
        model.Event event19 = eventRegistrationDAO13.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        boolean boolean23 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList24 = eventRegistrationDAO20.getAllEvents();
        boolean boolean27 = eventRegistrationDAO20.isAlreadyRegistered(10, (int) 'a');
        boolean boolean30 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO31 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList32 = eventRegistrationDAO31.getAllEvents();
        model.Registration registration35 = new model.Registration(0, 0);
        boolean boolean36 = eventRegistrationDAO31.registerStudent(registration35);
        boolean boolean37 = eventRegistrationDAO20.registerStudent(registration35);
        boolean boolean38 = eventRegistrationDAO13.registerStudent(registration35);
        int int39 = registration35.getEventId();
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration35);
        java.util.List<model.Event> eventList41 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(eventList41);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails(1);
        event15.showDetails();
        java.lang.String str17 = event15.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNotNull(event15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20/10/2026" + "'", str17, "20/10/2026");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        model.Event event89 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str90 = event89.getLocation();
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
        org.junit.Assert.assertNotNull(event89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Lab 101" + "'", str90, "Lab 101");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        model.Event event81 = eventRegistrationDAO0.getEventById((int) (byte) 100);
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
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        java.util.List<model.Event> eventList75 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList75);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        model.Registration registration30 = new model.Registration((int) (byte) 0, (int) '#');
        int int31 = registration30.getEventId();
        boolean boolean32 = eventRegistrationDAO0.registerStudent(registration30);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        model.Event event6 = eventRegistrationService0.showEventDetails(32);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails(1);
        model.Event event17 = eventRegistrationService0.showEventDetails(1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNotNull(event15);
        org.junit.Assert.assertNotNull(event17);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        model.Registration registration19 = new model.Registration(0, 0);
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration19);
        int int21 = registration19.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean18 = eventRegistrationService0.registerForEvent((int) '#', (int) (byte) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration(0, (int) (byte) 100);
        int int11 = registration10.getStudentId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) 'a');
        boolean boolean17 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        model.Event event4 = new model.Event((int) (short) 1, "", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        int int80 = registration74.getEventId();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event13 = eventRegistrationService0.showEventDetails(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = event13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "20/10/2026", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (byte) 0);
        model.Event event12 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        model.Event event4 = new model.Event(100, "20/10/2026", "AI Workshop", "hi!");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str3 = event2.getLocation();
        event2.showDetails();
        event2.showDetails();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lab 101" + "'", str3, "Lab 101");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) '#');
        data.EventRegistrationDAO eventRegistrationDAO10 = new data.EventRegistrationDAO();
        boolean boolean13 = eventRegistrationDAO10.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList14 = eventRegistrationDAO10.getAllEvents();
        model.Event event16 = eventRegistrationDAO10.getEventById((int) (byte) 1);
        model.Event event18 = eventRegistrationDAO10.getEventById((int) (short) 0);
        model.Registration registration21 = new model.Registration(0, (int) (byte) 100);
        boolean boolean22 = eventRegistrationDAO10.registerStudent(registration21);
        model.Event event24 = eventRegistrationDAO10.getEventById((int) (byte) 0);
        model.Event event26 = eventRegistrationDAO10.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList27 = eventRegistrationDAO10.getAllEvents();
        model.Event event29 = eventRegistrationDAO10.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList30 = eventRegistrationDAO10.getAllEvents();
        model.Registration registration33 = new model.Registration((int) (short) 0, 0);
        int int34 = registration33.getEventId();
        int int35 = registration33.getStudentId();
        boolean boolean36 = eventRegistrationDAO10.registerStudent(registration33);
        boolean boolean37 = eventRegistrationDAO0.registerStudent(registration33);
        model.Event event39 = eventRegistrationDAO0.getEventById(97);
        java.lang.Class<?> wildcardClass40 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(event16);
        org.junit.Assert.assertNull(event18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(event24);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertNull(event29);
        org.junit.Assert.assertNotNull(eventList30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(event39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event12 = eventRegistrationDAO0.getEventById(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (byte) 10, (int) (byte) 10);
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        model.Event event16 = eventRegistrationDAO0.getEventById(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event9 = eventRegistrationDAO0.getEventById(52);
        model.Event event11 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        model.Event event11 = eventRegistrationDAO0.getEventById(1);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration15 = new model.Registration((int) '#', (int) (short) 10);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        boolean boolean6 = eventRegistrationService0.registerForEvent((int) (byte) 10, (int) (byte) 0);
        model.Event event8 = eventRegistrationService0.showEventDetails(52);
        model.Event event10 = eventRegistrationService0.showEventDetails(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        model.Registration registration2 = new model.Registration(10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getDate();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        model.Event event4 = new model.Event((-1), "20/10/2026", "20/10/2026", "hi!");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        model.Registration registration2 = new model.Registration((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO6 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO6.getAllEvents();
        model.Registration registration10 = new model.Registration(0, 0);
        boolean boolean11 = eventRegistrationDAO6.registerStudent(registration10);
        int int12 = registration10.getStudentId();
        boolean boolean13 = eventRegistrationDAO0.registerStudent(registration10);
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Event event17 = eventRegistrationDAO14.getEventById((int) (short) 10);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO14.registerStudent(registration20);
        model.Registration registration24 = new model.Registration((int) (short) 0, 0);
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO14.registerStudent(registration24);
        boolean boolean29 = eventRegistrationDAO14.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Event event33 = eventRegistrationDAO30.getEventById((int) (short) 10);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean37 = eventRegistrationDAO30.registerStudent(registration36);
        int int38 = registration36.getEventId();
        boolean boolean39 = eventRegistrationDAO14.registerStudent(registration36);
        boolean boolean42 = eventRegistrationDAO14.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration45 = new model.Registration(10, (int) 'a');
        boolean boolean46 = eventRegistrationDAO14.registerStudent(registration45);
        boolean boolean47 = eventRegistrationDAO0.registerStudent(registration45);
        model.Event event49 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        model.Event event51 = eventRegistrationDAO0.getEventById(35);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertNull(event33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(event49);
        org.junit.Assert.assertNull(event51);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        model.Event event4 = new model.Event(1, "20/10/2026", "AI Workshop", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Event event9 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(event9);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Registration registration9 = new model.Registration(0, (int) '#');
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration9);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        model.Event event4 = new model.Event((int) (byte) 10, "hi!", "", "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        int int8 = event7.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(event7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        model.Event event4 = new model.Event(97, "20/10/2026", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        model.Event event4 = new model.Event((int) '4', "20/10/2026", "", "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) (short) 100, 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        model.Event event4 = new model.Event((int) (short) 1, "Lab 101", "hi!", "");
        event4.showDetails();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(eventList17);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (short) 1);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (byte) 10);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        model.Registration registration19 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration19);
        model.Registration registration23 = new model.Registration((int) (byte) 10, (int) (byte) 100);
        boolean boolean24 = eventRegistrationDAO0.registerStudent(registration23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        model.Event event4 = new model.Event((int) '#', "", "Lab 101", "");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 1);
        model.Event event16 = eventRegistrationService0.showEventDetails(52);
        boolean boolean19 = eventRegistrationService0.registerForEvent((int) 'a', 52);
        java.util.List<model.Event> eventList20 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        model.Event event4 = new model.Event((int) (short) 100, "AI Workshop", "Lab 101", "Lab 101");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.Class<?> wildcardClass8 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(10, (int) (byte) 1);
        boolean boolean13 = eventRegistrationService0.registerForEvent(100, 52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        model.Event event4 = new model.Event(35, "", "", "AI Workshop");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered(35, 35);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        event4.showDetails();
        java.lang.String str7 = event4.getLocation();
        event4.showDetails();
        java.lang.String str9 = event4.getLocation();
        event4.showDetails();
        java.lang.String str11 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        model.Event event10 = eventRegistrationService0.showEventDetails(35);
        model.Event event12 = eventRegistrationService0.showEventDetails(10);
        java.lang.Class<?> wildcardClass13 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList26);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        model.Event event4 = new model.Event((int) (short) -1, "", "AI Workshop", "");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 10, 52);
        boolean boolean13 = eventRegistrationService0.registerForEvent(100, (int) (short) 100);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass15 = eventList14.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (byte) 10, (int) (byte) 10);
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        model.Event event17 = eventRegistrationDAO0.getEventById((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) 'a', 0);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        model.Registration registration2 = new model.Registration(10, 0);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList20 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        model.Registration registration43 = new model.Registration((int) '#', 35);
        int int44 = registration43.getEventId();
        int int45 = registration43.getEventId();
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration43);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getLocation();
        int int12 = event4.getEventId();
        int int13 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        model.Event event10 = eventRegistrationService0.showEventDetails(32);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO0.getAllEvents();
        boolean boolean8 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', 100);
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        model.Registration registration2 = new model.Registration((int) (byte) 100, 52);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        model.Event event21 = eventRegistrationDAO0.getEventById(52);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
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
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str7 = event6.getDate();
        java.lang.String str8 = event6.getDate();
        java.lang.String str9 = event6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lab 101" + "'", str9, "Lab 101");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        int int52 = registration49.getEventId();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        int int8 = event4.getEventId();
        int int9 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        model.Event event4 = new model.Event((int) (short) 0, "20/10/2026", "20/10/2026", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        model.Registration registration25 = new model.Registration(52, 0);
        int int26 = registration25.getEventId();
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration25);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        model.Registration registration2 = new model.Registration(100, 0);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        int int6 = event4.getEventId();
        int int7 = event4.getEventId();
        int int8 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration18 = new model.Registration(0, (int) (short) 10);
        boolean boolean19 = eventRegistrationDAO0.registerStudent(registration18);
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = event21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, 0);
        int int7 = registration6.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', (int) (byte) 10);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered(32, (int) 'a');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration((int) (short) 100, (int) (byte) -1);
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered(100, (int) (byte) 0);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 10, 52);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(event12);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        model.Registration registration2 = new model.Registration((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        model.Event event89 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str90 = event89.getName();
        int int91 = event89.getEventId();
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
        org.junit.Assert.assertNotNull(event89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "AI Workshop" + "'", str90, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        model.Event event4 = new model.Event(100, "", "AI Workshop", "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        model.Event event4 = new model.Event(32, "AI Workshop", "Lab 101", "AI Workshop");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        model.Registration registration2 = new model.Registration(0, (int) '#');
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (byte) 0);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass15 = eventList14.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO0.getAllEvents();
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertNotNull(eventList22);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        model.Event event21 = eventRegistrationDAO0.getEventById(100);
        boolean boolean24 = eventRegistrationDAO0.isAlreadyRegistered(100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        model.Registration registration2 = new model.Registration(0, 0);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        model.Event event4 = new model.Event((int) '4', "", "", "AI Workshop");
        event4.showDetails();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        boolean boolean9 = eventRegistrationService0.registerForEvent(1, 35);
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) (short) 1, 35);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Event event17 = eventRegistrationDAO14.getEventById((int) (short) 10);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO14.registerStudent(registration20);
        int int22 = registration20.getEventId();
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration20);
        boolean boolean26 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getDate();
        int int9 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        model.Registration registration2 = new model.Registration(32, (-1));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        boolean boolean57 = eventRegistrationDAO54.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList58 = eventRegistrationDAO54.getAllEvents();
        model.Event event60 = eventRegistrationDAO54.getEventById((int) (byte) 1);
        model.Event event62 = eventRegistrationDAO54.getEventById((int) (short) 0);
        model.Registration registration65 = new model.Registration(0, (int) (byte) 100);
        boolean boolean66 = eventRegistrationDAO54.registerStudent(registration65);
        int int67 = registration65.getEventId();
        boolean boolean68 = eventRegistrationDAO0.registerStudent(registration65);
        int int69 = registration65.getEventId();
        java.lang.Class<?> wildcardClass70 = registration65.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(eventList58);
        org.junit.Assert.assertNotNull(event60);
        org.junit.Assert.assertNull(event62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        model.Event event89 = eventRegistrationDAO0.getEventById((int) (short) 1);
        int int90 = event89.getEventId();
        java.lang.String str91 = event89.getLocation();
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
        org.junit.Assert.assertNotNull(event89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Lab 101" + "'", str91, "Lab 101");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        int int44 = registration38.getStudentId();
        int int45 = registration38.getEventId();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 10, 52);
        model.Event event12 = eventRegistrationService0.showEventDetails(10);
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        data.EventRegistrationDAO eventRegistrationDAO9 = new data.EventRegistrationDAO();
        model.Event event11 = eventRegistrationDAO9.getEventById((int) (short) 0);
        model.Registration registration14 = new model.Registration((int) (short) 0, 0);
        boolean boolean15 = eventRegistrationDAO9.registerStudent(registration14);
        int int16 = registration14.getEventId();
        int int17 = registration14.getStudentId();
        boolean boolean18 = eventRegistrationDAO0.registerStudent(registration14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent(1, 0);
        boolean boolean8 = eventRegistrationService0.registerForEvent(0, 35);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass6 = eventList5.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) 'a', (int) (short) 10);
        boolean boolean20 = eventRegistrationService0.registerForEvent((int) '#', 52);
        java.util.List<model.Event> eventList21 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList22 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNotNull(eventList22);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        model.Registration registration2 = new model.Registration((int) (short) 0, (int) (short) 100);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        model.Event event6 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean9 = eventRegistrationService0.registerForEvent((int) (byte) 0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) 'a', (int) '4');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) (byte) 0, 97);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        model.Registration registration2 = new model.Registration((int) (byte) -1, (int) '#');
        int int3 = registration2.getStudentId();
        java.lang.Class<?> wildcardClass4 = registration2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        model.Event event4 = new model.Event((int) (short) 100, "20/10/2026", "hi!", "20/10/2026");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        model.Registration registration2 = new model.Registration((int) ' ', (int) (byte) 0);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        model.Event event4 = new model.Event((int) (short) 1, "", "Lab 101", "hi!");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean8 = eventRegistrationService0.registerForEvent(0, 35);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        model.Event event4 = new model.Event(0, "AI Workshop", "", "");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, 52);
        model.Event event13 = eventRegistrationService0.showEventDetails(100);
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNotNull(event13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        event4.showDetails();
        java.lang.String str8 = event4.getName();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        model.Registration registration2 = new model.Registration((int) (short) 100, 1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        model.Registration registration2 = new model.Registration(35, (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (byte) 1);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        model.Registration registration2 = new model.Registration((int) '#', (int) (byte) 1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str7 = event6.getLocation();
        int int8 = event6.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        model.Event event4 = new model.Event((int) (byte) 0, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        model.Event event4 = new model.Event((int) (short) 0, "AI Workshop", "", "20/10/2026");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        model.Event event12 = eventRegistrationDAO0.getEventById(100);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        boolean boolean9 = eventRegistrationService0.registerForEvent(1, 35);
        model.Event event11 = eventRegistrationService0.showEventDetails(97);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        boolean boolean6 = eventRegistrationDAO0.isAlreadyRegistered(52, (int) 'a');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(eventList7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        int int6 = event4.getEventId();
        int int7 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        boolean boolean19 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList20 = eventRegistrationDAO16.getAllEvents();
        boolean boolean23 = eventRegistrationDAO16.isAlreadyRegistered(10, (int) 'a');
        boolean boolean26 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO27 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList28 = eventRegistrationDAO27.getAllEvents();
        model.Registration registration31 = new model.Registration(0, 0);
        boolean boolean32 = eventRegistrationDAO27.registerStudent(registration31);
        boolean boolean33 = eventRegistrationDAO16.registerStudent(registration31);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        int int37 = registration36.getEventId();
        boolean boolean38 = eventRegistrationDAO16.registerStudent(registration36);
        boolean boolean39 = eventRegistrationDAO12.registerStudent(registration36);
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration36);
        boolean boolean43 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 1);
        data.EventRegistrationDAO eventRegistrationDAO44 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList45 = eventRegistrationDAO44.getAllEvents();
        model.Event event47 = eventRegistrationDAO44.getEventById((int) (short) 10);
        model.Registration registration50 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean51 = eventRegistrationDAO44.registerStudent(registration50);
        model.Registration registration54 = new model.Registration((int) (short) 0, 0);
        int int55 = registration54.getEventId();
        boolean boolean56 = eventRegistrationDAO44.registerStudent(registration54);
        boolean boolean59 = eventRegistrationDAO44.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO60 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList61 = eventRegistrationDAO60.getAllEvents();
        model.Event event63 = eventRegistrationDAO60.getEventById((int) (short) 10);
        model.Registration registration66 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean67 = eventRegistrationDAO60.registerStudent(registration66);
        int int68 = registration66.getEventId();
        boolean boolean69 = eventRegistrationDAO44.registerStudent(registration66);
        boolean boolean72 = eventRegistrationDAO44.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration75 = new model.Registration(10, (int) 'a');
        boolean boolean76 = eventRegistrationDAO44.registerStudent(registration75);
        int int77 = registration75.getEventId();
        boolean boolean78 = eventRegistrationDAO0.registerStudent(registration75);
        boolean boolean81 = eventRegistrationDAO0.isAlreadyRegistered(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(eventList45);
        org.junit.Assert.assertNull(event47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(eventList61);
        org.junit.Assert.assertNull(event63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "hi!");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        model.Event event14 = eventRegistrationDAO0.getEventById(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        model.Event event4 = new model.Event((int) (short) 100, "Lab 101", "Lab 101", "Lab 101");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lab 101" + "'", str6, "Lab 101");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        model.Event event65 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Event event67 = eventRegistrationDAO0.getEventById(35);
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
        org.junit.Assert.assertNull(event65);
        org.junit.Assert.assertNull(event67);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        model.Event event4 = new model.Event((int) ' ', "20/10/2026", "", "");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        model.Registration registration2 = new model.Registration((int) (short) 100, 10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered(97, 10);
        data.EventRegistrationDAO eventRegistrationDAO10 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList11 = eventRegistrationDAO10.getAllEvents();
        model.Event event13 = eventRegistrationDAO10.getEventById((int) (short) 10);
        model.Registration registration16 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean17 = eventRegistrationDAO10.registerStudent(registration16);
        int int18 = registration16.getEventId();
        boolean boolean19 = eventRegistrationDAO0.registerStudent(registration16);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        model.Registration registration2 = new model.Registration((-1), 1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Registration registration15 = new model.Registration((int) (byte) 100, (int) (short) 0);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        boolean boolean20 = eventRegistrationDAO0.isAlreadyRegistered(97, (int) ' ');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) (byte) 0, 97);
        model.Event event14 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        int int8 = registration6.getEventId();
        int int9 = registration6.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        model.Registration registration54 = new model.Registration(0, (int) '#');
        int int55 = registration54.getStudentId();
        boolean boolean56 = eventRegistrationDAO0.registerStudent(registration54);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        model.Event event4 = new model.Event((int) 'a', "Lab 101", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        event6.showDetails();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Event event17 = eventRegistrationDAO0.getEventById(1);
        java.lang.String str18 = event17.getName();
        java.lang.String str19 = event17.getLocation();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AI Workshop" + "'", str18, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lab 101" + "'", str19, "Lab 101");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        model.Event event4 = new model.Event(32, "AI Workshop", "20/10/2026", "AI Workshop");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        boolean boolean5 = eventRegistrationService0.registerForEvent(1, 97);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean10 = eventRegistrationService0.registerForEvent(1, 10);
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        model.Registration registration2 = new model.Registration((int) '4', 52);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        model.Registration registration2 = new model.Registration(52, (int) (byte) 1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        model.Event event4 = new model.Event((int) (short) -1, "", "AI Workshop", "");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        java.lang.String str9 = event8.getName();
        int int10 = event8.getEventId();
        int int11 = event8.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNotNull(event8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AI Workshop" + "'", str9, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        model.Registration registration2 = new model.Registration((-1), (int) (byte) 1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        model.Event event20 = eventRegistrationDAO0.getEventById(100);
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNull(event20);
        org.junit.Assert.assertNotNull(eventList21);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.util.List<model.Event> eventList31 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList31);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        int int36 = registration30.getStudentId();
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
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        boolean boolean4 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) 10);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(event9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        model.Event event4 = new model.Event(35, "Lab 101", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) '4');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        model.Event event17 = eventRegistrationDAO0.getEventById(10);
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Registration registration22 = new model.Registration(0, 0);
        boolean boolean23 = eventRegistrationDAO18.registerStudent(registration22);
        int int24 = registration22.getEventId();
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent(35, (int) '#');
        model.Event event10 = eventRegistrationService0.showEventDetails(1);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = event12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getLocation();
        java.lang.String str12 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        model.Event event4 = new model.Event(100, "Lab 101", "20/10/2026", "hi!");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        data.EventRegistrationDAO eventRegistrationDAO13 = new data.EventRegistrationDAO();
        boolean boolean16 = eventRegistrationDAO13.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO13.getAllEvents();
        model.Event event19 = eventRegistrationDAO13.getEventById((int) (byte) 1);
        model.Event event21 = eventRegistrationDAO13.getEventById((int) (short) 0);
        model.Registration registration24 = new model.Registration(0, (int) (byte) 100);
        boolean boolean25 = eventRegistrationDAO13.registerStudent(registration24);
        int int26 = registration24.getEventId();
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration24);
        java.util.List<model.Event> eventList28 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(eventList28);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        model.Event event4 = new model.Event(97, "Lab 101", "hi!", "20/10/2026");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event14 = eventRegistrationDAO0.getEventById(35);
        model.Registration registration17 = new model.Registration((int) (byte) 0, (int) '#');
        boolean boolean18 = eventRegistrationDAO0.registerStudent(registration17);
        int int19 = registration17.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.util.List<model.Event> eventList29 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList29);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        int int21 = registration20.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration20);
        int int23 = registration20.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getName();
        java.lang.String str11 = event4.getDate();
        int int12 = event4.getEventId();
        java.lang.String str13 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        model.Event event19 = eventRegistrationDAO0.getEventById(97);
        model.Registration registration22 = new model.Registration((int) (short) 100, (int) '4');
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration22);
        int int24 = registration22.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str6 = event5.getName();
        java.lang.String str7 = event5.getLocation();
        java.lang.String str8 = event5.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        boolean boolean48 = eventRegistrationDAO45.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList49 = eventRegistrationDAO45.getAllEvents();
        model.Event event51 = eventRegistrationDAO45.getEventById((int) (byte) 1);
        model.Event event53 = eventRegistrationDAO45.getEventById((-1));
        boolean boolean56 = eventRegistrationDAO45.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO57 = new data.EventRegistrationDAO();
        boolean boolean60 = eventRegistrationDAO57.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO61 = new data.EventRegistrationDAO();
        boolean boolean64 = eventRegistrationDAO61.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList65 = eventRegistrationDAO61.getAllEvents();
        boolean boolean68 = eventRegistrationDAO61.isAlreadyRegistered(10, (int) 'a');
        boolean boolean71 = eventRegistrationDAO61.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO72 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList73 = eventRegistrationDAO72.getAllEvents();
        model.Registration registration76 = new model.Registration(0, 0);
        boolean boolean77 = eventRegistrationDAO72.registerStudent(registration76);
        boolean boolean78 = eventRegistrationDAO61.registerStudent(registration76);
        model.Registration registration81 = new model.Registration((int) (byte) -1, (int) '#');
        int int82 = registration81.getEventId();
        boolean boolean83 = eventRegistrationDAO61.registerStudent(registration81);
        boolean boolean84 = eventRegistrationDAO57.registerStudent(registration81);
        boolean boolean85 = eventRegistrationDAO45.registerStudent(registration81);
        boolean boolean86 = eventRegistrationDAO0.registerStudent(registration81);
        int int87 = registration81.getEventId();
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
        org.junit.Assert.assertNotNull(eventList49);
        org.junit.Assert.assertNotNull(event51);
        org.junit.Assert.assertNull(event53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(eventList65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(eventList73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 35 + "'", int87 == 35);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        model.Event event4 = new model.Event(97, "", "20/10/2026", "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        model.Event event5 = eventRegistrationService0.showEventDetails(35);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, (int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        int int10 = event4.getEventId();
        event4.showDetails();
        java.lang.String str12 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (byte) 1, 100);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (short) 1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) '4', 0);
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        data.EventRegistrationDAO eventRegistrationDAO18 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList19 = eventRegistrationDAO18.getAllEvents();
        model.Event event21 = eventRegistrationDAO18.getEventById((int) (short) 10);
        model.Registration registration24 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean25 = eventRegistrationDAO18.registerStudent(registration24);
        model.Registration registration28 = new model.Registration((int) (short) 0, 0);
        int int29 = registration28.getEventId();
        boolean boolean30 = eventRegistrationDAO18.registerStudent(registration28);
        model.Registration registration33 = new model.Registration((int) (byte) 100, (int) (short) 0);
        boolean boolean34 = eventRegistrationDAO18.registerStudent(registration33);
        int int35 = registration33.getEventId();
        boolean boolean36 = eventRegistrationDAO0.registerStudent(registration33);
        data.EventRegistrationDAO eventRegistrationDAO37 = new data.EventRegistrationDAO();
        boolean boolean40 = eventRegistrationDAO37.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList41 = eventRegistrationDAO37.getAllEvents();
        boolean boolean44 = eventRegistrationDAO37.isAlreadyRegistered(10, (int) 'a');
        boolean boolean47 = eventRegistrationDAO37.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO48 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList49 = eventRegistrationDAO48.getAllEvents();
        model.Registration registration52 = new model.Registration(0, 0);
        boolean boolean53 = eventRegistrationDAO48.registerStudent(registration52);
        boolean boolean54 = eventRegistrationDAO37.registerStudent(registration52);
        data.EventRegistrationDAO eventRegistrationDAO55 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList56 = eventRegistrationDAO55.getAllEvents();
        model.Event event58 = eventRegistrationDAO55.getEventById((int) (short) 10);
        model.Registration registration61 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean62 = eventRegistrationDAO55.registerStudent(registration61);
        model.Registration registration65 = new model.Registration((int) (short) 0, 0);
        int int66 = registration65.getEventId();
        boolean boolean67 = eventRegistrationDAO55.registerStudent(registration65);
        model.Registration registration70 = new model.Registration((int) (byte) 100, (int) (short) 0);
        boolean boolean71 = eventRegistrationDAO55.registerStudent(registration70);
        int int72 = registration70.getEventId();
        boolean boolean73 = eventRegistrationDAO37.registerStudent(registration70);
        int int74 = registration70.getEventId();
        boolean boolean75 = eventRegistrationDAO0.registerStudent(registration70);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(eventList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(eventList49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(eventList56);
        org.junit.Assert.assertNull(event58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        int int27 = registration25.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.util.List<model.Event> eventList16 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(eventList16);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        model.Event event42 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event44 = eventRegistrationDAO0.getEventById(10);
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
        org.junit.Assert.assertNull(event42);
        org.junit.Assert.assertNull(event44);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        model.Registration registration2 = new model.Registration((int) ' ', 52);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        model.Event event4 = new model.Event((int) (short) 10, "Lab 101", "", "Lab 101");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        boolean boolean15 = eventRegistrationService0.registerForEvent((int) '4', (int) '4');
        boolean boolean18 = eventRegistrationService0.registerForEvent(0, 32);
        boolean boolean21 = eventRegistrationService0.registerForEvent(52, (int) (short) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent(35, (int) '#');
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        model.Event event4 = new model.Event(35, "AI Workshop", "20/10/2026", "Lab 101");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        model.Registration registration2 = new model.Registration(0, (int) (byte) 100);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getEventId();
        int int6 = registration2.getEventId();
        int int7 = registration2.getStudentId();
        int int8 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        model.Registration registration2 = new model.Registration(97, (int) (byte) 0);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 1);
        model.Event event16 = eventRegistrationService0.showEventDetails(52);
        boolean boolean19 = eventRegistrationService0.registerForEvent((int) 'a', 52);
        boolean boolean22 = eventRegistrationService0.registerForEvent((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        model.Event event4 = new model.Event((int) (short) 0, "hi!", "", "hi!");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (short) 1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration15 = new model.Registration((int) (short) 10, 0);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event18 = eventRegistrationDAO0.getEventById(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        model.Event event46 = eventRegistrationDAO0.getEventById((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(event46);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        model.Registration registration2 = new model.Registration(0, (int) '#');
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        model.Event event4 = new model.Event(0, "", "", "20/10/2026");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, 10);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        model.Registration registration2 = new model.Registration((int) (byte) 1, 10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        model.Event event4 = new model.Event((int) (short) 10, "", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        model.Event event13 = eventRegistrationService0.showEventDetails(10);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        model.Event event16 = eventRegistrationService0.showEventDetails((int) ' ');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        event4.showDetails();
        java.lang.String str12 = event4.getDate();
        int int13 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        boolean boolean57 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        int int22 = registration19.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        int int7 = event4.getEventId();
        java.lang.String str8 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        model.Event event4 = new model.Event((int) ' ', "20/10/2026", "", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        model.Event event4 = new model.Event(0, "Lab 101", "20/10/2026", "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        model.Registration registration2 = new model.Registration(100, 100);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        model.Event event4 = new model.Event((int) (byte) 100, "hi!", "20/10/2026", "hi!");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        model.Event event14 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str15 = event14.getName();
        java.lang.String str16 = event14.getLocation();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AI Workshop" + "'", str15, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lab 101" + "'", str16, "Lab 101");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (short) 1);
        data.EventRegistrationDAO eventRegistrationDAO15 = new data.EventRegistrationDAO();
        boolean boolean18 = eventRegistrationDAO15.isAlreadyRegistered(35, (int) (byte) 10);
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
        model.Registration registration39 = new model.Registration((int) (byte) -1, (int) '#');
        int int40 = registration39.getEventId();
        boolean boolean41 = eventRegistrationDAO19.registerStudent(registration39);
        boolean boolean42 = eventRegistrationDAO15.registerStudent(registration39);
        int int43 = registration39.getEventId();
        boolean boolean44 = eventRegistrationDAO0.registerStudent(registration39);
        model.Registration registration47 = new model.Registration(0, (int) (short) 10);
        int int48 = registration47.getEventId();
        boolean boolean49 = eventRegistrationDAO0.registerStudent(registration47);
        int int50 = registration47.getEventId();
        int int51 = registration47.getEventId();
        int int52 = registration47.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        boolean boolean77 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(35, 52);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (byte) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        int int44 = registration38.getEventId();
        int int45 = registration38.getEventId();
        int int46 = registration38.getStudentId();
        int int47 = registration38.getEventId();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        boolean boolean6 = eventRegistrationService0.registerForEvent(0, 10);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(0);
        boolean boolean14 = eventRegistrationService0.registerForEvent(97, 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        boolean boolean91 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) 'a');
        boolean boolean94 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) (short) 1);
        model.Event event96 = eventRegistrationDAO0.getEventById(10);
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(event96);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        model.Event event4 = new model.Event((int) (byte) 0, "20/10/2026", "20/10/2026", "AI Workshop");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.String str20 = event19.getDate();
        java.lang.Class<?> wildcardClass21 = event19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "20/10/2026" + "'", str20, "20/10/2026");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        event4.showDetails();
        java.lang.String str9 = event4.getDate();
        java.lang.Class<?> wildcardClass10 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration(0, (int) (byte) 100);
        int int11 = registration10.getStudentId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event14 = eventRegistrationDAO0.getEventById(32);
        model.Registration registration17 = new model.Registration((int) (byte) 10, (int) (short) 0);
        boolean boolean18 = eventRegistrationDAO0.registerStudent(registration17);
        java.lang.Class<?> wildcardClass19 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        model.Event event4 = new model.Event((int) (byte) 1, "hi!", "hi!", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        model.Event event4 = new model.Event((int) '4', "AI Workshop", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (byte) 10, (int) (short) 0);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        boolean boolean9 = eventRegistrationService0.registerForEvent((int) '4', (int) '#');
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(eventList10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO6 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO6.getAllEvents();
        model.Registration registration10 = new model.Registration(0, 0);
        boolean boolean11 = eventRegistrationDAO6.registerStudent(registration10);
        int int12 = registration10.getStudentId();
        boolean boolean13 = eventRegistrationDAO0.registerStudent(registration10);
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Event event17 = eventRegistrationDAO14.getEventById((int) (short) 10);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO14.registerStudent(registration20);
        model.Registration registration24 = new model.Registration((int) (short) 0, 0);
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO14.registerStudent(registration24);
        boolean boolean29 = eventRegistrationDAO14.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Event event33 = eventRegistrationDAO30.getEventById((int) (short) 10);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean37 = eventRegistrationDAO30.registerStudent(registration36);
        int int38 = registration36.getEventId();
        boolean boolean39 = eventRegistrationDAO14.registerStudent(registration36);
        boolean boolean42 = eventRegistrationDAO14.isAlreadyRegistered((int) 'a', 1);
        model.Registration registration45 = new model.Registration(10, (int) 'a');
        boolean boolean46 = eventRegistrationDAO14.registerStudent(registration45);
        boolean boolean47 = eventRegistrationDAO0.registerStudent(registration45);
        model.Event event49 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        boolean boolean52 = eventRegistrationDAO0.isAlreadyRegistered(1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertNull(event33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(event49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        data.EventRegistrationDAO eventRegistrationDAO28 = new data.EventRegistrationDAO();
        boolean boolean31 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList32 = eventRegistrationDAO28.getAllEvents();
        boolean boolean35 = eventRegistrationDAO28.isAlreadyRegistered(10, (int) 'a');
        boolean boolean38 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO39 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList40 = eventRegistrationDAO39.getAllEvents();
        model.Registration registration43 = new model.Registration(0, 0);
        boolean boolean44 = eventRegistrationDAO39.registerStudent(registration43);
        boolean boolean45 = eventRegistrationDAO28.registerStudent(registration43);
        boolean boolean46 = eventRegistrationDAO0.registerStudent(registration43);
        model.Event event48 = eventRegistrationDAO0.getEventById(0);
        data.EventRegistrationDAO eventRegistrationDAO49 = new data.EventRegistrationDAO();
        boolean boolean52 = eventRegistrationDAO49.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList53 = eventRegistrationDAO49.getAllEvents();
        model.Event event55 = eventRegistrationDAO49.getEventById((int) (byte) 1);
        model.Registration registration58 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int59 = registration58.getEventId();
        boolean boolean60 = eventRegistrationDAO49.registerStudent(registration58);
        data.EventRegistrationDAO eventRegistrationDAO61 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList62 = eventRegistrationDAO61.getAllEvents();
        model.Event event64 = eventRegistrationDAO61.getEventById((int) (short) 10);
        model.Registration registration67 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean68 = eventRegistrationDAO61.registerStudent(registration67);
        model.Registration registration71 = new model.Registration((int) (short) 0, 0);
        int int72 = registration71.getEventId();
        boolean boolean73 = eventRegistrationDAO61.registerStudent(registration71);
        boolean boolean76 = eventRegistrationDAO61.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO77 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList78 = eventRegistrationDAO77.getAllEvents();
        model.Event event80 = eventRegistrationDAO77.getEventById((int) (short) 10);
        model.Registration registration83 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean84 = eventRegistrationDAO77.registerStudent(registration83);
        int int85 = registration83.getEventId();
        boolean boolean86 = eventRegistrationDAO61.registerStudent(registration83);
        boolean boolean87 = eventRegistrationDAO49.registerStudent(registration83);
        boolean boolean88 = eventRegistrationDAO0.registerStudent(registration83);
        model.Registration registration91 = new model.Registration((int) (byte) -1, 32);
        boolean boolean92 = eventRegistrationDAO0.registerStudent(registration91);
        int int93 = registration91.getStudentId();
        int int94 = registration91.getEventId();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(event48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(eventList53);
        org.junit.Assert.assertNotNull(event55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(eventList62);
        org.junit.Assert.assertNull(event64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(eventList78);
        org.junit.Assert.assertNull(event80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 35 + "'", int85 == 35);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 32 + "'", int94 == 32);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration6 = new model.Registration(0, (int) (short) 10);
        int int7 = registration6.getEventId();
        int int8 = registration6.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration6);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        boolean boolean24 = eventRegistrationService0.registerForEvent((-1), (int) (short) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        model.Event event4 = new model.Event((-1), "20/10/2026", "AI Workshop", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        model.Event event4 = new model.Event((-1), "20/10/2026", "20/10/2026", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        event14.showDetails();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        model.Event event29 = eventRegistrationDAO0.getEventById(97);
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
        org.junit.Assert.assertNull(event29);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        boolean boolean6 = eventRegistrationDAO0.isAlreadyRegistered(10, (-1));
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) (short) 0);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 0, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails(52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        int int10 = event4.getEventId();
        event4.showDetails();
        java.lang.String str12 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str7 = event6.getLocation();
        java.lang.String str8 = event6.getName();
        java.lang.String str9 = event6.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20/10/2026" + "'", str9, "20/10/2026");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        model.Event event4 = new model.Event((int) (byte) 100, "hi!", "Lab 101", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Class<?> wildcardClass28 = eventList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (short) 10);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean12 = eventRegistrationService0.registerForEvent(1, (int) (byte) 0);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        model.Event event4 = new model.Event((int) (short) 10, "Lab 101", "", "Lab 101");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        model.Event event25 = eventRegistrationService0.showEventDetails((int) (short) 0);
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
        org.junit.Assert.assertNull(event25);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        model.Event event11 = eventRegistrationDAO0.getEventById(1);
        model.Event event13 = eventRegistrationDAO0.getEventById(0);
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Event event17 = eventRegistrationDAO14.getEventById((int) (short) 10);
        model.Registration registration20 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean21 = eventRegistrationDAO14.registerStudent(registration20);
        model.Registration registration24 = new model.Registration((int) (short) 0, 0);
        int int25 = registration24.getEventId();
        boolean boolean26 = eventRegistrationDAO14.registerStudent(registration24);
        boolean boolean29 = eventRegistrationDAO14.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO30 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList31 = eventRegistrationDAO30.getAllEvents();
        model.Event event33 = eventRegistrationDAO30.getEventById((int) (short) 10);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean37 = eventRegistrationDAO30.registerStudent(registration36);
        model.Registration registration40 = new model.Registration((int) (short) 0, 0);
        int int41 = registration40.getEventId();
        boolean boolean42 = eventRegistrationDAO30.registerStudent(registration40);
        boolean boolean45 = eventRegistrationDAO30.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO46 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList47 = eventRegistrationDAO46.getAllEvents();
        model.Event event49 = eventRegistrationDAO46.getEventById((int) (short) 10);
        model.Registration registration52 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean53 = eventRegistrationDAO46.registerStudent(registration52);
        int int54 = registration52.getEventId();
        boolean boolean55 = eventRegistrationDAO30.registerStudent(registration52);
        int int56 = registration52.getStudentId();
        boolean boolean57 = eventRegistrationDAO14.registerStudent(registration52);
        java.util.List<model.Event> eventList58 = eventRegistrationDAO14.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO59 = new data.EventRegistrationDAO();
        boolean boolean62 = eventRegistrationDAO59.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO63 = new data.EventRegistrationDAO();
        boolean boolean66 = eventRegistrationDAO63.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList67 = eventRegistrationDAO63.getAllEvents();
        boolean boolean70 = eventRegistrationDAO63.isAlreadyRegistered(10, (int) 'a');
        boolean boolean73 = eventRegistrationDAO63.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO74 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList75 = eventRegistrationDAO74.getAllEvents();
        model.Registration registration78 = new model.Registration(0, 0);
        boolean boolean79 = eventRegistrationDAO74.registerStudent(registration78);
        boolean boolean80 = eventRegistrationDAO63.registerStudent(registration78);
        model.Registration registration83 = new model.Registration((int) (byte) -1, (int) '#');
        int int84 = registration83.getEventId();
        boolean boolean85 = eventRegistrationDAO63.registerStudent(registration83);
        boolean boolean86 = eventRegistrationDAO59.registerStudent(registration83);
        int int87 = registration83.getEventId();
        boolean boolean88 = eventRegistrationDAO14.registerStudent(registration83);
        boolean boolean89 = eventRegistrationDAO0.registerStudent(registration83);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertNull(event33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(eventList47);
        org.junit.Assert.assertNull(event49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(eventList58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(eventList67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(eventList75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 35 + "'", int84 == 35);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 35 + "'", int87 == 35);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        model.Registration registration2 = new model.Registration((int) 'a', (int) (byte) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO19 = new data.EventRegistrationDAO();
        boolean boolean22 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO19.getAllEvents();
        model.Event event25 = eventRegistrationDAO19.getEventById((int) (byte) 1);
        model.Event event27 = eventRegistrationDAO19.getEventById((-1));
        boolean boolean30 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO31 = new data.EventRegistrationDAO();
        boolean boolean34 = eventRegistrationDAO31.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO35 = new data.EventRegistrationDAO();
        boolean boolean38 = eventRegistrationDAO35.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList39 = eventRegistrationDAO35.getAllEvents();
        boolean boolean42 = eventRegistrationDAO35.isAlreadyRegistered(10, (int) 'a');
        boolean boolean45 = eventRegistrationDAO35.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO46 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList47 = eventRegistrationDAO46.getAllEvents();
        model.Registration registration50 = new model.Registration(0, 0);
        boolean boolean51 = eventRegistrationDAO46.registerStudent(registration50);
        boolean boolean52 = eventRegistrationDAO35.registerStudent(registration50);
        model.Registration registration55 = new model.Registration((int) (byte) -1, (int) '#');
        int int56 = registration55.getEventId();
        boolean boolean57 = eventRegistrationDAO35.registerStudent(registration55);
        boolean boolean58 = eventRegistrationDAO31.registerStudent(registration55);
        boolean boolean59 = eventRegistrationDAO19.registerStudent(registration55);
        boolean boolean60 = eventRegistrationDAO0.registerStudent(registration55);
        model.Event event62 = eventRegistrationDAO0.getEventById(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertNotNull(event25);
        org.junit.Assert.assertNull(event27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(eventList47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(event62);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        model.Event event4 = new model.Event((int) (short) 100, "AI Workshop", "hi!", "20/10/2026");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        model.Event event4 = new model.Event((-1), "Lab 101", "", "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent(52, (int) '4');
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) (byte) 0, 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, 52);
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        model.Event event4 = new model.Event(35, "hi!", "20/10/2026", "Lab 101");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        model.Event event4 = new model.Event((int) (short) 0, "20/10/2026", "", "20/10/2026");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        event4.showDetails();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        model.Event event53 = eventRegistrationDAO0.getEventById((int) 'a');
        model.Registration registration56 = new model.Registration(52, 10);
        boolean boolean57 = eventRegistrationDAO0.registerStudent(registration56);
        java.util.List<model.Event> eventList58 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(eventList58);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        data.EventRegistrationDAO eventRegistrationDAO13 = new data.EventRegistrationDAO();
        boolean boolean16 = eventRegistrationDAO13.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO13.getAllEvents();
        model.Event event19 = eventRegistrationDAO13.getEventById((int) (byte) 1);
        model.Event event21 = eventRegistrationDAO13.getEventById((int) (short) 0);
        model.Registration registration24 = new model.Registration(0, (int) (byte) 100);
        boolean boolean25 = eventRegistrationDAO13.registerStudent(registration24);
        int int26 = registration24.getEventId();
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration24);
        boolean boolean30 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event17 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        boolean boolean20 = eventRegistrationService0.registerForEvent((int) (byte) 0, 0);
        java.util.List<model.Event> eventList21 = eventRegistrationService0.showEvents();
        model.Event event23 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event25 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertNull(event25);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration(0, (int) (byte) 100);
        int int11 = registration10.getStudentId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO15 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList16 = eventRegistrationDAO15.getAllEvents();
        model.Registration registration19 = new model.Registration((int) (short) 0, 0);
        int int20 = registration19.getEventId();
        boolean boolean21 = eventRegistrationDAO15.registerStudent(registration19);
        model.Registration registration24 = new model.Registration(0, (int) '#');
        boolean boolean25 = eventRegistrationDAO15.registerStudent(registration24);
        int int26 = registration24.getStudentId();
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        event4.showDetails();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getDate();
        java.lang.String str12 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        int int9 = registration7.getStudentId();
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList15 = eventRegistrationDAO14.getAllEvents();
        model.Registration registration18 = new model.Registration((int) (short) 0, 0);
        int int19 = registration18.getEventId();
        boolean boolean20 = eventRegistrationDAO14.registerStudent(registration18);
        int int21 = registration18.getEventId();
        int int22 = registration18.getStudentId();
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration18);
        model.Event event25 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList26 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(event25);
        org.junit.Assert.assertNotNull(eventList26);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        model.Registration registration2 = new model.Registration((int) (byte) 10, (int) (byte) -1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.util.List<model.Event> eventList18 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO19 = new data.EventRegistrationDAO();
        boolean boolean22 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO19.getAllEvents();
        model.Event event25 = eventRegistrationDAO19.getEventById((int) (byte) 1);
        model.Event event27 = eventRegistrationDAO19.getEventById((-1));
        boolean boolean30 = eventRegistrationDAO19.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO31 = new data.EventRegistrationDAO();
        boolean boolean34 = eventRegistrationDAO31.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO35 = new data.EventRegistrationDAO();
        boolean boolean38 = eventRegistrationDAO35.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList39 = eventRegistrationDAO35.getAllEvents();
        boolean boolean42 = eventRegistrationDAO35.isAlreadyRegistered(10, (int) 'a');
        boolean boolean45 = eventRegistrationDAO35.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO46 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList47 = eventRegistrationDAO46.getAllEvents();
        model.Registration registration50 = new model.Registration(0, 0);
        boolean boolean51 = eventRegistrationDAO46.registerStudent(registration50);
        boolean boolean52 = eventRegistrationDAO35.registerStudent(registration50);
        model.Registration registration55 = new model.Registration((int) (byte) -1, (int) '#');
        int int56 = registration55.getEventId();
        boolean boolean57 = eventRegistrationDAO35.registerStudent(registration55);
        boolean boolean58 = eventRegistrationDAO31.registerStudent(registration55);
        boolean boolean59 = eventRegistrationDAO19.registerStudent(registration55);
        boolean boolean60 = eventRegistrationDAO0.registerStudent(registration55);
        int int61 = registration55.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertNotNull(event25);
        org.junit.Assert.assertNull(event27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(eventList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(eventList47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getDate();
        event4.showDetails();
        java.lang.String str9 = event4.getDate();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        model.Event event19 = eventRegistrationDAO0.getEventById((int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        boolean boolean23 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList24 = eventRegistrationDAO20.getAllEvents();
        model.Event event26 = eventRegistrationDAO20.getEventById((int) '4');
        java.util.List<model.Event> eventList27 = eventRegistrationDAO20.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO28 = new data.EventRegistrationDAO();
        boolean boolean31 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList32 = eventRegistrationDAO28.getAllEvents();
        model.Event event34 = eventRegistrationDAO28.getEventById((int) (byte) 1);
        model.Event event36 = eventRegistrationDAO28.getEventById((int) (short) 0);
        model.Registration registration39 = new model.Registration(0, (int) (byte) 100);
        boolean boolean40 = eventRegistrationDAO28.registerStudent(registration39);
        model.Event event42 = eventRegistrationDAO28.getEventById((int) (byte) 0);
        model.Registration registration45 = new model.Registration(0, (int) '#');
        int int46 = registration45.getEventId();
        boolean boolean47 = eventRegistrationDAO28.registerStudent(registration45);
        boolean boolean48 = eventRegistrationDAO20.registerStudent(registration45);
        boolean boolean49 = eventRegistrationDAO0.registerStudent(registration45);
        boolean boolean52 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 0);
        boolean boolean55 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertNotNull(event34);
        org.junit.Assert.assertNull(event36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(event42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getLocation();
        java.lang.String str12 = event4.getDate();
        java.lang.String str13 = event4.getLocation();
        java.lang.String str14 = event4.getDate();
        java.lang.String str15 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        model.Event event4 = new model.Event((int) (byte) 100, "hi!", "", "hi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (short) -1, 52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        boolean boolean33 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', 10);
        model.Registration registration36 = new model.Registration((int) '#', (int) (short) -1);
        boolean boolean37 = eventRegistrationDAO0.registerStudent(registration36);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        model.Event event4 = new model.Event((int) 'a', "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lab 101" + "'", str6, "Lab 101");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent(1, (int) (byte) 100);
        boolean boolean16 = eventRegistrationService0.registerForEvent(1, 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) '#', (int) (byte) 1);
        boolean boolean10 = eventRegistrationService0.registerForEvent(35, 0);
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails(32);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        boolean boolean6 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) 100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass9 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        model.Registration registration2 = new model.Registration((int) '4', 97);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        model.Event event28 = eventRegistrationDAO0.getEventById(0);
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
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList8 = eventRegistrationDAO7.getAllEvents();
        model.Event event10 = eventRegistrationDAO7.getEventById((int) (short) 10);
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO11.getAllEvents();
        model.Event event14 = eventRegistrationDAO11.getEventById((int) (short) 10);
        model.Registration registration17 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean18 = eventRegistrationDAO11.registerStudent(registration17);
        int int19 = registration17.getStudentId();
        boolean boolean20 = eventRegistrationDAO7.registerStudent(registration17);
        int int21 = registration17.getEventId();
        int int22 = registration17.getEventId();
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        model.Registration registration2 = new model.Registration((int) (byte) 10, (int) (short) 0);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        model.Registration registration23 = new model.Registration(0, (int) '#');
        boolean boolean24 = eventRegistrationDAO0.registerStudent(registration23);
        java.util.List<model.Event> eventList25 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(eventList25);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        model.Event event20 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(event20);
        org.junit.Assert.assertNotNull(eventList21);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNotNull(eventList8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        model.Event event4 = new model.Event((int) (byte) 10, "20/10/2026", "", "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (short) 1);
        data.EventRegistrationDAO eventRegistrationDAO15 = new data.EventRegistrationDAO();
        boolean boolean18 = eventRegistrationDAO15.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList19 = eventRegistrationDAO15.getAllEvents();
        model.Event event21 = eventRegistrationDAO15.getEventById((int) (byte) 1);
        model.Event event23 = eventRegistrationDAO15.getEventById((-1));
        data.EventRegistrationDAO eventRegistrationDAO24 = new data.EventRegistrationDAO();
        model.Event event26 = eventRegistrationDAO24.getEventById((int) (short) 0);
        model.Registration registration29 = new model.Registration((int) (short) 0, 0);
        boolean boolean30 = eventRegistrationDAO24.registerStudent(registration29);
        boolean boolean31 = eventRegistrationDAO15.registerStudent(registration29);
        int int32 = registration29.getStudentId();
        boolean boolean33 = eventRegistrationDAO0.registerStudent(registration29);
        java.util.List<model.Event> eventList34 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList35 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNotNull(event21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(eventList34);
        org.junit.Assert.assertNotNull(eventList35);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        model.Event event4 = new model.Event((int) (short) 0, "AI Workshop", "hi!", "AI Workshop");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO2 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList3 = eventRegistrationDAO2.getAllEvents();
        model.Event event5 = eventRegistrationDAO2.getEventById((int) (short) 10);
        model.Registration registration8 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean9 = eventRegistrationDAO2.registerStudent(registration8);
        int int10 = registration8.getStudentId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration8);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        model.Registration registration2 = new model.Registration(0, (int) (byte) -1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        model.Event event4 = new model.Event((int) (byte) 0, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) ' ', (int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        model.Event event56 = eventRegistrationDAO0.getEventById(32);
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
        org.junit.Assert.assertNull(event56);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 10);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, 52);
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        model.Event event4 = new model.Event((int) (byte) 1, "hi!", "", "AI Workshop");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        event5.showDetails();
        java.lang.String str7 = event5.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        boolean boolean6 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (short) 10);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        model.Event event4 = new model.Event((int) ' ', "hi!", "AI Workshop", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        event19.showDetails();
        java.lang.String str21 = event19.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20/10/2026" + "'", str21, "20/10/2026");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration(0, (int) (byte) 100);
        int int6 = registration5.getStudentId();
        int int7 = registration5.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration5);
        int int9 = registration5.getStudentId();
        int int10 = registration5.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        model.Registration registration33 = new model.Registration((int) (byte) 100, 0);
        boolean boolean34 = eventRegistrationDAO0.registerStudent(registration33);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (-1));
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        int int16 = event14.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AI Workshop" + "'", str15, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        model.Event event4 = new model.Event((int) (short) 1, "", "20/10/2026", "Lab 101");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered(35, (int) (byte) 10);
        data.EventRegistrationDAO eventRegistrationDAO16 = new data.EventRegistrationDAO();
        boolean boolean19 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList20 = eventRegistrationDAO16.getAllEvents();
        boolean boolean23 = eventRegistrationDAO16.isAlreadyRegistered(10, (int) 'a');
        boolean boolean26 = eventRegistrationDAO16.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO27 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList28 = eventRegistrationDAO27.getAllEvents();
        model.Registration registration31 = new model.Registration(0, 0);
        boolean boolean32 = eventRegistrationDAO27.registerStudent(registration31);
        boolean boolean33 = eventRegistrationDAO16.registerStudent(registration31);
        model.Registration registration36 = new model.Registration((int) (byte) -1, (int) '#');
        int int37 = registration36.getEventId();
        boolean boolean38 = eventRegistrationDAO16.registerStudent(registration36);
        boolean boolean39 = eventRegistrationDAO12.registerStudent(registration36);
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration36);
        int int41 = registration36.getStudentId();
        int int42 = registration36.getEventId();
        int int43 = registration36.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(eventList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Event event18 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList19 = eventRegistrationDAO0.getAllEvents();
        model.Event event21 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNull(event18);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(0);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO11 = new data.EventRegistrationDAO();
        boolean boolean14 = eventRegistrationDAO11.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO11.getAllEvents();
        model.Event event17 = eventRegistrationDAO11.getEventById((int) (byte) 1);
        model.Event event19 = eventRegistrationDAO11.getEventById((int) (short) 0);
        model.Registration registration22 = new model.Registration(0, (int) (byte) 100);
        boolean boolean23 = eventRegistrationDAO11.registerStudent(registration22);
        int int24 = registration22.getEventId();
        int int25 = registration22.getStudentId();
        boolean boolean26 = eventRegistrationDAO0.registerStudent(registration22);
        boolean boolean29 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered(10, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        model.Registration registration2 = new model.Registration((int) (byte) 10, 1);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        int int5 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 1);
        boolean boolean13 = eventRegistrationService0.registerForEvent((-1), (int) (short) 0);
        boolean boolean16 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        model.Event event15 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event17 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        boolean boolean20 = eventRegistrationService0.registerForEvent((int) 'a', 0);
        boolean boolean23 = eventRegistrationService0.registerForEvent(97, 97);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent(1, (int) ' ');
        model.Event event16 = eventRegistrationService0.showEventDetails(100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        model.Registration registration2 = new model.Registration((-1), (int) (byte) -1);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        model.Event event4 = new model.Event((int) (short) 1, "20/10/2026", "Lab 101", "hi!");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        model.Registration registration2 = new model.Registration(52, 97);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        model.Event event59 = eventRegistrationDAO0.getEventById((int) (short) 10);
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
        org.junit.Assert.assertNull(event59);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (short) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        model.Registration registration2 = new model.Registration((int) (byte) 0, 97);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        model.Event event4 = new model.Event((int) (short) 1, "20/10/2026", "Lab 101", "hi!");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, (int) (byte) 1);
        model.Event event12 = eventRegistrationService0.showEventDetails(0);
        boolean boolean15 = eventRegistrationService0.registerForEvent((int) 'a', 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        model.Registration registration2 = new model.Registration(35, (int) (short) 100);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        model.Event event11 = eventRegistrationDAO0.getEventById(1);
        event11.showDetails();
        java.lang.String str13 = event11.getLocation();
        java.lang.String str14 = event11.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lab 101" + "'", str13, "Lab 101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lab 101" + "'", str14, "Lab 101");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        int int7 = event6.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        model.Registration registration2 = new model.Registration((-1), (int) (byte) 10);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration15 = new model.Registration(35, (int) (byte) 10);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration((int) (short) 100, (int) (byte) -1);
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) (short) 0);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean7 = eventRegistrationService0.registerForEvent(32, (int) (short) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (short) 1);
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(event12);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str3 = event2.getLocation();
        event2.showDetails();
        java.lang.Class<?> wildcardClass5 = event2.getClass();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lab 101" + "'", str3, "Lab 101");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList16 = eventRegistrationService0.showEvents();
        boolean boolean19 = eventRegistrationService0.registerForEvent((int) 'a', (int) (short) -1);
        java.util.List<model.Event> eventList20 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        model.Registration registration2 = new model.Registration((int) (byte) -1, (int) '#');
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        boolean boolean4 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) 10);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) '#');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) 'a', 0);
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean16 = eventRegistrationService0.registerForEvent(32, (int) (byte) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO0.getAllEvents();
        model.Event event19 = eventRegistrationDAO0.getEventById(97);
        model.Registration registration22 = new model.Registration((int) (short) 100, (int) '4');
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration22);
        boolean boolean26 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 1, 10);
        boolean boolean29 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getLocation();
        java.lang.String str12 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO14 = new data.EventRegistrationDAO();
        boolean boolean17 = eventRegistrationDAO14.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList18 = eventRegistrationDAO14.getAllEvents();
        model.Event event20 = eventRegistrationDAO14.getEventById((int) (byte) 1);
        model.Event event22 = eventRegistrationDAO14.getEventById((int) (short) 0);
        model.Registration registration25 = new model.Registration(0, (int) (byte) 100);
        boolean boolean26 = eventRegistrationDAO14.registerStudent(registration25);
        int int27 = registration25.getEventId();
        int int28 = registration25.getStudentId();
        boolean boolean29 = eventRegistrationDAO0.registerStudent(registration25);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(event20);
        org.junit.Assert.assertNull(event22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) ' ', 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO13 = new data.EventRegistrationDAO();
        boolean boolean16 = eventRegistrationDAO13.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList17 = eventRegistrationDAO13.getAllEvents();
        model.Event event19 = eventRegistrationDAO13.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        boolean boolean23 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList24 = eventRegistrationDAO20.getAllEvents();
        boolean boolean27 = eventRegistrationDAO20.isAlreadyRegistered(10, (int) 'a');
        boolean boolean30 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO31 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList32 = eventRegistrationDAO31.getAllEvents();
        model.Registration registration35 = new model.Registration(0, 0);
        boolean boolean36 = eventRegistrationDAO31.registerStudent(registration35);
        boolean boolean37 = eventRegistrationDAO20.registerStudent(registration35);
        boolean boolean38 = eventRegistrationDAO13.registerStudent(registration35);
        int int39 = registration35.getEventId();
        boolean boolean40 = eventRegistrationDAO0.registerStudent(registration35);
        model.Event event42 = eventRegistrationDAO0.getEventById(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(eventList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(eventList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(event42);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.util.List<model.Event> eventList18 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(eventList18);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, 0);
        int int7 = registration6.getEventId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', (int) (byte) 10);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (short) 0);
        boolean boolean19 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        model.Event event4 = new model.Event((int) (short) -1, "AI Workshop", "AI Workshop", "");
        event4.showDetails();
        event4.showDetails();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        boolean boolean30 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', 10);
        boolean boolean33 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 100);
        model.Registration registration36 = new model.Registration((int) 'a', (int) 'a');
        boolean boolean37 = eventRegistrationDAO0.registerStudent(registration36);
        model.Registration registration40 = new model.Registration(52, 10);
        int int41 = registration40.getEventId();
        boolean boolean42 = eventRegistrationDAO0.registerStudent(registration40);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        model.Event event21 = eventRegistrationDAO0.getEventById((int) '#');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        model.Event event4 = new model.Event(52, "20/10/2026", "", "20/10/2026");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        model.Event event80 = eventRegistrationDAO0.getEventById(32);
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
        org.junit.Assert.assertNull(event80);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        model.Event event10 = eventRegistrationService0.showEventDetails((int) (byte) 1);
        java.lang.String str11 = event10.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(event10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20/10/2026" + "'", str11, "20/10/2026");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "", "");
        event4.showDetails();
        event4.showDetails();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationService0.showEvents();
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (byte) 0);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) ' ');
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        model.Event event16 = eventRegistrationDAO0.getEventById(10);
        model.Registration registration19 = new model.Registration(1, 0);
        boolean boolean20 = eventRegistrationDAO0.registerStudent(registration19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        model.Event event4 = new model.Event(0, "Lab 101", "", "20/10/2026");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        model.Event event4 = new model.Event((int) (byte) 10, "20/10/2026", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (byte) 1, 100);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (short) 1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        model.Event event11 = eventRegistrationService0.showEventDetails((int) 'a');
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList5 = eventRegistrationDAO0.getAllEvents();
        boolean boolean8 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str3 = event2.getLocation();
        int int4 = event2.getEventId();
        int int5 = event2.getEventId();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lab 101" + "'", str3, "Lab 101");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        int int8 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        model.Event event4 = new model.Event((int) 'a', "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration18 = new model.Registration(0, (int) (short) 10);
        boolean boolean19 = eventRegistrationDAO0.registerStudent(registration18);
        data.EventRegistrationDAO eventRegistrationDAO20 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList21 = eventRegistrationDAO20.getAllEvents();
        model.Event event23 = eventRegistrationDAO20.getEventById((int) (short) 10);
        model.Registration registration26 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean27 = eventRegistrationDAO20.registerStudent(registration26);
        model.Registration registration30 = new model.Registration((int) (short) 0, 0);
        int int31 = registration30.getEventId();
        boolean boolean32 = eventRegistrationDAO20.registerStudent(registration30);
        boolean boolean35 = eventRegistrationDAO20.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO36 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList37 = eventRegistrationDAO36.getAllEvents();
        model.Event event39 = eventRegistrationDAO36.getEventById((int) (short) 10);
        model.Registration registration42 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean43 = eventRegistrationDAO36.registerStudent(registration42);
        model.Registration registration46 = new model.Registration((int) (short) 0, 0);
        int int47 = registration46.getEventId();
        boolean boolean48 = eventRegistrationDAO36.registerStudent(registration46);
        boolean boolean51 = eventRegistrationDAO36.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO52 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList53 = eventRegistrationDAO52.getAllEvents();
        model.Event event55 = eventRegistrationDAO52.getEventById((int) (short) 10);
        model.Registration registration58 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean59 = eventRegistrationDAO52.registerStudent(registration58);
        int int60 = registration58.getEventId();
        boolean boolean61 = eventRegistrationDAO36.registerStudent(registration58);
        int int62 = registration58.getStudentId();
        boolean boolean63 = eventRegistrationDAO20.registerStudent(registration58);
        boolean boolean64 = eventRegistrationDAO0.registerStudent(registration58);
        int int65 = registration58.getEventId();
        int int66 = registration58.getStudentId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(eventList37);
        org.junit.Assert.assertNull(event39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(eventList53);
        org.junit.Assert.assertNull(event55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        model.Event event4 = new model.Event((int) '#', "Lab 101", "AI Workshop", "Lab 101");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        model.Event event4 = new model.Event((int) (byte) 0, "", "20/10/2026", "hi!");
        event4.showDetails();
        event4.showDetails();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) '#');
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (short) 100, (int) '4');
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNotNull(eventList4);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        int int8 = event4.getEventId();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Registration registration9 = new model.Registration(0, (int) '#');
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration9);
        model.Registration registration13 = new model.Registration((int) (short) 1, (int) (byte) 100);
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        boolean boolean15 = eventRegistrationDAO12.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event17 = eventRegistrationDAO12.getEventById((int) '#');
        model.Event event19 = eventRegistrationDAO12.getEventById((int) (byte) 100);
        model.Registration registration22 = new model.Registration(0, (int) (byte) 100);
        int int23 = registration22.getStudentId();
        boolean boolean24 = eventRegistrationDAO12.registerStudent(registration22);
        boolean boolean25 = eventRegistrationDAO0.registerStudent(registration22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        model.Event event4 = new model.Event((int) (byte) 100, "hi!", "Lab 101", "");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }
}

