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
 * PromotionDeepbidUpdateV30RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class PromotionDeepbidUpdateV30RequestDataInner {
  public static final String SERIALIZED_NAME_DEEPBID = "deepbid";
  @SerializedName(SERIALIZED_NAME_DEEPBID)
  private Double deepbid = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public PromotionDeepbidUpdateV30RequestDataInner() {
  }

  public PromotionDeepbidUpdateV30RequestDataInner deepbid(Double deepbid) {
    
    this.deepbid = deepbid;
    return this;
  }

   /**
   * 
   * @return deepbid
  **/
  @javax.annotation.Nonnull
  public Double getDeepbid() {
    return deepbid;
  }


  public void setDeepbid(Double deepbid) {
    this.deepbid = deepbid;
  }


  public PromotionDeepbidUpdateV30RequestDataInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionDeepbidUpdateV30RequestDataInner promotionDeepbidUpdateV30RequestDataInner = (PromotionDeepbidUpdateV30RequestDataInner) o;
    return Objects.equals(this.deepbid, promotionDeepbidUpdateV30RequestDataInner.deepbid) &&
        Objects.equals(this.promotionId, promotionDeepbidUpdateV30RequestDataInner.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepbid, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDeepbidUpdateV30RequestDataInner {\n");
    sb.append("    deepbid: ").append(toIndentedString(deepbid)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("deepbid");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deepbid");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionDeepbidUpdateV30RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionDeepbidUpdateV30RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionDeepbidUpdateV30RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionDeepbidUpdateV30RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionDeepbidUpdateV30RequestDataInner>() {
           @Override
           public void write(JsonWriter out, PromotionDeepbidUpdateV30RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionDeepbidUpdateV30RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionDeepbidUpdateV30RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionDeepbidUpdateV30RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to PromotionDeepbidUpdateV30RequestDataInner
  */
  public static PromotionDeepbidUpdateV30RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionDeepbidUpdateV30RequestDataInner.class);
  }

 /**
  * Convert an instance of PromotionDeepbidUpdateV30RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

