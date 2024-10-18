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
import com.bytedance.ads.model.AdShopInfoUpdateV30RequestShopInfo;
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
 * AdShopInfoUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class AdShopInfoUpdateV30Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SHOP_INFO = "shop_info";
  @SerializedName(SERIALIZED_NAME_SHOP_INFO)
  private AdShopInfoUpdateV30RequestShopInfo shopInfo = null;

  public AdShopInfoUpdateV30Request() {
  }

  public AdShopInfoUpdateV30Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdShopInfoUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdShopInfoUpdateV30Request shopInfo(AdShopInfoUpdateV30RequestShopInfo shopInfo) {
    
    this.shopInfo = shopInfo;
    return this;
  }

   /**
   * Get shopInfo
   * @return shopInfo
  **/
  @javax.annotation.Nullable
  public AdShopInfoUpdateV30RequestShopInfo getShopInfo() {
    return shopInfo;
  }


  public void setShopInfo(AdShopInfoUpdateV30RequestShopInfo shopInfo) {
    this.shopInfo = shopInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdShopInfoUpdateV30Request adShopInfoUpdateV30Request = (AdShopInfoUpdateV30Request) o;
    return Objects.equals(this.adId, adShopInfoUpdateV30Request.adId) &&
        Objects.equals(this.advertiserId, adShopInfoUpdateV30Request.advertiserId) &&
        Objects.equals(this.shopInfo, adShopInfoUpdateV30Request.shopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, shopInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdShopInfoUpdateV30Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    shopInfo: ").append(toIndentedString(shopInfo)).append("\n");
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
    openapiFields.add("shop_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("shop_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdShopInfoUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdShopInfoUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdShopInfoUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdShopInfoUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdShopInfoUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, AdShopInfoUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdShopInfoUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdShopInfoUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdShopInfoUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to AdShopInfoUpdateV30Request
  */
  public static AdShopInfoUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdShopInfoUpdateV30Request.class);
  }

 /**
  * Convert an instance of AdShopInfoUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

