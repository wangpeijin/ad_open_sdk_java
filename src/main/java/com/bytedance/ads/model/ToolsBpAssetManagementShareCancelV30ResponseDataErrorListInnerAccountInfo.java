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
import com.bytedance.ads.model.ToolsBpAssetManagementShareCancelV30DataErrorListAccountInfoAccountType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsBpAssetManagementShareCancelV30DataErrorListAccountInfoAccountType accountType = null;

  public ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo() {
  }

  public ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo accountType(ToolsBpAssetManagementShareCancelV30DataErrorListAccountInfoAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareCancelV30DataErrorListAccountInfoAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsBpAssetManagementShareCancelV30DataErrorListAccountInfoAccountType accountType) {
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
    ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo toolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo = (ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo) o;
    return Objects.equals(this.accountId, toolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo.accountId) &&
        Objects.equals(this.accountType, toolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo.accountType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
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
    sb.append("class ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo
  */
  public static ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareCancelV30ResponseDataErrorListInnerAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

