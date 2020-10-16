package Address.to.Geo.Code.Converter.model;

import lombok.Data;

@Data
public class LatLng {
    private String lat;
    private String lng;

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
