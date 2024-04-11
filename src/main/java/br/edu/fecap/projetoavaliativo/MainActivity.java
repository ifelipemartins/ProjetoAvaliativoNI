package br.edu.fecap.projetoavaliativo;

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

    public void FinalizarPedido(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Fechar Pedido");
        dialog.setMessage("Tem certeza que deseja finalizar seu pedido?");

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Pedido finalizado com sucesso!",
                        Toast.LENGTH_LONG
                ).show();

            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Pedido cancelado!",
                        Toast.LENGTH_LONG
                ).show();

            }
        });
        dialog.create();
        dialog.show();
    }



}