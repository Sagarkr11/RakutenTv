package jp.co.rakuten.tech.rakutentv.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import jp.co.rakuten.tech.rakutentv.R
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import jp.co.rakuten.tech.rakutentv.model.stream.Stream
import jp.co.rakuten.tech.rakutentv.viewmodel.MovieViewModel
import jp.co.rakuten.tech.rakutentv.viewmodel.StreamViewModel

class MovieDetailActivity : AppCompatActivity(), View.OnClickListener {

  internal lateinit var imageViewMovie: ImageView
  internal lateinit var buttonPlay: Button
  internal lateinit var textViewTitle: TextView
  internal lateinit var textViewType: TextView
  internal lateinit var textViewYear: TextView
  internal lateinit var ratingBar: RatingBar
  internal lateinit var textViewShortDescription: TextView
  internal lateinit var buttonLike: Button
  internal lateinit var buttonNote: Button
  internal lateinit var buttonDownload: Button

  private var mMovieViewModel: MovieViewModel? = null
  private var mStreamViewModel: StreamViewModel? = null

  private var movieId: String? = null
  private var url: String? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_movie_detail)

    supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    supportActionBar!!.setDisplayShowHomeEnabled(true)

    if (intent != null) {
      movieId = intent.getStringExtra("MOVIE_NAME")
    }

    imageViewMovie = findViewById(R.id.imageViewMovie)
    buttonPlay = findViewById(R.id.buttonPlay)
    textViewTitle = findViewById(R.id.textViewTitle)
    textViewType = findViewById(R.id.textViewType)
    textViewYear = findViewById(R.id.textViewYear)
    ratingBar = findViewById(R.id.ratingBar)
    textViewShortDescription = findViewById(R.id.textViewShortDescription)

    buttonLike = findViewById(R.id.buttonLike)
    buttonNote = findViewById(R.id.buttonNote)
    buttonDownload = findViewById(R.id.buttonDownload)

    buttonPlay.setOnClickListener(this)

    mMovieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java!!)
    mMovieViewModel!!.getMovieDetail(movieId!!).observe(this,
      Observer<Any> { movie ->
        updateViews(movie as Movie)
      })

    mStreamViewModel = ViewModelProviders.of(this).get(StreamViewModel::class.java!!)
    mStreamViewModel!!.getStreamDetail(movieId!!).observe(this,
      Observer<Any> { stream ->
        stream as Stream
        url = stream.data?.streamInfos?.get(0)?.url
      })

  }

  override fun onSupportNavigateUp(): Boolean {
    onBackPressed()
    return true
  }

  private fun updateViews(movie: Movie) {

    textViewTitle.setText(movie.data?.title)
    textViewType.setText(movie.data?.type)
    textViewShortDescription.setText(movie.data?.shortPlot)
    textViewYear.text = String.format(
      resources.getString(R.string.year_duration), movie.data?.year,
      movie.data?.duration
    )
    Glide.with(this).load(movie.data?.images?.snapshot).into(imageViewMovie)
    ratingBar.numStars = movie.data?.rating?.scale!!
    ratingBar.stepSize = 0.1f
    ratingBar.rating = movie.data?.rating?.average

    supportActionBar!!.setTitle(movie.data.title)

    if (movie.data?.type?.equals("movies")!!)
      buttonPlay.isEnabled = true
    else
      buttonPlay.isEnabled = false

  }

  override fun onClick(view: View) {
    when (view.id) {
      R.id.buttonPlay -> playTrailer()
    }
  }

  private fun playTrailer() {
    val playerIntent = Intent(this@MovieDetailActivity, PlayerActivity::class.java)
    playerIntent.putExtra("TRAILER_URL", url)
    startActivity(playerIntent)
  }
}