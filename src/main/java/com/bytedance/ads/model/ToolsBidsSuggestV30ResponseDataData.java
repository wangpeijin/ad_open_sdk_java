/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class ToolsBidsSuggestV30ResponseDataData {
  public static final String SERIALIZED_NAME_BID_HIGH30 = "bid_high_30";
  @SerializedName(SERIALIZED_NAME_BID_HIGH30)
  private Double bidHigh30 = null;

  public static final String SERIALIZED_NAME_BID_HIGH50 = "bid_high_50";
  @SerializedName(SERIALIZED_NAME_BID_HIGH50)
  private Double bidHigh50 = null;

  public static final String SERIALIZED_NAME_BID_HIGH90 = "bid_high_90";
  @SerializedName(SERIALIZED_NAME_BID_HIGH90)
  private Double bidHigh90 = null;

  public ToolsBidsSuggestV30ResponseDataData() {
  }

  public ToolsBidsSuggestV30ResponseDataData bidHigh30(Double bidHigh30) {
    
    this.bidHigh30 = bidHigh30;
    return this;
  }

   /**
   * 
   * @return bidHigh30
  **/
  @javax.annotation.Nullable
  public Double getBidHigh30() {
    return bidHigh30;
  }


  public void setBidHigh30(Double bidHigh30) {
    this.bidHigh30 = bidHigh30;
  }


  public ToolsBidsSuggestV30ResponseDataData bidHigh50(Double bidHigh50) {
    
    this.bidHigh50 = bidHigh50;
    return this;
  }

   /**
   * 
   * @return bidHigh50
  **/
  @javax.annotation.Nullable
  public Double getBidHigh50() {
    return bidHigh50;
  }


  public void setBidHigh50(Double bidHigh50) {
    this.bidHigh50 = bidHigh50;
  }


  public ToolsBidsSuggestV30ResponseDataData bidHigh90(Double bidHigh90) {
    
    this.bidHigh90 = bidHigh90;
    return this;
  }

   /**
   * 
   * @return bidHigh90
  **/
  @javax.annotation.Nullable
  public Double getBidHigh90() {
    return bidHigh90;
  }


  public void setBidHigh90(Double bidHigh90) {
    this.bidHigh90 = bidHigh90;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBidsSuggestV30ResponseDataData toolsBidsSuggestV30ResponseDataData = (ToolsBidsSuggestV30ResponseDataData) o;
    return Objects.equals(this.bidHigh30, toolsBidsSuggestV30ResponseDataData.bidHigh30) &&
        Objects.equals(this.bidHigh50, toolsBidsSuggestV30ResponseDataData.bidHigh50) &&
        Objects.equals(this.bidHigh90, toolsBidsSuggestV30ResponseDataData.bidHigh90);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidHigh30, bidHigh50, bidHigh90);
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
    sb.append("class ToolsBidsSuggestV30ResponseDataData {\n");
    sb.append("    bidHigh30: ").append(toIndentedString(bidHigh30)).append("\n");
    sb.append("    bidHigh50: ").append(toIndentedString(bidHigh50)).append("\n");
    sb.append("    bidHigh90: ").append(toIndentedString(bidHigh90)).append("\n");
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
    openapiFields.add("bid_high_30");
    openapiFields.add("bid_high_50");
    openapiFields.add("bid_high_90");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBidsSuggestV30ResponseDataData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBidsSuggestV30ResponseDataData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBidsSuggestV30ResponseDataData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBidsSuggestV30ResponseDataData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBidsSuggestV30ResponseDataData>() {
           @Override
           public void write(JsonWriter out, ToolsBidsSuggestV30ResponseDataData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBidsSuggestV30ResponseDataData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBidsSuggestV30ResponseDataData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBidsSuggestV30ResponseDataData
  * @throws IOException if the JSON string is invalid with respect to ToolsBidsSuggestV30ResponseDataData
  */
  public static ToolsBidsSuggestV30ResponseDataData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBidsSuggestV30ResponseDataData.class);
  }

 /**
  * Convert an instance of ToolsBidsSuggestV30ResponseDataData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

