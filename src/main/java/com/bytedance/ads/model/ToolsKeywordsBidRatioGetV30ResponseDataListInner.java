/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsKeywordsBidRatioGetV30DataListDimension;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ToolsKeywordsBidRatioGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsKeywordsBidRatioGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_BID_RATIO = "bid_ratio";
  @SerializedName(SERIALIZED_NAME_BID_RATIO)
  private Double bidRatio = null;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private ToolsKeywordsBidRatioGetV30DataListDimension dimension = null;

  public static final String SERIALIZED_NAME_PROJECT_NUM = "project_num";
  @SerializedName(SERIALIZED_NAME_PROJECT_NUM)
  private Long projectNum = null;

  public static final String SERIALIZED_NAME_PROMOTION_WORD_ID = "promotion_word_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_WORD_ID)
  private String promotionWordId = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public ToolsKeywordsBidRatioGetV30ResponseDataListInner() {
  }

  public ToolsKeywordsBidRatioGetV30ResponseDataListInner bidRatio(Double bidRatio) {
    
    this.bidRatio = bidRatio;
    return this;
  }

   /**
   * 
   * @return bidRatio
  **/
  @javax.annotation.Nullable
  public Double getBidRatio() {
    return bidRatio;
  }


  public void setBidRatio(Double bidRatio) {
    this.bidRatio = bidRatio;
  }


  public ToolsKeywordsBidRatioGetV30ResponseDataListInner dimension(ToolsKeywordsBidRatioGetV30DataListDimension dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @javax.annotation.Nullable
  public ToolsKeywordsBidRatioGetV30DataListDimension getDimension() {
    return dimension;
  }


  public void setDimension(ToolsKeywordsBidRatioGetV30DataListDimension dimension) {
    this.dimension = dimension;
  }


  public ToolsKeywordsBidRatioGetV30ResponseDataListInner projectNum(Long projectNum) {
    
    this.projectNum = projectNum;
    return this;
  }

   /**
   * 
   * @return projectNum
  **/
  @javax.annotation.Nullable
  public Long getProjectNum() {
    return projectNum;
  }


  public void setProjectNum(Long projectNum) {
    this.projectNum = projectNum;
  }


  public ToolsKeywordsBidRatioGetV30ResponseDataListInner promotionWordId(String promotionWordId) {
    
    this.promotionWordId = promotionWordId;
    return this;
  }

   /**
   * 
   * @return promotionWordId
  **/
  @javax.annotation.Nullable
  public String getPromotionWordId() {
    return promotionWordId;
  }


  public void setPromotionWordId(String promotionWordId) {
    this.promotionWordId = promotionWordId;
  }


  public ToolsKeywordsBidRatioGetV30ResponseDataListInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsBidRatioGetV30ResponseDataListInner toolsKeywordsBidRatioGetV30ResponseDataListInner = (ToolsKeywordsBidRatioGetV30ResponseDataListInner) o;
    return Objects.equals(this.bidRatio, toolsKeywordsBidRatioGetV30ResponseDataListInner.bidRatio) &&
        Objects.equals(this.dimension, toolsKeywordsBidRatioGetV30ResponseDataListInner.dimension) &&
        Objects.equals(this.projectNum, toolsKeywordsBidRatioGetV30ResponseDataListInner.projectNum) &&
        Objects.equals(this.promotionWordId, toolsKeywordsBidRatioGetV30ResponseDataListInner.promotionWordId) &&
        Objects.equals(this.word, toolsKeywordsBidRatioGetV30ResponseDataListInner.word);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidRatio, dimension, projectNum, promotionWordId, word);
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
    sb.append("class ToolsKeywordsBidRatioGetV30ResponseDataListInner {\n");
    sb.append("    bidRatio: ").append(toIndentedString(bidRatio)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    projectNum: ").append(toIndentedString(projectNum)).append("\n");
    sb.append("    promotionWordId: ").append(toIndentedString(promotionWordId)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("bid_ratio");
    openapiFields.add("dimension");
    openapiFields.add("project_num");
    openapiFields.add("promotion_word_id");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsBidRatioGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsBidRatioGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsBidRatioGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsBidRatioGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsBidRatioGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsBidRatioGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsBidRatioGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsBidRatioGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsBidRatioGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsBidRatioGetV30ResponseDataListInner
  */
  public static ToolsKeywordsBidRatioGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsBidRatioGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsKeywordsBidRatioGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

