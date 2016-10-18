package com.example.eadakoc.cantor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class NetManager {

    public String getStringFromURL(String url) throws IOException {
        URLConnection connection = (new URL(url)).openConnection();
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.connect();
        InputStream in = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder html = new StringBuilder();
        for (String line; (line = reader.readLine()) != null; ) {
            html.append(line);
        }
        in.close();

        return html.toString();
    }

    public JSONObject getJSONFromURL(String url) throws JSONException {
        String content = null;
        try {
            content = getStringFromURL(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject(content);
    }
}