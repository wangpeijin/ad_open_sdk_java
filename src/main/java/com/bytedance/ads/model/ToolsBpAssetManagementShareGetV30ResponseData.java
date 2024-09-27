/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ResponseDataPageInfo;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsBpAssetManagementShareGetV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsBpAssetManagementShareGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_SHARED_ACCOUNTS = "sharedAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_ACCOUNTS)
  private List<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner> sharedAccounts = null;

  public ToolsBpAssetManagementShareGetV30ResponseData() {
  }

  public ToolsBpAssetManagementShareGetV30ResponseData pageInfo(ToolsBpAssetManagementShareGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsBpAssetManagementShareGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ToolsBpAssetManagementShareGetV30ResponseData sharedAccounts(List<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner> sharedAccounts) {
    
    this.sharedAccounts = sharedAccounts;
    return this;
  }

  public ToolsBpAssetManagementShareGetV30ResponseData addSharedAccountsItem(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner sharedAccountsItem) {
    if (this.sharedAccounts == null) {
      this.sharedAccounts = new ArrayList<>();
    }
    this.sharedAccounts.add(sharedAccountsItem);
    return this;
  }

   /**
   * 
   * @return sharedAccounts
  **/
  @javax.annotation.Nullable
  public List<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner> getSharedAccounts() {
    return sharedAccounts;
  }


  public void setSharedAccounts(List<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInner> sharedAccounts) {
    this.sharedAccounts = sharedAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBpAssetManagementShareGetV30ResponseData toolsBpAssetManagementShareGetV30ResponseData = (ToolsBpAssetManagementShareGetV30ResponseData) o;
    return Objects.equals(this.pageInfo, toolsBpAssetManagementShareGetV30ResponseData.pageInfo) &&
        Objects.equals(this.sharedAccounts, toolsBpAssetManagementShareGetV30ResponseData.sharedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, sharedAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBpAssetManagementShareGetV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    sharedAccounts: ").append(toIndentedString(sharedAccounts)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("sharedAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_info");
    openapiRequiredFields.add("sharedAccounts");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareGetV30ResponseData
  */
  public static ToolsBpAssetManagementShareGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

