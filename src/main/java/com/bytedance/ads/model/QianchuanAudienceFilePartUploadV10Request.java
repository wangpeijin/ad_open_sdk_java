/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * QianchuanAudienceFilePartUploadV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class QianchuanAudienceFilePartUploadV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file = null;

  public static final String SERIALIZED_NAME_FILE_KEY = "file_key";
  @SerializedName(SERIALIZED_NAME_FILE_KEY)
  private String fileKey = null;

  public static final String SERIALIZED_NAME_IS_FINISHED = "is_finished";
  @SerializedName(SERIALIZED_NAME_IS_FINISHED)
  private Integer isFinished = null;

  public static final String SERIALIZED_NAME_PART_NUM = "part_num";
  @SerializedName(SERIALIZED_NAME_PART_NUM)
  private Long partNum = null;

  public QianchuanAudienceFilePartUploadV10Request() {
  }

  public QianchuanAudienceFilePartUploadV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAudienceFilePartUploadV10Request _file(File _file) {
    
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


  public QianchuanAudienceFilePartUploadV10Request fileKey(String fileKey) {
    
    this.fileKey = fileKey;
    return this;
  }

   /**
   * 
   * @return fileKey
  **/
  @javax.annotation.Nullable
  public String getFileKey() {
    return fileKey;
  }


  public void setFileKey(String fileKey) {
    this.fileKey = fileKey;
  }


  public QianchuanAudienceFilePartUploadV10Request isFinished(Integer isFinished) {
    
    this.isFinished = isFinished;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 1
   * @return isFinished
  **/
  @javax.annotation.Nonnull
  public Integer getIsFinished() {
    return isFinished;
  }


  public void setIsFinished(Integer isFinished) {
    this.isFinished = isFinished;
  }


  public QianchuanAudienceFilePartUploadV10Request partNum(Long partNum) {
    
    this.partNum = partNum;
    return this;
  }

   /**
   * 
   * @return partNum
  **/
  @javax.annotation.Nonnull
  public Long getPartNum() {
    return partNum;
  }


  public void setPartNum(Long partNum) {
    this.partNum = partNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudienceFilePartUploadV10Request qianchuanAudienceFilePartUploadV10Request = (QianchuanAudienceFilePartUploadV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanAudienceFilePartUploadV10Request.advertiserId) &&
        Objects.equals(this._file, qianchuanAudienceFilePartUploadV10Request._file) &&
        Objects.equals(this.fileKey, qianchuanAudienceFilePartUploadV10Request.fileKey) &&
        Objects.equals(this.isFinished, qianchuanAudienceFilePartUploadV10Request.isFinished) &&
        Objects.equals(this.partNum, qianchuanAudienceFilePartUploadV10Request.partNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, _file, fileKey, isFinished, partNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAudienceFilePartUploadV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
    sb.append("    partNum: ").append(toIndentedString(partNum)).append("\n");
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
    openapiFields.add("file_key");
    openapiFields.add("is_finished");
    openapiFields.add("part_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("is_finished");
    openapiRequiredFields.add("part_num");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudienceFilePartUploadV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudienceFilePartUploadV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudienceFilePartUploadV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudienceFilePartUploadV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudienceFilePartUploadV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAudienceFilePartUploadV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudienceFilePartUploadV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudienceFilePartUploadV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudienceFilePartUploadV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudienceFilePartUploadV10Request
  */
  public static QianchuanAudienceFilePartUploadV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudienceFilePartUploadV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAudienceFilePartUploadV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

