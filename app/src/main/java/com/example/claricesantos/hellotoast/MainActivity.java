package com.example.claricesantos.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT); // LENGTH_SHORT é o tempo que ele fina na tela, já vem com um padrão
        toast.show();
    }

    public void showCount(View view) {
        contador++;
        TextView mensagem = findViewById(R.id.menssage);
        mensagem.setText(String.valueOf(contador));
        // ou         mensagem.setText(""+contador);
    }

    public void deletar(View view) {
        TextView deletar = findViewById(R.id.menssage);
        contador = 0;
        Toast toast = Toast.makeText(this, "Resetado", Toast.LENGTH_SHORT); // LENGTH_SHORT é o tempo que ele fina na tela, já vem com um padrão
        deletar.setText(String.valueOf("0"));
        toast.show();
    }
}
