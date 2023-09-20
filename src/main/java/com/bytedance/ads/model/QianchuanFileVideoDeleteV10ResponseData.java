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
public class QianchuanFileVideoDeleteV10ResponseData {
  public static final String SERIALIZED_NAME_FAIL_VIDEO_IDS = "fail_video_ids";
  @SerializedName(SERIALIZED_NAME_FAIL_VIDEO_IDS)
  private List<String> failVideoIds = null;

  public QianchuanFileVideoDeleteV10ResponseData() {
  }

  public QianchuanFileVideoDeleteV10ResponseData failVideoIds(List<String> failVideoIds) {
    
    this.failVideoIds = failVideoIds;
    return this;
  }

  public QianchuanFileVideoDeleteV10ResponseData addFailVideoIdsItem(String failVideoIdsItem) {
    if (this.failVideoIds == null) {
      this.failVideoIds = new ArrayList<>();
    }
    this.failVideoIds.add(failVideoIdsItem);
    return this;
  }

   /**
   * 操作失败的video_id列表，不在此列表内的素材表示删除成功
   * @return failVideoIds
  **/
  @javax.annotation.Nullable
  public List<String> getFailVideoIds() {
    return failVideoIds;
  }


  public void setFailVideoIds(List<String> failVideoIds) {
    this.failVideoIds = failVideoIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanFileVideoDeleteV10ResponseData qianchuanFileVideoDeleteV10ResponseData = (QianchuanFileVideoDeleteV10ResponseData) o;
    return Objects.equals(this.failVideoIds, qianchuanFileVideoDeleteV10ResponseData.failVideoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failVideoIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanFileVideoDeleteV10ResponseData {\n");
    sb.append("    failVideoIds: ").append(toIndentedString(failVideoIds)).append("\n");
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
    openapiFields.add("fail_video_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fail_video_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFileVideoDeleteV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFileVideoDeleteV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFileVideoDeleteV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFileVideoDeleteV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFileVideoDeleteV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanFileVideoDeleteV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFileVideoDeleteV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFileVideoDeleteV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFileVideoDeleteV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanFileVideoDeleteV10ResponseData
  */
  public static QianchuanFileVideoDeleteV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFileVideoDeleteV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanFileVideoDeleteV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

