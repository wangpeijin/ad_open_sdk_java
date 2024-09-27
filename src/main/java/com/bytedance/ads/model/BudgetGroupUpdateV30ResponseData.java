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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class BudgetGroupUpdateV30ResponseData {
  public static final String SERIALIZED_NAME_BUDGET_GROUP_ID = "budget_group_id";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_ID)
  private Long budgetGroupId = null;

  public BudgetGroupUpdateV30ResponseData() {
  }

  public BudgetGroupUpdateV30ResponseData budgetGroupId(Long budgetGroupId) {
    
    this.budgetGroupId = budgetGroupId;
    return this;
  }

   /**
   * 
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
    BudgetGroupUpdateV30ResponseData budgetGroupUpdateV30ResponseData = (BudgetGroupUpdateV30ResponseData) o;
    return Objects.equals(this.budgetGroupId, budgetGroupUpdateV30ResponseData.budgetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupUpdateV30ResponseData {\n");
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
       if (!BudgetGroupUpdateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupUpdateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupUpdateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupUpdateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupUpdateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BudgetGroupUpdateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupUpdateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupUpdateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupUpdateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupUpdateV30ResponseData
  */
  public static BudgetGroupUpdateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupUpdateV30ResponseData.class);
  }

 /**
  * Convert an instance of BudgetGroupUpdateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

