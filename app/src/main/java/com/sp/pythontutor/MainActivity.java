package com.sp.pythontutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvChapter = findViewById(R.id.lvChapter);
        String chap[] = { "C1 Introduction","C2 Fundamentals","C3 Input Output"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,chap);
        lvChapter.setAdapter(arrayAdapter);

        lvChapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(MainActivity.this,ChapterActivity.class);
                a.putExtra("p",position);
                startActivity(a);
            }
        });
    }


}
