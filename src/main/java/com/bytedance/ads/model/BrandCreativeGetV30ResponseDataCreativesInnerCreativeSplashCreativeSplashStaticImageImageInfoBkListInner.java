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
 * BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_WEB_URI = "web_uri";
  @SerializedName(SERIALIZED_NAME_WEB_URI)
  private String webUri = null;

  public static final String SERIALIZED_NAME_WEB_URI_SHOW_URL = "web_uri_show_url";
  @SerializedName(SERIALIZED_NAME_WEB_URI_SHOW_URL)
  private String webUriShowUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * 图片格式:jpg/jpeg/png/gif
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 图片高度
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner webUri(String webUri) {
    
    this.webUri = webUri;
    return this;
  }

   /**
   * 图片地址
   * @return webUri
  **/
  @javax.annotation.Nullable
  public String getWebUri() {
    return webUri;
  }


  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner webUriShowUrl(String webUriShowUrl) {
    
    this.webUriShowUrl = webUriShowUrl;
    return this;
  }

   /**
   * 图片前端展示地址
   * @return webUriShowUrl
  **/
  @javax.annotation.Nullable
  public String getWebUriShowUrl() {
    return webUriShowUrl;
  }


  public void setWebUriShowUrl(String webUriShowUrl) {
    this.webUriShowUrl = webUriShowUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 图片宽度
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner) o;
    return Objects.equals(this.format, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.format) &&
        Objects.equals(this.height, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.height) &&
        Objects.equals(this.webUri, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.webUri) &&
        Objects.equals(this.webUriShowUrl, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.webUriShowUrl) &&
        Objects.equals(this.width, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, height, webUri, webUriShowUrl, width);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
    sb.append("    webUriShowUrl: ").append(toIndentedString(webUriShowUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("height");
    openapiFields.add("web_uri");
    openapiFields.add("web_uri_show_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

