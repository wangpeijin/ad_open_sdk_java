/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeStrategyListV2DataStrategyModelsStateListStateType;
import com.bytedance.ads.model.CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit;
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
 * CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit limit = null;

  public static final String SERIALIZED_NAME_STATE_KEY = "state_key";
  @SerializedName(SERIALIZED_NAME_STATE_KEY)
  private String stateKey = null;

  public static final String SERIALIZED_NAME_STATE_NAME = "state_name";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private String stateName = null;

  public static final String SERIALIZED_NAME_STATE_TYPE = "state_type";
  @SerializedName(SERIALIZED_NAME_STATE_TYPE)
  private CreativeStrategyListV2DataStrategyModelsStateListStateType stateType = null;

  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner() {
  }

  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner limit(CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit getLimit() {
    return limit;
  }


  public void setLimit(CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit limit) {
    this.limit = limit;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner stateKey(String stateKey) {
    
    this.stateKey = stateKey;
    return this;
  }

   /**
   * 配置项key
   * @return stateKey
  **/
  @javax.annotation.Nullable
  public String getStateKey() {
    return stateKey;
  }


  public void setStateKey(String stateKey) {
    this.stateKey = stateKey;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner stateName(String stateName) {
    
    this.stateName = stateName;
    return this;
  }

   /**
   * 配置项名称
   * @return stateName
  **/
  @javax.annotation.Nullable
  public String getStateName() {
    return stateName;
  }


  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner stateType(CreativeStrategyListV2DataStrategyModelsStateListStateType stateType) {
    
    this.stateType = stateType;
    return this;
  }

   /**
   * Get stateType
   * @return stateType
  **/
  @javax.annotation.Nullable
  public CreativeStrategyListV2DataStrategyModelsStateListStateType getStateType() {
    return stateType;
  }


  public void setStateType(CreativeStrategyListV2DataStrategyModelsStateListStateType stateType) {
    this.stateType = stateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner = (CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner) o;
    return Objects.equals(this.limit, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.limit) &&
        Objects.equals(this.stateKey, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.stateKey) &&
        Objects.equals(this.stateName, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.stateName) &&
        Objects.equals(this.stateType, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.stateType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, stateKey, stateName, stateType);
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
    sb.append("class CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    stateKey: ").append(toIndentedString(stateKey)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("state_key");
    openapiFields.add("state_name");
    openapiFields.add("state_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state_key");
    openapiRequiredFields.add("state_name");
    openapiRequiredFields.add("state_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner>() {
           @Override
           public void write(JsonWriter out, CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner
  */
  public static CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner.class);
  }

 /**
  * Convert an instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
