/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner {
  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public static final String SERIALIZED_NAME_ANCHOR_STATUS = "anchor_status";
  @SerializedName(SERIALIZED_NAME_ANCHOR_STATUS)
  private Long anchorStatus = null;

  public static final String SERIALIZED_NAME_ANCHOR_TITLE = "anchor_title";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TITLE)
  private String anchorTitle = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private Long anchorType = null;

  public static final String SERIALIZED_NAME_AUDIT_REJECT_REASON = "audit_reject_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_REJECT_REASON)
  private String auditRejectReason = null;

  public static final String SERIALIZED_NAME_INDUSTRY_ANCHOR_ID = "industry_anchor_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ANCHOR_ID)
  private Long industryAnchorId = null;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl = null;

  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner() {
  }

  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 组件名称
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner anchorStatus(Long anchorStatus) {
    
    this.anchorStatus = anchorStatus;
    return this;
  }

   /**
   * 组件状态
   * @return anchorStatus
  **/
  @javax.annotation.Nullable
  public Long getAnchorStatus() {
    return anchorStatus;
  }


  public void setAnchorStatus(Long anchorStatus) {
    this.anchorStatus = anchorStatus;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner anchorTitle(String anchorTitle) {
    
    this.anchorTitle = anchorTitle;
    return this;
  }

   /**
   * 主标题
   * @return anchorTitle
  **/
  @javax.annotation.Nullable
  public String getAnchorTitle() {
    return anchorTitle;
  }


  public void setAnchorTitle(String anchorTitle) {
    this.anchorTitle = anchorTitle;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner anchorType(Long anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * 行业锚点类型
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public Long getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(Long anchorType) {
    this.anchorType = anchorType;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner auditRejectReason(String auditRejectReason) {
    
    this.auditRejectReason = auditRejectReason;
    return this;
  }

   /**
   * 审核驳回原因（如果组件被审核驳回）
   * @return auditRejectReason
  **/
  @javax.annotation.Nullable
  public String getAuditRejectReason() {
    return auditRejectReason;
  }


  public void setAuditRejectReason(String auditRejectReason) {
    this.auditRejectReason = auditRejectReason;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner industryAnchorId(Long industryAnchorId) {
    
    this.industryAnchorId = industryAnchorId;
    return this;
  }

   /**
   * 行业组件id
   * @return industryAnchorId
  **/
  @javax.annotation.Nullable
  public Long getIndustryAnchorId() {
    return industryAnchorId;
  }


  public void setIndustryAnchorId(Long industryAnchorId) {
    this.industryAnchorId = industryAnchorId;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * 六分屏预览链接
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner starComponentQueryIndustryAnchorV2ResponseDataComponentsInner = (StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner) o;
    return Objects.equals(this.anchorName, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.anchorName) &&
        Objects.equals(this.anchorStatus, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.anchorStatus) &&
        Objects.equals(this.anchorTitle, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.anchorTitle) &&
        Objects.equals(this.anchorType, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.anchorType) &&
        Objects.equals(this.auditRejectReason, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.auditRejectReason) &&
        Objects.equals(this.industryAnchorId, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.industryAnchorId) &&
        Objects.equals(this.previewUrl, starComponentQueryIndustryAnchorV2ResponseDataComponentsInner.previewUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorName, anchorStatus, anchorTitle, anchorType, auditRejectReason, industryAnchorId, previewUrl);
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
    sb.append("class StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner {\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
    sb.append("    anchorStatus: ").append(toIndentedString(anchorStatus)).append("\n");
    sb.append("    anchorTitle: ").append(toIndentedString(anchorTitle)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    auditRejectReason: ").append(toIndentedString(auditRejectReason)).append("\n");
    sb.append("    industryAnchorId: ").append(toIndentedString(industryAnchorId)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
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
    openapiFields.add("anchor_name");
    openapiFields.add("anchor_status");
    openapiFields.add("anchor_title");
    openapiFields.add("anchor_type");
    openapiFields.add("audit_reject_reason");
    openapiFields.add("industry_anchor_id");
    openapiFields.add("preview_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner>() {
           @Override
           public void write(JsonWriter out, StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner
  * @throws IOException if the JSON string is invalid with respect to StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner
  */
  public static StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner.class);
  }

 /**
  * Convert an instance of StarComponentQueryIndustryAnchorV2ResponseDataComponentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

