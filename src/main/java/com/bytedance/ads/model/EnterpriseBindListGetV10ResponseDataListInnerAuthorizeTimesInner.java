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
 * EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner {
  public static final String SERIALIZED_NAME_AUTHORIZE_END_TIME = "authorize_end_time";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_END_TIME)
  private String authorizeEndTime = null;

  public static final String SERIALIZED_NAME_AUTHORIZE_START_TIME = "authorize_start_time";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_START_TIME)
  private String authorizeStartTime = null;

  public EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner() {
  }

  public EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner authorizeEndTime(String authorizeEndTime) {
    
    this.authorizeEndTime = authorizeEndTime;
    return this;
  }

   /**
   * 
   * @return authorizeEndTime
  **/
  @javax.annotation.Nullable
  public String getAuthorizeEndTime() {
    return authorizeEndTime;
  }


  public void setAuthorizeEndTime(String authorizeEndTime) {
    this.authorizeEndTime = authorizeEndTime;
  }


  public EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner authorizeStartTime(String authorizeStartTime) {
    
    this.authorizeStartTime = authorizeStartTime;
    return this;
  }

   /**
   * 
   * @return authorizeStartTime
  **/
  @javax.annotation.Nullable
  public String getAuthorizeStartTime() {
    return authorizeStartTime;
  }


  public void setAuthorizeStartTime(String authorizeStartTime) {
    this.authorizeStartTime = authorizeStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner enterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner = (EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner) o;
    return Objects.equals(this.authorizeEndTime, enterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner.authorizeEndTime) &&
        Objects.equals(this.authorizeStartTime, enterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner.authorizeStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeEndTime, authorizeStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner {\n");
    sb.append("    authorizeEndTime: ").append(toIndentedString(authorizeEndTime)).append("\n");
    sb.append("    authorizeStartTime: ").append(toIndentedString(authorizeStartTime)).append("\n");
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
    openapiFields.add("authorize_end_time");
    openapiFields.add("authorize_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner
  */
  public static EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner.class);
  }

 /**
  * Convert an instance of EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

