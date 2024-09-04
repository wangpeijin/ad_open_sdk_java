/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerMarquee {
  public static final String SERIALIZED_NAME_PREFIX_ICON = "prefix_icon";
  @SerializedName(SERIALIZED_NAME_PREFIX_ICON)
  private String prefixIcon = null;

  public static final String SERIALIZED_NAME_TEXT_LIST = "text_list";
  @SerializedName(SERIALIZED_NAME_TEXT_LIST)
  private List<String> textList = null;

  public ToolsSiteUpdateV2RequestBricksInnerMarquee() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerMarquee prefixIcon(String prefixIcon) {
    
    this.prefixIcon = prefixIcon;
    return this;
  }

   /**
   * 
   * @return prefixIcon
  **/
  @javax.annotation.Nullable
  public String getPrefixIcon() {
    return prefixIcon;
  }


  public void setPrefixIcon(String prefixIcon) {
    this.prefixIcon = prefixIcon;
  }


  public ToolsSiteUpdateV2RequestBricksInnerMarquee textList(List<String> textList) {
    
    this.textList = textList;
    return this;
  }

  public ToolsSiteUpdateV2RequestBricksInnerMarquee addTextListItem(String textListItem) {
    if (this.textList == null) {
      this.textList = new ArrayList<>();
    }
    this.textList.add(textListItem);
    return this;
  }

   /**
   * 
   * @return textList
  **/
  @javax.annotation.Nullable
  public List<String> getTextList() {
    return textList;
  }


  public void setTextList(List<String> textList) {
    this.textList = textList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerMarquee toolsSiteUpdateV2RequestBricksInnerMarquee = (ToolsSiteUpdateV2RequestBricksInnerMarquee) o;
    return Objects.equals(this.prefixIcon, toolsSiteUpdateV2RequestBricksInnerMarquee.prefixIcon) &&
        Objects.equals(this.textList, toolsSiteUpdateV2RequestBricksInnerMarquee.textList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixIcon, textList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerMarquee {\n");
    sb.append("    prefixIcon: ").append(toIndentedString(prefixIcon)).append("\n");
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
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
    openapiFields.add("prefix_icon");
    openapiFields.add("text_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerMarquee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerMarquee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerMarquee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerMarquee.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerMarquee>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerMarquee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerMarquee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerMarquee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerMarquee
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerMarquee
  */
  public static ToolsSiteUpdateV2RequestBricksInnerMarquee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerMarquee.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerMarquee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

