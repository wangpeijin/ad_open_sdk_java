/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10FilteringMaterialStatus;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10FilteringMaterialType;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10FilteringVideoType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdMaterialGetV10Filtering {
  public static final String SERIALIZED_NAME_ANALYSIS_TYPE = "analysis_type";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_TYPE)
  private List<QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType> analysisType = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private QianchuanUniPromotionAdMaterialGetV10FilteringMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private QianchuanUniPromotionAdMaterialGetV10FilteringMaterialType materialType = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD = "search_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD)
  private String searchKeyword = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private QianchuanUniPromotionAdMaterialGetV10FilteringVideoType videoType = null;

  public QianchuanUniPromotionAdMaterialGetV10Filtering() {
  }

  public QianchuanUniPromotionAdMaterialGetV10Filtering analysisType(List<QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType> analysisType) {
    
    this.analysisType = analysisType;
    return this;
  }

  public QianchuanUniPromotionAdMaterialGetV10Filtering addAnalysisTypeItem(QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType analysisTypeItem) {
    if (this.analysisType == null) {
      this.analysisType = new ArrayList<>();
    }
    this.analysisType.add(analysisTypeItem);
    return this;
  }

   /**
   * 
   * @return analysisType
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType> getAnalysisType() {
    return analysisType;
  }


  public void setAnalysisType(List<QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType> analysisType) {
    this.analysisType = analysisType;
  }


  public QianchuanUniPromotionAdMaterialGetV10Filtering materialStatus(QianchuanUniPromotionAdMaterialGetV10FilteringMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10FilteringMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(QianchuanUniPromotionAdMaterialGetV10FilteringMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public QianchuanUniPromotionAdMaterialGetV10Filtering materialType(QianchuanUniPromotionAdMaterialGetV10FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public QianchuanUniPromotionAdMaterialGetV10FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(QianchuanUniPromotionAdMaterialGetV10FilteringMaterialType materialType) {
    this.materialType = materialType;
  }


  public QianchuanUniPromotionAdMaterialGetV10Filtering searchKeyword(String searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

   /**
   * 
   * @return searchKeyword
  **/
  @javax.annotation.Nullable
  public String getSearchKeyword() {
    return searchKeyword;
  }


  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }


  public QianchuanUniPromotionAdMaterialGetV10Filtering videoType(QianchuanUniPromotionAdMaterialGetV10FilteringVideoType videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10FilteringVideoType getVideoType() {
    return videoType;
  }


  public void setVideoType(QianchuanUniPromotionAdMaterialGetV10FilteringVideoType videoType) {
    this.videoType = videoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdMaterialGetV10Filtering qianchuanUniPromotionAdMaterialGetV10Filtering = (QianchuanUniPromotionAdMaterialGetV10Filtering) o;
    return Objects.equals(this.analysisType, qianchuanUniPromotionAdMaterialGetV10Filtering.analysisType) &&
        Objects.equals(this.materialStatus, qianchuanUniPromotionAdMaterialGetV10Filtering.materialStatus) &&
        Objects.equals(this.materialType, qianchuanUniPromotionAdMaterialGetV10Filtering.materialType) &&
        Objects.equals(this.searchKeyword, qianchuanUniPromotionAdMaterialGetV10Filtering.searchKeyword) &&
        Objects.equals(this.videoType, qianchuanUniPromotionAdMaterialGetV10Filtering.videoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisType, materialStatus, materialType, searchKeyword, videoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdMaterialGetV10Filtering {\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
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
    openapiFields.add("analysis_type");
    openapiFields.add("material_status");
    openapiFields.add("material_type");
    openapiFields.add("search_keyword");
    openapiFields.add("video_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdMaterialGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdMaterialGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdMaterialGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdMaterialGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdMaterialGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdMaterialGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdMaterialGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdMaterialGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdMaterialGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdMaterialGetV10Filtering
  */
  public static QianchuanUniPromotionAdMaterialGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdMaterialGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdMaterialGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

