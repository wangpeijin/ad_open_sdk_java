/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOrderListV2FilteringUniversalOrderStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class StarDemandOrderListV2Filtering {
  public static final String SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS = "universal_order_status";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS)
  private StarDemandOrderListV2FilteringUniversalOrderStatus universalOrderStatus = null;

  public StarDemandOrderListV2Filtering() {
  }

  public StarDemandOrderListV2Filtering universalOrderStatus(StarDemandOrderListV2FilteringUniversalOrderStatus universalOrderStatus) {
    
    this.universalOrderStatus = universalOrderStatus;
    return this;
  }

   /**
   * Get universalOrderStatus
   * @return universalOrderStatus
  **/
  @javax.annotation.Nullable
  public StarDemandOrderListV2FilteringUniversalOrderStatus getUniversalOrderStatus() {
    return universalOrderStatus;
  }


  public void setUniversalOrderStatus(StarDemandOrderListV2FilteringUniversalOrderStatus universalOrderStatus) {
    this.universalOrderStatus = universalOrderStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOrderListV2Filtering starDemandOrderListV2Filtering = (StarDemandOrderListV2Filtering) o;
    return Objects.equals(this.universalOrderStatus, starDemandOrderListV2Filtering.universalOrderStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(universalOrderStatus);
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
    sb.append("class StarDemandOrderListV2Filtering {\n");
    sb.append("    universalOrderStatus: ").append(toIndentedString(universalOrderStatus)).append("\n");
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
    openapiFields.add("universal_order_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOrderListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOrderListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOrderListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOrderListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOrderListV2Filtering>() {
           @Override
           public void write(JsonWriter out, StarDemandOrderListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOrderListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOrderListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOrderListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to StarDemandOrderListV2Filtering
  */
  public static StarDemandOrderListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOrderListV2Filtering.class);
  }

 /**
  * Convert an instance of StarDemandOrderListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

