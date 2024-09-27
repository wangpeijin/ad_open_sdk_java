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
import com.bytedance.ads.model.EnterpriseOperationLogGetV10ResponseDataListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class EnterpriseOperationLogGetV10ResponseData {
  public static final String SERIALIZED_NAME_ACTION_COUNT = "action_count";
  @SerializedName(SERIALIZED_NAME_ACTION_COUNT)
  private Long actionCount = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<EnterpriseOperationLogGetV10ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset = null;

  public EnterpriseOperationLogGetV10ResponseData() {
  }

  public EnterpriseOperationLogGetV10ResponseData actionCount(Long actionCount) {
    
    this.actionCount = actionCount;
    return this;
  }

   /**
   * 
   * @return actionCount
  **/
  @javax.annotation.Nullable
  public Long getActionCount() {
    return actionCount;
  }


  public void setActionCount(Long actionCount) {
    this.actionCount = actionCount;
  }


  public EnterpriseOperationLogGetV10ResponseData _list(List<EnterpriseOperationLogGetV10ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public EnterpriseOperationLogGetV10ResponseData addListItem(EnterpriseOperationLogGetV10ResponseDataListInner _listItem) {
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
  public List<EnterpriseOperationLogGetV10ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<EnterpriseOperationLogGetV10ResponseDataListInner> _list) {
    this._list = _list;
  }


  public EnterpriseOperationLogGetV10ResponseData offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOperationLogGetV10ResponseData enterpriseOperationLogGetV10ResponseData = (EnterpriseOperationLogGetV10ResponseData) o;
    return Objects.equals(this.actionCount, enterpriseOperationLogGetV10ResponseData.actionCount) &&
        Objects.equals(this._list, enterpriseOperationLogGetV10ResponseData._list) &&
        Objects.equals(this.offset, enterpriseOperationLogGetV10ResponseData.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCount, _list, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOperationLogGetV10ResponseData {\n");
    sb.append("    actionCount: ").append(toIndentedString(actionCount)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    openapiFields.add("action_count");
    openapiFields.add("list");
    openapiFields.add("offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseOperationLogGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseOperationLogGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseOperationLogGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseOperationLogGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseOperationLogGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseOperationLogGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseOperationLogGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseOperationLogGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseOperationLogGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseOperationLogGetV10ResponseData
  */
  public static EnterpriseOperationLogGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseOperationLogGetV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseOperationLogGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

