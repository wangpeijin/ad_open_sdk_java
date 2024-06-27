/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * ToolsSiteUpdateV2RequestBricksInnerGroupContentInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsSiteUpdateV2RequestBricksInnerGroupContentInner {
  public static final String SERIALIZED_NAME_IC_ID = "ic_id";
  @SerializedName(SERIALIZED_NAME_IC_ID)
  private String icId = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag = null;

  public ToolsSiteUpdateV2RequestBricksInnerGroupContentInner() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerGroupContentInner icId(String icId) {
    
    this.icId = icId;
    return this;
  }

   /**
   * 
   * @return icId
  **/
  @javax.annotation.Nullable
  public String getIcId() {
    return icId;
  }


  public void setIcId(String icId) {
    this.icId = icId;
  }


  public ToolsSiteUpdateV2RequestBricksInnerGroupContentInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public ToolsSiteUpdateV2RequestBricksInnerGroupContentInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerGroupContentInner toolsSiteUpdateV2RequestBricksInnerGroupContentInner = (ToolsSiteUpdateV2RequestBricksInnerGroupContentInner) o;
    return Objects.equals(this.icId, toolsSiteUpdateV2RequestBricksInnerGroupContentInner.icId) &&
        Objects.equals(this.imageUrl, toolsSiteUpdateV2RequestBricksInnerGroupContentInner.imageUrl) &&
        Objects.equals(this.tag, toolsSiteUpdateV2RequestBricksInnerGroupContentInner.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icId, imageUrl, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerGroupContentInner {\n");
    sb.append("    icId: ").append(toIndentedString(icId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("ic_id");
    openapiFields.add("image_url");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerGroupContentInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerGroupContentInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerGroupContentInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerGroupContentInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerGroupContentInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerGroupContentInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerGroupContentInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerGroupContentInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerGroupContentInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerGroupContentInner
  */
  public static ToolsSiteUpdateV2RequestBricksInnerGroupContentInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerGroupContentInner.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerGroupContentInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

