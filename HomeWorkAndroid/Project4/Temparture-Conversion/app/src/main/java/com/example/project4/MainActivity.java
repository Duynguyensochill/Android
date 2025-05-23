package com.example.project4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtdoC, edtdoF;
    Button btncf, btnfc, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtdoC = findViewById(R.id.edtdoC);
        edtdoF = findViewById(R.id.edtdoF);
        btncf = findViewById(R.id.btncf);
        btnfc = findViewById(R.id.btnfc);
        btnClear = findViewById(R.id.btnClear);

        DecimalFormat dcf = new DecimalFormat("#.00");

        // Nút chuyển Celsius → Fahrenheit
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String doC = edtdoC.getText().toString();
                    double C = Double.parseDouble(doC);
                    double F = C * 1.8 + 32;
                    edtdoF.setText(dcf.format(F));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Nhập sai định dạng!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Nút chuyển Fahrenheit → Celsius
        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String doF = edtdoF.getText().toString();
                    double F = Double.parseDouble(doF);
                    double C = (F - 32) / 1.8;
                    edtdoC.setText(dcf.format(C));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Nhập sai định dạng!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Nút Clear (xóa cả 2 ô nhập)
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtdoC.setText("");
                edtdoF.setText("");
            }
        });
    }
}
