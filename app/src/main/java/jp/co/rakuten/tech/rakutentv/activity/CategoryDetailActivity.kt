package jp.co.rakuten.tech.rakutentv.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.co.rakuten.tech.rakutentv.R
import jp.co.rakuten.tech.rakutentv.adapter.ArticleAdapter
import jp.co.rakuten.tech.rakutentv.adapter.CategoryDetailAdapter
import jp.co.rakuten.tech.rakutentv.model.category.Category
import jp.co.rakuten.tech.rakutentv.viewmodel.CategoryDetailViewModel

class CategoryDetailActivity : AppCompatActivity(), ArticleAdapter.ArticleItemViewClickListener {

  private var recyclerView: RecyclerView? = null
  private var layoutManager: RecyclerView.LayoutManager? = null

  private var mCategoryDetailViewModel: CategoryDetailViewModel? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_category_detail)

    recyclerView = findViewById(R.id.recyclerViewDetail)

    recyclerView!!.setHasFixedSize(true)
    layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    recyclerView!!.layoutManager = layoutManager

    mCategoryDetailViewModel =
        ViewModelProviders.of(this).get(CategoryDetailViewModel::class.java!!)

    mCategoryDetailViewModel!!.getCategoryDetail(this).observe(this,
      Observer<List<Any>> { categoryList ->
        recyclerView!!.adapter = CategoryDetailAdapter(
          this@CategoryDetailActivity,
          categoryList as List<Category>, this@CategoryDetailActivity
        )
      })
  }

  override fun itemClicked(movieId: String) {
    val movieDetailIntent = Intent(this@CategoryDetailActivity, MovieDetailActivity::class.java)
    movieDetailIntent.putExtra("MOVIE_NAME", movieId)
    startActivity(movieDetailIntent)
  }
}