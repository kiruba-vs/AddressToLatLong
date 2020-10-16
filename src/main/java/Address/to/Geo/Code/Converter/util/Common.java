package Address.to.Geo.Code.Converter.util;

import java.util.List;
import java.util.Map;

import Address.to.Geo.Code.Converter.model.JsonData;
import Address.to.Geo.Code.Converter.model.LatLng;
import com.google.gson.*;

public class Common {

    public static String getLatLongfromRespone(String str){

        Gson gson = new GsonBuilder().create();
        JsonData jsonData = gson.fromJson(str, JsonData.class);
        LatLng  latLng = jsonData.getResults().get(0).getLocations().get(0).getLatLng();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(latLng.getLat());
        stringBuilder.append(",");
        stringBuilder.append(latLng.getLng());

        return stringBuilder.toString();
    }

}
