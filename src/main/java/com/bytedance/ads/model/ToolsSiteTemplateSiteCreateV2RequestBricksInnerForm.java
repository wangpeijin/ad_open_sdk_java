/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * 表单组件描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm {
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 活动ID，当&#x60;coupon&#x60;不为空时，必填。用户可以通过[【获取卡券列表】]（https://open.oceanengine.com/doc/index.html?key&#x3D;ad&amp;type&#x3D;api&amp;id&#x3D;1696710639364108#item-link-%E6%A6%82%E5%BF%B5%E4%BB%8B%E7%BB%8D）接口或[【青鸟线索通平台】]（https://clue.oceanengine.com/）获取活动ID 
   * @return instanceId
  **/
  @javax.annotation.Nonnull
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
    ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm toolsSiteTemplateSiteCreateV2RequestBricksInnerForm = (ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm) o;
    return Objects.equals(this.instanceId, toolsSiteTemplateSiteCreateV2RequestBricksInnerForm.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm {\n");
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
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

