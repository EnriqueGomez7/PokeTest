package com.example.aplicacion_personal

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.aplicacion_personal.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        val b = intent.extras

        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.test2)

        mediaPlayer.setOnCompletionListener {

            mediaPlayer.start()

        }

        //Variables de naturalezas, para determinar el tipo según las respuestas del spinner

        var docil = 0

        var grosero = 0

        var fuerte = 0

        var miedoso = 0

        var activo = 0

        var alegre = 0

        var osado = 0

        var sereno = 0

        var agitado = 0

        var hurano = 0

        var placido = 0

        var raro = 0

        var audaz = 0


        //Variables trasladadas de la MainActivity


        val usuario = b!!.getString("usuario")

        val chico = b!!.getInt("chico")

        binding.textobienvenida.text = "Te doy la bienvenida $usuario!\n\n Este es el portal que conduce al mundo de los Pokémon.\n\n Pero antes de partir deberas responder algunas preguntas.\n\n Responde con sincerdiad.\n ¿Todo listo?.\n Entonces... ¡que empiece el cuestionario!"

        val pregunta1 = arrayOf("Seleccione una respuesta", "Estudio mucho", "El ultimo dia", "Paso, prefiero jugar")

        val pregunta2 = arrayOf("Seleccione una respuesta", "¡La llevo a la policia!", "Uf, qué dificil...", "Si no me ve nadie...")

        val pregunta3 = arrayOf("Seleccione una respuesta", "Abrirla de golpe", "¡Gritar yo también!")

        val pregunta4 = arrayOf("Seleccione una respuesta", "Claro.", "No")

        val pregunta5 = arrayOf("Seleccione una respuesta", "Si.", "No")

        val pregunta6 = arrayOf("Seleccione una respuesta", "Me enfrento a él", "Le amenazo, desde lejos", "Me lanzo a por él")

        val pregunta7 = arrayOf("Seleccione una respuesta", "Gritar y huir", "Cerrar la tapa", "Darle la mia")

        val pregunta8 = arrayOf("Seleccione una respuesta", "Enfadarme", "Seguir esperando", "¡Cabrearme y largarme!")

        val pregunta9 = arrayOf("Seleccione una respuesta", "Si.", "No")

        val pregunta10 = arrayOf("Seleccione una respuesta", "Si.", "No")

        val pregunta11 = arrayOf("Seleccione una respuesta", "¡De maravilla!", "Qué sueno...", "¡Quiero irme a casa!")

        val pregunta12 = arrayOf("Seleccione una respuesta", "Si.", "No")

        val pregunta13 = arrayOf("Seleccione una respuesta", "¡La derecha!", "No me fio: la izquierda", "Me vale cualquiera")


        //Variables para el estilo de los spinner


        val adapter = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta1)

        val adapter2 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta2)

        val adapter3 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta3)

        val adapter4 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta4)

        val adapter5 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta5)

        val adapter6 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta6)

        val adapter7 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta7)

        val adapter8 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta8)

        val adapter9 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta9)

        val adapter10 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta10)

        val adapter11 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta11)

        val adapter12 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta12)

        val adapter13 = ArrayAdapter(this, R.layout.my_textview, R.id.mytextview, pregunta13)

        binding.spinner1.adapter = adapter

        binding.spinner2.adapter = adapter2

        binding.spinner3.adapter = adapter3

        binding.spinner4.adapter = adapter4

        binding.spinner5.adapter = adapter5

        binding.spinner6.adapter = adapter6

        binding.spinner7.adapter = adapter7

        binding.spinner8.adapter = adapter8

        binding.spinner9.adapter = adapter9

        binding.spinner10.adapter = adapter10

        binding.spinner11.adapter = adapter11

        binding.spinner12.adapter = adapter12

        binding.spinner13.adapter = adapter13

        binding.terminar.setOnClickListener {

            val spinner1 = binding.spinner1.selectedItemPosition

            val spinner2 = binding.spinner2.selectedItemPosition

            val spinner3 = binding.spinner3.selectedItemPosition

            val spinner4 = binding.spinner4.selectedItemPosition

            val spinner5 = binding.spinner5.selectedItemPosition

            val spinner6 = binding.spinner6.selectedItemPosition

            val spinner7 = binding.spinner7.selectedItemPosition

            val spinner8 = binding.spinner8.selectedItemPosition

            val spinner9 = binding.spinner9.selectedItemPosition

            val spinner10 = binding.spinner10.selectedItemPosition

            val spinner11 = binding.spinner11.selectedItemPosition

            val spinner12 = binding.spinner12.selectedItemPosition

            val spinner13 = binding.spinner13.selectedItemPosition

            if (spinner1 == 0 || spinner2 == 0 || spinner3 == 0 || spinner4 == 0 || spinner5 == 0 || spinner6 == 0 || spinner7 == 0 || spinner8 == 0 || spinner9 == 0 || spinner10 == 0 || spinner11 == 0 || spinner12 == 0 || spinner13 == 0){

                Toast.makeText(this@SecondActivity, "Tienes alguna pregunta sin responder", Toast.LENGTH_SHORT).show()

            }else{

                when (spinner1) {
                    1 -> fuerte += 2

                    2 -> placido += 2

                    3 -> agitado += 2

                }

                when(spinner2){

                    1 -> docil += 2

                    2 -> osado += 2

                    3 -> agitado += 2

                }

                when(spinner3){

                    1 ->{
                        fuerte += 1

                        audaz += 2
                    }

                    2 -> osado += 2

                }

                when(spinner4){

                    1 -> {

                        alegre += 2

                        hurano += 1

                    }

                    2 -> miedoso += 1

                }

                when(spinner5){

                    1 -> osado += 2

                    2 -> activo += 2

                }

                when(spinner6){

                    1 -> audaz += 3

                    2 -> miedoso += 2

                    3 -> agitado += 2

                }


                when(spinner7){

                    1 -> miedoso += 2

                    2 ->{

                        fuerte += 1

                        sereno += 2

                    }

                    3 ->{

                        audaz += 2

                        agitado += 1

                        osado += 1

                    }

                }

                when(spinner8){

                    1 ->{

                        docil += 1

                        activo += 2

                    }

                    2 -> placido += 2

                    3 -> activo += 3

                }

                when(spinner9){

                    1 -> grosero += 2

                    2 -> placido += 2

                }

                when(spinner10){

                    1 ->{

                        sereno += 2

                        hurano += 1

                    }

                    2 -> fuerte += 2

                }


                when(spinner11){

                    1 -> alegre += 2

                    2 -> placido += 2

                    3 -> activo += 2

                }


                when(spinner12){

                    1 ->{

                        miedoso += 1

                        hurano += 2

                    }

                    2 -> grosero += 2


                }

                when(spinner13){

                    1 -> docil += 2

                    2 -> grosero += 2

                    3 -> raro += 2

                }

                val intent = Intent(this, ThirdActivity::class.java)

                intent.putExtra("docil", docil)

                intent.putExtra("grosero", grosero)

                intent.putExtra("fuerte", fuerte)

                intent.putExtra("miedoso", miedoso)

                intent.putExtra("activo", activo)

                intent.putExtra("alegre", alegre)

                intent.putExtra("osado", osado)

                intent.putExtra("sereno", sereno)

                intent.putExtra("agitado", agitado)

                intent.putExtra("hurano", hurano)

                intent.putExtra("placido", placido)

                intent.putExtra("raro", raro)

                intent.putExtra("audaz", audaz)

                intent.putExtra("chico", chico)

                startActivity(intent)

                finish()

            }

        }

    }

    override fun onPause() {

        super.onPause()

        mediaPlayer.pause()

    }

    override fun onResume() {

        super.onResume()

        mediaPlayer.start()

    }
}