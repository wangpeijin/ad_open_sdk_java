/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueFormDetailV2ResponseDataFormExtendInfoCountConfig;
import com.bytedance.ads.model.ClueFormDetailV2ResponseDataFormExtendInfoSignUpConfig;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ClueFormDetailV2ResponseDataFormExtendInfo {
  public static final String SERIALIZED_NAME_COUNT_CONFIG = "count_config";
  @SerializedName(SERIALIZED_NAME_COUNT_CONFIG)
  private ClueFormDetailV2ResponseDataFormExtendInfoCountConfig countConfig = null;

  public static final String SERIALIZED_NAME_SIGN_UP_CONFIG = "sign_up_config";
  @SerializedName(SERIALIZED_NAME_SIGN_UP_CONFIG)
  private ClueFormDetailV2ResponseDataFormExtendInfoSignUpConfig signUpConfig = null;

  public static final String SERIALIZED_NAME_SUCCESS_TIP = "success_tip";
  @SerializedName(SERIALIZED_NAME_SUCCESS_TIP)
  private String successTip = null;

  public ClueFormDetailV2ResponseDataFormExtendInfo() {
  }

  public ClueFormDetailV2ResponseDataFormExtendInfo countConfig(ClueFormDetailV2ResponseDataFormExtendInfoCountConfig countConfig) {
    
    this.countConfig = countConfig;
    return this;
  }

   /**
   * Get countConfig
   * @return countConfig
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2ResponseDataFormExtendInfoCountConfig getCountConfig() {
    return countConfig;
  }


  public void setCountConfig(ClueFormDetailV2ResponseDataFormExtendInfoCountConfig countConfig) {
    this.countConfig = countConfig;
  }


  public ClueFormDetailV2ResponseDataFormExtendInfo signUpConfig(ClueFormDetailV2ResponseDataFormExtendInfoSignUpConfig signUpConfig) {
    
    this.signUpConfig = signUpConfig;
    return this;
  }

   /**
   * Get signUpConfig
   * @return signUpConfig
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2ResponseDataFormExtendInfoSignUpConfig getSignUpConfig() {
    return signUpConfig;
  }


  public void setSignUpConfig(ClueFormDetailV2ResponseDataFormExtendInfoSignUpConfig signUpConfig) {
    this.signUpConfig = signUpConfig;
  }


  public ClueFormDetailV2ResponseDataFormExtendInfo successTip(String successTip) {
    
    this.successTip = successTip;
    return this;
  }

   /**
   * 
   * @return successTip
  **/
  @javax.annotation.Nullable
  public String getSuccessTip() {
    return successTip;
  }


  public void setSuccessTip(String successTip) {
    this.successTip = successTip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueFormDetailV2ResponseDataFormExtendInfo clueFormDetailV2ResponseDataFormExtendInfo = (ClueFormDetailV2ResponseDataFormExtendInfo) o;
    return Objects.equals(this.countConfig, clueFormDetailV2ResponseDataFormExtendInfo.countConfig) &&
        Objects.equals(this.signUpConfig, clueFormDetailV2ResponseDataFormExtendInfo.signUpConfig) &&
        Objects.equals(this.successTip, clueFormDetailV2ResponseDataFormExtendInfo.successTip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countConfig, signUpConfig, successTip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormDetailV2ResponseDataFormExtendInfo {\n");
    sb.append("    countConfig: ").append(toIndentedString(countConfig)).append("\n");
    sb.append("    signUpConfig: ").append(toIndentedString(signUpConfig)).append("\n");
    sb.append("    successTip: ").append(toIndentedString(successTip)).append("\n");
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
    openapiFields.add("count_config");
    openapiFields.add("sign_up_config");
    openapiFields.add("success_tip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormDetailV2ResponseDataFormExtendInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormDetailV2ResponseDataFormExtendInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormDetailV2ResponseDataFormExtendInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormDetailV2ResponseDataFormExtendInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormDetailV2ResponseDataFormExtendInfo>() {
           @Override
           public void write(JsonWriter out, ClueFormDetailV2ResponseDataFormExtendInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormDetailV2ResponseDataFormExtendInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormDetailV2ResponseDataFormExtendInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormDetailV2ResponseDataFormExtendInfo
  * @throws IOException if the JSON string is invalid with respect to ClueFormDetailV2ResponseDataFormExtendInfo
  */
  public static ClueFormDetailV2ResponseDataFormExtendInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormDetailV2ResponseDataFormExtendInfo.class);
  }

 /**
  * Convert an instance of ClueFormDetailV2ResponseDataFormExtendInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

