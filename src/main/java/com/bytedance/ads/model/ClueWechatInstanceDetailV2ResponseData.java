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
import com.bytedance.ads.model.ClueWechatInstanceDetailV2DataSubType;
import com.bytedance.ads.model.ClueWechatInstanceDetailV2DataSuffix;
import com.bytedance.ads.model.ClueWechatInstanceDetailV2ResponseDataWechatListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ClueWechatInstanceDetailV2ResponseData {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_MOD_TIME = "mod_time";
  @SerializedName(SERIALIZED_NAME_MOD_TIME)
  private String modTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_TYPE = "sub_type";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private ClueWechatInstanceDetailV2DataSubType subType = null;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private ClueWechatInstanceDetailV2DataSuffix suffix = null;

  public static final String SERIALIZED_NAME_WECHAT_LIST = "wechat_list";
  @SerializedName(SERIALIZED_NAME_WECHAT_LIST)
  private List<ClueWechatInstanceDetailV2ResponseDataWechatListInner> wechatList = null;

  public ClueWechatInstanceDetailV2ResponseData() {
  }

  public ClueWechatInstanceDetailV2ResponseData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间，格式：2022-07-21 15:36:09
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ClueWechatInstanceDetailV2ResponseData instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信号码包ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueWechatInstanceDetailV2ResponseData modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * 修改时间，格式：2022-07-21 15:36:09
   * @return modTime
  **/
  @javax.annotation.Nullable
  public String getModTime() {
    return modTime;
  }


  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  public ClueWechatInstanceDetailV2ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 微信号码包名称 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueWechatInstanceDetailV2ResponseData subType(ClueWechatInstanceDetailV2DataSubType subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceDetailV2DataSubType getSubType() {
    return subType;
  }


  public void setSubType(ClueWechatInstanceDetailV2DataSubType subType) {
    this.subType = subType;
  }


  public ClueWechatInstanceDetailV2ResponseData suffix(ClueWechatInstanceDetailV2DataSuffix suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceDetailV2DataSuffix getSuffix() {
    return suffix;
  }


  public void setSuffix(ClueWechatInstanceDetailV2DataSuffix suffix) {
    this.suffix = suffix;
  }


  public ClueWechatInstanceDetailV2ResponseData wechatList(List<ClueWechatInstanceDetailV2ResponseDataWechatListInner> wechatList) {
    
    this.wechatList = wechatList;
    return this;
  }

  public ClueWechatInstanceDetailV2ResponseData addWechatListItem(ClueWechatInstanceDetailV2ResponseDataWechatListInner wechatListItem) {
    if (this.wechatList == null) {
      this.wechatList = new ArrayList<>();
    }
    this.wechatList.add(wechatListItem);
    return this;
  }

   /**
   * 
   * @return wechatList
  **/
  @javax.annotation.Nullable
  public List<ClueWechatInstanceDetailV2ResponseDataWechatListInner> getWechatList() {
    return wechatList;
  }


  public void setWechatList(List<ClueWechatInstanceDetailV2ResponseDataWechatListInner> wechatList) {
    this.wechatList = wechatList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatInstanceDetailV2ResponseData clueWechatInstanceDetailV2ResponseData = (ClueWechatInstanceDetailV2ResponseData) o;
    return Objects.equals(this.createTime, clueWechatInstanceDetailV2ResponseData.createTime) &&
        Objects.equals(this.instanceId, clueWechatInstanceDetailV2ResponseData.instanceId) &&
        Objects.equals(this.modTime, clueWechatInstanceDetailV2ResponseData.modTime) &&
        Objects.equals(this.name, clueWechatInstanceDetailV2ResponseData.name) &&
        Objects.equals(this.subType, clueWechatInstanceDetailV2ResponseData.subType) &&
        Objects.equals(this.suffix, clueWechatInstanceDetailV2ResponseData.suffix) &&
        Objects.equals(this.wechatList, clueWechatInstanceDetailV2ResponseData.wechatList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, instanceId, modTime, name, subType, suffix, wechatList);
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
    sb.append("class ClueWechatInstanceDetailV2ResponseData {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    wechatList: ").append(toIndentedString(wechatList)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("mod_time");
    openapiFields.add("name");
    openapiFields.add("sub_type");
    openapiFields.add("suffix");
    openapiFields.add("wechat_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatInstanceDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceDetailV2ResponseData
  */
  public static ClueWechatInstanceDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

