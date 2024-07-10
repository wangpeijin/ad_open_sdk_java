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
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2CreativeDecorationMaterialImageMode;
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
public class CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeProceduralCreativeUpdateV2CreativeDecorationMaterialImageMode imageMode = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial imageMode(CreativeProceduralCreativeUpdateV2CreativeDecorationMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2CreativeDecorationMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeProceduralCreativeUpdateV2CreativeDecorationMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial creativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial = (CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial) o;
    return Objects.equals(this.activityId, creativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial.activityId) &&
        Objects.equals(this.imageMode, creativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial.imageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, imageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("image_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeDecorationMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

