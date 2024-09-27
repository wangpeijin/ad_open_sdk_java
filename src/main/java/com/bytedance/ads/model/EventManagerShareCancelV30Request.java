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
import com.bytedance.ads.model.EventManagerShareCancelV30AllAccountType;
import com.bytedance.ads.model.EventManagerShareCancelV30RequestAccountInfosInner;
import com.bytedance.ads.model.EventManagerShareCancelV30ShareMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * EventManagerShareCancelV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class EventManagerShareCancelV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_INFOS = "account_infos";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFOS)
  private List<EventManagerShareCancelV30RequestAccountInfosInner> accountInfos = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_TYPE = "all_account_type";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_TYPE)
  private List<EventManagerShareCancelV30AllAccountType> allAccountType = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Long organizationId = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private EventManagerShareCancelV30ShareMode shareMode = null;

  public EventManagerShareCancelV30Request() {
  }

  public EventManagerShareCancelV30Request accountInfos(List<EventManagerShareCancelV30RequestAccountInfosInner> accountInfos) {
    
    this.accountInfos = accountInfos;
    return this;
  }

  public EventManagerShareCancelV30Request addAccountInfosItem(EventManagerShareCancelV30RequestAccountInfosInner accountInfosItem) {
    if (this.accountInfos == null) {
      this.accountInfos = new ArrayList<>();
    }
    this.accountInfos.add(accountInfosItem);
    return this;
  }

   /**
   * 
   * @return accountInfos
  **/
  @javax.annotation.Nullable
  public List<EventManagerShareCancelV30RequestAccountInfosInner> getAccountInfos() {
    return accountInfos;
  }


  public void setAccountInfos(List<EventManagerShareCancelV30RequestAccountInfosInner> accountInfos) {
    this.accountInfos = accountInfos;
  }


  public EventManagerShareCancelV30Request allAccountType(List<EventManagerShareCancelV30AllAccountType> allAccountType) {
    
    this.allAccountType = allAccountType;
    return this;
  }

  public EventManagerShareCancelV30Request addAllAccountTypeItem(EventManagerShareCancelV30AllAccountType allAccountTypeItem) {
    if (this.allAccountType == null) {
      this.allAccountType = new ArrayList<>();
    }
    this.allAccountType.add(allAccountTypeItem);
    return this;
  }

   /**
   * 
   * @return allAccountType
  **/
  @javax.annotation.Nullable
  public List<EventManagerShareCancelV30AllAccountType> getAllAccountType() {
    return allAccountType;
  }


  public void setAllAccountType(List<EventManagerShareCancelV30AllAccountType> allAccountType) {
    this.allAccountType = allAccountType;
  }


  public EventManagerShareCancelV30Request assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public EventManagerShareCancelV30Request organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * 
   * @return organizationId
  **/
  @javax.annotation.Nullable
  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public EventManagerShareCancelV30Request shareMode(EventManagerShareCancelV30ShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public EventManagerShareCancelV30ShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(EventManagerShareCancelV30ShareMode shareMode) {
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
    EventManagerShareCancelV30Request eventManagerShareCancelV30Request = (EventManagerShareCancelV30Request) o;
    return Objects.equals(this.accountInfos, eventManagerShareCancelV30Request.accountInfos) &&
        Objects.equals(this.allAccountType, eventManagerShareCancelV30Request.allAccountType) &&
        Objects.equals(this.assetId, eventManagerShareCancelV30Request.assetId) &&
        Objects.equals(this.organizationId, eventManagerShareCancelV30Request.organizationId) &&
        Objects.equals(this.shareMode, eventManagerShareCancelV30Request.shareMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfos, allAccountType, assetId, organizationId, shareMode);
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
    sb.append("class EventManagerShareCancelV30Request {\n");
    sb.append("    accountInfos: ").append(toIndentedString(accountInfos)).append("\n");
    sb.append("    allAccountType: ").append(toIndentedString(allAccountType)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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
    openapiFields.add("account_infos");
    openapiFields.add("all_account_type");
    openapiFields.add("asset_id");
    openapiFields.add("organization_id");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asset_id");
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("share_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerShareCancelV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerShareCancelV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerShareCancelV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerShareCancelV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerShareCancelV30Request>() {
           @Override
           public void write(JsonWriter out, EventManagerShareCancelV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerShareCancelV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerShareCancelV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerShareCancelV30Request
  * @throws IOException if the JSON string is invalid with respect to EventManagerShareCancelV30Request
  */
  public static EventManagerShareCancelV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerShareCancelV30Request.class);
  }

 /**
  * Convert an instance of EventManagerShareCancelV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

