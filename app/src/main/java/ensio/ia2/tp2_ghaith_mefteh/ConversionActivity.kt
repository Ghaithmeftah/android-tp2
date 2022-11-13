package ensio.ia2.tp2_ghaith_mefteh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityConversionBinding

class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_conversion)
        val binding = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nb = intent.getFloatExtra("mantant",0.0f)
        val sens = intent.getStringExtra("sens")
        binding.textView.text= nb.toString()
        binding.textView3.text= sens
        binding.button3.setOnClickListener {
            if (sens == "dt_Euro"){
                Toast.makeText(this,"l'équivalent de $nb Dt en Euro est :: ${nb * 3.2} Dt",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"L'équivalent de $nb Euro en DT est :: ${nb / 3.2} Euro",Toast.LENGTH_LONG).show()
            }
        }


    }
}