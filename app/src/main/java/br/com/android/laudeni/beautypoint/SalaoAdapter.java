package br.com.android.laudeni.beautypoint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SalaoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Salao> saloes;


    public SalaoAdapter(Context context, ArrayList<Salao> saloes) {
        this.context = context;
        this.saloes = saloes;
    }


    @Override
    public int getCount() {
        return saloes.size();
    }

    @Override
    public Object getItem(int position) {
        return saloes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Cria uma instancia do objeto LayoutInflater
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Transforma um XML em um objeto do tipo View
        View v = layoutInflater.inflate(R.layout.activity_opcao_salao,null);

        // Produto na posição atual
        Salao salao = this.saloes.get(position);

        TextView textViewNome = v.findViewById(R.id.nome_salao);
        textViewNome.setText(salao.getNome());

        TextView textViewEnd = v.findViewById(R.id.end_salao);
        textViewEnd.setText(salao.getEndereço());

        TextView textViewDesc = v.findViewById(R.id.desc_salao);
        textViewDesc.setText(salao.getDescricao());

        ImageView image = v.findViewById(R.id.img_salao);
        // Faz o download da imagem e adiciona ao imageView
        Picasso.get().load(salao.getUrlImg()).into(image);

        return v;
    }
}
