package kr.hs.emirim.cheese0414.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        flip.setFlipInterval(1000);
        Button butStart=(Button)findViewById(R.id.but_start);
        Button butStop=(Button)findViewById(R.id.but_stop);
        butStart.setOnClickListener(this);
        butStop.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_start:
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
