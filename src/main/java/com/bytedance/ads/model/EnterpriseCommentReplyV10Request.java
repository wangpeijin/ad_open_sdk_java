/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * EnterpriseCommentReplyV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class EnterpriseCommentReplyV10Request {
  public static final String SERIALIZED_NAME_CC_ACCOUNT_ID = "cc_account_id";
  @SerializedName(SERIALIZED_NAME_CC_ACCOUNT_ID)
  private Long ccAccountId = null;

  public static final String SERIALIZED_NAME_COMMENT_IDS = "comment_ids";
  @SerializedName(SERIALIZED_NAME_COMMENT_IDS)
  private List<Long> commentIds = null;

  public static final String SERIALIZED_NAME_E_DOUYIN_ID = "e_douyin_id";
  @SerializedName(SERIALIZED_NAME_E_DOUYIN_ID)
  private String eDouyinId = null;

  public static final String SERIALIZED_NAME_REPLY_TEXT = "reply_text";
  @SerializedName(SERIALIZED_NAME_REPLY_TEXT)
  private String replyText = null;

  public EnterpriseCommentReplyV10Request() {
  }

  public EnterpriseCommentReplyV10Request ccAccountId(Long ccAccountId) {
    
    this.ccAccountId = ccAccountId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return ccAccountId
  **/
  @javax.annotation.Nonnull
  public Long getCcAccountId() {
    return ccAccountId;
  }


  public void setCcAccountId(Long ccAccountId) {
    this.ccAccountId = ccAccountId;
  }


  public EnterpriseCommentReplyV10Request commentIds(List<Long> commentIds) {
    
    this.commentIds = commentIds;
    return this;
  }

  public EnterpriseCommentReplyV10Request addCommentIdsItem(Long commentIdsItem) {
    if (this.commentIds == null) {
      this.commentIds = new ArrayList<>();
    }
    this.commentIds.add(commentIdsItem);
    return this;
  }

   /**
   * 
   * @return commentIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getCommentIds() {
    return commentIds;
  }


  public void setCommentIds(List<Long> commentIds) {
    this.commentIds = commentIds;
  }


  public EnterpriseCommentReplyV10Request eDouyinId(String eDouyinId) {
    
    this.eDouyinId = eDouyinId;
    return this;
  }

   /**
   * 
   * @return eDouyinId
  **/
  @javax.annotation.Nonnull
  public String geteDouyinId() {
    return eDouyinId;
  }


  public void seteDouyinId(String eDouyinId) {
    this.eDouyinId = eDouyinId;
  }


  public EnterpriseCommentReplyV10Request replyText(String replyText) {
    
    this.replyText = replyText;
    return this;
  }

   /**
   * 
   * @return replyText
  **/
  @javax.annotation.Nonnull
  public String getReplyText() {
    return replyText;
  }


  public void setReplyText(String replyText) {
    this.replyText = replyText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentReplyV10Request enterpriseCommentReplyV10Request = (EnterpriseCommentReplyV10Request) o;
    return Objects.equals(this.ccAccountId, enterpriseCommentReplyV10Request.ccAccountId) &&
        Objects.equals(this.commentIds, enterpriseCommentReplyV10Request.commentIds) &&
        Objects.equals(this.eDouyinId, enterpriseCommentReplyV10Request.eDouyinId) &&
        Objects.equals(this.replyText, enterpriseCommentReplyV10Request.replyText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccAccountId, commentIds, eDouyinId, replyText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyV10Request {\n");
    sb.append("    ccAccountId: ").append(toIndentedString(ccAccountId)).append("\n");
    sb.append("    commentIds: ").append(toIndentedString(commentIds)).append("\n");
    sb.append("    eDouyinId: ").append(toIndentedString(eDouyinId)).append("\n");
    sb.append("    replyText: ").append(toIndentedString(replyText)).append("\n");
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
    openapiFields.add("cc_account_id");
    openapiFields.add("comment_ids");
    openapiFields.add("e_douyin_id");
    openapiFields.add("reply_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cc_account_id");
    openapiRequiredFields.add("comment_ids");
    openapiRequiredFields.add("e_douyin_id");
    openapiRequiredFields.add("reply_text");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyV10Request>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyV10Request
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyV10Request
  */
  public static EnterpriseCommentReplyV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyV10Request.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

