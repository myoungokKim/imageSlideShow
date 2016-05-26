package kr.hs.emirim.cheese0414.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flip;
    int time;
    EditText editTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTime=(EditText)findViewById(R.id.edit_time);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        editTime.setOnClickListener(this);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop=(Button)findViewById(R.id.but_stop);
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
                time=(int)(Double.parseDouble(editTime.getText().toString())*1000);
                flip.setFlipInterval(time);
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
