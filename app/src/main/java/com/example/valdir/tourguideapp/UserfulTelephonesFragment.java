package com.example.valdir.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserfulTelephonesFragment extends Fragment {


    public UserfulTelephonesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.element_list, container, false);

        //Cria um array de palavras
        //String[] elemets = new String[10];

        // Cria um arrayList de elementos
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element(getResources().getString(R.string.title_tel_assc), getResources().getString(R.string.adress_tel_assc), getResources().getString(R.string.tel_tel_assc) , getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_tel_guard), getResources().getString(R.string.adress_tel_guard), getResources().getString(R.string.tel_tel_guard) , getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_tel_dire), getResources().getString(R.string.adress_tel_dire), getResources().getString(R.string.tel_tel_dire) , getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_tel_pref), getResources().getString(R.string.adress_tel_pref), getResources().getString(R.string.tel_tel_pref) , getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_tel_secc), getResources().getString(R.string.adress_tel_secc), getResources().getString(R.string.tel_tel_secc) , getResources().getString(R.string.operating_time_comerc)));

        // Crie um {@link WordAdapter}, cuja fonte de dados é uma lista de {@link Element} s.
        // adaptador sabe como criar itens de lista para cada item na lista
        ElementAdapter itemsAdapter = new ElementAdapter(getContext(), elements);

        // Encontre o objeto {@link ListView} na hierarquia de exibição da {@link Activity}.
        // Deve haver um {@link ListView} com a lista de ID da vista, que é declarada no
        // arquivo de layout activity_food.xml.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Faça o {@link ListView} usar o {@link ArrayAdapter} que criamos acima, para que o
        // {@link ListView} exibirá itens de lista para cada palavra na lista de palavras.
        // Faça isso chamando o método setAdapter no objeto {@link ListView} e passe.
        // 1 argumento, que é o {@link ArrayAdapter} com o nome da variável itemAdapter.
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
