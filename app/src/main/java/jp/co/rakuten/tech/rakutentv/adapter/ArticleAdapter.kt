package jp.co.rakuten.tech.rakutentv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jp.co.rakuten.tech.rakutentv.R
import jp.co.rakuten.tech.rakutentv.model.category.Article
import jp.co.rakuten.tech.rakutentv.model.category.Category

class ArticleAdapter(
  private val context: Context,
  category: Category,
  private val listener: ArticleItemViewClickListener
) :
  RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
  private val articleList: List<Article>

  init {
    this.articleList = category?.data?.contents?.dataList!!
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
    val itemView = LayoutInflater.from(parent.context)
      .inflate(
        R.layout.article_card_item,
        parent, false
      )

    return ArticleViewHolder(itemView)
  }

  override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
    holder.articleName.setText(articleList[position]?.title)
    Glide.with(context)
      .load(articleList[position]?.images?.artwork).into(
        holder
          .articleImage
      )
  }

  override fun getItemCount(): Int {
    return articleList.size
  }

  inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener {

    var articleName: TextView
    var articleImage: ImageView

    init {

      articleName = itemView.findViewById(R.id.textViewArticle)
      articleImage = itemView.findViewById(R.id.imageViewArticle)

      itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
      listener.itemClicked(articleList[adapterPosition]?.id!!)
    }
  }

  interface ArticleItemViewClickListener {
    fun itemClicked(movieId: String)
  }
}