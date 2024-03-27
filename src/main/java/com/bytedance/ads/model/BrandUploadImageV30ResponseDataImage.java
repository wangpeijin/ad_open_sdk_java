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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class BrandUploadImageV30ResponseDataImage {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = null;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_SHOW_URL = "show_url";
  @SerializedName(SERIALIZED_NAME_SHOW_URL)
  private String showUrl = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public BrandUploadImageV30ResponseDataImage() {
  }

  public BrandUploadImageV30ResponseDataImage format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * 
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public BrandUploadImageV30ResponseDataImage hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * 
   * @return hash
  **/
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public BrandUploadImageV30ResponseDataImage height(Long height) {
    
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


  public BrandUploadImageV30ResponseDataImage showUrl(String showUrl) {
    
    this.showUrl = showUrl;
    return this;
  }

   /**
   * 
   * @return showUrl
  **/
  @javax.annotation.Nullable
  public String getShowUrl() {
    return showUrl;
  }


  public void setShowUrl(String showUrl) {
    this.showUrl = showUrl;
  }


  public BrandUploadImageV30ResponseDataImage uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public BrandUploadImageV30ResponseDataImage width(Long width) {
    
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
    BrandUploadImageV30ResponseDataImage brandUploadImageV30ResponseDataImage = (BrandUploadImageV30ResponseDataImage) o;
    return Objects.equals(this.format, brandUploadImageV30ResponseDataImage.format) &&
        Objects.equals(this.hash, brandUploadImageV30ResponseDataImage.hash) &&
        Objects.equals(this.height, brandUploadImageV30ResponseDataImage.height) &&
        Objects.equals(this.showUrl, brandUploadImageV30ResponseDataImage.showUrl) &&
        Objects.equals(this.uri, brandUploadImageV30ResponseDataImage.uri) &&
        Objects.equals(this.width, brandUploadImageV30ResponseDataImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, hash, height, showUrl, uri, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandUploadImageV30ResponseDataImage {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    showUrl: ").append(toIndentedString(showUrl)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("hash");
    openapiFields.add("height");
    openapiFields.add("show_url");
    openapiFields.add("uri");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("hash");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("show_url");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("width");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandUploadImageV30ResponseDataImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandUploadImageV30ResponseDataImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandUploadImageV30ResponseDataImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandUploadImageV30ResponseDataImage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandUploadImageV30ResponseDataImage>() {
           @Override
           public void write(JsonWriter out, BrandUploadImageV30ResponseDataImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandUploadImageV30ResponseDataImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandUploadImageV30ResponseDataImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandUploadImageV30ResponseDataImage
  * @throws IOException if the JSON string is invalid with respect to BrandUploadImageV30ResponseDataImage
  */
  public static BrandUploadImageV30ResponseDataImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandUploadImageV30ResponseDataImage.class);
  }

 /**
  * Convert an instance of BrandUploadImageV30ResponseDataImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
