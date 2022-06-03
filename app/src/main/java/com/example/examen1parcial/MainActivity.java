package com.example.examen1parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextMarca;
    EditText editTextAno;
    EditText editTextModelo;
    EditText editTextProcesador;
    EditText editTextPrecio;
    Button buttonSave;
    Button buttonShowRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMarca = findViewById(R.id.EditTextMarca);
        editTextAno = findViewById(R.id.EditTextAno);
        editTextModelo = findViewById(R.id.EditTextModelo);
        editTextProcesador = findViewById(R.id.EdiTextProcesador);
        editTextPrecio = findViewById(R.id.EdiTextPrecio);
        buttonSave = findViewById(R.id.ButtonSave);
        buttonShowRecyclerView = findViewById(R.id.ButtonShowRecyclerView);

        buttonSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Lapto lapto = new Lapto(
                        editTextMarca.getText().toString(),
                        editTextAno.getText().toString(),
                        editTextModelo.getText().toString(),
                        editTextProcesador.getText().toString(),
                        editTextPrecio.getText().toString()
                );
                lapto.save();
                Log.e("SQLite", "DATOS GUARDADOS");
            }
        });

        buttonShowRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}