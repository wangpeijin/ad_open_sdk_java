/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerSettingLabel {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = null;

  public static final String SERIALIZED_NAME_FONT_SIZE = "font_size";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private Long fontSize = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public ToolsSiteUpdateV2RequestBricksInnerSettingLabel() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerSettingLabel color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * 
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingLabel fontSize(Long fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * 
   * @return fontSize
  **/
  @javax.annotation.Nullable
  public Long getFontSize() {
    return fontSize;
  }


  public void setFontSize(Long fontSize) {
    this.fontSize = fontSize;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingLabel text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerSettingLabel toolsSiteUpdateV2RequestBricksInnerSettingLabel = (ToolsSiteUpdateV2RequestBricksInnerSettingLabel) o;
    return Objects.equals(this.color, toolsSiteUpdateV2RequestBricksInnerSettingLabel.color) &&
        Objects.equals(this.fontSize, toolsSiteUpdateV2RequestBricksInnerSettingLabel.fontSize) &&
        Objects.equals(this.text, toolsSiteUpdateV2RequestBricksInnerSettingLabel.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontSize, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerSettingLabel {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("font_size");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerSettingLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerSettingLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerSettingLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingLabel>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerSettingLabel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerSettingLabel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerSettingLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerSettingLabel
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerSettingLabel
  */
  public static ToolsSiteUpdateV2RequestBricksInnerSettingLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerSettingLabel.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerSettingLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

