package com.example.aplicacion_personal

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicacion_personal.databinding.ActivityThirdBinding

class ThirdActivity: AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.ending)

        mediaPlayer.setOnCompletionListener {

            mediaPlayer.start()

        }

        val b = intent.extras

        //Variables trasladadas de la SecondActivity

        val docil = b!!.getInt("docil")

        val grosero = b!!.getInt("grosero")

        val fuerte = b!!.getInt("fuerte")

        val miedoso = b!!.getInt("miedoso")

        val activo = b!!.getInt("activo")

        val alegre = b!!.getInt("alegre")

        val osado = b!!.getInt("osado")

        val sereno = b!!.getInt("sereno")

        val agitado = b!!.getInt("agitado")

        val hurano = b!!.getInt("hurano")

        val placido = b!!.getInt("placido")

        val raro = b!!.getInt("raro")

        val audaz = b!!.getInt("audaz")

        val chico = b!!.getInt("chico")

        //Array que guarda las variables de las naturalezas

        val array = arrayOf(docil, grosero, fuerte, miedoso, activo, alegre, osado, sereno, agitado, hurano, placido, raro, audaz)

        //Función que determina la variable con mayor número del array

        val max = array.maxOrNull()

        //Según la mayor variable y si es chico o chica, determino el texto y la foto que saldrá en la tercera pantalla

        if(max == docil){

            binding.naturaleza.text = "Eres una persona... ¡docil! Y muy sensible. Escuchas con atencion y respeto, y entiendes rapido las cosas. Como sabes escuchar, tus amigos a menudo te confian sus problemas y preocupaciones. La gente tal vez se burle de ti por tu seriedad y por no saber entender una broma. Seguro que al principio te sorprendes y se te suben los colores, pero después... ¡te unes a sus risas! Alguien docil y sensible como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.charmander_chico)

                binding.pokemon.text= "CHARMANDER!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.bulbasaur_chica)

                binding.pokemon.text= "BULBASAUR!"

            }

        }else if(max == grosero){

            binding.naturaleza.text = "Eres una persona... ¡atrevida! ¡O al menos a veces! No te gustan las ordenes. Eres un poco rebelde y te gusta llevar la contraria. ¡Eres un poco como un lobo solitario! Te gusta hacer las cosas por tu cuenta sin tener que estar pendiente de nadie. La gente mayor puede pensar que eres algo insolente e incluso egoista. La gente joven, sin embargo, ¡te admira! Alguien como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.riolu_chico)

                binding.pokemon.text= "RIOLU!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.totodile_chica)

                binding.pokemon.text= "TOTODILE!"

            }

        }else if(max == fuerte){

            binding.naturaleza.text = "Eres una persona... ¡fuerte! Con mucho caracter y determinacion. No te lamentas y eres autosuficiente. También eres responsable. Trabajas para lograr tus objetivos y siempre por tus propios medios. Solo necesitas tu empeño para lograr tus objetivos. ¡Pero ten cuidado! ¡Te agotaras si trabajas demasiado por tu cuenta! Deberías admitir que a veces es necesaria la ayuda de los amigos. Alguien con tu caracter podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.torchic_chico)

                binding.pokemon.text= "TORCHIC!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.treecko_chica)

                binding.pokemon.text= "TREECKO!"

            }

        }else if(max == miedoso){

            binding.naturaleza.text = "Eres una persona... timida. ¡Eres muy dulce! A veces sientes vergüenza, ¿verdad? E incluso puedes perderte nuevas experiencias porque la novedad es un reto para ti. Pero no siempre es malo ser prudente, ¿verdad? Al fin y al cabo, te mantiene a salvo. Vives la vida a tu ritmo, ¡sin prisas ni preocupaciones! Alguien como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.cyndaquil_chico)

                binding.pokemon.text= "CYNDAQUIL!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.turwig_chica)

                binding.pokemon.text= "TURTWIG!"

            }

        }else if(max == activo){

            binding.naturaleza.text = "Eres una persona... ¡impaciente! ¡Hablas deprisa! ¡Comes deprisa! ¡Siempre a todo correr! ¡Todos piensan que trabajas mucho porque nunca te paras! Pero ten cuidado. Si te apresuras tanto, puedes equivocarte más a menudo que los demas. ¡Y sería una pena! ¡Relajate de vez en cuando! ¡Coge aire! Alguien impaciente como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.shinx_chico)

                binding.pokemon.text= "SHINX!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.pikachu_chica)

                binding.pokemon.text= "PIKACHU!"

            }

        }else if(max == alegre){

            binding.naturaleza.text = "Eres una persona... ¡alegre! Tienes mucho sentido del humor y enseguida te compenetras con los demas. Haces reír a todo el mundo. ¡Muestras una actitud alegre y tienes una vitalidad que anima a cualquiera! Aunque a veces también lloras... De hecho, alternas con facilidad risas y lágrimas... ¡Menudo reto ser asi! La vida tiene que ser una sorpresa tras otra. Alguien alegre como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.totodile_chico)

                binding.pokemon.text= "TOTODILE!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.eevee_chica)

                binding.pokemon.text= "EEVEE!"

            }

        }else if(max == osado){

            binding.naturaleza.text = "Eres una persona... ¡valiente! ¡No sabes lo que es el miedo! Ni temes afrontar el peligro. La justicia es importante para ti y siempre ayudas a la gente en apuros. Pero a veces te pasas un poco con tu sentido de lo correcto... ¡Sé un poco más flexible! Alguien valiente como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.pikachu_chico)

                binding.pokemon.text= "PIKACHU!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.charmander_chica)

                binding.pokemon.text= "CHARMANDER!"

            }

        }else if(max == sereno){

            binding.naturaleza.text = "Eres una persona... ¡tranquila! Tienes gran consideración y antepones siempre el bienestar de tus amigos al tuyo. Tu bondad y generosidad te permiten reírte, perdonar y olvidar los errores de tus amigos. ¡Ve con cuidado! ¡Tu forma de ser puede relegarte demasiado! Alguien tranquilo como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.mudkip_chico)

                binding.pokemon.text= "MUDKIP!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.cyndaquil_chica)

                binding.pokemon.text= "CYNDAQUIL!"

            }

        }else if(max == agitado){

            binding.naturaleza.text = "Eres una persona... ¡traviesa! ¡Como te gusta jugar con todo! ¡Y comer bien! Te encanta competir, pero no te gusta perder. Tu personalidad es transparente. Contigo, ¡ya se sabe lo que hay! Alegras a los demas con tu gran sonrisa. A veces temes mostrarte como eres y expresar tus sentimientos. No te lo guardes todo para ti. Pide consejo a tus amigos si lo necesitas. Alguien como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.piplup_chico)

                binding.pokemon.text= "PIPLUP!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.chimchar_chica)

                binding.pokemon.text= "CHIMCHAR!"

            }

        }else if(max == hurano){

            binding.naturaleza.text = "Eres una persona... solitaria, ¡o al menos a veces! ¿Por qué te sorprendes? ¿Acaso no es cierto? Pero, ya sabes lo que dicen... En el fondo todos necesitamos nuestro espacio. Aunque no mucha gente lo reconoce. Así que no lo vayas diciendo por ahí. Si hay algo que nos une... ¡es que todos tenemos que estar solos a veces! Alguien como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.bulbasaur_chico)

                binding.pokemon.text= "BULBASAUR!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.mudkip_chica)

                binding.pokemon.text= "MUDKIP!"

            }

        }else if(max == placido){

            binding.naturaleza.text= "Eres una persona... ¡relajada! Eres informal, sin apenas preocupaciones. No te gusta correr ni estresarte, y nada te preocupa en exceso. ¡Te encanta sentarte y relajarte! ¡Y tanto! Tienes una personalidad bastante acomodadiza. ¡La gente acude a ti porque le gusta tu forma de ser! Alguien como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.treecko_chico)

                binding.pokemon.text= "TREECKO!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.vulpix_chica)

                binding.pokemon.text= "VULPIX!"

            }

        }else if(max == raro){

            binding.naturaleza.text = "Eres una persona... ¡extravagante! ¡Te encanta ir siempre a la moda! Siempre quieres tener lo ultimo, ¿verdad? ¡Te aburres de lo viejo y solo quieres cosas nuevas! Eres fiel a tus emociones y sigues siempre tu voluntad. A la gente le cuesta entender que cambies tan rápido. Tal vez deberías reflexionar sobre como tus palabras y actos afectan a los demás. Alguien extravagante como tu podria ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.squirtle_chico)

                binding.pokemon.text= "SQUIRTLE!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.piplup_chica)

                binding.pokemon.text= "PIPLUP!"

            }

        }else {

            binding.naturaleza.text = "Eres una persona... ¡audaz! ¡Eres tan valiente que nunca te echas atras! Aunque, a veces, tu osadia te hace pasarte un poco de la raya. No te da vergüenza llevarte a casa las sobras de la cena en el restaurante, ¿verdad? Si alguien te invita a cenar, ¡no te da ningún reparo pedir un montón de comida! No te desconcierta hacer cosas que otros se pensarían dos veces. ¡A veces ni te enteras de que has decepcionado a alguien! Tienes potencial para ser una gran persona... ¡porque nunca te rindes! Alguien audaz como tu podría ser..."

            if(chico == 1){

                binding.fotopokemon.setImageResource(R.drawable.turwig_chico)

                binding.pokemon.text= "TURTWIG!"

            }else{

                binding.fotopokemon.setImageResource(R.drawable.squirtle_chica)

                binding.pokemon.text= "SQUIRTLE!"

            }

        }

        binding.mensaje.setOnClickListener {

            val url = "https://api.whatsapp.com/send?text= Soy ${binding.pokemon.text} \n¿Quieres saber cómo lo descubrí? \n¡Contacta con Enrique para probar su increíble App!"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }

        binding.repetir.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

            finish()

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