/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsEstimateAudienceV2ResponseDataVideoApp {
  public static final String SERIALIZED_NAME_NUM = "num";
  @SerializedName(SERIALIZED_NAME_NUM)
  private Long num = null;

  public ToolsEstimateAudienceV2ResponseDataVideoApp() {
  }

  public ToolsEstimateAudienceV2ResponseDataVideoApp num(Long num) {
    
    this.num = num;
    return this;
  }

   /**
   * 
   * @return num
  **/
  @javax.annotation.Nullable
  public Long getNum() {
    return num;
  }


  public void setNum(Long num) {
    this.num = num;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEstimateAudienceV2ResponseDataVideoApp toolsEstimateAudienceV2ResponseDataVideoApp = (ToolsEstimateAudienceV2ResponseDataVideoApp) o;
    return Objects.equals(this.num, toolsEstimateAudienceV2ResponseDataVideoApp.num);
  }

  @Override
  public int hashCode() {
    return Objects.hash(num);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEstimateAudienceV2ResponseDataVideoApp {\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
    openapiFields.add("num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEstimateAudienceV2ResponseDataVideoApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEstimateAudienceV2ResponseDataVideoApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEstimateAudienceV2ResponseDataVideoApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEstimateAudienceV2ResponseDataVideoApp.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEstimateAudienceV2ResponseDataVideoApp>() {
           @Override
           public void write(JsonWriter out, ToolsEstimateAudienceV2ResponseDataVideoApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEstimateAudienceV2ResponseDataVideoApp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEstimateAudienceV2ResponseDataVideoApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEstimateAudienceV2ResponseDataVideoApp
  * @throws IOException if the JSON string is invalid with respect to ToolsEstimateAudienceV2ResponseDataVideoApp
  */
  public static ToolsEstimateAudienceV2ResponseDataVideoApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEstimateAudienceV2ResponseDataVideoApp.class);
  }

 /**
  * Convert an instance of ToolsEstimateAudienceV2ResponseDataVideoApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

