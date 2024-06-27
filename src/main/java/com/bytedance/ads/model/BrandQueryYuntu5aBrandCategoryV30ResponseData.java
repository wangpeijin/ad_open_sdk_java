/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class BrandQueryYuntu5aBrandCategoryV30ResponseData {
  public static final String SERIALIZED_NAME_YUNTU5A_BRAND_CATEGORY_INFO = "yuntu5a_brand_category_info";
  @SerializedName(SERIALIZED_NAME_YUNTU5A_BRAND_CATEGORY_INFO)
  private BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfo yuntu5aBrandCategoryInfo = null;

  public BrandQueryYuntu5aBrandCategoryV30ResponseData() {
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseData yuntu5aBrandCategoryInfo(BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfo yuntu5aBrandCategoryInfo) {
    
    this.yuntu5aBrandCategoryInfo = yuntu5aBrandCategoryInfo;
    return this;
  }

   /**
   * Get yuntu5aBrandCategoryInfo
   * @return yuntu5aBrandCategoryInfo
  **/
  @javax.annotation.Nullable
  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfo getYuntu5aBrandCategoryInfo() {
    return yuntu5aBrandCategoryInfo;
  }


  public void setYuntu5aBrandCategoryInfo(BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfo yuntu5aBrandCategoryInfo) {
    this.yuntu5aBrandCategoryInfo = yuntu5aBrandCategoryInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandQueryYuntu5aBrandCategoryV30ResponseData brandQueryYuntu5aBrandCategoryV30ResponseData = (BrandQueryYuntu5aBrandCategoryV30ResponseData) o;
    return Objects.equals(this.yuntu5aBrandCategoryInfo, brandQueryYuntu5aBrandCategoryV30ResponseData.yuntu5aBrandCategoryInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(yuntu5aBrandCategoryInfo);
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
    sb.append("class BrandQueryYuntu5aBrandCategoryV30ResponseData {\n");
    sb.append("    yuntu5aBrandCategoryInfo: ").append(toIndentedString(yuntu5aBrandCategoryInfo)).append("\n");
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
    openapiFields.add("yuntu5a_brand_category_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryYuntu5aBrandCategoryV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryYuntu5aBrandCategoryV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryYuntu5aBrandCategoryV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BrandQueryYuntu5aBrandCategoryV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryYuntu5aBrandCategoryV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryYuntu5aBrandCategoryV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryYuntu5aBrandCategoryV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BrandQueryYuntu5aBrandCategoryV30ResponseData
  */
  public static BrandQueryYuntu5aBrandCategoryV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryYuntu5aBrandCategoryV30ResponseData.class);
  }

 /**
  * Convert an instance of BrandQueryYuntu5aBrandCategoryV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

