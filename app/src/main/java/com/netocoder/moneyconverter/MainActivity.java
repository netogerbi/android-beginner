package com.netocoder.moneyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//3º método de inserir logica em elementos: implements View.onClickListener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDollar = findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        //3º método de inserir logica em elementos
        this.mViewHolder.buttonCalculate.setOnClickListener(this);

//        //2º método de inserir logica em elementos
//        this.mViewHolder.buttonCalculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //logica do botão
//            }
//        });

    }

    //3° método de inserir logica em elementos
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button_calculate){
            //logica do botão
            this.mViewHolder.buttonCalculate.setText("Teste");
        }
    }

//    //1º método de inserir logica em elementos
//    public void teste(View view) {
//        //logica do botão
//    }

    private static class ViewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }
}
