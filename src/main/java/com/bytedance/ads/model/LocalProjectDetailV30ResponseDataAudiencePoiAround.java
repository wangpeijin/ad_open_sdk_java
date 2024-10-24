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
import com.bytedance.ads.model.LocalProjectDetailV30DataAudiencePoiAroundPoiAroundRadius;
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
 * 门店附近定向设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class LocalProjectDetailV30ResponseDataAudiencePoiAround {
  public static final String SERIALIZED_NAME_POI_AROUND_IDS = "poi_around_ids";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_IDS)
  private List<Long> poiAroundIds = null;

  public static final String SERIALIZED_NAME_POI_AROUND_RADIUS = "poi_around_radius";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_RADIUS)
  private LocalProjectDetailV30DataAudiencePoiAroundPoiAroundRadius poiAroundRadius = null;

  public LocalProjectDetailV30ResponseDataAudiencePoiAround() {
  }

  public LocalProjectDetailV30ResponseDataAudiencePoiAround poiAroundIds(List<Long> poiAroundIds) {
    
    this.poiAroundIds = poiAroundIds;
    return this;
  }

  public LocalProjectDetailV30ResponseDataAudiencePoiAround addPoiAroundIdsItem(Long poiAroundIdsItem) {
    if (this.poiAroundIds == null) {
      this.poiAroundIds = new ArrayList<>();
    }
    this.poiAroundIds.add(poiAroundIdsItem);
    return this;
  }

   /**
   * 定向门店ids
   * @return poiAroundIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPoiAroundIds() {
    return poiAroundIds;
  }


  public void setPoiAroundIds(List<Long> poiAroundIds) {
    this.poiAroundIds = poiAroundIds;
  }


  public LocalProjectDetailV30ResponseDataAudiencePoiAround poiAroundRadius(LocalProjectDetailV30DataAudiencePoiAroundPoiAroundRadius poiAroundRadius) {
    
    this.poiAroundRadius = poiAroundRadius;
    return this;
  }

   /**
   * Get poiAroundRadius
   * @return poiAroundRadius
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30DataAudiencePoiAroundPoiAroundRadius getPoiAroundRadius() {
    return poiAroundRadius;
  }


  public void setPoiAroundRadius(LocalProjectDetailV30DataAudiencePoiAroundPoiAroundRadius poiAroundRadius) {
    this.poiAroundRadius = poiAroundRadius;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectDetailV30ResponseDataAudiencePoiAround localProjectDetailV30ResponseDataAudiencePoiAround = (LocalProjectDetailV30ResponseDataAudiencePoiAround) o;
    return Objects.equals(this.poiAroundIds, localProjectDetailV30ResponseDataAudiencePoiAround.poiAroundIds) &&
        Objects.equals(this.poiAroundRadius, localProjectDetailV30ResponseDataAudiencePoiAround.poiAroundRadius);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiAroundIds, poiAroundRadius);
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
    sb.append("class LocalProjectDetailV30ResponseDataAudiencePoiAround {\n");
    sb.append("    poiAroundIds: ").append(toIndentedString(poiAroundIds)).append("\n");
    sb.append("    poiAroundRadius: ").append(toIndentedString(poiAroundRadius)).append("\n");
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
    openapiFields.add("poi_around_ids");
    openapiFields.add("poi_around_radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectDetailV30ResponseDataAudiencePoiAround.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectDetailV30ResponseDataAudiencePoiAround' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectDetailV30ResponseDataAudiencePoiAround> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectDetailV30ResponseDataAudiencePoiAround.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectDetailV30ResponseDataAudiencePoiAround>() {
           @Override
           public void write(JsonWriter out, LocalProjectDetailV30ResponseDataAudiencePoiAround value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectDetailV30ResponseDataAudiencePoiAround read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectDetailV30ResponseDataAudiencePoiAround given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectDetailV30ResponseDataAudiencePoiAround
  * @throws IOException if the JSON string is invalid with respect to LocalProjectDetailV30ResponseDataAudiencePoiAround
  */
  public static LocalProjectDetailV30ResponseDataAudiencePoiAround fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectDetailV30ResponseDataAudiencePoiAround.class);
  }

 /**
  * Convert an instance of LocalProjectDetailV30ResponseDataAudiencePoiAround to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

