package android.example.textrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView txtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtt=findViewById(R.id.textView);
        Intent i = getIntent();
        sendhere(i.getStringExtra(MainActivity.EXTRA_TEXT));
    }
    public void sendhere(String s)
    {
        txtt.setText(s);
    }
}
