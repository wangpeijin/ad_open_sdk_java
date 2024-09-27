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
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorAndroidLink;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorIosLink;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorLink;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorSmartPhone;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior {
  public static final String SERIALIZED_NAME_ANDROID_LINK = "android_link";
  @SerializedName(SERIALIZED_NAME_ANDROID_LINK)
  private ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorAndroidLink androidLink = null;

  public static final String SERIALIZED_NAME_IOS_LINK = "ios_link";
  @SerializedName(SERIALIZED_NAME_IOS_LINK)
  private ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorIosLink iosLink = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorLink link = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SMART_PHONE = "smart_phone";
  @SerializedName(SERIALIZED_NAME_SMART_PHONE)
  private ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorSmartPhone smartPhone = null;

  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior androidLink(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorAndroidLink androidLink) {
    
    this.androidLink = androidLink;
    return this;
  }

   /**
   * Get androidLink
   * @return androidLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorAndroidLink getAndroidLink() {
    return androidLink;
  }


  public void setAndroidLink(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorAndroidLink androidLink) {
    this.androidLink = androidLink;
  }


  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior iosLink(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorIosLink iosLink) {
    
    this.iosLink = iosLink;
    return this;
  }

   /**
   * Get iosLink
   * @return iosLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorIosLink getIosLink() {
    return iosLink;
  }


  public void setIosLink(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorIosLink iosLink) {
    this.iosLink = iosLink;
  }


  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior link(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorLink getLink() {
    return link;
  }


  public void setLink(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorLink link) {
    this.link = link;
  }


  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior smartPhone(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorSmartPhone smartPhone) {
    
    this.smartPhone = smartPhone;
    return this;
  }

   /**
   * Get smartPhone
   * @return smartPhone
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorSmartPhone getSmartPhone() {
    return smartPhone;
  }


  public void setSmartPhone(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehaviorSmartPhone smartPhone) {
    this.smartPhone = smartPhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior = (ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior) o;
    return Objects.equals(this.androidLink, toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.androidLink) &&
        Objects.equals(this.iosLink, toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.iosLink) &&
        Objects.equals(this.link, toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.link) &&
        Objects.equals(this.name, toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.name) &&
        Objects.equals(this.smartPhone, toolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.smartPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidLink, iosLink, link, name, smartPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior {\n");
    sb.append("    androidLink: ").append(toIndentedString(androidLink)).append("\n");
    sb.append("    iosLink: ").append(toIndentedString(iosLink)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smartPhone: ").append(toIndentedString(smartPhone)).append("\n");
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
    openapiFields.add("android_link");
    openapiFields.add("ios_link");
    openapiFields.add("link");
    openapiFields.add("name");
    openapiFields.add("smart_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior
  */
  public static ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerEventsInnerBehavior to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

