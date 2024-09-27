/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeGetV30DataCreativesCreativeSplashCreativeSplashType;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashFullVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative {
  public static final String SERIALIZED_NAME_SPLASH_DYNAMIC_IMAGE = "splash_dynamic_image";
  @SerializedName(SERIALIZED_NAME_SPLASH_DYNAMIC_IMAGE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage splashDynamicImage = null;

  public static final String SERIALIZED_NAME_SPLASH_FULL_VIDEO = "splash_full_video";
  @SerializedName(SERIALIZED_NAME_SPLASH_FULL_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashFullVideo splashFullVideo = null;

  public static final String SERIALIZED_NAME_SPLASH_STATIC_IMAGE = "splash_static_image";
  @SerializedName(SERIALIZED_NAME_SPLASH_STATIC_IMAGE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage splashStaticImage = null;

  public static final String SERIALIZED_NAME_SPLASH_TYPE = "splash_type";
  @SerializedName(SERIALIZED_NAME_SPLASH_TYPE)
  private BrandCreativeGetV30DataCreativesCreativeSplashCreativeSplashType splashType = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashDynamicImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage splashDynamicImage) {
    
    this.splashDynamicImage = splashDynamicImage;
    return this;
  }

   /**
   * Get splashDynamicImage
   * @return splashDynamicImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage getSplashDynamicImage() {
    return splashDynamicImage;
  }


  public void setSplashDynamicImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage splashDynamicImage) {
    this.splashDynamicImage = splashDynamicImage;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashFullVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashFullVideo splashFullVideo) {
    
    this.splashFullVideo = splashFullVideo;
    return this;
  }

   /**
   * Get splashFullVideo
   * @return splashFullVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashFullVideo getSplashFullVideo() {
    return splashFullVideo;
  }


  public void setSplashFullVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashFullVideo splashFullVideo) {
    this.splashFullVideo = splashFullVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashStaticImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage splashStaticImage) {
    
    this.splashStaticImage = splashStaticImage;
    return this;
  }

   /**
   * Get splashStaticImage
   * @return splashStaticImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage getSplashStaticImage() {
    return splashStaticImage;
  }


  public void setSplashStaticImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage splashStaticImage) {
    this.splashStaticImage = splashStaticImage;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashType(BrandCreativeGetV30DataCreativesCreativeSplashCreativeSplashType splashType) {
    
    this.splashType = splashType;
    return this;
  }

   /**
   * Get splashType
   * @return splashType
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30DataCreativesCreativeSplashCreativeSplashType getSplashType() {
    return splashType;
  }


  public void setSplashType(BrandCreativeGetV30DataCreativesCreativeSplashCreativeSplashType splashType) {
    this.splashType = splashType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative) o;
    return Objects.equals(this.splashDynamicImage, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.splashDynamicImage) &&
        Objects.equals(this.splashFullVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.splashFullVideo) &&
        Objects.equals(this.splashStaticImage, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.splashStaticImage) &&
        Objects.equals(this.splashType, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.splashType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(splashDynamicImage, splashFullVideo, splashStaticImage, splashType);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative {\n");
    sb.append("    splashDynamicImage: ").append(toIndentedString(splashDynamicImage)).append("\n");
    sb.append("    splashFullVideo: ").append(toIndentedString(splashFullVideo)).append("\n");
    sb.append("    splashStaticImage: ").append(toIndentedString(splashStaticImage)).append("\n");
    sb.append("    splashType: ").append(toIndentedString(splashType)).append("\n");
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
    openapiFields.add("splash_dynamic_image");
    openapiFields.add("splash_full_video");
    openapiFields.add("splash_static_image");
    openapiFields.add("splash_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

