package br.com.android.laudeni.beautypoint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lista);

        // Criando uma lista estática de saloes para preencher o listview
        final ArrayList<Salao> listaSalaos = new ArrayList<>();

        Salao p1 = new Salao("Salao do ze", "Descrição...", 0,
                "https://scontent.frec9-1.fna.fbcdn.net/v/t1.0-1/p200x200/15192788_656019241241887_5943329969300955579_n.jpg?_nc_cat=0&oh=b8a83782447076f88d8f170ab7f9be35&oe=5B992432",
                "Aqui deve ser adereçado um endereço", "Zé do salao");
        Salao p2 = new Salao("Salao da Ana", "descriçao e coisa e tau\naskhdhsaggg...", 0,
                "http://www.buscaai.com/imagens/anuncio_perfil/050315114006/ANA-GALVa-O.jpg.jpg",
                "rua que nao existe", "Ana");
        Salao p3 = new Salao("Salao da Ju", "descriçao do salao da ju", 0,
                "http://disksc.com.br/files/salao_da_ju.jpg",
                "perto do outro", "Ju juliana");

        listaSalaos.add(p1);
        listaSalaos.add(p2);
        listaSalaos.add(p3);

        // Criando o Adapter passando a lista de saloes
        SalaoAdapter adapter = new SalaoAdapter(MainActivity.this, listaSalaos);

        // Adicionando o adapter ao listview
        listView.setAdapter(adapter);

        // Capturando o evento de clique no item da lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Salao salao = listaSalaos.get(position);

                Intent intent = new Intent(MainActivity.this, DetalheSalao.class);
                // Passando o salao clicado como extra na intent
                intent.putExtra("salaoSelecionado", salao);

                // Abrindo a tela DetalheSalaoActivity
                startActivity(intent);
            }
        });

    }
}
