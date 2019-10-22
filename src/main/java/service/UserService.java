package service;

import model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    public String getUserDetails() {
        String userDetails =  userRepository.getUserDetails();
        logger.info("In Business - {}", userDetails);

        return userDetails;
    }
}
