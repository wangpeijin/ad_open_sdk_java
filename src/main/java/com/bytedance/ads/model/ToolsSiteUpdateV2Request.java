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
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ToolsSiteUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BRICKS = "bricks";
  @SerializedName(SERIALIZED_NAME_BRICKS)
  private List<ToolsSiteUpdateV2RequestBricksInner> bricks = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public ToolsSiteUpdateV2Request() {
  }

  public ToolsSiteUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsSiteUpdateV2Request bricks(List<ToolsSiteUpdateV2RequestBricksInner> bricks) {
    
    this.bricks = bricks;
    return this;
  }

  public ToolsSiteUpdateV2Request addBricksItem(ToolsSiteUpdateV2RequestBricksInner bricksItem) {
    if (this.bricks == null) {
      this.bricks = new ArrayList<>();
    }
    this.bricks.add(bricksItem);
    return this;
  }

   /**
   * 
   * @return bricks
  **/
  @javax.annotation.Nonnull
  public List<ToolsSiteUpdateV2RequestBricksInner> getBricks() {
    return bricks;
  }


  public void setBricks(List<ToolsSiteUpdateV2RequestBricksInner> bricks) {
    this.bricks = bricks;
  }


  public ToolsSiteUpdateV2Request name(String name) {
    
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


  public ToolsSiteUpdateV2Request siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nonnull
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2Request toolsSiteUpdateV2Request = (ToolsSiteUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsSiteUpdateV2Request.advertiserId) &&
        Objects.equals(this.bricks, toolsSiteUpdateV2Request.bricks) &&
        Objects.equals(this.name, toolsSiteUpdateV2Request.name) &&
        Objects.equals(this.siteId, toolsSiteUpdateV2Request.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bricks, name, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bricks: ").append(toIndentedString(bricks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("bricks");
    openapiFields.add("name");
    openapiFields.add("site_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("bricks");
    openapiRequiredFields.add("site_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2Request
  */
  public static ToolsSiteUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

