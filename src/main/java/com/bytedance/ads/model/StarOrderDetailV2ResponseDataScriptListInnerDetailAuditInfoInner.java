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
 * StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner {
  public static final String SERIALIZED_NAME_AUDIT_BAN_REASON = "audit_ban_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_BAN_REASON)
  private String auditBanReason = null;

  public static final String SERIALIZED_NAME_AUDIT_SOURCE = "audit_source";
  @SerializedName(SERIALIZED_NAME_AUDIT_SOURCE)
  private Long auditSource = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private Long auditStatus = null;

  public static final String SERIALIZED_NAME_AUDIT_TIME = "audit_time";
  @SerializedName(SERIALIZED_NAME_AUDIT_TIME)
  private Long auditTime = null;

  public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner() {
  }

  public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner auditBanReason(String auditBanReason) {
    
    this.auditBanReason = auditBanReason;
    return this;
  }

   /**
   * 审核拒绝原因
   * @return auditBanReason
  **/
  @javax.annotation.Nullable
  public String getAuditBanReason() {
    return auditBanReason;
  }


  public void setAuditBanReason(String auditBanReason) {
    this.auditBanReason = auditBanReason;
  }


  public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner auditSource(Long auditSource) {
    
    this.auditSource = auditSource;
    return this;
  }

   /**
   * 审核渠道 1 &#x3D; 抖音内容审核 7 &#x3D; 广告素材审核
   * @return auditSource
  **/
  @javax.annotation.Nullable
  public Long getAuditSource() {
    return auditSource;
  }


  public void setAuditSource(Long auditSource) {
    this.auditSource = auditSource;
  }


  public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner auditStatus(Long auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 审核状态 0 &#x3D; 审核不通过 99 &#x3D; 审核中 1 &#x3D; 审核通过 3 &#x3D; 作者删除 4 &#x3D; 跳过审核
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public Long getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(Long auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner auditTime(Long auditTime) {
    
    this.auditTime = auditTime;
    return this;
  }

   /**
   * 审核时间  unix timestamp
   * @return auditTime
  **/
  @javax.annotation.Nullable
  public Long getAuditTime() {
    return auditTime;
  }


  public void setAuditTime(Long auditTime) {
    this.auditTime = auditTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner starOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner = (StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner) o;
    return Objects.equals(this.auditBanReason, starOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.auditBanReason) &&
        Objects.equals(this.auditSource, starOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.auditSource) &&
        Objects.equals(this.auditStatus, starOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.auditStatus) &&
        Objects.equals(this.auditTime, starOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.auditTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditBanReason, auditSource, auditStatus, auditTime);
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
    sb.append("class StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner {\n");
    sb.append("    auditBanReason: ").append(toIndentedString(auditBanReason)).append("\n");
    sb.append("    auditSource: ").append(toIndentedString(auditSource)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
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
    openapiFields.add("audit_ban_reason");
    openapiFields.add("audit_source");
    openapiFields.add("audit_status");
    openapiFields.add("audit_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner>() {
           @Override
           public void write(JsonWriter out, StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner
  */
  public static StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner.class);
  }

 /**
  * Convert an instance of StarOrderDetailV2ResponseDataScriptListInnerDetailAuditInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

