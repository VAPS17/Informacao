package vitor.treino.informacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //todo: Função do botão, com o id: "Button".
    fun sendInformation(view: View) {

        //todo: Encontrar os layouts de informação e incrementa los numa variável.
        val editTextName = findViewById<EditText>(R.id.EditTextName)
        val editTextAge = findViewById<EditText>(R.id.EditTextAge)
        val editTextEmail = findViewById<EditText>(R.id.EditTextEmail)
        val editTextPhone = findViewById<EditText>(R.id.EditTextPhone)

        //todo: Guardar o conteúdo do layout em forma de texto.
        val mesageName = editTextName.text.toString()
        val mesageAge = editTextAge.text.toString()
        val mesageEmail = editTextEmail.text.toString()
        val mesagePhone = editTextPhone.text.toString()

        //todo: Validação do texto nas layouts.
        if (mesageName.isBlank() ) {
            editTextName.error = "Invalid Name."
        }
        if(mesageAge.isBlank()){
            editTextAge.error = "Invalid Age."
        }
        if(mesageEmail.isBlank()){
            editTextEmail.error = "Invalid Email."
        }
        if(mesagePhone.isBlank()){
            editTextPhone.error = "Invalid Phone."
        }

        val intent = intent
    }
}