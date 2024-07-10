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
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCardImageInfo;
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
 * 直播卡片
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard {
  public static final String SERIALIZED_NAME_ADVANCED_SUBTITLE = "advanced_subtitle";
  @SerializedName(SERIALIZED_NAME_ADVANCED_SUBTITLE)
  private String advancedSubtitle = null;

  public static final String SERIALIZED_NAME_ADVANCED_TITLE = "advanced_title";
  @SerializedName(SERIALIZED_NAME_ADVANCED_TITLE)
  private String advancedTitle = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCardImageInfo imageInfo = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard advancedSubtitle(String advancedSubtitle) {
    
    this.advancedSubtitle = advancedSubtitle;
    return this;
  }

   /**
   * 副标题
   * @return advancedSubtitle
  **/
  @javax.annotation.Nullable
  public String getAdvancedSubtitle() {
    return advancedSubtitle;
  }


  public void setAdvancedSubtitle(String advancedSubtitle) {
    this.advancedSubtitle = advancedSubtitle;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard advancedTitle(String advancedTitle) {
    
    this.advancedTitle = advancedTitle;
    return this;
  }

   /**
   * 标题
   * @return advancedTitle
  **/
  @javax.annotation.Nullable
  public String getAdvancedTitle() {
    return advancedTitle;
  }


  public void setAdvancedTitle(String advancedTitle) {
    this.advancedTitle = advancedTitle;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard imageInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCardImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCardImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCardImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard) o;
    return Objects.equals(this.advancedSubtitle, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.advancedSubtitle) &&
        Objects.equals(this.advancedTitle, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.advancedTitle) &&
        Objects.equals(this.imageInfo, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.imageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedSubtitle, advancedTitle, imageInfo);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard {\n");
    sb.append("    advancedSubtitle: ").append(toIndentedString(advancedSubtitle)).append("\n");
    sb.append("    advancedTitle: ").append(toIndentedString(advancedTitle)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
    openapiFields.add("advanced_subtitle");
    openapiFields.add("advanced_title");
    openapiFields.add("image_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

