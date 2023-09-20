/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
 * ReportRtaExpGetV2ResponseDataDataArrayInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ReportRtaExpGetV2ResponseDataDataArrayInner {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy = null;

  public static final String SERIALIZED_NAME_WIN_RATIO = "win_ratio";
  @SerializedName(SERIALIZED_NAME_WIN_RATIO)
  private Double winRatio = null;

  public ReportRtaExpGetV2ResponseDataDataArrayInner() {
  }

  public ReportRtaExpGetV2ResponseDataDataArrayInner click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 展现数据-点击数 当头条用户点击广告素材时，触发点击事件，该事件被认为是一次有效的广告点击
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 转化数据-转化数 将转化数记录在转化事件发生的时间上。建议广告主考核成本时参考“转化数据（计费时间）”例如您的广告在早上8点进行了展示和点击，用户晚上19点发生了激活行为，我们会把激活数披露在晚上19点
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 展现数据-总花费 表示广告在投放期内的预估花费金额,当天数据可能会有波动，次日稳定
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 数据统计日期，格式YYYYMMDD
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 展现数据-展示数 广告展示给用户的次数。计算方式：经平台判定有效且被计费的展示次数
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner strategy(String strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * 联合实验策略，请求入参
   * @return strategy
  **/
  @javax.annotation.Nullable
  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  public ReportRtaExpGetV2ResponseDataDataArrayInner winRatio(Double winRatio) {
    
    this.winRatio = winRatio;
    return this;
  }

   /**
   * 竞胜率。 竞胜率&#x3D;竞胜数/参竞数，代表广告主参竞请求的胜出比例
   * @return winRatio
  **/
  @javax.annotation.Nullable
  public Double getWinRatio() {
    return winRatio;
  }


  public void setWinRatio(Double winRatio) {
    this.winRatio = winRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaExpGetV2ResponseDataDataArrayInner reportRtaExpGetV2ResponseDataDataArrayInner = (ReportRtaExpGetV2ResponseDataDataArrayInner) o;
    return Objects.equals(this.click, reportRtaExpGetV2ResponseDataDataArrayInner.click) &&
        Objects.equals(this.convert, reportRtaExpGetV2ResponseDataDataArrayInner.convert) &&
        Objects.equals(this.cost, reportRtaExpGetV2ResponseDataDataArrayInner.cost) &&
        Objects.equals(this.date, reportRtaExpGetV2ResponseDataDataArrayInner.date) &&
        Objects.equals(this.show, reportRtaExpGetV2ResponseDataDataArrayInner.show) &&
        Objects.equals(this.strategy, reportRtaExpGetV2ResponseDataDataArrayInner.strategy) &&
        Objects.equals(this.winRatio, reportRtaExpGetV2ResponseDataDataArrayInner.winRatio);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, convert, cost, date, show, strategy, winRatio);
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
    sb.append("class ReportRtaExpGetV2ResponseDataDataArrayInner {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    winRatio: ").append(toIndentedString(winRatio)).append("\n");
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
    openapiFields.add("click");
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("date");
    openapiFields.add("show");
    openapiFields.add("strategy");
    openapiFields.add("win_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaExpGetV2ResponseDataDataArrayInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaExpGetV2ResponseDataDataArrayInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaExpGetV2ResponseDataDataArrayInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaExpGetV2ResponseDataDataArrayInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaExpGetV2ResponseDataDataArrayInner>() {
           @Override
           public void write(JsonWriter out, ReportRtaExpGetV2ResponseDataDataArrayInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaExpGetV2ResponseDataDataArrayInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaExpGetV2ResponseDataDataArrayInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaExpGetV2ResponseDataDataArrayInner
  * @throws IOException if the JSON string is invalid with respect to ReportRtaExpGetV2ResponseDataDataArrayInner
  */
  public static ReportRtaExpGetV2ResponseDataDataArrayInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaExpGetV2ResponseDataDataArrayInner.class);
  }

 /**
  * Convert an instance of ReportRtaExpGetV2ResponseDataDataArrayInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

