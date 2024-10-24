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
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeAfterImage;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeImage;
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
 * 探索一下组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent {
  public static final String SERIALIZED_NAME_ADVANCED_DURATION = "advanced_duration";
  @SerializedName(SERIALIZED_NAME_ADVANCED_DURATION)
  private Long advancedDuration = null;

  public static final String SERIALIZED_NAME_WIPE_AFTER_IMAGE = "wipe_after_image";
  @SerializedName(SERIALIZED_NAME_WIPE_AFTER_IMAGE)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeAfterImage wipeAfterImage = null;

  public static final String SERIALIZED_NAME_WIPE_BEFORE_IMAGE = "wipe_before_image";
  @SerializedName(SERIALIZED_NAME_WIPE_BEFORE_IMAGE)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage wipeBeforeImage = null;

  public static final String SERIALIZED_NAME_WIPE_IMAGE = "wipe_image";
  @SerializedName(SERIALIZED_NAME_WIPE_IMAGE)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeImage wipeImage = null;

  public static final String SERIALIZED_NAME_WIPE_TEXT = "wipe_text";
  @SerializedName(SERIALIZED_NAME_WIPE_TEXT)
  private String wipeText = null;

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent() {
  }

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent advancedDuration(Long advancedDuration) {
    
    this.advancedDuration = advancedDuration;
    return this;
  }

   /**
   * 组件弹出时间
   * @return advancedDuration
  **/
  @javax.annotation.Nullable
  public Long getAdvancedDuration() {
    return advancedDuration;
  }


  public void setAdvancedDuration(Long advancedDuration) {
    this.advancedDuration = advancedDuration;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent wipeAfterImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeAfterImage wipeAfterImage) {
    
    this.wipeAfterImage = wipeAfterImage;
    return this;
  }

   /**
   * Get wipeAfterImage
   * @return wipeAfterImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeAfterImage getWipeAfterImage() {
    return wipeAfterImage;
  }


  public void setWipeAfterImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeAfterImage wipeAfterImage) {
    this.wipeAfterImage = wipeAfterImage;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent wipeBeforeImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage wipeBeforeImage) {
    
    this.wipeBeforeImage = wipeBeforeImage;
    return this;
  }

   /**
   * Get wipeBeforeImage
   * @return wipeBeforeImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage getWipeBeforeImage() {
    return wipeBeforeImage;
  }


  public void setWipeBeforeImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage wipeBeforeImage) {
    this.wipeBeforeImage = wipeBeforeImage;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent wipeImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeImage wipeImage) {
    
    this.wipeImage = wipeImage;
    return this;
  }

   /**
   * Get wipeImage
   * @return wipeImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeImage getWipeImage() {
    return wipeImage;
  }


  public void setWipeImage(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponentWipeImage wipeImage) {
    this.wipeImage = wipeImage;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent wipeText(String wipeText) {
    
    this.wipeText = wipeText;
    return this;
  }

   /**
   * 擦一擦文案
   * @return wipeText
  **/
  @javax.annotation.Nullable
  public String getWipeText() {
    return wipeText;
  }


  public void setWipeText(String wipeText) {
    this.wipeText = wipeText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent = (BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent) o;
    return Objects.equals(this.advancedDuration, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.advancedDuration) &&
        Objects.equals(this.wipeAfterImage, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.wipeAfterImage) &&
        Objects.equals(this.wipeBeforeImage, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.wipeBeforeImage) &&
        Objects.equals(this.wipeImage, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.wipeImage) &&
        Objects.equals(this.wipeText, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.wipeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedDuration, wipeAfterImage, wipeBeforeImage, wipeImage, wipeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent {\n");
    sb.append("    advancedDuration: ").append(toIndentedString(advancedDuration)).append("\n");
    sb.append("    wipeAfterImage: ").append(toIndentedString(wipeAfterImage)).append("\n");
    sb.append("    wipeBeforeImage: ").append(toIndentedString(wipeBeforeImage)).append("\n");
    sb.append("    wipeImage: ").append(toIndentedString(wipeImage)).append("\n");
    sb.append("    wipeText: ").append(toIndentedString(wipeText)).append("\n");
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
    openapiFields.add("advanced_duration");
    openapiFields.add("wipe_after_image");
    openapiFields.add("wipe_before_image");
    openapiFields.add("wipe_image");
    openapiFields.add("wipe_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent
  */
  public static BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

