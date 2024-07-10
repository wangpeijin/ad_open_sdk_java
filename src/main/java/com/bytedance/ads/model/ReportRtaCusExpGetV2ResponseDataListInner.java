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
 * ReportRtaCusExpGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class ReportRtaCusExpGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_BID_COUNT = "bid_count";
  @SerializedName(SERIALIZED_NAME_BID_COUNT)
  private Long bidCount = null;

  public static final String SERIALIZED_NAME_CLICK_COUNT = "click_count";
  @SerializedName(SERIALIZED_NAME_CLICK_COUNT)
  private Long clickCount = null;

  public static final String SERIALIZED_NAME_CONVERT_COUNT = "convert_count";
  @SerializedName(SERIALIZED_NAME_CONVERT_COUNT)
  private Long convertCount = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_REQUEST_COUNT = "request_count";
  @SerializedName(SERIALIZED_NAME_REQUEST_COUNT)
  private Long requestCount = null;

  public static final String SERIALIZED_NAME_RTA_VID = "rta_vid";
  @SerializedName(SERIALIZED_NAME_RTA_VID)
  private String rtaVid = null;

  public static final String SERIALIZED_NAME_SHOW_COUNT = "show_count";
  @SerializedName(SERIALIZED_NAME_SHOW_COUNT)
  private Long showCount = null;

  public static final String SERIALIZED_NAME_WIN_COUNT = "win_count";
  @SerializedName(SERIALIZED_NAME_WIN_COUNT)
  private Long winCount = null;

  public ReportRtaCusExpGetV2ResponseDataListInner() {
  }

  public ReportRtaCusExpGetV2ResponseDataListInner bidCount(Long bidCount) {
    
    this.bidCount = bidCount;
    return this;
  }

   /**
   * rta参竞数
   * @return bidCount
  **/
  @javax.annotation.Nullable
  public Long getBidCount() {
    return bidCount;
  }


  public void setBidCount(Long bidCount) {
    this.bidCount = bidCount;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner clickCount(Long clickCount) {
    
    this.clickCount = clickCount;
    return this;
  }

   /**
   * 点击数
   * @return clickCount
  **/
  @javax.annotation.Nullable
  public Long getClickCount() {
    return clickCount;
  }


  public void setClickCount(Long clickCount) {
    this.clickCount = clickCount;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner convertCount(Long convertCount) {
    
    this.convertCount = convertCount;
    return this;
  }

   /**
   * 转化数
   * @return convertCount
  **/
  @javax.annotation.Nullable
  public Long getConvertCount() {
    return convertCount;
  }


  public void setConvertCount(Long convertCount) {
    this.convertCount = convertCount;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 消耗（元）
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 时间
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner requestCount(Long requestCount) {
    
    this.requestCount = requestCount;
    return this;
  }

   /**
   * rta请求数
   * @return requestCount
  **/
  @javax.annotation.Nullable
  public Long getRequestCount() {
    return requestCount;
  }


  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner rtaVid(String rtaVid) {
    
    this.rtaVid = rtaVid;
    return this;
  }

   /**
   * rta反向联合实验id
   * @return rtaVid
  **/
  @javax.annotation.Nullable
  public String getRtaVid() {
    return rtaVid;
  }


  public void setRtaVid(String rtaVid) {
    this.rtaVid = rtaVid;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner showCount(Long showCount) {
    
    this.showCount = showCount;
    return this;
  }

   /**
   * 展示数
   * @return showCount
  **/
  @javax.annotation.Nullable
  public Long getShowCount() {
    return showCount;
  }


  public void setShowCount(Long showCount) {
    this.showCount = showCount;
  }


  public ReportRtaCusExpGetV2ResponseDataListInner winCount(Long winCount) {
    
    this.winCount = winCount;
    return this;
  }

   /**
   * 竞胜数
   * @return winCount
  **/
  @javax.annotation.Nullable
  public Long getWinCount() {
    return winCount;
  }


  public void setWinCount(Long winCount) {
    this.winCount = winCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaCusExpGetV2ResponseDataListInner reportRtaCusExpGetV2ResponseDataListInner = (ReportRtaCusExpGetV2ResponseDataListInner) o;
    return Objects.equals(this.bidCount, reportRtaCusExpGetV2ResponseDataListInner.bidCount) &&
        Objects.equals(this.clickCount, reportRtaCusExpGetV2ResponseDataListInner.clickCount) &&
        Objects.equals(this.convertCount, reportRtaCusExpGetV2ResponseDataListInner.convertCount) &&
        Objects.equals(this.cost, reportRtaCusExpGetV2ResponseDataListInner.cost) &&
        Objects.equals(this.date, reportRtaCusExpGetV2ResponseDataListInner.date) &&
        Objects.equals(this.requestCount, reportRtaCusExpGetV2ResponseDataListInner.requestCount) &&
        Objects.equals(this.rtaVid, reportRtaCusExpGetV2ResponseDataListInner.rtaVid) &&
        Objects.equals(this.showCount, reportRtaCusExpGetV2ResponseDataListInner.showCount) &&
        Objects.equals(this.winCount, reportRtaCusExpGetV2ResponseDataListInner.winCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCount, clickCount, convertCount, cost, date, requestCount, rtaVid, showCount, winCount);
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
    sb.append("class ReportRtaCusExpGetV2ResponseDataListInner {\n");
    sb.append("    bidCount: ").append(toIndentedString(bidCount)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    convertCount: ").append(toIndentedString(convertCount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    rtaVid: ").append(toIndentedString(rtaVid)).append("\n");
    sb.append("    showCount: ").append(toIndentedString(showCount)).append("\n");
    sb.append("    winCount: ").append(toIndentedString(winCount)).append("\n");
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
    openapiFields.add("bid_count");
    openapiFields.add("click_count");
    openapiFields.add("convert_count");
    openapiFields.add("cost");
    openapiFields.add("date");
    openapiFields.add("request_count");
    openapiFields.add("rta_vid");
    openapiFields.add("show_count");
    openapiFields.add("win_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaCusExpGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaCusExpGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaCusExpGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaCusExpGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaCusExpGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportRtaCusExpGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaCusExpGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaCusExpGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaCusExpGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportRtaCusExpGetV2ResponseDataListInner
  */
  public static ReportRtaCusExpGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaCusExpGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportRtaCusExpGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

