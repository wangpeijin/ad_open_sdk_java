/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * ToolsGrayGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsGrayGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_GRAY_KEY = "gray_key";
  @SerializedName(SERIALIZED_NAME_GRAY_KEY)
  private String grayKey = null;

  public static final String SERIALIZED_NAME_IN_WHITELIST = "in_whitelist";
  @SerializedName(SERIALIZED_NAME_IN_WHITELIST)
  private Long inWhitelist = null;

  public ToolsGrayGetV30ResponseDataListInner() {
  }

  public ToolsGrayGetV30ResponseDataListInner grayKey(String grayKey) {
    
    this.grayKey = grayKey;
    return this;
  }

   /**
   * 
   * @return grayKey
  **/
  @javax.annotation.Nullable
  public String getGrayKey() {
    return grayKey;
  }


  public void setGrayKey(String grayKey) {
    this.grayKey = grayKey;
  }


  public ToolsGrayGetV30ResponseDataListInner inWhitelist(Long inWhitelist) {
    
    this.inWhitelist = inWhitelist;
    return this;
  }

   /**
   * 
   * @return inWhitelist
  **/
  @javax.annotation.Nullable
  public Long getInWhitelist() {
    return inWhitelist;
  }


  public void setInWhitelist(Long inWhitelist) {
    this.inWhitelist = inWhitelist;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsGrayGetV30ResponseDataListInner toolsGrayGetV30ResponseDataListInner = (ToolsGrayGetV30ResponseDataListInner) o;
    return Objects.equals(this.grayKey, toolsGrayGetV30ResponseDataListInner.grayKey) &&
        Objects.equals(this.inWhitelist, toolsGrayGetV30ResponseDataListInner.inWhitelist);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(grayKey, inWhitelist);
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
    sb.append("class ToolsGrayGetV30ResponseDataListInner {\n");
    sb.append("    grayKey: ").append(toIndentedString(grayKey)).append("\n");
    sb.append("    inWhitelist: ").append(toIndentedString(inWhitelist)).append("\n");
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
    openapiFields.add("gray_key");
    openapiFields.add("in_whitelist");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsGrayGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsGrayGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsGrayGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsGrayGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsGrayGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsGrayGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsGrayGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsGrayGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsGrayGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsGrayGetV30ResponseDataListInner
  */
  public static ToolsGrayGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsGrayGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsGrayGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

