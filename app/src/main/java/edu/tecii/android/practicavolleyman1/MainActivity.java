package edu.tecii.android.practicavolleyman1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // Declaramos un listView y un ArrayAdapter
    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener instancia de la lista
        listView = (ListView)findViewById(R.id.listView);

        //Crear y setear adaptador
        adapter = new PostAdapter(this);
        listView.setAdapter(adapter);
    }
}
