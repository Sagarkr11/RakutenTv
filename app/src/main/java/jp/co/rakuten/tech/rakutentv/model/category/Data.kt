package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("numerical_id")
  @Expose
  val numericalId: Int = 0

  @SerializedName("category")
  @Expose
  val category: String? = null

  @SerializedName("short_name")
  @Expose
  val shortName: String? = null

  @SerializedName("content_type")
  @Expose
  val contentType: String? = null

  @SerializedName("is_b2b")
  @Expose
  val isB2b: Boolean = false

  @SerializedName("wktv_code")
  @Expose
  val wktvCode: String? = null

  @SerializedName("only_coupon")
  @Expose
  val onlyCoupon: Boolean = false

  @SerializedName("is_recommendation")
  @Expose
  val isRecommendation: Boolean = false

  @SerializedName("name")
  @Expose
  val name: String? = null

  @SerializedName("additional_images")
  @Expose
  val additionalImages: AdditionalImages? = null

  @SerializedName("contents")
  @Expose
  val contents: Contents? = null
}