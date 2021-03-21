package br.com.cotemig.desafiopedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_imposto.*

class resultadoImposto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imposto)

        var pagamento = intent.getDoubleExtra("pagamento",0.0)
        txt_v_valor_de_imposto.text = pagamento.toString()

        btn_voltar.setOnClickListener {
            btnVoltaPrimeiraTela()
        }

    }

    fun btnVoltaPrimeiraTela(){
        var intentVoltaPrimeiraTela = Intent(this, MainActivity::class.java)
        startActivity(intentVoltaPrimeiraTela)
        finish()
        }

}