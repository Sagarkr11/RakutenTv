package jp.co.rakuten.tech.rakutentv.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import jp.co.rakuten.tech.rakutentv.R

class SplashActivity : AppCompatActivity() {

  private var handler: Handler? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    handler = Handler()
    handler!!.postDelayed({
      val splashIntent = Intent(this@SplashActivity, CategoryDetailActivity::class.java)
      startActivity(splashIntent)
      finish()
    }, 4000)

  }
}
