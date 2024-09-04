/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarStarAdUniteTaskItemListV2DataStatInfoItemStatus;
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
 * StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NICK_NAME = "author_nick_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NICK_NAME)
  private String authorNickName = null;

  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CLICK_RATE = "click_rate";
  @SerializedName(SERIALIZED_NAME_CLICK_RATE)
  private Double clickRate = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Long cost = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_STATUS = "item_status";
  @SerializedName(SERIALIZED_NAME_ITEM_STATUS)
  private StarStarAdUniteTaskItemListV2DataStatInfoItemStatus itemStatus = null;

  public static final String SERIALIZED_NAME_ITEM_TITLE = "item_title";
  @SerializedName(SERIALIZED_NAME_ITEM_TITLE)
  private String itemTitle = null;

  public static final String SERIALIZED_NAME_ITEM_URL = "item_url";
  @SerializedName(SERIALIZED_NAME_ITEM_URL)
  private String itemUrl = null;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Long payAmount = null;

  public static final String SERIALIZED_NAME_PLAY_CNT = "play_cnt";
  @SerializedName(SERIALIZED_NAME_PLAY_CNT)
  private Long playCnt = null;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "release_time";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private Long releaseTime = null;

  public static final String SERIALIZED_NAME_SETTLED_COST = "settled_cost";
  @SerializedName(SERIALIZED_NAME_SETTLED_COST)
  private Long settledCost = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_STAT_DATE = "stat_date";
  @SerializedName(SERIALIZED_NAME_STAT_DATE)
  private String statDate = null;

  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner() {
  }

  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人id
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner authorNickName(String authorNickName) {
    
    this.authorNickName = authorNickName;
    return this;
  }

   /**
   * 达人昵称
   * @return authorNickName
  **/
  @javax.annotation.Nullable
  public String getAuthorNickName() {
    return authorNickName;
  }


  public void setAuthorNickName(String authorNickName) {
    this.authorNickName = authorNickName;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 总点击量，实时更新（自然流量组件点击量+广告点击量）
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner clickRate(Double clickRate) {
    
    this.clickRate = clickRate;
    return this;
  }

   /**
   * 总点击率&#x3D;总点击量/总展示量 
   * @return clickRate
  **/
  @javax.annotation.Nullable
  public Double getClickRate() {
    return clickRate;
  }


  public void setClickRate(Double clickRate) {
    this.clickRate = clickRate;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 转化数，实时更新
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner cost(Long cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 预估实时消耗，实时更新，单位：元*100000，建议获取后除以100000展示为元单位
   * @return cost
  **/
  @javax.annotation.Nullable
  public Long getCost() {
    return cost;
  }


  public void setCost(Long cost) {
    this.cost = cost;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner itemStatus(StarStarAdUniteTaskItemListV2DataStatInfoItemStatus itemStatus) {
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  public StarStarAdUniteTaskItemListV2DataStatInfoItemStatus getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(StarStarAdUniteTaskItemListV2DataStatInfoItemStatus itemStatus) {
    this.itemStatus = itemStatus;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner itemTitle(String itemTitle) {
    
    this.itemTitle = itemTitle;
    return this;
  }

   /**
   * 视频标题
   * @return itemTitle
  **/
  @javax.annotation.Nullable
  public String getItemTitle() {
    return itemTitle;
  }


  public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner itemUrl(String itemUrl) {
    
    this.itemUrl = itemUrl;
    return this;
  }

   /**
   * 视频链接
   * @return itemUrl
  **/
  @javax.annotation.Nullable
  public String getItemUrl() {
    return itemUrl;
  }


  public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner payAmount(Long payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 回传的付费金额，回传后更新，单位：元*100000，建议获取后除以100000展示为元单位
   * @return payAmount
  **/
  @javax.annotation.Nullable
  public Long getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Long payAmount) {
    this.payAmount = payAmount;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner playCnt(Long playCnt) {
    
    this.playCnt = playCnt;
    return this;
  }

   /**
   * 播放量，T+1更新
   * @return playCnt
  **/
  @javax.annotation.Nullable
  public Long getPlayCnt() {
    return playCnt;
  }


  public void setPlayCnt(Long playCnt) {
    this.playCnt = playCnt;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner releaseTime(Long releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 视频发布日期
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public Long getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(Long releaseTime) {
    this.releaseTime = releaseTime;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner settledCost(Long settledCost) {
    
    this.settledCost = settledCost;
    return this;
  }

   /**
   * 累计已结算消耗，T+1更新，单位：元*100000，建议获取后除以100000展示为元单位
   * @return settledCost
  **/
  @javax.annotation.Nullable
  public Long getSettledCost() {
    return settledCost;
  }


  public void setSettledCost(Long settledCost) {
    this.settledCost = settledCost;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 总展示量，实时更新（自然流量组件展示量+广告展示量）
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户的星图id
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner statDate(String statDate) {
    
    this.statDate = statDate;
    return this;
  }

   /**
   * 数据日期，格式yyyy-mm-dd，只和播放量、转化数、预估消耗相关 
   * @return statDate
  **/
  @javax.annotation.Nullable
  public String getStatDate() {
    return statDate;
  }


  public void setStatDate(String statDate) {
    this.statDate = statDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner starStarAdUniteTaskItemListV2ResponseDataStatInfoInner = (StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner) o;
    return Objects.equals(this.authorId, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.authorId) &&
        Objects.equals(this.authorNickName, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.authorNickName) &&
        Objects.equals(this.click, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.click) &&
        Objects.equals(this.clickRate, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.clickRate) &&
        Objects.equals(this.convert, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.convert) &&
        Objects.equals(this.cost, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.cost) &&
        Objects.equals(this.demandId, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.demandId) &&
        Objects.equals(this.itemId, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.itemId) &&
        Objects.equals(this.itemStatus, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.itemStatus) &&
        Objects.equals(this.itemTitle, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.itemTitle) &&
        Objects.equals(this.itemUrl, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.itemUrl) &&
        Objects.equals(this.payAmount, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.payAmount) &&
        Objects.equals(this.playCnt, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.playCnt) &&
        Objects.equals(this.releaseTime, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.releaseTime) &&
        Objects.equals(this.settledCost, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.settledCost) &&
        Objects.equals(this.show, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.show) &&
        Objects.equals(this.starId, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.starId) &&
        Objects.equals(this.statDate, starStarAdUniteTaskItemListV2ResponseDataStatInfoInner.statDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorNickName, click, clickRate, convert, cost, demandId, itemId, itemStatus, itemTitle, itemUrl, payAmount, playCnt, releaseTime, settledCost, show, starId, statDate);
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
    sb.append("class StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorNickName: ").append(toIndentedString(authorNickName)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    itemTitle: ").append(toIndentedString(itemTitle)).append("\n");
    sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    playCnt: ").append(toIndentedString(playCnt)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    settledCost: ").append(toIndentedString(settledCost)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
    sb.append("    statDate: ").append(toIndentedString(statDate)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_nick_name");
    openapiFields.add("click");
    openapiFields.add("click_rate");
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("demand_id");
    openapiFields.add("item_id");
    openapiFields.add("item_status");
    openapiFields.add("item_title");
    openapiFields.add("item_url");
    openapiFields.add("pay_amount");
    openapiFields.add("play_cnt");
    openapiFields.add("release_time");
    openapiFields.add("settled_cost");
    openapiFields.add("show");
    openapiFields.add("star_id");
    openapiFields.add("stat_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_id");
    openapiRequiredFields.add("author_nick_name");
    openapiRequiredFields.add("convert");
    openapiRequiredFields.add("cost");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("item_status");
    openapiRequiredFields.add("item_title");
    openapiRequiredFields.add("item_url");
    openapiRequiredFields.add("play_cnt");
    openapiRequiredFields.add("release_time");
    openapiRequiredFields.add("settled_cost");
    openapiRequiredFields.add("star_id");
    openapiRequiredFields.add("stat_date");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner>() {
           @Override
           public void write(JsonWriter out, StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner
  */
  public static StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner.class);
  }

 /**
  * Convert an instance of StarStarAdUniteTaskItemListV2ResponseDataStatInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

