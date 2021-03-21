package br.com.cotemig.desafiopedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_valor_imposto.*

class valorImposto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor_imposto)

        var imposto = intent.getDoubleExtra("imposto", 0.0)

        btn_proximo_tela2.setOnClickListener {
        calcularImposto(imposto)
        }

    }

    fun calcularImposto(imposto : Double){
        var valor = e_txt_valorImposto.text.toString().toDouble()
        var pagamento = valor * imposto

        var intentTelaFinal = Intent(this, resultadoImposto::class.java)
        intentTelaFinal.putExtra("pagamento", pagamento)
        startActivity(intentTelaFinal)
        finish()
    }
}