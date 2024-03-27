/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
 * ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner {
  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_ESTIMATED_COST_RANGE = "blue_flow_keyword_estimated_cost_range";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_ESTIMATED_COST_RANGE)
  private List<Long> blueFlowKeywordEstimatedCostRange = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME = "blue_flow_keyword_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME)
  private String blueFlowKeywordName = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_TOP_QUERY_WORD_LIST = "blue_flow_keyword_top_query_word_list";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_TOP_QUERY_WORD_LIST)
  private List<String> blueFlowKeywordTopQueryWordList = null;

  public static final String SERIALIZED_NAME_SUPPORT_BLUE_FLOW_RECOMMEND_MATERIAL = "support_blue_flow_recommend_material";
  @SerializedName(SERIALIZED_NAME_SUPPORT_BLUE_FLOW_RECOMMEND_MATERIAL)
  private Boolean supportBlueFlowRecommendMaterial = null;

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner() {
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner blueFlowKeywordEstimatedCostRange(List<Long> blueFlowKeywordEstimatedCostRange) {
    
    this.blueFlowKeywordEstimatedCostRange = blueFlowKeywordEstimatedCostRange;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner addBlueFlowKeywordEstimatedCostRangeItem(Long blueFlowKeywordEstimatedCostRangeItem) {
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


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner blueFlowKeywordName(String blueFlowKeywordName) {
    
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


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner blueFlowKeywordTopQueryWordList(List<String> blueFlowKeywordTopQueryWordList) {
    
    this.blueFlowKeywordTopQueryWordList = blueFlowKeywordTopQueryWordList;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner addBlueFlowKeywordTopQueryWordListItem(String blueFlowKeywordTopQueryWordListItem) {
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


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner supportBlueFlowRecommendMaterial(Boolean supportBlueFlowRecommendMaterial) {
    
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
    ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner = (ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner) o;
    return Objects.equals(this.blueFlowKeywordEstimatedCostRange, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.blueFlowKeywordEstimatedCostRange) &&
        Objects.equals(this.blueFlowKeywordName, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.blueFlowKeywordName) &&
        Objects.equals(this.blueFlowKeywordTopQueryWordList, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.blueFlowKeywordTopQueryWordList) &&
        Objects.equals(this.supportBlueFlowRecommendMaterial, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.supportBlueFlowRecommendMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowKeywordEstimatedCostRange, blueFlowKeywordName, blueFlowKeywordTopQueryWordList, supportBlueFlowRecommendMaterial);
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
    sb.append("class ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner {\n");
    sb.append("    blueFlowKeywordEstimatedCostRange: ").append(toIndentedString(blueFlowKeywordEstimatedCostRange)).append("\n");
    sb.append("    blueFlowKeywordName: ").append(toIndentedString(blueFlowKeywordName)).append("\n");
    sb.append("    blueFlowKeywordTopQueryWordList: ").append(toIndentedString(blueFlowKeywordTopQueryWordList)).append("\n");
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
    openapiFields.add("support_blue_flow_recommend_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner
  */
  public static ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
