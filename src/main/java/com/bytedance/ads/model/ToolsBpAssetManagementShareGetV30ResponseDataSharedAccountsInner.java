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
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAccountInfo;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP = "all_accounts_by_bp";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP)
  private ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp allAccountsByBp = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY = "all_accounts_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY)
  private ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany allAccountsByCompany = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode shareMode = null;

  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner() {
  }

  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner accountInfo(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner allAccountsByBp(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp allAccountsByBp) {
    
    this.allAccountsByBp = allAccountsByBp;
    return this;
  }

   /**
   * Get allAccountsByBp
   * @return allAccountsByBp
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp getAllAccountsByBp() {
    return allAccountsByBp;
  }


  public void setAllAccountsByBp(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp allAccountsByBp) {
    this.allAccountsByBp = allAccountsByBp;
  }


  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner allAccountsByCompany(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany allAccountsByCompany) {
    
    this.allAccountsByCompany = allAccountsByCompany;
    return this;
  }

   /**
   * Get allAccountsByCompany
   * @return allAccountsByCompany
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany getAllAccountsByCompany() {
    return allAccountsByCompany;
  }


  public void setAllAccountsByCompany(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany allAccountsByCompany) {
    this.allAccountsByCompany = allAccountsByCompany;
  }


  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner shareMode(ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode shareMode) {
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
    ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner = (ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner) o;
    return Objects.equals(this.accountInfo, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.accountInfo) &&
        Objects.equals(this.allAccountsByBp, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.allAccountsByBp) &&
        Objects.equals(this.allAccountsByCompany, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.allAccountsByCompany) &&
        Objects.equals(this.shareMode, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.shareMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccountsByBp, allAccountsByCompany, shareMode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccountsByBp: ").append(toIndentedString(allAccountsByBp)).append("\n");
    sb.append("    allAccountsByCompany: ").append(toIndentedString(allAccountsByCompany)).append("\n");
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
    openapiFields.add("all_accounts_by_bp");
    openapiFields.add("all_accounts_by_company");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("share_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner
  */
  public static ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

