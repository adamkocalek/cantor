package com.example.eadakoc.cantor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.R.attr.description;

public class Parser {
    private NetManager netManager = new NetManager();
//
//    public JSONObject getCantorJSONObject() throws JSONException {
//        JSONObject cantorObj = netManager.getJSONFromURL(StaticValues.URL);
//        return cantorObj;
//    }
    public Cantor getCantor() throws JSONException {
        JSONObject cantorObj = netManager.getJSONFromURL(StaticValues.URL);
        Cantor cantor = new Cantor();
        System.out.println(cantorObj);
        JSONObject table = cantorObj.getJSONObject("table");
        JSONObject date = table.getJSONObject("date");
        JSONObject currency = table.getJSONObject("description");
        JSONObject code = table.getJSONObject("code");
        JSONObject mid = table.getJSONObject("mid");
        setCantor(cantor, currency, code, mid, date);
        return cantor;
    }
    private void setCantor(Cantor cantor, JSONObject description, JSONObject code, JSONObject mid, JSONObject data) throws JSONException {
        cantor.setDescription(description.getString("description"));
        cantor.setCode(code.getString("code"));
        cantor.setMid(mid.getString("mid"));
        cantor.setDate(data.getString("date"));
    }










//    private JSONObject getWeatherJSONObject(String city) throws JSONException {
//        JSONObject weatherObj = netManager.getJSONFromURL(StaticValues.WEATHER_URL_PART_ONE + city + StaticValues.WEATHER_URL_PART_TWO);
//        return weatherObj;
//    }
//    public Weather getWeatherForLocation(String city) throws JSONException {
//        JSONObject weatherObj = getWeatherJSONObject(city);
//        Weather weather = new Weather();
//        JSONObject query = weatherObj.getJSONObject("query");
//        JSONObject results = query.getJSONObject("results");
//        JSONObject channel = results.getJSONObject("channel");
//        JSONObject atmosphere = channel.getJSONObject("atmosphere");
//        JSONObject wind = channel.getJSONObject("wind");
//        JSONObject item = channel.getJSONObject("item");
//        JSONObject condition = item.getJSONObject("condition");
//        JSONObject locationFromJSON = channel.getJSONObject("location");
//        setWeather(weather, atmosphere, wind, condition, locationFromJSON);
//        return weather;
//    }
//    private void setWeather(Weather weather, JSONObject atmosphere, JSONObject wind, JSONObject condition,
//                            JSONObject location) throws JSONException {
//        weather.setHumidity(atmosphere.getString("humidity"));
//        weather.setPressure(atmosphere.getString("pressure"));
//        weather.setVisibility(atmosphere.getString("visibility"));
//        weather.setWindDirection(wind.getString("direction"));
//        weather.setWindSpeed(wind.getString("speed"));
//        weather.setTemperature(condition.getString("temp"));
//        weather.setDescription(condition.getString("text"));
//        weather.setCity(location.getString("city"));
//        weather.setCountry(location.getString("country"));
//    }

}
