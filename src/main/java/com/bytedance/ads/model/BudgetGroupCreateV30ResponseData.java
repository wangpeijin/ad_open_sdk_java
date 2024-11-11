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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
public class BudgetGroupCreateV30ResponseData {
  public static final String SERIALIZED_NAME_BUDGET_GROUP_ID = "budget_group_id";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_ID)
  private Long budgetGroupId = null;

  public BudgetGroupCreateV30ResponseData() {
  }

  public BudgetGroupCreateV30ResponseData budgetGroupId(Long budgetGroupId) {
    
    this.budgetGroupId = budgetGroupId;
    return this;
  }

   /**
   * 生成的预算组 ID
   * @return budgetGroupId
  **/
  @javax.annotation.Nullable
  public Long getBudgetGroupId() {
    return budgetGroupId;
  }


  public void setBudgetGroupId(Long budgetGroupId) {
    this.budgetGroupId = budgetGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetGroupCreateV30ResponseData budgetGroupCreateV30ResponseData = (BudgetGroupCreateV30ResponseData) o;
    return Objects.equals(this.budgetGroupId, budgetGroupCreateV30ResponseData.budgetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupCreateV30ResponseData {\n");
    sb.append("    budgetGroupId: ").append(toIndentedString(budgetGroupId)).append("\n");
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
    openapiFields.add("budget_group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget_group_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetGroupCreateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupCreateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupCreateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupCreateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupCreateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BudgetGroupCreateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupCreateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupCreateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupCreateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupCreateV30ResponseData
  */
  public static BudgetGroupCreateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupCreateV30ResponseData.class);
  }

 /**
  * Convert an instance of BudgetGroupCreateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

