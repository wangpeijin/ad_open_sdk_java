/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeUpdateV30RequestAdvancedCreativeInfoCardImageInfo;
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
 * 图片磁贴或图片磁贴含搜索组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard {
  public static final String SERIALIZED_NAME_ADVANCED_DURATION = "advanced_duration";
  @SerializedName(SERIALIZED_NAME_ADVANCED_DURATION)
  private Long advancedDuration = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private BrandCreativeUpdateV30RequestAdvancedCreativeInfoCardImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_SEARCH_WORDS = "search_words";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORDS)
  private List<String> searchWords = null;

  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard() {
  }

  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard advancedDuration(Long advancedDuration) {
    
    this.advancedDuration = advancedDuration;
    return this;
  }

   /**
   * 组件弹出时间
   * @return advancedDuration
  **/
  @javax.annotation.Nullable
  public Long getAdvancedDuration() {
    return advancedDuration;
  }


  public void setAdvancedDuration(Long advancedDuration) {
    this.advancedDuration = advancedDuration;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard imageInfo(BrandCreativeUpdateV30RequestAdvancedCreativeInfoCardImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCardImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(BrandCreativeUpdateV30RequestAdvancedCreativeInfoCardImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard searchWords(List<String> searchWords) {
    
    this.searchWords = searchWords;
    return this;
  }

  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard addSearchWordsItem(String searchWordsItem) {
    if (this.searchWords == null) {
      this.searchWords = new ArrayList<>();
    }
    this.searchWords.add(searchWordsItem);
    return this;
  }

   /**
   * 搜索词数组
   * @return searchWords
  **/
  @javax.annotation.Nullable
  public List<String> getSearchWords() {
    return searchWords;
  }


  public void setSearchWords(List<String> searchWords) {
    this.searchWords = searchWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard brandCreativeUpdateV30RequestAdvancedCreativeInfoCard = (BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard) o;
    return Objects.equals(this.advancedDuration, brandCreativeUpdateV30RequestAdvancedCreativeInfoCard.advancedDuration) &&
        Objects.equals(this.imageInfo, brandCreativeUpdateV30RequestAdvancedCreativeInfoCard.imageInfo) &&
        Objects.equals(this.searchWords, brandCreativeUpdateV30RequestAdvancedCreativeInfoCard.searchWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedDuration, imageInfo, searchWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard {\n");
    sb.append("    advancedDuration: ").append(toIndentedString(advancedDuration)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    searchWords: ").append(toIndentedString(searchWords)).append("\n");
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
    openapiFields.add("advanced_duration");
    openapiFields.add("image_info");
    openapiFields.add("search_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard>() {
           @Override
           public void write(JsonWriter out, BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard
  */
  public static BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard.class);
  }

 /**
  * Convert an instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

