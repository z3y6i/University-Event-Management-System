import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean18 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean23 = registrationRepository0.isRegistered("hi!", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int2 = registrationRepository0.getTotalRegistrations();
        boolean boolean5 = registrationRepository0.addRegistration("", "");
        boolean boolean8 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("hi!", "");
        boolean boolean16 = cancelRegistrationService8.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        int int8 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        boolean boolean13 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService4.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int6 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        int int12 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int14 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("hi!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int17 = registrationRepository0.getEventRegistrationCount("");
        int int19 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean22 = registrationRepository0.isRegistered("hi!", "");
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str26 = cancelRegistrationService23.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Invalid Student ID!" + "'", str26, "Invalid Student ID!");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean19 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        int int22 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean26 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("hi!", "hi!");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass14 = cancelRegistrationService8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean9 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("hi!", "hi!");
        int int12 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean15 = cancelRegistrationService8.checkRegistration("", "");
        boolean boolean18 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "");
        java.lang.String str21 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid Student ID!" + "'", str21, "Invalid Student ID!");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService19 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int17 = registrationRepository0.getEventRegistrationCount("");
        int int19 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean22 = registrationRepository0.isRegistered("hi!", "");
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean9 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        int int13 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean6 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str13 = cancelRegistrationService10.cancelRegistration("Invalid Student ID!", "");
        int int14 = cancelRegistrationService10.getTotalRegistrations();
        java.lang.Class<?> wildcardClass15 = cancelRegistrationService10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidStudentId("hi!");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = cancelRegistrationService7.isValidEventId("hi!");
        boolean boolean12 = cancelRegistrationService7.checkRegistration("hi!", "");
        java.lang.String str15 = cancelRegistrationService7.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass2 = registrationRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean15 = registrationRepository0.removeRegistration("", "");
        int int16 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean9 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = cancelRegistrationService12.checkRegistration("hi!", "hi!");
        int int17 = cancelRegistrationService12.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass14 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.isRegistered("hi!", "");
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean20 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int2 = registrationRepository0.getTotalRegistrations();
        boolean boolean5 = registrationRepository0.addRegistration("", "");
        int int7 = registrationRepository0.getEventRegistrationCount("hi!");
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str16 = cancelRegistrationService1.cancelRegistration("hi!", "hi!");
        int int17 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str20 = cancelRegistrationService1.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid Student ID!" + "'", str20, "Invalid Student ID!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidEventId("");
        java.lang.String str11 = cancelRegistrationService4.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean13 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.isRegistered("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        registrationRepository0.displayRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("hi!", "");
        java.lang.String str16 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        int int11 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean13 = cancelRegistrationService8.isValidEventId("hi!");
        int int14 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService2 = new business.CancelRegistrationService(registrationRepository0);
        int int4 = cancelRegistrationService2.getEventRegistrationCount("hi!");
        boolean boolean6 = cancelRegistrationService2.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        int int17 = registrationRepository0.getEventRegistrationCount("hi!");
        int int18 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        java.lang.Class<?> wildcardClass11 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = cancelRegistrationService13.isValidEventId("hi!");
        boolean boolean17 = cancelRegistrationService13.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("");
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str15 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int17 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str13 = cancelRegistrationService10.cancelRegistration("Invalid Student ID!", "");
        boolean boolean15 = cancelRegistrationService10.isValidEventId("Invalid Student ID!");
        boolean boolean17 = cancelRegistrationService10.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("", "");
        boolean boolean13 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean16 = registrationRepository0.removeRegistration("", "");
        boolean boolean19 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "");
        boolean boolean14 = registrationRepository0.addRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean8 = cancelRegistrationService6.isValidEventId("Invalid Student ID!");
        java.lang.String str11 = cancelRegistrationService6.cancelRegistration("hi!", "");
        boolean boolean14 = cancelRegistrationService6.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        int int17 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str17 = cancelRegistrationService14.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int15 = registrationRepository0.getTotalRegistrations();
        int int17 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean20 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean5 = registrationRepository0.isRegistered("", "");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean17 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        boolean boolean20 = cancelRegistrationService1.checkRegistration("", "");
        int int22 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean24 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean26 = cancelRegistrationService1.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean15 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean18 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass19 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean11 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean14 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean19 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        int int22 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean26 = registrationRepository0.isRegistered("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("hi!");
        java.lang.String str13 = cancelRegistrationService8.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("hi!", "");
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean19 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean22 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.removeRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidEventId("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int9 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean14 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean17 = registrationRepository0.removeRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean15 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean18 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean21 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        int int13 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean18 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int19 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean23 = registrationRepository0.isRegistered("hi!", "");
        boolean boolean26 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("", "hi!");
        boolean boolean17 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int18 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean20 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean13 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        int int8 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str12 = cancelRegistrationService9.cancelRegistration("Invalid Student ID!", "hi!");
        boolean boolean14 = cancelRegistrationService9.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean21 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService22 = new business.CancelRegistrationService(registrationRepository0);
        int int24 = cancelRegistrationService22.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.removeRegistration("", "hi!");
        business.CancelRegistrationService cancelRegistrationService18 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService8.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean16 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean19 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass11 = cancelRegistrationService10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean16 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = cancelRegistrationService14.isValidEventId("hi!");
        boolean boolean18 = cancelRegistrationService14.isValidEventId("");
        int int20 = cancelRegistrationService14.getEventRegistrationCount("Invalid Student ID!");
        int int21 = cancelRegistrationService14.getTotalRegistrations();
        boolean boolean23 = cancelRegistrationService14.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("hi!", "hi!");
        java.lang.String str14 = cancelRegistrationService8.cancelRegistration("", "");
        java.lang.Class<?> wildcardClass15 = cancelRegistrationService8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean19 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        int int22 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        int int25 = cancelRegistrationService23.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.removeRegistration("", "hi!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        int int16 = registrationRepository0.getTotalRegistrations();
        int int18 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean21 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str9 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean11 = cancelRegistrationService4.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidEventId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cancelRegistrationService1.checkRegistration("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        int int14 = cancelRegistrationService13.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("", "");
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean19 = registrationRepository0.isRegistered("hi!", "");
        boolean boolean22 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = registrationRepository0.addRegistration("", "");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        java.lang.Class<?> wildcardClass17 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass12 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        boolean boolean16 = registrationRepository0.addRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean23 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService24 = new business.CancelRegistrationService(registrationRepository0);
        int int25 = cancelRegistrationService24.getTotalRegistrations();
        java.lang.Class<?> wildcardClass26 = cancelRegistrationService24.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService17 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean20 = cancelRegistrationService17.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str13 = cancelRegistrationService10.cancelRegistration("hi!", "");
        java.lang.String str16 = cancelRegistrationService10.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean19 = cancelRegistrationService10.checkRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("");
        int int15 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass13 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidEventId("");
        int int13 = cancelRegistrationService8.getTotalRegistrations();
        int int15 = cancelRegistrationService8.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        int int12 = cancelRegistrationService11.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int16 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str7 = cancelRegistrationService4.cancelRegistration("", "hi!");
        boolean boolean9 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str12 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean15 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        java.lang.String str18 = cancelRegistrationService4.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Student ID!" + "'", str7, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Student ID!" + "'", str18, "Invalid Student ID!");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int16 = registrationRepository0.getTotalRegistrations();
        int int18 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("", "");
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int17 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int2 = registrationRepository0.getTotalRegistrations();
        boolean boolean5 = registrationRepository0.addRegistration("", "");
        boolean boolean8 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        int int10 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean12 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int13 = registrationRepository0.getTotalRegistrations();
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean19 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        int int21 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean19 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.isRegistered("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.removeRegistration("", "hi!");
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "hi!");
        int int11 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        java.lang.Class<?> wildcardClass12 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        boolean boolean11 = registrationRepository0.removeRegistration("", "");
        int int13 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        int int17 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int12 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean15 = cancelRegistrationService8.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean7 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        java.lang.String str20 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str23 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid Student ID!" + "'", str20, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Invalid Student ID!" + "'", str23, "Invalid Student ID!");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        int int13 = cancelRegistrationService8.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean20 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        boolean boolean13 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass14 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        int int19 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        int int21 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int4 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean7 = registrationRepository0.isRegistered("", "");
        boolean boolean10 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        boolean boolean12 = registrationRepository0.removeRegistration("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("");
        java.lang.String str11 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("hi!", "");
        int int15 = cancelRegistrationService4.getTotalRegistrations();
        java.lang.String str18 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Student ID!" + "'", str18, "Invalid Student ID!");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidEventId("");
        int int13 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean15 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int16 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int12 = registrationRepository0.getTotalRegistrations();
        int int13 = registrationRepository0.getTotalRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean8 = registrationRepository0.isRegistered("hi!", "");
        boolean boolean11 = registrationRepository0.removeRegistration("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        int int11 = registrationRepository0.getTotalRegistrations();
        int int12 = registrationRepository0.getTotalRegistrations();
        int int14 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService17 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService18 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean12 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int14 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int5 = registrationRepository0.getTotalRegistrations();
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean12 = registrationRepository0.removeRegistration("", "hi!");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("");
        java.lang.String str11 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("hi!", "");
        int int15 = cancelRegistrationService4.getTotalRegistrations();
        int int16 = cancelRegistrationService4.getTotalRegistrations();
        java.lang.Class<?> wildcardClass17 = cancelRegistrationService4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        int int14 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        java.lang.Class<?> wildcardClass15 = cancelRegistrationService4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean14 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean16 = cancelRegistrationService4.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = cancelRegistrationService14.isValidEventId("hi!");
        boolean boolean18 = cancelRegistrationService14.isValidEventId("");
        boolean boolean20 = cancelRegistrationService14.isValidStudentId("Invalid Student ID!");
        java.lang.String str23 = cancelRegistrationService14.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Invalid Student ID!" + "'", str23, "Invalid Student ID!");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.removeRegistration("hi!", "hi!");
        boolean boolean14 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("", "");
        boolean boolean17 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.String str20 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean22 = cancelRegistrationService1.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid Student ID!" + "'", str20, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        int int13 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.addRegistration("", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean19 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        java.lang.String str18 = cancelRegistrationService1.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Student ID!" + "'", str18, "Invalid Student ID!");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "hi!");
        boolean boolean14 = cancelRegistrationService8.checkRegistration("", "");
        int int15 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean19 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean12 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean14 = cancelRegistrationService1.isValidStudentId("");
        int int15 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        java.lang.String str14 = cancelRegistrationService8.cancelRegistration("hi!", "");
        boolean boolean16 = cancelRegistrationService8.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int17 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int6 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass7 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int7 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean14 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = cancelRegistrationService7.isValidEventId("hi!");
        boolean boolean12 = cancelRegistrationService7.checkRegistration("hi!", "");
        boolean boolean14 = cancelRegistrationService7.isValidStudentId("");
        boolean boolean17 = cancelRegistrationService7.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("", "");
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean19 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int20 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        boolean boolean12 = registrationRepository0.removeRegistration("", "");
        boolean boolean15 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean16 = registrationRepository0.addRegistration("", "hi!");
        boolean boolean19 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("", "");
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean19 = registrationRepository0.isRegistered("hi!", "");
        int int21 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean8 = cancelRegistrationService6.isValidEventId("Invalid Student ID!");
        java.lang.String str11 = cancelRegistrationService6.cancelRegistration("hi!", "");
        int int13 = cancelRegistrationService6.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("", "hi!");
        boolean boolean16 = cancelRegistrationService11.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("hi!", "hi!");
        boolean boolean13 = cancelRegistrationService8.isValidEventId("Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService8.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("");
        java.lang.Class<?> wildcardClass16 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("", "");
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int18 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean21 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

