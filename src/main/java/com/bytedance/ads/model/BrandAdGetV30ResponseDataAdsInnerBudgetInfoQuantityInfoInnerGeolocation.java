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
 * 地图商圈
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation {
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

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation() {
  }

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation city(String city) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation district(String district) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation lat(Long lat) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation _long(Long _long) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation name(String name) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation province(String province) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation radius(Long radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * 半径
   * @return radius
  **/
  @javax.annotation.Nullable
  public Long getRadius() {
    return radius;
  }


  public void setRadius(Long radius) {
    this.radius = radius;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation street(String street) {
    
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


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation streetNumber(String streetNumber) {
    
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
    BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation = (BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation) o;
    return Objects.equals(this.city, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.city) &&
        Objects.equals(this.district, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.district) &&
        Objects.equals(this.lat, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.lat) &&
        Objects.equals(this._long, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation._long) &&
        Objects.equals(this.name, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.name) &&
        Objects.equals(this.province, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.province) &&
        Objects.equals(this.radius, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.radius) &&
        Objects.equals(this.street, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.street) &&
        Objects.equals(this.streetNumber, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.streetNumber);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation {\n");
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
       if (!BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation
  */
  public static BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

