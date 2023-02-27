package com.appnotification;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    Button b2;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b);
        b2 = findViewById(R.id.b2);
        b4 = findViewById(R.id.b4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t;
                t= Toast.makeText (getApplicationContext(), "lONG ", Toast.LENGTH_LONG);
                t.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t;
                t= Toast.makeText (getApplicationContext(), "SHORT ", Toast.LENGTH_SHORT);
                t.show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder boite;
                boite = new AlertDialog.Builder(MainActivity.this);
                boite.setTitle("boite de dialogue");
                //boite.setIcon(R.drawable.icon);
                boite.setMessage("Message de la boite");
                boite.setPositiveButton("text button", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                boite.show();
            }
        });
    }
    //public void afficher(View view){
    //    Toast t= Toast.makeText (getApplicationContext(), "Bonjour ", Toast.LENGTH_SHORT);
    //    t.show();
    //}

}