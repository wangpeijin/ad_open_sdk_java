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
import com.bytedance.ads.model.QianchuanAudienceCreateByFileV10MatchType;
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
 * QianchuanAudienceCreateByFileV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QianchuanAudienceCreateByFileV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE_GROUP = "audience_group";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_GROUP)
  private String audienceGroup = null;

  public static final String SERIALIZED_NAME_AUDIENCE_NAME = "audience_name";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_NAME)
  private String audienceName = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private Long dataType = null;

  public static final String SERIALIZED_NAME_FILE_KEY = "file_key";
  @SerializedName(SERIALIZED_NAME_FILE_KEY)
  private String fileKey = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private QianchuanAudienceCreateByFileV10MatchType matchType = null;

  public QianchuanAudienceCreateByFileV10Request() {
  }

  public QianchuanAudienceCreateByFileV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAudienceCreateByFileV10Request audienceGroup(String audienceGroup) {
    
    this.audienceGroup = audienceGroup;
    return this;
  }

   /**
   * 
   * @return audienceGroup
  **/
  @javax.annotation.Nonnull
  public String getAudienceGroup() {
    return audienceGroup;
  }


  public void setAudienceGroup(String audienceGroup) {
    this.audienceGroup = audienceGroup;
  }


  public QianchuanAudienceCreateByFileV10Request audienceName(String audienceName) {
    
    this.audienceName = audienceName;
    return this;
  }

   /**
   * 
   * @return audienceName
  **/
  @javax.annotation.Nonnull
  public String getAudienceName() {
    return audienceName;
  }


  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
  }


  public QianchuanAudienceCreateByFileV10Request dataType(Long dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 
   * @return dataType
  **/
  @javax.annotation.Nonnull
  public Long getDataType() {
    return dataType;
  }


  public void setDataType(Long dataType) {
    this.dataType = dataType;
  }


  public QianchuanAudienceCreateByFileV10Request fileKey(String fileKey) {
    
    this.fileKey = fileKey;
    return this;
  }

   /**
   * 
   * @return fileKey
  **/
  @javax.annotation.Nonnull
  public String getFileKey() {
    return fileKey;
  }


  public void setFileKey(String fileKey) {
    this.fileKey = fileKey;
  }


  public QianchuanAudienceCreateByFileV10Request matchType(QianchuanAudienceCreateByFileV10MatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public QianchuanAudienceCreateByFileV10MatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(QianchuanAudienceCreateByFileV10MatchType matchType) {
    this.matchType = matchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudienceCreateByFileV10Request qianchuanAudienceCreateByFileV10Request = (QianchuanAudienceCreateByFileV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanAudienceCreateByFileV10Request.advertiserId) &&
        Objects.equals(this.audienceGroup, qianchuanAudienceCreateByFileV10Request.audienceGroup) &&
        Objects.equals(this.audienceName, qianchuanAudienceCreateByFileV10Request.audienceName) &&
        Objects.equals(this.dataType, qianchuanAudienceCreateByFileV10Request.dataType) &&
        Objects.equals(this.fileKey, qianchuanAudienceCreateByFileV10Request.fileKey) &&
        Objects.equals(this.matchType, qianchuanAudienceCreateByFileV10Request.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audienceGroup, audienceName, dataType, fileKey, matchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAudienceCreateByFileV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceGroup: ").append(toIndentedString(audienceGroup)).append("\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
    openapiFields.add("audience_group");
    openapiFields.add("audience_name");
    openapiFields.add("data_type");
    openapiFields.add("file_key");
    openapiFields.add("match_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("audience_group");
    openapiRequiredFields.add("audience_name");
    openapiRequiredFields.add("data_type");
    openapiRequiredFields.add("file_key");
    openapiRequiredFields.add("match_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudienceCreateByFileV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudienceCreateByFileV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudienceCreateByFileV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudienceCreateByFileV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudienceCreateByFileV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAudienceCreateByFileV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudienceCreateByFileV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudienceCreateByFileV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudienceCreateByFileV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudienceCreateByFileV10Request
  */
  public static QianchuanAudienceCreateByFileV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudienceCreateByFileV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAudienceCreateByFileV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

