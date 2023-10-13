/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * 指定投放时间，当is_effective_now为FALSE时填写有效
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime {
  public static final String SERIALIZED_NAME_RAISE_TIME = "raise_time";
  @SerializedName(SERIALIZED_NAME_RAISE_TIME)
  private String raiseTime = null;

  public static final String SERIALIZED_NAME_REPEATED_DAY = "repeated_day";
  @SerializedName(SERIALIZED_NAME_REPEATED_DAY)
  private List<ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay> repeatedDay = null;

  public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime() {
  }

  public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime raiseTime(String raiseTime) {
    
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


  public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime repeatedDay(List<ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay> repeatedDay) {
    
    this.repeatedDay = repeatedDay;
    return this;
  }

  public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime addRepeatedDayItem(ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay repeatedDayItem) {
    if (this.repeatedDay == null) {
      this.repeatedDay = new ArrayList<>();
    }
    this.repeatedDay.add(repeatedDayItem);
    return this;
  }

   /**
   * 重复周期，不传则不重复，仅生效一次，所有枚举传入则每天重复
   * @return repeatedDay
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay> getRepeatedDay() {
    return repeatedDay;
  }


  public void setRepeatedDay(List<ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay> repeatedDay) {
    this.repeatedDay = repeatedDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime toolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime = (ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime) o;
    return Objects.equals(this.raiseTime, toolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime.raiseTime) &&
        Objects.equals(this.repeatedDay, toolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime.repeatedDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiseTime, repeatedDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime {\n");
    sb.append("    raiseTime: ").append(toIndentedString(raiseTime)).append("\n");
    sb.append("    repeatedDay: ").append(toIndentedString(repeatedDay)).append("\n");
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
    openapiFields.add("repeated_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime
  */
  public static ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

