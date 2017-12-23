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
public class FoodFragment extends Fragment {


    public FoodFragment() {
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

        elements.add(new Element(getResources().getString(R.string.title_food_estrad), getResources().getString(R.string.adress_food_estrad), getResources().getString(R.string.tel_food_bra) , getResources().getString(R.string.operating_time_24H), R.drawable.food));
        elements.add(new Element(getResources().getString(R.string.title_food_don), getResources().getString(R.string.adress_food_don), getResources().getString(R.string.tel_food_don), getResources().getString(R.string.operating_time_10H), R.drawable.food));
        elements.add(new Element( getResources().getString(R.string.title_food_bra), getResources().getString(R.string.adress_food_bra), getResources().getString(R.string.tel_food_bra), getResources().getString(R.string.operating_time_comerc), R.drawable.food));
        elements.add(new Element(getResources().getString(R.string.title_food_tr), getResources().getString(R.string.adress_food_tr), getResources().getString(R.string.tel_food_tr), getResources().getString(R.string.operating_time_comerc), R.drawable.food));
        elements.add(new Element(getResources().getString(R.string.title_food_sergio), getResources().getString(R.string.adress_food_sergio), getResources().getString(R.string.tel_food_sergio), getResources().getString(R.string.operating_time_24H), R.drawable.food));
        elements.add(new Element(getResources().getString(R.string.title_food_esc), getResources().getString(R.string.adress_food_esc), getResources().getString(R.string.tel_food_esc), getResources().getString(R.string.operating_time_comerc), R.drawable.food));
        elements.add(new Element(getResources().getString(R.string.title_food_hoshi), getResources().getString(R.string.adress_food_hoshi), getResources().getString(R.string.tel_food_hoshi),getResources().getString(R.string.operating_time_24H), R.drawable.food));

        // Crie um {@link WordAdapter}, cuja fonte de dados é uma lista de {@link Element} s.
        // adaptador sabe como criar itens de lista para cada item na lista
        ElementAdapter itemsAdapter = new ElementAdapter(getActivity(), elements);

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
