/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAutoGenerateConfigCreateV30StrategyDataStrategyStateStateType;
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
 * PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner {
  public static final String SERIALIZED_NAME_STATE_KEY = "state_key";
  @SerializedName(SERIALIZED_NAME_STATE_KEY)
  private String stateKey = null;

  public static final String SERIALIZED_NAME_STATE_TYPE = "state_type";
  @SerializedName(SERIALIZED_NAME_STATE_TYPE)
  private PromotionAutoGenerateConfigCreateV30StrategyDataStrategyStateStateType stateType = null;

  public static final String SERIALIZED_NAME_STATE_VALUE = "state_value";
  @SerializedName(SERIALIZED_NAME_STATE_VALUE)
  private String stateValue = null;

  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner() {
  }

  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner stateKey(String stateKey) {
    
    this.stateKey = stateKey;
    return this;
  }

   /**
   * 配置项key
   * @return stateKey
  **/
  @javax.annotation.Nonnull
  public String getStateKey() {
    return stateKey;
  }


  public void setStateKey(String stateKey) {
    this.stateKey = stateKey;
  }


  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner stateType(PromotionAutoGenerateConfigCreateV30StrategyDataStrategyStateStateType stateType) {
    
    this.stateType = stateType;
    return this;
  }

   /**
   * Get stateType
   * @return stateType
  **/
  @javax.annotation.Nonnull
  public PromotionAutoGenerateConfigCreateV30StrategyDataStrategyStateStateType getStateType() {
    return stateType;
  }


  public void setStateType(PromotionAutoGenerateConfigCreateV30StrategyDataStrategyStateStateType stateType) {
    this.stateType = stateType;
  }


  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner stateValue(String stateValue) {
    
    this.stateValue = stateValue;
    return this;
  }

   /**
   * 配置项值
   * @return stateValue
  **/
  @javax.annotation.Nullable
  public String getStateValue() {
    return stateValue;
  }


  public void setStateValue(String stateValue) {
    this.stateValue = stateValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner promotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner = (PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner) o;
    return Objects.equals(this.stateKey, promotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.stateKey) &&
        Objects.equals(this.stateType, promotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.stateType) &&
        Objects.equals(this.stateValue, promotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.stateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateKey, stateType, stateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner {\n");
    sb.append("    stateKey: ").append(toIndentedString(stateKey)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
    sb.append("    stateValue: ").append(toIndentedString(stateValue)).append("\n");
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
    openapiFields.add("state_key");
    openapiFields.add("state_type");
    openapiFields.add("state_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state_key");
    openapiRequiredFields.add("state_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner
  */
  public static PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

