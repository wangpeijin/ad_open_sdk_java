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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params = null;

  public static final String SERIALIZED_NAME_START_PATH = "start_path";
  @SerializedName(SERIALIZED_NAME_START_PATH)
  private String startPath = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * 
   * @return params
  **/
  @javax.annotation.Nullable
  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner startPath(String startPath) {
    
    this.startPath = startPath;
    return this;
  }

   /**
   * 
   * @return startPath
  **/
  @javax.annotation.Nullable
  public String getStartPath() {
    return startPath;
  }


  public void setStartPath(String startPath) {
    this.startPath = startPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner promotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner) o;
    return Objects.equals(this.appId, promotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.appId) &&
        Objects.equals(this.params, promotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.params) &&
        Objects.equals(this.startPath, promotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.startPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, params, startPath);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    startPath: ").append(toIndentedString(startPath)).append("\n");
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
    openapiFields.add("params");
    openapiFields.add("start_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfoAutoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

