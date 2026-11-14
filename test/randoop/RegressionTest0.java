import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = cancelRegistrationService1.getEventRegistrationCount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.Class<?> wildcardClass4 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        java.lang.Class<?> wildcardClass1 = registrationRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        java.lang.Class<?> wildcardClass5 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        java.lang.Class<?> wildcardClass7 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        java.lang.Class<?> wildcardClass9 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        java.lang.Class<?> wildcardClass2 = registrationRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cancelRegistrationService1.checkRegistration("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cancelRegistrationService1.getEventRegistrationCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidEventId("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cancelRegistrationService1.checkRegistration("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass6 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass14 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass6 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        java.lang.Class<?> wildcardClass10 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass12 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        java.lang.Class<?> wildcardClass7 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        java.lang.Class<?> wildcardClass13 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cancelRegistrationService1.getEventRegistrationCount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass10 = cancelRegistrationService9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        int int7 = registrationRepository0.getTotalRegistrations();
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean12 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        java.lang.Class<?> wildcardClass11 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("");
        java.lang.Class<?> wildcardClass9 = cancelRegistrationService4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        java.lang.Class<?> wildcardClass16 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "hi!");
        boolean boolean19 = registrationRepository0.addRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        int int3 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("");
        java.lang.Class<?> wildcardClass6 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        int int7 = cancelRegistrationService6.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        java.lang.Class<?> wildcardClass11 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean20 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "");
        registrationRepository0.displayRegistrations();
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService4.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("Invalid Student ID!", "hi!");
        int int16 = cancelRegistrationService11.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cancelRegistrationService1.getEventRegistrationCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean8 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        int int10 = cancelRegistrationService1.getTotalRegistrations();
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        int int8 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass9 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str16 = cancelRegistrationService1.cancelRegistration("hi!", "hi!");
        int int17 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean20 = cancelRegistrationService1.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int14 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass13 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService20 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cancelRegistrationService1.checkRegistration("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean15 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean14 = cancelRegistrationService4.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = cancelRegistrationService11.isValidEventId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass17 = cancelRegistrationService11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        java.lang.Class<?> wildcardClass11 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        java.lang.Class<?> wildcardClass8 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int7 = cancelRegistrationService4.getTotalRegistrations();
        boolean boolean9 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int4 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean7 = registrationRepository0.isRegistered("", "");
        boolean boolean10 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean6 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean13 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean10 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass21 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = cancelRegistrationService14.isValidEventId("hi!");
        int int17 = cancelRegistrationService14.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService5 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean8 = registrationRepository0.isRegistered("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean14 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean17 = registrationRepository0.removeRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str19 = cancelRegistrationService1.cancelRegistration("", "hi!");
        java.lang.String str22 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid Student ID!" + "'", str19, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Invalid Student ID!" + "'", str22, "Invalid Student ID!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        int int7 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass8 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int18 = registrationRepository0.getEventRegistrationCount("hi!");
        int int20 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass9 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean12 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        java.lang.Class<?> wildcardClass15 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int15 = cancelRegistrationService1.getEventRegistrationCount("");
        int int17 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "");
        java.lang.Class<?> wildcardClass12 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass5 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int21 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = cancelRegistrationService12.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int5 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass6 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        int int14 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        int int10 = cancelRegistrationService1.getTotalRegistrations();
        int int12 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean18 = registrationRepository0.addRegistration("hi!", "");
        int int20 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        int int12 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        boolean boolean13 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int14 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean18 = cancelRegistrationService15.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        java.lang.Class<?> wildcardClass4 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.isValidEventId("");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService2 = new business.CancelRegistrationService(registrationRepository0);
        int int4 = cancelRegistrationService2.getEventRegistrationCount("hi!");
        boolean boolean6 = cancelRegistrationService2.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        java.lang.Class<?> wildcardClass22 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str13 = cancelRegistrationService10.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean13 = cancelRegistrationService1.checkRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass16 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass2 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean17 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "");
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService12.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        java.lang.Class<?> wildcardClass21 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = cancelRegistrationService1.getEventRegistrationCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        int int3 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        int int13 = cancelRegistrationService1.getTotalRegistrations();
        int int14 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean16 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean18 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        int int5 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.addRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str15 = cancelRegistrationService12.cancelRegistration("Invalid Student ID!", "hi!");
        boolean boolean17 = cancelRegistrationService12.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        int int10 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        int int16 = cancelRegistrationService14.getEventRegistrationCount("Invalid Student ID!");
        int int18 = cancelRegistrationService14.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean20 = cancelRegistrationService14.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean11 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("hi!", "");
        int int15 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        int int11 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean13 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int4 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean7 = registrationRepository0.isRegistered("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("hi!", "");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        int int8 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int14 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean12 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        int int13 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean15 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str16 = cancelRegistrationService1.cancelRegistration("hi!", "hi!");
        boolean boolean18 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = cancelRegistrationService1.checkRegistration("", "hi!");
        boolean boolean7 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean12 = registrationRepository0.isRegistered("", "");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("hi!", "");
        java.lang.String str9 = cancelRegistrationService1.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.removeRegistration("", "");
        boolean boolean13 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean12 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int5 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        boolean boolean13 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = cancelRegistrationService9.isValidStudentId("");
        boolean boolean14 = cancelRegistrationService9.checkRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean9 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        int int11 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getEventRegistrationCount("hi!");
        int int12 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        int int17 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        int int12 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = cancelRegistrationService7.isValidStudentId("");
        java.lang.String str12 = cancelRegistrationService7.cancelRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
        boolean boolean13 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cancelRegistrationService1.getEventRegistrationCount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int17 = registrationRepository0.getEventRegistrationCount("");
        java.lang.Class<?> wildcardClass18 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int6 = cancelRegistrationService1.getTotalRegistrations();
        int int8 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        int int19 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.addRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("");
        java.lang.Class<?> wildcardClass13 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass7 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidEventId("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean12 = registrationRepository0.isRegistered("", "");
        boolean boolean15 = registrationRepository0.isRegistered("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService4.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        int int15 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.addRegistration("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("");
        java.lang.Class<?> wildcardClass9 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        boolean boolean13 = cancelRegistrationService4.isValidEventId("hi!");
        int int14 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        int int11 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int17 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.addRegistration("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        int int12 = registrationRepository0.getEventRegistrationCount("");
        int int13 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidEventId("");
        java.lang.Class<?> wildcardClass13 = cancelRegistrationService8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("");
        int int9 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        boolean boolean13 = cancelRegistrationService4.isValidEventId("");
        boolean boolean16 = cancelRegistrationService4.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean14 = cancelRegistrationService1.checkRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int5 = registrationRepository0.getTotalRegistrations();
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass10 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int6 = cancelRegistrationService1.getTotalRegistrations();
        int int8 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        java.lang.Class<?> wildcardClass11 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService19 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean14 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean16 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean15 = registrationRepository0.removeRegistration("", "");
        boolean boolean18 = registrationRepository0.removeRegistration("", "");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int6 = cancelRegistrationService1.getTotalRegistrations();
        int int8 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        int int11 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("");
        java.lang.String str11 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("hi!", "");
        boolean boolean17 = cancelRegistrationService4.checkRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean6 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass14 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.isRegistered("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int18 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean14 = registrationRepository0.isRegistered("hi!", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean19 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int12 = registrationRepository0.getTotalRegistrations();
        boolean boolean15 = registrationRepository0.addRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        int int11 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService8.isValidEventId("");
        int int13 = cancelRegistrationService8.getTotalRegistrations();
        java.lang.Class<?> wildcardClass14 = cancelRegistrationService8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        boolean boolean13 = cancelRegistrationService4.isValidEventId("");
        int int15 = cancelRegistrationService4.getEventRegistrationCount("");
        boolean boolean17 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        int int11 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean20 = cancelRegistrationService1.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("hi!", "");
        int int15 = cancelRegistrationService8.getEventRegistrationCount("Invalid Student ID!");
        int int17 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean20 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cancelRegistrationService1.getEventRegistrationCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean14 = cancelRegistrationService1.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = cancelRegistrationService13.checkRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int4 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService5 = new business.CancelRegistrationService(registrationRepository0);
        int int7 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str9 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean11 = cancelRegistrationService4.isValidEventId("");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("hi!", "");
        java.lang.String str17 = cancelRegistrationService4.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int13 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean15 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int18 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean8 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        int int15 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass16 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.isRegistered(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        int int8 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean11 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int12 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = cancelRegistrationService11.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        int int13 = cancelRegistrationService11.getEventRegistrationCount("");
        boolean boolean16 = cancelRegistrationService11.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean18 = cancelRegistrationService11.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int9 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService2 = new business.CancelRegistrationService(registrationRepository0);
        int int4 = cancelRegistrationService2.getEventRegistrationCount("hi!");
        int int5 = cancelRegistrationService2.getTotalRegistrations();
        boolean boolean8 = cancelRegistrationService2.checkRegistration("Invalid Student ID!", "hi!");
        int int10 = cancelRegistrationService2.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        boolean boolean13 = registrationRepository0.removeRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean13 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "");
        business.CancelRegistrationService cancelRegistrationService17 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        boolean boolean12 = registrationRepository0.isRegistered("", "");
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean18 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("hi!", "hi!");
        int int13 = cancelRegistrationService8.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str16 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService5 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean8 = registrationRepository0.addRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass10 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        int int12 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        int int7 = cancelRegistrationService1.getTotalRegistrations();
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean14 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        int int7 = cancelRegistrationService4.getTotalRegistrations();
        boolean boolean9 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        boolean boolean14 = cancelRegistrationService4.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass10 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        int int18 = cancelRegistrationService16.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean15 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        int int12 = cancelRegistrationService4.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean19 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int13 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean12 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int2 = registrationRepository0.getTotalRegistrations();
        boolean boolean5 = registrationRepository0.addRegistration("", "");
        boolean boolean8 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = registrationRepository0.getTotalRegistrations();
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean12 = cancelRegistrationService8.checkRegistration("", "hi!");
        int int14 = cancelRegistrationService8.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int13 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass14 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean11 = cancelRegistrationService4.checkRegistration("", "hi!");
        int int13 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        int int14 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean14 = registrationRepository0.addRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean18 = cancelRegistrationService1.checkRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("");
        int int9 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean24 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean14 = cancelRegistrationService1.isValidEventId("hi!");
        int int15 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        int int11 = cancelRegistrationService8.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean8 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean13 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService20 = new business.CancelRegistrationService(registrationRepository0);
        int int22 = cancelRegistrationService20.getEventRegistrationCount("hi!");
        int int23 = cancelRegistrationService20.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        boolean boolean27 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        boolean boolean29 = registrationRepository0.isRegistered("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = cancelRegistrationService14.isValidEventId("hi!");
        boolean boolean18 = cancelRegistrationService14.isValidEventId("");
        boolean boolean20 = cancelRegistrationService14.isValidStudentId("hi!");
        int int21 = cancelRegistrationService14.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService2 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService3 = new business.CancelRegistrationService(registrationRepository0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = registrationRepository0.removeRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean10 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str19 = cancelRegistrationService1.cancelRegistration("", "hi!");
        int int21 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        int int22 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid Student ID!" + "'", str19, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        java.lang.Class<?> wildcardClass16 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int16 = registrationRepository0.getTotalRegistrations();
        boolean boolean19 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean20 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int7 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = registrationRepository0.addRegistration("", "");
        boolean boolean20 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str9 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        int int11 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid Student ID!" + "'", str9, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = registrationRepository0.addRegistration("hi!", "hi!");
        int int5 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        boolean boolean14 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = cancelRegistrationService11.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int13 = cancelRegistrationService1.getEventRegistrationCount("");
        int int14 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        int int16 = cancelRegistrationService14.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean19 = cancelRegistrationService14.checkRegistration("hi!", "");
        boolean boolean21 = cancelRegistrationService14.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int13 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean15 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean17 = cancelRegistrationService1.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        boolean boolean13 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        boolean boolean20 = cancelRegistrationService1.isValidEventId("hi!");
        boolean boolean23 = cancelRegistrationService1.checkRegistration("hi!", "hi!");
        boolean boolean26 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean28 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean22 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        int int23 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        int int8 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean11 = registrationRepository0.removeRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        int int24 = cancelRegistrationService23.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str7 = cancelRegistrationService4.cancelRegistration("", "hi!");
        boolean boolean10 = cancelRegistrationService4.checkRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Student ID!" + "'", str7, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        business.CancelRegistrationService cancelRegistrationService23 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int15 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean12 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService1.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int12 = registrationRepository0.getTotalRegistrations();
        boolean boolean15 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("", "");
        boolean boolean13 = registrationRepository0.addRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean18 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass14 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        int int12 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = cancelRegistrationService1.getTotalRegistrations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getTotalRegistrations()\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        java.lang.String str13 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean15 = cancelRegistrationService4.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        int int13 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean16 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        int int16 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean19 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int15 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        boolean boolean23 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid Student ID!" + "'", str20, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int11 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        java.lang.String str13 = cancelRegistrationService8.cancelRegistration("hi!", "");
        int int14 = cancelRegistrationService8.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        int int5 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = registrationRepository0.addRegistration("", "hi!");
        registrationRepository0.displayRegistrations();
        int int18 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str13 = cancelRegistrationService4.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean15 = cancelRegistrationService13.isValidEventId("hi!");
        int int16 = cancelRegistrationService13.getTotalRegistrations();
        int int18 = cancelRegistrationService13.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean17 = cancelRegistrationService14.checkRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "hi!");
        boolean boolean13 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("hi!", "");
        boolean boolean15 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        java.lang.String str18 = cancelRegistrationService8.cancelRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid Student ID!" + "'", str18, "Invalid Student ID!");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService13 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean16 = registrationRepository0.addRegistration("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService17 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        int int13 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean18 = registrationRepository0.removeRegistration("", "");
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.addRegistration("", "hi!");
        int int5 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean8 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        java.lang.Class<?> wildcardClass9 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.addRegistration("Invalid Student ID!", "");
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean13 = registrationRepository0.addRegistration("", "hi!");
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int14 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean14 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean17 = cancelRegistrationService4.checkRegistration("", "");
        boolean boolean19 = cancelRegistrationService4.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        int int2 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean14 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        registrationRepository0.displayRegistrations();
        int int17 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        java.lang.String str13 = cancelRegistrationService8.cancelRegistration("hi!", "");
        boolean boolean15 = cancelRegistrationService8.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService9.getTotalRegistrations();
        int int11 = cancelRegistrationService9.getTotalRegistrations();
        java.lang.String str14 = cancelRegistrationService9.cancelRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        int int10 = cancelRegistrationService1.getEventRegistrationCount("");
        int int12 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str7 = cancelRegistrationService4.cancelRegistration("", "hi!");
        boolean boolean9 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str12 = cancelRegistrationService4.cancelRegistration("hi!", "hi!");
        boolean boolean15 = cancelRegistrationService4.checkRegistration("", "Invalid Student ID!");
        int int16 = cancelRegistrationService4.getTotalRegistrations();
        int int17 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Student ID!" + "'", str7, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        boolean boolean16 = registrationRepository0.removeRegistration("", "");
        int int18 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean12 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "hi!");
        java.lang.Class<?> wildcardClass13 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str4 = cancelRegistrationService1.cancelRegistration("hi!", "");
        boolean boolean6 = cancelRegistrationService1.isValidEventId("");
        java.lang.Class<?> wildcardClass7 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Student ID!" + "'", str4, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int15 = registrationRepository0.getTotalRegistrations();
        boolean boolean18 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean21 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str7 = cancelRegistrationService4.cancelRegistration("", "hi!");
        int int8 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Student ID!" + "'", str7, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean7 = registrationRepository0.addRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "hi!");
        int int10 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str15 = cancelRegistrationService12.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int5 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean7 = cancelRegistrationService1.isValidEventId("hi!");
        java.lang.String str10 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid Student ID!" + "'", str10, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        java.lang.Class<?> wildcardClass9 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        java.lang.Class<?> wildcardClass13 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        int int8 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean14 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean16 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        java.lang.Class<?> wildcardClass21 = cancelRegistrationService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid Student ID!" + "'", str20, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cancelRegistrationService1.getEventRegistrationCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.RegistrationRepository.getEventRegistrationCount(String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        int int12 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        int int13 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str11 = cancelRegistrationService8.cancelRegistration("", "Invalid Student ID!");
        boolean boolean13 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean7 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService8.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        int int11 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int6 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.removeRegistration("", "hi!");
        int int11 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str15 = cancelRegistrationService12.cancelRegistration("Invalid Student ID!", "hi!");
        boolean boolean18 = cancelRegistrationService12.checkRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int14 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        int int16 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean22 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean25 = registrationRepository0.isRegistered("", "");
        boolean boolean28 = registrationRepository0.removeRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("");
        int int10 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        int int12 = cancelRegistrationService4.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean12 = cancelRegistrationService8.checkRegistration("", "hi!");
        java.lang.String str15 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean12 = cancelRegistrationService10.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        boolean boolean6 = registrationRepository0.isRegistered("", "");
        int int8 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean11 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("", "");
        boolean boolean13 = cancelRegistrationService1.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        java.lang.String str11 = cancelRegistrationService1.cancelRegistration("hi!", "");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid Student ID!" + "'", str11, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int18 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        boolean boolean13 = registrationRepository0.addRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        java.lang.Class<?> wildcardClass11 = cancelRegistrationService8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        int int6 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        int int3 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        boolean boolean5 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean7 = cancelRegistrationService1.isValidEventId("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.isValidStudentId("hi!");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService14 = new business.CancelRegistrationService(registrationRepository0);
        int int16 = cancelRegistrationService14.getEventRegistrationCount("Invalid Student ID!");
        boolean boolean18 = cancelRegistrationService14.isValidEventId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        int int13 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean15 = cancelRegistrationService1.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int19 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService22 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean25 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        business.CancelRegistrationService cancelRegistrationService16 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.Class<?> wildcardClass17 = cancelRegistrationService16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean14 = registrationRepository0.addRegistration("hi!", "");
        int int16 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str13 = cancelRegistrationService1.cancelRegistration("hi!", "hi!");
        java.lang.String str16 = cancelRegistrationService1.cancelRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Invalid Student ID!" + "'", str16, "Invalid Student ID!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean6 = cancelRegistrationService1.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean9 = cancelRegistrationService1.checkRegistration("", "Invalid Student ID!");
        java.lang.String str12 = cancelRegistrationService1.cancelRegistration("", "");
        int int13 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean16 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        int int18 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid Student ID!" + "'", str12, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int8 = cancelRegistrationService1.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "");
        java.lang.String str14 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        java.lang.String str17 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        int int18 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid Student ID!" + "'", str14, "Invalid Student ID!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid Student ID!" + "'", str17, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = registrationRepository0.getEventRegistrationCount("hi!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        int int8 = cancelRegistrationService4.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int2 = registrationRepository0.getTotalRegistrations();
        boolean boolean5 = registrationRepository0.addRegistration("", "");
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService15 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService9 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int12 = registrationRepository0.getEventRegistrationCount("");
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getTotalRegistrations();
        java.lang.Class<?> wildcardClass17 = registrationRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.isRegistered("", "");
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        boolean boolean18 = registrationRepository0.removeRegistration("", "");
        int int19 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int17 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("", "Invalid Student ID!");
        boolean boolean11 = cancelRegistrationService1.checkRegistration("", "hi!");
        int int12 = cancelRegistrationService1.getTotalRegistrations();
        int int14 = cancelRegistrationService1.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int5 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int6 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService7 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        int int14 = registrationRepository0.getTotalRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean19 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService20 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str23 = cancelRegistrationService20.cancelRegistration("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Invalid Student ID!" + "'", str23, "Invalid Student ID!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        int int3 = registrationRepository0.getEventRegistrationCount("");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean4 = registrationRepository0.addRegistration("hi!", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService6 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean9 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean12 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean15 = registrationRepository0.removeRegistration("", "");
        boolean boolean18 = registrationRepository0.removeRegistration("", "");
        int int19 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        boolean boolean16 = registrationRepository0.removeRegistration("", "");
        boolean boolean19 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService20 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        int int12 = cancelRegistrationService8.getEventRegistrationCount("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean10 = cancelRegistrationService8.isValidStudentId("Invalid Student ID!");
        java.lang.String str13 = cancelRegistrationService8.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int16 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService17 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean19 = cancelRegistrationService17.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        int int3 = cancelRegistrationService1.getEventRegistrationCount("hi!");
        int int4 = cancelRegistrationService1.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.addRegistration("", "");
        int int19 = registrationRepository0.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        boolean boolean7 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int9 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        int int9 = cancelRegistrationService1.getEventRegistrationCount("");
        boolean boolean11 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        int int13 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        registrationRepository0.displayRegistrations();
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        int int7 = cancelRegistrationService1.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("hi!");
        java.lang.String str13 = cancelRegistrationService4.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean16 = cancelRegistrationService4.checkRegistration("hi!", "Invalid Student ID!");
        boolean boolean19 = cancelRegistrationService4.checkRegistration("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        business.CancelRegistrationService cancelRegistrationService2 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean5 = registrationRepository0.isRegistered("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        int int12 = registrationRepository0.getTotalRegistrations();
        boolean boolean15 = registrationRepository0.addRegistration("hi!", "hi!");
        boolean boolean18 = registrationRepository0.removeRegistration("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        int int5 = registrationRepository0.getTotalRegistrations();
        int int6 = registrationRepository0.getTotalRegistrations();
        boolean boolean9 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean12 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int10 = registrationRepository0.getTotalRegistrations();
        boolean boolean13 = registrationRepository0.addRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean17 = registrationRepository0.removeRegistration("", "hi!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("hi!");
        int int5 = cancelRegistrationService1.getEventRegistrationCount("");
        java.lang.String str8 = cancelRegistrationService1.cancelRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean14 = cancelRegistrationService1.isValidEventId("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid Student ID!" + "'", str8, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.addRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        boolean boolean16 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean7 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        business.CancelRegistrationService cancelRegistrationService5 = new business.CancelRegistrationService(registrationRepository0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int15 = registrationRepository0.getTotalRegistrations();
        boolean boolean18 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        int int6 = registrationRepository0.getEventRegistrationCount("");
        boolean boolean9 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService10 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str13 = cancelRegistrationService10.cancelRegistration("Invalid Student ID!", "");
        boolean boolean15 = cancelRegistrationService10.isValidEventId("Invalid Student ID!");
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Student ID!" + "'", str13, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.isRegistered("", "hi!");
        int int8 = registrationRepository0.getTotalRegistrations();
        boolean boolean11 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        boolean boolean14 = registrationRepository0.isRegistered("Invalid Student ID!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.removeRegistration("", "");
        boolean boolean10 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.isRegistered("", "Invalid Student ID!");
        int int15 = registrationRepository0.getEventRegistrationCount("Invalid Student ID!");
        int int17 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        boolean boolean13 = registrationRepository0.removeRegistration("hi!", "hi!");
        boolean boolean16 = registrationRepository0.removeRegistration("", "");
        registrationRepository0.displayRegistrations();
        int int19 = registrationRepository0.getEventRegistrationCount("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        data.RegistrationRepository registrationRepository0 = null;
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("");
        java.lang.String str6 = cancelRegistrationService1.cancelRegistration("", "hi!");
        boolean boolean8 = cancelRegistrationService1.isValidStudentId("hi!");
        boolean boolean10 = cancelRegistrationService1.isValidEventId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid Student ID!" + "'", str6, "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.removeRegistration("hi!", "Invalid Student ID!");
        int int11 = registrationRepository0.getTotalRegistrations();
        boolean boolean14 = registrationRepository0.isRegistered("", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean18 = registrationRepository0.removeRegistration("Invalid Student ID!", "Invalid Student ID!");
        boolean boolean21 = registrationRepository0.removeRegistration("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int9 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean11 = cancelRegistrationService8.isValidEventId("hi!");
        boolean boolean14 = cancelRegistrationService8.checkRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        business.CancelRegistrationService cancelRegistrationService12 = new business.CancelRegistrationService(registrationRepository0);
        java.lang.String str15 = cancelRegistrationService12.cancelRegistration("hi!", "Invalid Student ID!");
        java.lang.Class<?> wildcardClass16 = cancelRegistrationService12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid Student ID!" + "'", str15, "Invalid Student ID!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        boolean boolean28 = cancelRegistrationService24.checkRegistration("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        int int4 = registrationRepository0.getTotalRegistrations();
        boolean boolean7 = registrationRepository0.isRegistered("hi!", "hi!");
        int int9 = registrationRepository0.getEventRegistrationCount("");
        int int11 = registrationRepository0.getEventRegistrationCount("");
        int int12 = registrationRepository0.getTotalRegistrations();
        int int14 = registrationRepository0.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = cancelRegistrationService11.isValidEventId("Invalid Student ID!");
        boolean boolean19 = cancelRegistrationService11.checkRegistration("", "Invalid Student ID!");
        boolean boolean21 = cancelRegistrationService11.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("hi!");
        boolean boolean13 = cancelRegistrationService8.checkRegistration("", "");
        int int14 = cancelRegistrationService8.getTotalRegistrations();
        boolean boolean16 = cancelRegistrationService8.isValidEventId("Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        boolean boolean10 = registrationRepository0.addRegistration("hi!", "Invalid Student ID!");
        business.CancelRegistrationService cancelRegistrationService11 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean14 = cancelRegistrationService11.checkRegistration("Invalid Student ID!", "hi!");
        boolean boolean16 = cancelRegistrationService11.isValidEventId("Invalid Student ID!");
        int int18 = cancelRegistrationService11.getEventRegistrationCount("");
        boolean boolean20 = cancelRegistrationService11.isValidEventId("hi!");
        boolean boolean22 = cancelRegistrationService11.isValidStudentId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("", "");
        boolean boolean17 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean19 = cancelRegistrationService1.isValidStudentId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("Invalid Student ID!", "");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        registrationRepository0.displayRegistrations();
        boolean boolean10 = registrationRepository0.isRegistered("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.isRegistered("hi!", "Invalid Student ID!");
        boolean boolean6 = registrationRepository0.removeRegistration("Invalid Student ID!", "");
        int int7 = registrationRepository0.getTotalRegistrations();
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        int int10 = cancelRegistrationService8.getEventRegistrationCount("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        boolean boolean3 = registrationRepository0.removeRegistration("Invalid Student ID!", "hi!");
        business.CancelRegistrationService cancelRegistrationService4 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean6 = cancelRegistrationService4.isValidEventId("hi!");
        boolean boolean8 = cancelRegistrationService4.isValidStudentId("Invalid Student ID!");
        boolean boolean10 = cancelRegistrationService4.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService4.isValidEventId("Invalid Student ID!");
        int int13 = cancelRegistrationService4.getTotalRegistrations();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        registrationRepository0.displayRegistrations();
        boolean boolean4 = registrationRepository0.removeRegistration("hi!", "");
        boolean boolean7 = registrationRepository0.addRegistration("", "");
        business.CancelRegistrationService cancelRegistrationService8 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean11 = registrationRepository0.addRegistration("", "Invalid Student ID!");
        registrationRepository0.displayRegistrations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        data.RegistrationRepository registrationRepository0 = new data.RegistrationRepository();
        business.CancelRegistrationService cancelRegistrationService1 = new business.CancelRegistrationService(registrationRepository0);
        boolean boolean3 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean5 = cancelRegistrationService1.isValidEventId("Invalid Student ID!");
        boolean boolean8 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "");
        boolean boolean10 = cancelRegistrationService1.isValidStudentId("");
        boolean boolean12 = cancelRegistrationService1.isValidStudentId("Invalid Student ID!");
        boolean boolean15 = cancelRegistrationService1.checkRegistration("Invalid Student ID!", "Invalid Student ID!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

