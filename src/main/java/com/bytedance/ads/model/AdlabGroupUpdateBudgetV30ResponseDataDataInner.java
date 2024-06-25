/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner;
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
 * AdlabGroupUpdateBudgetV30ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AdlabGroupUpdateBudgetV30ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public AdlabGroupUpdateBudgetV30ResponseDataDataInner() {
  }

  public AdlabGroupUpdateBudgetV30ResponseDataDataInner errors(List<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdlabGroupUpdateBudgetV30ResponseDataDataInner addErrorsItem(AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 更新失败的项目id信息
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<AdlabGroupUpdateBudgetV30ResponseDataDataInnerErrorsInner> errors) {
    this.errors = errors;
  }


  public AdlabGroupUpdateBudgetV30ResponseDataDataInner ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public AdlabGroupUpdateBudgetV30ResponseDataDataInner addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 更新成功的项目id列表
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateBudgetV30ResponseDataDataInner adlabGroupUpdateBudgetV30ResponseDataDataInner = (AdlabGroupUpdateBudgetV30ResponseDataDataInner) o;
    return Objects.equals(this.errors, adlabGroupUpdateBudgetV30ResponseDataDataInner.errors) &&
        Objects.equals(this.ids, adlabGroupUpdateBudgetV30ResponseDataDataInner.ids);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, ids);
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
    sb.append("class AdlabGroupUpdateBudgetV30ResponseDataDataInner {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
    openapiFields.add("ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateBudgetV30ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateBudgetV30ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateBudgetV30ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateBudgetV30ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateBudgetV30ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateBudgetV30ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateBudgetV30ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateBudgetV30ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateBudgetV30ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateBudgetV30ResponseDataDataInner
  */
  public static AdlabGroupUpdateBudgetV30ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateBudgetV30ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateBudgetV30ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

