package ensio.ia2.tp2_ghaith_mefteh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityHomeBinding
import ensio.ia2.tp2_ghaith_mefteh.databinding.ActivityTemperatureBinding
import kotlin.math.ceil

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_temperature)
        val binding=ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.radiogroup.setOnCheckedChangeListener { group, checkedId ->
            if (binding.editTextTextPersonName2.text.isEmpty()){
                Toast.makeText(this,"saisir un température svp ",Toast.LENGTH_LONG).show()
            }
            else{
                val p =binding.editTextTextPersonName2.text.toString().toFloat()
                var res = 0.0f
                   when(checkedId){
                       binding.radioButton2.id -> {
                           res = ((9* p)/5 + 32)
                       }
                       binding.radioButton.id -> {
                           res = (5 * (p - 32)/9)
                       }
                   }
                if (binding.checkBox.isChecked){
                    res = ceil(res)
                }
                binding.textView6.text=res.toString()
            }
        }

    }
}