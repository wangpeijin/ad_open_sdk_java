/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AssetsCreativeComponentUpdateV2RequestComponentInfo;
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
 * AssetsCreativeComponentUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class AssetsCreativeComponentUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private AssetsCreativeComponentUpdateV2RequestComponentInfo componentInfo = null;

  public AssetsCreativeComponentUpdateV2Request() {
  }

  public AssetsCreativeComponentUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AssetsCreativeComponentUpdateV2Request componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return componentId
  **/
  @javax.annotation.Nonnull
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public AssetsCreativeComponentUpdateV2Request componentInfo(AssetsCreativeComponentUpdateV2RequestComponentInfo componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

   /**
   * Get componentInfo
   * @return componentInfo
  **/
  @javax.annotation.Nonnull
  public AssetsCreativeComponentUpdateV2RequestComponentInfo getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(AssetsCreativeComponentUpdateV2RequestComponentInfo componentInfo) {
    this.componentInfo = componentInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsCreativeComponentUpdateV2Request assetsCreativeComponentUpdateV2Request = (AssetsCreativeComponentUpdateV2Request) o;
    return Objects.equals(this.advertiserId, assetsCreativeComponentUpdateV2Request.advertiserId) &&
        Objects.equals(this.componentId, assetsCreativeComponentUpdateV2Request.componentId) &&
        Objects.equals(this.componentInfo, assetsCreativeComponentUpdateV2Request.componentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, componentId, componentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCreativeComponentUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    componentInfo: ").append(toIndentedString(componentInfo)).append("\n");
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
    openapiFields.add("component_id");
    openapiFields.add("component_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("component_id");
    openapiRequiredFields.add("component_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsCreativeComponentUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsCreativeComponentUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsCreativeComponentUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsCreativeComponentUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsCreativeComponentUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, AssetsCreativeComponentUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsCreativeComponentUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsCreativeComponentUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsCreativeComponentUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to AssetsCreativeComponentUpdateV2Request
  */
  public static AssetsCreativeComponentUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsCreativeComponentUpdateV2Request.class);
  }

 /**
  * Convert an instance of AssetsCreativeComponentUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

