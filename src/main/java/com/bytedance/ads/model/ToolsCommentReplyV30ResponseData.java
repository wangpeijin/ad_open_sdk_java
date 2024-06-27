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
public class ToolsCommentReplyV30ResponseData {
  public static final String SERIALIZED_NAME_SUCCESS_COMMENT_IDS = "success_comment_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COMMENT_IDS)
  private List<Long> successCommentIds = null;

  public ToolsCommentReplyV30ResponseData() {
  }

  public ToolsCommentReplyV30ResponseData successCommentIds(List<Long> successCommentIds) {
    
    this.successCommentIds = successCommentIds;
    return this;
  }

  public ToolsCommentReplyV30ResponseData addSuccessCommentIdsItem(Long successCommentIdsItem) {
    if (this.successCommentIds == null) {
      this.successCommentIds = new ArrayList<>();
    }
    this.successCommentIds.add(successCommentIdsItem);
    return this;
  }

   /**
   * 回复成功的评论id列表
   * @return successCommentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSuccessCommentIds() {
    return successCommentIds;
  }


  public void setSuccessCommentIds(List<Long> successCommentIds) {
    this.successCommentIds = successCommentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentReplyV30ResponseData toolsCommentReplyV30ResponseData = (ToolsCommentReplyV30ResponseData) o;
    return Objects.equals(this.successCommentIds, toolsCommentReplyV30ResponseData.successCommentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCommentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentReplyV30ResponseData {\n");
    sb.append("    successCommentIds: ").append(toIndentedString(successCommentIds)).append("\n");
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
    openapiFields.add("success_comment_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success_comment_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentReplyV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentReplyV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentReplyV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentReplyV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentReplyV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentReplyV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentReplyV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentReplyV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentReplyV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentReplyV30ResponseData
  */
  public static ToolsCommentReplyV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentReplyV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentReplyV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

