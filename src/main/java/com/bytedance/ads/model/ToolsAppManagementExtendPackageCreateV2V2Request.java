/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2V2AccountType;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2V2Mode;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner;
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
 * ToolsAppManagementExtendPackageCreateV2V2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ToolsAppManagementExtendPackageCreateV2V2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementExtendPackageCreateV2V2AccountType accountType = null;

  public static final String SERIALIZED_NAME_CHANNEL_COUNT = "channel_count";
  @SerializedName(SERIALIZED_NAME_CHANNEL_COUNT)
  private Long channelCount = null;

  public static final String SERIALIZED_NAME_CHANNEL_LIST = "channel_list";
  @SerializedName(SERIALIZED_NAME_CHANNEL_LIST)
  private List<ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner> channelList = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ToolsAppManagementExtendPackageCreateV2V2Mode mode = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public ToolsAppManagementExtendPackageCreateV2V2Request() {
  }

  public ToolsAppManagementExtendPackageCreateV2V2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户id，如广告主id、bpid等
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementExtendPackageCreateV2V2Request accountType(ToolsAppManagementExtendPackageCreateV2V2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementExtendPackageCreateV2V2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementExtendPackageCreateV2V2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsAppManagementExtendPackageCreateV2V2Request channelCount(Long channelCount) {
    
    this.channelCount = channelCount;
    return this;
  }

   /**
   * 创建数量，（mode&#x3D;Auto时需指定）单次分包取值范围1~100
   * minimum: 1
   * maximum: 100
   * @return channelCount
  **/
  @javax.annotation.Nullable
  public Long getChannelCount() {
    return channelCount;
  }


  public void setChannelCount(Long channelCount) {
    this.channelCount = channelCount;
  }


  public ToolsAppManagementExtendPackageCreateV2V2Request channelList(List<ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner> channelList) {
    
    this.channelList = channelList;
    return this;
  }

  public ToolsAppManagementExtendPackageCreateV2V2Request addChannelListItem(ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner channelListItem) {
    if (this.channelList == null) {
      this.channelList = new ArrayList<>();
    }
    this.channelList.add(channelListItem);
    return this;
  }

   /**
   * 自定义渠道号信息，（mode&#x3D;Manual时需指定），一次调用，list的size取值范围1~100
   * @return channelList
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner> getChannelList() {
    return channelList;
  }


  public void setChannelList(List<ToolsAppManagementExtendPackageCreateV2V2RequestChannelListInner> channelList) {
    this.channelList = channelList;
  }


  public ToolsAppManagementExtendPackageCreateV2V2Request mode(ToolsAppManagementExtendPackageCreateV2V2Mode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementExtendPackageCreateV2V2Mode getMode() {
    return mode;
  }


  public void setMode(ToolsAppManagementExtendPackageCreateV2V2Mode mode) {
    this.mode = mode;
  }


  public ToolsAppManagementExtendPackageCreateV2V2Request packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 应用包ID，从“查询应用信息”接口中获取
   * @return packageId
  **/
  @javax.annotation.Nonnull
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageCreateV2V2Request toolsAppManagementExtendPackageCreateV2V2Request = (ToolsAppManagementExtendPackageCreateV2V2Request) o;
    return Objects.equals(this.accountId, toolsAppManagementExtendPackageCreateV2V2Request.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementExtendPackageCreateV2V2Request.accountType) &&
        Objects.equals(this.channelCount, toolsAppManagementExtendPackageCreateV2V2Request.channelCount) &&
        Objects.equals(this.channelList, toolsAppManagementExtendPackageCreateV2V2Request.channelList) &&
        Objects.equals(this.mode, toolsAppManagementExtendPackageCreateV2V2Request.mode) &&
        Objects.equals(this.packageId, toolsAppManagementExtendPackageCreateV2V2Request.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, channelCount, channelList, mode, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageCreateV2V2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    channelCount: ").append(toIndentedString(channelCount)).append("\n");
    sb.append("    channelList: ").append(toIndentedString(channelList)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
    openapiFields.add("channel_count");
    openapiFields.add("channel_list");
    openapiFields.add("mode");
    openapiFields.add("package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("package_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageCreateV2V2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageCreateV2V2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageCreateV2V2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageCreateV2V2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageCreateV2V2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageCreateV2V2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageCreateV2V2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageCreateV2V2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageCreateV2V2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageCreateV2V2Request
  */
  public static ToolsAppManagementExtendPackageCreateV2V2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageCreateV2V2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageCreateV2V2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

