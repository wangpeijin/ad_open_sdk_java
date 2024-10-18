/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * 开始/结束/变红的时间戳
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsClueRefundViewGetV2ResponseDataShowTimeDetails {
  public static final String SERIALIZED_NAME_BEGIN_TIME = "begin_time";
  @SerializedName(SERIALIZED_NAME_BEGIN_TIME)
  private Long beginTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_RED_LINE_TIME = "red_line_time";
  @SerializedName(SERIALIZED_NAME_RED_LINE_TIME)
  private Long redLineTime = null;

  public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails() {
  }

  public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails beginTime(Long beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * 开始时间
   * @return beginTime
  **/
  @javax.annotation.Nullable
  public Long getBeginTime() {
    return beginTime;
  }


  public void setBeginTime(Long beginTime) {
    this.beginTime = beginTime;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails redLineTime(Long redLineTime) {
    
    this.redLineTime = redLineTime;
    return this;
  }

   /**
   * 开始展示红色倒计时的时间，飞鱼SDK前端所需字段，传入即可
   * @return redLineTime
  **/
  @javax.annotation.Nullable
  public Long getRedLineTime() {
    return redLineTime;
  }


  public void setRedLineTime(Long redLineTime) {
    this.redLineTime = redLineTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundViewGetV2ResponseDataShowTimeDetails toolsClueRefundViewGetV2ResponseDataShowTimeDetails = (ToolsClueRefundViewGetV2ResponseDataShowTimeDetails) o;
    return Objects.equals(this.beginTime, toolsClueRefundViewGetV2ResponseDataShowTimeDetails.beginTime) &&
        Objects.equals(this.endTime, toolsClueRefundViewGetV2ResponseDataShowTimeDetails.endTime) &&
        Objects.equals(this.redLineTime, toolsClueRefundViewGetV2ResponseDataShowTimeDetails.redLineTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime, redLineTime);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseDataShowTimeDetails {\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    redLineTime: ").append(toIndentedString(redLineTime)).append("\n");
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
    openapiFields.add("begin_time");
    openapiFields.add("end_time");
    openapiFields.add("red_line_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseDataShowTimeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseDataShowTimeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowTimeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseDataShowTimeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowTimeDetails>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseDataShowTimeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseDataShowTimeDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseDataShowTimeDetails
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseDataShowTimeDetails
  */
  public static ToolsClueRefundViewGetV2ResponseDataShowTimeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseDataShowTimeDetails.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseDataShowTimeDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

