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
import com.bytedance.ads.model.FileMaterialAttributesListV2FilteringMaterialProperties;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class FileMaterialAttributesListV2Filtering {
  public static final String SERIALIZED_NAME_ATTRIBUTES_MODIFY_TIME = "attributes_modify_time";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_MODIFY_TIME)
  private String attributesModifyTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_PROPERTIES = "material_properties";
  @SerializedName(SERIALIZED_NAME_MATERIAL_PROPERTIES)
  private List<FileMaterialAttributesListV2FilteringMaterialProperties> materialProperties = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public FileMaterialAttributesListV2Filtering() {
  }

  public FileMaterialAttributesListV2Filtering attributesModifyTime(String attributesModifyTime) {
    
    this.attributesModifyTime = attributesModifyTime;
    return this;
  }

   /**
   * 「存在搬运风险」属性最后一次更新时间，格式为yyyy-mm-dd ，筛选传入代表筛选出当天「存在搬运风险」发生过变化的素材信息
   * @return attributesModifyTime
  **/
  @javax.annotation.Nullable
  public String getAttributesModifyTime() {
    return attributesModifyTime;
  }


  public void setAttributesModifyTime(String attributesModifyTime) {
    this.attributesModifyTime = attributesModifyTime;
  }


  public FileMaterialAttributesListV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束日期，表示过滤出一段时间内上传的素材，格式为yyyy-mm-dd HH:MM:SS，如果传入起始日期，未传此参数，则默认为当前时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileMaterialAttributesListV2Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileMaterialAttributesListV2Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 按素材ID过滤，范围为1-1000
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileMaterialAttributesListV2Filtering materialProperties(List<FileMaterialAttributesListV2FilteringMaterialProperties> materialProperties) {
    
    this.materialProperties = materialProperties;
    return this;
  }

  public FileMaterialAttributesListV2Filtering addMaterialPropertiesItem(FileMaterialAttributesListV2FilteringMaterialProperties materialPropertiesItem) {
    if (this.materialProperties == null) {
      this.materialProperties = new ArrayList<>();
    }
    this.materialProperties.add(materialPropertiesItem);
    return this;
  }

   /**
   * 素材标签过滤项，如果不传，则默认返回广告主ID下所有素材。 允许值：
   * @return materialProperties
  **/
  @javax.annotation.Nullable
  public List<FileMaterialAttributesListV2FilteringMaterialProperties> getMaterialProperties() {
    return materialProperties;
  }


  public void setMaterialProperties(List<FileMaterialAttributesListV2FilteringMaterialProperties> materialProperties) {
    this.materialProperties = materialProperties;
  }


  public FileMaterialAttributesListV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 起始日期，表示按照素材上传到账户下的时间过滤，格式为yyyy-mm-dd HH:MM:SS，最早允许传入时间：2022-01-01 00:00:00 （时间是账号和素材绑定的时间，删除重绑时间会更新）
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialAttributesListV2Filtering fileMaterialAttributesListV2Filtering = (FileMaterialAttributesListV2Filtering) o;
    return Objects.equals(this.attributesModifyTime, fileMaterialAttributesListV2Filtering.attributesModifyTime) &&
        Objects.equals(this.endTime, fileMaterialAttributesListV2Filtering.endTime) &&
        Objects.equals(this.materialIds, fileMaterialAttributesListV2Filtering.materialIds) &&
        Objects.equals(this.materialProperties, fileMaterialAttributesListV2Filtering.materialProperties) &&
        Objects.equals(this.startTime, fileMaterialAttributesListV2Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributesModifyTime, endTime, materialIds, materialProperties, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMaterialAttributesListV2Filtering {\n");
    sb.append("    attributesModifyTime: ").append(toIndentedString(attributesModifyTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialProperties: ").append(toIndentedString(materialProperties)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("attributes_modify_time");
    openapiFields.add("end_time");
    openapiFields.add("material_ids");
    openapiFields.add("material_properties");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialAttributesListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialAttributesListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialAttributesListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialAttributesListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialAttributesListV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileMaterialAttributesListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialAttributesListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialAttributesListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialAttributesListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileMaterialAttributesListV2Filtering
  */
  public static FileMaterialAttributesListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialAttributesListV2Filtering.class);
  }

 /**
  * Convert an instance of FileMaterialAttributesListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

