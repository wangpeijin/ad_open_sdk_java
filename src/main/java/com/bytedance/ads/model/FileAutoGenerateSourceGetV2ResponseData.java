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
import com.bytedance.ads.model.FileAutoGenerateSourceGetV2ResponseDataErrorsInner;
import com.bytedance.ads.model.FileAutoGenerateSourceGetV2ResponseDataListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class FileAutoGenerateSourceGetV2ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<FileAutoGenerateSourceGetV2ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<FileAutoGenerateSourceGetV2ResponseDataListInner> _list = null;

  public FileAutoGenerateSourceGetV2ResponseData() {
  }

  public FileAutoGenerateSourceGetV2ResponseData errors(List<FileAutoGenerateSourceGetV2ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public FileAutoGenerateSourceGetV2ResponseData addErrorsItem(FileAutoGenerateSourceGetV2ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<FileAutoGenerateSourceGetV2ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<FileAutoGenerateSourceGetV2ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public FileAutoGenerateSourceGetV2ResponseData _list(List<FileAutoGenerateSourceGetV2ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public FileAutoGenerateSourceGetV2ResponseData addListItem(FileAutoGenerateSourceGetV2ResponseDataListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<FileAutoGenerateSourceGetV2ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<FileAutoGenerateSourceGetV2ResponseDataListInner> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAutoGenerateSourceGetV2ResponseData fileAutoGenerateSourceGetV2ResponseData = (FileAutoGenerateSourceGetV2ResponseData) o;
    return Objects.equals(this.errors, fileAutoGenerateSourceGetV2ResponseData.errors) &&
        Objects.equals(this._list, fileAutoGenerateSourceGetV2ResponseData._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAutoGenerateSourceGetV2ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAutoGenerateSourceGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAutoGenerateSourceGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAutoGenerateSourceGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAutoGenerateSourceGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAutoGenerateSourceGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileAutoGenerateSourceGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAutoGenerateSourceGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAutoGenerateSourceGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAutoGenerateSourceGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileAutoGenerateSourceGetV2ResponseData
  */
  public static FileAutoGenerateSourceGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAutoGenerateSourceGetV2ResponseData.class);
  }

 /**
  * Convert an instance of FileAutoGenerateSourceGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

