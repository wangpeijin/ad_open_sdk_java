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
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2FilteringAdStatus;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2FilteringOrientation;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsPlayableCloudGameListV2Filtering {
  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private List<ToolsPlayableCloudGameListV2FilteringAdStatus> adStatus = null;

  public static final String SERIALIZED_NAME_GAME_IDS = "game_ids";
  @SerializedName(SERIALIZED_NAME_GAME_IDS)
  private List<String> gameIds = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private List<ToolsPlayableCloudGameListV2FilteringOrientation> orientation = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<ToolsPlayableCloudGameListV2FilteringStatus> status = null;

  public ToolsPlayableCloudGameListV2Filtering() {
  }

  public ToolsPlayableCloudGameListV2Filtering adStatus(List<ToolsPlayableCloudGameListV2FilteringAdStatus> adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

  public ToolsPlayableCloudGameListV2Filtering addAdStatusItem(ToolsPlayableCloudGameListV2FilteringAdStatus adStatusItem) {
    if (this.adStatus == null) {
      this.adStatus = new ArrayList<>();
    }
    this.adStatus.add(adStatusItem);
    return this;
  }

   /**
   * 
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public List<ToolsPlayableCloudGameListV2FilteringAdStatus> getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(List<ToolsPlayableCloudGameListV2FilteringAdStatus> adStatus) {
    this.adStatus = adStatus;
  }


  public ToolsPlayableCloudGameListV2Filtering gameIds(List<String> gameIds) {
    
    this.gameIds = gameIds;
    return this;
  }

  public ToolsPlayableCloudGameListV2Filtering addGameIdsItem(String gameIdsItem) {
    if (this.gameIds == null) {
      this.gameIds = new ArrayList<>();
    }
    this.gameIds.add(gameIdsItem);
    return this;
  }

   /**
   * 
   * @return gameIds
  **/
  @javax.annotation.Nullable
  public List<String> getGameIds() {
    return gameIds;
  }


  public void setGameIds(List<String> gameIds) {
    this.gameIds = gameIds;
  }


  public ToolsPlayableCloudGameListV2Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public ToolsPlayableCloudGameListV2Filtering addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public ToolsPlayableCloudGameListV2Filtering name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsPlayableCloudGameListV2Filtering orientation(List<ToolsPlayableCloudGameListV2FilteringOrientation> orientation) {
    
    this.orientation = orientation;
    return this;
  }

  public ToolsPlayableCloudGameListV2Filtering addOrientationItem(ToolsPlayableCloudGameListV2FilteringOrientation orientationItem) {
    if (this.orientation == null) {
      this.orientation = new ArrayList<>();
    }
    this.orientation.add(orientationItem);
    return this;
  }

   /**
   * 
   * @return orientation
  **/
  @javax.annotation.Nullable
  public List<ToolsPlayableCloudGameListV2FilteringOrientation> getOrientation() {
    return orientation;
  }


  public void setOrientation(List<ToolsPlayableCloudGameListV2FilteringOrientation> orientation) {
    this.orientation = orientation;
  }


  public ToolsPlayableCloudGameListV2Filtering status(List<ToolsPlayableCloudGameListV2FilteringStatus> status) {
    
    this.status = status;
    return this;
  }

  public ToolsPlayableCloudGameListV2Filtering addStatusItem(ToolsPlayableCloudGameListV2FilteringStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public List<ToolsPlayableCloudGameListV2FilteringStatus> getStatus() {
    return status;
  }


  public void setStatus(List<ToolsPlayableCloudGameListV2FilteringStatus> status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableCloudGameListV2Filtering toolsPlayableCloudGameListV2Filtering = (ToolsPlayableCloudGameListV2Filtering) o;
    return Objects.equals(this.adStatus, toolsPlayableCloudGameListV2Filtering.adStatus) &&
        Objects.equals(this.gameIds, toolsPlayableCloudGameListV2Filtering.gameIds) &&
        Objects.equals(this.ids, toolsPlayableCloudGameListV2Filtering.ids) &&
        Objects.equals(this.name, toolsPlayableCloudGameListV2Filtering.name) &&
        Objects.equals(this.orientation, toolsPlayableCloudGameListV2Filtering.orientation) &&
        Objects.equals(this.status, toolsPlayableCloudGameListV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStatus, gameIds, ids, name, orientation, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableCloudGameListV2Filtering {\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    gameIds: ").append(toIndentedString(gameIds)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ad_status");
    openapiFields.add("game_ids");
    openapiFields.add("ids");
    openapiFields.add("name");
    openapiFields.add("orientation");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableCloudGameListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableCloudGameListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableCloudGameListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableCloudGameListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableCloudGameListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableCloudGameListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableCloudGameListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableCloudGameListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableCloudGameListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableCloudGameListV2Filtering
  */
  public static ToolsPlayableCloudGameListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableCloudGameListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsPlayableCloudGameListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

