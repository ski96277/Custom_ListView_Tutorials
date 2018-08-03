package com.example.imransk.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    int[] images={R.drawable.untitled,R.drawable.america,R.drawable.india,R.drawable.pakistan};
    String[] name={"Bangladesh","America","India","Pakistan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view_ID);


        CustomAdapter customAdapter=new CustomAdapter(this,name,images);
        listView.setAdapter(customAdapter);


    }
}
