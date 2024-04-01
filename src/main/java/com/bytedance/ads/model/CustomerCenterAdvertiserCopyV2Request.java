/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * CustomerCenterAdvertiserCopyV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class CustomerCenterAdvertiserCopyV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CC_ACCOUNT_ID = "cc_account_id";
  @SerializedName(SERIALIZED_NAME_CC_ACCOUNT_ID)
  private Long ccAccountId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public CustomerCenterAdvertiserCopyV2Request() {
  }

  public CustomerCenterAdvertiserCopyV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CustomerCenterAdvertiserCopyV2Request ccAccountId(Long ccAccountId) {
    
    this.ccAccountId = ccAccountId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return ccAccountId
  **/
  @javax.annotation.Nonnull
  public Long getCcAccountId() {
    return ccAccountId;
  }


  public void setCcAccountId(Long ccAccountId) {
    this.ccAccountId = ccAccountId;
  }


  public CustomerCenterAdvertiserCopyV2Request name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCenterAdvertiserCopyV2Request customerCenterAdvertiserCopyV2Request = (CustomerCenterAdvertiserCopyV2Request) o;
    return Objects.equals(this.advertiserId, customerCenterAdvertiserCopyV2Request.advertiserId) &&
        Objects.equals(this.ccAccountId, customerCenterAdvertiserCopyV2Request.ccAccountId) &&
        Objects.equals(this.name, customerCenterAdvertiserCopyV2Request.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, ccAccountId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCenterAdvertiserCopyV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ccAccountId: ").append(toIndentedString(ccAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("cc_account_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("cc_account_id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCenterAdvertiserCopyV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCenterAdvertiserCopyV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCenterAdvertiserCopyV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCenterAdvertiserCopyV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCenterAdvertiserCopyV2Request>() {
           @Override
           public void write(JsonWriter out, CustomerCenterAdvertiserCopyV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCenterAdvertiserCopyV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCenterAdvertiserCopyV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCenterAdvertiserCopyV2Request
  * @throws IOException if the JSON string is invalid with respect to CustomerCenterAdvertiserCopyV2Request
  */
  public static CustomerCenterAdvertiserCopyV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCenterAdvertiserCopyV2Request.class);
  }

 /**
  * Convert an instance of CustomerCenterAdvertiserCopyV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

