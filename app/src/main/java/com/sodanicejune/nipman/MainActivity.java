package com.sodanicejune.nipman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dictionary = (Button) findViewById(R.id.button_dictionary);
        Button game = (Button) findViewById(R.id.button_games);
        dictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDictionary();
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGame();
            }
        });
    }

    public void goToDictionary(){
        Intent intent = new Intent(this, DictionaryActivity.class);
        this.startActivity ( intent );
    }
    public void goToGame(){
        Intent intent = new Intent(this, GameActivity.class);
        this.startActivity ( intent );
    }
}
