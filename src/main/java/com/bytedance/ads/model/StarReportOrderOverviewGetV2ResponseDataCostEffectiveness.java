/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarReportOrderOverviewGetV2ResponseDataCostEffectiveness {
  public static final String SERIALIZED_NAME_CPM = "cpm";
  @SerializedName(SERIALIZED_NAME_CPM)
  private Long cpm = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price = null;

  public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness() {
  }

  public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness cpm(Long cpm) {
    
    this.cpm = cpm;
    return this;
  }

   /**
   * 
   * @return cpm
  **/
  @javax.annotation.Nullable
  public Long getCpm() {
    return cpm;
  }


  public void setCpm(Long cpm) {
    this.cpm = cpm;
  }


  public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewGetV2ResponseDataCostEffectiveness starReportOrderOverviewGetV2ResponseDataCostEffectiveness = (StarReportOrderOverviewGetV2ResponseDataCostEffectiveness) o;
    return Objects.equals(this.cpm, starReportOrderOverviewGetV2ResponseDataCostEffectiveness.cpm) &&
        Objects.equals(this.play, starReportOrderOverviewGetV2ResponseDataCostEffectiveness.play) &&
        Objects.equals(this.price, starReportOrderOverviewGetV2ResponseDataCostEffectiveness.price);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpm, play, price);
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
    sb.append("class StarReportOrderOverviewGetV2ResponseDataCostEffectiveness {\n");
    sb.append("    cpm: ").append(toIndentedString(cpm)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("cpm");
    openapiFields.add("play");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewGetV2ResponseDataCostEffectiveness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewGetV2ResponseDataCostEffectiveness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewGetV2ResponseDataCostEffectiveness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewGetV2ResponseDataCostEffectiveness.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewGetV2ResponseDataCostEffectiveness>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewGetV2ResponseDataCostEffectiveness value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewGetV2ResponseDataCostEffectiveness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewGetV2ResponseDataCostEffectiveness
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewGetV2ResponseDataCostEffectiveness
  */
  public static StarReportOrderOverviewGetV2ResponseDataCostEffectiveness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewGetV2ResponseDataCostEffectiveness.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewGetV2ResponseDataCostEffectiveness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

