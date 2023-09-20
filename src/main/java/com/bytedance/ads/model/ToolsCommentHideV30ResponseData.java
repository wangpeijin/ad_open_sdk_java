/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolsCommentHideV30ResponseData {
  public static final String SERIALIZED_NAME_SUCCESS_COMMENT_IDS = "success_comment_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COMMENT_IDS)
  private List<Long> successCommentIds = null;

  public ToolsCommentHideV30ResponseData() {
  }

  public ToolsCommentHideV30ResponseData successCommentIds(List<Long> successCommentIds) {
    
    this.successCommentIds = successCommentIds;
    return this;
  }

  public ToolsCommentHideV30ResponseData addSuccessCommentIdsItem(Long successCommentIdsItem) {
    if (this.successCommentIds == null) {
      this.successCommentIds = new ArrayList<>();
    }
    this.successCommentIds.add(successCommentIdsItem);
    return this;
  }

   /**
   * 隐藏成功的评论id列表
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
    ToolsCommentHideV30ResponseData toolsCommentHideV30ResponseData = (ToolsCommentHideV30ResponseData) o;
    return Objects.equals(this.successCommentIds, toolsCommentHideV30ResponseData.successCommentIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCommentIds);
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
    sb.append("class ToolsCommentHideV30ResponseData {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentHideV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentHideV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentHideV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentHideV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentHideV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentHideV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentHideV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentHideV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentHideV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentHideV30ResponseData
  */
  public static ToolsCommentHideV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentHideV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentHideV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

