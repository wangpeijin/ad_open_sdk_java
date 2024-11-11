/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * phoneEvent事件行为描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent {
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 智能电话ID，当phone_event不为空时，有值。用户可以通过[【获取智能电话列表】](https://open.oceanengine.com/doc/index.html?key&#x3D;ad&amp;type&#x3D;api&amp;id&#x3D;1696710644556812 )接口或[【青鸟线索通平台】]（https://clue.oceanengine.com/）获取智能电话ID 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent) o;
    return Objects.equals(this.instanceId, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
    openapiFields.add("instance_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instance_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

