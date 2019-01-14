package jp.co.rakuten.tech.rakutentv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.co.rakuten.tech.rakutentv.R
import jp.co.rakuten.tech.rakutentv.model.category.Category

class CategoryDetailAdapter(
  private val context: Context, private val categoryList: List<Category>,
  private val listener: ArticleAdapter.ArticleItemViewClickListener
) : RecyclerView.Adapter<CategoryDetailAdapter.CategoryViewHolder>() {

  override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CategoryViewHolder {
    val itemView = LayoutInflater.from(viewGroup.context)
      .inflate(
        R.layout.category_list_item,
        viewGroup, false
      )

    val view = CategoryViewHolder(itemView)

    val layoutManager = LinearLayoutManager(
      viewGroup.context,
      LinearLayoutManager
        .HORIZONTAL, false
    )
    view.categoryListView.layoutManager = layoutManager

    return view
  }

  override fun onBindViewHolder(categoryViewHolder: CategoryViewHolder, i: Int) {
    categoryViewHolder.categoryName.setText(categoryList[i]?.data?.id)
    categoryViewHolder.categoryListView.adapter = ArticleAdapter(
      context, categoryList[i],
      listener
    )
  }

  override fun getItemCount(): Int {
    return categoryList.size
  }

  inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var categoryName: TextView
    var categoryListView: RecyclerView

    init {

      categoryName = itemView.findViewById(R.id.textViewCategory)
      categoryListView = itemView.findViewById(R.id.recyclerViewCategoryList)
    }

  }

}