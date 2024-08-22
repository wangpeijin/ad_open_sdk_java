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
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestCreativeSetting;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestDeliverySetting;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList;
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
 * QianchuanUniAwemeAdUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanUniAwemeAdUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATIVE_SETTING = "creative_setting";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SETTING)
  private QianchuanUniAwemeAdUpdateV10RequestCreativeSetting creativeSetting = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanUniAwemeAdUpdateV10RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList = null;

  public QianchuanUniAwemeAdUpdateV10Request() {
  }

  public QianchuanUniAwemeAdUpdateV10Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanUniAwemeAdUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanUniAwemeAdUpdateV10Request creativeSetting(QianchuanUniAwemeAdUpdateV10RequestCreativeSetting creativeSetting) {
    
    this.creativeSetting = creativeSetting;
    return this;
  }

   /**
   * Get creativeSetting
   * @return creativeSetting
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10RequestCreativeSetting getCreativeSetting() {
    return creativeSetting;
  }


  public void setCreativeSetting(QianchuanUniAwemeAdUpdateV10RequestCreativeSetting creativeSetting) {
    this.creativeSetting = creativeSetting;
  }


  public QianchuanUniAwemeAdUpdateV10Request deliverySetting(QianchuanUniAwemeAdUpdateV10RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanUniAwemeAdUpdateV10RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanUniAwemeAdUpdateV10Request programmaticCreativeMediaList(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

   /**
   * Get programmaticCreativeMediaList
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeAdUpdateV10Request qianchuanUniAwemeAdUpdateV10Request = (QianchuanUniAwemeAdUpdateV10Request) o;
    return Objects.equals(this.adId, qianchuanUniAwemeAdUpdateV10Request.adId) &&
        Objects.equals(this.advertiserId, qianchuanUniAwemeAdUpdateV10Request.advertiserId) &&
        Objects.equals(this.creativeSetting, qianchuanUniAwemeAdUpdateV10Request.creativeSetting) &&
        Objects.equals(this.deliverySetting, qianchuanUniAwemeAdUpdateV10Request.deliverySetting) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanUniAwemeAdUpdateV10Request.programmaticCreativeMediaList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, creativeSetting, deliverySetting, programmaticCreativeMediaList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creativeSetting: ").append(toIndentedString(creativeSetting)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
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
    openapiFields.add("creative_setting");
    openapiFields.add("delivery_setting");
    openapiFields.add("programmatic_creative_media_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10Request
  */
  public static QianchuanUniAwemeAdUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
