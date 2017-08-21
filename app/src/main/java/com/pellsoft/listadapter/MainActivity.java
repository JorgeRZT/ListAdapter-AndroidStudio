package com.pellsoft.listadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    List<ElementListed> elements = new ArrayList<>();
    PersonalizedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asign the ListView Element
        list = (ListView) findViewById(R.id.listView);

        //Create the objects
        for(int i = 0 ; i < 10 ; i++){
            elements.add(new ElementListed("Element "+i,"Description "+i));
        }

        //Create the Adapter
        adapter = new PersonalizedAdapter(getApplicationContext(), elements);

        //Asign the Adapter
        list.setAdapter(adapter);

    }
}
