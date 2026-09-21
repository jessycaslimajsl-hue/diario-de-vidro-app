package com.diariodevidro.app;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Funcionou!");
        tv.setTextSize(30);
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}
