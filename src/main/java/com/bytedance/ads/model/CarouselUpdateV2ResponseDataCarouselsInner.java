/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * CarouselUpdateV2ResponseDataCarouselsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class CarouselUpdateV2ResponseDataCarouselsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Long statusCode = null;

  public CarouselUpdateV2ResponseDataCarouselsInner() {
  }

  public CarouselUpdateV2ResponseDataCarouselsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public CarouselUpdateV2ResponseDataCarouselsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CarouselUpdateV2ResponseDataCarouselsInner statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselUpdateV2ResponseDataCarouselsInner carouselUpdateV2ResponseDataCarouselsInner = (CarouselUpdateV2ResponseDataCarouselsInner) o;
    return Objects.equals(this.id, carouselUpdateV2ResponseDataCarouselsInner.id) &&
        Objects.equals(this.message, carouselUpdateV2ResponseDataCarouselsInner.message) &&
        Objects.equals(this.statusCode, carouselUpdateV2ResponseDataCarouselsInner.statusCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, statusCode);
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
    sb.append("class CarouselUpdateV2ResponseDataCarouselsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselUpdateV2ResponseDataCarouselsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselUpdateV2ResponseDataCarouselsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselUpdateV2ResponseDataCarouselsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselUpdateV2ResponseDataCarouselsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselUpdateV2ResponseDataCarouselsInner>() {
           @Override
           public void write(JsonWriter out, CarouselUpdateV2ResponseDataCarouselsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselUpdateV2ResponseDataCarouselsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselUpdateV2ResponseDataCarouselsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselUpdateV2ResponseDataCarouselsInner
  * @throws IOException if the JSON string is invalid with respect to CarouselUpdateV2ResponseDataCarouselsInner
  */
  public static CarouselUpdateV2ResponseDataCarouselsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselUpdateV2ResponseDataCarouselsInner.class);
  }

 /**
  * Convert an instance of CarouselUpdateV2ResponseDataCarouselsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

