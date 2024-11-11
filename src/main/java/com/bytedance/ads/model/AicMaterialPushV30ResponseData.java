/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AicMaterialPushV30ResponseDataFailResultsInner;
import com.bytedance.ads.model.AicMaterialPushV30ResponseDataSuccessResultsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class AicMaterialPushV30ResponseData {
  public static final String SERIALIZED_NAME_FAIL_RESULTS = "fail_results";
  @SerializedName(SERIALIZED_NAME_FAIL_RESULTS)
  private List<AicMaterialPushV30ResponseDataFailResultsInner> failResults = null;

  public static final String SERIALIZED_NAME_SUCCESS_RESULTS = "success_results";
  @SerializedName(SERIALIZED_NAME_SUCCESS_RESULTS)
  private List<AicMaterialPushV30ResponseDataSuccessResultsInner> successResults = null;

  public AicMaterialPushV30ResponseData() {
  }

  public AicMaterialPushV30ResponseData failResults(List<AicMaterialPushV30ResponseDataFailResultsInner> failResults) {
    
    this.failResults = failResults;
    return this;
  }

  public AicMaterialPushV30ResponseData addFailResultsItem(AicMaterialPushV30ResponseDataFailResultsInner failResultsItem) {
    if (this.failResults == null) {
      this.failResults = new ArrayList<>();
    }
    this.failResults.add(failResultsItem);
    return this;
  }

   /**
   * 推送失败列表
   * @return failResults
  **/
  @javax.annotation.Nullable
  public List<AicMaterialPushV30ResponseDataFailResultsInner> getFailResults() {
    return failResults;
  }


  public void setFailResults(List<AicMaterialPushV30ResponseDataFailResultsInner> failResults) {
    this.failResults = failResults;
  }


  public AicMaterialPushV30ResponseData successResults(List<AicMaterialPushV30ResponseDataSuccessResultsInner> successResults) {
    
    this.successResults = successResults;
    return this;
  }

  public AicMaterialPushV30ResponseData addSuccessResultsItem(AicMaterialPushV30ResponseDataSuccessResultsInner successResultsItem) {
    if (this.successResults == null) {
      this.successResults = new ArrayList<>();
    }
    this.successResults.add(successResultsItem);
    return this;
  }

   /**
   * 推送成功列表
   * @return successResults
  **/
  @javax.annotation.Nullable
  public List<AicMaterialPushV30ResponseDataSuccessResultsInner> getSuccessResults() {
    return successResults;
  }


  public void setSuccessResults(List<AicMaterialPushV30ResponseDataSuccessResultsInner> successResults) {
    this.successResults = successResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMaterialPushV30ResponseData aicMaterialPushV30ResponseData = (AicMaterialPushV30ResponseData) o;
    return Objects.equals(this.failResults, aicMaterialPushV30ResponseData.failResults) &&
        Objects.equals(this.successResults, aicMaterialPushV30ResponseData.successResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failResults, successResults);
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
    sb.append("class AicMaterialPushV30ResponseData {\n");
    sb.append("    failResults: ").append(toIndentedString(failResults)).append("\n");
    sb.append("    successResults: ").append(toIndentedString(successResults)).append("\n");
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
    openapiFields.add("fail_results");
    openapiFields.add("success_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMaterialPushV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialPushV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialPushV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialPushV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialPushV30ResponseData>() {
           @Override
           public void write(JsonWriter out, AicMaterialPushV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialPushV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialPushV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialPushV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to AicMaterialPushV30ResponseData
  */
  public static AicMaterialPushV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialPushV30ResponseData.class);
  }

 /**
  * Convert an instance of AicMaterialPushV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

