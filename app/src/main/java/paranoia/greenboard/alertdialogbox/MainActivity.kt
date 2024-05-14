 package paranoia.greenboard.alertdialogbox

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import paranoia.greenboard.alertdialogbox.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = binding.button

        button.setOnClickListener(){

            showAlertDialog()

        }


    }


     private fun showAlertDialog(){

         val builder = AlertDialog.Builder(this)
             builder.setTitle("Snapchat")
                    .setMessage("Do you want to uninstall the app?")
                 .setPositiveButton("yes"){dialog,which ->

                     Toast.makeText(this,"the app successfully uninstalled",Toast.LENGTH_SHORT).show()

                 }


                 .setNegativeButton("No"){dialog,which ->

                  dialog.dismiss()
                 }


         val alertDialog: AlertDialog = builder.create()
             alertDialog.show()

     }
}