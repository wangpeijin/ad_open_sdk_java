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
import com.bytedance.ads.model.StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class StarGetCreateChallengeDataDictV2ResponseData {
  public static final String SERIALIZED_NAME_AGE_RANGE = "age_range";
  @SerializedName(SERIALIZED_NAME_AGE_RANGE)
  private List<String> ageRange = null;

  public static final String SERIALIZED_NAME_CITY_LEVEL = "city_level";
  @SerializedName(SERIALIZED_NAME_CITY_LEVEL)
  private List<String> cityLevel = null;

  public static final String SERIALIZED_NAME_CONTENT_TAGS = "content_tags";
  @SerializedName(SERIALIZED_NAME_CONTENT_TAGS)
  private List<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner> contentTags = null;

  public static final String SERIALIZED_NAME_DEVICE_BRANDS = "device_brands";
  @SerializedName(SERIALIZED_NAME_DEVICE_BRANDS)
  private List<String> deviceBrands = null;

  public static final String SERIALIZED_NAME_PROVINCES = "provinces";
  @SerializedName(SERIALIZED_NAME_PROVINCES)
  private List<String> provinces = null;

  public StarGetCreateChallengeDataDictV2ResponseData() {
  }

  public StarGetCreateChallengeDataDictV2ResponseData ageRange(List<String> ageRange) {
    
    this.ageRange = ageRange;
    return this;
  }

  public StarGetCreateChallengeDataDictV2ResponseData addAgeRangeItem(String ageRangeItem) {
    if (this.ageRange == null) {
      this.ageRange = new ArrayList<>();
    }
    this.ageRange.add(ageRangeItem);
    return this;
  }

   /**
   * 观众年龄范围可选项
   * @return ageRange
  **/
  @javax.annotation.Nullable
  public List<String> getAgeRange() {
    return ageRange;
  }


  public void setAgeRange(List<String> ageRange) {
    this.ageRange = ageRange;
  }


  public StarGetCreateChallengeDataDictV2ResponseData cityLevel(List<String> cityLevel) {
    
    this.cityLevel = cityLevel;
    return this;
  }

  public StarGetCreateChallengeDataDictV2ResponseData addCityLevelItem(String cityLevelItem) {
    if (this.cityLevel == null) {
      this.cityLevel = new ArrayList<>();
    }
    this.cityLevel.add(cityLevelItem);
    return this;
  }

   /**
   * 观众地域可选项
   * @return cityLevel
  **/
  @javax.annotation.Nullable
  public List<String> getCityLevel() {
    return cityLevel;
  }


  public void setCityLevel(List<String> cityLevel) {
    this.cityLevel = cityLevel;
  }


  public StarGetCreateChallengeDataDictV2ResponseData contentTags(List<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner> contentTags) {
    
    this.contentTags = contentTags;
    return this;
  }

  public StarGetCreateChallengeDataDictV2ResponseData addContentTagsItem(StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner contentTagsItem) {
    if (this.contentTags == null) {
      this.contentTags = new ArrayList<>();
    }
    this.contentTags.add(contentTagsItem);
    return this;
  }

   /**
   * 内容类型可选项
   * @return contentTags
  **/
  @javax.annotation.Nullable
  public List<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner> getContentTags() {
    return contentTags;
  }


  public void setContentTags(List<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner> contentTags) {
    this.contentTags = contentTags;
  }


  public StarGetCreateChallengeDataDictV2ResponseData deviceBrands(List<String> deviceBrands) {
    
    this.deviceBrands = deviceBrands;
    return this;
  }

  public StarGetCreateChallengeDataDictV2ResponseData addDeviceBrandsItem(String deviceBrandsItem) {
    if (this.deviceBrands == null) {
      this.deviceBrands = new ArrayList<>();
    }
    this.deviceBrands.add(deviceBrandsItem);
    return this;
  }

   /**
   * 观众设备品牌可选项
   * @return deviceBrands
  **/
  @javax.annotation.Nullable
  public List<String> getDeviceBrands() {
    return deviceBrands;
  }


  public void setDeviceBrands(List<String> deviceBrands) {
    this.deviceBrands = deviceBrands;
  }


  public StarGetCreateChallengeDataDictV2ResponseData provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public StarGetCreateChallengeDataDictV2ResponseData addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * 达人省份可选项
   * @return provinces
  **/
  @javax.annotation.Nullable
  public List<String> getProvinces() {
    return provinces;
  }


  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarGetCreateChallengeDataDictV2ResponseData starGetCreateChallengeDataDictV2ResponseData = (StarGetCreateChallengeDataDictV2ResponseData) o;
    return Objects.equals(this.ageRange, starGetCreateChallengeDataDictV2ResponseData.ageRange) &&
        Objects.equals(this.cityLevel, starGetCreateChallengeDataDictV2ResponseData.cityLevel) &&
        Objects.equals(this.contentTags, starGetCreateChallengeDataDictV2ResponseData.contentTags) &&
        Objects.equals(this.deviceBrands, starGetCreateChallengeDataDictV2ResponseData.deviceBrands) &&
        Objects.equals(this.provinces, starGetCreateChallengeDataDictV2ResponseData.provinces);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRange, cityLevel, contentTags, deviceBrands, provinces);
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
    sb.append("class StarGetCreateChallengeDataDictV2ResponseData {\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    cityLevel: ").append(toIndentedString(cityLevel)).append("\n");
    sb.append("    contentTags: ").append(toIndentedString(contentTags)).append("\n");
    sb.append("    deviceBrands: ").append(toIndentedString(deviceBrands)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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
    openapiFields.add("age_range");
    openapiFields.add("city_level");
    openapiFields.add("content_tags");
    openapiFields.add("device_brands");
    openapiFields.add("provinces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarGetCreateChallengeDataDictV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarGetCreateChallengeDataDictV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarGetCreateChallengeDataDictV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarGetCreateChallengeDataDictV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarGetCreateChallengeDataDictV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarGetCreateChallengeDataDictV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarGetCreateChallengeDataDictV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarGetCreateChallengeDataDictV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarGetCreateChallengeDataDictV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarGetCreateChallengeDataDictV2ResponseData
  */
  public static StarGetCreateChallengeDataDictV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarGetCreateChallengeDataDictV2ResponseData.class);
  }

 /**
  * Convert an instance of StarGetCreateChallengeDataDictV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

