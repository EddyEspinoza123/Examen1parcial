package com.example.examen1parcial;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

//import com.example.examen1parcial.adapters.LaptoAdapter;

import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerViewLapto;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerViewLapto = findViewById(R.id.RecyclerViewLapto);

        //Lista de datos
        List<Lapto> laptoList = Lapto.listAll(Lapto.class);
        laptoList.forEach((item) -> Log.e("Laptos", item.getMarca()));
        //LAYAOUT
        recyclerViewLapto.setLayoutManager(
                new LinearLayoutManager(this)
        );
        //Adaptador
//        LaptoAdapter laptoAdapter = new LaptoAdapter(
//                laptoList
//        );
//        recyclerViewLapto.setAdapter(laptoAdapter);

    }
}