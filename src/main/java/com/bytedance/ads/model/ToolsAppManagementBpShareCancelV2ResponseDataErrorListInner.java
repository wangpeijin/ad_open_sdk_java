/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2DataErrorListShareMode;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAccountInfo;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccount;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccountByCompany;
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
 * ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT = "all_account";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT)
  private ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccount allAccount = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY = "all_account_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY)
  private ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccountByCompany allAccountByCompany = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsAppManagementBpShareCancelV2DataErrorListShareMode shareMode = null;

  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner() {
  }

  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner accountInfo(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner allAccount(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccount allAccount) {
    
    this.allAccount = allAccount;
    return this;
  }

   /**
   * Get allAccount
   * @return allAccount
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccount getAllAccount() {
    return allAccount;
  }


  public void setAllAccount(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccount allAccount) {
    this.allAccount = allAccount;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner allAccountByCompany(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccountByCompany allAccountByCompany) {
    
    this.allAccountByCompany = allAccountByCompany;
    return this;
  }

   /**
   * Get allAccountByCompany
   * @return allAccountByCompany
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccountByCompany getAllAccountByCompany() {
    return allAccountByCompany;
  }


  public void setAllAccountByCompany(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInnerAllAccountByCompany allAccountByCompany) {
    this.allAccountByCompany = allAccountByCompany;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner shareMode(ToolsAppManagementBpShareCancelV2DataErrorListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2DataErrorListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsAppManagementBpShareCancelV2DataErrorListShareMode shareMode) {
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
    ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner toolsAppManagementBpShareCancelV2ResponseDataErrorListInner = (ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner) o;
    return Objects.equals(this.accountInfo, toolsAppManagementBpShareCancelV2ResponseDataErrorListInner.accountInfo) &&
        Objects.equals(this.allAccount, toolsAppManagementBpShareCancelV2ResponseDataErrorListInner.allAccount) &&
        Objects.equals(this.allAccountByCompany, toolsAppManagementBpShareCancelV2ResponseDataErrorListInner.allAccountByCompany) &&
        Objects.equals(this.errorMessage, toolsAppManagementBpShareCancelV2ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.shareMode, toolsAppManagementBpShareCancelV2ResponseDataErrorListInner.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccount, allAccountByCompany, errorMessage, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccount: ").append(toIndentedString(allAccount)).append("\n");
    sb.append("    allAccountByCompany: ").append(toIndentedString(allAccountByCompany)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("error_message");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner
  */
  public static ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

