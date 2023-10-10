/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
 * ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner() {
  }

  public ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner toolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner = (ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner) o;
    return Objects.equals(this.message, toolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner>() {
           @Override
           public void write(JsonWriter out, ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner
  */
  public static ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner.class);
  }

 /**
  * Convert an instance of ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

