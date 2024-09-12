/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2AccountInfosAccountType;
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
 * ToolsAppManagementBpShareV2RequestAccountInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsAppManagementBpShareV2RequestAccountInfosInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementBpShareV2AccountInfosAccountType accountType = null;

  public ToolsAppManagementBpShareV2RequestAccountInfosInner() {
  }

  public ToolsAppManagementBpShareV2RequestAccountInfosInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementBpShareV2RequestAccountInfosInner accountType(ToolsAppManagementBpShareV2AccountInfosAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementBpShareV2AccountInfosAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementBpShareV2AccountInfosAccountType accountType) {
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
    ToolsAppManagementBpShareV2RequestAccountInfosInner toolsAppManagementBpShareV2RequestAccountInfosInner = (ToolsAppManagementBpShareV2RequestAccountInfosInner) o;
    return Objects.equals(this.accountId, toolsAppManagementBpShareV2RequestAccountInfosInner.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementBpShareV2RequestAccountInfosInner.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareV2RequestAccountInfosInner {\n");
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
       if (!ToolsAppManagementBpShareV2RequestAccountInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareV2RequestAccountInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareV2RequestAccountInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareV2RequestAccountInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareV2RequestAccountInfosInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareV2RequestAccountInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareV2RequestAccountInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareV2RequestAccountInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareV2RequestAccountInfosInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareV2RequestAccountInfosInner
  */
  public static ToolsAppManagementBpShareV2RequestAccountInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareV2RequestAccountInfosInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareV2RequestAccountInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

