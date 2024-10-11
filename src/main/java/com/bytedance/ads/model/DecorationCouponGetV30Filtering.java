/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class DecorationCouponGetV30Filtering {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId = null;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName = null;

  public DecorationCouponGetV30Filtering() {
  }

  public DecorationCouponGetV30Filtering activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动ID
   * @return activityId
  **/
  @javax.annotation.Nullable
  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public DecorationCouponGetV30Filtering activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称
   * @return activityName
  **/
  @javax.annotation.Nullable
  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecorationCouponGetV30Filtering decorationCouponGetV30Filtering = (DecorationCouponGetV30Filtering) o;
    return Objects.equals(this.activityId, decorationCouponGetV30Filtering.activityId) &&
        Objects.equals(this.activityName, decorationCouponGetV30Filtering.activityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecorationCouponGetV30Filtering {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("activity_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecorationCouponGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecorationCouponGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecorationCouponGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecorationCouponGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<DecorationCouponGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, DecorationCouponGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecorationCouponGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecorationCouponGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecorationCouponGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to DecorationCouponGetV30Filtering
  */
  public static DecorationCouponGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecorationCouponGetV30Filtering.class);
  }

 /**
  * Convert an instance of DecorationCouponGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

