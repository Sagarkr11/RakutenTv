package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Contents {

  @SerializedName("data")
  @Expose
  val dataList: List<Article>? = null

  @SerializedName("meta")
  @Expose
  val meta: Meta? = null
}