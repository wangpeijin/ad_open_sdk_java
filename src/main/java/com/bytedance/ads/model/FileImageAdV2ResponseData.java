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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class FileImageAdV2ResponseData {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public FileImageAdV2ResponseData() {
  }

  public FileImageAdV2ResponseData format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * 图片格式 
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public FileImageAdV2ResponseData height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 图片高度 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public FileImageAdV2ResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 图片ID 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FileImageAdV2ResponseData materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileImageAdV2ResponseData signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 图片md5 
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public FileImageAdV2ResponseData size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 图片大小 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public FileImageAdV2ResponseData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 图片预览地址 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FileImageAdV2ResponseData width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 图片宽度 
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
    FileImageAdV2ResponseData fileImageAdV2ResponseData = (FileImageAdV2ResponseData) o;
    return Objects.equals(this.format, fileImageAdV2ResponseData.format) &&
        Objects.equals(this.height, fileImageAdV2ResponseData.height) &&
        Objects.equals(this.id, fileImageAdV2ResponseData.id) &&
        Objects.equals(this.materialId, fileImageAdV2ResponseData.materialId) &&
        Objects.equals(this.signature, fileImageAdV2ResponseData.signature) &&
        Objects.equals(this.size, fileImageAdV2ResponseData.size) &&
        Objects.equals(this.url, fileImageAdV2ResponseData.url) &&
        Objects.equals(this.width, fileImageAdV2ResponseData.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, height, id, materialId, signature, size, url, width);
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
    sb.append("class FileImageAdV2ResponseData {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("id");
    openapiFields.add("material_id");
    openapiFields.add("signature");
    openapiFields.add("size");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileImageAdV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileImageAdV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileImageAdV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileImageAdV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileImageAdV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileImageAdV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileImageAdV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileImageAdV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileImageAdV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileImageAdV2ResponseData
  */
  public static FileImageAdV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileImageAdV2ResponseData.class);
  }

 /**
  * Convert an instance of FileImageAdV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

