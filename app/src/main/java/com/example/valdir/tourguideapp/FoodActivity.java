package com.example.valdir.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        //Cria um array de palavras
        //String[] elemets = new String[10];

        // Cria um arrayList de elementos
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element("Churrascaria Estradão", "Rodovia Francisco Alves Negrão, KM 340, Itararé, SP", "(15) 3532-5858", "24H"));
        elements.add(new Element("Don Cremona", "Rua Lauro Sodré, 360, Itararé, SP", " (15) 3532-0000", "segunda a sexta: 18h as 23h59"));
        elements.add(new Element("Brasileirinho", "Rua Cel. Monteiro, 233, Itararé, SP", "(15) 3532-2145", "terça a domingo: 9h as 19h"));
        elements.add(new Element("Trilha do Caracol", "Av. Paulina de Moraes, 135 Itararé, SP", "(15) 3531-3338", "segunda a domingo: 10h as 16h"));
        elements.add(new Element("Sergio's Restaurante", "Av José Ermirio de Moraes, 552, Itararé, SP", "(15) 3532-5275", "terça a domingo: 9h as 19h"));
        elements.add(new Element("ESCAROLLA", "Pr. 20 de Setembro, 274, Itararé, SP", "(15) 3522-1897", "segunda a sexta: 18h as 23h59"));
        elements.add(new Element("Hoshi Garden - Itararé", "Rua Cel. Crescêncio, 282, Itararé, SP", "(15) 3531 2386", "segunda a sexta: 18h as 23h59"));

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
