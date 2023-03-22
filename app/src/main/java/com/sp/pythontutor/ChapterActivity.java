package com.sp.pythontutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChapterActivity extends AppCompatActivity {
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        tvData = findViewById(R.id.tvData);

        Intent a = getIntent();
        int p = a.getIntExtra("p",0);
        p++;

        String fn = "c" + p + ".txt";
        String line = "";
        StringBuffer sb = new StringBuffer();

        try {
            InputStreamReader isr = new InputStreamReader(getAssets().open(fn));
            BufferedReader br = new BufferedReader(isr);

            while ((line = br.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            br.close();
            tvData.setText(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
