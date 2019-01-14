package jp.co.rakuten.tech.rakutentv.model.stream

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("heartbeat")
  @Expose
  val heartbeat: Heartbeat? = null

  @SerializedName("stream_infos")
  @Expose
  val streamInfos: List<StreamInfos>? = null

}