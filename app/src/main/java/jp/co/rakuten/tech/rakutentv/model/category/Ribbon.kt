package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Ribbon {

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

  @SerializedName("color")
  @Expose
  val color: String? = null

  @SerializedName("text_color")
  @Expose
  val textColor: String? = null

  @SerializedName("position")
  @Expose
  val position: String? = null

  @SerializedName("localized_name")
  @Expose
  val localizedName: String? = null

  @SerializedName("image")
  @Expose
  val image: String? = null

}