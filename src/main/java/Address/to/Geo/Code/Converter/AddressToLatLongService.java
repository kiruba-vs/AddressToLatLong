package Address.to.Geo.Code.Converter;

import Address.to.Geo.Code.Converter.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static Address.to.Geo.Code.Converter.util.Common.getLatLongfromRespone;

@Service
public class AddressToLatLongService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Properties properties;

    public String getLatLong(String address){

        StringBuilder url = new StringBuilder(properties.getApiURL());
        url.append(address);

        String response = restTemplate.getForObject(url.toString(), String.class);


        return getLatLongfromRespone(response);
    }
}
