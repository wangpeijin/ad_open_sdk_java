/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaProductStatusBatchUpdateV2OptStatus;
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
 * DpaProductStatusBatchUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class DpaProductStatusBatchUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private DpaProductStatusBatchUpdateV2OptStatus optStatus = null;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private Long platformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public DpaProductStatusBatchUpdateV2Request() {
  }

  public DpaProductStatusBatchUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * maximum: -9223372036854775616
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaProductStatusBatchUpdateV2Request optStatus(DpaProductStatusBatchUpdateV2OptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nonnull
  public DpaProductStatusBatchUpdateV2OptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(DpaProductStatusBatchUpdateV2OptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public DpaProductStatusBatchUpdateV2Request platformId(Long platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * 商品库ID
   * minimum: 1
   * maximum: -9223372036854775616
   * @return platformId
  **/
  @javax.annotation.Nonnull
  public Long getPlatformId() {
    return platformId;
  }


  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }


  public DpaProductStatusBatchUpdateV2Request productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public DpaProductStatusBatchUpdateV2Request addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 商品ID列表
   * @return productIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductStatusBatchUpdateV2Request dpaProductStatusBatchUpdateV2Request = (DpaProductStatusBatchUpdateV2Request) o;
    return Objects.equals(this.advertiserId, dpaProductStatusBatchUpdateV2Request.advertiserId) &&
        Objects.equals(this.optStatus, dpaProductStatusBatchUpdateV2Request.optStatus) &&
        Objects.equals(this.platformId, dpaProductStatusBatchUpdateV2Request.platformId) &&
        Objects.equals(this.productIds, dpaProductStatusBatchUpdateV2Request.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, optStatus, platformId, productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductStatusBatchUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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
    openapiFields.add("opt_status");
    openapiFields.add("platform_id");
    openapiFields.add("product_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_status");
    openapiRequiredFields.add("platform_id");
    openapiRequiredFields.add("product_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductStatusBatchUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductStatusBatchUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductStatusBatchUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductStatusBatchUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductStatusBatchUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, DpaProductStatusBatchUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductStatusBatchUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductStatusBatchUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductStatusBatchUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to DpaProductStatusBatchUpdateV2Request
  */
  public static DpaProductStatusBatchUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductStatusBatchUpdateV2Request.class);
  }

 /**
  * Convert an instance of DpaProductStatusBatchUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

