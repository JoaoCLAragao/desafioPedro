package br.com.cotemig.desafiopedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proxima_tela1.setOnClickListener {
        impostoTipoProduto()
        }

    }

    fun impostoTipoProduto(){
        var imposto : Double
        if (RBtn_eletronico.isChecked){
            imposto = 0.3
        } else if (RBtn_alimentos.isChecked){
            imposto = 0.35
        } else if (RBtn_medicamentos.isChecked){
            imposto = 0.4
        } else if (RBtn_veiculos.isChecked){
            imposto = 0.15
        } else {
            imposto = 0.25
        }

        var intentValorImposto = Intent(this, valorImposto::class.java)
        intentValorImposto.putExtra("imposto", imposto)
        startActivity(intentValorImposto)
        finish()
    }
}

/*
* 1a tela:
- 5 radio button pra definir o tipo de produto
- 1 btn pra próxima tela

2a tela:
- Edit Text pedindo o valor do produto
- 1 btn calcular imposto

3a tela:
resultado do imposto
btn voltar pra tela inicial

Tabela de imposto do Pedro:

30% Eletrônico
35% Alimentos
40% Medicamentos
15% Veículos
25% Bebidas
* */