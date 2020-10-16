package Address.to.Geo.Code.Converter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Location {
    private LatLng latLng;

    public LatLng getLatLng() {
        return latLng;
    }
}
