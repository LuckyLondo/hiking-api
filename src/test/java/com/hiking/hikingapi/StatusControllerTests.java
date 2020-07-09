package com.hiking.hikingapi;

import com.hiking.hikingapi.controllers.StatusController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StatusControllerTests {

    @Mock
    private StatusController controller;
    private String statusResult;

    @Before
    public void setup() {
        statusResult = "{\"status\": \"Ok\"}";
    }

    @Test
    public void testStatus() {
        when(controller.status()).thenReturn(statusResult);
        assertEquals(controller.status(), statusResult);
    }

    @Test
    public void testError() throws Exception {
        when(controller.error()).thenReturn(statusResult);
        assertEquals(controller.error(), statusResult);
    }



}
