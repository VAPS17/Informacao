package vitor.treino.informacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //todo: Função do botão, com o id: "Button".
    fun sendInformation(view: View) {

        //todo: Encontrar os layouts de informação e incrementa los numa variável.
        val EditTextName = findViewById<EditText>(R.id.EditTextName)
        val EditTextAge = findViewById<EditText>(R.id.EditTextAge)
        val EditTextEmail = findViewById<EditText>(R.id.EditTextEmail)
        val EditTextPhone = findViewById<EditText>(R.id.EditTextPhone)

        //todo: Guardar o conteúdo do layout em forma de texto.
        val mesageName = EditTextName.text.toString()
        val mesageAge = EditTextAge.text.toString()
        val mesageEmail = EditTextEmail.text.toString()
        val mesagePhone = EditTextPhone.text.toString()

        //todo: Validação do texto nas layouts.
        if (mesageName.isBlank() ) {
            EditTextName.error = "Invalid Name."
        }
        if(mesageAge.isBlank()){
            EditTextAge.error = "Invalid Age."
        }
        if(mesageEmail.isBlank()){
            EditTextEmail.error = "Invalid Email."
        }
        if(mesagePhone.isBlank()){
            EditTextPhone.error = "Invalid Phone."
        }

    }
}