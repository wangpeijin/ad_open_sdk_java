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
import com.bytedance.ads.model.ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType;
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
 * ToolsBlueFlowKeywordListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsBlueFlowKeywordListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_ESTIMATED_COST_RANGE = "blue_flow_keyword_estimated_cost_range";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_ESTIMATED_COST_RANGE)
  private List<Long> blueFlowKeywordEstimatedCostRange = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME = "blue_flow_keyword_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME)
  private String blueFlowKeywordName = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_TOP_QUERY_WORD_LIST = "blue_flow_keyword_top_query_word_list";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_TOP_QUERY_WORD_LIST)
  private List<String> blueFlowKeywordTopQueryWordList = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_RECOMMEND_TYPE = "blue_flow_recommend_type";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_RECOMMEND_TYPE)
  private ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType blueFlowRecommendType = null;

  public static final String SERIALIZED_NAME_SUPPORT_BLUE_FLOW_RECOMMEND_MATERIAL = "support_blue_flow_recommend_material";
  @SerializedName(SERIALIZED_NAME_SUPPORT_BLUE_FLOW_RECOMMEND_MATERIAL)
  private Boolean supportBlueFlowRecommendMaterial = null;

  public ToolsBlueFlowKeywordListV30ResponseDataListInner() {
  }

  public ToolsBlueFlowKeywordListV30ResponseDataListInner blueFlowKeywordEstimatedCostRange(List<Long> blueFlowKeywordEstimatedCostRange) {
    
    this.blueFlowKeywordEstimatedCostRange = blueFlowKeywordEstimatedCostRange;
    return this;
  }

  public ToolsBlueFlowKeywordListV30ResponseDataListInner addBlueFlowKeywordEstimatedCostRangeItem(Long blueFlowKeywordEstimatedCostRangeItem) {
    if (this.blueFlowKeywordEstimatedCostRange == null) {
      this.blueFlowKeywordEstimatedCostRange = new ArrayList<>();
    }
    this.blueFlowKeywordEstimatedCostRange.add(blueFlowKeywordEstimatedCostRangeItem);
    return this;
  }

   /**
   * 
   * @return blueFlowKeywordEstimatedCostRange
  **/
  @javax.annotation.Nullable
  public List<Long> getBlueFlowKeywordEstimatedCostRange() {
    return blueFlowKeywordEstimatedCostRange;
  }


  public void setBlueFlowKeywordEstimatedCostRange(List<Long> blueFlowKeywordEstimatedCostRange) {
    this.blueFlowKeywordEstimatedCostRange = blueFlowKeywordEstimatedCostRange;
  }


  public ToolsBlueFlowKeywordListV30ResponseDataListInner blueFlowKeywordName(String blueFlowKeywordName) {
    
    this.blueFlowKeywordName = blueFlowKeywordName;
    return this;
  }

   /**
   * 
   * @return blueFlowKeywordName
  **/
  @javax.annotation.Nullable
  public String getBlueFlowKeywordName() {
    return blueFlowKeywordName;
  }


  public void setBlueFlowKeywordName(String blueFlowKeywordName) {
    this.blueFlowKeywordName = blueFlowKeywordName;
  }


  public ToolsBlueFlowKeywordListV30ResponseDataListInner blueFlowKeywordTopQueryWordList(List<String> blueFlowKeywordTopQueryWordList) {
    
    this.blueFlowKeywordTopQueryWordList = blueFlowKeywordTopQueryWordList;
    return this;
  }

  public ToolsBlueFlowKeywordListV30ResponseDataListInner addBlueFlowKeywordTopQueryWordListItem(String blueFlowKeywordTopQueryWordListItem) {
    if (this.blueFlowKeywordTopQueryWordList == null) {
      this.blueFlowKeywordTopQueryWordList = new ArrayList<>();
    }
    this.blueFlowKeywordTopQueryWordList.add(blueFlowKeywordTopQueryWordListItem);
    return this;
  }

   /**
   * 
   * @return blueFlowKeywordTopQueryWordList
  **/
  @javax.annotation.Nullable
  public List<String> getBlueFlowKeywordTopQueryWordList() {
    return blueFlowKeywordTopQueryWordList;
  }


  public void setBlueFlowKeywordTopQueryWordList(List<String> blueFlowKeywordTopQueryWordList) {
    this.blueFlowKeywordTopQueryWordList = blueFlowKeywordTopQueryWordList;
  }


  public ToolsBlueFlowKeywordListV30ResponseDataListInner blueFlowRecommendType(ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType blueFlowRecommendType) {
    
    this.blueFlowRecommendType = blueFlowRecommendType;
    return this;
  }

   /**
   * Get blueFlowRecommendType
   * @return blueFlowRecommendType
  **/
  @javax.annotation.Nullable
  public ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType getBlueFlowRecommendType() {
    return blueFlowRecommendType;
  }


  public void setBlueFlowRecommendType(ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType blueFlowRecommendType) {
    this.blueFlowRecommendType = blueFlowRecommendType;
  }


  public ToolsBlueFlowKeywordListV30ResponseDataListInner supportBlueFlowRecommendMaterial(Boolean supportBlueFlowRecommendMaterial) {
    
    this.supportBlueFlowRecommendMaterial = supportBlueFlowRecommendMaterial;
    return this;
  }

   /**
   * 
   * @return supportBlueFlowRecommendMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getSupportBlueFlowRecommendMaterial() {
    return supportBlueFlowRecommendMaterial;
  }


  public void setSupportBlueFlowRecommendMaterial(Boolean supportBlueFlowRecommendMaterial) {
    this.supportBlueFlowRecommendMaterial = supportBlueFlowRecommendMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBlueFlowKeywordListV30ResponseDataListInner toolsBlueFlowKeywordListV30ResponseDataListInner = (ToolsBlueFlowKeywordListV30ResponseDataListInner) o;
    return Objects.equals(this.blueFlowKeywordEstimatedCostRange, toolsBlueFlowKeywordListV30ResponseDataListInner.blueFlowKeywordEstimatedCostRange) &&
        Objects.equals(this.blueFlowKeywordName, toolsBlueFlowKeywordListV30ResponseDataListInner.blueFlowKeywordName) &&
        Objects.equals(this.blueFlowKeywordTopQueryWordList, toolsBlueFlowKeywordListV30ResponseDataListInner.blueFlowKeywordTopQueryWordList) &&
        Objects.equals(this.blueFlowRecommendType, toolsBlueFlowKeywordListV30ResponseDataListInner.blueFlowRecommendType) &&
        Objects.equals(this.supportBlueFlowRecommendMaterial, toolsBlueFlowKeywordListV30ResponseDataListInner.supportBlueFlowRecommendMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowKeywordEstimatedCostRange, blueFlowKeywordName, blueFlowKeywordTopQueryWordList, blueFlowRecommendType, supportBlueFlowRecommendMaterial);
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
    sb.append("class ToolsBlueFlowKeywordListV30ResponseDataListInner {\n");
    sb.append("    blueFlowKeywordEstimatedCostRange: ").append(toIndentedString(blueFlowKeywordEstimatedCostRange)).append("\n");
    sb.append("    blueFlowKeywordName: ").append(toIndentedString(blueFlowKeywordName)).append("\n");
    sb.append("    blueFlowKeywordTopQueryWordList: ").append(toIndentedString(blueFlowKeywordTopQueryWordList)).append("\n");
    sb.append("    blueFlowRecommendType: ").append(toIndentedString(blueFlowRecommendType)).append("\n");
    sb.append("    supportBlueFlowRecommendMaterial: ").append(toIndentedString(supportBlueFlowRecommendMaterial)).append("\n");
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
    openapiFields.add("blue_flow_keyword_estimated_cost_range");
    openapiFields.add("blue_flow_keyword_name");
    openapiFields.add("blue_flow_keyword_top_query_word_list");
    openapiFields.add("blue_flow_recommend_type");
    openapiFields.add("support_blue_flow_recommend_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowKeywordListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowKeywordListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowKeywordListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowKeywordListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowKeywordListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowKeywordListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowKeywordListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowKeywordListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowKeywordListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowKeywordListV30ResponseDataListInner
  */
  public static ToolsBlueFlowKeywordListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowKeywordListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowKeywordListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

