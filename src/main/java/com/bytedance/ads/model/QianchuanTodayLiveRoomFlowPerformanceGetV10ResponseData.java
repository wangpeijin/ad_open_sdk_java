/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private Long activity = null;

  public static final String SERIALIZED_NAME_DOUYIN_SHOPPING_CENTER = "douyin_shopping_center";
  @SerializedName(SERIALIZED_NAME_DOUYIN_SHOPPING_CENTER)
  private Long douyinShoppingCenter = null;

  public static final String SERIALIZED_NAME_ECOM_AD_THIRD_QC_BRAND = "ecom_ad_third_qc_brand";
  @SerializedName(SERIALIZED_NAME_ECOM_AD_THIRD_QC_BRAND)
  private Long ecomAdThirdQcBrand = null;

  public static final String SERIALIZED_NAME_ECOM_AD_THIRD_QC_BRAND_OTHER_BIDDING = "ecom_ad_third_qc_brand_other_bidding";
  @SerializedName(SERIALIZED_NAME_ECOM_AD_THIRD_QC_BRAND_OTHER_BIDDING)
  private Long ecomAdThirdQcBrandOtherBidding = null;

  public static final String SERIALIZED_NAME_ECOM_AD_THIRD_QC_OTHER_BRAND = "ecom_ad_third_qc_other_brand";
  @SerializedName(SERIALIZED_NAME_ECOM_AD_THIRD_QC_OTHER_BRAND)
  private Long ecomAdThirdQcOtherBrand = null;

  public static final String SERIALIZED_NAME_ECOM_OTHER = "ecom_other";
  @SerializedName(SERIALIZED_NAME_ECOM_OTHER)
  private Long ecomOther = null;

  public static final String SERIALIZED_NAME_GENERAL_SEARCH = "general_search";
  @SerializedName(SERIALIZED_NAME_GENERAL_SEARCH)
  private Long generalSearch = null;

  public static final String SERIALIZED_NAME_HOMEPAGE_FOLLOW = "homepage_follow";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE_FOLLOW)
  private Long homepageFollow = null;

  public static final String SERIALIZED_NAME_HOMEPAGE_FRESH = "homepage_fresh";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE_FRESH)
  private Long homepageFresh = null;

  public static final String SERIALIZED_NAME_HOMEPAGE_HOT = "homepage_hot";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE_HOT)
  private Long homepageHot = null;

  public static final String SERIALIZED_NAME_LIVE_MERGE = "live_merge";
  @SerializedName(SERIALIZED_NAME_LIVE_MERGE)
  private Long liveMerge = null;

  public static final String SERIALIZED_NAME_LIVE_PC_QIAN_CHUAN = "live_pc_qian_chuan";
  @SerializedName(SERIALIZED_NAME_LIVE_PC_QIAN_CHUAN)
  private Long livePcQianChuan = null;

  public static final String SERIALIZED_NAME_LIVE_XIAO_DIAN_QIAN_CHUAN = "live_xiao_dian_qian_chuan";
  @SerializedName(SERIALIZED_NAME_LIVE_XIAO_DIAN_QIAN_CHUAN)
  private Long liveXiaoDianQianChuan = null;

  public static final String SERIALIZED_NAME_OTHER_RECOMMEND_LIVE = "other_recommend_live";
  @SerializedName(SERIALIZED_NAME_OTHER_RECOMMEND_LIVE)
  private Long otherRecommendLive = null;

  public static final String SERIALIZED_NAME_OTHERS_HOMEPAGE = "others_homepage";
  @SerializedName(SERIALIZED_NAME_OTHERS_HOMEPAGE)
  private Long othersHomepage = null;

  public static final String SERIALIZED_NAME_TOUXI_SAAS = "touxi_saas";
  @SerializedName(SERIALIZED_NAME_TOUXI_SAAS)
  private Long touxiSaas = null;

  public static final String SERIALIZED_NAME_VIDEO_TO_LIVE = "video_to_live";
  @SerializedName(SERIALIZED_NAME_VIDEO_TO_LIVE)
  private Long videoToLive = null;

  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData() {
  }

  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData activity(Long activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * 
   * @return activity
  **/
  @javax.annotation.Nullable
  public Long getActivity() {
    return activity;
  }


  public void setActivity(Long activity) {
    this.activity = activity;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData douyinShoppingCenter(Long douyinShoppingCenter) {
    
    this.douyinShoppingCenter = douyinShoppingCenter;
    return this;
  }

   /**
   * 
   * @return douyinShoppingCenter
  **/
  @javax.annotation.Nullable
  public Long getDouyinShoppingCenter() {
    return douyinShoppingCenter;
  }


  public void setDouyinShoppingCenter(Long douyinShoppingCenter) {
    this.douyinShoppingCenter = douyinShoppingCenter;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData ecomAdThirdQcBrand(Long ecomAdThirdQcBrand) {
    
    this.ecomAdThirdQcBrand = ecomAdThirdQcBrand;
    return this;
  }

   /**
   * 
   * @return ecomAdThirdQcBrand
  **/
  @javax.annotation.Nullable
  public Long getEcomAdThirdQcBrand() {
    return ecomAdThirdQcBrand;
  }


  public void setEcomAdThirdQcBrand(Long ecomAdThirdQcBrand) {
    this.ecomAdThirdQcBrand = ecomAdThirdQcBrand;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData ecomAdThirdQcBrandOtherBidding(Long ecomAdThirdQcBrandOtherBidding) {
    
    this.ecomAdThirdQcBrandOtherBidding = ecomAdThirdQcBrandOtherBidding;
    return this;
  }

   /**
   * 
   * @return ecomAdThirdQcBrandOtherBidding
  **/
  @javax.annotation.Nullable
  public Long getEcomAdThirdQcBrandOtherBidding() {
    return ecomAdThirdQcBrandOtherBidding;
  }


  public void setEcomAdThirdQcBrandOtherBidding(Long ecomAdThirdQcBrandOtherBidding) {
    this.ecomAdThirdQcBrandOtherBidding = ecomAdThirdQcBrandOtherBidding;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData ecomAdThirdQcOtherBrand(Long ecomAdThirdQcOtherBrand) {
    
    this.ecomAdThirdQcOtherBrand = ecomAdThirdQcOtherBrand;
    return this;
  }

   /**
   * 
   * @return ecomAdThirdQcOtherBrand
  **/
  @javax.annotation.Nullable
  public Long getEcomAdThirdQcOtherBrand() {
    return ecomAdThirdQcOtherBrand;
  }


  public void setEcomAdThirdQcOtherBrand(Long ecomAdThirdQcOtherBrand) {
    this.ecomAdThirdQcOtherBrand = ecomAdThirdQcOtherBrand;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData ecomOther(Long ecomOther) {
    
    this.ecomOther = ecomOther;
    return this;
  }

   /**
   * 
   * @return ecomOther
  **/
  @javax.annotation.Nullable
  public Long getEcomOther() {
    return ecomOther;
  }


  public void setEcomOther(Long ecomOther) {
    this.ecomOther = ecomOther;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData generalSearch(Long generalSearch) {
    
    this.generalSearch = generalSearch;
    return this;
  }

   /**
   * 
   * @return generalSearch
  **/
  @javax.annotation.Nullable
  public Long getGeneralSearch() {
    return generalSearch;
  }


  public void setGeneralSearch(Long generalSearch) {
    this.generalSearch = generalSearch;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData homepageFollow(Long homepageFollow) {
    
    this.homepageFollow = homepageFollow;
    return this;
  }

   /**
   * 
   * @return homepageFollow
  **/
  @javax.annotation.Nullable
  public Long getHomepageFollow() {
    return homepageFollow;
  }


  public void setHomepageFollow(Long homepageFollow) {
    this.homepageFollow = homepageFollow;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData homepageFresh(Long homepageFresh) {
    
    this.homepageFresh = homepageFresh;
    return this;
  }

   /**
   * 
   * @return homepageFresh
  **/
  @javax.annotation.Nullable
  public Long getHomepageFresh() {
    return homepageFresh;
  }


  public void setHomepageFresh(Long homepageFresh) {
    this.homepageFresh = homepageFresh;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData homepageHot(Long homepageHot) {
    
    this.homepageHot = homepageHot;
    return this;
  }

   /**
   * 
   * @return homepageHot
  **/
  @javax.annotation.Nullable
  public Long getHomepageHot() {
    return homepageHot;
  }


  public void setHomepageHot(Long homepageHot) {
    this.homepageHot = homepageHot;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData liveMerge(Long liveMerge) {
    
    this.liveMerge = liveMerge;
    return this;
  }

   /**
   * 
   * @return liveMerge
  **/
  @javax.annotation.Nullable
  public Long getLiveMerge() {
    return liveMerge;
  }


  public void setLiveMerge(Long liveMerge) {
    this.liveMerge = liveMerge;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData livePcQianChuan(Long livePcQianChuan) {
    
    this.livePcQianChuan = livePcQianChuan;
    return this;
  }

   /**
   * 
   * @return livePcQianChuan
  **/
  @javax.annotation.Nullable
  public Long getLivePcQianChuan() {
    return livePcQianChuan;
  }


  public void setLivePcQianChuan(Long livePcQianChuan) {
    this.livePcQianChuan = livePcQianChuan;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData liveXiaoDianQianChuan(Long liveXiaoDianQianChuan) {
    
    this.liveXiaoDianQianChuan = liveXiaoDianQianChuan;
    return this;
  }

   /**
   * 
   * @return liveXiaoDianQianChuan
  **/
  @javax.annotation.Nullable
  public Long getLiveXiaoDianQianChuan() {
    return liveXiaoDianQianChuan;
  }


  public void setLiveXiaoDianQianChuan(Long liveXiaoDianQianChuan) {
    this.liveXiaoDianQianChuan = liveXiaoDianQianChuan;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData otherRecommendLive(Long otherRecommendLive) {
    
    this.otherRecommendLive = otherRecommendLive;
    return this;
  }

   /**
   * 
   * @return otherRecommendLive
  **/
  @javax.annotation.Nullable
  public Long getOtherRecommendLive() {
    return otherRecommendLive;
  }


  public void setOtherRecommendLive(Long otherRecommendLive) {
    this.otherRecommendLive = otherRecommendLive;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData othersHomepage(Long othersHomepage) {
    
    this.othersHomepage = othersHomepage;
    return this;
  }

   /**
   * 
   * @return othersHomepage
  **/
  @javax.annotation.Nullable
  public Long getOthersHomepage() {
    return othersHomepage;
  }


  public void setOthersHomepage(Long othersHomepage) {
    this.othersHomepage = othersHomepage;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData touxiSaas(Long touxiSaas) {
    
    this.touxiSaas = touxiSaas;
    return this;
  }

   /**
   * 
   * @return touxiSaas
  **/
  @javax.annotation.Nullable
  public Long getTouxiSaas() {
    return touxiSaas;
  }


  public void setTouxiSaas(Long touxiSaas) {
    this.touxiSaas = touxiSaas;
  }


  public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData videoToLive(Long videoToLive) {
    
    this.videoToLive = videoToLive;
    return this;
  }

   /**
   * 
   * @return videoToLive
  **/
  @javax.annotation.Nullable
  public Long getVideoToLive() {
    return videoToLive;
  }


  public void setVideoToLive(Long videoToLive) {
    this.videoToLive = videoToLive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData = (QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData) o;
    return Objects.equals(this.activity, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.activity) &&
        Objects.equals(this.douyinShoppingCenter, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.douyinShoppingCenter) &&
        Objects.equals(this.ecomAdThirdQcBrand, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.ecomAdThirdQcBrand) &&
        Objects.equals(this.ecomAdThirdQcBrandOtherBidding, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.ecomAdThirdQcBrandOtherBidding) &&
        Objects.equals(this.ecomAdThirdQcOtherBrand, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.ecomAdThirdQcOtherBrand) &&
        Objects.equals(this.ecomOther, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.ecomOther) &&
        Objects.equals(this.generalSearch, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.generalSearch) &&
        Objects.equals(this.homepageFollow, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.homepageFollow) &&
        Objects.equals(this.homepageFresh, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.homepageFresh) &&
        Objects.equals(this.homepageHot, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.homepageHot) &&
        Objects.equals(this.liveMerge, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.liveMerge) &&
        Objects.equals(this.livePcQianChuan, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.livePcQianChuan) &&
        Objects.equals(this.liveXiaoDianQianChuan, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.liveXiaoDianQianChuan) &&
        Objects.equals(this.otherRecommendLive, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.otherRecommendLive) &&
        Objects.equals(this.othersHomepage, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.othersHomepage) &&
        Objects.equals(this.touxiSaas, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.touxiSaas) &&
        Objects.equals(this.videoToLive, qianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.videoToLive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, douyinShoppingCenter, ecomAdThirdQcBrand, ecomAdThirdQcBrandOtherBidding, ecomAdThirdQcOtherBrand, ecomOther, generalSearch, homepageFollow, homepageFresh, homepageHot, liveMerge, livePcQianChuan, liveXiaoDianQianChuan, otherRecommendLive, othersHomepage, touxiSaas, videoToLive);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    douyinShoppingCenter: ").append(toIndentedString(douyinShoppingCenter)).append("\n");
    sb.append("    ecomAdThirdQcBrand: ").append(toIndentedString(ecomAdThirdQcBrand)).append("\n");
    sb.append("    ecomAdThirdQcBrandOtherBidding: ").append(toIndentedString(ecomAdThirdQcBrandOtherBidding)).append("\n");
    sb.append("    ecomAdThirdQcOtherBrand: ").append(toIndentedString(ecomAdThirdQcOtherBrand)).append("\n");
    sb.append("    ecomOther: ").append(toIndentedString(ecomOther)).append("\n");
    sb.append("    generalSearch: ").append(toIndentedString(generalSearch)).append("\n");
    sb.append("    homepageFollow: ").append(toIndentedString(homepageFollow)).append("\n");
    sb.append("    homepageFresh: ").append(toIndentedString(homepageFresh)).append("\n");
    sb.append("    homepageHot: ").append(toIndentedString(homepageHot)).append("\n");
    sb.append("    liveMerge: ").append(toIndentedString(liveMerge)).append("\n");
    sb.append("    livePcQianChuan: ").append(toIndentedString(livePcQianChuan)).append("\n");
    sb.append("    liveXiaoDianQianChuan: ").append(toIndentedString(liveXiaoDianQianChuan)).append("\n");
    sb.append("    otherRecommendLive: ").append(toIndentedString(otherRecommendLive)).append("\n");
    sb.append("    othersHomepage: ").append(toIndentedString(othersHomepage)).append("\n");
    sb.append("    touxiSaas: ").append(toIndentedString(touxiSaas)).append("\n");
    sb.append("    videoToLive: ").append(toIndentedString(videoToLive)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("activity");
    openapiFields.add("douyin_shopping_center");
    openapiFields.add("ecom_ad_third_qc_brand");
    openapiFields.add("ecom_ad_third_qc_brand_other_bidding");
    openapiFields.add("ecom_ad_third_qc_other_brand");
    openapiFields.add("ecom_other");
    openapiFields.add("general_search");
    openapiFields.add("homepage_follow");
    openapiFields.add("homepage_fresh");
    openapiFields.add("homepage_hot");
    openapiFields.add("live_merge");
    openapiFields.add("live_pc_qian_chuan");
    openapiFields.add("live_xiao_dian_qian_chuan");
    openapiFields.add("other_recommend_live");
    openapiFields.add("others_homepage");
    openapiFields.add("touxi_saas");
    openapiFields.add("video_to_live");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData
  */
  public static QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomFlowPerformanceGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

