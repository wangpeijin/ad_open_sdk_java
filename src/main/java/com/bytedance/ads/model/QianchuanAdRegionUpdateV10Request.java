/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdRegionUpdateV10ExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAdRegionUpdateV10LocationType;
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
 * QianchuanAdRegionUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanAdRegionUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAdRegionUpdateV10ExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanAdRegionUpdateV10LocationType locationType = null;

  public QianchuanAdRegionUpdateV10Request() {
  }

  public QianchuanAdRegionUpdateV10Request adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanAdRegionUpdateV10Request addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanAdRegionUpdateV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAdRegionUpdateV10Request city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAdRegionUpdateV10Request addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanAdRegionUpdateV10Request district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * 
   * @return district
  **/
  @javax.annotation.Nullable
  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public QianchuanAdRegionUpdateV10Request excludeLimitedRegion(QianchuanAdRegionUpdateV10ExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAdRegionUpdateV10ExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAdRegionUpdateV10ExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAdRegionUpdateV10Request locationType(QianchuanAdRegionUpdateV10LocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanAdRegionUpdateV10LocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanAdRegionUpdateV10LocationType locationType) {
    this.locationType = locationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdRegionUpdateV10Request qianchuanAdRegionUpdateV10Request = (QianchuanAdRegionUpdateV10Request) o;
    return Objects.equals(this.adIds, qianchuanAdRegionUpdateV10Request.adIds) &&
        Objects.equals(this.advertiserId, qianchuanAdRegionUpdateV10Request.advertiserId) &&
        Objects.equals(this.city, qianchuanAdRegionUpdateV10Request.city) &&
        Objects.equals(this.district, qianchuanAdRegionUpdateV10Request.district) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAdRegionUpdateV10Request.excludeLimitedRegion) &&
        Objects.equals(this.locationType, qianchuanAdRegionUpdateV10Request.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, advertiserId, city, district, excludeLimitedRegion, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdRegionUpdateV10Request {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("advertiser_id");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("location_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_ids");
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRegionUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRegionUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRegionUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRegionUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRegionUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRegionUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRegionUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRegionUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRegionUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRegionUpdateV10Request
  */
  public static QianchuanAdRegionUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRegionUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdRegionUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
