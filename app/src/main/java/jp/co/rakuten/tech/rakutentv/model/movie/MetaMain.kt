package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MetaMain {

  @SerializedName("rights")
  @Expose
  val rights: List<Rights>? = null

  @SerializedName("heartbeats")
  @Expose
  val heartbeats: List<Heartbeats>? = null

  @SerializedName("already_seens")
  @Expose
  val alreadySeens: List<AlreadySeens>? = null

  @SerializedName("wishlists")
  @Expose
  val wishlists: List<Wishlists>? = null

  @SerializedName("likes")
  @Expose
  val likes: List<Likes>? = null

  @SerializedName("warnings")
  @Expose
  val warnings: List<Warnings>? = null

}