/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
 * AdvertiserPublicInfoV2ResponseData
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class AdvertiserPublicInfoV2ResponseData {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_NAME = "first_industry_name";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_NAME)
  private String firstIndustryName = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_NAME = "second_industry_name";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_NAME)
  private String secondIndustryName = null;

  public AdvertiserPublicInfoV2ResponseData() {
  }

  public AdvertiserPublicInfoV2ResponseData company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * 
   * @return company
  **/
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public AdvertiserPublicInfoV2ResponseData firstIndustryName(String firstIndustryName) {
    
    this.firstIndustryName = firstIndustryName;
    return this;
  }

   /**
   * 
   * @return firstIndustryName
  **/
  @javax.annotation.Nullable
  public String getFirstIndustryName() {
    return firstIndustryName;
  }


  public void setFirstIndustryName(String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
  }


  public AdvertiserPublicInfoV2ResponseData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AdvertiserPublicInfoV2ResponseData name(String name) {
    
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


  public AdvertiserPublicInfoV2ResponseData secondIndustryName(String secondIndustryName) {
    
    this.secondIndustryName = secondIndustryName;
    return this;
  }

   /**
   * 
   * @return secondIndustryName
  **/
  @javax.annotation.Nullable
  public String getSecondIndustryName() {
    return secondIndustryName;
  }


  public void setSecondIndustryName(String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserPublicInfoV2ResponseData advertiserPublicInfoV2ResponseData = (AdvertiserPublicInfoV2ResponseData) o;
    return Objects.equals(this.company, advertiserPublicInfoV2ResponseData.company) &&
        Objects.equals(this.firstIndustryName, advertiserPublicInfoV2ResponseData.firstIndustryName) &&
        Objects.equals(this.id, advertiserPublicInfoV2ResponseData.id) &&
        Objects.equals(this.name, advertiserPublicInfoV2ResponseData.name) &&
        Objects.equals(this.secondIndustryName, advertiserPublicInfoV2ResponseData.secondIndustryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, firstIndustryName, id, name, secondIndustryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserPublicInfoV2ResponseData {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstIndustryName: ").append(toIndentedString(firstIndustryName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondIndustryName: ").append(toIndentedString(secondIndustryName)).append("\n");
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
    openapiFields.add("company");
    openapiFields.add("first_industry_name");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("second_industry_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserPublicInfoV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserPublicInfoV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserPublicInfoV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserPublicInfoV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserPublicInfoV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserPublicInfoV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserPublicInfoV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserPublicInfoV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserPublicInfoV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserPublicInfoV2ResponseData
  */
  public static AdvertiserPublicInfoV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserPublicInfoV2ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserPublicInfoV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

