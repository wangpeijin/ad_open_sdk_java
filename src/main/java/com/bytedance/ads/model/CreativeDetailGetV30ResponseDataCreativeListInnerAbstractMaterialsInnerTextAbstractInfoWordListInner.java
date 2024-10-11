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
 * CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner {
  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * @return wordId
  **/
  @javax.annotation.Nullable
  public Long getWordId() {
    return wordId;
  }


  public void setWordId(Long wordId) {
    this.wordId = wordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner creativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner = (CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner) o;
    return Objects.equals(this.wordId, creativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner.wordId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordId);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner {\n");
    sb.append("    wordId: ").append(toIndentedString(wordId)).append("\n");
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
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

