/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class DpaVideoGetV2ResponseDataListInnerImageInfo {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public DpaVideoGetV2ResponseDataListInnerImageInfo() {
  }

  public DpaVideoGetV2ResponseDataListInnerImageInfo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public DpaVideoGetV2ResponseDataListInnerImageInfo imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public DpaVideoGetV2ResponseDataListInnerImageInfo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaVideoGetV2ResponseDataListInnerImageInfo dpaVideoGetV2ResponseDataListInnerImageInfo = (DpaVideoGetV2ResponseDataListInnerImageInfo) o;
    return Objects.equals(this.height, dpaVideoGetV2ResponseDataListInnerImageInfo.height) &&
        Objects.equals(this.imageId, dpaVideoGetV2ResponseDataListInnerImageInfo.imageId) &&
        Objects.equals(this.width, dpaVideoGetV2ResponseDataListInnerImageInfo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageId, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaVideoGetV2ResponseDataListInnerImageInfo {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("image_id");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaVideoGetV2ResponseDataListInnerImageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaVideoGetV2ResponseDataListInnerImageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaVideoGetV2ResponseDataListInnerImageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaVideoGetV2ResponseDataListInnerImageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaVideoGetV2ResponseDataListInnerImageInfo>() {
           @Override
           public void write(JsonWriter out, DpaVideoGetV2ResponseDataListInnerImageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaVideoGetV2ResponseDataListInnerImageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaVideoGetV2ResponseDataListInnerImageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaVideoGetV2ResponseDataListInnerImageInfo
  * @throws IOException if the JSON string is invalid with respect to DpaVideoGetV2ResponseDataListInnerImageInfo
  */
  public static DpaVideoGetV2ResponseDataListInnerImageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaVideoGetV2ResponseDataListInnerImageInfo.class);
  }

 /**
  * Convert an instance of DpaVideoGetV2ResponseDataListInnerImageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

