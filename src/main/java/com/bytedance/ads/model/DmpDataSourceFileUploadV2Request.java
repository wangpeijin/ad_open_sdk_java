/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
import java.io.File;
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
 * DmpDataSourceFileUploadV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class DmpDataSourceFileUploadV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file = null;

  public static final String SERIALIZED_NAME_FILE_SIGNATURE = "file_signature";
  @SerializedName(SERIALIZED_NAME_FILE_SIGNATURE)
  private String fileSignature = null;

  public DmpDataSourceFileUploadV2Request() {
  }

  public DmpDataSourceFileUploadV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DmpDataSourceFileUploadV2Request _file(File _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * 
   * @return _file
  **/
  @javax.annotation.Nonnull
  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    this._file = _file;
  }


  public DmpDataSourceFileUploadV2Request fileSignature(String fileSignature) {
    
    this.fileSignature = fileSignature;
    return this;
  }

   /**
   * 
   * @return fileSignature
  **/
  @javax.annotation.Nullable
  public String getFileSignature() {
    return fileSignature;
  }


  public void setFileSignature(String fileSignature) {
    this.fileSignature = fileSignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceFileUploadV2Request dmpDataSourceFileUploadV2Request = (DmpDataSourceFileUploadV2Request) o;
    return Objects.equals(this.advertiserId, dmpDataSourceFileUploadV2Request.advertiserId) &&
        Objects.equals(this._file, dmpDataSourceFileUploadV2Request._file) &&
        Objects.equals(this.fileSignature, dmpDataSourceFileUploadV2Request.fileSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, _file, fileSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceFileUploadV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileSignature: ").append(toIndentedString(fileSignature)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("file");
    openapiFields.add("file_signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("file");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceFileUploadV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceFileUploadV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceFileUploadV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceFileUploadV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceFileUploadV2Request>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceFileUploadV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceFileUploadV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceFileUploadV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceFileUploadV2Request
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceFileUploadV2Request
  */
  public static DmpDataSourceFileUploadV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceFileUploadV2Request.class);
  }

 /**
  * Convert an instance of DmpDataSourceFileUploadV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

