/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district = null;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Long lat = null;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Long _long = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province = null;

  public static final String SERIALIZED_NAME_RADIUS = "radius";
  @SerializedName(SERIALIZED_NAME_RADIUS)
  private Long radius = null;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street = null;

  public static final String SERIALIZED_NAME_STREET_NUMBER = "street_number";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber = null;

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner() {
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 城市
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * 地区
   * @return district
  **/
  @javax.annotation.Nullable
  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner lat(Long lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * 维度
   * @return lat
  **/
  @javax.annotation.Nullable
  public Long getLat() {
    return lat;
  }


  public void setLat(Long lat) {
    this.lat = lat;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner _long(Long _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * 精度
   * @return _long
  **/
  @javax.annotation.Nullable
  public Long getLong() {
    return _long;
  }


  public void setLong(Long _long) {
    this._long = _long;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 省份
   * @return province
  **/
  @javax.annotation.Nullable
  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner radius(Long radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * 半径,单位米
   * @return radius
  **/
  @javax.annotation.Nullable
  public Long getRadius() {
    return radius;
  }


  public void setRadius(Long radius) {
    this.radius = radius;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * 街道
   * @return street
  **/
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * 门牌号码
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner = (BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner) o;
    return Objects.equals(this.city, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.city) &&
        Objects.equals(this.district, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.district) &&
        Objects.equals(this.lat, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.lat) &&
        Objects.equals(this._long, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner._long) &&
        Objects.equals(this.name, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.name) &&
        Objects.equals(this.province, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.province) &&
        Objects.equals(this.radius, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.radius) &&
        Objects.equals(this.street, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.street) &&
        Objects.equals(this.streetNumber, brandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.streetNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, district, lat, _long, name, province, radius, street, streetNumber);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("lat");
    openapiFields.add("long");
    openapiFields.add("name");
    openapiFields.add("province");
    openapiFields.add("radius");
    openapiFields.add("street");
    openapiFields.add("street_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner
  */
  public static BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

