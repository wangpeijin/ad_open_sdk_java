/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormExtendInfoCountConfigCountType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig {
  public static final String SERIALIZED_NAME_COUNT_TYPE = "count_type";
  @SerializedName(SERIALIZED_NAME_COUNT_TYPE)
  private ClueCouponDetailV2DataFormExtendInfoCountConfigCountType countType = null;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix = null;

  public static final String SERIALIZED_NAME_START_NUM = "start_num";
  @SerializedName(SERIALIZED_NAME_START_NUM)
  private Long startNum = null;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix = null;

  public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig() {
  }

  public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig countType(ClueCouponDetailV2DataFormExtendInfoCountConfigCountType countType) {
    
    this.countType = countType;
    return this;
  }

   /**
   * Get countType
   * @return countType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormExtendInfoCountConfigCountType getCountType() {
    return countType;
  }


  public void setCountType(ClueCouponDetailV2DataFormExtendInfoCountConfigCountType countType) {
    this.countType = countType;
  }


  public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * 
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig startNum(Long startNum) {
    
    this.startNum = startNum;
    return this;
  }

   /**
   * 
   * @return startNum
  **/
  @javax.annotation.Nullable
  public Long getStartNum() {
    return startNum;
  }


  public void setStartNum(Long startNum) {
    this.startNum = startNum;
  }


  public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * 
   * @return suffix
  **/
  @javax.annotation.Nullable
  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig clueCouponDetailV2ResponseDataFormExtendInfoCountConfig = (ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig) o;
    return Objects.equals(this.countType, clueCouponDetailV2ResponseDataFormExtendInfoCountConfig.countType) &&
        Objects.equals(this.prefix, clueCouponDetailV2ResponseDataFormExtendInfoCountConfig.prefix) &&
        Objects.equals(this.startNum, clueCouponDetailV2ResponseDataFormExtendInfoCountConfig.startNum) &&
        Objects.equals(this.suffix, clueCouponDetailV2ResponseDataFormExtendInfoCountConfig.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countType, prefix, startNum, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig {\n");
    sb.append("    countType: ").append(toIndentedString(countType)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    startNum: ").append(toIndentedString(startNum)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
    openapiFields.add("count_type");
    openapiFields.add("prefix");
    openapiFields.add("start_num");
    openapiFields.add("suffix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig
  */
  public static ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataFormExtendInfoCountConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

