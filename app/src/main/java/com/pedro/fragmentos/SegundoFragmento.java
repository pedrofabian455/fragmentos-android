package com.pedro.fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SegundoFragmento extends Fragment {
    View view;
    Button segundoBoton;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        view = inflater.inflate(R.layout.segundo_fragmento, container, false);
       segundoBoton = (Button) view.findViewById(R.id.btnSegundoBoton);
        segundoBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Segundo Fragmento", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
