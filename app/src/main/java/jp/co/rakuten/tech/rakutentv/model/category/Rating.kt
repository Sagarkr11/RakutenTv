package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Rating {

  @SerializedName("average")
  @Expose
  val average: Float = 0.toFloat()

  @SerializedName("scale")
  @Expose
  val scale: Int = 0

}