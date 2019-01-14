package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Article {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("numerical_id")
  @Expose
  val numericalId: Int = 0

  @SerializedName("title")
  @Expose
  val title: String? = null

  @SerializedName("label")
  @Expose
  val label: String? = null

  @SerializedName("rating")
  @Expose
  val rating: Rating? = null

  @SerializedName("highlighted_score")
  @Expose
  val highlightedScore: HighlightedScore? = null

  @SerializedName("images")
  @Expose
  val images: Images? = null
}