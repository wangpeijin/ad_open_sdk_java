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
import com.bytedance.ads.model.ToolsInterestActionId2wordV2ResponseDataCategoriesInner;
import com.bytedance.ads.model.ToolsInterestActionId2wordV2ResponseDataKeywordsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsInterestActionId2wordV2ResponseData {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<ToolsInterestActionId2wordV2ResponseDataCategoriesInner> categories = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<ToolsInterestActionId2wordV2ResponseDataKeywordsInner> keywords = null;

  public ToolsInterestActionId2wordV2ResponseData() {
  }

  public ToolsInterestActionId2wordV2ResponseData categories(List<ToolsInterestActionId2wordV2ResponseDataCategoriesInner> categories) {
    
    this.categories = categories;
    return this;
  }

  public ToolsInterestActionId2wordV2ResponseData addCategoriesItem(ToolsInterestActionId2wordV2ResponseDataCategoriesInner categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * 
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<ToolsInterestActionId2wordV2ResponseDataCategoriesInner> getCategories() {
    return categories;
  }


  public void setCategories(List<ToolsInterestActionId2wordV2ResponseDataCategoriesInner> categories) {
    this.categories = categories;
  }


  public ToolsInterestActionId2wordV2ResponseData keywords(List<ToolsInterestActionId2wordV2ResponseDataKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public ToolsInterestActionId2wordV2ResponseData addKeywordsItem(ToolsInterestActionId2wordV2ResponseDataKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<ToolsInterestActionId2wordV2ResponseDataKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<ToolsInterestActionId2wordV2ResponseDataKeywordsInner> keywords) {
    this.keywords = keywords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsInterestActionId2wordV2ResponseData toolsInterestActionId2wordV2ResponseData = (ToolsInterestActionId2wordV2ResponseData) o;
    return Objects.equals(this.categories, toolsInterestActionId2wordV2ResponseData.categories) &&
        Objects.equals(this.keywords, toolsInterestActionId2wordV2ResponseData.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsInterestActionId2wordV2ResponseData {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("keywords");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsInterestActionId2wordV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsInterestActionId2wordV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsInterestActionId2wordV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsInterestActionId2wordV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsInterestActionId2wordV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsInterestActionId2wordV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsInterestActionId2wordV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsInterestActionId2wordV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsInterestActionId2wordV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsInterestActionId2wordV2ResponseData
  */
  public static ToolsInterestActionId2wordV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsInterestActionId2wordV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsInterestActionId2wordV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

