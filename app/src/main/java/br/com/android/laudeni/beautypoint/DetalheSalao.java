package br.com.android.laudeni.beautypoint;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetalheSalao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhe_salao);


        Salao salao = (Salao) getIntent().getSerializableExtra("salaoSelecionado");

        TextView textNome = findViewById(R.id.dt_nome_salao);
        TextView txtEnd = findViewById(R.id.dt_end_salao);
        TextView txtDesc = findViewById(R.id.dt_desc_salao);
        TextView txtNomeFunc = findViewById(R.id.dt_nomeFunc);

        // Adiciona o nome do Salao ao textview
        textNome.setText(salao.getNome());
        txtEnd.setText(salao.getEndereço());
        txtDesc.setText(salao.getDescricao());
        txtNomeFunc.setText(salao.getNomeFuncionario());

    }
}
