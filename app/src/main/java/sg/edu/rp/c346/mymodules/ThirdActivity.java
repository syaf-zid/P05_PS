package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView displayCode, displayName, displayYear, displaySem, displayCredit, displayVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        displayCode = findViewById(R.id.textViewCode);
        displayName = findViewById(R.id.textViewName);
        displayYear = findViewById(R.id.textViewYear);
        displaySem = findViewById(R.id.textViewSem);
        displayCredit = findViewById(R.id.textViewCredit);
        displayVenue = findViewById(R.id.textViewVenue);

        Intent codeReceived = getIntent();
        String code = codeReceived.getStringExtra("code");
        displayCode.setText("Module Code: " + code);

        Intent nameReceived = getIntent();
        String name = nameReceived.getStringExtra("name");
        displayName.setText("Module Name: " + name);

        Intent yearReceived = getIntent();
        int year = yearReceived.getIntExtra("year", 2018);
        displayYear.setText("Academic Year: " + year);

        Intent semReceived = getIntent();
        int semester = semReceived.getIntExtra("semester", 1);
        displaySem.setText("Semester: " + semester);

        Intent creditReceived = getIntent();
        int credit = creditReceived.getIntExtra("credit", 4);
        displayCredit.setText("Module Credit: " + credit);

        Intent venueReceived = getIntent();
        String venue = venueReceived.getStringExtra("venue");
        displayVenue.setText("Venue: " + venue);
    }
}
