/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCreativeRejectReasonV10DataListAuditRecordsAuditPlatform;
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
 * QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner {
  public static final String SERIALIZED_NAME_AUDIT_PLATFORM = "audit_platform";
  @SerializedName(SERIALIZED_NAME_AUDIT_PLATFORM)
  private QianchuanCreativeRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private List<String> rejectReason = null;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private List<String> suggestion = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner() {
  }

  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner auditPlatform(QianchuanCreativeRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform) {
    
    this.auditPlatform = auditPlatform;
    return this;
  }

   /**
   * Get auditPlatform
   * @return auditPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeRejectReasonV10DataListAuditRecordsAuditPlatform getAuditPlatform() {
    return auditPlatform;
  }


  public void setAuditPlatform(QianchuanCreativeRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform) {
    this.auditPlatform = auditPlatform;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner rejectReason(List<String> rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner addRejectReasonItem(String rejectReasonItem) {
    if (this.rejectReason == null) {
      this.rejectReason = new ArrayList<>();
    }
    this.rejectReason.add(rejectReasonItem);
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public List<String> getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(List<String> rejectReason) {
    this.rejectReason = rejectReason;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner suggestion(List<String> suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner addSuggestionItem(String suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

   /**
   * 
   * @return suggestion
  **/
  @javax.annotation.Nullable
  public List<String> getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(List<String> suggestion) {
    this.suggestion = suggestion;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner = (QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner) o;
    return Objects.equals(this.auditPlatform, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.auditPlatform) &&
        Objects.equals(this.content, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.content) &&
        Objects.equals(this.desc, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.desc) &&
        Objects.equals(this.imageId, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.imageId) &&
        Objects.equals(this.rejectReason, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.rejectReason) &&
        Objects.equals(this.suggestion, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.suggestion) &&
        Objects.equals(this.videoId, qianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditPlatform, content, desc, imageId, rejectReason, suggestion, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner {\n");
    sb.append("    auditPlatform: ").append(toIndentedString(auditPlatform)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("audit_platform");
    openapiFields.add("content");
    openapiFields.add("desc");
    openapiFields.add("image_id");
    openapiFields.add("reject_reason");
    openapiFields.add("suggestion");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner
  */
  public static QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner.class);
  }

 /**
  * Convert an instance of QianchuanCreativeRejectReasonV10ResponseDataListInnerAuditRecordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

