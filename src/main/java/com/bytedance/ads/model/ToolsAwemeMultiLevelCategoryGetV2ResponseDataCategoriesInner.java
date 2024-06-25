/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner;
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
 * ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner> children = null;

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

  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner() {
  }

  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner children(List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner addChildrenItem(ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 
   * @return children
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInnerChildrenInner> children) {
    this.children = children;
  }


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner coverNumStr(String coverNumStr) {
    
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


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner fansNumStr(String fansNumStr) {
    
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


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner id(Long id) {
    
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


  public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner value(String value) {
    
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
    ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner = (ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner) o;
    return Objects.equals(this.children, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.children) &&
        Objects.equals(this.coverNumStr, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.coverNumStr) &&
        Objects.equals(this.fansNumStr, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.fansNumStr) &&
        Objects.equals(this.id, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.id) &&
        Objects.equals(this.value, toolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, coverNumStr, fansNumStr, id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
    openapiFields.add("children");
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
       if (!ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner
  */
  public static ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

