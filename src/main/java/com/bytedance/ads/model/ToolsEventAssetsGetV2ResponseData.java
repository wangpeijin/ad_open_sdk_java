/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsEventAssetsGetV2ResponseDataAppInner;
import com.bytedance.ads.model.ToolsEventAssetsGetV2ResponseDataLandingPagesInner;
import com.bytedance.ads.model.ToolsEventAssetsGetV2ResponseDataMiniProgramInner;
import com.bytedance.ads.model.ToolsEventAssetsGetV2ResponseDataPageInfo;
import com.bytedance.ads.model.ToolsEventAssetsGetV2ResponseDataQuickAppInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsEventAssetsGetV2ResponseData {
  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private List<ToolsEventAssetsGetV2ResponseDataAppInner> app = null;

  public static final String SERIALIZED_NAME_LANDING_PAGES = "landing_pages";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGES)
  private List<ToolsEventAssetsGetV2ResponseDataLandingPagesInner> landingPages = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM = "mini_program";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM)
  private List<ToolsEventAssetsGetV2ResponseDataMiniProgramInner> miniProgram = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsEventAssetsGetV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_QUICK_APP = "quick_app";
  @SerializedName(SERIALIZED_NAME_QUICK_APP)
  private List<ToolsEventAssetsGetV2ResponseDataQuickAppInner> quickApp = null;

  public ToolsEventAssetsGetV2ResponseData() {
  }

  public ToolsEventAssetsGetV2ResponseData app(List<ToolsEventAssetsGetV2ResponseDataAppInner> app) {
    
    this.app = app;
    return this;
  }

  public ToolsEventAssetsGetV2ResponseData addAppItem(ToolsEventAssetsGetV2ResponseDataAppInner appItem) {
    if (this.app == null) {
      this.app = new ArrayList<>();
    }
    this.app.add(appItem);
    return this;
  }

   /**
   * 应用数据
   * @return app
  **/
  @javax.annotation.Nullable
  public List<ToolsEventAssetsGetV2ResponseDataAppInner> getApp() {
    return app;
  }


  public void setApp(List<ToolsEventAssetsGetV2ResponseDataAppInner> app) {
    this.app = app;
  }


  public ToolsEventAssetsGetV2ResponseData landingPages(List<ToolsEventAssetsGetV2ResponseDataLandingPagesInner> landingPages) {
    
    this.landingPages = landingPages;
    return this;
  }

  public ToolsEventAssetsGetV2ResponseData addLandingPagesItem(ToolsEventAssetsGetV2ResponseDataLandingPagesInner landingPagesItem) {
    if (this.landingPages == null) {
      this.landingPages = new ArrayList<>();
    }
    this.landingPages.add(landingPagesItem);
    return this;
  }

   /**
   * 三方数据集合
   * @return landingPages
  **/
  @javax.annotation.Nullable
  public List<ToolsEventAssetsGetV2ResponseDataLandingPagesInner> getLandingPages() {
    return landingPages;
  }


  public void setLandingPages(List<ToolsEventAssetsGetV2ResponseDataLandingPagesInner> landingPages) {
    this.landingPages = landingPages;
  }


  public ToolsEventAssetsGetV2ResponseData miniProgram(List<ToolsEventAssetsGetV2ResponseDataMiniProgramInner> miniProgram) {
    
    this.miniProgram = miniProgram;
    return this;
  }

  public ToolsEventAssetsGetV2ResponseData addMiniProgramItem(ToolsEventAssetsGetV2ResponseDataMiniProgramInner miniProgramItem) {
    if (this.miniProgram == null) {
      this.miniProgram = new ArrayList<>();
    }
    this.miniProgram.add(miniProgramItem);
    return this;
  }

   /**
   * 字节小程序快应用资产
   * @return miniProgram
  **/
  @javax.annotation.Nullable
  public List<ToolsEventAssetsGetV2ResponseDataMiniProgramInner> getMiniProgram() {
    return miniProgram;
  }


  public void setMiniProgram(List<ToolsEventAssetsGetV2ResponseDataMiniProgramInner> miniProgram) {
    this.miniProgram = miniProgram;
  }


  public ToolsEventAssetsGetV2ResponseData pageInfo(ToolsEventAssetsGetV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsEventAssetsGetV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ToolsEventAssetsGetV2ResponseData quickApp(List<ToolsEventAssetsGetV2ResponseDataQuickAppInner> quickApp) {
    
    this.quickApp = quickApp;
    return this;
  }

  public ToolsEventAssetsGetV2ResponseData addQuickAppItem(ToolsEventAssetsGetV2ResponseDataQuickAppInner quickAppItem) {
    if (this.quickApp == null) {
      this.quickApp = new ArrayList<>();
    }
    this.quickApp.add(quickAppItem);
    return this;
  }

   /**
   * 快应用数据
   * @return quickApp
  **/
  @javax.annotation.Nullable
  public List<ToolsEventAssetsGetV2ResponseDataQuickAppInner> getQuickApp() {
    return quickApp;
  }


  public void setQuickApp(List<ToolsEventAssetsGetV2ResponseDataQuickAppInner> quickApp) {
    this.quickApp = quickApp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2ResponseData toolsEventAssetsGetV2ResponseData = (ToolsEventAssetsGetV2ResponseData) o;
    return Objects.equals(this.app, toolsEventAssetsGetV2ResponseData.app) &&
        Objects.equals(this.landingPages, toolsEventAssetsGetV2ResponseData.landingPages) &&
        Objects.equals(this.miniProgram, toolsEventAssetsGetV2ResponseData.miniProgram) &&
        Objects.equals(this.pageInfo, toolsEventAssetsGetV2ResponseData.pageInfo) &&
        Objects.equals(this.quickApp, toolsEventAssetsGetV2ResponseData.quickApp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, landingPages, miniProgram, pageInfo, quickApp);
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
    sb.append("class ToolsEventAssetsGetV2ResponseData {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
    sb.append("    miniProgram: ").append(toIndentedString(miniProgram)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    quickApp: ").append(toIndentedString(quickApp)).append("\n");
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
    openapiFields.add("app");
    openapiFields.add("landing_pages");
    openapiFields.add("mini_program");
    openapiFields.add("page_info");
    openapiFields.add("quick_app");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2ResponseData
  */
  public static ToolsEventAssetsGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

