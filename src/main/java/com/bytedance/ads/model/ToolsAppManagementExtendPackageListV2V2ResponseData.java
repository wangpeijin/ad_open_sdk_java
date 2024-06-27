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
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2ResponseDataListInner;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsAppManagementExtendPackageListV2V2ResponseData {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ToolsAppManagementExtendPackageListV2V2ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsAppManagementExtendPackageListV2V2ResponseDataPageInfo pageInfo = null;

  public ToolsAppManagementExtendPackageListV2V2ResponseData() {
  }

  public ToolsAppManagementExtendPackageListV2V2ResponseData _list(List<ToolsAppManagementExtendPackageListV2V2ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public ToolsAppManagementExtendPackageListV2V2ResponseData addListItem(ToolsAppManagementExtendPackageListV2V2ResponseDataListInner _listItem) {
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
  public List<ToolsAppManagementExtendPackageListV2V2ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<ToolsAppManagementExtendPackageListV2V2ResponseDataListInner> _list) {
    this._list = _list;
  }


  public ToolsAppManagementExtendPackageListV2V2ResponseData pageInfo(ToolsAppManagementExtendPackageListV2V2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementExtendPackageListV2V2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsAppManagementExtendPackageListV2V2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageListV2V2ResponseData toolsAppManagementExtendPackageListV2V2ResponseData = (ToolsAppManagementExtendPackageListV2V2ResponseData) o;
    return Objects.equals(this._list, toolsAppManagementExtendPackageListV2V2ResponseData._list) &&
        Objects.equals(this.pageInfo, toolsAppManagementExtendPackageListV2V2ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageListV2V2ResponseData {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("list");
    openapiRequiredFields.add("page_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageListV2V2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageListV2V2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageListV2V2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageListV2V2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageListV2V2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageListV2V2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageListV2V2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageListV2V2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageListV2V2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageListV2V2ResponseData
  */
  public static ToolsAppManagementExtendPackageListV2V2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageListV2V2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageListV2V2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

