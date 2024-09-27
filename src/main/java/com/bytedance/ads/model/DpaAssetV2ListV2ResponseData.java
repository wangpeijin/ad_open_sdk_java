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
import com.bytedance.ads.model.DpaAssetV2ListV2ResponseDataAssetListInner;
import com.bytedance.ads.model.DpaAssetV2ListV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class DpaAssetV2ListV2ResponseData {
  public static final String SERIALIZED_NAME_ASSET_LIST = "asset_list";
  @SerializedName(SERIALIZED_NAME_ASSET_LIST)
  private List<DpaAssetV2ListV2ResponseDataAssetListInner> assetList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private DpaAssetV2ListV2ResponseDataPageInfo pageInfo = null;

  public DpaAssetV2ListV2ResponseData() {
  }

  public DpaAssetV2ListV2ResponseData assetList(List<DpaAssetV2ListV2ResponseDataAssetListInner> assetList) {
    
    this.assetList = assetList;
    return this;
  }

  public DpaAssetV2ListV2ResponseData addAssetListItem(DpaAssetV2ListV2ResponseDataAssetListInner assetListItem) {
    if (this.assetList == null) {
      this.assetList = new ArrayList<>();
    }
    this.assetList.add(assetListItem);
    return this;
  }

   /**
   * 投放条件列表
   * @return assetList
  **/
  @javax.annotation.Nullable
  public List<DpaAssetV2ListV2ResponseDataAssetListInner> getAssetList() {
    return assetList;
  }


  public void setAssetList(List<DpaAssetV2ListV2ResponseDataAssetListInner> assetList) {
    this.assetList = assetList;
  }


  public DpaAssetV2ListV2ResponseData pageInfo(DpaAssetV2ListV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public DpaAssetV2ListV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(DpaAssetV2ListV2ResponseDataPageInfo pageInfo) {
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
    DpaAssetV2ListV2ResponseData dpaAssetV2ListV2ResponseData = (DpaAssetV2ListV2ResponseData) o;
    return Objects.equals(this.assetList, dpaAssetV2ListV2ResponseData.assetList) &&
        Objects.equals(this.pageInfo, dpaAssetV2ListV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetList, pageInfo);
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
    sb.append("class DpaAssetV2ListV2ResponseData {\n");
    sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
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
    openapiFields.add("asset_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asset_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaAssetV2ListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaAssetV2ListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaAssetV2ListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaAssetV2ListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaAssetV2ListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, DpaAssetV2ListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaAssetV2ListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaAssetV2ListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaAssetV2ListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to DpaAssetV2ListV2ResponseData
  */
  public static DpaAssetV2ListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaAssetV2ListV2ResponseData.class);
  }

 /**
  * Convert an instance of DpaAssetV2ListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

