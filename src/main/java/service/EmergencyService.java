package service;

import annotation.LogExecutionTime;
import model.EmergencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmergencyRepository emergencyRepository;

    @LogExecutionTime
    public String getTransportService() {
        String response = emergencyRepository.getTransportService();

        logger.info("In Business - {}", response);

        return response;
    }

}
