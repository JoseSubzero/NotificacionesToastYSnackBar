package com.example.notificacionestoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.notificacionestoast.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toast(view: View){
        Toast.makeText(this@MainActivity, "Toast de ejemplo", Toast.LENGTH_SHORT).show()
    }

    fun myToastGravity(view:View){
        val t = Toast.makeText(this@MainActivity, "Toast con gravity", Toast.LENGTH_SHORT)
        t.setGravity(Gravity.CENTER or Gravity.LEFT, 0,0)
        t.show()
    }

    fun myToastLayout(view: View){
        val layout = layoutInflater.inflate(R.layout.toast,null)
        layout!!.findViewById<TextView>(R.id.tvTitulo).text = "Alerta"
                layout!!.findViewById<TextView>(R.id.tvDescripcion)
            .text = "Esto es un Toast personalizado"
        val t = Toast(this@MainActivity)
        t.duration = Toast.LENGTH_SHORT
        t.view = layout
        t.show()
    }

    fun mySnackBar(view: View){
        Snackbar.make(view, "Testing snack", Snackbar.LENGTH_SHORT).show()
    }

    fun mySnackColor(view: View){
        val s = Snackbar.make(view, "Testing Snackbar", Snackbar.LENGTH_SHORT)
        Snackbar.LENGTH_SHORT
        //Asignando color desde recursos
        s.setTextColor(ContextCompat.getColor(view.context,
            R.color.ROJO))
        s.setActionTextColor(Color.RED)
        s.setBackgroundTint(Color.CYAN)
        s.show()
    }

    fun mySnackCostume(view: View){
        val s = Snackbar.make(view, "", Snackbar.LENGTH_SHORT)
        val sbLayout = s.view as Snackbar.SnackbarLayout
        val customLayout = layoutInflater.inflate(R.layout.toast, null)

        customLayout!!.findViewById<TextView>(R.id.tvTitulo).text = "Alerta"
        customLayout!!.findViewById<TextView>(R.id.tvDescripcion).text = "Esto es un SnackBar Personalizado"

        sbLayout.addView(customLayout,0)
        s.setBackgroundTint(Color.YELLOW)
        s.show()
    }


}