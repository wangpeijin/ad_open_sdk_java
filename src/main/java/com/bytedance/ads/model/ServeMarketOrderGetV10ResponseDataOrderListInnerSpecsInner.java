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
 * ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner {
  public static final String SERIALIZED_NAME_SPEC_NAME = "spec_name";
  @SerializedName(SERIALIZED_NAME_SPEC_NAME)
  private String specName = null;

  public static final String SERIALIZED_NAME_SPEC_VALUE = "spec_value";
  @SerializedName(SERIALIZED_NAME_SPEC_VALUE)
  private String specValue = null;

  public ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner() {
  }

  public ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner specName(String specName) {
    
    this.specName = specName;
    return this;
  }

   /**
   * 
   * @return specName
  **/
  @javax.annotation.Nullable
  public String getSpecName() {
    return specName;
  }


  public void setSpecName(String specName) {
    this.specName = specName;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner specValue(String specValue) {
    
    this.specValue = specValue;
    return this;
  }

   /**
   * 
   * @return specValue
  **/
  @javax.annotation.Nullable
  public String getSpecValue() {
    return specValue;
  }


  public void setSpecValue(String specValue) {
    this.specValue = specValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner serveMarketOrderGetV10ResponseDataOrderListInnerSpecsInner = (ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner) o;
    return Objects.equals(this.specName, serveMarketOrderGetV10ResponseDataOrderListInnerSpecsInner.specName) &&
        Objects.equals(this.specValue, serveMarketOrderGetV10ResponseDataOrderListInnerSpecsInner.specValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(specName, specValue);
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
    sb.append("class ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner {\n");
    sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
    sb.append("    specValue: ").append(toIndentedString(specValue)).append("\n");
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
    openapiFields.add("spec_name");
    openapiFields.add("spec_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner>() {
           @Override
           public void write(JsonWriter out, ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner
  * @throws IOException if the JSON string is invalid with respect to ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner
  */
  public static ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner.class);
  }

 /**
  * Convert an instance of ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

