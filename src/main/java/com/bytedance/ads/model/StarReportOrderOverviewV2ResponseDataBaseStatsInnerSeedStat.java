/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * 种草价值
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat {
  public static final String SERIALIZED_NAME_EMOTION_DISTRIBUTION = "emotion_distribution";
  @SerializedName(SERIALIZED_NAME_EMOTION_DISTRIBUTION)
  private StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution emotionDistribution = null;

  public static final String SERIALIZED_NAME_HOT_KEYWORDS = "hot_keywords";
  @SerializedName(SERIALIZED_NAME_HOT_KEYWORDS)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner> hotKeywords = null;

  public static final String SERIALIZED_NAME_SEARCH_INDEX = "search_index";
  @SerializedName(SERIALIZED_NAME_SEARCH_INDEX)
  private Long searchIndex = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat emotionDistribution(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution emotionDistribution) {
    
    this.emotionDistribution = emotionDistribution;
    return this;
  }

   /**
   * Get emotionDistribution
   * @return emotionDistribution
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution getEmotionDistribution() {
    return emotionDistribution;
  }


  public void setEmotionDistribution(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution emotionDistribution) {
    this.emotionDistribution = emotionDistribution;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat hotKeywords(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner> hotKeywords) {
    
    this.hotKeywords = hotKeywords;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat addHotKeywordsItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner hotKeywordsItem) {
    if (this.hotKeywords == null) {
      this.hotKeywords = new ArrayList<>();
    }
    this.hotKeywords.add(hotKeywordsItem);
    return this;
  }

   /**
   * 热词分类
   * @return hotKeywords
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner> getHotKeywords() {
    return hotKeywords;
  }


  public void setHotKeywords(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner> hotKeywords) {
    this.hotKeywords = hotKeywords;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat searchIndex(Long searchIndex) {
    
    this.searchIndex = searchIndex;
    return this;
  }

   /**
   * 搜索指数
   * @return searchIndex
  **/
  @javax.annotation.Nullable
  public Long getSearchIndex() {
    return searchIndex;
  }


  public void setSearchIndex(Long searchIndex) {
    this.searchIndex = searchIndex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat) o;
    return Objects.equals(this.emotionDistribution, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.emotionDistribution) &&
        Objects.equals(this.hotKeywords, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.hotKeywords) &&
        Objects.equals(this.searchIndex, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.searchIndex);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(emotionDistribution, hotKeywords, searchIndex);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat {\n");
    sb.append("    emotionDistribution: ").append(toIndentedString(emotionDistribution)).append("\n");
    sb.append("    hotKeywords: ").append(toIndentedString(hotKeywords)).append("\n");
    sb.append("    searchIndex: ").append(toIndentedString(searchIndex)).append("\n");
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
    openapiFields.add("emotion_distribution");
    openapiFields.add("hot_keywords");
    openapiFields.add("search_index");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

