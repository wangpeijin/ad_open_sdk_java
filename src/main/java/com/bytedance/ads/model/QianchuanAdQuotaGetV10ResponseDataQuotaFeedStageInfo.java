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
 * 当前所在投放阶段信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo {
  public static final String SERIALIZED_NAME_END_DAY = "end_day";
  @SerializedName(SERIALIZED_NAME_END_DAY)
  private String endDay = null;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "is_primary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Long isPrimary = null;

  public static final String SERIALIZED_NAME_START_DAY = "start_day";
  @SerializedName(SERIALIZED_NAME_START_DAY)
  private String startDay = null;

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo() {
  }

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo endDay(String endDay) {
    
    this.endDay = endDay;
    return this;
  }

   /**
   * 投放初期截止日期
   * @return endDay
  **/
  @javax.annotation.Nullable
  public String getEndDay() {
    return endDay;
  }


  public void setEndDay(String endDay) {
    this.endDay = endDay;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo isPrimary(Long isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * 是否在投放初期,0：否,
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  public Long getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Long isPrimary) {
    this.isPrimary = isPrimary;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo startDay(String startDay) {
    
    this.startDay = startDay;
    return this;
  }

   /**
   * 投放初期起始日期
   * @return startDay
  **/
  @javax.annotation.Nullable
  public String getStartDay() {
    return startDay;
  }


  public void setStartDay(String startDay) {
    this.startDay = startDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo qianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo = (QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo) o;
    return Objects.equals(this.endDay, qianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.endDay) &&
        Objects.equals(this.isPrimary, qianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.isPrimary) &&
        Objects.equals(this.startDay, qianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.startDay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDay, isPrimary, startDay);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo {\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
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
    openapiFields.add("end_day");
    openapiFields.add("is_primary");
    openapiFields.add("start_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo
  */
  public static QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

