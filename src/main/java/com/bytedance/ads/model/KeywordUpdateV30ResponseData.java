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
import com.bytedance.ads.model.KeywordUpdateV30ResponseDataErrorListInner;
import com.bytedance.ads.model.KeywordUpdateV30ResponseDataSuccessListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class KeywordUpdateV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<KeywordUpdateV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<KeywordUpdateV30ResponseDataSuccessListInner> successList = null;

  public KeywordUpdateV30ResponseData() {
  }

  public KeywordUpdateV30ResponseData errorList(List<KeywordUpdateV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public KeywordUpdateV30ResponseData addErrorListItem(KeywordUpdateV30ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<KeywordUpdateV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<KeywordUpdateV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public KeywordUpdateV30ResponseData successList(List<KeywordUpdateV30ResponseDataSuccessListInner> successList) {
    
    this.successList = successList;
    return this;
  }

  public KeywordUpdateV30ResponseData addSuccessListItem(KeywordUpdateV30ResponseDataSuccessListInner successListItem) {
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
  public List<KeywordUpdateV30ResponseDataSuccessListInner> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<KeywordUpdateV30ResponseDataSuccessListInner> successList) {
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
    KeywordUpdateV30ResponseData keywordUpdateV30ResponseData = (KeywordUpdateV30ResponseData) o;
    return Objects.equals(this.errorList, keywordUpdateV30ResponseData.errorList) &&
        Objects.equals(this.successList, keywordUpdateV30ResponseData.successList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, successList);
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
    sb.append("class KeywordUpdateV30ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordUpdateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordUpdateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordUpdateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordUpdateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordUpdateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, KeywordUpdateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordUpdateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordUpdateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordUpdateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to KeywordUpdateV30ResponseData
  */
  public static KeywordUpdateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordUpdateV30ResponseData.class);
  }

 /**
  * Convert an instance of KeywordUpdateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

