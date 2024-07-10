/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject() {
  }

  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 
   * @return brand
  **/
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject carouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject = (CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject) o;
    return Objects.equals(this.brand, carouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.brand) &&
        Objects.equals(this.comment, carouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.comment) &&
        Objects.equals(this.description, carouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.description) &&
        Objects.equals(this.text, carouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, comment, description, text);
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
    sb.append("class CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("comment");
    openapiFields.add("description");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand");
    openapiRequiredFields.add("description");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject>() {
           @Override
           public void write(JsonWriter out, CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject
  */
  public static CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject.class);
  }

 /**
  * Convert an instance of CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

