/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class AudiencePackageCreateV2ResponseData {
  public static final String SERIALIZED_NAME_AUDIENCE_PACKAGE_ID = "audience_package_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_PACKAGE_ID)
  private Long audiencePackageId = null;

  public AudiencePackageCreateV2ResponseData() {
  }

  public AudiencePackageCreateV2ResponseData audiencePackageId(Long audiencePackageId) {
    
    this.audiencePackageId = audiencePackageId;
    return this;
  }

   /**
   * 
   * @return audiencePackageId
  **/
  @javax.annotation.Nullable
  public Long getAudiencePackageId() {
    return audiencePackageId;
  }


  public void setAudiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageCreateV2ResponseData audiencePackageCreateV2ResponseData = (AudiencePackageCreateV2ResponseData) o;
    return Objects.equals(this.audiencePackageId, audiencePackageCreateV2ResponseData.audiencePackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiencePackageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiencePackageCreateV2ResponseData {\n");
    sb.append("    audiencePackageId: ").append(toIndentedString(audiencePackageId)).append("\n");
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
    openapiFields.add("audience_package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AudiencePackageCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageCreateV2ResponseData
  */
  public static AudiencePackageCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of AudiencePackageCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

