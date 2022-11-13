package ensio.ia2.tp2_ghaith_mefteh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityCurrencyBinding
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityHomeBinding
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityTemperatureBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_home)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
             val intent = Intent(this,CurrencyActivity::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            val i = Intent(this,TemperatureActivity::class.java)
            startActivity(i)
        }
    }
}