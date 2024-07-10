/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10DataListMarketingGoal;
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
 * QianchuanAwemeReportOrderGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class QianchuanAwemeReportOrderGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AVERAGE_LIVE_WATCH_TIME = "average_live_watch_time";
  @SerializedName(SERIALIZED_NAME_AVERAGE_LIVE_WATCH_TIME)
  private Double averageLiveWatchTime = null;

  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Long clickCnt = null;

  public static final String SERIALIZED_NAME_CLICK_PRODUCT = "click_product";
  @SerializedName(SERIALIZED_NAME_CLICK_PRODUCT)
  private Long clickProduct = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Long convertCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_COST = "convert_cost";
  @SerializedName(SERIALIZED_NAME_CONVERT_COST)
  private Double convertCost = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_DY_COMMENT = "dy_comment";
  @SerializedName(SERIALIZED_NAME_DY_COMMENT)
  private Long dyComment = null;

  public static final String SERIALIZED_NAME_DY_FOLLOW = "dy_follow";
  @SerializedName(SERIALIZED_NAME_DY_FOLLOW)
  private Long dyFollow = null;

  public static final String SERIALIZED_NAME_DY_HOME_VISITED = "dy_home_visited";
  @SerializedName(SERIALIZED_NAME_DY_HOME_VISITED)
  private Long dyHomeVisited = null;

  public static final String SERIALIZED_NAME_DY_LIKE = "dy_like";
  @SerializedName(SERIALIZED_NAME_DY_LIKE)
  private Long dyLike = null;

  public static final String SERIALIZED_NAME_DY_SHARE = "dy_share";
  @SerializedName(SERIALIZED_NAME_DY_SHARE)
  private Long dyShare = null;

  public static final String SERIALIZED_NAME_ECP_CONVERT_CNT = "ecp_convert_cnt";
  @SerializedName(SERIALIZED_NAME_ECP_CONVERT_CNT)
  private Long ecpConvertCnt = null;

  public static final String SERIALIZED_NAME_ECP_CPA_PLATFORM = "ecp_cpa_platform";
  @SerializedName(SERIALIZED_NAME_ECP_CPA_PLATFORM)
  private Double ecpCpaPlatform = null;

  public static final String SERIALIZED_NAME_LIKE_RATE = "like_rate";
  @SerializedName(SERIALIZED_NAME_LIKE_RATE)
  private Double likeRate = null;

  public static final String SERIALIZED_NAME_LIVE_FANS_CLUB_JOIN_CNT = "live_fans_club_join_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_FANS_CLUB_JOIN_CNT)
  private Long liveFansClubJoinCnt = null;

  public static final String SERIALIZED_NAME_LIVE_SLIDECART_CLICK_CNT = "live_slidecart_click_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_SLIDECART_CLICK_CNT)
  private Long liveSlidecartClickCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_CLICK_PRODUCT_CNT = "luban_live_click_product_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_CLICK_PRODUCT_CNT)
  private Long lubanLiveClickProductCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_COMMENT_CNT = "luban_live_comment_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_COMMENT_CNT)
  private Long lubanLiveCommentCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_ENTER_CNT = "luban_live_enter_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_ENTER_CNT)
  private Long lubanLiveEnterCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_FOLLOW_CNT = "luban_live_follow_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_FOLLOW_CNT)
  private Long lubanLiveFollowCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_GIFT_AMOUNT = "luban_live_gift_amount";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_GIFT_AMOUNT)
  private Double lubanLiveGiftAmount = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_GIFT_CNT = "luban_live_gift_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_GIFT_CNT)
  private Long lubanLiveGiftCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_SHARE_CNT = "luban_live_share_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_SHARE_CNT)
  private Long lubanLiveShareCnt = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_SLIDECART_CLICK_CNT = "luban_live_slidecart_click_cnt";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_SLIDECART_CLICK_CNT)
  private Long lubanLiveSlidecartClickCnt = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeReportOrderGetV10DataListMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PAY_ORDER_AMOUNT = "pay_order_amount";
  @SerializedName(SERIALIZED_NAME_PAY_ORDER_AMOUNT)
  private Double payOrderAmount = null;

  public static final String SERIALIZED_NAME_PAY_ORDER_COUNT = "pay_order_count";
  @SerializedName(SERIALIZED_NAME_PAY_ORDER_COUNT)
  private Long payOrderCount = null;

  public static final String SERIALIZED_NAME_PLAY_DURATION5S_RATE = "play_duration_5s_rate";
  @SerializedName(SERIALIZED_NAME_PLAY_DURATION5S_RATE)
  private Double playDuration5sRate = null;

  public static final String SERIALIZED_NAME_PREPAY_AND_PAY_ORDER_ROI = "prepay_and_pay_order_roi";
  @SerializedName(SERIALIZED_NAME_PREPAY_AND_PAY_ORDER_ROI)
  private Double prepayAndPayOrderRoi = null;

  public static final String SERIALIZED_NAME_PREPAY_ORDER_AMOUNT = "prepay_order_amount";
  @SerializedName(SERIALIZED_NAME_PREPAY_ORDER_AMOUNT)
  private Double prepayOrderAmount = null;

  public static final String SERIALIZED_NAME_PREPAY_ORDER_COUNT = "prepay_order_count";
  @SerializedName(SERIALIZED_NAME_PREPAY_ORDER_COUNT)
  private Long prepayOrderCount = null;

  public static final String SERIALIZED_NAME_QIANCHUAN_EFFECTIVE_VIEW_CONVERT_COUNT = "qianchuan_effective_view_convert_count";
  @SerializedName(SERIALIZED_NAME_QIANCHUAN_EFFECTIVE_VIEW_CONVERT_COUNT)
  private Long qianchuanEffectiveViewConvertCount = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Long showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_TOTAL_PLAY = "total_play";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAY)
  private Long totalPlay = null;

  public QianchuanAwemeReportOrderGetV10ResponseDataListInner() {
  }

  public QianchuanAwemeReportOrderGetV10ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner averageLiveWatchTime(Double averageLiveWatchTime) {
    
    this.averageLiveWatchTime = averageLiveWatchTime;
    return this;
  }

   /**
   * 
   * @return averageLiveWatchTime
  **/
  @javax.annotation.Nullable
  public Double getAverageLiveWatchTime() {
    return averageLiveWatchTime;
  }


  public void setAverageLiveWatchTime(Double averageLiveWatchTime) {
    this.averageLiveWatchTime = averageLiveWatchTime;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner clickCnt(Long clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 点击次数
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Long getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner clickProduct(Long clickProduct) {
    
    this.clickProduct = clickProduct;
    return this;
  }

   /**
   * 直播间商品点击次数
   * @return clickProduct
  **/
  @javax.annotation.Nullable
  public Long getClickProduct() {
    return clickProduct;
  }


  public void setClickProduct(Long clickProduct) {
    this.clickProduct = clickProduct;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner convertCnt(Long convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 转化数
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Long getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Long convertCnt) {
    this.convertCnt = convertCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner convertCost(Double convertCost) {
    
    this.convertCost = convertCost;
    return this;
  }

   /**
   * 转化成本
   * @return convertCost
  **/
  @javax.annotation.Nullable
  public Double getConvertCost() {
    return convertCost;
  }


  public void setConvertCost(Double convertCost) {
    this.convertCost = convertCost;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 点击率
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner dyComment(Long dyComment) {
    
    this.dyComment = dyComment;
    return this;
  }

   /**
   * 评论次数
   * @return dyComment
  **/
  @javax.annotation.Nullable
  public Long getDyComment() {
    return dyComment;
  }


  public void setDyComment(Long dyComment) {
    this.dyComment = dyComment;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner dyFollow(Long dyFollow) {
    
    this.dyFollow = dyFollow;
    return this;
  }

   /**
   * 新增粉丝数
   * @return dyFollow
  **/
  @javax.annotation.Nullable
  public Long getDyFollow() {
    return dyFollow;
  }


  public void setDyFollow(Long dyFollow) {
    this.dyFollow = dyFollow;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner dyHomeVisited(Long dyHomeVisited) {
    
    this.dyHomeVisited = dyHomeVisited;
    return this;
  }

   /**
   * 主页访问量
   * @return dyHomeVisited
  **/
  @javax.annotation.Nullable
  public Long getDyHomeVisited() {
    return dyHomeVisited;
  }


  public void setDyHomeVisited(Long dyHomeVisited) {
    this.dyHomeVisited = dyHomeVisited;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner dyLike(Long dyLike) {
    
    this.dyLike = dyLike;
    return this;
  }

   /**
   * 点赞次数
   * @return dyLike
  **/
  @javax.annotation.Nullable
  public Long getDyLike() {
    return dyLike;
  }


  public void setDyLike(Long dyLike) {
    this.dyLike = dyLike;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner dyShare(Long dyShare) {
    
    this.dyShare = dyShare;
    return this;
  }

   /**
   * 分享次数
   * @return dyShare
  **/
  @javax.annotation.Nullable
  public Long getDyShare() {
    return dyShare;
  }


  public void setDyShare(Long dyShare) {
    this.dyShare = dyShare;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner ecpConvertCnt(Long ecpConvertCnt) {
    
    this.ecpConvertCnt = ecpConvertCnt;
    return this;
  }

   /**
   * 转换数，替换convert_cnt
   * @return ecpConvertCnt
  **/
  @javax.annotation.Nullable
  public Long getEcpConvertCnt() {
    return ecpConvertCnt;
  }


  public void setEcpConvertCnt(Long ecpConvertCnt) {
    this.ecpConvertCnt = ecpConvertCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner ecpCpaPlatform(Double ecpCpaPlatform) {
    
    this.ecpCpaPlatform = ecpCpaPlatform;
    return this;
  }

   /**
   * 转换成本.替换convert_cost。单位元
   * @return ecpCpaPlatform
  **/
  @javax.annotation.Nullable
  public Double getEcpCpaPlatform() {
    return ecpCpaPlatform;
  }


  public void setEcpCpaPlatform(Double ecpCpaPlatform) {
    this.ecpCpaPlatform = ecpCpaPlatform;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner likeRate(Double likeRate) {
    
    this.likeRate = likeRate;
    return this;
  }

   /**
   * 点赞率（视频订单才会返回）
   * @return likeRate
  **/
  @javax.annotation.Nullable
  public Double getLikeRate() {
    return likeRate;
  }


  public void setLikeRate(Double likeRate) {
    this.likeRate = likeRate;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner liveFansClubJoinCnt(Long liveFansClubJoinCnt) {
    
    this.liveFansClubJoinCnt = liveFansClubJoinCnt;
    return this;
  }

   /**
   * 直播间新加团人次
   * @return liveFansClubJoinCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveFansClubJoinCnt() {
    return liveFansClubJoinCnt;
  }


  public void setLiveFansClubJoinCnt(Long liveFansClubJoinCnt) {
    this.liveFansClubJoinCnt = liveFansClubJoinCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner liveSlidecartClickCnt(Long liveSlidecartClickCnt) {
    
    this.liveSlidecartClickCnt = liveSlidecartClickCnt;
    return this;
  }

   /**
   * 直播间查看购物车次数
   * @return liveSlidecartClickCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveSlidecartClickCnt() {
    return liveSlidecartClickCnt;
  }


  public void setLiveSlidecartClickCnt(Long liveSlidecartClickCnt) {
    this.liveSlidecartClickCnt = liveSlidecartClickCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveClickProductCnt(Long lubanLiveClickProductCnt) {
    
    this.lubanLiveClickProductCnt = lubanLiveClickProductCnt;
    return this;
  }

   /**
   * 商品点击次数
   * @return lubanLiveClickProductCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveClickProductCnt() {
    return lubanLiveClickProductCnt;
  }


  public void setLubanLiveClickProductCnt(Long lubanLiveClickProductCnt) {
    this.lubanLiveClickProductCnt = lubanLiveClickProductCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveCommentCnt(Long lubanLiveCommentCnt) {
    
    this.lubanLiveCommentCnt = lubanLiveCommentCnt;
    return this;
  }

   /**
   * 直播间评论次数
   * @return lubanLiveCommentCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveCommentCnt() {
    return lubanLiveCommentCnt;
  }


  public void setLubanLiveCommentCnt(Long lubanLiveCommentCnt) {
    this.lubanLiveCommentCnt = lubanLiveCommentCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveEnterCnt(Long lubanLiveEnterCnt) {
    
    this.lubanLiveEnterCnt = lubanLiveEnterCnt;
    return this;
  }

   /**
   * 直播间观看人次
   * @return lubanLiveEnterCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveEnterCnt() {
    return lubanLiveEnterCnt;
  }


  public void setLubanLiveEnterCnt(Long lubanLiveEnterCnt) {
    this.lubanLiveEnterCnt = lubanLiveEnterCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveFollowCnt(Long lubanLiveFollowCnt) {
    
    this.lubanLiveFollowCnt = lubanLiveFollowCnt;
    return this;
  }

   /**
   * 直播间新增粉丝次数
   * @return lubanLiveFollowCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveFollowCnt() {
    return lubanLiveFollowCnt;
  }


  public void setLubanLiveFollowCnt(Long lubanLiveFollowCnt) {
    this.lubanLiveFollowCnt = lubanLiveFollowCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveGiftAmount(Double lubanLiveGiftAmount) {
    
    this.lubanLiveGiftAmount = lubanLiveGiftAmount;
    return this;
  }

   /**
   * 直播间音浪收入
   * @return lubanLiveGiftAmount
  **/
  @javax.annotation.Nullable
  public Double getLubanLiveGiftAmount() {
    return lubanLiveGiftAmount;
  }


  public void setLubanLiveGiftAmount(Double lubanLiveGiftAmount) {
    this.lubanLiveGiftAmount = lubanLiveGiftAmount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveGiftCnt(Long lubanLiveGiftCnt) {
    
    this.lubanLiveGiftCnt = lubanLiveGiftCnt;
    return this;
  }

   /**
   * 直播间打赏次数
   * @return lubanLiveGiftCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveGiftCnt() {
    return lubanLiveGiftCnt;
  }


  public void setLubanLiveGiftCnt(Long lubanLiveGiftCnt) {
    this.lubanLiveGiftCnt = lubanLiveGiftCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveShareCnt(Long lubanLiveShareCnt) {
    
    this.lubanLiveShareCnt = lubanLiveShareCnt;
    return this;
  }

   /**
   * 直播间分享次数
   * @return lubanLiveShareCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveShareCnt() {
    return lubanLiveShareCnt;
  }


  public void setLubanLiveShareCnt(Long lubanLiveShareCnt) {
    this.lubanLiveShareCnt = lubanLiveShareCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner lubanLiveSlidecartClickCnt(Long lubanLiveSlidecartClickCnt) {
    
    this.lubanLiveSlidecartClickCnt = lubanLiveSlidecartClickCnt;
    return this;
  }

   /**
   * 查看购物车次数
   * @return lubanLiveSlidecartClickCnt
  **/
  @javax.annotation.Nullable
  public Long getLubanLiveSlidecartClickCnt() {
    return lubanLiveSlidecartClickCnt;
  }


  public void setLubanLiveSlidecartClickCnt(Long lubanLiveSlidecartClickCnt) {
    this.lubanLiveSlidecartClickCnt = lubanLiveSlidecartClickCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner marketingGoal(QianchuanAwemeReportOrderGetV10DataListMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeReportOrderGetV10DataListMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeReportOrderGetV10DataListMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单Id
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner payOrderAmount(Double payOrderAmount) {
    
    this.payOrderAmount = payOrderAmount;
    return this;
  }

   /**
   * 成交金额
   * @return payOrderAmount
  **/
  @javax.annotation.Nullable
  public Double getPayOrderAmount() {
    return payOrderAmount;
  }


  public void setPayOrderAmount(Double payOrderAmount) {
    this.payOrderAmount = payOrderAmount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner payOrderCount(Long payOrderCount) {
    
    this.payOrderCount = payOrderCount;
    return this;
  }

   /**
   * 成交订单数
   * @return payOrderCount
  **/
  @javax.annotation.Nullable
  public Long getPayOrderCount() {
    return payOrderCount;
  }


  public void setPayOrderCount(Long payOrderCount) {
    this.payOrderCount = payOrderCount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner playDuration5sRate(Double playDuration5sRate) {
    
    this.playDuration5sRate = playDuration5sRate;
    return this;
  }

   /**
   * 
   * @return playDuration5sRate
  **/
  @javax.annotation.Nullable
  public Double getPlayDuration5sRate() {
    return playDuration5sRate;
  }


  public void setPlayDuration5sRate(Double playDuration5sRate) {
    this.playDuration5sRate = playDuration5sRate;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner prepayAndPayOrderRoi(Double prepayAndPayOrderRoi) {
    
    this.prepayAndPayOrderRoi = prepayAndPayOrderRoi;
    return this;
  }

   /**
   * 支付roi
   * @return prepayAndPayOrderRoi
  **/
  @javax.annotation.Nullable
  public Double getPrepayAndPayOrderRoi() {
    return prepayAndPayOrderRoi;
  }


  public void setPrepayAndPayOrderRoi(Double prepayAndPayOrderRoi) {
    this.prepayAndPayOrderRoi = prepayAndPayOrderRoi;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner prepayOrderAmount(Double prepayOrderAmount) {
    
    this.prepayOrderAmount = prepayOrderAmount;
    return this;
  }

   /**
   * 广告预售订单金额
   * @return prepayOrderAmount
  **/
  @javax.annotation.Nullable
  public Double getPrepayOrderAmount() {
    return prepayOrderAmount;
  }


  public void setPrepayOrderAmount(Double prepayOrderAmount) {
    this.prepayOrderAmount = prepayOrderAmount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner prepayOrderCount(Long prepayOrderCount) {
    
    this.prepayOrderCount = prepayOrderCount;
    return this;
  }

   /**
   * 广告预售订单数
   * @return prepayOrderCount
  **/
  @javax.annotation.Nullable
  public Long getPrepayOrderCount() {
    return prepayOrderCount;
  }


  public void setPrepayOrderCount(Long prepayOrderCount) {
    this.prepayOrderCount = prepayOrderCount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner qianchuanEffectiveViewConvertCount(Long qianchuanEffectiveViewConvertCount) {
    
    this.qianchuanEffectiveViewConvertCount = qianchuanEffectiveViewConvertCount;
    return this;
  }

   /**
   * 有效看播数
   * @return qianchuanEffectiveViewConvertCount
  **/
  @javax.annotation.Nullable
  public Long getQianchuanEffectiveViewConvertCount() {
    return qianchuanEffectiveViewConvertCount;
  }


  public void setQianchuanEffectiveViewConvertCount(Long qianchuanEffectiveViewConvertCount) {
    this.qianchuanEffectiveViewConvertCount = qianchuanEffectiveViewConvertCount;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner showCnt(Long showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 展示次数
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Long getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Long showCnt) {
    this.showCnt = showCnt;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 消耗
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public QianchuanAwemeReportOrderGetV10ResponseDataListInner totalPlay(Long totalPlay) {
    
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 播放次数
   * @return totalPlay
  **/
  @javax.annotation.Nullable
  public Long getTotalPlay() {
    return totalPlay;
  }


  public void setTotalPlay(Long totalPlay) {
    this.totalPlay = totalPlay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeReportOrderGetV10ResponseDataListInner qianchuanAwemeReportOrderGetV10ResponseDataListInner = (QianchuanAwemeReportOrderGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanAwemeReportOrderGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.advertiserId, qianchuanAwemeReportOrderGetV10ResponseDataListInner.advertiserId) &&
        Objects.equals(this.averageLiveWatchTime, qianchuanAwemeReportOrderGetV10ResponseDataListInner.averageLiveWatchTime) &&
        Objects.equals(this.clickCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.clickCnt) &&
        Objects.equals(this.clickProduct, qianchuanAwemeReportOrderGetV10ResponseDataListInner.clickProduct) &&
        Objects.equals(this.convertCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.convertCnt) &&
        Objects.equals(this.convertCost, qianchuanAwemeReportOrderGetV10ResponseDataListInner.convertCost) &&
        Objects.equals(this.ctr, qianchuanAwemeReportOrderGetV10ResponseDataListInner.ctr) &&
        Objects.equals(this.dyComment, qianchuanAwemeReportOrderGetV10ResponseDataListInner.dyComment) &&
        Objects.equals(this.dyFollow, qianchuanAwemeReportOrderGetV10ResponseDataListInner.dyFollow) &&
        Objects.equals(this.dyHomeVisited, qianchuanAwemeReportOrderGetV10ResponseDataListInner.dyHomeVisited) &&
        Objects.equals(this.dyLike, qianchuanAwemeReportOrderGetV10ResponseDataListInner.dyLike) &&
        Objects.equals(this.dyShare, qianchuanAwemeReportOrderGetV10ResponseDataListInner.dyShare) &&
        Objects.equals(this.ecpConvertCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.ecpConvertCnt) &&
        Objects.equals(this.ecpCpaPlatform, qianchuanAwemeReportOrderGetV10ResponseDataListInner.ecpCpaPlatform) &&
        Objects.equals(this.likeRate, qianchuanAwemeReportOrderGetV10ResponseDataListInner.likeRate) &&
        Objects.equals(this.liveFansClubJoinCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.liveFansClubJoinCnt) &&
        Objects.equals(this.liveSlidecartClickCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.liveSlidecartClickCnt) &&
        Objects.equals(this.lubanLiveClickProductCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveClickProductCnt) &&
        Objects.equals(this.lubanLiveCommentCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveCommentCnt) &&
        Objects.equals(this.lubanLiveEnterCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveEnterCnt) &&
        Objects.equals(this.lubanLiveFollowCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveFollowCnt) &&
        Objects.equals(this.lubanLiveGiftAmount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveGiftAmount) &&
        Objects.equals(this.lubanLiveGiftCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveGiftCnt) &&
        Objects.equals(this.lubanLiveShareCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveShareCnt) &&
        Objects.equals(this.lubanLiveSlidecartClickCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.lubanLiveSlidecartClickCnt) &&
        Objects.equals(this.marketingGoal, qianchuanAwemeReportOrderGetV10ResponseDataListInner.marketingGoal) &&
        Objects.equals(this.orderId, qianchuanAwemeReportOrderGetV10ResponseDataListInner.orderId) &&
        Objects.equals(this.payOrderAmount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.payOrderAmount) &&
        Objects.equals(this.payOrderCount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.payOrderCount) &&
        Objects.equals(this.playDuration5sRate, qianchuanAwemeReportOrderGetV10ResponseDataListInner.playDuration5sRate) &&
        Objects.equals(this.prepayAndPayOrderRoi, qianchuanAwemeReportOrderGetV10ResponseDataListInner.prepayAndPayOrderRoi) &&
        Objects.equals(this.prepayOrderAmount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.prepayOrderAmount) &&
        Objects.equals(this.prepayOrderCount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.prepayOrderCount) &&
        Objects.equals(this.qianchuanEffectiveViewConvertCount, qianchuanAwemeReportOrderGetV10ResponseDataListInner.qianchuanEffectiveViewConvertCount) &&
        Objects.equals(this.showCnt, qianchuanAwemeReportOrderGetV10ResponseDataListInner.showCnt) &&
        Objects.equals(this.statCost, qianchuanAwemeReportOrderGetV10ResponseDataListInner.statCost) &&
        Objects.equals(this.totalPlay, qianchuanAwemeReportOrderGetV10ResponseDataListInner.totalPlay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, averageLiveWatchTime, clickCnt, clickProduct, convertCnt, convertCost, ctr, dyComment, dyFollow, dyHomeVisited, dyLike, dyShare, ecpConvertCnt, ecpCpaPlatform, likeRate, liveFansClubJoinCnt, liveSlidecartClickCnt, lubanLiveClickProductCnt, lubanLiveCommentCnt, lubanLiveEnterCnt, lubanLiveFollowCnt, lubanLiveGiftAmount, lubanLiveGiftCnt, lubanLiveShareCnt, lubanLiveSlidecartClickCnt, marketingGoal, orderId, payOrderAmount, payOrderCount, playDuration5sRate, prepayAndPayOrderRoi, prepayOrderAmount, prepayOrderCount, qianchuanEffectiveViewConvertCount, showCnt, statCost, totalPlay);
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
    sb.append("class QianchuanAwemeReportOrderGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    averageLiveWatchTime: ").append(toIndentedString(averageLiveWatchTime)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    clickProduct: ").append(toIndentedString(clickProduct)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    convertCost: ").append(toIndentedString(convertCost)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    dyComment: ").append(toIndentedString(dyComment)).append("\n");
    sb.append("    dyFollow: ").append(toIndentedString(dyFollow)).append("\n");
    sb.append("    dyHomeVisited: ").append(toIndentedString(dyHomeVisited)).append("\n");
    sb.append("    dyLike: ").append(toIndentedString(dyLike)).append("\n");
    sb.append("    dyShare: ").append(toIndentedString(dyShare)).append("\n");
    sb.append("    ecpConvertCnt: ").append(toIndentedString(ecpConvertCnt)).append("\n");
    sb.append("    ecpCpaPlatform: ").append(toIndentedString(ecpCpaPlatform)).append("\n");
    sb.append("    likeRate: ").append(toIndentedString(likeRate)).append("\n");
    sb.append("    liveFansClubJoinCnt: ").append(toIndentedString(liveFansClubJoinCnt)).append("\n");
    sb.append("    liveSlidecartClickCnt: ").append(toIndentedString(liveSlidecartClickCnt)).append("\n");
    sb.append("    lubanLiveClickProductCnt: ").append(toIndentedString(lubanLiveClickProductCnt)).append("\n");
    sb.append("    lubanLiveCommentCnt: ").append(toIndentedString(lubanLiveCommentCnt)).append("\n");
    sb.append("    lubanLiveEnterCnt: ").append(toIndentedString(lubanLiveEnterCnt)).append("\n");
    sb.append("    lubanLiveFollowCnt: ").append(toIndentedString(lubanLiveFollowCnt)).append("\n");
    sb.append("    lubanLiveGiftAmount: ").append(toIndentedString(lubanLiveGiftAmount)).append("\n");
    sb.append("    lubanLiveGiftCnt: ").append(toIndentedString(lubanLiveGiftCnt)).append("\n");
    sb.append("    lubanLiveShareCnt: ").append(toIndentedString(lubanLiveShareCnt)).append("\n");
    sb.append("    lubanLiveSlidecartClickCnt: ").append(toIndentedString(lubanLiveSlidecartClickCnt)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    payOrderAmount: ").append(toIndentedString(payOrderAmount)).append("\n");
    sb.append("    payOrderCount: ").append(toIndentedString(payOrderCount)).append("\n");
    sb.append("    playDuration5sRate: ").append(toIndentedString(playDuration5sRate)).append("\n");
    sb.append("    prepayAndPayOrderRoi: ").append(toIndentedString(prepayAndPayOrderRoi)).append("\n");
    sb.append("    prepayOrderAmount: ").append(toIndentedString(prepayOrderAmount)).append("\n");
    sb.append("    prepayOrderCount: ").append(toIndentedString(prepayOrderCount)).append("\n");
    sb.append("    qianchuanEffectiveViewConvertCount: ").append(toIndentedString(qianchuanEffectiveViewConvertCount)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("average_live_watch_time");
    openapiFields.add("click_cnt");
    openapiFields.add("click_product");
    openapiFields.add("convert_cnt");
    openapiFields.add("convert_cost");
    openapiFields.add("ctr");
    openapiFields.add("dy_comment");
    openapiFields.add("dy_follow");
    openapiFields.add("dy_home_visited");
    openapiFields.add("dy_like");
    openapiFields.add("dy_share");
    openapiFields.add("ecp_convert_cnt");
    openapiFields.add("ecp_cpa_platform");
    openapiFields.add("like_rate");
    openapiFields.add("live_fans_club_join_cnt");
    openapiFields.add("live_slidecart_click_cnt");
    openapiFields.add("luban_live_click_product_cnt");
    openapiFields.add("luban_live_comment_cnt");
    openapiFields.add("luban_live_enter_cnt");
    openapiFields.add("luban_live_follow_cnt");
    openapiFields.add("luban_live_gift_amount");
    openapiFields.add("luban_live_gift_cnt");
    openapiFields.add("luban_live_share_cnt");
    openapiFields.add("luban_live_slidecart_click_cnt");
    openapiFields.add("marketing_goal");
    openapiFields.add("order_id");
    openapiFields.add("pay_order_amount");
    openapiFields.add("pay_order_count");
    openapiFields.add("play_duration_5s_rate");
    openapiFields.add("prepay_and_pay_order_roi");
    openapiFields.add("prepay_order_amount");
    openapiFields.add("prepay_order_count");
    openapiFields.add("qianchuan_effective_view_convert_count");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");
    openapiFields.add("total_play");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeReportOrderGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeReportOrderGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeReportOrderGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeReportOrderGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeReportOrderGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeReportOrderGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeReportOrderGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeReportOrderGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeReportOrderGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeReportOrderGetV10ResponseDataListInner
  */
  public static QianchuanAwemeReportOrderGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeReportOrderGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeReportOrderGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

