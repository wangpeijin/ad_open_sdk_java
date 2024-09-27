/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age = null;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform = null;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName = null;

  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner() {
  }

  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    this.age = age;
  }


  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 
   * @return cityName
  **/
  @javax.annotation.Nullable
  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @javax.annotation.Nullable
  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 
   * @return provinceName
  **/
  @javax.annotation.Nullable
  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner reportLiveRoomAudiencePortraitGetV2ResponseDataListInner = (ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner) o;
    return Objects.equals(this.age, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.age) &&
        Objects.equals(this.cityName, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.cityName) &&
        Objects.equals(this.fields, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.fields) &&
        Objects.equals(this.gender, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.gender) &&
        Objects.equals(this.platform, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.platform) &&
        Objects.equals(this.provinceName, reportLiveRoomAudiencePortraitGetV2ResponseDataListInner.provinceName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, cityName, fields, gender, platform, provinceName);
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
    sb.append("class ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("city_name");
    openapiFields.add("fields");
    openapiFields.add("gender");
    openapiFields.add("platform");
    openapiFields.add("province_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner
  */
  public static ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportLiveRoomAudiencePortraitGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

