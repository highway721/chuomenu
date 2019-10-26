package jp.w.chuo_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.home -> {
                menuImage.setImageResource(R.drawable.chuo)
                menuText.text = ""
                return true
            }
            R.id.ramen -> {
                menuImage.setImageResource(R.drawable.pic1)
                menuText.text = getString(R.string.ramen_text)
                return true
            }
            R.id.udon -> {
                menuImage.setImageResource(R.drawable.pic2)
                menuText.text = getString(R.string.udon_text)
                return true
            }
            R.id.curry -> {
                menuImage.setImageResource(R.drawable.pic3)
                menuText.text = getString(R.string.curry_text)
                return true
            }
            R.id.don -> {
                menuImage.setImageResource(R.drawable.pic6)
                menuText.text = getString(R.string.don_text)
                return true
            }
            R.id.teishoku -> {
                menuImage.setImageResource(R.drawable.pic04)
                menuText.text = getString(R.string.don_text)
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }
}


