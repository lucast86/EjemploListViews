package com.example.ejemplolistviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejemplolistviews.models.Producto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductoAdapter extends BaseAdapter {

    private List<Producto> listaProductos;

    public ProductoAdapter(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    //getCount()  ESTE METODO CUENTA CUANTOS ELEMENTOS TIENE QUE MOSTRAR
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    //getItem MUESTRA LA POSICION DE CADA REGISTRO
    public Producto getItem(int i) {
        return listaProductos.get(i);
    }

    @Override
    //getItemId NOS MUESTRA EL ID DE CADA REGISTRO NOS SIRVE PARA SABER QUE PANTALLA SE SELECCIONA
    public long getItemId(int i) {
        return getItem(i).getId();
    }

    @Override
    /*
    Este metodo va a recorrer todos los elementos. y va a generar las vistas
    va a insertar todos los productos en el listView que esta en la activity_main.xml
    como diseñamos en item_lista_productos
     */
    public View getView(int i, View convetView, ViewGroup parent) {
         //convetView sierve para optimizar la app, crea los view necesarios para cubrir la
        //pantalla, no todos los registros
        View view;
        if (convetView==null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_productos, parent, false);
        }else {
            view = convetView;
        }

        Producto producto = getItem(i);

        ImageView imgProductoImagen = view.findViewById(R.id.imgProductoImagen);
        TextView txtProductoNombre = view.findViewById(R.id.txtProductoNombre);
        TextView txtProductoPrecio = view.findViewById(R.id.txtProductoPrecio);
        TextView txtProductoBarcode = view.findViewById(R.id.txtProductoBarcode);

        txtProductoNombre.setText(producto.getNombre());
        txtProductoBarcode.setText(producto.getBarcade());
        txtProductoPrecio.setText(String.valueOf("$" + producto.getPrecio()));
        //imgProductoImagen.setImageResource(R.drawable.tang);
        Picasso.get().load("http://lorempixel.com/400/200/food/3"+producto.getId()).into(imgProductoImagen);
        return view;
    }
}

