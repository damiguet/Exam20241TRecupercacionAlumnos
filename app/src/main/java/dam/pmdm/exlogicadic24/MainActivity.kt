package dam.pmdm.exlogicadic24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

const val NPESTAÑAS = 3

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bind
        viewPager = findViewById(R.id.viewpager)
        val adapta = ViewPagerAdapter(this, NPESTAÑAS)
        viewPager.adapter = adapta
    }
}