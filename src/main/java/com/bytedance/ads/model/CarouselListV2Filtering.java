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
import com.bytedance.ads.model.CarouselListV2FilteringCarouselType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class CarouselListV2Filtering {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_IDS = "carousel_ids";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_IDS)
  private List<Long> carouselIds = null;

  public static final String SERIALIZED_NAME_CAROUSEL_TYPE = "carousel_type";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_TYPE)
  private List<CarouselListV2FilteringCarouselType> carouselType = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public CarouselListV2Filtering() {
  }

  public CarouselListV2Filtering audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public CarouselListV2Filtering carouselIds(List<Long> carouselIds) {
    
    this.carouselIds = carouselIds;
    return this;
  }

  public CarouselListV2Filtering addCarouselIdsItem(Long carouselIdsItem) {
    if (this.carouselIds == null) {
      this.carouselIds = new ArrayList<>();
    }
    this.carouselIds.add(carouselIdsItem);
    return this;
  }

   /**
   * 
   * @return carouselIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCarouselIds() {
    return carouselIds;
  }


  public void setCarouselIds(List<Long> carouselIds) {
    this.carouselIds = carouselIds;
  }


  public CarouselListV2Filtering carouselType(List<CarouselListV2FilteringCarouselType> carouselType) {
    
    this.carouselType = carouselType;
    return this;
  }

  public CarouselListV2Filtering addCarouselTypeItem(CarouselListV2FilteringCarouselType carouselTypeItem) {
    if (this.carouselType == null) {
      this.carouselType = new ArrayList<>();
    }
    this.carouselType.add(carouselTypeItem);
    return this;
  }

   /**
   * 
   * @return carouselType
  **/
  @javax.annotation.Nullable
  public List<CarouselListV2FilteringCarouselType> getCarouselType() {
    return carouselType;
  }


  public void setCarouselType(List<CarouselListV2FilteringCarouselType> carouselType) {
    this.carouselType = carouselType;
  }


  public CarouselListV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public CarouselListV2Filtering fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public CarouselListV2Filtering imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public CarouselListV2Filtering addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public CarouselListV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public CarouselListV2Filtering videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2Filtering carouselListV2Filtering = (CarouselListV2Filtering) o;
    return Objects.equals(this.audioId, carouselListV2Filtering.audioId) &&
        Objects.equals(this.carouselIds, carouselListV2Filtering.carouselIds) &&
        Objects.equals(this.carouselType, carouselListV2Filtering.carouselType) &&
        Objects.equals(this.endTime, carouselListV2Filtering.endTime) &&
        Objects.equals(this.fileName, carouselListV2Filtering.fileName) &&
        Objects.equals(this.imageIds, carouselListV2Filtering.imageIds) &&
        Objects.equals(this.startTime, carouselListV2Filtering.startTime) &&
        Objects.equals(this.videoId, carouselListV2Filtering.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, carouselIds, carouselType, endTime, fileName, imageIds, startTime, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselListV2Filtering {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    carouselIds: ").append(toIndentedString(carouselIds)).append("\n");
    sb.append("    carouselType: ").append(toIndentedString(carouselType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("audio_id");
    openapiFields.add("carousel_ids");
    openapiFields.add("carousel_type");
    openapiFields.add("end_time");
    openapiFields.add("file_name");
    openapiFields.add("image_ids");
    openapiFields.add("start_time");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2Filtering>() {
           @Override
           public void write(JsonWriter out, CarouselListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2Filtering
  */
  public static CarouselListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2Filtering.class);
  }

 /**
  * Convert an instance of CarouselListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

