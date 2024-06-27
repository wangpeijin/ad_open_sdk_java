/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileAudioGetV2FilteringSources;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class FileAudioGetV2Filtering {
  public static final String SERIALIZED_NAME_AUDIO_IDS = "audio_ids";
  @SerializedName(SERIALIZED_NAME_AUDIO_IDS)
  private List<String> audioIds = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<String> signatures = null;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<FileAudioGetV2FilteringSources> sources = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public FileAudioGetV2Filtering() {
  }

  public FileAudioGetV2Filtering audioIds(List<String> audioIds) {
    
    this.audioIds = audioIds;
    return this;
  }

  public FileAudioGetV2Filtering addAudioIdsItem(String audioIdsItem) {
    if (this.audioIds == null) {
      this.audioIds = new ArrayList<>();
    }
    this.audioIds.add(audioIdsItem);
    return this;
  }

   /**
   * 按音频id过滤，list长度 1-100 注意audio_ids，material_ids，audio_signatures三者只能选一个过滤，同时传入会报错
   * @return audioIds
  **/
  @javax.annotation.Nullable
  public List<String> getAudioIds() {
    return audioIds;
  }


  public void setAudioIds(List<String> audioIds) {
    this.audioIds = audioIds;
  }


  public FileAudioGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据音频上传时间过滤，与start_time搭配使用，格式：yyyy-mm-dd hh:mm:ss
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileAudioGetV2Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileAudioGetV2Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 按音频素材id（全局唯一）过滤，list长度1-100 注意audio_ids，material_ids，audio_signatures三者只能选一个过滤，同时传入会报错
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileAudioGetV2Filtering signatures(List<String> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public FileAudioGetV2Filtering addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * 按音频md5过滤，list长度1-100 注意audio_ids，material_ids，audio_signatures三者只能选一个过滤，同时传入会报错
   * @return signatures
  **/
  @javax.annotation.Nullable
  public List<String> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }


  public FileAudioGetV2Filtering sources(List<FileAudioGetV2FilteringSources> sources) {
    
    this.sources = sources;
    return this;
  }

  public FileAudioGetV2Filtering addSourcesItem(FileAudioGetV2FilteringSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * 音频素材来源 枚举值大小写敏感，请严格按照定义的名称传参 AD_SITE  AD后台本地上传 OPEN_API 开放平台上传 TTS_TEXT_TO_AUDIO文本转音频
   * @return sources
  **/
  @javax.annotation.Nullable
  public List<FileAudioGetV2FilteringSources> getSources() {
    return sources;
  }


  public void setSources(List<FileAudioGetV2FilteringSources> sources) {
    this.sources = sources;
  }


  public FileAudioGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据音频上传时间过滤，与end_time搭配使用，格式：yyyy-mm-dd hh:mm:ss
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
    FileAudioGetV2Filtering fileAudioGetV2Filtering = (FileAudioGetV2Filtering) o;
    return Objects.equals(this.audioIds, fileAudioGetV2Filtering.audioIds) &&
        Objects.equals(this.endTime, fileAudioGetV2Filtering.endTime) &&
        Objects.equals(this.materialIds, fileAudioGetV2Filtering.materialIds) &&
        Objects.equals(this.signatures, fileAudioGetV2Filtering.signatures) &&
        Objects.equals(this.sources, fileAudioGetV2Filtering.sources) &&
        Objects.equals(this.startTime, fileAudioGetV2Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioIds, endTime, materialIds, signatures, sources, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAudioGetV2Filtering {\n");
    sb.append("    audioIds: ").append(toIndentedString(audioIds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
    openapiFields.add("audio_ids");
    openapiFields.add("end_time");
    openapiFields.add("material_ids");
    openapiFields.add("signatures");
    openapiFields.add("sources");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAudioGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAudioGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAudioGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAudioGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAudioGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileAudioGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAudioGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAudioGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAudioGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileAudioGetV2Filtering
  */
  public static FileAudioGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAudioGetV2Filtering.class);
  }

 /**
  * Convert an instance of FileAudioGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

