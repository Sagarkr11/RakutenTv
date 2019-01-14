package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Pagination {

  @SerializedName("page")
  @Expose
  val page: Int = 0

  @SerializedName("count")
  @Expose
  val count: Int = 0

  @SerializedName("per_page")
  @Expose
  val perPage: Int = 0

  @SerializedName("offset")
  @Expose
  val offset: Int = 0

  @SerializedName("total_pages")
  @Expose
  val totalPages: Int = 0

}