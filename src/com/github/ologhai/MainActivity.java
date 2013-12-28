package com.github.ologhai;

import com.github.ologhai.OlogHaiView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout layout = new FrameLayout(this);
        olog_hai_view_ = new OlogHaiView(this);
        layout.addView(olog_hai_view_);
        setContentView(layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private OlogHaiView olog_hai_view_;
}
