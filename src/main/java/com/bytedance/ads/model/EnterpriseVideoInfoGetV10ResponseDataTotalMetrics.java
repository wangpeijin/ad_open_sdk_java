/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class EnterpriseVideoInfoGetV10ResponseDataTotalMetrics {
  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CHAT_BY_SHARE_VIDEO_CNT = "business_page_chat_by_share_video_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CHAT_BY_SHARE_VIDEO_CNT)
  private String businessPageChatByShareVideoCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_CART_COUNT = "business_page_click_cart_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_CART_COUNT)
  private String businessPageClickCartCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT = "business_page_click_product";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT)
  private String businessPageClickProduct = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT_GO_BUY = "business_page_click_product_go_buy";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT_GO_BUY)
  private String businessPageClickProductGoBuy = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_COMMENT = "business_page_comment";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_COMMENT)
  private String businessPageComment = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DISFOLLOW_UCOUNT = "business_page_disfollow_ucount";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DISFOLLOW_UCOUNT)
  private String businessPageDisfollowUcount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DISLIKE_CNT = "business_page_dislike_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DISLIKE_CNT)
  private String businessPageDislikeCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DP_DOWN_CLICK_CNT = "business_page_dp_down_click_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DP_DOWN_CLICK_CNT)
  private String businessPageDpDownClickCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FANS_NUM_ALL = "business_page_fans_num_all";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FANS_NUM_ALL)
  private String businessPageFansNumAll = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FAVOURITE_VIDEO_CNT = "business_page_favourite_video_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FAVOURITE_VIDEO_CNT)
  private String businessPageFavouriteVideoCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FW_VIDEO_VV = "business_page_fw_video_vv";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FW_VIDEO_VV)
  private String businessPageFwVideoVv = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED = "business_page_home_visited";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED)
  private String businessPageHomeVisited = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED_UCOUNT = "business_page_home_visited_ucount";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED_UCOUNT)
  private String businessPageHomeVisitedUcount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_LIKE = "business_page_like";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_LIKE)
  private String businessPageLike = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_NEW_FANS_NUM = "business_page_new_fans_num";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_NEW_FANS_NUM)
  private String businessPageNewFansNum = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_ORDER_COUNT = "business_page_order_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_ORDER_COUNT)
  private String businessPageOrderCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_COUNT = "business_page_pay_order_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_COUNT)
  private String businessPagePayOrderCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_GMV = "business_page_pay_order_gmv";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_GMV)
  private String businessPagePayOrderGmv = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PLAY_OVER = "business_page_play_over";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PLAY_OVER)
  private String businessPagePlayOver = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_SHARE = "business_page_share";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_SHARE)
  private String businessPageShare = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_TOTAL_PLAY = "business_page_total_play";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_TOTAL_PLAY)
  private String businessPageTotalPlay = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_START_TIME_DAY = "start_time_day";
  @SerializedName(SERIALIZED_NAME_START_TIME_DAY)
  private String startTimeDay = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics() {
  }

  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageChatByShareVideoCnt(String businessPageChatByShareVideoCnt) {
    
    this.businessPageChatByShareVideoCnt = businessPageChatByShareVideoCnt;
    return this;
  }

   /**
   * 
   * @return businessPageChatByShareVideoCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageChatByShareVideoCnt() {
    return businessPageChatByShareVideoCnt;
  }


  public void setBusinessPageChatByShareVideoCnt(String businessPageChatByShareVideoCnt) {
    this.businessPageChatByShareVideoCnt = businessPageChatByShareVideoCnt;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageClickCartCount(String businessPageClickCartCount) {
    
    this.businessPageClickCartCount = businessPageClickCartCount;
    return this;
  }

   /**
   * 
   * @return businessPageClickCartCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickCartCount() {
    return businessPageClickCartCount;
  }


  public void setBusinessPageClickCartCount(String businessPageClickCartCount) {
    this.businessPageClickCartCount = businessPageClickCartCount;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageClickProduct(String businessPageClickProduct) {
    
    this.businessPageClickProduct = businessPageClickProduct;
    return this;
  }

   /**
   * 
   * @return businessPageClickProduct
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickProduct() {
    return businessPageClickProduct;
  }


  public void setBusinessPageClickProduct(String businessPageClickProduct) {
    this.businessPageClickProduct = businessPageClickProduct;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageClickProductGoBuy(String businessPageClickProductGoBuy) {
    
    this.businessPageClickProductGoBuy = businessPageClickProductGoBuy;
    return this;
  }

   /**
   * 
   * @return businessPageClickProductGoBuy
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickProductGoBuy() {
    return businessPageClickProductGoBuy;
  }


  public void setBusinessPageClickProductGoBuy(String businessPageClickProductGoBuy) {
    this.businessPageClickProductGoBuy = businessPageClickProductGoBuy;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageComment(String businessPageComment) {
    
    this.businessPageComment = businessPageComment;
    return this;
  }

   /**
   * 
   * @return businessPageComment
  **/
  @javax.annotation.Nullable
  public String getBusinessPageComment() {
    return businessPageComment;
  }


  public void setBusinessPageComment(String businessPageComment) {
    this.businessPageComment = businessPageComment;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageDisfollowUcount(String businessPageDisfollowUcount) {
    
    this.businessPageDisfollowUcount = businessPageDisfollowUcount;
    return this;
  }

   /**
   * 
   * @return businessPageDisfollowUcount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDisfollowUcount() {
    return businessPageDisfollowUcount;
  }


  public void setBusinessPageDisfollowUcount(String businessPageDisfollowUcount) {
    this.businessPageDisfollowUcount = businessPageDisfollowUcount;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageDislikeCnt(String businessPageDislikeCnt) {
    
    this.businessPageDislikeCnt = businessPageDislikeCnt;
    return this;
  }

   /**
   * 
   * @return businessPageDislikeCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDislikeCnt() {
    return businessPageDislikeCnt;
  }


  public void setBusinessPageDislikeCnt(String businessPageDislikeCnt) {
    this.businessPageDislikeCnt = businessPageDislikeCnt;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageDpDownClickCnt(String businessPageDpDownClickCnt) {
    
    this.businessPageDpDownClickCnt = businessPageDpDownClickCnt;
    return this;
  }

   /**
   * 
   * @return businessPageDpDownClickCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDpDownClickCnt() {
    return businessPageDpDownClickCnt;
  }


  public void setBusinessPageDpDownClickCnt(String businessPageDpDownClickCnt) {
    this.businessPageDpDownClickCnt = businessPageDpDownClickCnt;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageFansNumAll(String businessPageFansNumAll) {
    
    this.businessPageFansNumAll = businessPageFansNumAll;
    return this;
  }

   /**
   * 
   * @return businessPageFansNumAll
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFansNumAll() {
    return businessPageFansNumAll;
  }


  public void setBusinessPageFansNumAll(String businessPageFansNumAll) {
    this.businessPageFansNumAll = businessPageFansNumAll;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageFavouriteVideoCnt(String businessPageFavouriteVideoCnt) {
    
    this.businessPageFavouriteVideoCnt = businessPageFavouriteVideoCnt;
    return this;
  }

   /**
   * 
   * @return businessPageFavouriteVideoCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFavouriteVideoCnt() {
    return businessPageFavouriteVideoCnt;
  }


  public void setBusinessPageFavouriteVideoCnt(String businessPageFavouriteVideoCnt) {
    this.businessPageFavouriteVideoCnt = businessPageFavouriteVideoCnt;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageFwVideoVv(String businessPageFwVideoVv) {
    
    this.businessPageFwVideoVv = businessPageFwVideoVv;
    return this;
  }

   /**
   * 
   * @return businessPageFwVideoVv
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFwVideoVv() {
    return businessPageFwVideoVv;
  }


  public void setBusinessPageFwVideoVv(String businessPageFwVideoVv) {
    this.businessPageFwVideoVv = businessPageFwVideoVv;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageHomeVisited(String businessPageHomeVisited) {
    
    this.businessPageHomeVisited = businessPageHomeVisited;
    return this;
  }

   /**
   * 
   * @return businessPageHomeVisited
  **/
  @javax.annotation.Nullable
  public String getBusinessPageHomeVisited() {
    return businessPageHomeVisited;
  }


  public void setBusinessPageHomeVisited(String businessPageHomeVisited) {
    this.businessPageHomeVisited = businessPageHomeVisited;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageHomeVisitedUcount(String businessPageHomeVisitedUcount) {
    
    this.businessPageHomeVisitedUcount = businessPageHomeVisitedUcount;
    return this;
  }

   /**
   * 
   * @return businessPageHomeVisitedUcount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageHomeVisitedUcount() {
    return businessPageHomeVisitedUcount;
  }


  public void setBusinessPageHomeVisitedUcount(String businessPageHomeVisitedUcount) {
    this.businessPageHomeVisitedUcount = businessPageHomeVisitedUcount;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageLike(String businessPageLike) {
    
    this.businessPageLike = businessPageLike;
    return this;
  }

   /**
   * 
   * @return businessPageLike
  **/
  @javax.annotation.Nullable
  public String getBusinessPageLike() {
    return businessPageLike;
  }


  public void setBusinessPageLike(String businessPageLike) {
    this.businessPageLike = businessPageLike;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageNewFansNum(String businessPageNewFansNum) {
    
    this.businessPageNewFansNum = businessPageNewFansNum;
    return this;
  }

   /**
   * 
   * @return businessPageNewFansNum
  **/
  @javax.annotation.Nullable
  public String getBusinessPageNewFansNum() {
    return businessPageNewFansNum;
  }


  public void setBusinessPageNewFansNum(String businessPageNewFansNum) {
    this.businessPageNewFansNum = businessPageNewFansNum;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageOrderCount(String businessPageOrderCount) {
    
    this.businessPageOrderCount = businessPageOrderCount;
    return this;
  }

   /**
   * 
   * @return businessPageOrderCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageOrderCount() {
    return businessPageOrderCount;
  }


  public void setBusinessPageOrderCount(String businessPageOrderCount) {
    this.businessPageOrderCount = businessPageOrderCount;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPagePayOrderCount(String businessPagePayOrderCount) {
    
    this.businessPagePayOrderCount = businessPagePayOrderCount;
    return this;
  }

   /**
   * 
   * @return businessPagePayOrderCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePayOrderCount() {
    return businessPagePayOrderCount;
  }


  public void setBusinessPagePayOrderCount(String businessPagePayOrderCount) {
    this.businessPagePayOrderCount = businessPagePayOrderCount;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPagePayOrderGmv(String businessPagePayOrderGmv) {
    
    this.businessPagePayOrderGmv = businessPagePayOrderGmv;
    return this;
  }

   /**
   * 
   * @return businessPagePayOrderGmv
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePayOrderGmv() {
    return businessPagePayOrderGmv;
  }


  public void setBusinessPagePayOrderGmv(String businessPagePayOrderGmv) {
    this.businessPagePayOrderGmv = businessPagePayOrderGmv;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPagePlayOver(String businessPagePlayOver) {
    
    this.businessPagePlayOver = businessPagePlayOver;
    return this;
  }

   /**
   * 
   * @return businessPagePlayOver
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePlayOver() {
    return businessPagePlayOver;
  }


  public void setBusinessPagePlayOver(String businessPagePlayOver) {
    this.businessPagePlayOver = businessPagePlayOver;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageShare(String businessPageShare) {
    
    this.businessPageShare = businessPageShare;
    return this;
  }

   /**
   * 
   * @return businessPageShare
  **/
  @javax.annotation.Nullable
  public String getBusinessPageShare() {
    return businessPageShare;
  }


  public void setBusinessPageShare(String businessPageShare) {
    this.businessPageShare = businessPageShare;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics businessPageTotalPlay(String businessPageTotalPlay) {
    
    this.businessPageTotalPlay = businessPageTotalPlay;
    return this;
  }

   /**
   * 
   * @return businessPageTotalPlay
  **/
  @javax.annotation.Nullable
  public String getBusinessPageTotalPlay() {
    return businessPageTotalPlay;
  }


  public void setBusinessPageTotalPlay(String businessPageTotalPlay) {
    this.businessPageTotalPlay = businessPageTotalPlay;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics startTimeDay(String startTimeDay) {
    
    this.startTimeDay = startTimeDay;
    return this;
  }

   /**
   * 
   * @return startTimeDay
  **/
  @javax.annotation.Nullable
  public String getStartTimeDay() {
    return startTimeDay;
  }


  public void setStartTimeDay(String startTimeDay) {
    this.startTimeDay = startTimeDay;
  }


  public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseVideoInfoGetV10ResponseDataTotalMetrics enterpriseVideoInfoGetV10ResponseDataTotalMetrics = (EnterpriseVideoInfoGetV10ResponseDataTotalMetrics) o;
    return Objects.equals(this.businessPageChatByShareVideoCnt, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageChatByShareVideoCnt) &&
        Objects.equals(this.businessPageClickCartCount, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageClickCartCount) &&
        Objects.equals(this.businessPageClickProduct, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageClickProduct) &&
        Objects.equals(this.businessPageClickProductGoBuy, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageClickProductGoBuy) &&
        Objects.equals(this.businessPageComment, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageComment) &&
        Objects.equals(this.businessPageDisfollowUcount, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageDisfollowUcount) &&
        Objects.equals(this.businessPageDislikeCnt, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageDislikeCnt) &&
        Objects.equals(this.businessPageDpDownClickCnt, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageDpDownClickCnt) &&
        Objects.equals(this.businessPageFansNumAll, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageFansNumAll) &&
        Objects.equals(this.businessPageFavouriteVideoCnt, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageFavouriteVideoCnt) &&
        Objects.equals(this.businessPageFwVideoVv, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageFwVideoVv) &&
        Objects.equals(this.businessPageHomeVisited, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageHomeVisited) &&
        Objects.equals(this.businessPageHomeVisitedUcount, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageHomeVisitedUcount) &&
        Objects.equals(this.businessPageLike, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageLike) &&
        Objects.equals(this.businessPageNewFansNum, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageNewFansNum) &&
        Objects.equals(this.businessPageOrderCount, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageOrderCount) &&
        Objects.equals(this.businessPagePayOrderCount, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPagePayOrderCount) &&
        Objects.equals(this.businessPagePayOrderGmv, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPagePayOrderGmv) &&
        Objects.equals(this.businessPagePlayOver, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPagePlayOver) &&
        Objects.equals(this.businessPageShare, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageShare) &&
        Objects.equals(this.businessPageTotalPlay, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.businessPageTotalPlay) &&
        Objects.equals(this.itemId, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.itemId) &&
        Objects.equals(this.startTimeDay, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.startTimeDay) &&
        Objects.equals(this.videoId, enterpriseVideoInfoGetV10ResponseDataTotalMetrics.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessPageChatByShareVideoCnt, businessPageClickCartCount, businessPageClickProduct, businessPageClickProductGoBuy, businessPageComment, businessPageDisfollowUcount, businessPageDislikeCnt, businessPageDpDownClickCnt, businessPageFansNumAll, businessPageFavouriteVideoCnt, businessPageFwVideoVv, businessPageHomeVisited, businessPageHomeVisitedUcount, businessPageLike, businessPageNewFansNum, businessPageOrderCount, businessPagePayOrderCount, businessPagePayOrderGmv, businessPagePlayOver, businessPageShare, businessPageTotalPlay, itemId, startTimeDay, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseVideoInfoGetV10ResponseDataTotalMetrics {\n");
    sb.append("    businessPageChatByShareVideoCnt: ").append(toIndentedString(businessPageChatByShareVideoCnt)).append("\n");
    sb.append("    businessPageClickCartCount: ").append(toIndentedString(businessPageClickCartCount)).append("\n");
    sb.append("    businessPageClickProduct: ").append(toIndentedString(businessPageClickProduct)).append("\n");
    sb.append("    businessPageClickProductGoBuy: ").append(toIndentedString(businessPageClickProductGoBuy)).append("\n");
    sb.append("    businessPageComment: ").append(toIndentedString(businessPageComment)).append("\n");
    sb.append("    businessPageDisfollowUcount: ").append(toIndentedString(businessPageDisfollowUcount)).append("\n");
    sb.append("    businessPageDislikeCnt: ").append(toIndentedString(businessPageDislikeCnt)).append("\n");
    sb.append("    businessPageDpDownClickCnt: ").append(toIndentedString(businessPageDpDownClickCnt)).append("\n");
    sb.append("    businessPageFansNumAll: ").append(toIndentedString(businessPageFansNumAll)).append("\n");
    sb.append("    businessPageFavouriteVideoCnt: ").append(toIndentedString(businessPageFavouriteVideoCnt)).append("\n");
    sb.append("    businessPageFwVideoVv: ").append(toIndentedString(businessPageFwVideoVv)).append("\n");
    sb.append("    businessPageHomeVisited: ").append(toIndentedString(businessPageHomeVisited)).append("\n");
    sb.append("    businessPageHomeVisitedUcount: ").append(toIndentedString(businessPageHomeVisitedUcount)).append("\n");
    sb.append("    businessPageLike: ").append(toIndentedString(businessPageLike)).append("\n");
    sb.append("    businessPageNewFansNum: ").append(toIndentedString(businessPageNewFansNum)).append("\n");
    sb.append("    businessPageOrderCount: ").append(toIndentedString(businessPageOrderCount)).append("\n");
    sb.append("    businessPagePayOrderCount: ").append(toIndentedString(businessPagePayOrderCount)).append("\n");
    sb.append("    businessPagePayOrderGmv: ").append(toIndentedString(businessPagePayOrderGmv)).append("\n");
    sb.append("    businessPagePlayOver: ").append(toIndentedString(businessPagePlayOver)).append("\n");
    sb.append("    businessPageShare: ").append(toIndentedString(businessPageShare)).append("\n");
    sb.append("    businessPageTotalPlay: ").append(toIndentedString(businessPageTotalPlay)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    startTimeDay: ").append(toIndentedString(startTimeDay)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("business_page_chat_by_share_video_cnt");
    openapiFields.add("business_page_click_cart_count");
    openapiFields.add("business_page_click_product");
    openapiFields.add("business_page_click_product_go_buy");
    openapiFields.add("business_page_comment");
    openapiFields.add("business_page_disfollow_ucount");
    openapiFields.add("business_page_dislike_cnt");
    openapiFields.add("business_page_dp_down_click_cnt");
    openapiFields.add("business_page_fans_num_all");
    openapiFields.add("business_page_favourite_video_cnt");
    openapiFields.add("business_page_fw_video_vv");
    openapiFields.add("business_page_home_visited");
    openapiFields.add("business_page_home_visited_ucount");
    openapiFields.add("business_page_like");
    openapiFields.add("business_page_new_fans_num");
    openapiFields.add("business_page_order_count");
    openapiFields.add("business_page_pay_order_count");
    openapiFields.add("business_page_pay_order_gmv");
    openapiFields.add("business_page_play_over");
    openapiFields.add("business_page_share");
    openapiFields.add("business_page_total_play");
    openapiFields.add("item_id");
    openapiFields.add("start_time_day");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseVideoInfoGetV10ResponseDataTotalMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseVideoInfoGetV10ResponseDataTotalMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseVideoInfoGetV10ResponseDataTotalMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseVideoInfoGetV10ResponseDataTotalMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseVideoInfoGetV10ResponseDataTotalMetrics>() {
           @Override
           public void write(JsonWriter out, EnterpriseVideoInfoGetV10ResponseDataTotalMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseVideoInfoGetV10ResponseDataTotalMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseVideoInfoGetV10ResponseDataTotalMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseVideoInfoGetV10ResponseDataTotalMetrics
  * @throws IOException if the JSON string is invalid with respect to EnterpriseVideoInfoGetV10ResponseDataTotalMetrics
  */
  public static EnterpriseVideoInfoGetV10ResponseDataTotalMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseVideoInfoGetV10ResponseDataTotalMetrics.class);
  }

 /**
  * Convert an instance of EnterpriseVideoInfoGetV10ResponseDataTotalMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

