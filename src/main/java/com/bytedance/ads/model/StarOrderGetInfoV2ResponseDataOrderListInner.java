/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo;
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
 * StarOrderGetInfoV2ResponseDataOrderListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private Long auditStatus = null;

  public static final String SERIALIZED_NAME_AUTHOR_CANCEL_REASON = "author_cancel_reason";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CANCEL_REASON)
  private String authorCancelReason = null;

  public static final String SERIALIZED_NAME_AUTHOR_CANCEL_STATUS = "author_cancel_status";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CANCEL_STATUS)
  private Long authorCancelStatus = null;

  public static final String SERIALIZED_NAME_AUTHOR_INFO = "author_info";
  @SerializedName(SERIALIZED_NAME_AUTHOR_INFO)
  private StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo authorInfo = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL = "component_click_monitor_url";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL)
  private String componentClickMonitorUrl = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
  @SerializedName(SERIALIZED_NAME_FINISH_TIME)
  private Long finishTime = null;

  public static final String SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL = "item_show_monitor_url";
  @SerializedName(SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL)
  private String itemShowMonitorUrl = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PAYMENT_INFO = "payment_info";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INFO)
  private StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo paymentInfo = null;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "release_time";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private Long releaseTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public StarOrderGetInfoV2ResponseDataOrderListInner() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInner auditStatus(Long auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 订单审核状态 未审核 &#x3D; 0 脚本审核失败 &#x3D; 1 脚本审核通过 &#x3D; 2 视频审核失败 &#x3D; 3 视频审核通过 &#x3D; 4 组件审核拒绝 &#x3D; 5 组件审核通过 &#x3D; 6 订单跳过审核 &#x3D; 7
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public Long getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(Long auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner authorCancelReason(String authorCancelReason) {
    
    this.authorCancelReason = authorCancelReason;
    return this;
  }

   /**
   * 达人取消原因
   * @return authorCancelReason
  **/
  @javax.annotation.Nullable
  public String getAuthorCancelReason() {
    return authorCancelReason;
  }


  public void setAuthorCancelReason(String authorCancelReason) {
    this.authorCancelReason = authorCancelReason;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner authorCancelStatus(Long authorCancelStatus) {
    
    this.authorCancelStatus = authorCancelStatus;
    return this;
  }

   /**
   * 达人取消状态 0 &#x3D; 未发起 1 &#x3D; 已发起
   * @return authorCancelStatus
  **/
  @javax.annotation.Nullable
  public Long getAuthorCancelStatus() {
    return authorCancelStatus;
  }


  public void setAuthorCancelStatus(Long authorCancelStatus) {
    this.authorCancelStatus = authorCancelStatus;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner authorInfo(StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo authorInfo) {
    
    this.authorInfo = authorInfo;
    return this;
  }

   /**
   * Get authorInfo
   * @return authorInfo
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo getAuthorInfo() {
    return authorInfo;
  }


  public void setAuthorInfo(StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo authorInfo) {
    this.authorInfo = authorInfo;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner componentClickMonitorUrl(String componentClickMonitorUrl) {
    
    this.componentClickMonitorUrl = componentClickMonitorUrl;
    return this;
  }

   /**
   * 组件点击检测链接
   * @return componentClickMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getComponentClickMonitorUrl() {
    return componentClickMonitorUrl;
  }


  public void setComponentClickMonitorUrl(String componentClickMonitorUrl) {
    this.componentClickMonitorUrl = componentClickMonitorUrl;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner finishTime(Long finishTime) {
    
    this.finishTime = finishTime;
    return this;
  }

   /**
   * 任务完结时间（如订单顺利完结即为验收时间）
   * @return finishTime
  **/
  @javax.annotation.Nullable
  public Long getFinishTime() {
    return finishTime;
  }


  public void setFinishTime(Long finishTime) {
    this.finishTime = finishTime;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner itemShowMonitorUrl(String itemShowMonitorUrl) {
    
    this.itemShowMonitorUrl = itemShowMonitorUrl;
    return this;
  }

   /**
   * 视频曝光检测链接
   * @return itemShowMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getItemShowMonitorUrl() {
    return itemShowMonitorUrl;
  }


  public void setItemShowMonitorUrl(String itemShowMonitorUrl) {
    this.itemShowMonitorUrl = itemShowMonitorUrl;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner paymentInfo(StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo paymentInfo) {
    
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Get paymentInfo
   * @return paymentInfo
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo getPaymentInfo() {
    return paymentInfo;
  }


  public void setPaymentInfo(StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner releaseTime(Long releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 视频发布时间
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public Long getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(Long releaseTime) {
    this.releaseTime = releaseTime;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 任务状态 待接收 &#x3D; -1 达人已接单 &#x3D; 1 已关闭 &#x3D; 2 已完成 &#x3D; 3 已取消 &#x3D; 4 待付尾款 &#x3D; 10 脚本已上传 &#x3D; 41 脚本已拒绝 &#x3D; 42 脚本已确认 &#x3D; 43 脚本已跳过 &#x3D; 44 视频已上传 &#x3D; 51 视频已拒绝 &#x3D; 52 视频已确认 &#x3D; 53 视频已发布 &#x3D; 54
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
    StarOrderGetInfoV2ResponseDataOrderListInner starOrderGetInfoV2ResponseDataOrderListInner = (StarOrderGetInfoV2ResponseDataOrderListInner) o;
    return Objects.equals(this.auditStatus, starOrderGetInfoV2ResponseDataOrderListInner.auditStatus) &&
        Objects.equals(this.authorCancelReason, starOrderGetInfoV2ResponseDataOrderListInner.authorCancelReason) &&
        Objects.equals(this.authorCancelStatus, starOrderGetInfoV2ResponseDataOrderListInner.authorCancelStatus) &&
        Objects.equals(this.authorInfo, starOrderGetInfoV2ResponseDataOrderListInner.authorInfo) &&
        Objects.equals(this.componentClickMonitorUrl, starOrderGetInfoV2ResponseDataOrderListInner.componentClickMonitorUrl) &&
        Objects.equals(this.createTime, starOrderGetInfoV2ResponseDataOrderListInner.createTime) &&
        Objects.equals(this.finishTime, starOrderGetInfoV2ResponseDataOrderListInner.finishTime) &&
        Objects.equals(this.itemShowMonitorUrl, starOrderGetInfoV2ResponseDataOrderListInner.itemShowMonitorUrl) &&
        Objects.equals(this.orderId, starOrderGetInfoV2ResponseDataOrderListInner.orderId) &&
        Objects.equals(this.paymentInfo, starOrderGetInfoV2ResponseDataOrderListInner.paymentInfo) &&
        Objects.equals(this.releaseTime, starOrderGetInfoV2ResponseDataOrderListInner.releaseTime) &&
        Objects.equals(this.status, starOrderGetInfoV2ResponseDataOrderListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, authorCancelReason, authorCancelStatus, authorInfo, componentClickMonitorUrl, createTime, finishTime, itemShowMonitorUrl, orderId, paymentInfo, releaseTime, status);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    authorCancelReason: ").append(toIndentedString(authorCancelReason)).append("\n");
    sb.append("    authorCancelStatus: ").append(toIndentedString(authorCancelStatus)).append("\n");
    sb.append("    authorInfo: ").append(toIndentedString(authorInfo)).append("\n");
    sb.append("    componentClickMonitorUrl: ").append(toIndentedString(componentClickMonitorUrl)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    itemShowMonitorUrl: ").append(toIndentedString(itemShowMonitorUrl)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
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
    openapiFields.add("author_cancel_reason");
    openapiFields.add("author_cancel_status");
    openapiFields.add("author_info");
    openapiFields.add("component_click_monitor_url");
    openapiFields.add("create_time");
    openapiFields.add("finish_time");
    openapiFields.add("item_show_monitor_url");
    openapiFields.add("order_id");
    openapiFields.add("payment_info");
    openapiFields.add("release_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInner
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

