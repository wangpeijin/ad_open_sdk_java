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
public class EnterpriseOverviewDataGetV10ResponseDataTotalRatio {
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

  public static final String SERIALIZED_NAME_START_TIME_DAY = "start_time_day";
  @SerializedName(SERIALIZED_NAME_START_TIME_DAY)
  private String startTimeDay = null;

  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio() {
  }

  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageChatByShareVideoCnt(String businessPageChatByShareVideoCnt) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageClickCartCount(String businessPageClickCartCount) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageClickProduct(String businessPageClickProduct) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageClickProductGoBuy(String businessPageClickProductGoBuy) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageComment(String businessPageComment) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageDisfollowUcount(String businessPageDisfollowUcount) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageDislikeCnt(String businessPageDislikeCnt) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageDpDownClickCnt(String businessPageDpDownClickCnt) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageFansNumAll(String businessPageFansNumAll) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageFavouriteVideoCnt(String businessPageFavouriteVideoCnt) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageFwVideoVv(String businessPageFwVideoVv) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageHomeVisited(String businessPageHomeVisited) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageHomeVisitedUcount(String businessPageHomeVisitedUcount) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageLike(String businessPageLike) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageNewFansNum(String businessPageNewFansNum) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageOrderCount(String businessPageOrderCount) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPagePayOrderCount(String businessPagePayOrderCount) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPagePayOrderGmv(String businessPagePayOrderGmv) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPagePlayOver(String businessPagePlayOver) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageShare(String businessPageShare) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio businessPageTotalPlay(String businessPageTotalPlay) {
    
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


  public EnterpriseOverviewDataGetV10ResponseDataTotalRatio startTimeDay(String startTimeDay) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOverviewDataGetV10ResponseDataTotalRatio enterpriseOverviewDataGetV10ResponseDataTotalRatio = (EnterpriseOverviewDataGetV10ResponseDataTotalRatio) o;
    return Objects.equals(this.businessPageChatByShareVideoCnt, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageChatByShareVideoCnt) &&
        Objects.equals(this.businessPageClickCartCount, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageClickCartCount) &&
        Objects.equals(this.businessPageClickProduct, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageClickProduct) &&
        Objects.equals(this.businessPageClickProductGoBuy, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageClickProductGoBuy) &&
        Objects.equals(this.businessPageComment, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageComment) &&
        Objects.equals(this.businessPageDisfollowUcount, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageDisfollowUcount) &&
        Objects.equals(this.businessPageDislikeCnt, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageDislikeCnt) &&
        Objects.equals(this.businessPageDpDownClickCnt, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageDpDownClickCnt) &&
        Objects.equals(this.businessPageFansNumAll, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageFansNumAll) &&
        Objects.equals(this.businessPageFavouriteVideoCnt, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageFavouriteVideoCnt) &&
        Objects.equals(this.businessPageFwVideoVv, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageFwVideoVv) &&
        Objects.equals(this.businessPageHomeVisited, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageHomeVisited) &&
        Objects.equals(this.businessPageHomeVisitedUcount, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageHomeVisitedUcount) &&
        Objects.equals(this.businessPageLike, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageLike) &&
        Objects.equals(this.businessPageNewFansNum, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageNewFansNum) &&
        Objects.equals(this.businessPageOrderCount, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageOrderCount) &&
        Objects.equals(this.businessPagePayOrderCount, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPagePayOrderCount) &&
        Objects.equals(this.businessPagePayOrderGmv, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPagePayOrderGmv) &&
        Objects.equals(this.businessPagePlayOver, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPagePlayOver) &&
        Objects.equals(this.businessPageShare, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageShare) &&
        Objects.equals(this.businessPageTotalPlay, enterpriseOverviewDataGetV10ResponseDataTotalRatio.businessPageTotalPlay) &&
        Objects.equals(this.startTimeDay, enterpriseOverviewDataGetV10ResponseDataTotalRatio.startTimeDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessPageChatByShareVideoCnt, businessPageClickCartCount, businessPageClickProduct, businessPageClickProductGoBuy, businessPageComment, businessPageDisfollowUcount, businessPageDislikeCnt, businessPageDpDownClickCnt, businessPageFansNumAll, businessPageFavouriteVideoCnt, businessPageFwVideoVv, businessPageHomeVisited, businessPageHomeVisitedUcount, businessPageLike, businessPageNewFansNum, businessPageOrderCount, businessPagePayOrderCount, businessPagePayOrderGmv, businessPagePlayOver, businessPageShare, businessPageTotalPlay, startTimeDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOverviewDataGetV10ResponseDataTotalRatio {\n");
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
    sb.append("    startTimeDay: ").append(toIndentedString(startTimeDay)).append("\n");
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
    openapiFields.add("start_time_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseOverviewDataGetV10ResponseDataTotalRatio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseOverviewDataGetV10ResponseDataTotalRatio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseOverviewDataGetV10ResponseDataTotalRatio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseOverviewDataGetV10ResponseDataTotalRatio.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseOverviewDataGetV10ResponseDataTotalRatio>() {
           @Override
           public void write(JsonWriter out, EnterpriseOverviewDataGetV10ResponseDataTotalRatio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseOverviewDataGetV10ResponseDataTotalRatio read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseOverviewDataGetV10ResponseDataTotalRatio given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseOverviewDataGetV10ResponseDataTotalRatio
  * @throws IOException if the JSON string is invalid with respect to EnterpriseOverviewDataGetV10ResponseDataTotalRatio
  */
  public static EnterpriseOverviewDataGetV10ResponseDataTotalRatio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseOverviewDataGetV10ResponseDataTotalRatio.class);
  }

 /**
  * Convert an instance of EnterpriseOverviewDataGetV10ResponseDataTotalRatio to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

