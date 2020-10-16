package Address.to.Geo.Code.Converter.util;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Properties {
     private String apiURL = "http://open.mapquestapi.com/geocoding/v1/address?key=OBFPHeCOz72EtsbvuEjRABBqe0GLSpDi&location=";
     private String address = "233%20S%20Wacker%20Dr,%20Chicago,%20IL%2060606";

    public String getApiURL() {
        return apiURL;
    }

    public String getAddress() {
        return address;
    }
}
