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
import com.bytedance.ads.model.PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner;
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
 * PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CREATIVES = "creatives";
  @SerializedName(SERIALIZED_NAME_CREATIVES)
  private List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner> creatives = null;

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner() {
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner creatives(List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner> creatives) {
    
    this.creatives = creatives;
    return this;
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner addCreativesItem(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner creativesItem) {
    if (this.creatives == null) {
      this.creatives = new ArrayList<>();
    }
    this.creatives.add(creativesItem);
    return this;
  }

   /**
   * 
   * @return creatives
  **/
  @javax.annotation.Nullable
  public List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner> getCreatives() {
    return creatives;
  }


  public void setCreatives(List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInner> creatives) {
    this.creatives = creatives;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner = (PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner) o;
    return Objects.equals(this.adId, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner.adId) &&
        Objects.equals(this.creatives, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner.creatives);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, creatives);
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
    sb.append("class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    creatives: ").append(toIndentedString(creatives)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("creatives");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner
  */
  public static PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

