package com.example.20012011157_PRAC_8
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    lateinit var alarm_image:ImageView
    lateinit var heart_image:ImageView
    lateinit var alarm_animation: AnimationDrawable
    lateinit var heart_animation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alarm_image=findViewById(R.id.alaramview)
        alarm_image.setBackgroundResource(R.drawable.alarm_logo_list)
        heart_image=findViewById(R.id.imageView2)
        heart_image.setBackgroundResource(R.drawable.heart_logo_list)
        alarm_animation=alarm_image.background as AnimationDrawable
        heart_animation=heart_image.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alarm_animation.start()
            heart_animation.start()
        }else{
            alarm_animation.stop()
            heart_animation.stop()
        }
    }
}
