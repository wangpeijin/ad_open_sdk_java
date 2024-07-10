/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsDownloadPackageGetV2DataPackageStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class ToolsDownloadPackageGetV2ResponseData {
  public static final String SERIALIZED_NAME_PACKAGE_STATUS = "package_status";
  @SerializedName(SERIALIZED_NAME_PACKAGE_STATUS)
  private ToolsDownloadPackageGetV2DataPackageStatus packageStatus = null;

  public ToolsDownloadPackageGetV2ResponseData() {
  }

  public ToolsDownloadPackageGetV2ResponseData packageStatus(ToolsDownloadPackageGetV2DataPackageStatus packageStatus) {
    
    this.packageStatus = packageStatus;
    return this;
  }

   /**
   * Get packageStatus
   * @return packageStatus
  **/
  @javax.annotation.Nullable
  public ToolsDownloadPackageGetV2DataPackageStatus getPackageStatus() {
    return packageStatus;
  }


  public void setPackageStatus(ToolsDownloadPackageGetV2DataPackageStatus packageStatus) {
    this.packageStatus = packageStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDownloadPackageGetV2ResponseData toolsDownloadPackageGetV2ResponseData = (ToolsDownloadPackageGetV2ResponseData) o;
    return Objects.equals(this.packageStatus, toolsDownloadPackageGetV2ResponseData.packageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsDownloadPackageGetV2ResponseData {\n");
    sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
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
    openapiFields.add("package_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDownloadPackageGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDownloadPackageGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDownloadPackageGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDownloadPackageGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDownloadPackageGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsDownloadPackageGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDownloadPackageGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDownloadPackageGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDownloadPackageGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsDownloadPackageGetV2ResponseData
  */
  public static ToolsDownloadPackageGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDownloadPackageGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsDownloadPackageGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

