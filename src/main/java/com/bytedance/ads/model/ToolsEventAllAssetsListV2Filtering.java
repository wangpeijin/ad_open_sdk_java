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
import com.bytedance.ads.model.ToolsEventAllAssetsListV2FilteringAssetType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsEventAllAssetsListV2Filtering {
  public static final String SERIALIZED_NAME_ASSET_IDS = "asset_ids";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<Long> assetIds = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private ToolsEventAllAssetsListV2FilteringAssetType assetType = null;

  public static final String SERIALIZED_NAME_MODIFY_END_TIME = "modify_end_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_END_TIME)
  private String modifyEndTime = null;

  public static final String SERIALIZED_NAME_MODIFY_START_TIME = "modify_start_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_START_TIME)
  private String modifyStartTime = null;

  public ToolsEventAllAssetsListV2Filtering() {
  }

  public ToolsEventAllAssetsListV2Filtering assetIds(List<Long> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public ToolsEventAllAssetsListV2Filtering addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * 资产id列表,最大&#x60;100&#x60;
   * @return assetIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }


  public ToolsEventAllAssetsListV2Filtering assetType(ToolsEventAllAssetsListV2FilteringAssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public ToolsEventAllAssetsListV2FilteringAssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(ToolsEventAllAssetsListV2FilteringAssetType assetType) {
    this.assetType = assetType;
  }


  public ToolsEventAllAssetsListV2Filtering modifyEndTime(String modifyEndTime) {
    
    this.modifyEndTime = modifyEndTime;
    return this;
  }

   /**
   * 按照资产修改时间筛选，结束时间&#x60;YYYY-MM-DD&#x60;，必须与开始时间搭配传入 开始时间必须≤结束时间
   * @return modifyEndTime
  **/
  @javax.annotation.Nullable
  public String getModifyEndTime() {
    return modifyEndTime;
  }


  public void setModifyEndTime(String modifyEndTime) {
    this.modifyEndTime = modifyEndTime;
  }


  public ToolsEventAllAssetsListV2Filtering modifyStartTime(String modifyStartTime) {
    
    this.modifyStartTime = modifyStartTime;
    return this;
  }

   /**
   * 按照资产修改时间筛选，开始时间&#x60;YYYY-MM-DD&#x60;，必须与结束时间搭配传入 开始时间必须≤结束时间
   * @return modifyStartTime
  **/
  @javax.annotation.Nullable
  public String getModifyStartTime() {
    return modifyStartTime;
  }


  public void setModifyStartTime(String modifyStartTime) {
    this.modifyStartTime = modifyStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAllAssetsListV2Filtering toolsEventAllAssetsListV2Filtering = (ToolsEventAllAssetsListV2Filtering) o;
    return Objects.equals(this.assetIds, toolsEventAllAssetsListV2Filtering.assetIds) &&
        Objects.equals(this.assetType, toolsEventAllAssetsListV2Filtering.assetType) &&
        Objects.equals(this.modifyEndTime, toolsEventAllAssetsListV2Filtering.modifyEndTime) &&
        Objects.equals(this.modifyStartTime, toolsEventAllAssetsListV2Filtering.modifyStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, assetType, modifyEndTime, modifyStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEventAllAssetsListV2Filtering {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    modifyEndTime: ").append(toIndentedString(modifyEndTime)).append("\n");
    sb.append("    modifyStartTime: ").append(toIndentedString(modifyStartTime)).append("\n");
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
    openapiFields.add("asset_ids");
    openapiFields.add("asset_type");
    openapiFields.add("modify_end_time");
    openapiFields.add("modify_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAllAssetsListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAllAssetsListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAllAssetsListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAllAssetsListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAllAssetsListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsEventAllAssetsListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAllAssetsListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAllAssetsListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAllAssetsListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAllAssetsListV2Filtering
  */
  public static ToolsEventAllAssetsListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAllAssetsListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsEventAllAssetsListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

