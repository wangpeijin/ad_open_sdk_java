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
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10MarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10RequestAudience;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10RequestDeliverySetting;
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
 * QianchuanAwemeOrderCreateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class QianchuanAwemeOrderCreateV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private QianchuanAwemeOrderCreateV10RequestAudience audience = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAwemeOrderCreateV10RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeOrderCreateV10MarketingGoal marketingGoal = null;

  public QianchuanAwemeOrderCreateV10Request() {
  }

  public QianchuanAwemeOrderCreateV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAwemeOrderCreateV10Request audience(QianchuanAwemeOrderCreateV10RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(QianchuanAwemeOrderCreateV10RequestAudience audience) {
    this.audience = audience;
  }


  public QianchuanAwemeOrderCreateV10Request awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 推广对象的抖音id 1. 视频加热和视频加热直播间：传递视频作者的抖音uid 2. 直接加热直播间：传递主播的抖音uid
   * @return awemeId
  **/
  @javax.annotation.Nonnull
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAwemeOrderCreateV10Request awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAwemeOrderCreateV10Request deliverySetting(QianchuanAwemeOrderCreateV10RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderCreateV10RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAwemeOrderCreateV10RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAwemeOrderCreateV10Request marketingGoal(QianchuanAwemeOrderCreateV10MarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderCreateV10MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeOrderCreateV10MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderCreateV10Request qianchuanAwemeOrderCreateV10Request = (QianchuanAwemeOrderCreateV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanAwemeOrderCreateV10Request.advertiserId) &&
        Objects.equals(this.audience, qianchuanAwemeOrderCreateV10Request.audience) &&
        Objects.equals(this.awemeId, qianchuanAwemeOrderCreateV10Request.awemeId) &&
        Objects.equals(this.awemeItemId, qianchuanAwemeOrderCreateV10Request.awemeItemId) &&
        Objects.equals(this.deliverySetting, qianchuanAwemeOrderCreateV10Request.deliverySetting) &&
        Objects.equals(this.marketingGoal, qianchuanAwemeOrderCreateV10Request.marketingGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audience, awemeId, awemeItemId, deliverySetting, marketingGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeOrderCreateV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_item_id");
    openapiFields.add("delivery_setting");
    openapiFields.add("marketing_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("aweme_id");
    openapiRequiredFields.add("delivery_setting");
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderCreateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderCreateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderCreateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderCreateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderCreateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderCreateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderCreateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderCreateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderCreateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderCreateV10Request
  */
  public static QianchuanAwemeOrderCreateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderCreateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderCreateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

