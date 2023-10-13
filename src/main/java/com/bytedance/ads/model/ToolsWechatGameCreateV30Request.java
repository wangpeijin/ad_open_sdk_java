/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsWechatGameCreateV30AccountType;
import com.bytedance.ads.model.ToolsWechatGameCreateV30RequestAnchorList;
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
 * ToolsWechatGameCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ToolsWechatGameCreateV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsWechatGameCreateV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_AGE_REMIND_URL = "age_remind_url";
  @SerializedName(SERIALIZED_NAME_AGE_REMIND_URL)
  private String ageRemindUrl = null;

  public static final String SERIALIZED_NAME_ANCHOR_LIST = "anchor_list";
  @SerializedName(SERIALIZED_NAME_ANCHOR_LIST)
  private ToolsWechatGameCreateV30RequestAnchorList anchorList = null;

  public static final String SERIALIZED_NAME_ANTI_ADDICTION_URL = "anti_addiction_url";
  @SerializedName(SERIALIZED_NAME_ANTI_ADDICTION_URL)
  private String antiAddictionUrl = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_REAL_NAME_URL = "real_name_url";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_URL)
  private String realNameUrl = null;

  public static final String SERIALIZED_NAME_SCREEN_RECORD_URL = "screen_record_url";
  @SerializedName(SERIALIZED_NAME_SCREEN_RECORD_URL)
  private String screenRecordUrl = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatGameCreateV30Request() {
  }

  public ToolsWechatGameCreateV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsWechatGameCreateV30Request accountType(ToolsWechatGameCreateV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsWechatGameCreateV30AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsWechatGameCreateV30Request ageRemindUrl(String ageRemindUrl) {
    
    this.ageRemindUrl = ageRemindUrl;
    return this;
  }

   /**
   * 
   * @return ageRemindUrl
  **/
  @javax.annotation.Nonnull
  public String getAgeRemindUrl() {
    return ageRemindUrl;
  }


  public void setAgeRemindUrl(String ageRemindUrl) {
    this.ageRemindUrl = ageRemindUrl;
  }


  public ToolsWechatGameCreateV30Request anchorList(ToolsWechatGameCreateV30RequestAnchorList anchorList) {
    
    this.anchorList = anchorList;
    return this;
  }

   /**
   * Get anchorList
   * @return anchorList
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30RequestAnchorList getAnchorList() {
    return anchorList;
  }


  public void setAnchorList(ToolsWechatGameCreateV30RequestAnchorList anchorList) {
    this.anchorList = anchorList;
  }


  public ToolsWechatGameCreateV30Request antiAddictionUrl(String antiAddictionUrl) {
    
    this.antiAddictionUrl = antiAddictionUrl;
    return this;
  }

   /**
   * 
   * @return antiAddictionUrl
  **/
  @javax.annotation.Nonnull
  public String getAntiAddictionUrl() {
    return antiAddictionUrl;
  }


  public void setAntiAddictionUrl(String antiAddictionUrl) {
    this.antiAddictionUrl = antiAddictionUrl;
  }


  public ToolsWechatGameCreateV30Request companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public ToolsWechatGameCreateV30Request name(String name) {
    
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


  public ToolsWechatGameCreateV30Request path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ToolsWechatGameCreateV30Request realNameUrl(String realNameUrl) {
    
    this.realNameUrl = realNameUrl;
    return this;
  }

   /**
   * 
   * @return realNameUrl
  **/
  @javax.annotation.Nonnull
  public String getRealNameUrl() {
    return realNameUrl;
  }


  public void setRealNameUrl(String realNameUrl) {
    this.realNameUrl = realNameUrl;
  }


  public ToolsWechatGameCreateV30Request screenRecordUrl(String screenRecordUrl) {
    
    this.screenRecordUrl = screenRecordUrl;
    return this;
  }

   /**
   * 
   * @return screenRecordUrl
  **/
  @javax.annotation.Nonnull
  public String getScreenRecordUrl() {
    return screenRecordUrl;
  }


  public void setScreenRecordUrl(String screenRecordUrl) {
    this.screenRecordUrl = screenRecordUrl;
  }


  public ToolsWechatGameCreateV30Request userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @javax.annotation.Nonnull
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatGameCreateV30Request toolsWechatGameCreateV30Request = (ToolsWechatGameCreateV30Request) o;
    return Objects.equals(this.accountId, toolsWechatGameCreateV30Request.accountId) &&
        Objects.equals(this.accountType, toolsWechatGameCreateV30Request.accountType) &&
        Objects.equals(this.ageRemindUrl, toolsWechatGameCreateV30Request.ageRemindUrl) &&
        Objects.equals(this.anchorList, toolsWechatGameCreateV30Request.anchorList) &&
        Objects.equals(this.antiAddictionUrl, toolsWechatGameCreateV30Request.antiAddictionUrl) &&
        Objects.equals(this.companyId, toolsWechatGameCreateV30Request.companyId) &&
        Objects.equals(this.name, toolsWechatGameCreateV30Request.name) &&
        Objects.equals(this.path, toolsWechatGameCreateV30Request.path) &&
        Objects.equals(this.realNameUrl, toolsWechatGameCreateV30Request.realNameUrl) &&
        Objects.equals(this.screenRecordUrl, toolsWechatGameCreateV30Request.screenRecordUrl) &&
        Objects.equals(this.userName, toolsWechatGameCreateV30Request.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, ageRemindUrl, anchorList, antiAddictionUrl, companyId, name, path, realNameUrl, screenRecordUrl, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatGameCreateV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    ageRemindUrl: ").append(toIndentedString(ageRemindUrl)).append("\n");
    sb.append("    anchorList: ").append(toIndentedString(anchorList)).append("\n");
    sb.append("    antiAddictionUrl: ").append(toIndentedString(antiAddictionUrl)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    realNameUrl: ").append(toIndentedString(realNameUrl)).append("\n");
    sb.append("    screenRecordUrl: ").append(toIndentedString(screenRecordUrl)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("age_remind_url");
    openapiFields.add("anchor_list");
    openapiFields.add("anti_addiction_url");
    openapiFields.add("company_id");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("real_name_url");
    openapiFields.add("screen_record_url");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("age_remind_url");
    openapiRequiredFields.add("anchor_list");
    openapiRequiredFields.add("anti_addiction_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("real_name_url");
    openapiRequiredFields.add("screen_record_url");
    openapiRequiredFields.add("user_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatGameCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatGameCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatGameCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatGameCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatGameCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsWechatGameCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatGameCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatGameCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatGameCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatGameCreateV30Request
  */
  public static ToolsWechatGameCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatGameCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsWechatGameCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

