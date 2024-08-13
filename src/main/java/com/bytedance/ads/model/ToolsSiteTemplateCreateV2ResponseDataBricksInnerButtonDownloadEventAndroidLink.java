/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2DataBricksButtonDownloadEventAndroidLinkLinkType;
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
 * android链接信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private ToolsSiteTemplateCreateV2DataBricksButtonDownloadEventAndroidLinkLinkType linkType = null;

  public static final String SERIALIZED_NAME_QUICK_APP = "quick_app";
  @SerializedName(SERIALIZED_NAME_QUICK_APP)
  private String quickApp = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 应用描述，为了展示效果，推荐12个中文字符长度
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink linkType(ToolsSiteTemplateCreateV2DataBricksButtonDownloadEventAndroidLinkLinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2DataBricksButtonDownloadEventAndroidLinkLinkType getLinkType() {
    return linkType;
  }


  public void setLinkType(ToolsSiteTemplateCreateV2DataBricksButtonDownloadEventAndroidLinkLinkType linkType) {
    this.linkType = linkType;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink quickApp(String quickApp) {
    
    this.quickApp = quickApp;
    return this;
  }

   /**
   * 快应用地址，当&#x60;link_type&#x60;等于&#x60;QUICK_APP&#x60;时，有值
   * @return quickApp
  **/
  @javax.annotation.Nullable
  public String getQuickApp() {
    return quickApp;
  }


  public void setQuickApp(String quickApp) {
    this.quickApp = quickApp;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 下载地址，当&#x60;link_type&#x60;等于&#x60;URL&#x60;时，有值
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink) o;
    return Objects.equals(this.description, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.description) &&
        Objects.equals(this.linkType, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.linkType) &&
        Objects.equals(this.quickApp, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.quickApp) &&
        Objects.equals(this.url, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, linkType, quickApp, url);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    quickApp: ").append(toIndentedString(quickApp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("link_type");
    openapiFields.add("quick_app");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

