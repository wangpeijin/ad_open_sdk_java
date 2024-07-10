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
 * 投放时间信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class BrandAdGetV30ResponseDataAdsInnerScheduleInfo {
  public static final String SERIALIZED_NAME_DATE_WITH_PERIOD = "date_with_period";
  @SerializedName(SERIALIZED_NAME_DATE_WITH_PERIOD)
  private Map<String, List<String>> dateWithPeriod = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo() {
  }

  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo dateWithPeriod(Map<String, List<String>> dateWithPeriod) {
    
    this.dateWithPeriod = dateWithPeriod;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo putDateWithPeriodItem(String key, List<String> dateWithPeriodItem) {
    if (this.dateWithPeriod == null) {
      this.dateWithPeriod = new HashMap<>();
    }
    this.dateWithPeriod.put(key, dateWithPeriodItem);
    return this;
  }

   /**
   * 本次直播用到，投放日期和投放时段，{\&quot;20200102\&quot;: [0800, 0900]}
   * @return dateWithPeriod
  **/
  @javax.annotation.Nullable
  public Map<String, List<String>> getDateWithPeriod() {
    return dateWithPeriod;
  }


  public void setDateWithPeriod(Map<String, List<String>> dateWithPeriod) {
    this.dateWithPeriod = dateWithPeriod;
  }


  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间 \&quot;2020-03-01\&quot;
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放开始时间 \&quot;2020-03-01\&quot;
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerScheduleInfo brandAdGetV30ResponseDataAdsInnerScheduleInfo = (BrandAdGetV30ResponseDataAdsInnerScheduleInfo) o;
    return Objects.equals(this.dateWithPeriod, brandAdGetV30ResponseDataAdsInnerScheduleInfo.dateWithPeriod) &&
        Objects.equals(this.endTime, brandAdGetV30ResponseDataAdsInnerScheduleInfo.endTime) &&
        Objects.equals(this.startTime, brandAdGetV30ResponseDataAdsInnerScheduleInfo.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWithPeriod, endTime, startTime);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerScheduleInfo {\n");
    sb.append("    dateWithPeriod: ").append(toIndentedString(dateWithPeriod)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("date_with_period");
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerScheduleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerScheduleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerScheduleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerScheduleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerScheduleInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerScheduleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerScheduleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerScheduleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerScheduleInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerScheduleInfo
  */
  public static BrandAdGetV30ResponseDataAdsInnerScheduleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerScheduleInfo.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerScheduleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

