/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
 * DpaCheckIndexEntryProgressV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class DpaCheckIndexEntryProgressV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INDEX_PULL_DATE = "index_pull_date";
  @SerializedName(SERIALIZED_NAME_INDEX_PULL_DATE)
  private String indexPullDate = null;

  public static final String SERIALIZED_NAME_INDEX_PULL_TIME = "index_pull_time";
  @SerializedName(SERIALIZED_NAME_INDEX_PULL_TIME)
  private Long indexPullTime = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public DpaCheckIndexEntryProgressV2Request() {
  }

  public DpaCheckIndexEntryProgressV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaCheckIndexEntryProgressV2Request indexPullDate(String indexPullDate) {
    
    this.indexPullDate = indexPullDate;
    return this;
  }

   /**
   * 文件拉取日期，case:\&quot;20230331\&quot;
   * @return indexPullDate
  **/
  @javax.annotation.Nonnull
  public String getIndexPullDate() {
    return indexPullDate;
  }


  public void setIndexPullDate(String indexPullDate) {
    this.indexPullDate = indexPullDate;
  }


  public DpaCheckIndexEntryProgressV2Request indexPullTime(Long indexPullTime) {
    
    this.indexPullTime = indexPullTime;
    return this;
  }

   /**
   * 当天文件拉取次数，从1起
   * @return indexPullTime
  **/
  @javax.annotation.Nonnull
  public Long getIndexPullTime() {
    return indexPullTime;
  }


  public void setIndexPullTime(Long indexPullTime) {
    this.indexPullTime = indexPullTime;
  }


  public DpaCheckIndexEntryProgressV2Request productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 商品库ID ，可通过【获取商品库信息】获取
   * @return productPlatformId
  **/
  @javax.annotation.Nonnull
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaCheckIndexEntryProgressV2Request dpaCheckIndexEntryProgressV2Request = (DpaCheckIndexEntryProgressV2Request) o;
    return Objects.equals(this.advertiserId, dpaCheckIndexEntryProgressV2Request.advertiserId) &&
        Objects.equals(this.indexPullDate, dpaCheckIndexEntryProgressV2Request.indexPullDate) &&
        Objects.equals(this.indexPullTime, dpaCheckIndexEntryProgressV2Request.indexPullTime) &&
        Objects.equals(this.productPlatformId, dpaCheckIndexEntryProgressV2Request.productPlatformId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, indexPullDate, indexPullTime, productPlatformId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaCheckIndexEntryProgressV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    indexPullDate: ").append(toIndentedString(indexPullDate)).append("\n");
    sb.append("    indexPullTime: ").append(toIndentedString(indexPullTime)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("index_pull_date");
    openapiFields.add("index_pull_time");
    openapiFields.add("product_platform_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("index_pull_date");
    openapiRequiredFields.add("index_pull_time");
    openapiRequiredFields.add("product_platform_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaCheckIndexEntryProgressV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaCheckIndexEntryProgressV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaCheckIndexEntryProgressV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaCheckIndexEntryProgressV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaCheckIndexEntryProgressV2Request>() {
           @Override
           public void write(JsonWriter out, DpaCheckIndexEntryProgressV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaCheckIndexEntryProgressV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaCheckIndexEntryProgressV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaCheckIndexEntryProgressV2Request
  * @throws IOException if the JSON string is invalid with respect to DpaCheckIndexEntryProgressV2Request
  */
  public static DpaCheckIndexEntryProgressV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaCheckIndexEntryProgressV2Request.class);
  }

 /**
  * Convert an instance of DpaCheckIndexEntryProgressV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
