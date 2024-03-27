/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner;
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
 * StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private Long auditStatus = null;

  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_DETAIL_AUDIT_INFO = "detail_audit_info";
  @SerializedName(SERIALIZED_NAME_DETAIL_AUDIT_INFO)
  private List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner> detailAuditInfo = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ONLINE_STATUS = "online_status";
  @SerializedName(SERIALIZED_NAME_ONLINE_STATUS)
  private Long onlineStatus = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId = null;

  public static final String SERIALIZED_NAME_RESOURCE_URL = "resource_url";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URL)
  private String resourceUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner() {
  }

  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner auditStatus(Long auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 审核状态（同ScriptInfo中同名字段）
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public Long getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(Long auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * 视频封面图
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner detailAuditInfo(List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner> detailAuditInfo) {
    
    this.detailAuditInfo = detailAuditInfo;
    return this;
  }

  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner addDetailAuditInfoItem(StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner detailAuditInfoItem) {
    if (this.detailAuditInfo == null) {
      this.detailAuditInfo = new ArrayList<>();
    }
    this.detailAuditInfo.add(detailAuditInfoItem);
    return this;
  }

   /**
   * 审核详细信息
   * @return detailAuditInfo
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner> getDetailAuditInfo() {
    return detailAuditInfo;
  }


  public void setDetailAuditInfo(List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInnerDetailAuditInfoInner> detailAuditInfo) {
    this.detailAuditInfo = detailAuditInfo;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 视频时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner onlineStatus(Long onlineStatus) {
    
    this.onlineStatus = onlineStatus;
    return this;
  }

   /**
   * 在线（公开）状态。1: 公开，2: 非公开
   * @return onlineStatus
  **/
  @javax.annotation.Nullable
  public Long getOnlineStatus() {
    return onlineStatus;
  }


  public void setOnlineStatus(Long onlineStatus) {
    this.onlineStatus = onlineStatus;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 资源ID
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner resourceUrl(String resourceUrl) {
    
    this.resourceUrl = resourceUrl;
    return this;
  }

   /**
   * 视频播放地址
   * @return resourceUrl
  **/
  @javax.annotation.Nullable
  public String getResourceUrl() {
    return resourceUrl;
  }


  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 资源状态（同ScriptInfo中同名字段）
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner = (StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner) o;
    return Objects.equals(this.auditStatus, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.auditStatus) &&
        Objects.equals(this.coverUrl, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.coverUrl) &&
        Objects.equals(this.createTime, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.createTime) &&
        Objects.equals(this.detailAuditInfo, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.detailAuditInfo) &&
        Objects.equals(this.duration, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.duration) &&
        Objects.equals(this.itemId, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.itemId) &&
        Objects.equals(this.onlineStatus, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.onlineStatus) &&
        Objects.equals(this.resourceId, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.resourceId) &&
        Objects.equals(this.resourceUrl, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.resourceUrl) &&
        Objects.equals(this.status, starOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, coverUrl, createTime, detailAuditInfo, duration, itemId, onlineStatus, resourceId, resourceUrl, status);
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
    sb.append("class StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    detailAuditInfo: ").append(toIndentedString(detailAuditInfo)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("cover_url");
    openapiFields.add("create_time");
    openapiFields.add("detail_audit_info");
    openapiFields.add("duration");
    openapiFields.add("item_id");
    openapiFields.add("online_status");
    openapiFields.add("resource_id");
    openapiFields.add("resource_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner
  */
  public static StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
