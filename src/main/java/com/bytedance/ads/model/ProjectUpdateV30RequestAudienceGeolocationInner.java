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
 * ProjectUpdateV30RequestAudienceGeolocationInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ProjectUpdateV30RequestAudienceGeolocationInner {
  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat = null;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Double _long = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RADIUS = "radius";
  @SerializedName(SERIALIZED_NAME_RADIUS)
  private Long radius = null;

  public ProjectUpdateV30RequestAudienceGeolocationInner() {
  }

  public ProjectUpdateV30RequestAudienceGeolocationInner lat(Double lat) {
    
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


  public ProjectUpdateV30RequestAudienceGeolocationInner _long(Double _long) {
    
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


  public ProjectUpdateV30RequestAudienceGeolocationInner name(String name) {
    
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


  public ProjectUpdateV30RequestAudienceGeolocationInner radius(Long radius) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateV30RequestAudienceGeolocationInner projectUpdateV30RequestAudienceGeolocationInner = (ProjectUpdateV30RequestAudienceGeolocationInner) o;
    return Objects.equals(this.lat, projectUpdateV30RequestAudienceGeolocationInner.lat) &&
        Objects.equals(this._long, projectUpdateV30RequestAudienceGeolocationInner._long) &&
        Objects.equals(this.name, projectUpdateV30RequestAudienceGeolocationInner.name) &&
        Objects.equals(this.radius, projectUpdateV30RequestAudienceGeolocationInner.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long, name, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30RequestAudienceGeolocationInner {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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
    openapiFields.add("lat");
    openapiFields.add("long");
    openapiFields.add("name");
    openapiFields.add("radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30RequestAudienceGeolocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30RequestAudienceGeolocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30RequestAudienceGeolocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30RequestAudienceGeolocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30RequestAudienceGeolocationInner>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30RequestAudienceGeolocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30RequestAudienceGeolocationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30RequestAudienceGeolocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30RequestAudienceGeolocationInner
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30RequestAudienceGeolocationInner
  */
  public static ProjectUpdateV30RequestAudienceGeolocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30RequestAudienceGeolocationInner.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30RequestAudienceGeolocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

