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
public class RecreationFragment extends Fragment {

    public RecreationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.element_list, container, false);

        // Cria um arrayList de elementos
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element(getResources().getString(R.string.title_recre_est), getResources().getString(R.string.adress_recre_est), getResources().getString(R.string.tel_recre_est), getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_recre_meg), getResources().getString(R.string.adress_recre_meg), getResources().getString(R.string.tel_recre_meg), getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_recre_rev), getResources().getString(R.string.adress_recre_rev), getResources().getString(R.string.tel_recre_rev), getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_recre_sant), getResources().getString(R.string.adress_recre_sant), getResources().getString(R.string.tel_recre_sant), getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_recre_gam), getResources().getString(R.string.adress_recre_gam), getResources().getString(R.string.tel_recre_gam), getResources().getString(R.string.operating_time_comerc)));
        elements.add(new Element(getResources().getString(R.string.title_recre_bic), getResources().getString(R.string.adress_recre_bic), getResources().getString(R.string.tel_recre_bic), getResources().getString(R.string.operating_time_comerc)));

        // Crie um {@link itemsdapter}, cuja fonte de dados é uma lista de {@link Element} s.
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
