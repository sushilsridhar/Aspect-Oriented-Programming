package model;

import org.springframework.stereotype.Repository;

@Repository
public class EmergencyRepository {

    public String getTransportService() {
        return "Activated Emergency Protocol";
    }
}
