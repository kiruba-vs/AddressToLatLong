package Address.to.Geo.Code.Converter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class JsonData {
    private List<Result> results;

    public List<Result> getResults() {
        return results;
    }
}
