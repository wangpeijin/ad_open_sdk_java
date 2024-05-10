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
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner;
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
 * StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner> data = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_WORK_ID = "work_id";
  @SerializedName(SERIALIZED_NAME_WORK_ID)
  private Long workId = null;

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner() {
  }

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner data(List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner> data) {
    
    this.data = data;
    return this;
  }

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner addDataItem(StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 详细增量指标数据列表
   * @return data
  **/
  @javax.annotation.Nullable
  public List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner> getData() {
    return data;
  }


  public void setData(List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner> data) {
    this.data = data;
  }


  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 该指标数据的yyyy-MM-dd日期时间, 按天聚合。注意⚠️：BasicData作为通用指标，在增量请求中date为 \&quot;0\&quot; 表示通用数据
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 请求的任务Id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner workId(Long workId) {
    
    this.workId = workId;
    return this;
  }

   /**
   * 请求的作品交付物Id
   * @return workId
  **/
  @javax.annotation.Nullable
  public Long getWorkId() {
    return workId;
  }


  public void setWorkId(Long workId) {
    this.workId = workId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner starReportCustomDataTopicDailyReportV2ResponseDataStatsInner = (StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner) o;
    return Objects.equals(this.data, starReportCustomDataTopicDailyReportV2ResponseDataStatsInner.data) &&
        Objects.equals(this.date, starReportCustomDataTopicDailyReportV2ResponseDataStatsInner.date) &&
        Objects.equals(this.demandId, starReportCustomDataTopicDailyReportV2ResponseDataStatsInner.demandId) &&
        Objects.equals(this.workId, starReportCustomDataTopicDailyReportV2ResponseDataStatsInner.workId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, date, demandId, workId);
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
    sb.append("class StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    workId: ").append(toIndentedString(workId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("date");
    openapiFields.add("demand_id");
    openapiFields.add("work_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("work_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner>() {
           @Override
           public void write(JsonWriter out, StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner
  * @throws IOException if the JSON string is invalid with respect to StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner
  */
  public static StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner.class);
  }

 /**
  * Convert an instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

