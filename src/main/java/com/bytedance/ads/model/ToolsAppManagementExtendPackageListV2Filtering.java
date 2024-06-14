/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsAppManagementExtendPackageListV2Filtering {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppManagementExtendPackageListV2FilteringStatus status = null;

  public ToolsAppManagementExtendPackageListV2Filtering() {
  }

  public ToolsAppManagementExtendPackageListV2Filtering status(ToolsAppManagementExtendPackageListV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementExtendPackageListV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementExtendPackageListV2FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageListV2Filtering toolsAppManagementExtendPackageListV2Filtering = (ToolsAppManagementExtendPackageListV2Filtering) o;
    return Objects.equals(this.status, toolsAppManagementExtendPackageListV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageListV2Filtering {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageListV2Filtering
  */
  public static ToolsAppManagementExtendPackageListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

