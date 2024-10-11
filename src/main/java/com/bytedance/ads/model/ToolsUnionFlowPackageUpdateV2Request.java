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
 * ToolsUnionFlowPackageUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsUnionFlowPackageUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE_ID = "flow_package_id";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE_ID)
  private Long flowPackageId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RIT = "rit";
  @SerializedName(SERIALIZED_NAME_RIT)
  private List<Long> rit = null;

  public ToolsUnionFlowPackageUpdateV2Request() {
  }

  public ToolsUnionFlowPackageUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsUnionFlowPackageUpdateV2Request flowPackageId(Long flowPackageId) {
    
    this.flowPackageId = flowPackageId;
    return this;
  }

   /**
   * 
   * @return flowPackageId
  **/
  @javax.annotation.Nonnull
  public Long getFlowPackageId() {
    return flowPackageId;
  }


  public void setFlowPackageId(Long flowPackageId) {
    this.flowPackageId = flowPackageId;
  }


  public ToolsUnionFlowPackageUpdateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsUnionFlowPackageUpdateV2Request rit(List<Long> rit) {
    
    this.rit = rit;
    return this;
  }

  public ToolsUnionFlowPackageUpdateV2Request addRitItem(Long ritItem) {
    if (this.rit == null) {
      this.rit = new ArrayList<>();
    }
    this.rit.add(ritItem);
    return this;
  }

   /**
   * 
   * @return rit
  **/
  @javax.annotation.Nonnull
  public List<Long> getRit() {
    return rit;
  }


  public void setRit(List<Long> rit) {
    this.rit = rit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsUnionFlowPackageUpdateV2Request toolsUnionFlowPackageUpdateV2Request = (ToolsUnionFlowPackageUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsUnionFlowPackageUpdateV2Request.advertiserId) &&
        Objects.equals(this.flowPackageId, toolsUnionFlowPackageUpdateV2Request.flowPackageId) &&
        Objects.equals(this.name, toolsUnionFlowPackageUpdateV2Request.name) &&
        Objects.equals(this.rit, toolsUnionFlowPackageUpdateV2Request.rit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, flowPackageId, name, rit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsUnionFlowPackageUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    flowPackageId: ").append(toIndentedString(flowPackageId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rit: ").append(toIndentedString(rit)).append("\n");
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
    openapiFields.add("flow_package_id");
    openapiFields.add("name");
    openapiFields.add("rit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("flow_package_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("rit");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsUnionFlowPackageUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsUnionFlowPackageUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsUnionFlowPackageUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsUnionFlowPackageUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsUnionFlowPackageUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsUnionFlowPackageUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsUnionFlowPackageUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsUnionFlowPackageUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsUnionFlowPackageUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsUnionFlowPackageUpdateV2Request
  */
  public static ToolsUnionFlowPackageUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsUnionFlowPackageUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsUnionFlowPackageUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

