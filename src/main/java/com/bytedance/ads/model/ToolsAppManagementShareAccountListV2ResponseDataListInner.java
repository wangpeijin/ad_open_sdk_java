/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2DataListShareMode;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2ResponseDataListInnerAccountInfo;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount;
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccountByCompany;
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
 * ToolsAppManagementShareAccountListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsAppManagementShareAccountListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsAppManagementShareAccountListV2ResponseDataListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT = "all_account";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT)
  private ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount allAccount = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY = "all_account_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY)
  private ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccountByCompany allAccountByCompany = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsAppManagementShareAccountListV2DataListShareMode shareMode = null;

  public ToolsAppManagementShareAccountListV2ResponseDataListInner() {
  }

  public ToolsAppManagementShareAccountListV2ResponseDataListInner accountInfo(ToolsAppManagementShareAccountListV2ResponseDataListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementShareAccountListV2ResponseDataListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsAppManagementShareAccountListV2ResponseDataListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsAppManagementShareAccountListV2ResponseDataListInner allAccount(ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount allAccount) {
    
    this.allAccount = allAccount;
    return this;
  }

   /**
   * Get allAccount
   * @return allAccount
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount getAllAccount() {
    return allAccount;
  }


  public void setAllAccount(ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount allAccount) {
    this.allAccount = allAccount;
  }


  public ToolsAppManagementShareAccountListV2ResponseDataListInner allAccountByCompany(ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccountByCompany allAccountByCompany) {
    
    this.allAccountByCompany = allAccountByCompany;
    return this;
  }

   /**
   * Get allAccountByCompany
   * @return allAccountByCompany
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccountByCompany getAllAccountByCompany() {
    return allAccountByCompany;
  }


  public void setAllAccountByCompany(ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccountByCompany allAccountByCompany) {
    this.allAccountByCompany = allAccountByCompany;
  }


  public ToolsAppManagementShareAccountListV2ResponseDataListInner shareMode(ToolsAppManagementShareAccountListV2DataListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementShareAccountListV2DataListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsAppManagementShareAccountListV2DataListShareMode shareMode) {
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
    ToolsAppManagementShareAccountListV2ResponseDataListInner toolsAppManagementShareAccountListV2ResponseDataListInner = (ToolsAppManagementShareAccountListV2ResponseDataListInner) o;
    return Objects.equals(this.accountInfo, toolsAppManagementShareAccountListV2ResponseDataListInner.accountInfo) &&
        Objects.equals(this.allAccount, toolsAppManagementShareAccountListV2ResponseDataListInner.allAccount) &&
        Objects.equals(this.allAccountByCompany, toolsAppManagementShareAccountListV2ResponseDataListInner.allAccountByCompany) &&
        Objects.equals(this.shareMode, toolsAppManagementShareAccountListV2ResponseDataListInner.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccount, allAccountByCompany, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementShareAccountListV2ResponseDataListInner {\n");
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
       if (!ToolsAppManagementShareAccountListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementShareAccountListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementShareAccountListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementShareAccountListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementShareAccountListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementShareAccountListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementShareAccountListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementShareAccountListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementShareAccountListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementShareAccountListV2ResponseDataListInner
  */
  public static ToolsAppManagementShareAccountListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementShareAccountListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementShareAccountListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

