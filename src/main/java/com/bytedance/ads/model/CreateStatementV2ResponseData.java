/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreateStatementV2DataResult;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class CreateStatementV2ResponseData {
  public static final String SERIALIZED_NAME_ERROR_REASON = "error_reason";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON)
  private String errorReason = null;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private CreateStatementV2DataResult result = null;

  public static final String SERIALIZED_NAME_STATEMENT_SERIAL = "statement_serial";
  @SerializedName(SERIALIZED_NAME_STATEMENT_SERIAL)
  private String statementSerial = null;

  public CreateStatementV2ResponseData() {
  }

  public CreateStatementV2ResponseData errorReason(String errorReason) {
    
    this.errorReason = errorReason;
    return this;
  }

   /**
   * 创建失败原因
   * @return errorReason
  **/
  @javax.annotation.Nullable
  public String getErrorReason() {
    return errorReason;
  }


  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }


  public CreateStatementV2ResponseData result(CreateStatementV2DataResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public CreateStatementV2DataResult getResult() {
    return result;
  }


  public void setResult(CreateStatementV2DataResult result) {
    this.result = result;
  }


  public CreateStatementV2ResponseData statementSerial(String statementSerial) {
    
    this.statementSerial = statementSerial;
    return this;
  }

   /**
   * 结算单编号
   * @return statementSerial
  **/
  @javax.annotation.Nullable
  public String getStatementSerial() {
    return statementSerial;
  }


  public void setStatementSerial(String statementSerial) {
    this.statementSerial = statementSerial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatementV2ResponseData createStatementV2ResponseData = (CreateStatementV2ResponseData) o;
    return Objects.equals(this.errorReason, createStatementV2ResponseData.errorReason) &&
        Objects.equals(this.result, createStatementV2ResponseData.result) &&
        Objects.equals(this.statementSerial, createStatementV2ResponseData.statementSerial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorReason, result, statementSerial);
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
    sb.append("class CreateStatementV2ResponseData {\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    statementSerial: ").append(toIndentedString(statementSerial)).append("\n");
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
    openapiFields.add("error_reason");
    openapiFields.add("result");
    openapiFields.add("statement_serial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStatementV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStatementV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStatementV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStatementV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStatementV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CreateStatementV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStatementV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStatementV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStatementV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CreateStatementV2ResponseData
  */
  public static CreateStatementV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStatementV2ResponseData.class);
  }

 /**
  * Convert an instance of CreateStatementV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

