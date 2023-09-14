package com.pedro.fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class PrimerFragmento extends Fragment {
    View view;
    Button primerBoton;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        view = inflater.inflate(R.layout.primer_fragmento, container, false);
        primerBoton = (Button) view.findViewById(R.id.btnPrimerBoton);
        primerBoton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Primer Fragmento", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
