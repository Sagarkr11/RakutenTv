package jp.co.rakuten.tech.rakutentv.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import jp.co.rakuten.tech.rakutentv.R
import jp.co.rakuten.tech.rakutentv.model.category.Category
import jp.co.rakuten.tech.rakutentv.network.ApiClient
import jp.co.rakuten.tech.rakutentv.network.NetworkClient
import java.util.ArrayList

open class CategoryDetailRepo {

  private val categoriesRepo = MutableLiveData<List<Category>>()
  private val categoryList = ArrayList<Category>()
  private var context: Context? = null

  fun getCategoryDetail(context: Context): LiveData<List<Category>> {

    this.context = context

    for (i in 0 until context.resources.getStringArray(R.array.categories).size) {
      val categoryName = context.resources.getStringArray(R.array.categories)[i]
      getObservable(categoryName).subscribeWith(getObserver())
    }
    return categoriesRepo
  }

  fun getObservable(categoryName: String): Observable<Category> {

    return NetworkClient.getRetrofit()
      .create(ApiClient::class.java)
      .getCategoryDetail(categoryName)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
  }

  private fun getObserver(): DisposableObserver<Category> {

    return object : DisposableObserver<Category>() {

      override fun onNext(category: Category) {

        categoryList.add(category)

        if (context!!.resources.getStringArray(R.array.categories).size == categoryList
            .size
        ) {
          categoriesRepo.setValue(categoryList)
        }
      }

      override fun onError(e: Throwable) {
      }

      override fun onComplete() {
      }

    }
  }

}