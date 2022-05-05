package sg.edu.rp.c346.id20028056.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //declare
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bridge
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        tbtn=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                if(tbtn.isChecked()) {
                    String data = etInput.getText().toString();
                    int selectedId=rgGender.getCheckedRadioButtonId();
                    if(selectedId==R.id.rbMale)
                    {
                        tvDisplay.setText("He says "+data);
                    }
                    else
                    {
                        tvDisplay.setText("She says "+data);
                    }

                }
            }
        });
/*
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(tbtn.isChecked()) {
                    etInput.setEnabled(true);
                    tvDisplay.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                    tvDisplay.setEnabled(false);
                }
            }
        });

 */


    }
}