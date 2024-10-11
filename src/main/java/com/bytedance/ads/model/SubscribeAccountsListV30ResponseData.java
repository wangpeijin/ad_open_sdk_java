/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SubscribeAccountsListV30ResponseDataAdvertisersInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class SubscribeAccountsListV30ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISERS = "advertisers";
  @SerializedName(SERIALIZED_NAME_ADVERTISERS)
  private List<SubscribeAccountsListV30ResponseDataAdvertisersInner> advertisers = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count = null;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private Long nextCursor = null;

  public SubscribeAccountsListV30ResponseData() {
  }

  public SubscribeAccountsListV30ResponseData advertisers(List<SubscribeAccountsListV30ResponseDataAdvertisersInner> advertisers) {
    
    this.advertisers = advertisers;
    return this;
  }

  public SubscribeAccountsListV30ResponseData addAdvertisersItem(SubscribeAccountsListV30ResponseDataAdvertisersInner advertisersItem) {
    if (this.advertisers == null) {
      this.advertisers = new ArrayList<>();
    }
    this.advertisers.add(advertisersItem);
    return this;
  }

   /**
   * 
   * @return advertisers
  **/
  @javax.annotation.Nullable
  public List<SubscribeAccountsListV30ResponseDataAdvertisersInner> getAdvertisers() {
    return advertisers;
  }


  public void setAdvertisers(List<SubscribeAccountsListV30ResponseDataAdvertisersInner> advertisers) {
    this.advertisers = advertisers;
  }


  public SubscribeAccountsListV30ResponseData count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public SubscribeAccountsListV30ResponseData nextCursor(Long nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * 
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  public Long getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(Long nextCursor) {
    this.nextCursor = nextCursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeAccountsListV30ResponseData subscribeAccountsListV30ResponseData = (SubscribeAccountsListV30ResponseData) o;
    return Objects.equals(this.advertisers, subscribeAccountsListV30ResponseData.advertisers) &&
        Objects.equals(this.count, subscribeAccountsListV30ResponseData.count) &&
        Objects.equals(this.nextCursor, subscribeAccountsListV30ResponseData.nextCursor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisers, count, nextCursor);
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
    sb.append("class SubscribeAccountsListV30ResponseData {\n");
    sb.append("    advertisers: ").append(toIndentedString(advertisers)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
    openapiFields.add("advertisers");
    openapiFields.add("count");
    openapiFields.add("next_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscribeAccountsListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscribeAccountsListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscribeAccountsListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscribeAccountsListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscribeAccountsListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, SubscribeAccountsListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscribeAccountsListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscribeAccountsListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscribeAccountsListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to SubscribeAccountsListV30ResponseData
  */
  public static SubscribeAccountsListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscribeAccountsListV30ResponseData.class);
  }

 /**
  * Convert an instance of SubscribeAccountsListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

