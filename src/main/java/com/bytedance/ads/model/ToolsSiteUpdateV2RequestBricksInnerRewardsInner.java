/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * ToolsSiteUpdateV2RequestBricksInnerRewardsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ToolsSiteUpdateV2RequestBricksInnerRewardsInner {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image = null;

  public static final String SERIALIZED_NAME_POPUP_TEXT = "popup_text";
  @SerializedName(SERIALIZED_NAME_POPUP_TEXT)
  private String popupText = null;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public ToolsSiteUpdateV2RequestBricksInnerRewardsInner() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerRewardsInner image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * 奖品图片
   * @return image
  **/
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public ToolsSiteUpdateV2RequestBricksInnerRewardsInner popupText(String popupText) {
    
    this.popupText = popupText;
    return this;
  }

   /**
   * 中奖页奖品名称
   * @return popupText
  **/
  @javax.annotation.Nullable
  public String getPopupText() {
    return popupText;
  }


  public void setPopupText(String popupText) {
    this.popupText = popupText;
  }


  public ToolsSiteUpdateV2RequestBricksInnerRewardsInner rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 中奖概率,所有奖品中奖概率和为100 
   * @return rate
  **/
  @javax.annotation.Nullable
  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public ToolsSiteUpdateV2RequestBricksInnerRewardsInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 奖品名称
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerRewardsInner toolsSiteUpdateV2RequestBricksInnerRewardsInner = (ToolsSiteUpdateV2RequestBricksInnerRewardsInner) o;
    return Objects.equals(this.image, toolsSiteUpdateV2RequestBricksInnerRewardsInner.image) &&
        Objects.equals(this.popupText, toolsSiteUpdateV2RequestBricksInnerRewardsInner.popupText) &&
        Objects.equals(this.rate, toolsSiteUpdateV2RequestBricksInnerRewardsInner.rate) &&
        Objects.equals(this.text, toolsSiteUpdateV2RequestBricksInnerRewardsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, popupText, rate, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerRewardsInner {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    popupText: ").append(toIndentedString(popupText)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("popup_text");
    openapiFields.add("rate");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerRewardsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerRewardsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerRewardsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerRewardsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerRewardsInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerRewardsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerRewardsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerRewardsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerRewardsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerRewardsInner
  */
  public static ToolsSiteUpdateV2RequestBricksInnerRewardsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerRewardsInner.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerRewardsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

