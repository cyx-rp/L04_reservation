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

    String name;
    String phoneNo;
    String pax;
    String smoke;
    int day;
    int month;
    int year;
    int hour;
    int min;

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

                name = etName.getText().toString();
                phoneNo = etPhoneNo.getText().toString();
                pax = etPax.getText().toString();
                day = dateSelect.getDayOfMonth();
                month = dateSelect.getMonth();
                year = dateSelect.getYear();
                hour = timeSelect.getCurrentHour();
                min = timeSelect.getCurrentMinute();

                if (rgSmoke.getCheckedRadioButtonId() == R.id.radioButtonSmoke) {
                    smoke = "Smoking";
                }
                else {
                    smoke = "Non-smoking";
                }

                Toast.makeText(MainActivity.this, String.format("Name: %s\nPhone no.: %s\nPax: %s\nSitting Area: %s\nBooking on %d/%d/%d at %d:%d confirmed!", name, phoneNo, pax, smoke, day, (month+1), year, hour, min), Toast.LENGTH_SHORT).show();

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