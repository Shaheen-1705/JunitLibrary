package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class doStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks dt = new DailyTasks();
        String result = dt.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}
