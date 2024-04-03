package com.example.aplicativo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirDialog(View view) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Obrigado por nos avaliar!");
        dialog.setMessage("Deseja deixar um feedback?");

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface Dialoginterface, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Obrigado pelo feedback!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface Dialoginterface, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Agrademos a atenção",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
dialog.create();
dialog.show();
        }
    }
