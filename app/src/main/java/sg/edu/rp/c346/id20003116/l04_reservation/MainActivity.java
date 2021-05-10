package sg.edu.rp.c346.id20003116.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    EditText editName;
    TextView tvMobile;
    EditText editMobile;
    TextView tvSize;
    EditText editSize;
    CheckBox cbSmoking;
    DatePicker dp;
    TimePicker tp;
    Button confirmBtn;
    Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName.findViewById(R.id.name);
        editName.findViewById(R.id.editName);
        tvMobile.findViewById(R.id.mobileNumber);
        editMobile.findViewById(R.id.editMobileNumber);
        tvSize.findViewById(R.id.size);
        editSize.findViewById(R.id.editSize);
        cbSmoking.findViewById(R.id.checkBox);
        dp.findViewById(R.id.datePicker);
        tp.findViewById(R.id.timePicker);
        confirmBtn.findViewById(R.id.confirmBtn);
        resetBtn.findViewById(R.id.resetBtn);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editNameLength = editName.getText().toString();
                String editMobileLength = editMobile.getText().toString();
                String editSizeLength = editSize.getText().toString();
                int nameLength = Integer.parseInt(editNameLength);
                int mobileLength = Integer.parseInt(editMobileLength);
                int sizeLength = Integer.parseInt(editSizeLength);
                if (nameLength == 0 || mobileLength == 0 || sizeLength == 0) {
                    Toast.makeText(MainActivity.this, "Error: Please do not leave any blanks", Toast.LENGTH_LONG).show();
                }
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.setText("");
                editMobile.setText("");
                editSize.setText("");
                cbSmoking.setChecked(false);
                dp.updateDate(2020, 06, 01);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
            }
        });
    }
};