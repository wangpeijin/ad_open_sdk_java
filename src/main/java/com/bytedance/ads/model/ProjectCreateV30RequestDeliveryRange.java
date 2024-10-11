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
import com.bytedance.ads.model.ProjectCreateV30DeliveryRangeInventoryCatalog;
import com.bytedance.ads.model.ProjectCreateV30DeliveryRangeInventoryType;
import com.bytedance.ads.model.ProjectCreateV30DeliveryRangeUnionVideoType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ProjectCreateV30RequestDeliveryRange {
  public static final String SERIALIZED_NAME_INVENTORY_CATALOG = "inventory_catalog";
  @SerializedName(SERIALIZED_NAME_INVENTORY_CATALOG)
  private ProjectCreateV30DeliveryRangeInventoryCatalog inventoryCatalog = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private List<ProjectCreateV30DeliveryRangeInventoryType> inventoryType = null;

  public static final String SERIALIZED_NAME_UNION_VIDEO_TYPE = "union_video_type";
  @SerializedName(SERIALIZED_NAME_UNION_VIDEO_TYPE)
  private ProjectCreateV30DeliveryRangeUnionVideoType unionVideoType = null;

  public ProjectCreateV30RequestDeliveryRange() {
  }

  public ProjectCreateV30RequestDeliveryRange inventoryCatalog(ProjectCreateV30DeliveryRangeInventoryCatalog inventoryCatalog) {
    
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

   /**
   * Get inventoryCatalog
   * @return inventoryCatalog
  **/
  @javax.annotation.Nonnull
  public ProjectCreateV30DeliveryRangeInventoryCatalog getInventoryCatalog() {
    return inventoryCatalog;
  }


  public void setInventoryCatalog(ProjectCreateV30DeliveryRangeInventoryCatalog inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
  }


  public ProjectCreateV30RequestDeliveryRange inventoryType(List<ProjectCreateV30DeliveryRangeInventoryType> inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

  public ProjectCreateV30RequestDeliveryRange addInventoryTypeItem(ProjectCreateV30DeliveryRangeInventoryType inventoryTypeItem) {
    if (this.inventoryType == null) {
      this.inventoryType = new ArrayList<>();
    }
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

   /**
   * 
   * @return inventoryType
  **/
  @javax.annotation.Nullable
  public List<ProjectCreateV30DeliveryRangeInventoryType> getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(List<ProjectCreateV30DeliveryRangeInventoryType> inventoryType) {
    this.inventoryType = inventoryType;
  }


  public ProjectCreateV30RequestDeliveryRange unionVideoType(ProjectCreateV30DeliveryRangeUnionVideoType unionVideoType) {
    
    this.unionVideoType = unionVideoType;
    return this;
  }

   /**
   * Get unionVideoType
   * @return unionVideoType
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliveryRangeUnionVideoType getUnionVideoType() {
    return unionVideoType;
  }


  public void setUnionVideoType(ProjectCreateV30DeliveryRangeUnionVideoType unionVideoType) {
    this.unionVideoType = unionVideoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateV30RequestDeliveryRange projectCreateV30RequestDeliveryRange = (ProjectCreateV30RequestDeliveryRange) o;
    return Objects.equals(this.inventoryCatalog, projectCreateV30RequestDeliveryRange.inventoryCatalog) &&
        Objects.equals(this.inventoryType, projectCreateV30RequestDeliveryRange.inventoryType) &&
        Objects.equals(this.unionVideoType, projectCreateV30RequestDeliveryRange.unionVideoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryCatalog, inventoryType, unionVideoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestDeliveryRange {\n");
    sb.append("    inventoryCatalog: ").append(toIndentedString(inventoryCatalog)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    unionVideoType: ").append(toIndentedString(unionVideoType)).append("\n");
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
    openapiFields.add("inventory_catalog");
    openapiFields.add("inventory_type");
    openapiFields.add("union_video_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inventory_catalog");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestDeliveryRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestDeliveryRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestDeliveryRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestDeliveryRange.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestDeliveryRange>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestDeliveryRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestDeliveryRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestDeliveryRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestDeliveryRange
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestDeliveryRange
  */
  public static ProjectCreateV30RequestDeliveryRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestDeliveryRange.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestDeliveryRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

