        } catch (IllegalArgumentException e) {
            assertEquals("Category cannot be empty", e.getMessage());
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        LocalDate date2 = LocalDate.of(2026, 11, 20);
        List<data.Event> list3 = service1.searchByDate(date2);
        assertNotNull(list3);
        assertEquals(2, list3.size());
        assertEquals(3, list3.get(0).getId());
        assertEquals(4, list3.get(1).getId());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        LocalDate date2 = LocalDate.of(2026, 11, 5);
        List<data.Event> list3 = service1.searchByDate(date2);
        assertEquals(1, list3.size());
        assertEquals(1, list3.get(0).getId());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        LocalDate date2 = LocalDate.of(2026, 12, 10);
        List<data.Event> list3 = service1.searchByDate(date2);
        assertEquals(1, list3.size());
        assertEquals(6, list3.get(0).getId());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        LocalDate date2 = LocalDate.of(2099, 1, 1);
        List<data.Event> list3 = service1.searchByDate(date2);
        assertNotNull(list3);
        assertTrue(list3.isEmpty());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        try {
            service1.searchByDate((LocalDate) null);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Date cannot be empty", e.getMessage());
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        data.Event customEvent2 = new data.Event(99, "Hackathon 2026", "Technology",
                LocalDate.of(2026, 11, 20), "Lab 4", "Code competition", 25);
        repo0.addEvent(customEvent2);
        List<data.Event> list3 = service1.searchByKeyword("Hackathon");
        assertEquals(1, list3.size());
        assertEquals(99, list3.get(0).getId());
        List<data.Event> list4 = service1.searchByCategory("Technology");
        assertEquals(3, list4.size());
        List<data.Event> list5 = service1.searchByDate(LocalDate.of(2026, 11, 20));
        assertEquals(3, list5.size());
    }

    // ==========================================
    // Presentation Layer Tests: presentation.Main & SearchEventUI
    // ==========================================

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        presentation.Main main0 = new presentation.Main();
        assertNotNull(main0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        data.SearchEventRepo repo0 = new data.SearchEventRepo();
        business.SearchEventService service1 = new business.SearchEventService(repo0);
        Scanner scanner2 = new Scanner("");
        presentation.SearchEventUI ui3 = new presentation.SearchEventUI(service1, scanner2);
        assertNotNull(ui3);
    }
}

