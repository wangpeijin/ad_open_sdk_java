/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanTodayLiveRoomDetailGetV10DataRoomStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanTodayLiveRoomDetailGetV10ResponseData {
  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private List<String> awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ROOM_COVER = "room_cover";
  @SerializedName(SERIALIZED_NAME_ROOM_COVER)
  private List<String> roomCover = null;

  public static final String SERIALIZED_NAME_ROOM_DELIVERY = "room_delivery";
  @SerializedName(SERIALIZED_NAME_ROOM_DELIVERY)
  private Double roomDelivery = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_ROOM_STATUS = "room_status";
  @SerializedName(SERIALIZED_NAME_ROOM_STATUS)
  private QianchuanTodayLiveRoomDetailGetV10DataRoomStatus roomStatus = null;

  public static final String SERIALIZED_NAME_ROOM_TITLE = "room_title";
  @SerializedName(SERIALIZED_NAME_ROOM_TITLE)
  private String roomTitle = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public QianchuanTodayLiveRoomDetailGetV10ResponseData() {
  }

  public QianchuanTodayLiveRoomDetailGetV10ResponseData awemeAvatar(List<String> awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

  public QianchuanTodayLiveRoomDetailGetV10ResponseData addAwemeAvatarItem(String awemeAvatarItem) {
    if (this.awemeAvatar == null) {
      this.awemeAvatar = new ArrayList<>();
    }
    this.awemeAvatar.add(awemeAvatarItem);
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(List<String> awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData endTime(String endTime) {
    
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


  public QianchuanTodayLiveRoomDetailGetV10ResponseData roomCover(List<String> roomCover) {
    
    this.roomCover = roomCover;
    return this;
  }

  public QianchuanTodayLiveRoomDetailGetV10ResponseData addRoomCoverItem(String roomCoverItem) {
    if (this.roomCover == null) {
      this.roomCover = new ArrayList<>();
    }
    this.roomCover.add(roomCoverItem);
    return this;
  }

   /**
   * 
   * @return roomCover
  **/
  @javax.annotation.Nullable
  public List<String> getRoomCover() {
    return roomCover;
  }


  public void setRoomCover(List<String> roomCover) {
    this.roomCover = roomCover;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData roomDelivery(Double roomDelivery) {
    
    this.roomDelivery = roomDelivery;
    return this;
  }

   /**
   * 
   * @return roomDelivery
  **/
  @javax.annotation.Nullable
  public Double getRoomDelivery() {
    return roomDelivery;
  }


  public void setRoomDelivery(Double roomDelivery) {
    this.roomDelivery = roomDelivery;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData roomStatus(QianchuanTodayLiveRoomDetailGetV10DataRoomStatus roomStatus) {
    
    this.roomStatus = roomStatus;
    return this;
  }

   /**
   * Get roomStatus
   * @return roomStatus
  **/
  @javax.annotation.Nullable
  public QianchuanTodayLiveRoomDetailGetV10DataRoomStatus getRoomStatus() {
    return roomStatus;
  }


  public void setRoomStatus(QianchuanTodayLiveRoomDetailGetV10DataRoomStatus roomStatus) {
    this.roomStatus = roomStatus;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData roomTitle(String roomTitle) {
    
    this.roomTitle = roomTitle;
    return this;
  }

   /**
   * 
   * @return roomTitle
  **/
  @javax.annotation.Nullable
  public String getRoomTitle() {
    return roomTitle;
  }


  public void setRoomTitle(String roomTitle) {
    this.roomTitle = roomTitle;
  }


  public QianchuanTodayLiveRoomDetailGetV10ResponseData startTime(String startTime) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTodayLiveRoomDetailGetV10ResponseData qianchuanTodayLiveRoomDetailGetV10ResponseData = (QianchuanTodayLiveRoomDetailGetV10ResponseData) o;
    return Objects.equals(this.awemeAvatar, qianchuanTodayLiveRoomDetailGetV10ResponseData.awemeAvatar) &&
        Objects.equals(this.awemeId, qianchuanTodayLiveRoomDetailGetV10ResponseData.awemeId) &&
        Objects.equals(this.awemeName, qianchuanTodayLiveRoomDetailGetV10ResponseData.awemeName) &&
        Objects.equals(this.endTime, qianchuanTodayLiveRoomDetailGetV10ResponseData.endTime) &&
        Objects.equals(this.roomCover, qianchuanTodayLiveRoomDetailGetV10ResponseData.roomCover) &&
        Objects.equals(this.roomDelivery, qianchuanTodayLiveRoomDetailGetV10ResponseData.roomDelivery) &&
        Objects.equals(this.roomId, qianchuanTodayLiveRoomDetailGetV10ResponseData.roomId) &&
        Objects.equals(this.roomStatus, qianchuanTodayLiveRoomDetailGetV10ResponseData.roomStatus) &&
        Objects.equals(this.roomTitle, qianchuanTodayLiveRoomDetailGetV10ResponseData.roomTitle) &&
        Objects.equals(this.startTime, qianchuanTodayLiveRoomDetailGetV10ResponseData.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, awemeId, awemeName, endTime, roomCover, roomDelivery, roomId, roomStatus, roomTitle, startTime);
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
    sb.append("class QianchuanTodayLiveRoomDetailGetV10ResponseData {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    roomCover: ").append(toIndentedString(roomCover)).append("\n");
    sb.append("    roomDelivery: ").append(toIndentedString(roomDelivery)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomStatus: ").append(toIndentedString(roomStatus)).append("\n");
    sb.append("    roomTitle: ").append(toIndentedString(roomTitle)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("aweme_avatar");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("end_time");
    openapiFields.add("room_cover");
    openapiFields.add("room_delivery");
    openapiFields.add("room_id");
    openapiFields.add("room_status");
    openapiFields.add("room_title");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTodayLiveRoomDetailGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomDetailGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomDetailGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomDetailGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomDetailGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomDetailGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomDetailGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomDetailGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomDetailGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomDetailGetV10ResponseData
  */
  public static QianchuanTodayLiveRoomDetailGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomDetailGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomDetailGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

