package com.sodanicejune.nipman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DictionaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        ArrayList<Word> arrayOfWords = new ArrayList<Word>();
        WordAdapter adapter = new WordAdapter(this, arrayOfWords);
        ListView listView = (ListView) findViewById(R.id.listWord);
        listView.setAdapter(adapter);
    }
}
