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
import com.bytedance.ads.model.ClueWechatInstanceDetailV2DataWechatListHasQrCode;
import com.bytedance.ads.model.ClueWechatInstanceDetailV2DataWechatListWechatType;
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
 * ClueWechatInstanceDetailV2ResponseDataWechatListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ClueWechatInstanceDetailV2ResponseDataWechatListInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_CLUE_COUNT = "clue_count";
  @SerializedName(SERIALIZED_NAME_CLUE_COUNT)
  private Long clueCount = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_HAS_QR_CODE = "has_qr_code";
  @SerializedName(SERIALIZED_NAME_HAS_QR_CODE)
  private ClueWechatInstanceDetailV2DataWechatListHasQrCode hasQrCode = null;

  public static final String SERIALIZED_NAME_INSTANCE_CLUE_COUNT = "instance_clue_count";
  @SerializedName(SERIALIZED_NAME_INSTANCE_CLUE_COUNT)
  private Long instanceClueCount = null;

  public static final String SERIALIZED_NAME_MOD_TIME = "mod_time";
  @SerializedName(SERIALIZED_NAME_MOD_TIME)
  private String modTime = null;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix = null;

  public static final String SERIALIZED_NAME_WECHAT_TYPE = "wechat_type";
  @SerializedName(SERIALIZED_NAME_WECHAT_TYPE)
  private ClueWechatInstanceDetailV2DataWechatListWechatType wechatType = null;

  public ClueWechatInstanceDetailV2ResponseDataWechatListInner() {
  }

  public ClueWechatInstanceDetailV2ResponseDataWechatListInner appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 公众号的开发者ID 
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner clueCount(Long clueCount) {
    
    this.clueCount = clueCount;
    return this;
  }

   /**
   * 总复制次数 
   * @return clueCount
  **/
  @javax.annotation.Nullable
  public Long getClueCount() {
    return clueCount;
  }


  public void setClueCount(Long clueCount) {
    this.clueCount = clueCount;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner createTime(String createTime) {
    
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


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner hasQrCode(ClueWechatInstanceDetailV2DataWechatListHasQrCode hasQrCode) {
    
    this.hasQrCode = hasQrCode;
    return this;
  }

   /**
   * Get hasQrCode
   * @return hasQrCode
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceDetailV2DataWechatListHasQrCode getHasQrCode() {
    return hasQrCode;
  }


  public void setHasQrCode(ClueWechatInstanceDetailV2DataWechatListHasQrCode hasQrCode) {
    this.hasQrCode = hasQrCode;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner instanceClueCount(Long instanceClueCount) {
    
    this.instanceClueCount = instanceClueCount;
    return this;
  }

   /**
   * 微信号在当前号码包复制次数
   * @return instanceClueCount
  **/
  @javax.annotation.Nullable
  public Long getInstanceClueCount() {
    return instanceClueCount;
  }


  public void setInstanceClueCount(Long instanceClueCount) {
    this.instanceClueCount = instanceClueCount;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner modTime(String modTime) {
    
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


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 微信昵称 
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 启用状态，0使用中、1暂停使用 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * 微信号尾缀
   * @return suffix
  **/
  @javax.annotation.Nullable
  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public ClueWechatInstanceDetailV2ResponseDataWechatListInner wechatType(ClueWechatInstanceDetailV2DataWechatListWechatType wechatType) {
    
    this.wechatType = wechatType;
    return this;
  }

   /**
   * Get wechatType
   * @return wechatType
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceDetailV2DataWechatListWechatType getWechatType() {
    return wechatType;
  }


  public void setWechatType(ClueWechatInstanceDetailV2DataWechatListWechatType wechatType) {
    this.wechatType = wechatType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatInstanceDetailV2ResponseDataWechatListInner clueWechatInstanceDetailV2ResponseDataWechatListInner = (ClueWechatInstanceDetailV2ResponseDataWechatListInner) o;
    return Objects.equals(this.appId, clueWechatInstanceDetailV2ResponseDataWechatListInner.appId) &&
        Objects.equals(this.clueCount, clueWechatInstanceDetailV2ResponseDataWechatListInner.clueCount) &&
        Objects.equals(this.createTime, clueWechatInstanceDetailV2ResponseDataWechatListInner.createTime) &&
        Objects.equals(this.hasQrCode, clueWechatInstanceDetailV2ResponseDataWechatListInner.hasQrCode) &&
        Objects.equals(this.instanceClueCount, clueWechatInstanceDetailV2ResponseDataWechatListInner.instanceClueCount) &&
        Objects.equals(this.modTime, clueWechatInstanceDetailV2ResponseDataWechatListInner.modTime) &&
        Objects.equals(this.nickName, clueWechatInstanceDetailV2ResponseDataWechatListInner.nickName) &&
        Objects.equals(this.status, clueWechatInstanceDetailV2ResponseDataWechatListInner.status) &&
        Objects.equals(this.suffix, clueWechatInstanceDetailV2ResponseDataWechatListInner.suffix) &&
        Objects.equals(this.wechatType, clueWechatInstanceDetailV2ResponseDataWechatListInner.wechatType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, clueCount, createTime, hasQrCode, instanceClueCount, modTime, nickName, status, suffix, wechatType);
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
    sb.append("class ClueWechatInstanceDetailV2ResponseDataWechatListInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clueCount: ").append(toIndentedString(clueCount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    hasQrCode: ").append(toIndentedString(hasQrCode)).append("\n");
    sb.append("    instanceClueCount: ").append(toIndentedString(instanceClueCount)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    wechatType: ").append(toIndentedString(wechatType)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("clue_count");
    openapiFields.add("create_time");
    openapiFields.add("has_qr_code");
    openapiFields.add("instance_clue_count");
    openapiFields.add("mod_time");
    openapiFields.add("nick_name");
    openapiFields.add("status");
    openapiFields.add("suffix");
    openapiFields.add("wechat_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatInstanceDetailV2ResponseDataWechatListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceDetailV2ResponseDataWechatListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceDetailV2ResponseDataWechatListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceDetailV2ResponseDataWechatListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceDetailV2ResponseDataWechatListInner>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceDetailV2ResponseDataWechatListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceDetailV2ResponseDataWechatListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceDetailV2ResponseDataWechatListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceDetailV2ResponseDataWechatListInner
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceDetailV2ResponseDataWechatListInner
  */
  public static ClueWechatInstanceDetailV2ResponseDataWechatListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceDetailV2ResponseDataWechatListInner.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceDetailV2ResponseDataWechatListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

