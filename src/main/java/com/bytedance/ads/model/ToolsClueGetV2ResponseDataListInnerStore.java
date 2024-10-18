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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsClueGetV2ResponseDataListInnerStore {
  public static final String SERIALIZED_NAME_STORE_ADDRESS = "store_address";
  @SerializedName(SERIALIZED_NAME_STORE_ADDRESS)
  private String storeAddress = null;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Long storeId = null;

  public static final String SERIALIZED_NAME_STORE_LOCATION = "store_location";
  @SerializedName(SERIALIZED_NAME_STORE_LOCATION)
  private String storeLocation = null;

  public static final String SERIALIZED_NAME_STORE_NAME = "store_name";
  @SerializedName(SERIALIZED_NAME_STORE_NAME)
  private String storeName = null;

  public static final String SERIALIZED_NAME_STORE_PACK_ID = "store_pack_id";
  @SerializedName(SERIALIZED_NAME_STORE_PACK_ID)
  private Long storePackId = null;

  public static final String SERIALIZED_NAME_STORE_PACK_NAME = "store_pack_name";
  @SerializedName(SERIALIZED_NAME_STORE_PACK_NAME)
  private String storePackName = null;

  public static final String SERIALIZED_NAME_STORE_PACK_REMARK = "store_pack_remark";
  @SerializedName(SERIALIZED_NAME_STORE_PACK_REMARK)
  private String storePackRemark = null;

  public static final String SERIALIZED_NAME_STORE_REMARK = "store_remark";
  @SerializedName(SERIALIZED_NAME_STORE_REMARK)
  private String storeRemark = null;

  public ToolsClueGetV2ResponseDataListInnerStore() {
  }

  public ToolsClueGetV2ResponseDataListInnerStore storeAddress(String storeAddress) {
    
    this.storeAddress = storeAddress;
    return this;
  }

   /**
   * 
   * @return storeAddress
  **/
  @javax.annotation.Nullable
  public String getStoreAddress() {
    return storeAddress;
  }


  public void setStoreAddress(String storeAddress) {
    this.storeAddress = storeAddress;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 
   * @return storeId
  **/
  @javax.annotation.Nullable
  public Long getStoreId() {
    return storeId;
  }


  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storeLocation(String storeLocation) {
    
    this.storeLocation = storeLocation;
    return this;
  }

   /**
   * 
   * @return storeLocation
  **/
  @javax.annotation.Nullable
  public String getStoreLocation() {
    return storeLocation;
  }


  public void setStoreLocation(String storeLocation) {
    this.storeLocation = storeLocation;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storeName(String storeName) {
    
    this.storeName = storeName;
    return this;
  }

   /**
   * 
   * @return storeName
  **/
  @javax.annotation.Nullable
  public String getStoreName() {
    return storeName;
  }


  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storePackId(Long storePackId) {
    
    this.storePackId = storePackId;
    return this;
  }

   /**
   * 
   * @return storePackId
  **/
  @javax.annotation.Nullable
  public Long getStorePackId() {
    return storePackId;
  }


  public void setStorePackId(Long storePackId) {
    this.storePackId = storePackId;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storePackName(String storePackName) {
    
    this.storePackName = storePackName;
    return this;
  }

   /**
   * 
   * @return storePackName
  **/
  @javax.annotation.Nullable
  public String getStorePackName() {
    return storePackName;
  }


  public void setStorePackName(String storePackName) {
    this.storePackName = storePackName;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storePackRemark(String storePackRemark) {
    
    this.storePackRemark = storePackRemark;
    return this;
  }

   /**
   * 
   * @return storePackRemark
  **/
  @javax.annotation.Nullable
  public String getStorePackRemark() {
    return storePackRemark;
  }


  public void setStorePackRemark(String storePackRemark) {
    this.storePackRemark = storePackRemark;
  }


  public ToolsClueGetV2ResponseDataListInnerStore storeRemark(String storeRemark) {
    
    this.storeRemark = storeRemark;
    return this;
  }

   /**
   * 
   * @return storeRemark
  **/
  @javax.annotation.Nullable
  public String getStoreRemark() {
    return storeRemark;
  }


  public void setStoreRemark(String storeRemark) {
    this.storeRemark = storeRemark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueGetV2ResponseDataListInnerStore toolsClueGetV2ResponseDataListInnerStore = (ToolsClueGetV2ResponseDataListInnerStore) o;
    return Objects.equals(this.storeAddress, toolsClueGetV2ResponseDataListInnerStore.storeAddress) &&
        Objects.equals(this.storeId, toolsClueGetV2ResponseDataListInnerStore.storeId) &&
        Objects.equals(this.storeLocation, toolsClueGetV2ResponseDataListInnerStore.storeLocation) &&
        Objects.equals(this.storeName, toolsClueGetV2ResponseDataListInnerStore.storeName) &&
        Objects.equals(this.storePackId, toolsClueGetV2ResponseDataListInnerStore.storePackId) &&
        Objects.equals(this.storePackName, toolsClueGetV2ResponseDataListInnerStore.storePackName) &&
        Objects.equals(this.storePackRemark, toolsClueGetV2ResponseDataListInnerStore.storePackRemark) &&
        Objects.equals(this.storeRemark, toolsClueGetV2ResponseDataListInnerStore.storeRemark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeAddress, storeId, storeLocation, storeName, storePackId, storePackName, storePackRemark, storeRemark);
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
    sb.append("class ToolsClueGetV2ResponseDataListInnerStore {\n");
    sb.append("    storeAddress: ").append(toIndentedString(storeAddress)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeLocation: ").append(toIndentedString(storeLocation)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storePackId: ").append(toIndentedString(storePackId)).append("\n");
    sb.append("    storePackName: ").append(toIndentedString(storePackName)).append("\n");
    sb.append("    storePackRemark: ").append(toIndentedString(storePackRemark)).append("\n");
    sb.append("    storeRemark: ").append(toIndentedString(storeRemark)).append("\n");
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
    openapiFields.add("store_address");
    openapiFields.add("store_id");
    openapiFields.add("store_location");
    openapiFields.add("store_name");
    openapiFields.add("store_pack_id");
    openapiFields.add("store_pack_name");
    openapiFields.add("store_pack_remark");
    openapiFields.add("store_remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueGetV2ResponseDataListInnerStore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueGetV2ResponseDataListInnerStore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueGetV2ResponseDataListInnerStore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueGetV2ResponseDataListInnerStore.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueGetV2ResponseDataListInnerStore>() {
           @Override
           public void write(JsonWriter out, ToolsClueGetV2ResponseDataListInnerStore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueGetV2ResponseDataListInnerStore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueGetV2ResponseDataListInnerStore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueGetV2ResponseDataListInnerStore
  * @throws IOException if the JSON string is invalid with respect to ToolsClueGetV2ResponseDataListInnerStore
  */
  public static ToolsClueGetV2ResponseDataListInnerStore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueGetV2ResponseDataListInnerStore.class);
  }

 /**
  * Convert an instance of ToolsClueGetV2ResponseDataListInnerStore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

