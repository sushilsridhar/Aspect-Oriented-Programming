package service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {com.aspect.oriented.program.ProgramApplication.class})
public class UserServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void testAOP() {
        logger.info(userService.getUserDetails());
    }
}
