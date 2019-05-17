package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayAndroid, displayiPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayAndroid = findViewById(R.id.textViewAndroid);
        displayiPad = findViewById(R.id.textViewIpad);

        displayAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2018);
                intent.putExtra("semester", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        displayiPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 2018);
                intent.putExtra("semester", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
    }
}
