/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay;
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
 * 指定投放时间
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime {
  public static final String SERIALIZED_NAME_RAISE_TIME = "raise_time";
  @SerializedName(SERIALIZED_NAME_RAISE_TIME)
  private String raiseTime = null;

  public static final String SERIALIZED_NAME_REPEAT_DAY = "repeat_day";
  @SerializedName(SERIALIZED_NAME_REPEAT_DAY)
  private List<ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay> repeatDay = null;

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime() {
  }

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime raiseTime(String raiseTime) {
    
    this.raiseTime = raiseTime;
    return this;
  }

   /**
   * 起量时间， 重复周期不传时，格式为yyyy-mm-dd HH:MM 传重复周期时，格式为HH:MM
   * @return raiseTime
  **/
  @javax.annotation.Nullable
  public String getRaiseTime() {
    return raiseTime;
  }


  public void setRaiseTime(String raiseTime) {
    this.raiseTime = raiseTime;
  }


  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime repeatDay(List<ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay> repeatDay) {
    
    this.repeatDay = repeatDay;
    return this;
  }

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime addRepeatDayItem(ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay repeatDayItem) {
    if (this.repeatDay == null) {
      this.repeatDay = new ArrayList<>();
    }
    this.repeatDay.add(repeatDayItem);
    return this;
  }

   /**
   * 重复周期，不传则不重复，仅生效一次 允许值： PER_MONDAY；PER_TUESDAY；PER_WEDNESDAY；PER_THURSDAY；PER_FRIDAY：PER_SATURDAY；PER_SUNDAY；EVERY_DAY
   * @return repeatDay
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay> getRepeatDay() {
    return repeatDay;
  }


  public void setRepeatDay(List<ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay> repeatDay) {
    this.repeatDay = repeatDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime = (ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime) o;
    return Objects.equals(this.raiseTime, toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime.raiseTime) &&
        Objects.equals(this.repeatDay, toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime.repeatDay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiseTime, repeatDay);
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
    sb.append("class ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime {\n");
    sb.append("    raiseTime: ").append(toIndentedString(raiseTime)).append("\n");
    sb.append("    repeatDay: ").append(toIndentedString(repeatDay)).append("\n");
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
    openapiFields.add("raise_time");
    openapiFields.add("repeat_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime
  */
  public static ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

