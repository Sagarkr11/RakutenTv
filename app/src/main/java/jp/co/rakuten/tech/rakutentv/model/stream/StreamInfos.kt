package jp.co.rakuten.tech.rakutentv.model.stream

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class StreamInfos {

  @SerializedName("player")
  @Expose
  val player: String? = null

  @SerializedName("display_aspect_ratio")
  @Expose
  val displayAspectRatio: String? = null

  @SerializedName("cdn")
  @Expose
  val cdn: String? = null

  @SerializedName("url")
  @Expose
  val url: String? = null

  @SerializedName("wrid")
  @Expose
  val wrid: String? = null

  @SerializedName("video_quality")
  @Expose
  val videoQuality: String? = null

}