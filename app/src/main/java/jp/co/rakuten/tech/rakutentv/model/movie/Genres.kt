package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Genres {

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

  @SerializedName("adult")
  @Expose
  val adult: Boolean = false

  @SerializedName("erotic")
  @Expose
  val erotic: Boolean = false

  @SerializedName("additional_images")
  @Expose
  val additionalImages: AdditionalImages? = null

}