package com.witmergers.elegantweather;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestClient.get().getWeather("Bangalore", new Callback<WeatherResponse>()

        {
            @Override
            public void success(WeatherResponse weatherResponse, Response response) {
                // success!
                // Toast.makeText(getAc,"Description"+weatherResponse.getWeather().getDescription(),Toast.LENGTH_SHORT).show();



                String s = "Cord : "+weatherResponse.getCod()+" "+" ID "+weatherResponse.getBase();
                s+="Dec : "+weatherResponse.getWeather().get(0).getDescription()+" Temp "+weatherResponse.getMain().getTemp();
                TextView textView = (TextView)findViewById(R.id.t1);
                textView.setText(s);









               Log.i("App",
                       weatherResponse.getCod()+"   dec    "+weatherResponse.getWeather().get(0).getDescription());
                              //
                // you get the point...
            }


            @Override
            public void failure(RetrofitError error) {
                // something went wrong
            }
        });
    }












    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
