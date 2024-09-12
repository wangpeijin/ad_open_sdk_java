/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserQualificationCreateV2V2QualificationsAdQualificationType;
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
 * AdvertiserQualificationCreateV2V2RequestQualificationsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class AdvertiserQualificationCreateV2V2RequestQualificationsInner {
  public static final String SERIALIZED_NAME_AD_QUALIFICATION_TYPE = "ad_qualification_type";
  @SerializedName(SERIALIZED_NAME_AD_QUALIFICATION_TYPE)
  private AdvertiserQualificationCreateV2V2QualificationsAdQualificationType adQualificationType = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_IMG_ID = "qualification_img_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_IMG_ID)
  private Long qualificationImgId = null;

  public AdvertiserQualificationCreateV2V2RequestQualificationsInner() {
  }

  public AdvertiserQualificationCreateV2V2RequestQualificationsInner adQualificationType(AdvertiserQualificationCreateV2V2QualificationsAdQualificationType adQualificationType) {
    
    this.adQualificationType = adQualificationType;
    return this;
  }

   /**
   * Get adQualificationType
   * @return adQualificationType
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationCreateV2V2QualificationsAdQualificationType getAdQualificationType() {
    return adQualificationType;
  }


  public void setAdQualificationType(AdvertiserQualificationCreateV2V2QualificationsAdQualificationType adQualificationType) {
    this.adQualificationType = adQualificationType;
  }


  public AdvertiserQualificationCreateV2V2RequestQualificationsInner qualificationImgId(Long qualificationImgId) {
    
    this.qualificationImgId = qualificationImgId;
    return this;
  }

   /**
   * 
   * @return qualificationImgId
  **/
  @javax.annotation.Nullable
  public Long getQualificationImgId() {
    return qualificationImgId;
  }


  public void setQualificationImgId(Long qualificationImgId) {
    this.qualificationImgId = qualificationImgId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationCreateV2V2RequestQualificationsInner advertiserQualificationCreateV2V2RequestQualificationsInner = (AdvertiserQualificationCreateV2V2RequestQualificationsInner) o;
    return Objects.equals(this.adQualificationType, advertiserQualificationCreateV2V2RequestQualificationsInner.adQualificationType) &&
        Objects.equals(this.qualificationImgId, advertiserQualificationCreateV2V2RequestQualificationsInner.qualificationImgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adQualificationType, qualificationImgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserQualificationCreateV2V2RequestQualificationsInner {\n");
    sb.append("    adQualificationType: ").append(toIndentedString(adQualificationType)).append("\n");
    sb.append("    qualificationImgId: ").append(toIndentedString(qualificationImgId)).append("\n");
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
    openapiFields.add("ad_qualification_type");
    openapiFields.add("qualification_img_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationCreateV2V2RequestQualificationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationCreateV2V2RequestQualificationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationCreateV2V2RequestQualificationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationCreateV2V2RequestQualificationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationCreateV2V2RequestQualificationsInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationCreateV2V2RequestQualificationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationCreateV2V2RequestQualificationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationCreateV2V2RequestQualificationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationCreateV2V2RequestQualificationsInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationCreateV2V2RequestQualificationsInner
  */
  public static AdvertiserQualificationCreateV2V2RequestQualificationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationCreateV2V2RequestQualificationsInner.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationCreateV2V2RequestQualificationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

