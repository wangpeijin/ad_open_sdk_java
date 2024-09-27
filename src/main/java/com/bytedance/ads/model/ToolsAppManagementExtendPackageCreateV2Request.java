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
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2Mode;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageCreateV2RequestChannelListInner;
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
 * ToolsAppManagementExtendPackageCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CHANNEL_COUNT = "channel_count";
  @SerializedName(SERIALIZED_NAME_CHANNEL_COUNT)
  private Long channelCount = null;

  public static final String SERIALIZED_NAME_CHANNEL_LIST = "channel_list";
  @SerializedName(SERIALIZED_NAME_CHANNEL_LIST)
  private List<ToolsAppManagementExtendPackageCreateV2RequestChannelListInner> channelList = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ToolsAppManagementExtendPackageCreateV2Mode mode = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public ToolsAppManagementExtendPackageCreateV2Request() {
  }

  public ToolsAppManagementExtendPackageCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAppManagementExtendPackageCreateV2Request channelCount(Long channelCount) {
    
    this.channelCount = channelCount;
    return this;
  }

   /**
   * 
   * @return channelCount
  **/
  @javax.annotation.Nullable
  public Long getChannelCount() {
    return channelCount;
  }


  public void setChannelCount(Long channelCount) {
    this.channelCount = channelCount;
  }


  public ToolsAppManagementExtendPackageCreateV2Request channelList(List<ToolsAppManagementExtendPackageCreateV2RequestChannelListInner> channelList) {
    
    this.channelList = channelList;
    return this;
  }

  public ToolsAppManagementExtendPackageCreateV2Request addChannelListItem(ToolsAppManagementExtendPackageCreateV2RequestChannelListInner channelListItem) {
    if (this.channelList == null) {
      this.channelList = new ArrayList<>();
    }
    this.channelList.add(channelListItem);
    return this;
  }

   /**
   * 
   * @return channelList
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementExtendPackageCreateV2RequestChannelListInner> getChannelList() {
    return channelList;
  }


  public void setChannelList(List<ToolsAppManagementExtendPackageCreateV2RequestChannelListInner> channelList) {
    this.channelList = channelList;
  }


  public ToolsAppManagementExtendPackageCreateV2Request mode(ToolsAppManagementExtendPackageCreateV2Mode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementExtendPackageCreateV2Mode getMode() {
    return mode;
  }


  public void setMode(ToolsAppManagementExtendPackageCreateV2Mode mode) {
    this.mode = mode;
  }


  public ToolsAppManagementExtendPackageCreateV2Request packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
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
    ToolsAppManagementExtendPackageCreateV2Request toolsAppManagementExtendPackageCreateV2Request = (ToolsAppManagementExtendPackageCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsAppManagementExtendPackageCreateV2Request.advertiserId) &&
        Objects.equals(this.channelCount, toolsAppManagementExtendPackageCreateV2Request.channelCount) &&
        Objects.equals(this.channelList, toolsAppManagementExtendPackageCreateV2Request.channelList) &&
        Objects.equals(this.mode, toolsAppManagementExtendPackageCreateV2Request.mode) &&
        Objects.equals(this.packageId, toolsAppManagementExtendPackageCreateV2Request.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, channelCount, channelList, mode, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("channel_count");
    openapiFields.add("channel_list");
    openapiFields.add("mode");
    openapiFields.add("package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("package_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageCreateV2Request
  */
  public static ToolsAppManagementExtendPackageCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

