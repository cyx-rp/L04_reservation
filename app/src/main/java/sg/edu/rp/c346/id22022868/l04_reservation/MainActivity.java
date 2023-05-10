package sg.edu.rp.c346.id22022868.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etPhoneNo;
    EditText etPax;
    DatePicker dateSelect;
    TimePicker timeSelect;
    RadioGroup rgSmoke;
    Button btnConfirm;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etPhoneNo = findViewById(R.id.editTextPhone);
        etPax = findViewById(R.id.editTextNumberGrpSize);
        dateSelect = findViewById(R.id.datePicker);
            //Setting default date
            dateSelect.init(2020, 6, 1, null);
        timeSelect = findViewById(R.id.timePicker);
            //Setting default time
            timeSelect.setCurrentHour(7);
            timeSelect.setCurrentMinute(30);
        rgSmoke = findViewById(R.id.radioGroupSmoke);
        btnConfirm = findViewById(R.id.buttonConfirm);
        btnReset = findViewById(R.id.buttonReset);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this, "Booking confirmed!", Toast.LENGTH_SHORT);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etName.setText("");
                etPhoneNo.setText("");
                etPax.setText("");
                timeSelect.setCurrentHour(7);
                timeSelect.setCurrentMinute(30);
                dateSelect.init(2020, 6, 1, null);
                rgSmoke.clearCheck();

            }
        });




















    }
}