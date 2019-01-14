package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HighlightedScore {

  @SerializedName("score")
  @Expose
  val score: Double = 0.toDouble()

  @SerializedName("amount_of_votes")
  @Expose
  val amountOfVotes: Int = 0

  @SerializedName("formatted_amount_of_votes")
  @Expose
  val formattedAmountOfVotes: String? = null

}