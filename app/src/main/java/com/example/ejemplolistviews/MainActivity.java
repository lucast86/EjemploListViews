package com.example.ejemplolistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ejemplolistviews.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProductos = findViewById(R.id.lvProductos);

        List<Producto> listaProductos = new ArrayList<>();

        this.cargarDatos(listaProductos);

        lvProductos.setAdapter(new ProductoAdapter(listaProductos));

        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this, "Click en elemento"+ i, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void cargarDatos(List<Producto> listaProductos){

        listaProductos.add(new Producto(1, "jugo",13.4f, "3245543", 0));
        listaProductos.add(new Producto(2, "pan",154.4f, "3245355", 0));
        listaProductos.add(new Producto(3, "queso",23.4f, "3245313", 0));
        listaProductos.add(new Producto(4, "shampo",43.4f, "3246543", 0));
        listaProductos.add(new Producto(5, "jabon",143.4f, "3235743", 0));
        listaProductos.add(new Producto(6, "jabon",143.4f, "3235743", 0));
        listaProductos.add(new Producto(7, "jabon",143.4f, "3235743", 0));
    }
}