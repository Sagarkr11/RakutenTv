package jp.co.rakuten.tech.rakutentv.model.stream

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class StreamRequest {

  @SerializedName("content_id")
  @Expose
  val contentId: String? = null

  @SerializedName("content_type")
  @Expose
  val contentType: String? = null

  @SerializedName("device_serial")
  @Expose
  val deviceSerial: String? = null

  @SerializedName("device_stream_video_quality")
  @Expose
  val deviceStreamVideoQuality: String? = null

  @SerializedName("player")
  @Expose
  val player: String? = null

  @SerializedName("subtitle_language")
  @Expose
  val subtitleLanguage: String? = null

  @SerializedName("video_type")
  @Expose
  val videoType: String? = null

  @SerializedName("audio_quality")
  @Expose
  val audioQuality: String? = null

  @SerializedName("audio_language")
  @Expose
  val audioLanguage: String? = null

}