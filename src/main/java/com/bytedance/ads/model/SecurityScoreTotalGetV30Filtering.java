/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SecurityScoreTotalGetV30FilteringIllegalType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class SecurityScoreTotalGetV30Filtering {
  public static final String SERIALIZED_NAME_ILLEGAL_TYPE = "illegal_type";
  @SerializedName(SERIALIZED_NAME_ILLEGAL_TYPE)
  private SecurityScoreTotalGetV30FilteringIllegalType illegalType = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year = null;

  public SecurityScoreTotalGetV30Filtering() {
  }

  public SecurityScoreTotalGetV30Filtering illegalType(SecurityScoreTotalGetV30FilteringIllegalType illegalType) {
    
    this.illegalType = illegalType;
    return this;
  }

   /**
   * Get illegalType
   * @return illegalType
  **/
  @javax.annotation.Nullable
  public SecurityScoreTotalGetV30FilteringIllegalType getIllegalType() {
    return illegalType;
  }


  public void setIllegalType(SecurityScoreTotalGetV30FilteringIllegalType illegalType) {
    this.illegalType = illegalType;
  }


  public SecurityScoreTotalGetV30Filtering year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * 积分年度
   * @return year
  **/
  @javax.annotation.Nullable
  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreTotalGetV30Filtering securityScoreTotalGetV30Filtering = (SecurityScoreTotalGetV30Filtering) o;
    return Objects.equals(this.illegalType, securityScoreTotalGetV30Filtering.illegalType) &&
        Objects.equals(this.year, securityScoreTotalGetV30Filtering.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(illegalType, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScoreTotalGetV30Filtering {\n");
    sb.append("    illegalType: ").append(toIndentedString(illegalType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("illegal_type");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreTotalGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreTotalGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreTotalGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreTotalGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreTotalGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, SecurityScoreTotalGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreTotalGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreTotalGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreTotalGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreTotalGetV30Filtering
  */
  public static SecurityScoreTotalGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreTotalGetV30Filtering.class);
  }

 /**
  * Convert an instance of SecurityScoreTotalGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

