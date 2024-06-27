/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentGetV30FilteringCommentType;
import com.bytedance.ads.model.ToolsCommentGetV30FilteringEmotionType;
import com.bytedance.ads.model.ToolsCommentGetV30FilteringHideStatus;
import com.bytedance.ads.model.ToolsCommentGetV30FilteringLevelType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsCommentGetV30Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_COMMENT_TYPE = "comment_type";
  @SerializedName(SERIALIZED_NAME_COMMENT_TYPE)
  private ToolsCommentGetV30FilteringCommentType commentType = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_EMOTION_TYPE = "emotion_type";
  @SerializedName(SERIALIZED_NAME_EMOTION_TYPE)
  private ToolsCommentGetV30FilteringEmotionType emotionType = null;

  public static final String SERIALIZED_NAME_HIDE_STATUS = "hide_status";
  @SerializedName(SERIALIZED_NAME_HIDE_STATUS)
  private ToolsCommentGetV30FilteringHideStatus hideStatus = null;

  public static final String SERIALIZED_NAME_IS_REPLIED = "is_replied";
  @SerializedName(SERIALIZED_NAME_IS_REPLIED)
  private Long isReplied = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_LEVEL_TYPE = "level_type";
  @SerializedName(SERIALIZED_NAME_LEVEL_TYPE)
  private ToolsCommentGetV30FilteringLevelType levelType = null;

  public ToolsCommentGetV30Filtering() {
  }

  public ToolsCommentGetV30Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ToolsCommentGetV30Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 计划id列表，一次最多100个，仅当platform_version&#x3D;V1时传入生效
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public ToolsCommentGetV30Filtering authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public ToolsCommentGetV30Filtering addAuthorIdsItem(Long authorIdsItem) {
    if (this.authorIds == null) {
      this.authorIds = new ArrayList<>();
    }
    this.authorIds.add(authorIdsItem);
    return this;
  }

   /**
   * 视频作者抖音id，最多支持100个
   * @return authorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorIds() {
    return authorIds;
  }


  public void setAuthorIds(List<Long> authorIds) {
    this.authorIds = authorIds;
  }


  public ToolsCommentGetV30Filtering commentType(ToolsCommentGetV30FilteringCommentType commentType) {
    
    this.commentType = commentType;
    return this;
  }

   /**
   * Get commentType
   * @return commentType
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30FilteringCommentType getCommentType() {
    return commentType;
  }


  public void setCommentType(ToolsCommentGetV30FilteringCommentType commentType) {
    this.commentType = commentType;
  }


  public ToolsCommentGetV30Filtering content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 评论关键词，最长支持10个字符
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ToolsCommentGetV30Filtering emotionType(ToolsCommentGetV30FilteringEmotionType emotionType) {
    
    this.emotionType = emotionType;
    return this;
  }

   /**
   * Get emotionType
   * @return emotionType
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30FilteringEmotionType getEmotionType() {
    return emotionType;
  }


  public void setEmotionType(ToolsCommentGetV30FilteringEmotionType emotionType) {
    this.emotionType = emotionType;
  }


  public ToolsCommentGetV30Filtering hideStatus(ToolsCommentGetV30FilteringHideStatus hideStatus) {
    
    this.hideStatus = hideStatus;
    return this;
  }

   /**
   * Get hideStatus
   * @return hideStatus
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30FilteringHideStatus getHideStatus() {
    return hideStatus;
  }


  public void setHideStatus(ToolsCommentGetV30FilteringHideStatus hideStatus) {
    this.hideStatus = hideStatus;
  }


  public ToolsCommentGetV30Filtering isReplied(Long isReplied) {
    
    this.isReplied = isReplied;
    return this;
  }

   /**
   * 是否已回复
   * @return isReplied
  **/
  @javax.annotation.Nullable
  public Long getIsReplied() {
    return isReplied;
  }


  public void setIsReplied(Long isReplied) {
    this.isReplied = isReplied;
  }


  public ToolsCommentGetV30Filtering itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public ToolsCommentGetV30Filtering addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 广告视频id列表，一次最多100个，仅当platform_version&#x3D;V2时传入生效
   * @return itemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public ToolsCommentGetV30Filtering levelType(ToolsCommentGetV30FilteringLevelType levelType) {
    
    this.levelType = levelType;
    return this;
  }

   /**
   * Get levelType
   * @return levelType
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30FilteringLevelType getLevelType() {
    return levelType;
  }


  public void setLevelType(ToolsCommentGetV30FilteringLevelType levelType) {
    this.levelType = levelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentGetV30Filtering toolsCommentGetV30Filtering = (ToolsCommentGetV30Filtering) o;
    return Objects.equals(this.adIds, toolsCommentGetV30Filtering.adIds) &&
        Objects.equals(this.authorIds, toolsCommentGetV30Filtering.authorIds) &&
        Objects.equals(this.commentType, toolsCommentGetV30Filtering.commentType) &&
        Objects.equals(this.content, toolsCommentGetV30Filtering.content) &&
        Objects.equals(this.emotionType, toolsCommentGetV30Filtering.emotionType) &&
        Objects.equals(this.hideStatus, toolsCommentGetV30Filtering.hideStatus) &&
        Objects.equals(this.isReplied, toolsCommentGetV30Filtering.isReplied) &&
        Objects.equals(this.itemIds, toolsCommentGetV30Filtering.itemIds) &&
        Objects.equals(this.levelType, toolsCommentGetV30Filtering.levelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, authorIds, commentType, content, emotionType, hideStatus, isReplied, itemIds, levelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentGetV30Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    commentType: ").append(toIndentedString(commentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    emotionType: ").append(toIndentedString(emotionType)).append("\n");
    sb.append("    hideStatus: ").append(toIndentedString(hideStatus)).append("\n");
    sb.append("    isReplied: ").append(toIndentedString(isReplied)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("author_ids");
    openapiFields.add("comment_type");
    openapiFields.add("content");
    openapiFields.add("emotion_type");
    openapiFields.add("hide_status");
    openapiFields.add("is_replied");
    openapiFields.add("item_ids");
    openapiFields.add("level_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsCommentGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentGetV30Filtering
  */
  public static ToolsCommentGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentGetV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsCommentGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

