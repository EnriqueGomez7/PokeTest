package com.example.aplicacion_personal

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import com.example.aplicacion_personal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Variable para incorporar música

        mediaPlayer = MediaPlayer.create(this, R.raw.pokemon_inicio)

        mediaPlayer.setOnCompletionListener {

            mediaPlayer.start()

        }

        mediaPlayer.start()

        var chico = 0

        binding.login.setOnClickListener {

            if (binding.nombre.text.toString().isEmpty()) {

                binding.nombre.error = "Introduce un nombre"

            }else if(binding.chico.isChecked){

                if(binding.si.isChecked) {

                    chico = 1

                    val intent = Intent(this, SecondActivity::class.java)

                    intent.putExtra("usuario", binding.nombre.text.toString())

                    intent.putExtra("chico", chico)

                    startActivity(intent)

                    finish()

                }else if(binding.no.isChecked) {

                    finish()

                }

            }else if(binding.chica.isChecked){

                if(binding.si.isChecked) {

                    val intent = Intent(this, SecondActivity::class.java)

                    intent.putExtra("usuario", binding.nombre.text.toString())

                    intent.putExtra("chico", chico)

                    startActivity(intent)

                    finish()

                }else if(binding.no.isChecked) {

                    finish()

                }


            }else{

                Toast.makeText(this@MainActivity, "Marca todas las opciones", Toast.LENGTH_SHORT).show()

            }

        }

    }

    //Función para que la música se para cuando la aplicación esté en segundo plano

    override fun onPause() {

        super.onPause()

        mediaPlayer.pause()

    }

    //Función para reanudar la música cuando la apliación vuelve del segundo plano

    override fun onResume() {

        super.onResume()

        mediaPlayer.start()

    }

}

