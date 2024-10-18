/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * 小程序信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo() {
  }

  public StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 小程序id
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo starMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo = (StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo) o;
    return Objects.equals(this.appId, starMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo.appId) &&
        Objects.equals(this.appName, starMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo.appName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName);
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
    sb.append("class StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo
  */
  public static StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetTaskDetailV2ResponseDataTaskDetailInfoSmallAppInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

