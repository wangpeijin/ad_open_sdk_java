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
import com.bytedance.ads.model.StarMcnGetContractedChallengeListV2ResponseDataDataInnerSmallAppInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
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
 * StarMcnGetContractedChallengeListV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarMcnGetContractedChallengeListV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY = "account_divide_day";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY)
  private Long accountDivideDay = null;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_CHALLENGE_STATUS = "challenge_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_STATUS)
  private Integer challengeStatus = null;

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

  public static final String SERIALIZED_NAME_IAA_INCOME = "iaa_income";
  @SerializedName(SERIALIZED_NAME_IAA_INCOME)
  private Long iaaIncome = null;

  public static final String SERIALIZED_NAME_ITEM_COMPONENT_TYPE = "item_component_type";
  @SerializedName(SERIALIZED_NAME_ITEM_COMPONENT_TYPE)
  private Long itemComponentType = null;

  public static final String SERIALIZED_NAME_MCN_PROFIT_RATE = "mcn_profit_rate";
  @SerializedName(SERIALIZED_NAME_MCN_PROFIT_RATE)
  private Long mcnProfitRate = null;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private Long payType = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price = null;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "product_category";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private Integer productCategory = null;

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
  private StarMcnGetContractedChallengeListV2ResponseDataDataInnerSmallAppInfo smallAppInfo = null;

  public static final String SERIALIZED_NAME_TOTAL_BUDGET = "total_budget";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUDGET)
  private Long totalBudget = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private Long videoType = null;

  public StarMcnGetContractedChallengeListV2ResponseDataDataInner() {
  }

  public StarMcnGetContractedChallengeListV2ResponseDataDataInner accountDivideDay(Long accountDivideDay) {
    
    this.accountDivideDay = accountDivideDay;
    return this;
  }

   /**
   * 
   * @return accountDivideDay
  **/
  @javax.annotation.Nullable
  public Long getAccountDivideDay() {
    return accountDivideDay;
  }


  public void setAccountDivideDay(Long accountDivideDay) {
    this.accountDivideDay = accountDivideDay;
  }


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner brand(String brand) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner challengeStatus(Integer challengeStatus) {
    
    this.challengeStatus = challengeStatus;
    return this;
  }

   /**
   * 
   * @return challengeStatus
  **/
  @javax.annotation.Nullable
  public Integer getChallengeStatus() {
    return challengeStatus;
  }


  public void setChallengeStatus(Integer challengeStatus) {
    this.challengeStatus = challengeStatus;
  }


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner commissionRate(Long commissionRate) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner commissionRateIaap(String commissionRateIaap) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner createTime(String createTime) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner demandIcon(String demandIcon) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner demandId(Long demandId) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner demandName(String demandName) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner evaluateType(Long evaluateType) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner expirationTime(String expirationTime) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner expirationTimeEnd(String expirationTimeEnd) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner firstClassCategory(Long firstClassCategory) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner iaaIncome(Long iaaIncome) {
    
    this.iaaIncome = iaaIncome;
    return this;
  }

   /**
   * 
   * @return iaaIncome
  **/
  @javax.annotation.Nullable
  public Long getIaaIncome() {
    return iaaIncome;
  }


  public void setIaaIncome(Long iaaIncome) {
    this.iaaIncome = iaaIncome;
  }


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner itemComponentType(Long itemComponentType) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner mcnProfitRate(Long mcnProfitRate) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner payType(Long payType) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner price(Long price) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner productCategory(Integer productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

   /**
   * 
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public Integer getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(Integer productCategory) {
    this.productCategory = productCategory;
  }


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner productName(String productName) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner profitRateChannel(Map<String, Long> profitRateChannel) {
    
    this.profitRateChannel = profitRateChannel;
    return this;
  }

  public StarMcnGetContractedChallengeListV2ResponseDataDataInner putProfitRateChannelItem(String key, Long profitRateChannelItem) {
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner realCost(Long realCost) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner secondClassCategory(Long secondClassCategory) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner smallAppInfo(StarMcnGetContractedChallengeListV2ResponseDataDataInnerSmallAppInfo smallAppInfo) {
    
    this.smallAppInfo = smallAppInfo;
    return this;
  }

   /**
   * Get smallAppInfo
   * @return smallAppInfo
  **/
  @javax.annotation.Nullable
  public StarMcnGetContractedChallengeListV2ResponseDataDataInnerSmallAppInfo getSmallAppInfo() {
    return smallAppInfo;
  }


  public void setSmallAppInfo(StarMcnGetContractedChallengeListV2ResponseDataDataInnerSmallAppInfo smallAppInfo) {
    this.smallAppInfo = smallAppInfo;
  }


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner totalBudget(Long totalBudget) {
    
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


  public StarMcnGetContractedChallengeListV2ResponseDataDataInner videoType(Long videoType) {
    
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
    StarMcnGetContractedChallengeListV2ResponseDataDataInner starMcnGetContractedChallengeListV2ResponseDataDataInner = (StarMcnGetContractedChallengeListV2ResponseDataDataInner) o;
    return Objects.equals(this.accountDivideDay, starMcnGetContractedChallengeListV2ResponseDataDataInner.accountDivideDay) &&
        Objects.equals(this.brand, starMcnGetContractedChallengeListV2ResponseDataDataInner.brand) &&
        Objects.equals(this.challengeStatus, starMcnGetContractedChallengeListV2ResponseDataDataInner.challengeStatus) &&
        Objects.equals(this.commissionRate, starMcnGetContractedChallengeListV2ResponseDataDataInner.commissionRate) &&
        Objects.equals(this.commissionRateIaap, starMcnGetContractedChallengeListV2ResponseDataDataInner.commissionRateIaap) &&
        Objects.equals(this.createTime, starMcnGetContractedChallengeListV2ResponseDataDataInner.createTime) &&
        Objects.equals(this.demandIcon, starMcnGetContractedChallengeListV2ResponseDataDataInner.demandIcon) &&
        Objects.equals(this.demandId, starMcnGetContractedChallengeListV2ResponseDataDataInner.demandId) &&
        Objects.equals(this.demandName, starMcnGetContractedChallengeListV2ResponseDataDataInner.demandName) &&
        Objects.equals(this.evaluateType, starMcnGetContractedChallengeListV2ResponseDataDataInner.evaluateType) &&
        Objects.equals(this.expirationTime, starMcnGetContractedChallengeListV2ResponseDataDataInner.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starMcnGetContractedChallengeListV2ResponseDataDataInner.expirationTimeEnd) &&
        Objects.equals(this.firstClassCategory, starMcnGetContractedChallengeListV2ResponseDataDataInner.firstClassCategory) &&
        Objects.equals(this.iaaIncome, starMcnGetContractedChallengeListV2ResponseDataDataInner.iaaIncome) &&
        Objects.equals(this.itemComponentType, starMcnGetContractedChallengeListV2ResponseDataDataInner.itemComponentType) &&
        Objects.equals(this.mcnProfitRate, starMcnGetContractedChallengeListV2ResponseDataDataInner.mcnProfitRate) &&
        Objects.equals(this.payType, starMcnGetContractedChallengeListV2ResponseDataDataInner.payType) &&
        Objects.equals(this.price, starMcnGetContractedChallengeListV2ResponseDataDataInner.price) &&
        Objects.equals(this.productCategory, starMcnGetContractedChallengeListV2ResponseDataDataInner.productCategory) &&
        Objects.equals(this.productName, starMcnGetContractedChallengeListV2ResponseDataDataInner.productName) &&
        Objects.equals(this.profitRateChannel, starMcnGetContractedChallengeListV2ResponseDataDataInner.profitRateChannel) &&
        Objects.equals(this.realCost, starMcnGetContractedChallengeListV2ResponseDataDataInner.realCost) &&
        Objects.equals(this.secondClassCategory, starMcnGetContractedChallengeListV2ResponseDataDataInner.secondClassCategory) &&
        Objects.equals(this.smallAppInfo, starMcnGetContractedChallengeListV2ResponseDataDataInner.smallAppInfo) &&
        Objects.equals(this.totalBudget, starMcnGetContractedChallengeListV2ResponseDataDataInner.totalBudget) &&
        Objects.equals(this.videoType, starMcnGetContractedChallengeListV2ResponseDataDataInner.videoType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDivideDay, brand, challengeStatus, commissionRate, commissionRateIaap, createTime, demandIcon, demandId, demandName, evaluateType, expirationTime, expirationTimeEnd, firstClassCategory, iaaIncome, itemComponentType, mcnProfitRate, payType, price, productCategory, productName, profitRateChannel, realCost, secondClassCategory, smallAppInfo, totalBudget, videoType);
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
    sb.append("class StarMcnGetContractedChallengeListV2ResponseDataDataInner {\n");
    sb.append("    accountDivideDay: ").append(toIndentedString(accountDivideDay)).append("\n");
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
    sb.append("    iaaIncome: ").append(toIndentedString(iaaIncome)).append("\n");
    sb.append("    itemComponentType: ").append(toIndentedString(itemComponentType)).append("\n");
    sb.append("    mcnProfitRate: ").append(toIndentedString(mcnProfitRate)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
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
    openapiFields.add("account_divide_day");
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
    openapiFields.add("iaa_income");
    openapiFields.add("item_component_type");
    openapiFields.add("mcn_profit_rate");
    openapiFields.add("pay_type");
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
       if (!StarMcnGetContractedChallengeListV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetContractedChallengeListV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetContractedChallengeListV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetContractedChallengeListV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetContractedChallengeListV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetContractedChallengeListV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetContractedChallengeListV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetContractedChallengeListV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetContractedChallengeListV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetContractedChallengeListV2ResponseDataDataInner
  */
  public static StarMcnGetContractedChallengeListV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetContractedChallengeListV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnGetContractedChallengeListV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

