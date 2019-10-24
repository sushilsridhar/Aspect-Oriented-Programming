package service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {com.aspect.oriented.program.ProgramApplication.class})
public class EmergencyServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmergencyService emergencyService;

    @Test
    public void testAnnotation() {
        logger.info(emergencyService.getTransportService());
    }
}
