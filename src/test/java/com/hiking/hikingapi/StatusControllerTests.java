package com.hiking.hikingapi;

import com.hiking.hikingapi.controllers.StatusController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StatusControllerTests {

    private StatusController controller;
    private String statusResult;

    @Before
    public void setup() {
        controller = new StatusController();
        statusResult = "{\"status\": \"Ok\"}";
    }

    @Test
    public void testStatus() {
        assertEquals(controller.status(), statusResult);
    }

    @Test
    public void testError() {
        Exception ex = assertThrows(Exception.class, () -> { controller.error(); });
        assertEquals(ex.getMessage(), "SHIT");
    }

}
