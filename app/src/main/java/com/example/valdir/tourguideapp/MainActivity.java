package com.example.valdir.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontre a Exibição que mostra as categorias
        TextView food = (TextView) findViewById(R.id.food);
        TextView hotel = (TextView) findViewById(R.id.hotel);
        TextView recreation = (TextView) findViewById(R.id.recreation);
        TextView userful_telephones = (TextView) findViewById(R.id.userful_telephones);

        //Defina um ouvinte de clique na Vista FOOD
        food.setOnClickListener(new View.OnClickListener() {

            // O código neste método será executado quando a categoria de foods for clicada.
            @Override
            public void onClick(View view) {

                // Crie uma nova intenção para abrir {@links FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Comece a nova atividade
                startActivity(foodIntent);
            }
        });

        //Defina um ouvinte de clique na Vista hotel
        hotel.setOnClickListener(new View.OnClickListener() {

            // O código neste método será executado quando a categoria de hotel for clicada.
            @Override
            public void onClick(View view) {

                // Crie uma nova intenção para abrir {@links HotelActivity}
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);

                // Comece a nova atividade
                startActivity(hotelIntent);
            }
        });

        //Defina um ouvinte de clique na Vista Recreation
        recreation.setOnClickListener(new View.OnClickListener() {

            // O código neste método será executado quando a categoria Recreation for clicada.
            @Override
            public void onClick(View view) {

                // Crie uma nova intenção para abrir {@links RecreationActivity}
                Intent recreationIntent = new Intent(MainActivity.this, RecreationActivity.class);

                // Comece a nova atividade
                startActivity(recreationIntent);
            }
        });

        //Defina um ouvinte de clique na Vista userful_telephones
        userful_telephones.setOnClickListener(new View.OnClickListener() {

            // O código neste método será executado quando a categoria userful_telephones for clicada.
            @Override
            public void onClick(View view) {

                // Crie uma nova intenção para abrir {@links UserfulTelephones}
                Intent userfulTelephonesIntent = new Intent(MainActivity.this, UserfulTelephonesActivity.class);

                // Comece a nova atividade
                startActivity(userfulTelephonesIntent);
            }
        });
    }
}
