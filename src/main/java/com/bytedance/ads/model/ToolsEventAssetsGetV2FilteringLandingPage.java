/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * 三方落地页数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ToolsEventAssetsGetV2FilteringLandingPage {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public ToolsEventAssetsGetV2FilteringLandingPage() {
  }

  public ToolsEventAssetsGetV2FilteringLandingPage assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 三方的资产id
   * maximum: -9223372036854775616
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAssetsGetV2FilteringLandingPage assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 三方落地页名称
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2FilteringLandingPage toolsEventAssetsGetV2FilteringLandingPage = (ToolsEventAssetsGetV2FilteringLandingPage) o;
    return Objects.equals(this.assetId, toolsEventAssetsGetV2FilteringLandingPage.assetId) &&
        Objects.equals(this.assetName, toolsEventAssetsGetV2FilteringLandingPage.assetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEventAssetsGetV2FilteringLandingPage {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2FilteringLandingPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2FilteringLandingPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2FilteringLandingPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2FilteringLandingPage.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2FilteringLandingPage>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2FilteringLandingPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2FilteringLandingPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2FilteringLandingPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2FilteringLandingPage
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2FilteringLandingPage
  */
  public static ToolsEventAssetsGetV2FilteringLandingPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2FilteringLandingPage.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2FilteringLandingPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

