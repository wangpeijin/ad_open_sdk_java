/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestAdData;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * CreativeCustomCreativeCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2Request {
  public static final String SERIALIZED_NAME_AD_DATA = "ad_data";
  @SerializedName(SERIALIZED_NAME_AD_DATA)
  private CreativeCustomCreativeCreateV2RequestAdData adData = null;

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATIVE_LIST = "creative_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_LIST)
  private List<CreativeCustomCreativeCreateV2RequestCreativeListInner> creativeList = null;

  public CreativeCustomCreativeCreateV2Request() {
  }

  public CreativeCustomCreativeCreateV2Request adData(CreativeCustomCreativeCreateV2RequestAdData adData) {
    
    this.adData = adData;
    return this;
  }

   /**
   * Get adData
   * @return adData
  **/
  @javax.annotation.Nonnull
  public CreativeCustomCreativeCreateV2RequestAdData getAdData() {
    return adData;
  }


  public void setAdData(CreativeCustomCreativeCreateV2RequestAdData adData) {
    this.adData = adData;
  }


  public CreativeCustomCreativeCreateV2Request adId(Long adId) {
    
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


  public CreativeCustomCreativeCreateV2Request advertiserId(Long advertiserId) {
    
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


  public CreativeCustomCreativeCreateV2Request creativeList(List<CreativeCustomCreativeCreateV2RequestCreativeListInner> creativeList) {
    
    this.creativeList = creativeList;
    return this;
  }

  public CreativeCustomCreativeCreateV2Request addCreativeListItem(CreativeCustomCreativeCreateV2RequestCreativeListInner creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * 
   * @return creativeList
  **/
  @javax.annotation.Nonnull
  public List<CreativeCustomCreativeCreateV2RequestCreativeListInner> getCreativeList() {
    return creativeList;
  }


  public void setCreativeList(List<CreativeCustomCreativeCreateV2RequestCreativeListInner> creativeList) {
    this.creativeList = creativeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2Request creativeCustomCreativeCreateV2Request = (CreativeCustomCreativeCreateV2Request) o;
    return Objects.equals(this.adData, creativeCustomCreativeCreateV2Request.adData) &&
        Objects.equals(this.adId, creativeCustomCreativeCreateV2Request.adId) &&
        Objects.equals(this.advertiserId, creativeCustomCreativeCreateV2Request.advertiserId) &&
        Objects.equals(this.creativeList, creativeCustomCreativeCreateV2Request.creativeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adData, adId, advertiserId, creativeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2Request {\n");
    sb.append("    adData: ").append(toIndentedString(adData)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
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
    openapiFields.add("ad_data");
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("creative_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_data");
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("creative_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2Request>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2Request
  */
  public static CreativeCustomCreativeCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2Request.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

