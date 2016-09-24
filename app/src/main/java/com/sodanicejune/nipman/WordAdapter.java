package com.sodanicejune.nipman;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by sodajune on 9/24/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> word ) {
        super(context,0, word);
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        return view;
    }

}
