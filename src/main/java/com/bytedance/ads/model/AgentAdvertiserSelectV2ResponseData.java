/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvertiserSelectV2ResponseDataCursorPageInfo;
import com.bytedance.ads.model.AgentAdvertiserSelectV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class AgentAdvertiserSelectV2ResponseData {
  public static final String SERIALIZED_NAME_ACCOUNT_SOURCE = "account_source";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SOURCE)
  private String accountSource = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_CURSOR_PAGE_INFO = "cursor_page_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_PAGE_INFO)
  private AgentAdvertiserSelectV2ResponseDataCursorPageInfo cursorPageInfo = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<Long> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo = null;

  public AgentAdvertiserSelectV2ResponseData() {
  }

  public AgentAdvertiserSelectV2ResponseData accountSource(String accountSource) {
    
    this.accountSource = accountSource;
    return this;
  }

   /**
   * 
   * @return accountSource
  **/
  @javax.annotation.Nullable
  public String getAccountSource() {
    return accountSource;
  }


  public void setAccountSource(String accountSource) {
    this.accountSource = accountSource;
  }


  public AgentAdvertiserSelectV2ResponseData advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AgentAdvertiserSelectV2ResponseData addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AgentAdvertiserSelectV2ResponseData cursorPageInfo(AgentAdvertiserSelectV2ResponseDataCursorPageInfo cursorPageInfo) {
    
    this.cursorPageInfo = cursorPageInfo;
    return this;
  }

   /**
   * Get cursorPageInfo
   * @return cursorPageInfo
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserSelectV2ResponseDataCursorPageInfo getCursorPageInfo() {
    return cursorPageInfo;
  }


  public void setCursorPageInfo(AgentAdvertiserSelectV2ResponseDataCursorPageInfo cursorPageInfo) {
    this.cursorPageInfo = cursorPageInfo;
  }


  public AgentAdvertiserSelectV2ResponseData _list(List<Long> _list) {
    
    this._list = _list;
    return this;
  }

  public AgentAdvertiserSelectV2ResponseData addListItem(Long _listItem) {
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
  public List<Long> getList() {
    return _list;
  }


  public void setList(List<Long> _list) {
    this._list = _list;
  }


  public AgentAdvertiserSelectV2ResponseData pageInfo(AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserSelectV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo) {
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
    AgentAdvertiserSelectV2ResponseData agentAdvertiserSelectV2ResponseData = (AgentAdvertiserSelectV2ResponseData) o;
    return Objects.equals(this.accountSource, agentAdvertiserSelectV2ResponseData.accountSource) &&
        Objects.equals(this.advertiserIds, agentAdvertiserSelectV2ResponseData.advertiserIds) &&
        Objects.equals(this.cursorPageInfo, agentAdvertiserSelectV2ResponseData.cursorPageInfo) &&
        Objects.equals(this._list, agentAdvertiserSelectV2ResponseData._list) &&
        Objects.equals(this.pageInfo, agentAdvertiserSelectV2ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSource, advertiserIds, cursorPageInfo, _list, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserSelectV2ResponseData {\n");
    sb.append("    accountSource: ").append(toIndentedString(accountSource)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    cursorPageInfo: ").append(toIndentedString(cursorPageInfo)).append("\n");
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
    openapiFields.add("account_source");
    openapiFields.add("advertiser_ids");
    openapiFields.add("cursor_page_info");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserSelectV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserSelectV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserSelectV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserSelectV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserSelectV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserSelectV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserSelectV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserSelectV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserSelectV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserSelectV2ResponseData
  */
  public static AgentAdvertiserSelectV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserSelectV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentAdvertiserSelectV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

