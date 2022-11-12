package com.example.20012011157_PRAC_8
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var logo_image:ImageView
    lateinit var logo_frame_by_frame_animation:AnimationDrawable
    lateinit var twin_animation:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo_image=findViewById(R.id.imageview1)
        logo_image.setBackgroundResource(R.drawable.uvpce_logo_list)
        logo_frame_by_frame_animation=logo_image.background as
                AnimationDrawable

        twin_animation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        twin_animation.setAnimationListener(this)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 4000)
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            logo_frame_by_frame_animation.start()
            logo_image.startAnimation(twin_animation)
        }else{
            logo_frame_by_frame_animation.stop()
        }
    }
    override fun onAnimationStart(p0: Animation?) {
    }
    override fun onAnimationEnd(p0: Animation?) {
    }
    override fun onAnimationRepeat(p0: Animation?) {
    }
}