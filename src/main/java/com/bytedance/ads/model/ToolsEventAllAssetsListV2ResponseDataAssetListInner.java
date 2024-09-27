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
import com.bytedance.ads.model.ToolsEventAllAssetsListV2DataAssetListAssetType;
import com.bytedance.ads.model.ToolsEventAllAssetsListV2DataAssetListShareType;
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
 * ToolsEventAllAssetsListV2ResponseDataAssetListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsEventAllAssetsListV2ResponseDataAssetListInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private ToolsEventAllAssetsListV2DataAssetListAssetType assetType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_SHARE_TYPE = "share_type";
  @SerializedName(SERIALIZED_NAME_SHARE_TYPE)
  private ToolsEventAllAssetsListV2DataAssetListShareType shareType = null;

  public ToolsEventAllAssetsListV2ResponseDataAssetListInner() {
  }

  public ToolsEventAllAssetsListV2ResponseDataAssetListInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产id
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAllAssetsListV2ResponseDataAssetListInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 资产名称
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAllAssetsListV2ResponseDataAssetListInner assetType(ToolsEventAllAssetsListV2DataAssetListAssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public ToolsEventAllAssetsListV2DataAssetListAssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(ToolsEventAllAssetsListV2DataAssetListAssetType assetType) {
    this.assetType = assetType;
  }


  public ToolsEventAllAssetsListV2ResponseDataAssetListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 资产创建时间，格式&#x60;YYYY-MM-DD HH:MM:SS&#x60;
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsEventAllAssetsListV2ResponseDataAssetListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 资产修改时间，格式&#x60;YYYY-MM-DD HH:MM:SS&#x60;
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsEventAllAssetsListV2ResponseDataAssetListInner shareType(ToolsEventAllAssetsListV2DataAssetListShareType shareType) {
    
    this.shareType = shareType;
    return this;
  }

   /**
   * Get shareType
   * @return shareType
  **/
  @javax.annotation.Nullable
  public ToolsEventAllAssetsListV2DataAssetListShareType getShareType() {
    return shareType;
  }


  public void setShareType(ToolsEventAllAssetsListV2DataAssetListShareType shareType) {
    this.shareType = shareType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAllAssetsListV2ResponseDataAssetListInner toolsEventAllAssetsListV2ResponseDataAssetListInner = (ToolsEventAllAssetsListV2ResponseDataAssetListInner) o;
    return Objects.equals(this.assetId, toolsEventAllAssetsListV2ResponseDataAssetListInner.assetId) &&
        Objects.equals(this.assetName, toolsEventAllAssetsListV2ResponseDataAssetListInner.assetName) &&
        Objects.equals(this.assetType, toolsEventAllAssetsListV2ResponseDataAssetListInner.assetType) &&
        Objects.equals(this.createTime, toolsEventAllAssetsListV2ResponseDataAssetListInner.createTime) &&
        Objects.equals(this.modifyTime, toolsEventAllAssetsListV2ResponseDataAssetListInner.modifyTime) &&
        Objects.equals(this.shareType, toolsEventAllAssetsListV2ResponseDataAssetListInner.shareType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, assetType, createTime, modifyTime, shareType);
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
    sb.append("class ToolsEventAllAssetsListV2ResponseDataAssetListInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("asset_type");
    openapiFields.add("create_time");
    openapiFields.add("modify_time");
    openapiFields.add("share_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAllAssetsListV2ResponseDataAssetListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAllAssetsListV2ResponseDataAssetListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAllAssetsListV2ResponseDataAssetListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAllAssetsListV2ResponseDataAssetListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAllAssetsListV2ResponseDataAssetListInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventAllAssetsListV2ResponseDataAssetListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAllAssetsListV2ResponseDataAssetListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAllAssetsListV2ResponseDataAssetListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAllAssetsListV2ResponseDataAssetListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAllAssetsListV2ResponseDataAssetListInner
  */
  public static ToolsEventAllAssetsListV2ResponseDataAssetListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAllAssetsListV2ResponseDataAssetListInner.class);
  }

 /**
  * Convert an instance of ToolsEventAllAssetsListV2ResponseDataAssetListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

