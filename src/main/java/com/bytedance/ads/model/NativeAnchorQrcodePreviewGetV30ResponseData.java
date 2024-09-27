/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner;
import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class NativeAnchorQrcodePreviewGetV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner> successList = null;

  public NativeAnchorQrcodePreviewGetV30ResponseData() {
  }

  public NativeAnchorQrcodePreviewGetV30ResponseData errorList(List<NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public NativeAnchorQrcodePreviewGetV30ResponseData addErrorListItem(NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner errorListItem) {
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
  public List<NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<NativeAnchorQrcodePreviewGetV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public NativeAnchorQrcodePreviewGetV30ResponseData successList(List<NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner> successList) {
    
    this.successList = successList;
    return this;
  }

  public NativeAnchorQrcodePreviewGetV30ResponseData addSuccessListItem(NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner successListItem) {
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
  public List<NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<NativeAnchorQrcodePreviewGetV30ResponseDataSuccessListInner> successList) {
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
    NativeAnchorQrcodePreviewGetV30ResponseData nativeAnchorQrcodePreviewGetV30ResponseData = (NativeAnchorQrcodePreviewGetV30ResponseData) o;
    return Objects.equals(this.errorList, nativeAnchorQrcodePreviewGetV30ResponseData.errorList) &&
        Objects.equals(this.successList, nativeAnchorQrcodePreviewGetV30ResponseData.successList);
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
    sb.append("class NativeAnchorQrcodePreviewGetV30ResponseData {\n");
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
       if (!NativeAnchorQrcodePreviewGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorQrcodePreviewGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorQrcodePreviewGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorQrcodePreviewGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorQrcodePreviewGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, NativeAnchorQrcodePreviewGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorQrcodePreviewGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorQrcodePreviewGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorQrcodePreviewGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorQrcodePreviewGetV30ResponseData
  */
  public static NativeAnchorQrcodePreviewGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorQrcodePreviewGetV30ResponseData.class);
  }

 /**
  * Convert an instance of NativeAnchorQrcodePreviewGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

