package vitor.treino.informacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_information)

        //todo: Guardar o conteúdo do "pacote" enviado numa variavel
        val mesageName = intent.getStringExtra(MainActivity.INFO_EXTRA_NAME)
        val mesageAge = intent.getStringExtra(MainActivity.INFO_EXTRA_AGE)
        val mesageEmail = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        val mesagePhone = intent.getStringExtra(MainActivity.INFO_EXTRA_PHONE)

        //todo: Encontrar os layouts de informação e incrementa los numa variável.
        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewAge = findViewById<TextView>(R.id.textViewAge)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        val textViewPhone = findViewById<TextView>(R.id.textViewPhone)

        //todo: Apresentar as Informações enviadas nos layouts difenidos
        textViewName.setText(mesageName)
        textViewAge.setText(mesageAge)
        textViewEmail.setText(mesageEmail)
        textViewPhone.setText(mesagePhone)
    }
}
