/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner {
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

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner brand(String brand) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner comment(String comment) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner description(String description) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner text(String text) {
    
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
    PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner) o;
    return Objects.equals(this.brand, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.brand) &&
        Objects.equals(this.comment, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.comment) &&
        Objects.equals(this.description, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.description) &&
        Objects.equals(this.text, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.text);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
