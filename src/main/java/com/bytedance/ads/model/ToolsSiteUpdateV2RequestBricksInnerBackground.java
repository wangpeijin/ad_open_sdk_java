/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerBackgroundDescription;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerBackgroundTitle;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsSiteUpdateV2RequestBricksInnerBackground {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private ToolsSiteUpdateV2RequestBricksInnerBackgroundDescription description = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private ToolsSiteUpdateV2RequestBricksInnerBackgroundTitle title = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public ToolsSiteUpdateV2RequestBricksInnerBackground() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerBackground color(String color) {
    
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


  public ToolsSiteUpdateV2RequestBricksInnerBackground description(ToolsSiteUpdateV2RequestBricksInnerBackgroundDescription description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerBackgroundDescription getDescription() {
    return description;
  }


  public void setDescription(ToolsSiteUpdateV2RequestBricksInnerBackgroundDescription description) {
    this.description = description;
  }


  public ToolsSiteUpdateV2RequestBricksInnerBackground image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * 
   * @return image
  **/
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public ToolsSiteUpdateV2RequestBricksInnerBackground title(ToolsSiteUpdateV2RequestBricksInnerBackgroundTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerBackgroundTitle getTitle() {
    return title;
  }


  public void setTitle(ToolsSiteUpdateV2RequestBricksInnerBackgroundTitle title) {
    this.title = title;
  }


  public ToolsSiteUpdateV2RequestBricksInnerBackground type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerBackground toolsSiteUpdateV2RequestBricksInnerBackground = (ToolsSiteUpdateV2RequestBricksInnerBackground) o;
    return Objects.equals(this.color, toolsSiteUpdateV2RequestBricksInnerBackground.color) &&
        Objects.equals(this.description, toolsSiteUpdateV2RequestBricksInnerBackground.description) &&
        Objects.equals(this.image, toolsSiteUpdateV2RequestBricksInnerBackground.image) &&
        Objects.equals(this.title, toolsSiteUpdateV2RequestBricksInnerBackground.title) &&
        Objects.equals(this.type, toolsSiteUpdateV2RequestBricksInnerBackground.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, image, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerBackground {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("image");
    openapiFields.add("title");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerBackground.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerBackground' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerBackground> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerBackground.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerBackground>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerBackground value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerBackground read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerBackground given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerBackground
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerBackground
  */
  public static ToolsSiteUpdateV2RequestBricksInnerBackground fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerBackground.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerBackground to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

