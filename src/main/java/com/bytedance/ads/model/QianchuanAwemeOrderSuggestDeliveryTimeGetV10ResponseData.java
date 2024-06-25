/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData {
  public static final String SERIALIZED_NAME_SUGGEST_DELIVERY_TIME = "suggest_delivery_time";
  @SerializedName(SERIALIZED_NAME_SUGGEST_DELIVERY_TIME)
  private Double suggestDeliveryTime = null;

  public QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData() {
  }

  public QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData suggestDeliveryTime(Double suggestDeliveryTime) {
    
    this.suggestDeliveryTime = suggestDeliveryTime;
    return this;
  }

   /**
   * 建议追加投放时长 - 短视频：xx天 - 直播：xx小时
   * @return suggestDeliveryTime
  **/
  @javax.annotation.Nullable
  public Double getSuggestDeliveryTime() {
    return suggestDeliveryTime;
  }


  public void setSuggestDeliveryTime(Double suggestDeliveryTime) {
    this.suggestDeliveryTime = suggestDeliveryTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData qianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData = (QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData) o;
    return Objects.equals(this.suggestDeliveryTime, qianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData.suggestDeliveryTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestDeliveryTime);
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
    sb.append("class QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData {\n");
    sb.append("    suggestDeliveryTime: ").append(toIndentedString(suggestDeliveryTime)).append("\n");
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
    openapiFields.add("suggest_delivery_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData
  */
  public static QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderSuggestDeliveryTimeGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

