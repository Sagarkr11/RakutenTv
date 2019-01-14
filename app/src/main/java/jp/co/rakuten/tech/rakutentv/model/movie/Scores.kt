package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Scores {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("numerical_id")
  @Expose
  val numericalId: Int = 0

  @SerializedName("href")
  @Expose
  val href: String? = null

  @SerializedName("amount_of_votes")
  @Expose
  val amountOfVotes: Int = 0

  @SerializedName("formatted_amount_of_votes")
  @Expose
  val formattedAmountOfVotes: String? = null

  @SerializedName("score")
  @Expose
  val score: Float = 0.toFloat()

  @SerializedName("highlighted")
  @Expose
  val highlighted: Boolean = false

  @SerializedName("site")
  @Expose
  val site: Site? = null

}