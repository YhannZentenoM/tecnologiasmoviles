package com.example.proyectotm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CitasMedicas extends AppCompatActivity {

    private ListView list;
    private String[] citas = {"Cita: Odontología - 10:40 AM", "Cita: Pediatria - 4:24 PM", "Cita: Medicina General - 3:01 PM"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas_medicas);
        list = (ListView)findViewById(R.id.ListCitas);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, citas);
        list.setAdapter(adaptador);
    }
    public void onClick(View view) {
        startActivity(new Intent("com.example.ReservarCita"));
    }


}