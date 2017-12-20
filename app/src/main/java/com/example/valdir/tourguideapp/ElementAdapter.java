package com.example.valdir.tourguideapp;

/**
 * Created by VALDIR on 20/12/2017.
 *  * {@link ElementAdapter} é um  {@link ArrayAdapter} que pode fornecer o layout para cada item da lista
 * om base em uma fonte de dados, que é uma lista de objetos do {@link Element}
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ElementAdapter extends ArrayAdapter<Element> {

    /**
     * Criar um novo objeto {@link ElementAdapter}
     *
     * @param e o contexto atual (isto é, atividade) que o adaptador está sendo criado.
     * @param elements é a lista de {@link Element} a ser exibido.
     */
    public ElementAdapter(Context context, ArrayList<Element> elements) {
        super(context, 0, elements);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Verifique se uma visualização existente está sendo reutilizada, caso contrário, infle a vista
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // pegue o objeto {@link Element} localizado nessa posição da lista
        Element currentElement = getItem(position);



        // Encontre o TextView no list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        // Encontre o titulo do elemento para o objeto currentElement e defina o texto em Title textView.
        titleTextView.setText(currentElement.getTitle());


        TextView adressTextView = (TextView) listItemView.findViewById(R.id.adress_text_view);
        adressTextView.setText(currentElement.getAdress());

        TextView telephoneTextView = (TextView) listItemView.findViewById(R.id.telephone_text_view);
        telephoneTextView.setText(currentElement.getTelephone());

        TextView operatingTextView = (TextView) listItemView.findViewById(R.id.operating_hours_text_view);
        operatingTextView.setText(currentElement.getOperatingHours());


        // Retorne todo o layout do item da lista (contendo 3 TextViews) para que ele possa ser mostrado no
        // ListView.
        return listItemView;
    }
}
