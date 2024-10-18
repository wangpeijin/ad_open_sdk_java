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
 * QianchuanKeywordCheckV10ResponseDataFailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanKeywordCheckV10ResponseDataFailListInner {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword = null;

  public QianchuanKeywordCheckV10ResponseDataFailListInner() {
  }

  public QianchuanKeywordCheckV10ResponseDataFailListInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public QianchuanKeywordCheckV10ResponseDataFailListInner keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * 
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanKeywordCheckV10ResponseDataFailListInner qianchuanKeywordCheckV10ResponseDataFailListInner = (QianchuanKeywordCheckV10ResponseDataFailListInner) o;
    return Objects.equals(this.failReason, qianchuanKeywordCheckV10ResponseDataFailListInner.failReason) &&
        Objects.equals(this.keyword, qianchuanKeywordCheckV10ResponseDataFailListInner.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanKeywordCheckV10ResponseDataFailListInner {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("keyword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fail_reason");
    openapiRequiredFields.add("keyword");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanKeywordCheckV10ResponseDataFailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanKeywordCheckV10ResponseDataFailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanKeywordCheckV10ResponseDataFailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanKeywordCheckV10ResponseDataFailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanKeywordCheckV10ResponseDataFailListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanKeywordCheckV10ResponseDataFailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanKeywordCheckV10ResponseDataFailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanKeywordCheckV10ResponseDataFailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanKeywordCheckV10ResponseDataFailListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanKeywordCheckV10ResponseDataFailListInner
  */
  public static QianchuanKeywordCheckV10ResponseDataFailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanKeywordCheckV10ResponseDataFailListInner.class);
  }

 /**
  * Convert an instance of QianchuanKeywordCheckV10ResponseDataFailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

