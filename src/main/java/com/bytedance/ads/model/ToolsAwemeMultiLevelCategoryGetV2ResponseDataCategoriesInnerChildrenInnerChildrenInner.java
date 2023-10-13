/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
 * ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner {
  public static final String SERIALIZED_NAME_COVER_NUM_STR = "cover_num_str";
  @SerializedName(SERIALIZED_NAME_COVER_NUM_STR)
  private String coverNumStr = null;

  public static final String SERIALIZED_NAME_FANS_NUM_STR = "fans_num_str";
  @SerializedName(SERIALIZED_NAME_FANS_NUM_STR)
  private String fansNumStr = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner() {
  }

  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner coverNumStr(String coverNumStr) {
    
    this.coverNumStr = coverNumStr;
    return this;
  }

   /**
   * 
   * @return coverNumStr
  **/
  @javax.annotation.Nullable
  public String getCoverNumStr() {
    return coverNumStr;
  }


  public void setCoverNumStr(String coverNumStr) {
    this.coverNumStr = coverNumStr;
  }


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner fansNumStr(String fansNumStr) {
    
    this.fansNumStr = fansNumStr;
    return this;
  }

   /**
   * 
   * @return fansNumStr
  **/
  @javax.annotation.Nullable
  public String getFansNumStr() {
    return fansNumStr;
  }


  public void setFansNumStr(String fansNumStr) {
    this.fansNumStr = fansNumStr;
  }


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner = (ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner) o;
    return Objects.equals(this.coverNumStr, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.coverNumStr) &&
        Objects.equals(this.fansNumStr, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.fansNumStr) &&
        Objects.equals(this.id, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.id) &&
        Objects.equals(this.value, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNumStr, fansNumStr, id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner {\n");
    sb.append("    coverNumStr: ").append(toIndentedString(coverNumStr)).append("\n");
    sb.append("    fansNumStr: ").append(toIndentedString(fansNumStr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("cover_num_str");
    openapiFields.add("fans_num_str");
    openapiFields.add("id");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner
  */
  public static ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

