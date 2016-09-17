package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
	DemoApplication demoApplication;

	@Test
	public void shouldReturn5WhenCalledWith2And3() {
	    int actual = demoApplication.add(2,3);
		assertEquals(5, actual);
	}

}
