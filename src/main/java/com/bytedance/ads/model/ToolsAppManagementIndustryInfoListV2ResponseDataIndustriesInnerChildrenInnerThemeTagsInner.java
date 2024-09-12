/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
 * ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner() {
  }

  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 题材id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 题材名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner = (ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner) o;
    return Objects.equals(this.id, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner.id) &&
        Objects.equals(this.name, toolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
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
    sb.append("class ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner
  */
  public static ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementIndustryInfoListV2ResponseDataIndustriesInnerChildrenInnerThemeTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

