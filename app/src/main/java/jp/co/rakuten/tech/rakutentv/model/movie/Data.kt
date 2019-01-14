package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import jp.co.rakuten.tech.rakutentv.model.category.Images
import jp.co.rakuten.tech.rakutentv.model.category.Rating

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

  @SerializedName("title")
  @Expose
  val title: String? = null

  @SerializedName("original_title")
  @Expose
  val originalTitle: String? = null

  @SerializedName("year")
  @Expose
  val year: Int = 0

  @SerializedName("short_plot")
  @Expose
  val shortPlot: String? = null

  @SerializedName("plot")
  @Expose
  val plot: String? = null

  @SerializedName("duration")
  @Expose
  val duration: Int = 0

  @SerializedName("highlight")
  @Expose
  val highlight: String? = null

  @SerializedName("duration_in_seconds")
  @Expose
  val durationInSeconds: String? = null

  @SerializedName("ultraviolet_enabled")
  @Expose
  val ultravioletEnabled: Boolean = false

  @SerializedName("groups")
  @Expose
  val groups: List<Groups>? = null

  /*@SerializedName("actors")
  @Expose
  List<Actors> actors;

  @SerializedName("awards")
  @Expose
  List<Awards> awards;

  @SerializedName("classification")
  @Expose
  Classification classification;

  @SerializedName("countries")
  @Expose
  List<Countries> countries;

  @SerializedName("deep_links")
  @Expose
  Deeplinks deepLinks;

  @SerializedName("extras")
  @Expose
  List<Extras> extras;

  @SerializedName("directors")
  @Expose
  List<Directors> directors;

  @SerializedName("genres")
  @Expose
  List<Genres> genres;*/

  @SerializedName("images")
  @Expose
  val images: Images? = null

  /*@SerializedName("offline_enabled_for_est")
  @Expose
  boolean offlineEnabledForEst;

  @SerializedName("offline_enabled_for_rent")
  @Expose
  boolean offlineEnabledForRent;

  @SerializedName("offline_enabled_for_svod")
  @Expose
  boolean offlineEnabledForSvod;

  @SerializedName("order_options")
  @Expose
  OrderOptions orderOptions;*/

  @SerializedName("rating")
  @Expose
  val rating: Rating? = null

  /*@SerializedName("critic_reviews")
  @Expose
  CriticReviews criticReviews;

  @SerializedName("user_reviews")
  @Expose
  UserReviews userReviews;

  @SerializedName("scores")
  @Expose
  List<Scores> scores;

  @SerializedName("subscription_plans")
  @Expose
  List<SubscriptionPlans> subscriptionPlans;

  @SerializedName("svod_schedules")
  @Expose
  List<SvodSchedules> svodSchedules;

  @SerializedName("tags")
  @Expose
  List<Tags> tags;

  @SerializedName("view_options")
  @Expose
  ViewOptions viewOptions;

  @SerializedName("additional_images")
  @Expose
  AdditionalImages additionalImages;*/

}