package randoop.register;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterRegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass2 = eventList1.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        model.Registration registration2 = new model.Registration((-1), (int) (byte) 100);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.Class<?> wildcardClass6 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        model.Registration registration2 = new model.Registration((int) (short) 0, 0);
        int int3 = registration2.getEventId();
        java.lang.Class<?> wildcardClass4 = registration2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        model.Registration registration2 = new model.Registration((int) (short) 0, 0);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass2 = eventList1.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        model.Registration registration2 = new model.Registration(0, 0);
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        java.lang.Class<?> wildcardClass5 = registration2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        model.Event event4 = new model.Event(100, "hi!", "", "AI Workshop");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        model.Registration registration2 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        model.Registration registration2 = new model.Registration((int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        data.EventRegistrationDAO eventRegistrationDAO9 = new data.EventRegistrationDAO();
        model.Event event11 = eventRegistrationDAO9.getEventById((int) (short) 0);
        model.Registration registration14 = new model.Registration((int) (short) 0, 0);
        boolean boolean15 = eventRegistrationDAO9.registerStudent(registration14);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration14);
        java.lang.Class<?> wildcardClass17 = registration14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        int int23 = registration18.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        model.Event event4 = new model.Event((int) (byte) 100, "", "", "AI Workshop");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        data.EventRegistrationDAO eventRegistrationDAO15 = new data.EventRegistrationDAO();
        boolean boolean18 = eventRegistrationDAO15.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList19 = eventRegistrationDAO15.getAllEvents();
        model.Event event21 = eventRegistrationDAO15.getEventById((int) (byte) 1);
        model.Event event23 = eventRegistrationDAO15.getEventById((int) (short) 0);
        model.Registration registration26 = new model.Registration(0, (int) (byte) 100);
        boolean boolean27 = eventRegistrationDAO15.registerStudent(registration26);
        int int28 = registration26.getStudentId();
        int int29 = registration26.getEventId();
        boolean boolean30 = eventRegistrationDAO0.registerStudent(registration26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(eventList19);
        org.junit.Assert.assertNotNull(event21);
        org.junit.Assert.assertNull(event23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        model.Event event4 = new model.Event((int) (byte) 0, "hi!", "", "AI Workshop");
        event4.showDetails();
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, (int) 'a');
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered(0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 0);
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        model.Registration registration2 = new model.Registration(10, (int) (short) -1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        model.Registration registration2 = new model.Registration((int) (short) 100, 97);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        int int7 = registration5.getEventId();
        int int8 = registration5.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        event4.showDetails();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        int int13 = registration11.getEventId();
        java.lang.Class<?> wildcardClass14 = registration11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (short) 0);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        java.lang.Class<?> wildcardClass10 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        java.lang.Class<?> wildcardClass14 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        event17.showDetails();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(event17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        model.Registration registration2 = new model.Registration((int) 'a', 35);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass11 = eventList10.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.lang.Class<?> wildcardClass21 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "hi!");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        java.lang.Class<?> wildcardClass10 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, 10);
        boolean boolean17 = eventRegistrationDAO0.isAlreadyRegistered(1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass65 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 100);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        boolean boolean46 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.Class<?> wildcardClass7 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass24 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration16 = new model.Registration((int) (byte) 100, (int) (short) 0);
        boolean boolean17 = eventRegistrationDAO0.registerStudent(registration16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        boolean boolean22 = eventRegistrationDAO0.isAlreadyRegistered((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        java.lang.Class<?> wildcardClass13 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "", "");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        int int42 = registration36.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        model.Event event13 = eventRegistrationDAO0.getEventById(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) '#');
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.lang.Class<?> wildcardClass6 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        model.Event event5 = eventRegistrationService0.showEventDetails(35);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        model.Registration registration2 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int3 = registration2.getEventId();
        java.lang.Class<?> wildcardClass4 = registration2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        model.Registration registration2 = new model.Registration((int) (short) 10, 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        model.Event event4 = new model.Event((int) (byte) 1, "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        model.Event event4 = new model.Event(0, "", "", "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getLocation();
        int int8 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        model.Event event4 = new model.Event((int) (byte) 10, "AI Workshop", "AI Workshop", "Lab 101");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        model.Event event4 = new model.Event((int) (byte) -1, "Lab 101", "AI Workshop", "20/10/2026");
        event4.showDetails();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        boolean boolean90 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        boolean boolean5 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, (int) '#');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        model.Event event4 = new model.Event((int) 'a', "Lab 101", "hi!", "");
        event4.showDetails();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        model.Event event5 = eventRegistrationService0.showEventDetails(35);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, (int) '4');
        model.Event event13 = eventRegistrationService0.showEventDetails(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        model.Registration registration2 = new model.Registration((int) ' ', (int) (short) 0);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent((int) '#', (int) (byte) 0);
        model.Event event5 = eventRegistrationService0.showEventDetails((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass11 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        int int8 = event4.getEventId();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getDate();
        java.lang.Class<?> wildcardClass11 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        model.Registration registration31 = new model.Registration(10, (int) 'a');
        boolean boolean32 = eventRegistrationDAO0.registerStudent(registration31);
        int int33 = registration31.getEventId();
        int int34 = registration31.getEventId();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        event6.showDetails();
        java.lang.String str8 = event6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lab 101" + "'", str8, "Lab 101");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        int int7 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass27 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.Class<?> wildcardClass21 = eventList20.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        boolean boolean4 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) '#');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.Class<?> wildcardClass26 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str6 = event5.getName();
        event5.showDetails();
        java.lang.String str8 = event5.getDate();
        java.lang.String str9 = event5.getDate();
        event5.showDetails();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20/10/2026" + "'", str9, "20/10/2026");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        boolean boolean8 = eventRegistrationService0.registerForEvent(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getDate();
        java.lang.String str12 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        model.Registration registration2 = new model.Registration((int) '#', (int) (byte) 100);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getName();
        java.lang.String str9 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails(0);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 100, 35);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        int int7 = registration4.getEventId();
        java.lang.Class<?> wildcardClass8 = registration4.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        int int11 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        model.Event event4 = new model.Event((int) 'a', "", "", "20/10/2026");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        model.Event event6 = eventRegistrationService0.showEventDetails((-1));
        model.Event event8 = eventRegistrationService0.showEventDetails((int) '4');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        model.Event event4 = new model.Event((int) (short) 100, "", "Lab 101", "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        boolean boolean43 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 1);
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
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        model.Event event4 = new model.Event(100, "AI Workshop", "AI Workshop", "20/10/2026");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        int int7 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        model.Event event4 = new model.Event(97, "20/10/2026", "hi!", "20/10/2026");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        int int12 = registration10.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        model.Registration registration2 = new model.Registration((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        model.Registration registration2 = new model.Registration(1, (int) (byte) 10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.util.List<model.Event> eventList41 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList41);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        model.Event event4 = new model.Event(10, "AI Workshop", "", "AI Workshop");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        int int8 = event4.getEventId();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        model.Event event4 = new model.Event((int) '#', "hi!", "20/10/2026", "AI Workshop");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        int int65 = registration58.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        model.Registration registration2 = new model.Registration((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        model.Registration registration2 = new model.Registration((int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        model.Event event16 = eventRegistrationDAO0.getEventById((-1));
        model.Event event18 = eventRegistrationDAO0.getEventById(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 32);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        model.Event event4 = new model.Event((int) (byte) -1, "AI Workshop", "20/10/2026", "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) (byte) -1);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        model.Registration registration2 = new model.Registration((int) '#', 35);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        int int5 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (short) 1);
        event6.showDetails();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) (byte) 10);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.Class<?> wildcardClass20 = registration18.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str3 = event2.getLocation();
        java.lang.String str4 = event2.getName();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lab 101" + "'", str3, "Lab 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AI Workshop" + "'", str4, "AI Workshop");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        java.lang.Class<?> wildcardClass11 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getDate();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        model.Registration registration2 = new model.Registration(1, 10);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        model.Event event20 = eventRegistrationDAO0.getEventById((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNull(event20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Event event9 = eventRegistrationDAO0.getEventById((int) ' ');
        model.Event event11 = eventRegistrationDAO0.getEventById((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass9 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        model.Event event4 = new model.Event((int) (byte) 0, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        model.Registration registration2 = new model.Registration(0, 0);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        int int5 = registration2.getStudentId();
        int int6 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        int int13 = registration11.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass10 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        model.Event event4 = new model.Event((int) (short) -1, "", "AI Workshop", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        boolean boolean8 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) '#');
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        int int18 = registration15.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        int int9 = registration6.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) ' ', 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        int int23 = registration18.getStudentId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        model.Registration registration2 = new model.Registration((int) (byte) 0, (int) '#');
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        model.Event event6 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean9 = eventRegistrationService0.registerForEvent(35, (int) (byte) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        boolean boolean11 = eventRegistrationDAO0.isAlreadyRegistered(97, (int) (short) 100);
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((-1));
        model.Event event6 = eventRegistrationService0.showEventDetails(10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNull(event6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        model.Registration registration2 = new model.Registration(1, (int) (short) 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        int int24 = registration20.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        model.Registration registration2 = new model.Registration(32, (int) (short) 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        model.Registration registration2 = new model.Registration(52, 10);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        event4.showDetails();
        int int12 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass10 = eventList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        model.Event event4 = new model.Event(32, "Lab 101", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        model.Event event4 = new model.Event(35, "", "hi!", "");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.Class<?> wildcardClass23 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNull(event11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        java.lang.Class<?> wildcardClass7 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent((int) (byte) 1, (int) (short) 10);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, 10);
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (short) 100, 52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        boolean boolean90 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 97);
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
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass10 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        model.Event event4 = new model.Event(97, "20/10/2026", "hi!", "20/10/2026");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) (byte) 10);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str7 = event6.getDate();
        int int8 = event6.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20/10/2026" + "'", str7, "20/10/2026");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        int int24 = registration20.getEventId();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        model.Registration registration2 = new model.Registration((int) '4', 100);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent((int) '#', (int) (byte) 0);
        model.Event event5 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event7 = eventRegistrationService0.showEventDetails(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.Class<?> wildcardClass18 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNotNull(event17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) 'a', (int) (byte) 1);
        boolean boolean11 = eventRegistrationService0.registerForEvent(32, (int) (short) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        java.lang.Class<?> wildcardClass10 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        model.Registration registration2 = new model.Registration(52, (int) (byte) 100);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration10 = new model.Registration((int) (short) 0, 0);
        int int11 = registration10.getEventId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        model.Registration registration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Registration.getStudentId()\" because \"registration\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        int int41 = registration35.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        model.Registration registration2 = new model.Registration(0, (int) (byte) 100);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) 'a');
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        model.Registration registration2 = new model.Registration(52, 0);
        int int3 = registration2.getEventId();
        int int4 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        model.Event event5 = eventRegistrationService0.showEventDetails(35);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean11 = eventRegistrationService0.registerForEvent(0, (int) '4');
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        model.Event event4 = new model.Event(52, "20/10/2026", "hi!", "hi!");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        boolean boolean8 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        model.Registration registration2 = new model.Registration(35, (int) (byte) 10);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        model.Event event4 = new model.Event((int) 'a', "20/10/2026", "hi!", "20/10/2026");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((-1));
        model.Event event11 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str12 = event11.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20/10/2026" + "'", str12, "20/10/2026");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        model.Event event11 = eventRegistrationDAO0.getEventById(1);
        java.lang.Class<?> wildcardClass12 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(event11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        int int12 = registration9.getStudentId();
        int int13 = registration9.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        java.lang.Class<?> wildcardClass19 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        model.Event event4 = new model.Event((int) (byte) 100, "Lab 101", "Lab 101", "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        java.lang.Class<?> wildcardClass7 = registration5.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        boolean boolean8 = eventRegistrationService0.registerForEvent(35, (int) '#');
        model.Event event10 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str11 = event10.getLocation();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(event10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab 101" + "'", str11, "Lab 101");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        event4.showDetails();
        java.lang.String str9 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        model.Registration registration2 = new model.Registration((int) 'a', 0);
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        model.Registration registration2 = new model.Registration(97, (int) 'a');
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        boolean boolean28 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) (short) 1);
        model.Event event30 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str31 = event30.getLocation();
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
        org.junit.Assert.assertNotNull(event30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lab 101" + "'", str31, "Lab 101");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) '#');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Registration registration8 = new model.Registration(0, (int) '#');
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration8);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        model.Event event14 = eventRegistrationDAO0.getEventById((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        int int26 = registration22.getStudentId();
        int int27 = registration22.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        model.Event event4 = new model.Event(100, "Lab 101", "20/10/2026", "hi!");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        model.Registration registration2 = new model.Registration((int) 'a', (int) '#');
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Event event16 = eventRegistrationDAO0.getEventById((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        boolean boolean31 = eventRegistrationDAO0.isAlreadyRegistered(100, (int) (byte) 0);
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
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        model.Event event4 = new model.Event((int) '4', "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.lang.Class<?> wildcardClass24 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Registration registration8 = new model.Registration(0, (int) '#');
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration8);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Registration registration9 = new model.Registration((int) (byte) 0, (int) (byte) 100);
        int int10 = registration9.getEventId();
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration9);
        data.EventRegistrationDAO eventRegistrationDAO12 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList13 = eventRegistrationDAO12.getAllEvents();
        model.Event event15 = eventRegistrationDAO12.getEventById((int) (short) 10);
        model.Registration registration18 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean19 = eventRegistrationDAO12.registerStudent(registration18);
        model.Registration registration22 = new model.Registration((int) (short) 0, 0);
        int int23 = registration22.getEventId();
        boolean boolean24 = eventRegistrationDAO12.registerStudent(registration22);
        boolean boolean27 = eventRegistrationDAO12.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO28 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList29 = eventRegistrationDAO28.getAllEvents();
        model.Event event31 = eventRegistrationDAO28.getEventById((int) (short) 10);
        model.Registration registration34 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean35 = eventRegistrationDAO28.registerStudent(registration34);
        int int36 = registration34.getEventId();
        boolean boolean37 = eventRegistrationDAO12.registerStudent(registration34);
        boolean boolean38 = eventRegistrationDAO0.registerStudent(registration34);
        java.lang.Class<?> wildcardClass39 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(eventList29);
        org.junit.Assert.assertNull(event31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        event4.showDetails();
        java.lang.Class<?> wildcardClass6 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        model.Registration registration2 = new model.Registration(10, (-1));
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(100, 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        model.Event event4 = new model.Event((int) '4', "20/10/2026", "AI Workshop", "Lab 101");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        model.Event event4 = new model.Event((int) '4', "AI Workshop", "20/10/2026", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        int int17 = registration15.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        model.Registration registration2 = new model.Registration(0, (int) (byte) 100);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getStudentId();
        int int5 = registration2.getEventId();
        java.lang.Class<?> wildcardClass6 = registration2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getName();
        java.lang.String str12 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        model.Registration registration2 = new model.Registration(52, 10);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "Lab 101", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        model.Registration registration2 = new model.Registration(35, 97);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.Class<?> wildcardClass8 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        int int9 = event4.getEventId();
        int int10 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        boolean boolean8 = eventRegistrationService0.registerForEvent(0, (int) (byte) 10);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (byte) -1, 1);
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        model.Event event25 = eventRegistrationDAO0.getEventById((int) (byte) -1);
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
        org.junit.Assert.assertNull(event25);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.util.List<model.Event> eventList20 = eventRegistrationDAO0.getAllEvents();
        data.EventRegistrationDAO eventRegistrationDAO21 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList22 = eventRegistrationDAO21.getAllEvents();
        model.Registration registration25 = new model.Registration((int) (short) 0, 0);
        int int26 = registration25.getEventId();
        boolean boolean27 = eventRegistrationDAO21.registerStudent(registration25);
        int int28 = registration25.getEventId();
        int int29 = registration25.getStudentId();
        int int30 = registration25.getStudentId();
        boolean boolean31 = eventRegistrationDAO0.registerStudent(registration25);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertNotNull(eventList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str14 = event13.getName();
        int int15 = event13.getEventId();
        java.lang.String str16 = event13.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AI Workshop" + "'", str14, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "20/10/2026" + "'", str16, "20/10/2026");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        model.Registration registration2 = new model.Registration((int) (short) 100, 35);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        event4.showDetails();
        event4.showDetails();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Event event13 = eventRegistrationDAO0.getEventById((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Event event5 = eventRegistrationDAO0.getEventById(0);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertNull(event5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 10);
        boolean boolean11 = eventRegistrationService0.registerForEvent(97, (int) '4');
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(eventList13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        model.Event event51 = eventRegistrationDAO0.getEventById(97);
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
        org.junit.Assert.assertNull(event51);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        int int20 = registration16.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass45 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration(0, 0);
        boolean boolean5 = eventRegistrationDAO0.registerStudent(registration4);
        int int6 = registration4.getEventId();
        int int7 = registration4.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getLocation();
        java.lang.Class<?> wildcardClass11 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        int int9 = registration7.getStudentId();
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration7);
        int int11 = registration7.getStudentId();
        int int12 = registration7.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        boolean boolean12 = eventRegistrationService0.registerForEvent((int) (byte) 0, 97);
        boolean boolean15 = eventRegistrationService0.registerForEvent((int) (short) 10, 52);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        int int88 = registration80.getEventId();
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        boolean boolean28 = eventRegistrationDAO0.isAlreadyRegistered((-1), (int) (short) 1);
        boolean boolean31 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 0, (int) (short) -1);
        boolean boolean34 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        model.Event event22 = eventRegistrationService0.showEventDetails((int) (short) -1);
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
        org.junit.Assert.assertNull(event22);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (short) 0);
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        model.Event event4 = new model.Event(0, "20/10/2026", "", "");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.util.List<model.Event> eventList20 = eventRegistrationDAO0.getAllEvents();
        boolean boolean23 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        model.Registration registration71 = new model.Registration((int) '#', (int) '#');
        boolean boolean72 = eventRegistrationDAO0.registerStudent(registration71);
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Registration registration8 = new model.Registration(0, (int) '#');
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration8);
        int int10 = registration8.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        model.Event event4 = new model.Event((int) (short) 10, "", "Lab 101", "20/10/2026");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        model.Event event4 = new model.Event(35, "Lab 101", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        model.Event event4 = new model.Event(100, "hi!", "", "AI Workshop");
        event4.showDetails();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.Class<?> wildcardClass14 = event13.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass22 = eventList21.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        int int47 = registration42.getEventId();
        int int48 = registration42.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        boolean boolean4 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (short) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent(52, (int) (short) -1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "20/10/2026", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails(97);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (byte) 1, 0);
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (byte) -1, 100);
        model.Event event16 = eventRegistrationService0.showEventDetails(10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(event16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        model.Registration registration2 = new model.Registration((int) ' ', 100);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        model.Event event4 = new model.Event((int) (short) -1, "20/10/2026", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lab 101" + "'", str6, "Lab 101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        int int14 = event13.getEventId();
        java.lang.String str15 = event13.getDate();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20/10/2026" + "'", str15, "20/10/2026");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        model.Event event4 = new model.Event(1, "AI Workshop", "", "Lab 101");
        event4.showDetails();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNull(event6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "20/10/2026", "20/10/2026");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        java.util.List<model.Event> eventList23 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration26 = new model.Registration(0, (int) '#');
        boolean boolean27 = eventRegistrationDAO0.registerStudent(registration26);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(eventList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        java.util.List<model.Event> eventList3 = eventRegistrationService0.showEvents();
        model.Event event5 = eventRegistrationService0.showEventDetails((int) 'a');
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) -1, (int) ' ');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        model.Registration registration2 = new model.Registration((int) '4', (int) (short) 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        model.Event event4 = new model.Event((int) (byte) 0, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AI Workshop" + "'", str7, "AI Workshop");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        int int7 = event4.getEventId();
        java.lang.String str8 = event4.getName();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList2 = eventRegistrationService0.showEvents();
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) 'a', 1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNotNull(eventList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        model.Event event4 = new model.Event(1, "hi!", "", "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        java.lang.String str6 = event5.getName();
        event5.showDetails();
        java.lang.String str8 = event5.getDate();
        java.lang.String str9 = event5.getDate();
        java.lang.String str10 = event5.getName();
        java.lang.String str11 = event5.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20/10/2026" + "'", str9, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AI Workshop" + "'", str10, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20/10/2026" + "'", str11, "20/10/2026");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        model.Event event89 = eventRegistrationDAO0.getEventById((int) (short) -1);
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
        org.junit.Assert.assertNull(event89);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.Class<?> wildcardClass14 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(10);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass15 = eventList14.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNull(event13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str14 = event13.getName();
        int int15 = event13.getEventId();
        event13.showDetails();
        java.lang.String str17 = event13.getLocation();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AI Workshop" + "'", str14, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lab 101" + "'", str17, "Lab 101");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass48 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        int int69 = registration65.getStudentId();
        int int70 = registration65.getEventId();
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "hi!");
        java.lang.String str5 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        model.Registration registration2 = new model.Registration((int) (short) 1, 100);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration11 = new model.Registration(0, (int) (byte) 100);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        java.util.List<model.Event> eventList15 = eventRegistrationDAO0.getAllEvents();
        model.Event event17 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertNull(event17);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration(0, 0);
        boolean boolean5 = eventRegistrationDAO0.registerStudent(registration4);
        java.lang.Class<?> wildcardClass6 = registration4.getClass();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        int int9 = event4.getEventId();
        java.lang.String str10 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent(1, (int) 'a');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        model.Registration registration2 = new model.Registration(52, (int) (byte) 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getDate();
        event4.showDetails();
        java.lang.String str10 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        boolean boolean18 = eventRegistrationService0.registerForEvent((-1), (int) (byte) 100);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(eventList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        model.Event event4 = new model.Event((int) (byte) 0, "20/10/2026", "hi!", "Lab 101");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        data.EventRegistrationDAO eventRegistrationDAO23 = new data.EventRegistrationDAO();
        boolean boolean26 = eventRegistrationDAO23.isAlreadyRegistered(35, (int) (byte) 10);
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
        model.Registration registration47 = new model.Registration((int) (byte) -1, (int) '#');
        int int48 = registration47.getEventId();
        boolean boolean49 = eventRegistrationDAO27.registerStudent(registration47);
        boolean boolean50 = eventRegistrationDAO23.registerStudent(registration47);
        data.EventRegistrationDAO eventRegistrationDAO51 = new data.EventRegistrationDAO();
        boolean boolean54 = eventRegistrationDAO51.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList55 = eventRegistrationDAO51.getAllEvents();
        boolean boolean58 = eventRegistrationDAO51.isAlreadyRegistered(10, (int) 'a');
        boolean boolean61 = eventRegistrationDAO51.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO62 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList63 = eventRegistrationDAO62.getAllEvents();
        model.Registration registration66 = new model.Registration(0, 0);
        boolean boolean67 = eventRegistrationDAO62.registerStudent(registration66);
        boolean boolean68 = eventRegistrationDAO51.registerStudent(registration66);
        boolean boolean69 = eventRegistrationDAO23.registerStudent(registration66);
        boolean boolean70 = eventRegistrationDAO0.registerStudent(registration66);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(eventList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(eventList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(eventList55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(eventList63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getLocation();
        java.lang.String str11 = event4.getLocation();
        java.lang.String str12 = event4.getLocation();
        java.lang.String str13 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        model.Registration registration2 = new model.Registration(0, (int) (short) 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        model.Event event4 = new model.Event(100, "AI Workshop", "AI Workshop", "hi!");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AI Workshop" + "'", str6, "AI Workshop");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        boolean boolean67 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO68 = new data.EventRegistrationDAO();
        boolean boolean71 = eventRegistrationDAO68.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList72 = eventRegistrationDAO68.getAllEvents();
        model.Event event74 = eventRegistrationDAO68.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO75 = new data.EventRegistrationDAO();
        boolean boolean78 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList79 = eventRegistrationDAO75.getAllEvents();
        boolean boolean82 = eventRegistrationDAO75.isAlreadyRegistered(10, (int) 'a');
        boolean boolean85 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO86 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList87 = eventRegistrationDAO86.getAllEvents();
        model.Registration registration90 = new model.Registration(0, 0);
        boolean boolean91 = eventRegistrationDAO86.registerStudent(registration90);
        boolean boolean92 = eventRegistrationDAO75.registerStudent(registration90);
        boolean boolean93 = eventRegistrationDAO68.registerStudent(registration90);
        boolean boolean94 = eventRegistrationDAO0.registerStudent(registration90);
        int int95 = registration90.getStudentId();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(eventList72);
        org.junit.Assert.assertNotNull(event74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(eventList79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(eventList87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.Class<?> wildcardClass9 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        model.Event event4 = new model.Event((int) (byte) -1, "Lab 101", "", "Lab 101");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (byte) 0);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        event4.showDetails();
        java.lang.String str10 = event4.getLocation();
        int int11 = event4.getEventId();
        int int12 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        model.Event event4 = new model.Event(35, "AI Workshop", "hi!", "Lab 101");
        event4.showDetails();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        model.Event event4 = new model.Event((int) (short) 100, "Lab 101", "Lab 101", "Lab 101");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList5 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        boolean boolean9 = eventRegistrationService0.registerForEvent(1, 35);
        java.lang.Class<?> wildcardClass10 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(eventList5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.util.List<model.Event> eventList66 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList66);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        int int7 = registration4.getEventId();
        int int8 = registration4.getStudentId();
        int int9 = registration4.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        model.Registration registration2 = new model.Registration(100, 35);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        model.Event event4 = new model.Event((int) '4', "", "20/10/2026", "AI Workshop");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        model.Event event18 = eventRegistrationDAO0.getEventById((int) '4');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        model.Event event4 = new model.Event(100, "20/10/2026", "Lab 101", "AI Workshop");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        model.Registration registration12 = new model.Registration(0, (int) (byte) -1);
        boolean boolean13 = eventRegistrationDAO0.registerStudent(registration12);
        boolean boolean16 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        model.Event event4 = new model.Event(0, "20/10/2026", "", "");
        event4.showDetails();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        model.Registration registration2 = new model.Registration((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getName();
        java.lang.Class<?> wildcardClass6 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) '#');
        model.Event event7 = eventRegistrationService0.showEventDetails(35);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        model.Registration registration2 = new model.Registration((int) 'a', 0);
        java.lang.Class<?> wildcardClass3 = registration2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        model.Event event21 = eventRegistrationDAO0.getEventById(97);
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
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        model.Registration registration2 = new model.Registration((int) '#', (int) (short) 1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        model.Event event4 = new model.Event(97, "20/10/2026", "", "AI Workshop");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str7 = event6.getLocation();
        java.lang.String str8 = event6.getName();
        java.lang.Class<?> wildcardClass9 = event6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab 101" + "'", str7, "Lab 101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AI Workshop" + "'", str8, "AI Workshop");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        model.Registration registration9 = new model.Registration(0, (int) '#');
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration9);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration7);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Event event14 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        boolean boolean67 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO68 = new data.EventRegistrationDAO();
        boolean boolean71 = eventRegistrationDAO68.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList72 = eventRegistrationDAO68.getAllEvents();
        model.Event event74 = eventRegistrationDAO68.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO75 = new data.EventRegistrationDAO();
        boolean boolean78 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList79 = eventRegistrationDAO75.getAllEvents();
        boolean boolean82 = eventRegistrationDAO75.isAlreadyRegistered(10, (int) 'a');
        boolean boolean85 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO86 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList87 = eventRegistrationDAO86.getAllEvents();
        model.Registration registration90 = new model.Registration(0, 0);
        boolean boolean91 = eventRegistrationDAO86.registerStudent(registration90);
        boolean boolean92 = eventRegistrationDAO75.registerStudent(registration90);
        boolean boolean93 = eventRegistrationDAO68.registerStudent(registration90);
        boolean boolean94 = eventRegistrationDAO0.registerStudent(registration90);
        int int95 = registration90.getEventId();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(eventList72);
        org.junit.Assert.assertNotNull(event74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(eventList79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(eventList87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        model.Event event4 = new model.Event((int) (byte) 100, "hi!", "AI Workshop", "AI Workshop");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        boolean boolean67 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 0);
        java.util.List<model.Event> eventList68 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(eventList68);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        model.Event event4 = new model.Event((int) 'a', "", "", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getLocation();
        java.lang.String str8 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        model.Event event4 = new model.Event((int) (byte) -1, "hi!", "", "");
        java.lang.String str5 = event4.getName();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getName();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        model.Registration registration2 = new model.Registration(0, 97);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 1);
        java.lang.String str3 = event2.getLocation();
        java.lang.String str4 = event2.getDate();
        org.junit.Assert.assertNotNull(event2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lab 101" + "'", str3, "Lab 101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20/10/2026" + "'", str4, "20/10/2026");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.Registration registration2 = new model.Registration((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        int int88 = registration80.getStudentId();
        int int89 = registration80.getEventId();
        int int90 = registration80.getEventId();
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
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 35 + "'", int89 == 35);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        event6.showDetails();
        java.lang.String str8 = event6.getDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20/10/2026" + "'", str8, "20/10/2026");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        model.Event event21 = eventRegistrationDAO0.getEventById((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNotNull(eventList17);
        org.junit.Assert.assertNull(event19);
        org.junit.Assert.assertNull(event21);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) '4');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(eventList6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        model.Registration registration11 = new model.Registration((int) '#', 35);
        int int12 = registration11.getStudentId();
        int int13 = registration11.getEventId();
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration11);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        int int8 = event4.getEventId();
        java.lang.String str9 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        java.lang.String str5 = event4.getLocation();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lab 101" + "'", str5, "Lab 101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        int int41 = registration38.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        model.Event event4 = new model.Event((int) '4', "AI Workshop", "20/10/2026", "");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        int int7 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        java.lang.Class<?> wildcardClass18 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass9 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        boolean boolean6 = eventRegistrationService0.registerForEvent((int) (byte) 10, (int) (byte) 0);
        model.Event event8 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.Event event4 = new model.Event(0, "", "hi!", "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (byte) 100);
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) (byte) 10, 52);
        boolean boolean13 = eventRegistrationService0.registerForEvent(0, (int) (short) 10);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        model.Event event4 = new model.Event(100, "AI Workshop", "AI Workshop", "hi!");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        model.Event event4 = new model.Event(10, "Lab 101", "hi!", "");
        event4.showDetails();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList14 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(eventList14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        model.Event event4 = new model.Event(52, "Lab 101", "20/10/2026", "20/10/2026");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(eventList6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((-1));
        model.Registration registration11 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration11);
        boolean boolean15 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', (int) (short) 0);
        boolean boolean18 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        model.Event event32 = eventRegistrationDAO0.getEventById((int) (byte) 10);
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        int int8 = event4.getEventId();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        int int9 = event4.getEventId();
        int int10 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        java.util.List<model.Event> eventList1 = eventRegistrationService0.showEvents();
        boolean boolean4 = eventRegistrationService0.registerForEvent((-1), 52);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "hi!");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        model.Event event4 = new model.Event((int) (byte) 0, "20/10/2026", "20/10/2026", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 0);
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        model.Event event10 = eventRegistrationDAO0.getEventById((int) 'a');
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        int int11 = event4.getEventId();
        int int12 = event4.getEventId();
        java.lang.String str13 = event4.getLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 1);
        org.junit.Assert.assertNotNull(event2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        model.Event event8 = eventRegistrationDAO0.getEventById(97);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        int int7 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        java.lang.String str12 = event4.getLocation();
        java.lang.Class<?> wildcardClass13 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        model.Event event4 = new model.Event(100, "AI Workshop", "AI Workshop", "hi!");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration(0, (int) (byte) 100);
        int int7 = registration6.getStudentId();
        boolean boolean8 = eventRegistrationDAO0.registerStudent(registration6);
        model.Event event10 = eventRegistrationDAO0.getEventById((-1));
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', (int) '4');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        model.Event event7 = eventRegistrationDAO0.getEventById((int) (byte) 100);
        model.Registration registration10 = new model.Registration(0, (int) (byte) 100);
        int int11 = registration10.getStudentId();
        boolean boolean12 = eventRegistrationDAO0.registerStudent(registration10);
        java.lang.Class<?> wildcardClass13 = registration10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        model.Event event10 = eventRegistrationService0.showEventDetails((-1));
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (short) 1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(event12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        model.Event event4 = new model.Event((int) (short) 1, "", "Lab 101", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        int int12 = registration10.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        model.Event event4 = new model.Event((int) (short) 10, "20/10/2026", "", "AI Workshop");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        model.Event event4 = new model.Event((int) (short) -1, "", "Lab 101", "AI Workshop");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        model.Event event4 = new model.Event((int) (byte) 100, "", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        int int27 = registration25.getEventId();
        int int28 = registration25.getEventId();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(eventList10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        model.Registration registration31 = new model.Registration(10, (int) 'a');
        boolean boolean32 = eventRegistrationDAO0.registerStudent(registration31);
        java.util.List<model.Event> eventList33 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(eventList33);
        org.junit.Assert.assertNotNull(eventList34);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNull(event13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        model.Registration registration29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = eventRegistrationDAO0.registerStudent(registration29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Registration.getStudentId()\" because \"registration\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        model.Event event4 = new model.Event(10, "20/10/2026", "20/10/2026", "20/10/2026");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration4 = new model.Registration((int) (short) 0, 0);
        int int5 = registration4.getEventId();
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration4);
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered(100, (int) '4');
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getLocation();
        java.lang.String str9 = event4.getDate();
        java.lang.String str10 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        model.Registration registration14 = new model.Registration((int) (byte) -1, (int) '#');
        int int15 = registration14.getEventId();
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration14);
        int int17 = registration14.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        model.Event event4 = new model.Event(0, "AI Workshop", "hi!", "hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        java.lang.String str10 = event4.getDate();
        java.lang.String str11 = event4.getDate();
        java.lang.String str12 = event4.getLocation();
        java.lang.Class<?> wildcardClass13 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean10 = eventRegistrationService0.registerForEvent(10, 97);
        boolean boolean13 = eventRegistrationService0.registerForEvent((int) (byte) 100, (int) (short) 0);
        java.util.List<model.Event> eventList14 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(eventList14);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails((int) 'a');
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 10);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass11 = eventList10.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        model.Event event4 = new model.Event(0, "AI Workshop", "20/10/2026", "Lab 101");
        int int5 = event4.getEventId();
        java.lang.String str6 = event4.getDate();
        java.lang.Class<?> wildcardClass7 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20/10/2026" + "'", str6, "20/10/2026");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNotNull(eventList22);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str14 = event13.getName();
        java.lang.String str15 = event13.getLocation();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AI Workshop" + "'", str14, "AI Workshop");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lab 101" + "'", str15, "Lab 101");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean7 = eventRegistrationService0.registerForEvent(35, (-1));
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        int int8 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        model.Event event14 = eventRegistrationService0.showEventDetails(1);
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) '#', (int) (short) 0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNotNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        model.Registration registration2 = new model.Registration((int) (byte) -1, (int) '#');
        int int3 = registration2.getEventId();
        int int4 = registration2.getEventId();
        int int5 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        model.Event event4 = eventRegistrationService0.showEventDetails((int) (byte) 0);
        boolean boolean7 = eventRegistrationService0.registerForEvent(35, (int) '#');
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        boolean boolean48 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 97);
        model.Event event50 = eventRegistrationDAO0.getEventById((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(event50);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList1 = eventRegistrationDAO0.getAllEvents();
        model.Event event3 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration6 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean7 = eventRegistrationDAO0.registerStudent(registration6);
        int int8 = registration6.getEventId();
        int int9 = registration6.getEventId();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        model.Event event4 = new model.Event(1, "20/10/2026", "AI Workshop", "AI Workshop");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        java.util.List<model.Event> eventList8 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass9 = eventList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        model.Event event4 = new model.Event((int) (byte) 1, "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass5 = event4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        event4.showDetails();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        int int8 = event4.getEventId();
        event4.showDetails();
        event4.showDetails();
        java.lang.Class<?> wildcardClass11 = event4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.util.List<model.Event> eventList79 = eventRegistrationDAO0.getAllEvents();
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
        org.junit.Assert.assertNotNull(eventList79);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) 0);
        model.Event event4 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNull(event4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        model.Event event4 = new model.Event(0, "AI Workshop", "", "");
        java.lang.String str5 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI Workshop" + "'", str5, "AI Workshop");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        boolean boolean8 = eventRegistrationService0.registerForEvent((int) (short) 100, (int) (byte) -1);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) (byte) 10);
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        model.Event event15 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNull(event15);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        java.util.List<model.Event> eventList9 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getLocation();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        int int61 = registration55.getEventId();
        int int62 = registration55.getStudentId();
        int int63 = registration55.getEventId();
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        boolean boolean52 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) -1, 52);
        boolean boolean55 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) '4');
        model.Registration registration56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = eventRegistrationDAO0.registerStudent(registration56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Registration.getStudentId()\" because \"registration\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails(97);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (byte) 1, 0);
        java.util.List<model.Event> eventList12 = eventRegistrationService0.showEvents();
        model.Event event14 = eventRegistrationService0.showEventDetails((int) '#');
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertNull(event14);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        model.Registration registration2 = new model.Registration(0, (int) (byte) 100);
        int int3 = registration2.getStudentId();
        int int4 = registration2.getEventId();
        int int5 = registration2.getEventId();
        int int6 = registration2.getStudentId();
        int int7 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        java.lang.String str11 = event4.getName();
        event4.showDetails();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.util.List<model.Event> eventList20 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList21 = eventRegistrationDAO0.getAllEvents();
        model.Event event23 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        java.lang.String str24 = event23.getLocation();
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(eventList20);
        org.junit.Assert.assertNotNull(eventList21);
        org.junit.Assert.assertNotNull(event23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lab 101" + "'", str24, "Lab 101");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails(97);
        boolean boolean11 = eventRegistrationService0.registerForEvent((int) (byte) 1, 0);
        boolean boolean14 = eventRegistrationService0.registerForEvent((int) (byte) -1, 100);
        model.Event event16 = eventRegistrationService0.showEventDetails(32);
        java.util.List<model.Event> eventList17 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(event16);
        org.junit.Assert.assertNotNull(eventList17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        boolean boolean23 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, 0);
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
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Event event10 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList12 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(eventList12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        int int33 = registration30.getEventId();
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
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.Class<?> wildcardClass6 = event4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        boolean boolean15 = eventRegistrationService0.registerForEvent((int) '4', (int) '4');
        java.util.List<model.Event> eventList16 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList17 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(eventList16);
        org.junit.Assert.assertNotNull(eventList17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        model.Registration registration2 = new model.Registration(32, 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        model.Event event4 = new model.Event(35, "20/10/2026", "20/10/2026", "AI Workshop");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        boolean boolean11 = eventRegistrationService0.registerForEvent(35, (int) (short) -1);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) (short) 1);
        model.Registration registration8 = new model.Registration(0, (int) '#');
        boolean boolean9 = eventRegistrationDAO0.registerStudent(registration8);
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered((int) '4', (int) '4');
        java.util.List<model.Event> eventList13 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass14 = eventList13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(event5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass47 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', 100);
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) (short) 0);
        boolean boolean13 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        model.Registration registration2 = new model.Registration((int) (short) -1, (int) '#');
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList3 = eventRegistrationDAO0.getAllEvents();
        java.lang.Class<?> wildcardClass4 = eventList3.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertNotNull(eventList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getLocation();
        int int10 = event4.getEventId();
        event4.showDetails();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        model.Registration registration2 = new model.Registration((-1), (int) (short) 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.util.List<model.Event> eventList29 = eventRegistrationDAO28.getAllEvents();
        model.Event event31 = eventRegistrationDAO28.getEventById((int) (short) 10);
        model.Registration registration34 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean35 = eventRegistrationDAO28.registerStudent(registration34);
        model.Registration registration38 = new model.Registration((int) (short) 0, 0);
        int int39 = registration38.getEventId();
        boolean boolean40 = eventRegistrationDAO28.registerStudent(registration38);
        boolean boolean43 = eventRegistrationDAO28.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        model.Registration registration46 = new model.Registration(0, (int) (short) 10);
        boolean boolean47 = eventRegistrationDAO28.registerStudent(registration46);
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
        model.Registration registration74 = new model.Registration((int) (short) 0, 0);
        int int75 = registration74.getEventId();
        boolean boolean76 = eventRegistrationDAO64.registerStudent(registration74);
        boolean boolean79 = eventRegistrationDAO64.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO80 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList81 = eventRegistrationDAO80.getAllEvents();
        model.Event event83 = eventRegistrationDAO80.getEventById((int) (short) 10);
        model.Registration registration86 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean87 = eventRegistrationDAO80.registerStudent(registration86);
        int int88 = registration86.getEventId();
        boolean boolean89 = eventRegistrationDAO64.registerStudent(registration86);
        int int90 = registration86.getStudentId();
        boolean boolean91 = eventRegistrationDAO48.registerStudent(registration86);
        boolean boolean92 = eventRegistrationDAO28.registerStudent(registration86);
        int int93 = registration86.getEventId();
        boolean boolean94 = eventRegistrationDAO0.registerStudent(registration86);
        int int95 = registration86.getEventId();
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
        org.junit.Assert.assertNotNull(eventList29);
        org.junit.Assert.assertNull(event31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(eventList49);
        org.junit.Assert.assertNull(event51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(eventList65);
        org.junit.Assert.assertNull(event67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(eventList81);
        org.junit.Assert.assertNull(event83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 35 + "'", int93 == 35);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 35 + "'", int95 == 35);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        model.Event event6 = eventRegistrationService0.showEventDetails((int) (short) 1);
        model.Event event8 = eventRegistrationService0.showEventDetails(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        model.Registration registration2 = new model.Registration((int) '4', (int) '#');
        int int3 = registration2.getStudentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getDate();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration7 = new model.Registration(0, 0);
        int int8 = registration7.getEventId();
        int int9 = registration7.getStudentId();
        boolean boolean10 = eventRegistrationDAO0.registerStudent(registration7);
        int int11 = registration7.getStudentId();
        int int12 = registration7.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        model.Event event4 = new model.Event((int) (byte) 0, "", "20/10/2026", "hi!");
        int int5 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        model.Registration registration2 = new model.Registration(0, (int) (byte) 10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        java.lang.String str8 = event4.getName();
        java.lang.String str9 = event4.getName();
        int int10 = event4.getEventId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        model.Event event4 = new model.Event((int) (byte) 1, "hi!", "AI Workshop", "AI Workshop");
        java.lang.String str5 = event4.getName();
        int int6 = event4.getEventId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) '#', 1);
        java.util.List<model.Event> eventList6 = eventRegistrationService0.showEvents();
        model.Event event8 = eventRegistrationService0.showEventDetails((int) (short) 100);
        model.Event event10 = eventRegistrationService0.showEventDetails((-1));
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertNotNull(eventList11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        model.Event event4 = new model.Event((int) (byte) 0, "20/10/2026", "20/10/2026", "hi!");
        java.lang.String str5 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        data.EventRegistrationDAO eventRegistrationDAO65 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList66 = eventRegistrationDAO65.getAllEvents();
        model.Event event68 = eventRegistrationDAO65.getEventById((int) (short) 10);
        model.Registration registration71 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean72 = eventRegistrationDAO65.registerStudent(registration71);
        model.Registration registration75 = new model.Registration((int) (short) 0, 0);
        int int76 = registration75.getEventId();
        boolean boolean77 = eventRegistrationDAO65.registerStudent(registration75);
        boolean boolean80 = eventRegistrationDAO65.isAlreadyRegistered((int) (byte) 100, (int) (byte) 100);
        data.EventRegistrationDAO eventRegistrationDAO81 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList82 = eventRegistrationDAO81.getAllEvents();
        model.Event event84 = eventRegistrationDAO81.getEventById((int) (short) 10);
        model.Registration registration87 = new model.Registration((int) (byte) -1, (int) '#');
        boolean boolean88 = eventRegistrationDAO81.registerStudent(registration87);
        int int89 = registration87.getEventId();
        boolean boolean90 = eventRegistrationDAO65.registerStudent(registration87);
        model.Event event92 = eventRegistrationDAO65.getEventById((int) ' ');
        model.Registration registration95 = new model.Registration((int) '#', 35);
        int int96 = registration95.getEventId();
        boolean boolean97 = eventRegistrationDAO65.registerStudent(registration95);
        boolean boolean98 = eventRegistrationDAO0.registerStudent(registration95);
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
        org.junit.Assert.assertNotNull(eventList66);
        org.junit.Assert.assertNull(event68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(eventList82);
        org.junit.Assert.assertNull(event84);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 35 + "'", int89 == 35);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(event92);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 35 + "'", int96 == 35);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        java.lang.String str14 = event13.getName();
        int int15 = event13.getEventId();
        java.lang.String str16 = event13.getLocation();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AI Workshop" + "'", str14, "AI Workshop");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lab 101" + "'", str16, "Lab 101");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        boolean boolean67 = eventRegistrationDAO0.isAlreadyRegistered((int) ' ', (int) (short) 0);
        data.EventRegistrationDAO eventRegistrationDAO68 = new data.EventRegistrationDAO();
        boolean boolean71 = eventRegistrationDAO68.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList72 = eventRegistrationDAO68.getAllEvents();
        model.Event event74 = eventRegistrationDAO68.getEventById((int) (byte) 1);
        data.EventRegistrationDAO eventRegistrationDAO75 = new data.EventRegistrationDAO();
        boolean boolean78 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList79 = eventRegistrationDAO75.getAllEvents();
        boolean boolean82 = eventRegistrationDAO75.isAlreadyRegistered(10, (int) 'a');
        boolean boolean85 = eventRegistrationDAO75.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        data.EventRegistrationDAO eventRegistrationDAO86 = new data.EventRegistrationDAO();
        java.util.List<model.Event> eventList87 = eventRegistrationDAO86.getAllEvents();
        model.Registration registration90 = new model.Registration(0, 0);
        boolean boolean91 = eventRegistrationDAO86.registerStudent(registration90);
        boolean boolean92 = eventRegistrationDAO75.registerStudent(registration90);
        boolean boolean93 = eventRegistrationDAO68.registerStudent(registration90);
        int int94 = registration90.getStudentId();
        boolean boolean95 = eventRegistrationDAO0.registerStudent(registration90);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(eventList72);
        org.junit.Assert.assertNotNull(event74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(eventList79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(eventList87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        boolean boolean10 = eventRegistrationService0.registerForEvent(10, (int) (byte) 1);
        model.Event event12 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(event12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((int) (short) -1);
        java.util.List<model.Event> eventList8 = eventRegistrationService0.showEvents();
        java.lang.Class<?> wildcardClass9 = eventRegistrationService0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        model.Event event4 = new model.Event((int) (byte) -1, "", "", "");
        event4.showDetails();
        java.lang.String str6 = event4.getLocation();
        event4.showDetails();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        int int7 = registration5.getStudentId();
        int int8 = registration5.getStudentId();
        int int9 = registration5.getEventId();
        int int10 = registration5.getEventId();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) '4');
        java.util.List<model.Event> eventList7 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration10 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean11 = eventRegistrationDAO0.registerStudent(registration10);
        boolean boolean14 = eventRegistrationDAO0.isAlreadyRegistered(52, 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
        org.junit.Assert.assertNotNull(eventList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        model.Event event4 = new model.Event(100, "", "20/10/2026", "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        boolean boolean54 = eventRegistrationDAO0.isAlreadyRegistered((int) 'a', (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        model.Registration registration2 = new model.Registration((int) (short) 0, (int) (short) 100);
        int int3 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        boolean boolean3 = eventRegistrationService0.registerForEvent(100, (int) ' ');
        java.util.List<model.Event> eventList4 = eventRegistrationService0.showEvents();
        model.Event event6 = eventRegistrationService0.showEventDetails(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNull(event6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        int int17 = registration13.getStudentId();
        int int18 = registration13.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertNotNull(eventList8);
        org.junit.Assert.assertNull(event10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        java.util.List<model.Event> eventList13 = eventRegistrationService0.showEvents();
        boolean boolean16 = eventRegistrationService0.registerForEvent(0, (int) (short) 10);
        model.Event event18 = eventRegistrationService0.showEventDetails(0);
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNotNull(eventList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getDate();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        model.Event event4 = new model.Event((int) (short) 100, "hi!", "20/10/2026", "AI Workshop");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        event4.showDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20/10/2026" + "'", str5, "20/10/2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        model.Event event4 = new model.Event((int) (short) 100, "AI Workshop", "", "Lab 101");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        boolean boolean20 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 1, 1);
        org.junit.Assert.assertNotNull(eventList1);
        org.junit.Assert.assertNull(event3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(event17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        boolean boolean21 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) (short) -1);
        java.util.List<model.Event> eventList22 = eventRegistrationDAO0.getAllEvents();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(eventList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(eventList22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        model.Event event6 = eventRegistrationDAO0.getEventById((int) (byte) 1);
        model.Event event8 = eventRegistrationDAO0.getEventById((int) (short) 0);
        java.util.List<model.Event> eventList9 = eventRegistrationDAO0.getAllEvents();
        java.util.List<model.Event> eventList10 = eventRegistrationDAO0.getAllEvents();
        model.Registration registration13 = new model.Registration((int) (byte) 10, (int) (byte) 10);
        boolean boolean14 = eventRegistrationDAO0.registerStudent(registration13);
        int int15 = registration13.getEventId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertNotNull(event6);
        org.junit.Assert.assertNull(event8);
        org.junit.Assert.assertNotNull(eventList9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        model.Event event4 = new model.Event((int) (byte) 1, "", "hi!", "hi!");
        event4.showDetails();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        model.Event event26 = eventRegistrationDAO20.getEventById((int) '4');
        java.util.List<model.Event> eventList27 = eventRegistrationDAO20.getAllEvents();
        model.Registration registration30 = new model.Registration((int) ' ', (int) (short) 0);
        boolean boolean31 = eventRegistrationDAO20.registerStudent(registration30);
        model.Registration registration34 = new model.Registration((int) (byte) -1, (int) '#');
        int int35 = registration34.getEventId();
        boolean boolean36 = eventRegistrationDAO20.registerStudent(registration34);
        int int37 = registration34.getEventId();
        boolean boolean38 = eventRegistrationDAO0.registerStudent(registration34);
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
        org.junit.Assert.assertNull(event26);
        org.junit.Assert.assertNotNull(eventList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        int int50 = registration47.getStudentId();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass38 = registration33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        model.Event event12 = eventRegistrationService0.showEventDetails((int) ' ');
        model.Event event14 = eventRegistrationService0.showEventDetails((int) (short) -1);
        boolean boolean17 = eventRegistrationService0.registerForEvent((int) (byte) 0, 32);
        java.util.List<model.Event> eventList18 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertNull(event14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(eventList18);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        java.lang.String str5 = event4.getDate();
        java.lang.String str6 = event4.getName();
        java.lang.String str7 = event4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent((int) (short) 1, (int) (byte) 1);
        model.Event event7 = eventRegistrationService0.showEventDetails(100);
        model.Event event9 = eventRegistrationService0.showEventDetails(0);
        java.util.List<model.Event> eventList10 = eventRegistrationService0.showEvents();
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        boolean boolean14 = eventRegistrationService0.registerForEvent(52, (int) '4');
        java.util.List<model.Event> eventList15 = eventRegistrationService0.showEvents();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertNull(event9);
        org.junit.Assert.assertNotNull(eventList10);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(eventList15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.Class<?> wildcardClass66 = eventRegistrationDAO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        int int31 = registration24.getEventId();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        model.Registration registration2 = new model.Registration((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        model.Registration registration2 = new model.Registration((int) (byte) 10, 52);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        model.Registration registration22 = new model.Registration((int) (byte) 10, (int) (byte) 100);
        boolean boolean23 = eventRegistrationDAO0.registerStudent(registration22);
        int int24 = registration22.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(event19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        model.Registration registration2 = new model.Registration(0, 32);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        model.Event event39 = eventRegistrationDAO0.getEventById((int) (short) -1);
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        model.Event event5 = eventRegistrationDAO0.getEventById((int) '#');
        java.util.List<model.Event> eventList6 = eventRegistrationDAO0.getAllEvents();
        boolean boolean9 = eventRegistrationDAO0.isAlreadyRegistered((int) (short) 0, (int) '#');
        boolean boolean12 = eventRegistrationDAO0.isAlreadyRegistered(97, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(event5);
        org.junit.Assert.assertNotNull(eventList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        boolean boolean3 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList4 = eventRegistrationDAO0.getAllEvents();
        boolean boolean7 = eventRegistrationDAO0.isAlreadyRegistered(10, (int) 'a');
        boolean boolean10 = eventRegistrationDAO0.isAlreadyRegistered((int) (byte) 100, (int) (short) 100);
        model.Event event12 = eventRegistrationDAO0.getEventById((int) (short) 10);
        model.Registration registration15 = new model.Registration((int) (short) 10, 0);
        boolean boolean16 = eventRegistrationDAO0.registerStudent(registration15);
        model.Event event18 = eventRegistrationDAO0.getEventById(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eventList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(event12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(event18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        business.EventRegistrationService eventRegistrationService0 = new business.EventRegistrationService();
        model.Event event2 = eventRegistrationService0.showEventDetails((int) '4');
        boolean boolean5 = eventRegistrationService0.registerForEvent(100, (int) 'a');
        model.Event event7 = eventRegistrationService0.showEventDetails((-1));
        boolean boolean10 = eventRegistrationService0.registerForEvent((int) '4', 10);
        java.util.List<model.Event> eventList11 = eventRegistrationService0.showEvents();
        model.Event event13 = eventRegistrationService0.showEventDetails(1);
        int int14 = event13.getEventId();
        event13.showDetails();
        event13.showDetails();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(event7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        model.Registration registration2 = new model.Registration((int) (short) 100, (int) '4');
        int int3 = registration2.getStudentId();
        int int4 = registration2.getEventId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        data.EventRegistrationDAO eventRegistrationDAO0 = new data.EventRegistrationDAO();
        model.Event event2 = eventRegistrationDAO0.getEventById((int) (short) 0);
        model.Registration registration5 = new model.Registration((int) (short) 0, 0);
        boolean boolean6 = eventRegistrationDAO0.registerStudent(registration5);
        data.EventRegistrationDAO eventRegistrationDAO7 = new data.EventRegistrationDAO();
        boolean boolean10 = eventRegistrationDAO7.isAlreadyRegistered((int) (byte) 10, (int) (byte) -1);
        java.util.List<model.Event> eventList11 = eventRegistrationDAO7.getAllEvents();
        model.Event event13 = eventRegistrationDAO7.getEventById((int) (byte) 1);
        model.Event event15 = eventRegistrationDAO7.getEventById((int) (short) 0);
        model.Registration registration18 = new model.Registration(0, (int) (byte) 100);
        boolean boolean19 = eventRegistrationDAO7.registerStudent(registration18);
        int int20 = registration18.getStudentId();
        int int21 = registration18.getEventId();
        boolean boolean22 = eventRegistrationDAO0.registerStudent(registration18);
        java.lang.Class<?> wildcardClass23 = eventRegistrationDAO0.getClass();
        org.junit.Assert.assertNull(event2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(eventList11);
        org.junit.Assert.assertNotNull(event13);
        org.junit.Assert.assertNull(event15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        model.Event event4 = new model.Event((int) (short) -1, "", "hi!", "");
        int int5 = event4.getEventId();
        int int6 = event4.getEventId();
        java.lang.String str7 = event4.getName();
        java.lang.String str8 = event4.getDate();
        java.lang.String str9 = event4.getName();
        java.lang.String str10 = event4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }
}

