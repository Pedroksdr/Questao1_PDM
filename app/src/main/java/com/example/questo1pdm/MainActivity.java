package com.example.questo1pdm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.questo1pdm.R;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbArroz, cbLeite, cbCarne, cbFeijao, cbRefrigerante;
    private Button btnCalcular;
    private TextView tvTotal;

    private final double PRECO_ARROZ = 2.69;
    private final double PRECO_LEITE = 2.70;
    private final double PRECO_CARNE = 16.70;
    private final double PRECO_FEIJAO = 3.38;
    private final double PRECO_REFRIGERANTE = 3.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbArroz = findViewById(R.id.cbArroz);
        cbLeite = findViewById(R.id.cbLeite);
        cbCarne = findViewById(R.id.cbCarne);
        cbFeijao = findViewById(R.id.cbFeijao);
        cbRefrigerante = findViewById(R.id.cbRefrigerante);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvTotal = findViewById(R.id.tvTotal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        double total = 0.0;

        if (cbArroz.isChecked()) {
            total += PRECO_ARROZ;
        }

        if (cbLeite.isChecked()) {
            total += PRECO_LEITE;
        }

        if (cbCarne.isChecked()) {
            total += PRECO_CARNE;
        }

        if (cbFeijao.isChecked()) {
            total += PRECO_FEIJAO;
        }

        if (cbRefrigerante.isChecked()) {
            total += PRECO_REFRIGERANTE;
        }

        tvTotal.setText(String.format("Valor Total: R$ %.2f", total));
    }
}