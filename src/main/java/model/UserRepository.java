package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String getUserDetails() {

        logger.info("In Repository");

        return "User information";
    }
}
