package ensio.ia2.tp2_ghaith_mefteh

import android.content.Intent
import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_currency)
        val binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.button.setOnClickListener {

                binding.button.setBackgroundColor(Color.DKGRAY)
                binding.button2.setBackgroundColor(Color.LTGRAY)

                if (binding.editTextTextPersonName.text.isEmpty()){
                    Toast.makeText(this,"saisir un mantant",Toast.LENGTH_LONG).show()
                }else{
                    val intent = Intent(this,ConversionActivity::class.java)
                    intent.putExtra("mantant",binding.editTextTextPersonName.text.toString().toFloat())
                    intent.putExtra("sens","dt_Euro")
                    startActivity(intent)
                }

            }
        binding.button2.setOnClickListener {

            binding.button2.setBackgroundColor(Color.DKGRAY)
            binding.button.setBackgroundColor(Color.LTGRAY)
            if (binding.editTextTextPersonName.text.isEmpty()){
                Toast.makeText(this,"saisir un mantant",Toast.LENGTH_LONG).show()
            }else{
                val i = Intent(this,ConversionActivity::class.java)
                i.putExtra("mantant",binding.editTextTextPersonName.text.toString().toFloat())
                i.putExtra("sens","Euro_dt")
                startActivity(i)
            }

        }




    }
}