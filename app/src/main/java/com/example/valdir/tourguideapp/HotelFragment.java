package com.example.valdir.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Uma subclasse {@link Fragment} simples.
 */
public class HotelFragment extends Fragment {

    public HotelFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.element_list, container, false);

        // Cria um arrayList de elementos
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element(getResources().getString(R.string.title_hotel_ita), getResources().getString(R.string.adress_hotel_ita), getResources().getString(R.string.tel_hotel_ita), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_mar), getResources().getString(R.string.adress_hotel_mar), getResources().getString(R.string.tel_hotel_mar), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_glo), getResources().getString(R.string.adress_hotel_glo), getResources().getString(R.string.tel_hotel_glo), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_cla), getResources().getString(R.string.adress_hotel_cla), getResources().getString(R.string.tel_hotel_cla), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_and), getResources().getString(R.string.adress_hotel_and), getResources().getString(R.string.tel_hotel_and), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_par), getResources().getString(R.string.adress_hotel_par), getResources().getString(R.string.tel_hotel_par), getResources().getString(R.string.operating_time_24H)));
        elements.add(new Element(getResources().getString(R.string.title_hotel_dri), getResources().getString(R.string.adress_hotel_dri), getResources().getString(R.string.tel_hotel_dri), getResources().getString(R.string.operating_time_24H)));

        // Crie um {@link itemsAdapter}, cuja fonte de dados é uma lista de {@link Element} s.
        // adaptador sabe como criar itens de lista para cada item na lista
        ElementAdapter itemsAdapter = new ElementAdapter(getContext(), elements);

        // Encontre o objeto {@link ListView} na hierarquia de exibição da {@link Activity}.
        // Deve haver um {@link ListView} com a lista de ID da vista, que é declarada no
        // arquivo de layout activity_food.xml.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Faça o {@link ListView} usar o {@link ArrayAdapter} que criamos acima, para que o
        // {@link ListView} exibirá itens de lista para cada palavra na lista de palavras.
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
