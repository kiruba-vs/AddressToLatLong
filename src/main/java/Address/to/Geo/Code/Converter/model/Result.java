package Address.to.Geo.Code.Converter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class Result {
    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }
}
