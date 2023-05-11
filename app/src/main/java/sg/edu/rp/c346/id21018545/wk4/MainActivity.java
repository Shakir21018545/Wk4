package sg.edu.rp.c346.id21018545.wk4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        Reset = findViewById(R.id.buttonReset);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setIs24HourView(true);
                String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                tvDisplay.setText(time);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = "Date is " + dp.getMonth()+1 +"-" + dp.getDayOfMonth()+ "-" + dp.getYear();
                tvDisplay.setText(date);

            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setHour(0);
                tp.setMinute(0);
                dp.updateDate(2020, 0, 1);
            }
        });
    }
}

