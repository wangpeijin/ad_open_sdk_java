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
 * 生成视频音频设置，不传入时系统默认推荐
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class AicVideoMixcutCreateV30RequestAudioOption {
  public static final String SERIALIZED_NAME_BGM_ELEMENT_IDS = "bgm_element_ids";
  @SerializedName(SERIALIZED_NAME_BGM_ELEMENT_IDS)
  private List<Long> bgmElementIds = null;

  public static final String SERIALIZED_NAME_VOICE_ELEMENT_ID = "voice_element_id";
  @SerializedName(SERIALIZED_NAME_VOICE_ELEMENT_ID)
  private Long voiceElementId = null;

  public AicVideoMixcutCreateV30RequestAudioOption() {
  }

  public AicVideoMixcutCreateV30RequestAudioOption bgmElementIds(List<Long> bgmElementIds) {
    
    this.bgmElementIds = bgmElementIds;
    return this;
  }

  public AicVideoMixcutCreateV30RequestAudioOption addBgmElementIdsItem(Long bgmElementIdsItem) {
    if (this.bgmElementIds == null) {
      this.bgmElementIds = new ArrayList<>();
    }
    this.bgmElementIds.add(bgmElementIdsItem);
    return this;
  }

   /**
   * 原料库的音乐ID，最多传入5个，传入多个时，成片随机挑选一个使用
   * @return bgmElementIds
  **/
  @javax.annotation.Nullable
  public List<Long> getBgmElementIds() {
    return bgmElementIds;
  }


  public void setBgmElementIds(List<Long> bgmElementIds) {
    this.bgmElementIds = bgmElementIds;
  }


  public AicVideoMixcutCreateV30RequestAudioOption voiceElementId(Long voiceElementId) {
    
    this.voiceElementId = voiceElementId;
    return this;
  }

   /**
   * 配音元素id
   * @return voiceElementId
  **/
  @javax.annotation.Nullable
  public Long getVoiceElementId() {
    return voiceElementId;
  }


  public void setVoiceElementId(Long voiceElementId) {
    this.voiceElementId = voiceElementId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicVideoMixcutCreateV30RequestAudioOption aicVideoMixcutCreateV30RequestAudioOption = (AicVideoMixcutCreateV30RequestAudioOption) o;
    return Objects.equals(this.bgmElementIds, aicVideoMixcutCreateV30RequestAudioOption.bgmElementIds) &&
        Objects.equals(this.voiceElementId, aicVideoMixcutCreateV30RequestAudioOption.voiceElementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgmElementIds, voiceElementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicVideoMixcutCreateV30RequestAudioOption {\n");
    sb.append("    bgmElementIds: ").append(toIndentedString(bgmElementIds)).append("\n");
    sb.append("    voiceElementId: ").append(toIndentedString(voiceElementId)).append("\n");
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
    openapiFields.add("bgm_element_ids");
    openapiFields.add("voice_element_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicVideoMixcutCreateV30RequestAudioOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicVideoMixcutCreateV30RequestAudioOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicVideoMixcutCreateV30RequestAudioOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicVideoMixcutCreateV30RequestAudioOption.class));

       return (TypeAdapter<T>) new TypeAdapter<AicVideoMixcutCreateV30RequestAudioOption>() {
           @Override
           public void write(JsonWriter out, AicVideoMixcutCreateV30RequestAudioOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicVideoMixcutCreateV30RequestAudioOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicVideoMixcutCreateV30RequestAudioOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicVideoMixcutCreateV30RequestAudioOption
  * @throws IOException if the JSON string is invalid with respect to AicVideoMixcutCreateV30RequestAudioOption
  */
  public static AicVideoMixcutCreateV30RequestAudioOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicVideoMixcutCreateV30RequestAudioOption.class);
  }

 /**
  * Convert an instance of AicVideoMixcutCreateV30RequestAudioOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

