/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * AudiencePackageCreateV2RequestGeolocationInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class AudiencePackageCreateV2RequestGeolocationInner {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district = null;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat = null;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Double _long = null;

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

  public AudiencePackageCreateV2RequestGeolocationInner() {
  }

  public AudiencePackageCreateV2RequestGeolocationInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AudiencePackageCreateV2RequestGeolocationInner district(String district) {
    
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


  public AudiencePackageCreateV2RequestGeolocationInner lat(Double lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * 
   * @return lat
  **/
  @javax.annotation.Nullable
  public Double getLat() {
    return lat;
  }


  public void setLat(Double lat) {
    this.lat = lat;
  }


  public AudiencePackageCreateV2RequestGeolocationInner _long(Double _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * 
   * @return _long
  **/
  @javax.annotation.Nullable
  public Double getLong() {
    return _long;
  }


  public void setLong(Double _long) {
    this._long = _long;
  }


  public AudiencePackageCreateV2RequestGeolocationInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudiencePackageCreateV2RequestGeolocationInner province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 
   * @return province
  **/
  @javax.annotation.Nullable
  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public AudiencePackageCreateV2RequestGeolocationInner radius(Long radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * 
   * @return radius
  **/
  @javax.annotation.Nullable
  public Long getRadius() {
    return radius;
  }


  public void setRadius(Long radius) {
    this.radius = radius;
  }


  public AudiencePackageCreateV2RequestGeolocationInner street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * 
   * @return street
  **/
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public AudiencePackageCreateV2RequestGeolocationInner streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * 
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
    AudiencePackageCreateV2RequestGeolocationInner audiencePackageCreateV2RequestGeolocationInner = (AudiencePackageCreateV2RequestGeolocationInner) o;
    return Objects.equals(this.city, audiencePackageCreateV2RequestGeolocationInner.city) &&
        Objects.equals(this.district, audiencePackageCreateV2RequestGeolocationInner.district) &&
        Objects.equals(this.lat, audiencePackageCreateV2RequestGeolocationInner.lat) &&
        Objects.equals(this._long, audiencePackageCreateV2RequestGeolocationInner._long) &&
        Objects.equals(this.name, audiencePackageCreateV2RequestGeolocationInner.name) &&
        Objects.equals(this.province, audiencePackageCreateV2RequestGeolocationInner.province) &&
        Objects.equals(this.radius, audiencePackageCreateV2RequestGeolocationInner.radius) &&
        Objects.equals(this.street, audiencePackageCreateV2RequestGeolocationInner.street) &&
        Objects.equals(this.streetNumber, audiencePackageCreateV2RequestGeolocationInner.streetNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, district, lat, _long, name, province, radius, street, streetNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiencePackageCreateV2RequestGeolocationInner {\n");
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
       if (!AudiencePackageCreateV2RequestGeolocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageCreateV2RequestGeolocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageCreateV2RequestGeolocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageCreateV2RequestGeolocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageCreateV2RequestGeolocationInner>() {
           @Override
           public void write(JsonWriter out, AudiencePackageCreateV2RequestGeolocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageCreateV2RequestGeolocationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageCreateV2RequestGeolocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageCreateV2RequestGeolocationInner
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageCreateV2RequestGeolocationInner
  */
  public static AudiencePackageCreateV2RequestGeolocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageCreateV2RequestGeolocationInner.class);
  }

 /**
  * Convert an instance of AudiencePackageCreateV2RequestGeolocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

