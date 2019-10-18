package com.example.adroidhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    boolean unitswitch=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            final EditText Temp=(EditText)findViewById(R.id.Temperature);
        final TextView unit =(TextView)findViewById(R.id.unit);
        final Button trans=(Button)findViewById(R.id.Transform);

        trans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    if (!("".equals(Temp.getText().toString())) && unitswitch==true) {
                        Double fT = Double.parseDouble(Temp.getEditableText().toString());

                        Double Fahrenheit = 1.8 * fT + 32;
                        BigDecimal Back=new BigDecimal(Fahrenheit);
                        unit.setText(" °F");
                        Temp.setText(""+Fahrenheit);

                       unitswitch=false;
                    }
                    else if (!("".equals(Temp.getText().toString())) && unitswitch==false) {


                        Double fT = Double.parseDouble(Temp.getEditableText().toString());



                        Double Fahrenheit = (fT-32)*1.8;
                        BigDecimal Back=new BigDecimal(Fahrenheit);
                        Temp.setText(""+Fahrenheit);
                        unit.setText(" °C");
                        unitswitch=true;

                    }

                }

            });

    }
}
