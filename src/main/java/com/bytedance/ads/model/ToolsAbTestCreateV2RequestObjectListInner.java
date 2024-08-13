/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
 * ToolsAbTestCreateV2RequestObjectListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsAbTestCreateV2RequestObjectListInner {
  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId = null;

  public ToolsAbTestCreateV2RequestObjectListInner() {
  }

  public ToolsAbTestCreateV2RequestObjectListInner objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * 实验对象ID，当test_type为CAMPAIGN时，传入广告组ID，当test_type为AD时，传入广告计划ID。
   * @return objectId
  **/
  @javax.annotation.Nonnull
  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestCreateV2RequestObjectListInner toolsAbTestCreateV2RequestObjectListInner = (ToolsAbTestCreateV2RequestObjectListInner) o;
    return Objects.equals(this.objectId, toolsAbTestCreateV2RequestObjectListInner.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAbTestCreateV2RequestObjectListInner {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
    openapiFields.add("object_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestCreateV2RequestObjectListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestCreateV2RequestObjectListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestCreateV2RequestObjectListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestCreateV2RequestObjectListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestCreateV2RequestObjectListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestCreateV2RequestObjectListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestCreateV2RequestObjectListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestCreateV2RequestObjectListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestCreateV2RequestObjectListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestCreateV2RequestObjectListInner
  */
  public static ToolsAbTestCreateV2RequestObjectListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestCreateV2RequestObjectListInner.class);
  }

 /**
  * Convert an instance of ToolsAbTestCreateV2RequestObjectListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

