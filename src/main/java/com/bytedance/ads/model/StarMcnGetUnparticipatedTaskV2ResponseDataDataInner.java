/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarMcnGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarMcnGetUnparticipatedTaskV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_CHALLENGE_STATUS = "challenge_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_STATUS)
  private Long challengeStatus = null;

  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Long commissionRate = null;

  public static final String SERIALIZED_NAME_COMMISSION_RATE_IAAP = "commission_rate_iaap";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE_IAAP)
  private String commissionRateIaap = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ICON = "demand_icon";
  @SerializedName(SERIALIZED_NAME_DEMAND_ICON)
  private String demandIcon = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_EVALUATE_TYPE = "evaluate_type";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TYPE)
  private Long evaluateType = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_END = "expiration_time_end";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_END)
  private String expirationTimeEnd = null;

  public static final String SERIALIZED_NAME_FIRST_CLASS_CATEGORY = "first_class_category";
  @SerializedName(SERIALIZED_NAME_FIRST_CLASS_CATEGORY)
  private Long firstClassCategory = null;

  public static final String SERIALIZED_NAME_HIGH_PROFIT_CHALLENGE = "high_profit_challenge";
  @SerializedName(SERIALIZED_NAME_HIGH_PROFIT_CHALLENGE)
  private Long highProfitChallenge = null;

  public static final String SERIALIZED_NAME_ITEM_COMPONENT_TYPE = "item_component_type";
  @SerializedName(SERIALIZED_NAME_ITEM_COMPONENT_TYPE)
  private Long itemComponentType = null;

  public static final String SERIALIZED_NAME_MCN_PROFIT_RATE = "mcn_profit_rate";
  @SerializedName(SERIALIZED_NAME_MCN_PROFIT_RATE)
  private Long mcnProfitRate = null;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private Long payType = null;

  public static final String SERIALIZED_NAME_PLAYLET_CATEGORY = "playlet_category";
  @SerializedName(SERIALIZED_NAME_PLAYLET_CATEGORY)
  private Long playletCategory = null;

  public static final String SERIALIZED_NAME_PLAYLET_FIRST_WEEK = "playlet_first_week";
  @SerializedName(SERIALIZED_NAME_PLAYLET_FIRST_WEEK)
  private Long playletFirstWeek = null;

  public static final String SERIALIZED_NAME_PLAYLET_GENDER = "playlet_gender";
  @SerializedName(SERIALIZED_NAME_PLAYLET_GENDER)
  private List<Long> playletGender = null;

  public static final String SERIALIZED_NAME_PLAYLET_HOT = "playlet_hot";
  @SerializedName(SERIALIZED_NAME_PLAYLET_HOT)
  private Long playletHot = null;

  public static final String SERIALIZED_NAME_PLAYLET_SECOND_WEEK = "playlet_second_week";
  @SerializedName(SERIALIZED_NAME_PLAYLET_SECOND_WEEK)
  private Long playletSecondWeek = null;

  public static final String SERIALIZED_NAME_PLAYLET_THEME = "playlet_theme";
  @SerializedName(SERIALIZED_NAME_PLAYLET_THEME)
  private List<Long> playletTheme = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price = null;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "product_category";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private Long productCategory = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PROFIT_RATE_CHANNEL = "profit_rate_channel";
  @SerializedName(SERIALIZED_NAME_PROFIT_RATE_CHANNEL)
  private Map<String, Long> profitRateChannel = null;

  public static final String SERIALIZED_NAME_REAL_COST = "real_cost";
  @SerializedName(SERIALIZED_NAME_REAL_COST)
  private Long realCost = null;

  public static final String SERIALIZED_NAME_SECOND_CLASS_CATEGORY = "second_class_category";
  @SerializedName(SERIALIZED_NAME_SECOND_CLASS_CATEGORY)
  private Long secondClassCategory = null;

  public static final String SERIALIZED_NAME_SMALL_APP_INFO = "small_app_info";
  @SerializedName(SERIALIZED_NAME_SMALL_APP_INFO)
  private StarMcnGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo smallAppInfo = null;

  public static final String SERIALIZED_NAME_TOTAL_BUDGET = "total_budget";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUDGET)
  private Long totalBudget = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private Long videoType = null;

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner() {
  }

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 
   * @return brand
  **/
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner challengeStatus(Long challengeStatus) {
    
    this.challengeStatus = challengeStatus;
    return this;
  }

   /**
   * 
   * @return challengeStatus
  **/
  @javax.annotation.Nullable
  public Long getChallengeStatus() {
    return challengeStatus;
  }


  public void setChallengeStatus(Long challengeStatus) {
    this.challengeStatus = challengeStatus;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner commissionRate(Long commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * 
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  public Long getCommissionRate() {
    return commissionRate;
  }


  public void setCommissionRate(Long commissionRate) {
    this.commissionRate = commissionRate;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner commissionRateIaap(String commissionRateIaap) {
    
    this.commissionRateIaap = commissionRateIaap;
    return this;
  }

   /**
   * 
   * @return commissionRateIaap
  **/
  @javax.annotation.Nullable
  public String getCommissionRateIaap() {
    return commissionRateIaap;
  }


  public void setCommissionRateIaap(String commissionRateIaap) {
    this.commissionRateIaap = commissionRateIaap;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandIcon(String demandIcon) {
    
    this.demandIcon = demandIcon;
    return this;
  }

   /**
   * 
   * @return demandIcon
  **/
  @javax.annotation.Nullable
  public String getDemandIcon() {
    return demandIcon;
  }


  public void setDemandIcon(String demandIcon) {
    this.demandIcon = demandIcon;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandId(Long demandId) {
    
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


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandName(String demandName) {
    
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


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner evaluateType(Long evaluateType) {
    
    this.evaluateType = evaluateType;
    return this;
  }

   /**
   * 
   * @return evaluateType
  **/
  @javax.annotation.Nullable
  public Long getEvaluateType() {
    return evaluateType;
  }


  public void setEvaluateType(Long evaluateType) {
    this.evaluateType = evaluateType;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner expirationTime(String expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * 
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  public String getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner expirationTimeEnd(String expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public String getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(String expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner firstClassCategory(Long firstClassCategory) {
    
    this.firstClassCategory = firstClassCategory;
    return this;
  }

   /**
   * 
   * @return firstClassCategory
  **/
  @javax.annotation.Nullable
  public Long getFirstClassCategory() {
    return firstClassCategory;
  }


  public void setFirstClassCategory(Long firstClassCategory) {
    this.firstClassCategory = firstClassCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner highProfitChallenge(Long highProfitChallenge) {
    
    this.highProfitChallenge = highProfitChallenge;
    return this;
  }

   /**
   * 
   * @return highProfitChallenge
  **/
  @javax.annotation.Nullable
  public Long getHighProfitChallenge() {
    return highProfitChallenge;
  }


  public void setHighProfitChallenge(Long highProfitChallenge) {
    this.highProfitChallenge = highProfitChallenge;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner itemComponentType(Long itemComponentType) {
    
    this.itemComponentType = itemComponentType;
    return this;
  }

   /**
   * 
   * @return itemComponentType
  **/
  @javax.annotation.Nullable
  public Long getItemComponentType() {
    return itemComponentType;
  }


  public void setItemComponentType(Long itemComponentType) {
    this.itemComponentType = itemComponentType;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner mcnProfitRate(Long mcnProfitRate) {
    
    this.mcnProfitRate = mcnProfitRate;
    return this;
  }

   /**
   * 
   * @return mcnProfitRate
  **/
  @javax.annotation.Nullable
  public Long getMcnProfitRate() {
    return mcnProfitRate;
  }


  public void setMcnProfitRate(Long mcnProfitRate) {
    this.mcnProfitRate = mcnProfitRate;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner payType(Long payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * 
   * @return payType
  **/
  @javax.annotation.Nullable
  public Long getPayType() {
    return payType;
  }


  public void setPayType(Long payType) {
    this.payType = payType;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletCategory(Long playletCategory) {
    
    this.playletCategory = playletCategory;
    return this;
  }

   /**
   * 
   * @return playletCategory
  **/
  @javax.annotation.Nullable
  public Long getPlayletCategory() {
    return playletCategory;
  }


  public void setPlayletCategory(Long playletCategory) {
    this.playletCategory = playletCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletFirstWeek(Long playletFirstWeek) {
    
    this.playletFirstWeek = playletFirstWeek;
    return this;
  }

   /**
   * 
   * @return playletFirstWeek
  **/
  @javax.annotation.Nullable
  public Long getPlayletFirstWeek() {
    return playletFirstWeek;
  }


  public void setPlayletFirstWeek(Long playletFirstWeek) {
    this.playletFirstWeek = playletFirstWeek;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletGender(List<Long> playletGender) {
    
    this.playletGender = playletGender;
    return this;
  }

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner addPlayletGenderItem(Long playletGenderItem) {
    if (this.playletGender == null) {
      this.playletGender = new ArrayList<>();
    }
    this.playletGender.add(playletGenderItem);
    return this;
  }

   /**
   * 
   * @return playletGender
  **/
  @javax.annotation.Nullable
  public List<Long> getPlayletGender() {
    return playletGender;
  }


  public void setPlayletGender(List<Long> playletGender) {
    this.playletGender = playletGender;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletHot(Long playletHot) {
    
    this.playletHot = playletHot;
    return this;
  }

   /**
   * 
   * @return playletHot
  **/
  @javax.annotation.Nullable
  public Long getPlayletHot() {
    return playletHot;
  }


  public void setPlayletHot(Long playletHot) {
    this.playletHot = playletHot;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletSecondWeek(Long playletSecondWeek) {
    
    this.playletSecondWeek = playletSecondWeek;
    return this;
  }

   /**
   * 
   * @return playletSecondWeek
  **/
  @javax.annotation.Nullable
  public Long getPlayletSecondWeek() {
    return playletSecondWeek;
  }


  public void setPlayletSecondWeek(Long playletSecondWeek) {
    this.playletSecondWeek = playletSecondWeek;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner playletTheme(List<Long> playletTheme) {
    
    this.playletTheme = playletTheme;
    return this;
  }

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner addPlayletThemeItem(Long playletThemeItem) {
    if (this.playletTheme == null) {
      this.playletTheme = new ArrayList<>();
    }
    this.playletTheme.add(playletThemeItem);
    return this;
  }

   /**
   * 
   * @return playletTheme
  **/
  @javax.annotation.Nullable
  public List<Long> getPlayletTheme() {
    return playletTheme;
  }


  public void setPlayletTheme(List<Long> playletTheme) {
    this.playletTheme = playletTheme;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner productCategory(Long productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

   /**
   * 
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public Long getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(Long productCategory) {
    this.productCategory = productCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner profitRateChannel(Map<String, Long> profitRateChannel) {
    
    this.profitRateChannel = profitRateChannel;
    return this;
  }

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner putProfitRateChannelItem(String key, Long profitRateChannelItem) {
    if (this.profitRateChannel == null) {
      this.profitRateChannel = new HashMap<>();
    }
    this.profitRateChannel.put(key, profitRateChannelItem);
    return this;
  }

   /**
   * 
   * @return profitRateChannel
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getProfitRateChannel() {
    return profitRateChannel;
  }


  public void setProfitRateChannel(Map<String, Long> profitRateChannel) {
    this.profitRateChannel = profitRateChannel;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner realCost(Long realCost) {
    
    this.realCost = realCost;
    return this;
  }

   /**
   * 
   * @return realCost
  **/
  @javax.annotation.Nullable
  public Long getRealCost() {
    return realCost;
  }


  public void setRealCost(Long realCost) {
    this.realCost = realCost;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner secondClassCategory(Long secondClassCategory) {
    
    this.secondClassCategory = secondClassCategory;
    return this;
  }

   /**
   * 
   * @return secondClassCategory
  **/
  @javax.annotation.Nullable
  public Long getSecondClassCategory() {
    return secondClassCategory;
  }


  public void setSecondClassCategory(Long secondClassCategory) {
    this.secondClassCategory = secondClassCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner smallAppInfo(StarMcnGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo smallAppInfo) {
    
    this.smallAppInfo = smallAppInfo;
    return this;
  }

   /**
   * Get smallAppInfo
   * @return smallAppInfo
  **/
  @javax.annotation.Nullable
  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo getSmallAppInfo() {
    return smallAppInfo;
  }


  public void setSmallAppInfo(StarMcnGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo smallAppInfo) {
    this.smallAppInfo = smallAppInfo;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner totalBudget(Long totalBudget) {
    
    this.totalBudget = totalBudget;
    return this;
  }

   /**
   * 
   * @return totalBudget
  **/
  @javax.annotation.Nullable
  public Long getTotalBudget() {
    return totalBudget;
  }


  public void setTotalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner videoType(Long videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * 
   * @return videoType
  **/
  @javax.annotation.Nullable
  public Long getVideoType() {
    return videoType;
  }


  public void setVideoType(Long videoType) {
    this.videoType = videoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetUnparticipatedTaskV2ResponseDataDataInner starMcnGetUnparticipatedTaskV2ResponseDataDataInner = (StarMcnGetUnparticipatedTaskV2ResponseDataDataInner) o;
    return Objects.equals(this.brand, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.brand) &&
        Objects.equals(this.challengeStatus, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.challengeStatus) &&
        Objects.equals(this.commissionRate, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.commissionRate) &&
        Objects.equals(this.commissionRateIaap, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.commissionRateIaap) &&
        Objects.equals(this.createTime, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.createTime) &&
        Objects.equals(this.demandIcon, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandIcon) &&
        Objects.equals(this.demandId, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandId) &&
        Objects.equals(this.demandName, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandName) &&
        Objects.equals(this.evaluateType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.evaluateType) &&
        Objects.equals(this.expirationTime, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.expirationTimeEnd) &&
        Objects.equals(this.firstClassCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.firstClassCategory) &&
        Objects.equals(this.highProfitChallenge, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.highProfitChallenge) &&
        Objects.equals(this.itemComponentType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.itemComponentType) &&
        Objects.equals(this.mcnProfitRate, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.mcnProfitRate) &&
        Objects.equals(this.payType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.payType) &&
        Objects.equals(this.playletCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletCategory) &&
        Objects.equals(this.playletFirstWeek, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletFirstWeek) &&
        Objects.equals(this.playletGender, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletGender) &&
        Objects.equals(this.playletHot, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletHot) &&
        Objects.equals(this.playletSecondWeek, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletSecondWeek) &&
        Objects.equals(this.playletTheme, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.playletTheme) &&
        Objects.equals(this.price, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.price) &&
        Objects.equals(this.productCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.productCategory) &&
        Objects.equals(this.productName, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.productName) &&
        Objects.equals(this.profitRateChannel, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.profitRateChannel) &&
        Objects.equals(this.realCost, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.realCost) &&
        Objects.equals(this.secondClassCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.secondClassCategory) &&
        Objects.equals(this.smallAppInfo, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.smallAppInfo) &&
        Objects.equals(this.totalBudget, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.totalBudget) &&
        Objects.equals(this.videoType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.videoType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, challengeStatus, commissionRate, commissionRateIaap, createTime, demandIcon, demandId, demandName, evaluateType, expirationTime, expirationTimeEnd, firstClassCategory, highProfitChallenge, itemComponentType, mcnProfitRate, payType, playletCategory, playletFirstWeek, playletGender, playletHot, playletSecondWeek, playletTheme, price, productCategory, productName, profitRateChannel, realCost, secondClassCategory, smallAppInfo, totalBudget, videoType);
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
    sb.append("class StarMcnGetUnparticipatedTaskV2ResponseDataDataInner {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    challengeStatus: ").append(toIndentedString(challengeStatus)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    commissionRateIaap: ").append(toIndentedString(commissionRateIaap)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandIcon: ").append(toIndentedString(demandIcon)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    evaluateType: ").append(toIndentedString(evaluateType)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    expirationTimeEnd: ").append(toIndentedString(expirationTimeEnd)).append("\n");
    sb.append("    firstClassCategory: ").append(toIndentedString(firstClassCategory)).append("\n");
    sb.append("    highProfitChallenge: ").append(toIndentedString(highProfitChallenge)).append("\n");
    sb.append("    itemComponentType: ").append(toIndentedString(itemComponentType)).append("\n");
    sb.append("    mcnProfitRate: ").append(toIndentedString(mcnProfitRate)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    playletCategory: ").append(toIndentedString(playletCategory)).append("\n");
    sb.append("    playletFirstWeek: ").append(toIndentedString(playletFirstWeek)).append("\n");
    sb.append("    playletGender: ").append(toIndentedString(playletGender)).append("\n");
    sb.append("    playletHot: ").append(toIndentedString(playletHot)).append("\n");
    sb.append("    playletSecondWeek: ").append(toIndentedString(playletSecondWeek)).append("\n");
    sb.append("    playletTheme: ").append(toIndentedString(playletTheme)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    profitRateChannel: ").append(toIndentedString(profitRateChannel)).append("\n");
    sb.append("    realCost: ").append(toIndentedString(realCost)).append("\n");
    sb.append("    secondClassCategory: ").append(toIndentedString(secondClassCategory)).append("\n");
    sb.append("    smallAppInfo: ").append(toIndentedString(smallAppInfo)).append("\n");
    sb.append("    totalBudget: ").append(toIndentedString(totalBudget)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("challenge_status");
    openapiFields.add("commission_rate");
    openapiFields.add("commission_rate_iaap");
    openapiFields.add("create_time");
    openapiFields.add("demand_icon");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");
    openapiFields.add("evaluate_type");
    openapiFields.add("expiration_time");
    openapiFields.add("expiration_time_end");
    openapiFields.add("first_class_category");
    openapiFields.add("high_profit_challenge");
    openapiFields.add("item_component_type");
    openapiFields.add("mcn_profit_rate");
    openapiFields.add("pay_type");
    openapiFields.add("playlet_category");
    openapiFields.add("playlet_first_week");
    openapiFields.add("playlet_gender");
    openapiFields.add("playlet_hot");
    openapiFields.add("playlet_second_week");
    openapiFields.add("playlet_theme");
    openapiFields.add("price");
    openapiFields.add("product_category");
    openapiFields.add("product_name");
    openapiFields.add("profit_rate_channel");
    openapiFields.add("real_cost");
    openapiFields.add("second_class_category");
    openapiFields.add("small_app_info");
    openapiFields.add("total_budget");
    openapiFields.add("video_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("video_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetUnparticipatedTaskV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetUnparticipatedTaskV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetUnparticipatedTaskV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetUnparticipatedTaskV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
  */
  public static StarMcnGetUnparticipatedTaskV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

