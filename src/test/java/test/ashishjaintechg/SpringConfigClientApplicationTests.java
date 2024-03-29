package test.ashishjaintechg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(
		  webEnvironment = WebEnvironment.RANDOM_PORT, 
		  properties = {"spring.cloud.config.enabled=false"}
		)class SpringConfigClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
