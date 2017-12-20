package com.example.valdir.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        //Cria um array de palavras
        //String[] elemets = new String[10];

        // Cria um arrayList de elementos
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element("title", "adress1", "telephone1", "operatingHours1"));
        elements.add(new Element("title2", "adress2", "telephone2", "operatingHours2"));
        elements.add(new Element("title3", "adress3", "telephone3", "operatingHours3"));
        elements.add(new Element("title4", "adress4", "telephone4", "operatingHours4"));
        elements.add(new Element("title5", "adress5", "telephone5", "operatingHours5"));
        elements.add(new Element("title6", "adress6", "telephone6", "operatingHours6"));
        elements.add(new Element("title7", "adress7", "telephone7", "operatingHours7"));
        elements.add(new Element("title8", "adress8", "telephone8", "operatingHours8"));

        // Crie um {@link WordAdapter}, cuja fonte de dados é uma lista de {@link Element} s.
        // adaptador sabe como criar itens de lista para cada item na lista
        ElementAdapter itemsAdapter = new ElementAdapter(this, elements);

        // Encontre o objeto {@link ListView} na hierarquia de exibição da {@link Activity}.
        // Deve haver um {@link ListView} com a lista de ID da vista, que é declarada no
        // arquivo de layout activity_food.xml.
        ListView listView = (ListView) findViewById(R.id.list);

        // Faça o {@link ListView} usar o {@link ArrayAdapter} que criamos acima, para que o
        // {@link ListView} exibirá itens de lista para cada palavra na lista de palavras.
        // Faça isso chamando o método setAdapter no objeto {@link ListView} e passe.
        // 1 argumento, que é o {@link ArrayAdapter} com o nome da variável itemAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
