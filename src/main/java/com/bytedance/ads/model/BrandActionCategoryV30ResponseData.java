/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandActionCategoryV30ResponseDataActionCategoryListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class BrandActionCategoryV30ResponseData {
  public static final String SERIALIZED_NAME_ACTION_CATEGORY_LIST = "action_category_list";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORY_LIST)
  private List<BrandActionCategoryV30ResponseDataActionCategoryListInner> actionCategoryList = null;

  public BrandActionCategoryV30ResponseData() {
  }

  public BrandActionCategoryV30ResponseData actionCategoryList(List<BrandActionCategoryV30ResponseDataActionCategoryListInner> actionCategoryList) {
    
    this.actionCategoryList = actionCategoryList;
    return this;
  }

  public BrandActionCategoryV30ResponseData addActionCategoryListItem(BrandActionCategoryV30ResponseDataActionCategoryListInner actionCategoryListItem) {
    if (this.actionCategoryList == null) {
      this.actionCategoryList = new ArrayList<>();
    }
    this.actionCategoryList.add(actionCategoryListItem);
    return this;
  }

   /**
   * 兴趣列表
   * @return actionCategoryList
  **/
  @javax.annotation.Nullable
  public List<BrandActionCategoryV30ResponseDataActionCategoryListInner> getActionCategoryList() {
    return actionCategoryList;
  }


  public void setActionCategoryList(List<BrandActionCategoryV30ResponseDataActionCategoryListInner> actionCategoryList) {
    this.actionCategoryList = actionCategoryList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandActionCategoryV30ResponseData brandActionCategoryV30ResponseData = (BrandActionCategoryV30ResponseData) o;
    return Objects.equals(this.actionCategoryList, brandActionCategoryV30ResponseData.actionCategoryList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategoryList);
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
    sb.append("class BrandActionCategoryV30ResponseData {\n");
    sb.append("    actionCategoryList: ").append(toIndentedString(actionCategoryList)).append("\n");
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
    openapiFields.add("action_category_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandActionCategoryV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandActionCategoryV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandActionCategoryV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandActionCategoryV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandActionCategoryV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BrandActionCategoryV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandActionCategoryV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandActionCategoryV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandActionCategoryV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BrandActionCategoryV30ResponseData
  */
  public static BrandActionCategoryV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandActionCategoryV30ResponseData.class);
  }

 /**
  * Convert an instance of BrandActionCategoryV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

