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
import com.bytedance.ads.model.ToolsAppManagementBpShareV2DataSuccessListShareMode;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAccountInfo;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccount;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany;
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
 * ToolsAppManagementBpShareV2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ToolsAppManagementBpShareV2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT = "all_account";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT)
  private ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccount allAccount = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY = "all_account_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY)
  private ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsAppManagementBpShareV2DataSuccessListShareMode shareMode = null;

  public ToolsAppManagementBpShareV2ResponseDataSuccessListInner() {
  }

  public ToolsAppManagementBpShareV2ResponseDataSuccessListInner accountInfo(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsAppManagementBpShareV2ResponseDataSuccessListInner allAccount(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccount allAccount) {
    
    this.allAccount = allAccount;
    return this;
  }

   /**
   * Get allAccount
   * @return allAccount
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccount getAllAccount() {
    return allAccount;
  }


  public void setAllAccount(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccount allAccount) {
    this.allAccount = allAccount;
  }


  public ToolsAppManagementBpShareV2ResponseDataSuccessListInner allAccountByCompany(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany) {
    
    this.allAccountByCompany = allAccountByCompany;
    return this;
  }

   /**
   * Get allAccountByCompany
   * @return allAccountByCompany
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany getAllAccountByCompany() {
    return allAccountByCompany;
  }


  public void setAllAccountByCompany(ToolsAppManagementBpShareV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany) {
    this.allAccountByCompany = allAccountByCompany;
  }


  public ToolsAppManagementBpShareV2ResponseDataSuccessListInner shareMode(ToolsAppManagementBpShareV2DataSuccessListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2DataSuccessListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsAppManagementBpShareV2DataSuccessListShareMode shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementBpShareV2ResponseDataSuccessListInner toolsAppManagementBpShareV2ResponseDataSuccessListInner = (ToolsAppManagementBpShareV2ResponseDataSuccessListInner) o;
    return Objects.equals(this.accountInfo, toolsAppManagementBpShareV2ResponseDataSuccessListInner.accountInfo) &&
        Objects.equals(this.allAccount, toolsAppManagementBpShareV2ResponseDataSuccessListInner.allAccount) &&
        Objects.equals(this.allAccountByCompany, toolsAppManagementBpShareV2ResponseDataSuccessListInner.allAccountByCompany) &&
        Objects.equals(this.shareMode, toolsAppManagementBpShareV2ResponseDataSuccessListInner.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccount, allAccountByCompany, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareV2ResponseDataSuccessListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccount: ").append(toIndentedString(allAccount)).append("\n");
    sb.append("    allAccountByCompany: ").append(toIndentedString(allAccountByCompany)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_info");
    openapiFields.add("all_account");
    openapiFields.add("all_account_by_company");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareV2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareV2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareV2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareV2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareV2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareV2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareV2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareV2ResponseDataSuccessListInner
  */
  public static ToolsAppManagementBpShareV2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareV2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareV2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

