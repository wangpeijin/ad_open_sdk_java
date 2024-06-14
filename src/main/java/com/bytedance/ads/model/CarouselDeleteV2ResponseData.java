/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class CarouselDeleteV2ResponseData {
  public static final String SERIALIZED_NAME_FAILED_IDS = "failed_ids";
  @SerializedName(SERIALIZED_NAME_FAILED_IDS)
  private List<Long> failedIds = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<Long> successList = null;

  public CarouselDeleteV2ResponseData() {
  }

  public CarouselDeleteV2ResponseData failedIds(List<Long> failedIds) {
    
    this.failedIds = failedIds;
    return this;
  }

  public CarouselDeleteV2ResponseData addFailedIdsItem(Long failedIdsItem) {
    if (this.failedIds == null) {
      this.failedIds = new ArrayList<>();
    }
    this.failedIds.add(failedIdsItem);
    return this;
  }

   /**
   * 
   * @return failedIds
  **/
  @javax.annotation.Nullable
  public List<Long> getFailedIds() {
    return failedIds;
  }


  public void setFailedIds(List<Long> failedIds) {
    this.failedIds = failedIds;
  }


  public CarouselDeleteV2ResponseData successList(List<Long> successList) {
    
    this.successList = successList;
    return this;
  }

  public CarouselDeleteV2ResponseData addSuccessListItem(Long successListItem) {
    if (this.successList == null) {
      this.successList = new ArrayList<>();
    }
    this.successList.add(successListItem);
    return this;
  }

   /**
   * 
   * @return successList
  **/
  @javax.annotation.Nullable
  public List<Long> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<Long> successList) {
    this.successList = successList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselDeleteV2ResponseData carouselDeleteV2ResponseData = (CarouselDeleteV2ResponseData) o;
    return Objects.equals(this.failedIds, carouselDeleteV2ResponseData.failedIds) &&
        Objects.equals(this.successList, carouselDeleteV2ResponseData.successList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedIds, successList);
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
    sb.append("class CarouselDeleteV2ResponseData {\n");
    sb.append("    failedIds: ").append(toIndentedString(failedIds)).append("\n");
    sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
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
    openapiFields.add("failed_ids");
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselDeleteV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselDeleteV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselDeleteV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselDeleteV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselDeleteV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CarouselDeleteV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselDeleteV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselDeleteV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselDeleteV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CarouselDeleteV2ResponseData
  */
  public static CarouselDeleteV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselDeleteV2ResponseData.class);
  }

 /**
  * Convert an instance of CarouselDeleteV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

