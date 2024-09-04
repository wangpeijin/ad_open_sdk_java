/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30AccountInfosAccountType;
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
 * ToolsBpAssetManagementShareV30RequestAccountInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsBpAssetManagementShareV30RequestAccountInfosInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsBpAssetManagementShareV30AccountInfosAccountType accountType = null;

  public ToolsBpAssetManagementShareV30RequestAccountInfosInner() {
  }

  public ToolsBpAssetManagementShareV30RequestAccountInfosInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户ID
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsBpAssetManagementShareV30RequestAccountInfosInner accountType(ToolsBpAssetManagementShareV30AccountInfosAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsBpAssetManagementShareV30AccountInfosAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsBpAssetManagementShareV30AccountInfosAccountType accountType) {
    this.accountType = accountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBpAssetManagementShareV30RequestAccountInfosInner toolsBpAssetManagementShareV30RequestAccountInfosInner = (ToolsBpAssetManagementShareV30RequestAccountInfosInner) o;
    return Objects.equals(this.accountId, toolsBpAssetManagementShareV30RequestAccountInfosInner.accountId) &&
        Objects.equals(this.accountType, toolsBpAssetManagementShareV30RequestAccountInfosInner.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBpAssetManagementShareV30RequestAccountInfosInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareV30RequestAccountInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareV30RequestAccountInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareV30RequestAccountInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareV30RequestAccountInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareV30RequestAccountInfosInner>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareV30RequestAccountInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareV30RequestAccountInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareV30RequestAccountInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareV30RequestAccountInfosInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareV30RequestAccountInfosInner
  */
  public static ToolsBpAssetManagementShareV30RequestAccountInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareV30RequestAccountInfosInner.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareV30RequestAccountInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

