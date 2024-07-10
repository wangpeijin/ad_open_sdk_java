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
import com.bytedance.ads.model.QianchuanAudiencePushV10AccountType;
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
 * QianchuanAudiencePushV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class QianchuanAudiencePushV10Request {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private QianchuanAudiencePushV10AccountType accountType = null;

  public static final String SERIALIZED_NAME_ADV_IDS = "adv_ids";
  @SerializedName(SERIALIZED_NAME_ADV_IDS)
  private List<Long> advIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audience_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private Long audienceId = null;

  public static final String SERIALIZED_NAME_IS_FOR_BRAND = "is_for_brand";
  @SerializedName(SERIALIZED_NAME_IS_FOR_BRAND)
  private Integer isForBrand = null;

  public QianchuanAudiencePushV10Request() {
  }

  public QianchuanAudiencePushV10Request accountType(QianchuanAudiencePushV10AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public QianchuanAudiencePushV10AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(QianchuanAudiencePushV10AccountType accountType) {
    this.accountType = accountType;
  }


  public QianchuanAudiencePushV10Request advIds(List<Long> advIds) {
    
    this.advIds = advIds;
    return this;
  }

  public QianchuanAudiencePushV10Request addAdvIdsItem(Long advIdsItem) {
    if (this.advIds == null) {
      this.advIds = new ArrayList<>();
    }
    this.advIds.add(advIdsItem);
    return this;
  }

   /**
   * 
   * @return advIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvIds() {
    return advIds;
  }


  public void setAdvIds(List<Long> advIds) {
    this.advIds = advIds;
  }


  public QianchuanAudiencePushV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAudiencePushV10Request audienceId(Long audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

   /**
   * 
   * @return audienceId
  **/
  @javax.annotation.Nullable
  public Long getAudienceId() {
    return audienceId;
  }


  public void setAudienceId(Long audienceId) {
    this.audienceId = audienceId;
  }


  public QianchuanAudiencePushV10Request isForBrand(Integer isForBrand) {
    
    this.isForBrand = isForBrand;
    return this;
  }

   /**
   * 
   * @return isForBrand
  **/
  @javax.annotation.Nullable
  public Integer getIsForBrand() {
    return isForBrand;
  }


  public void setIsForBrand(Integer isForBrand) {
    this.isForBrand = isForBrand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudiencePushV10Request qianchuanAudiencePushV10Request = (QianchuanAudiencePushV10Request) o;
    return Objects.equals(this.accountType, qianchuanAudiencePushV10Request.accountType) &&
        Objects.equals(this.advIds, qianchuanAudiencePushV10Request.advIds) &&
        Objects.equals(this.advertiserId, qianchuanAudiencePushV10Request.advertiserId) &&
        Objects.equals(this.audienceId, qianchuanAudiencePushV10Request.audienceId) &&
        Objects.equals(this.isForBrand, qianchuanAudiencePushV10Request.isForBrand);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, advIds, advertiserId, audienceId, isForBrand);
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
    sb.append("class QianchuanAudiencePushV10Request {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    advIds: ").append(toIndentedString(advIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    isForBrand: ").append(toIndentedString(isForBrand)).append("\n");
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
    openapiFields.add("account_type");
    openapiFields.add("adv_ids");
    openapiFields.add("advertiser_id");
    openapiFields.add("audience_id");
    openapiFields.add("is_for_brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("audience_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudiencePushV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudiencePushV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudiencePushV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudiencePushV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudiencePushV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAudiencePushV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudiencePushV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudiencePushV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudiencePushV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudiencePushV10Request
  */
  public static QianchuanAudiencePushV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudiencePushV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAudiencePushV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

