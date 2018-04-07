package com.example.soumit.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        serializeUserSimple();
        deserializeUserSimple();
    }

    private void serializeUserSimple(){
        Log.d(TAG, "serializeUserSimple: initiated...");

        List<Restaurant.RestaurantMenuItem> menuItems = new ArrayList<>();
        menuItems.add(new Restaurant.RestaurantMenuItem("steak", 20f));
        menuItems.add(new Restaurant.RestaurantMenuItem("chops", 30f));
        menuItems.add(new Restaurant.RestaurantMenuItem("French Fries", 50f));

        Restaurant restaurant = new Restaurant("Future studio steakhouse", menuItems);

        String  json = new  Gson().toJson(restaurant);
    }

    public  void deserializeUserSimple(){
        Log.d(TAG, "deserializeUserSimple: initiated...");

        String generalInfoJson =
                "{'name': 'Future Studio Dev Team'," +
                " 'website': 'https://futurestud.io'," +
                " 'founders': [{'name': 'Christian', 'flowerCount': 1 }," +
                                    " {'name': 'Marcus','flowerCount': 3 }, " +
                                    "{'name': 'Norman','flowerCount': 2 }]}";

        GeneralInfo generalInfo = new Gson().fromJson(generalInfoJson, GeneralInfo.class);
    }

}

























