package com.volpe.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // Atributos
    String[] frases = {
            "- Acredite em si mesmo e conquiste o impossível.",
            "- Pequenos passos levam a grandes conquistas.",
            "- A persistência é a chave do sucesso.",
            "- Sou muito foda!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(frases.length);
        String frase = frases[ numeroAleatorio ];
        texto.setText( frase );
    }
    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for( String frase : frases ){
            textoResultado = textoResultado + frase + "\n\n";
        }

        texto.setText(textoResultado);
    }
    public void limpar(View view){
        TextView texto = findViewById(R.id.textResultado);
        texto.setText("");
    }
}