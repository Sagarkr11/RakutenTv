package jp.co.rakuten.tech.rakutentv.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import jp.co.rakuten.tech.rakutentv.model.category.Category
import jp.co.rakuten.tech.rakutentv.repository.CategoryDetailRepo

open class CategoryDetailViewModel : ViewModel() {

  fun getCategoryDetail(context: Context): LiveData<List<Category>> {
    return CategoryDetailRepo().getCategoryDetail(context)
  }
}