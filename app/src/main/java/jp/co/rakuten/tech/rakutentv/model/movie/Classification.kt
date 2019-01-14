package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Classification {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("numerical_id")
  @Expose
  val numericalId: Int = 0

  @SerializedName("name")
  @Expose
  val name: String? = null

  @SerializedName("age")
  @Expose
  val age: Int = 0

  @SerializedName("adult")
  @Expose
  val adult: Boolean = false

  @SerializedName("description")
  @Expose
  val description: String? = null

  @SerializedName("default")
  @Expose
  val defaultClassification: Boolean = false

}