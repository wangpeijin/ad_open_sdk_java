/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner;
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
 * AdvertiserDeliveryQualificationSubmitV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class AdvertiserDeliveryQualificationSubmitV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_QUALIFICATIONS = "qualifications";
  @SerializedName(SERIALIZED_NAME_QUALIFICATIONS)
  private List<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner> qualifications = null;

  public AdvertiserDeliveryQualificationSubmitV30Request() {
  }

  public AdvertiserDeliveryQualificationSubmitV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserDeliveryQualificationSubmitV30Request qualifications(List<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner> qualifications) {
    
    this.qualifications = qualifications;
    return this;
  }

  public AdvertiserDeliveryQualificationSubmitV30Request addQualificationsItem(AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

   /**
   * 投放资质信息
   * @return qualifications
  **/
  @javax.annotation.Nonnull
  public List<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner> getQualifications() {
    return qualifications;
  }


  public void setQualifications(List<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner> qualifications) {
    this.qualifications = qualifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryQualificationSubmitV30Request advertiserDeliveryQualificationSubmitV30Request = (AdvertiserDeliveryQualificationSubmitV30Request) o;
    return Objects.equals(this.advertiserId, advertiserDeliveryQualificationSubmitV30Request.advertiserId) &&
        Objects.equals(this.qualifications, advertiserDeliveryQualificationSubmitV30Request.qualifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, qualifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryQualificationSubmitV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
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
    openapiFields.add("qualifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("qualifications");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryQualificationSubmitV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryQualificationSubmitV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryQualificationSubmitV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryQualificationSubmitV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryQualificationSubmitV30Request>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryQualificationSubmitV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryQualificationSubmitV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryQualificationSubmitV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryQualificationSubmitV30Request
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryQualificationSubmitV30Request
  */
  public static AdvertiserDeliveryQualificationSubmitV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryQualificationSubmitV30Request.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryQualificationSubmitV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

