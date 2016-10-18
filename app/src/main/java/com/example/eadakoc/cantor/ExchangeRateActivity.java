package com.example.eadakoc.cantor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateActivity extends Activity implements View.OnClickListener {
    ListView listView;
    TextView textViewDownloadDate;
    Parser parser = new Parser();
    Cantor cantor;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchangerate);
        listView = (ListView)findViewById(R.id.listView);
        textViewDownloadDate = (TextView)findViewById(R.id.textViewDownloadDate);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    cantor = parser.getCantor();
                    System.out.println(cantor);
                    textViewDownloadDate.setText(cantor.getDate());
//                    weather = parser.getWeatherForLocation(editText.getText()+"");
//                    textViewTemperature.setText(weather.getTemperature());
//                    textViewPreassure.setText(weather.getPressure());
//                    textViewWindSpeed.setText(weather.getWindSpeed());
//                    textViewWindDirection.setText(weather.getWindDirection());
//                    textViewVisibility.setText(weather.getVisibility());
//                    textViewHumidity.setText(weather.getHumidity());
//                    textViewDescription.setText(weather.getDescription());
//                    System.out.println(weather);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        t.start();
        List<String> list = new ArrayList<String>();
        list.add("ITEM1");
        list.add("ITEM2");
        list.add("ITEM3");
        list.add("ITEM4");
        list.add("ITEM5");
        list.add("ITEM6");
        list.add("ITEM7");
        list.add("ITEM8");
        list.add("ITEM9");
        list.add("ITEM10");
        list.add("ITEM11");
        list.add("ITEM12");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    public void onClick(View v) {

    }
}
