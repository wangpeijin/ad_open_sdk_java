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
import com.bytedance.ads.model.AdUdUpdateV2RequestUdShop;
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
 * AdUdUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class AdUdUpdateV2Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_UD_SHOP = "ud_shop";
  @SerializedName(SERIALIZED_NAME_UD_SHOP)
  private AdUdUpdateV2RequestUdShop udShop = null;

  public AdUdUpdateV2Request() {
  }

  public AdUdUpdateV2Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdUdUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdUdUpdateV2Request udShop(AdUdUpdateV2RequestUdShop udShop) {
    
    this.udShop = udShop;
    return this;
  }

   /**
   * Get udShop
   * @return udShop
  **/
  @javax.annotation.Nonnull
  public AdUdUpdateV2RequestUdShop getUdShop() {
    return udShop;
  }


  public void setUdShop(AdUdUpdateV2RequestUdShop udShop) {
    this.udShop = udShop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUdUpdateV2Request adUdUpdateV2Request = (AdUdUpdateV2Request) o;
    return Objects.equals(this.adId, adUdUpdateV2Request.adId) &&
        Objects.equals(this.advertiserId, adUdUpdateV2Request.advertiserId) &&
        Objects.equals(this.udShop, adUdUpdateV2Request.udShop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, udShop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUdUpdateV2Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    udShop: ").append(toIndentedString(udShop)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("ud_shop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("ud_shop");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdUdUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdUdUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdUdUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdUdUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdUdUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, AdUdUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdUdUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdUdUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdUdUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to AdUdUpdateV2Request
  */
  public static AdUdUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdUdUpdateV2Request.class);
  }

 /**
  * Convert an instance of AdUdUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

