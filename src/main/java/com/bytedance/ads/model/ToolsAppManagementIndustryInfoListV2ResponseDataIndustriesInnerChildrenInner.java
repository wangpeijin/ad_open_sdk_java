/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner;
import com.bytedance.ads.model.ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner;
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
 * ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner> children = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Long level = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_THEME_TAGS = "theme_tags";
  @SerializedName(SERIALIZED_NAME_THEME_TAGS)
  private List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner> themeTags = null;

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner() {
  }

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner children(List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner addChildrenItem(ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 子分类
   * @return children
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerChildrenInner> children) {
    this.children = children;
  }


  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 分类id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner level(Long level) {
    
    this.level = level;
    return this;
  }

   /**
   * 级别
   * @return level
  **/
  @javax.annotation.Nullable
  public Long getLevel() {
    return level;
  }


  public void setLevel(Long level) {
    this.level = level;
  }


  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 分类名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner themeTags(List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner> themeTags) {
    
    this.themeTags = themeTags;
    return this;
  }

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner addThemeTagsItem(ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner themeTagsItem) {
    if (this.themeTags == null) {
      this.themeTags = new ArrayList<>();
    }
    this.themeTags.add(themeTagsItem);
    return this;
  }

   /**
   * 题材标签列表
   * @return themeTags
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner> getThemeTags() {
    return themeTags;
  }


  public void setThemeTags(List<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner> themeTags) {
    this.themeTags = themeTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner = (ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner) o;
    return Objects.equals(this.children, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.children) &&
        Objects.equals(this.id, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.id) &&
        Objects.equals(this.level, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.level) &&
        Objects.equals(this.name, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.name) &&
        Objects.equals(this.themeTags, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.themeTags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, id, level, name, themeTags);
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
    sb.append("class ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    themeTags: ").append(toIndentedString(themeTags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("level");
    openapiFields.add("name");
    openapiFields.add("theme_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner
  */
  public static ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

