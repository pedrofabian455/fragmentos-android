package com.pedro.fragmentos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    Button primerFragmento, segundoFragmento;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        primerFragmento = (Button) findViewById(R.id.btnPrimerFragmento);
        segundoFragmento = (Button) findViewById(R.id.btnSegundoFragmento);

        primerFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new PrimerFragmento());
            }
        });

        segundoFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new SegundoFragmento());
            }
        });
    }
    private void cargarFragmento(Fragment fragmento){
FragmentManager manager = this.getSupportFragmentManager();
manager.beginTransaction().replace(R.id.frameLayout, fragmento).commit();

    }

}
