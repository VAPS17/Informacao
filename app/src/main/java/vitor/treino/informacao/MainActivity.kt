package vitor.treino.informacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendInformation(view: View) {

        //todo: Encontrar os layouts de informação e incrementa los numa variável.
        val EditTextName = findViewById<EditText>(R.id.EditTextName)
        val EditTextAge = findViewById<EditText>(R.id.EditTextAge)
        val EditTextEmail = findViewById<EditText>(R.id.EditTextEmail)
        val EditTextPhone = findViewById<EditText>(R.id.EditTextPhone)
    }
}