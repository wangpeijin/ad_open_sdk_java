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
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner;
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
 * 开屏静态图信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage {
  public static final String SERIALIZED_NAME_IMAGE_INFO_BK_LIST = "image_info_bk_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_BK_LIST)
  private List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner> imageInfoBkList = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage imageInfoBkList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner> imageInfoBkList) {
    
    this.imageInfoBkList = imageInfoBkList;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage addImageInfoBkListItem(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner imageInfoBkListItem) {
    if (this.imageInfoBkList == null) {
      this.imageInfoBkList = new ArrayList<>();
    }
    this.imageInfoBkList.add(imageInfoBkListItem);
    return this;
  }

   /**
   * 背景图片列表
   * @return imageInfoBkList
  **/
  @javax.annotation.Nullable
  public List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner> getImageInfoBkList() {
    return imageInfoBkList;
  }


  public void setImageInfoBkList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImageImageInfoBkListInner> imageInfoBkList) {
    this.imageInfoBkList = imageInfoBkList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage) o;
    return Objects.equals(this.imageInfoBkList, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage.imageInfoBkList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfoBkList);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage {\n");
    sb.append("    imageInfoBkList: ").append(toIndentedString(imageInfoBkList)).append("\n");
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
    openapiFields.add("image_info_bk_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashStaticImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

