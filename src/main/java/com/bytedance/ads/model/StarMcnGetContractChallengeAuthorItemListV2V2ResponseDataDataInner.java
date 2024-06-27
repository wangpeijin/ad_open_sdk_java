/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ANDROID_CONVERT_COUNT = "android_convert_count";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT_COUNT)
  private Long androidConvertCount = null;

  public static final String SERIALIZED_NAME_AUTHOR_AMOUNT = "author_amount";
  @SerializedName(SERIALIZED_NAME_AUTHOR_AMOUNT)
  private Long authorAmount = null;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId = null;

  public static final String SERIALIZED_NAME_CLUE_CNT = "clue_cnt";
  @SerializedName(SERIALIZED_NAME_CLUE_CNT)
  private Long clueCnt = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_DOUYIN_ID = "douyin_id";
  @SerializedName(SERIALIZED_NAME_DOUYIN_ID)
  private String douyinId = null;

  public static final String SERIALIZED_NAME_INSTALL_FINISH_CNT = "install_finish_cnt";
  @SerializedName(SERIALIZED_NAME_INSTALL_FINISH_CNT)
  private Long installFinishCnt = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT_COUNT = "ios_convert_count";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT_COUNT)
  private Long iosConvertCount = null;

  public static final String SERIALIZED_NAME_IS_OWN = "is_own";
  @SerializedName(SERIALIZED_NAME_IS_OWN)
  private Boolean isOwn = null;

  public static final String SERIALIZED_NAME_ITEM_CLICK_RATE = "item_click_rate";
  @SerializedName(SERIALIZED_NAME_ITEM_CLICK_RATE)
  private Long itemClickRate = null;

  public static final String SERIALIZED_NAME_ITEM_COMMENT = "item_comment";
  @SerializedName(SERIALIZED_NAME_ITEM_COMMENT)
  private Long itemComment = null;

  public static final String SERIALIZED_NAME_ITEM_FEEL_GOOD = "item_feel_good";
  @SerializedName(SERIALIZED_NAME_ITEM_FEEL_GOOD)
  private Long itemFeelGood = null;

  public static final String SERIALIZED_NAME_ITEM_FORWARD = "item_forward";
  @SerializedName(SERIALIZED_NAME_ITEM_FORWARD)
  private Long itemForward = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_INFO_DAILY_LIST = "item_info_daily_list";
  @SerializedName(SERIALIZED_NAME_ITEM_INFO_DAILY_LIST)
  private List<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner> itemInfoDailyList = null;

  public static final String SERIALIZED_NAME_ITEM_INTERACT_RATE = "item_interact_rate";
  @SerializedName(SERIALIZED_NAME_ITEM_INTERACT_RATE)
  private Double itemInteractRate = null;

  public static final String SERIALIZED_NAME_ITEM_VIEW = "item_view";
  @SerializedName(SERIALIZED_NAME_ITEM_VIEW)
  private Long itemView = null;

  public static final String SERIALIZED_NAME_MCN_AMOUNT = "mcn_amount";
  @SerializedName(SERIALIZED_NAME_MCN_AMOUNT)
  private Long mcnAmount = null;

  public static final String SERIALIZED_NAME_OPEN_STATE = "open_state";
  @SerializedName(SERIALIZED_NAME_OPEN_STATE)
  private Long openState = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_PUBLISH_TIME = "publish_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_TIME)
  private Long publishTime = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT = "service_provider_amount";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT)
  private Long serviceProviderAmount = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE = "share_price";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE)
  private Long sharePrice = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_HOUR = "share_price_hour";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_HOUR)
  private Long sharePriceHour = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_TOTAL = "share_price_total";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_TOTAL)
  private Long sharePriceTotal = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_TOTAL_HOUR = "share_price_total_hour";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_TOTAL_HOUR)
  private Long sharePriceTotalHour = null;

  public static final String SERIALIZED_NAME_SHARE_VV = "share_vv";
  @SerializedName(SERIALIZED_NAME_SHARE_VV)
  private Long shareVv = null;

  public static final String SERIALIZED_NAME_UNCORRELATED = "uncorrelated";
  @SerializedName(SERIALIZED_NAME_UNCORRELATED)
  private Long uncorrelated = null;

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner() {
  }

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner androidConvertCount(Long androidConvertCount) {
    
    this.androidConvertCount = androidConvertCount;
    return this;
  }

   /**
   * 
   * @return androidConvertCount
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvertCount() {
    return androidConvertCount;
  }


  public void setAndroidConvertCount(Long androidConvertCount) {
    this.androidConvertCount = androidConvertCount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner authorAmount(Long authorAmount) {
    
    this.authorAmount = authorAmount;
    return this;
  }

   /**
   * 
   * @return authorAmount
  **/
  @javax.annotation.Nullable
  public Long getAuthorAmount() {
    return authorAmount;
  }


  public void setAuthorAmount(Long authorAmount) {
    this.authorAmount = authorAmount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner clueCnt(Long clueCnt) {
    
    this.clueCnt = clueCnt;
    return this;
  }

   /**
   * 
   * @return clueCnt
  **/
  @javax.annotation.Nullable
  public Long getClueCnt() {
    return clueCnt;
  }


  public void setClueCnt(Long clueCnt) {
    this.clueCnt = clueCnt;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner douyinId(String douyinId) {
    
    this.douyinId = douyinId;
    return this;
  }

   /**
   * 
   * @return douyinId
  **/
  @javax.annotation.Nullable
  public String getDouyinId() {
    return douyinId;
  }


  public void setDouyinId(String douyinId) {
    this.douyinId = douyinId;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner installFinishCnt(Long installFinishCnt) {
    
    this.installFinishCnt = installFinishCnt;
    return this;
  }

   /**
   * 
   * @return installFinishCnt
  **/
  @javax.annotation.Nullable
  public Long getInstallFinishCnt() {
    return installFinishCnt;
  }


  public void setInstallFinishCnt(Long installFinishCnt) {
    this.installFinishCnt = installFinishCnt;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner iosConvertCount(Long iosConvertCount) {
    
    this.iosConvertCount = iosConvertCount;
    return this;
  }

   /**
   * 
   * @return iosConvertCount
  **/
  @javax.annotation.Nullable
  public Long getIosConvertCount() {
    return iosConvertCount;
  }


  public void setIosConvertCount(Long iosConvertCount) {
    this.iosConvertCount = iosConvertCount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner isOwn(Boolean isOwn) {
    
    this.isOwn = isOwn;
    return this;
  }

   /**
   * 
   * @return isOwn
  **/
  @javax.annotation.Nullable
  public Boolean getIsOwn() {
    return isOwn;
  }


  public void setIsOwn(Boolean isOwn) {
    this.isOwn = isOwn;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemClickRate(Long itemClickRate) {
    
    this.itemClickRate = itemClickRate;
    return this;
  }

   /**
   * 
   * @return itemClickRate
  **/
  @javax.annotation.Nullable
  public Long getItemClickRate() {
    return itemClickRate;
  }


  public void setItemClickRate(Long itemClickRate) {
    this.itemClickRate = itemClickRate;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemComment(Long itemComment) {
    
    this.itemComment = itemComment;
    return this;
  }

   /**
   * 
   * @return itemComment
  **/
  @javax.annotation.Nullable
  public Long getItemComment() {
    return itemComment;
  }


  public void setItemComment(Long itemComment) {
    this.itemComment = itemComment;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemFeelGood(Long itemFeelGood) {
    
    this.itemFeelGood = itemFeelGood;
    return this;
  }

   /**
   * 
   * @return itemFeelGood
  **/
  @javax.annotation.Nullable
  public Long getItemFeelGood() {
    return itemFeelGood;
  }


  public void setItemFeelGood(Long itemFeelGood) {
    this.itemFeelGood = itemFeelGood;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemForward(Long itemForward) {
    
    this.itemForward = itemForward;
    return this;
  }

   /**
   * 
   * @return itemForward
  **/
  @javax.annotation.Nullable
  public Long getItemForward() {
    return itemForward;
  }


  public void setItemForward(Long itemForward) {
    this.itemForward = itemForward;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemId(Long itemId) {
    
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


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemInfoDailyList(List<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner> itemInfoDailyList) {
    
    this.itemInfoDailyList = itemInfoDailyList;
    return this;
  }

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner addItemInfoDailyListItem(StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner itemInfoDailyListItem) {
    if (this.itemInfoDailyList == null) {
      this.itemInfoDailyList = new ArrayList<>();
    }
    this.itemInfoDailyList.add(itemInfoDailyListItem);
    return this;
  }

   /**
   * 
   * @return itemInfoDailyList
  **/
  @javax.annotation.Nullable
  public List<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner> getItemInfoDailyList() {
    return itemInfoDailyList;
  }


  public void setItemInfoDailyList(List<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner> itemInfoDailyList) {
    this.itemInfoDailyList = itemInfoDailyList;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemInteractRate(Double itemInteractRate) {
    
    this.itemInteractRate = itemInteractRate;
    return this;
  }

   /**
   * 
   * @return itemInteractRate
  **/
  @javax.annotation.Nullable
  public Double getItemInteractRate() {
    return itemInteractRate;
  }


  public void setItemInteractRate(Double itemInteractRate) {
    this.itemInteractRate = itemInteractRate;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner itemView(Long itemView) {
    
    this.itemView = itemView;
    return this;
  }

   /**
   * 
   * @return itemView
  **/
  @javax.annotation.Nullable
  public Long getItemView() {
    return itemView;
  }


  public void setItemView(Long itemView) {
    this.itemView = itemView;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner mcnAmount(Long mcnAmount) {
    
    this.mcnAmount = mcnAmount;
    return this;
  }

   /**
   * 
   * @return mcnAmount
  **/
  @javax.annotation.Nullable
  public Long getMcnAmount() {
    return mcnAmount;
  }


  public void setMcnAmount(Long mcnAmount) {
    this.mcnAmount = mcnAmount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner openState(Long openState) {
    
    this.openState = openState;
    return this;
  }

   /**
   * 
   * @return openState
  **/
  @javax.annotation.Nullable
  public Long getOpenState() {
    return openState;
  }


  public void setOpenState(Long openState) {
    this.openState = openState;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner publishTime(Long publishTime) {
    
    this.publishTime = publishTime;
    return this;
  }

   /**
   * 
   * @return publishTime
  **/
  @javax.annotation.Nullable
  public Long getPublishTime() {
    return publishTime;
  }


  public void setPublishTime(Long publishTime) {
    this.publishTime = publishTime;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner serviceProviderAmount(Long serviceProviderAmount) {
    
    this.serviceProviderAmount = serviceProviderAmount;
    return this;
  }

   /**
   * 
   * @return serviceProviderAmount
  **/
  @javax.annotation.Nullable
  public Long getServiceProviderAmount() {
    return serviceProviderAmount;
  }


  public void setServiceProviderAmount(Long serviceProviderAmount) {
    this.serviceProviderAmount = serviceProviderAmount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner sharePrice(Long sharePrice) {
    
    this.sharePrice = sharePrice;
    return this;
  }

   /**
   * 
   * @return sharePrice
  **/
  @javax.annotation.Nullable
  public Long getSharePrice() {
    return sharePrice;
  }


  public void setSharePrice(Long sharePrice) {
    this.sharePrice = sharePrice;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner sharePriceHour(Long sharePriceHour) {
    
    this.sharePriceHour = sharePriceHour;
    return this;
  }

   /**
   * 
   * @return sharePriceHour
  **/
  @javax.annotation.Nullable
  public Long getSharePriceHour() {
    return sharePriceHour;
  }


  public void setSharePriceHour(Long sharePriceHour) {
    this.sharePriceHour = sharePriceHour;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner sharePriceTotal(Long sharePriceTotal) {
    
    this.sharePriceTotal = sharePriceTotal;
    return this;
  }

   /**
   * 
   * @return sharePriceTotal
  **/
  @javax.annotation.Nullable
  public Long getSharePriceTotal() {
    return sharePriceTotal;
  }


  public void setSharePriceTotal(Long sharePriceTotal) {
    this.sharePriceTotal = sharePriceTotal;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner sharePriceTotalHour(Long sharePriceTotalHour) {
    
    this.sharePriceTotalHour = sharePriceTotalHour;
    return this;
  }

   /**
   * 
   * @return sharePriceTotalHour
  **/
  @javax.annotation.Nullable
  public Long getSharePriceTotalHour() {
    return sharePriceTotalHour;
  }


  public void setSharePriceTotalHour(Long sharePriceTotalHour) {
    this.sharePriceTotalHour = sharePriceTotalHour;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner shareVv(Long shareVv) {
    
    this.shareVv = shareVv;
    return this;
  }

   /**
   * 
   * @return shareVv
  **/
  @javax.annotation.Nullable
  public Long getShareVv() {
    return shareVv;
  }


  public void setShareVv(Long shareVv) {
    this.shareVv = shareVv;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner uncorrelated(Long uncorrelated) {
    
    this.uncorrelated = uncorrelated;
    return this;
  }

   /**
   * 
   * @return uncorrelated
  **/
  @javax.annotation.Nullable
  public Long getUncorrelated() {
    return uncorrelated;
  }


  public void setUncorrelated(Long uncorrelated) {
    this.uncorrelated = uncorrelated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner = (StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner) o;
    return Objects.equals(this.androidConvertCount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.androidConvertCount) &&
        Objects.equals(this.authorAmount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.authorAmount) &&
        Objects.equals(this.authorId, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.authorId) &&
        Objects.equals(this.authorName, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.authorName) &&
        Objects.equals(this.channelId, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.channelId) &&
        Objects.equals(this.clueCnt, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.clueCnt) &&
        Objects.equals(this.demandId, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.demandId) &&
        Objects.equals(this.demandName, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.demandName) &&
        Objects.equals(this.douyinId, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.douyinId) &&
        Objects.equals(this.installFinishCnt, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.installFinishCnt) &&
        Objects.equals(this.iosConvertCount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.iosConvertCount) &&
        Objects.equals(this.isOwn, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.isOwn) &&
        Objects.equals(this.itemClickRate, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemClickRate) &&
        Objects.equals(this.itemComment, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemComment) &&
        Objects.equals(this.itemFeelGood, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemFeelGood) &&
        Objects.equals(this.itemForward, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemForward) &&
        Objects.equals(this.itemId, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemId) &&
        Objects.equals(this.itemInfoDailyList, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemInfoDailyList) &&
        Objects.equals(this.itemInteractRate, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemInteractRate) &&
        Objects.equals(this.itemView, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.itemView) &&
        Objects.equals(this.mcnAmount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.mcnAmount) &&
        Objects.equals(this.openState, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.openState) &&
        Objects.equals(this.play, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.play) &&
        Objects.equals(this.publishTime, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.publishTime) &&
        Objects.equals(this.serviceProviderAmount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.serviceProviderAmount) &&
        Objects.equals(this.sharePrice, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.sharePrice) &&
        Objects.equals(this.sharePriceHour, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.sharePriceHour) &&
        Objects.equals(this.sharePriceTotal, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.sharePriceTotal) &&
        Objects.equals(this.sharePriceTotalHour, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.sharePriceTotalHour) &&
        Objects.equals(this.shareVv, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.shareVv) &&
        Objects.equals(this.uncorrelated, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.uncorrelated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidConvertCount, authorAmount, authorId, authorName, channelId, clueCnt, demandId, demandName, douyinId, installFinishCnt, iosConvertCount, isOwn, itemClickRate, itemComment, itemFeelGood, itemForward, itemId, itemInfoDailyList, itemInteractRate, itemView, mcnAmount, openState, play, publishTime, serviceProviderAmount, sharePrice, sharePriceHour, sharePriceTotal, sharePriceTotalHour, shareVv, uncorrelated);
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
    sb.append("class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner {\n");
    sb.append("    androidConvertCount: ").append(toIndentedString(androidConvertCount)).append("\n");
    sb.append("    authorAmount: ").append(toIndentedString(authorAmount)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    clueCnt: ").append(toIndentedString(clueCnt)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    douyinId: ").append(toIndentedString(douyinId)).append("\n");
    sb.append("    installFinishCnt: ").append(toIndentedString(installFinishCnt)).append("\n");
    sb.append("    iosConvertCount: ").append(toIndentedString(iosConvertCount)).append("\n");
    sb.append("    isOwn: ").append(toIndentedString(isOwn)).append("\n");
    sb.append("    itemClickRate: ").append(toIndentedString(itemClickRate)).append("\n");
    sb.append("    itemComment: ").append(toIndentedString(itemComment)).append("\n");
    sb.append("    itemFeelGood: ").append(toIndentedString(itemFeelGood)).append("\n");
    sb.append("    itemForward: ").append(toIndentedString(itemForward)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemInfoDailyList: ").append(toIndentedString(itemInfoDailyList)).append("\n");
    sb.append("    itemInteractRate: ").append(toIndentedString(itemInteractRate)).append("\n");
    sb.append("    itemView: ").append(toIndentedString(itemView)).append("\n");
    sb.append("    mcnAmount: ").append(toIndentedString(mcnAmount)).append("\n");
    sb.append("    openState: ").append(toIndentedString(openState)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
    sb.append("    serviceProviderAmount: ").append(toIndentedString(serviceProviderAmount)).append("\n");
    sb.append("    sharePrice: ").append(toIndentedString(sharePrice)).append("\n");
    sb.append("    sharePriceHour: ").append(toIndentedString(sharePriceHour)).append("\n");
    sb.append("    sharePriceTotal: ").append(toIndentedString(sharePriceTotal)).append("\n");
    sb.append("    sharePriceTotalHour: ").append(toIndentedString(sharePriceTotalHour)).append("\n");
    sb.append("    shareVv: ").append(toIndentedString(shareVv)).append("\n");
    sb.append("    uncorrelated: ").append(toIndentedString(uncorrelated)).append("\n");
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
    openapiFields.add("android_convert_count");
    openapiFields.add("author_amount");
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("channel_id");
    openapiFields.add("clue_cnt");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");
    openapiFields.add("douyin_id");
    openapiFields.add("install_finish_cnt");
    openapiFields.add("ios_convert_count");
    openapiFields.add("is_own");
    openapiFields.add("item_click_rate");
    openapiFields.add("item_comment");
    openapiFields.add("item_feel_good");
    openapiFields.add("item_forward");
    openapiFields.add("item_id");
    openapiFields.add("item_info_daily_list");
    openapiFields.add("item_interact_rate");
    openapiFields.add("item_view");
    openapiFields.add("mcn_amount");
    openapiFields.add("open_state");
    openapiFields.add("play");
    openapiFields.add("publish_time");
    openapiFields.add("service_provider_amount");
    openapiFields.add("share_price");
    openapiFields.add("share_price_hour");
    openapiFields.add("share_price_total");
    openapiFields.add("share_price_total_hour");
    openapiFields.add("share_vv");
    openapiFields.add("uncorrelated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("is_own");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner
  */
  public static StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

