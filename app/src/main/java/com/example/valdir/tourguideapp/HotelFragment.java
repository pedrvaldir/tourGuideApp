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
public class HotelFragment extends Fragment {


    public HotelFragment() {
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

        elements.add(new Element(getResources().getString(R.string.title_hotel_ita), getResources().getString(R.string.adress_hotel_ita), getResources().getString(R.string.tel_hotel_ita), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_mar), getResources().getString(R.string.adress_hotel_mar), getResources().getString(R.string.tel_hotel_mar), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_glo), getResources().getString(R.string.adress_hotel_glo), getResources().getString(R.string.tel_hotel_glo), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_cla), getResources().getString(R.string.adress_hotel_cla), getResources().getString(R.string.tel_hotel_cla), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_and), getResources().getString(R.string.adress_hotel_and), getResources().getString(R.string.tel_hotel_and), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_par), getResources().getString(R.string.adress_hotel_par), getResources().getString(R.string.tel_hotel_par), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_dri), getResources().getString(R.string.adress_hotel_dri), getResources().getString(R.string.tel_hotel_dri), getResources().getString(R.string.operating_time_24H)));

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
