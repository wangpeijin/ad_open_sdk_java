/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileMaterialListV2ResponseDataMaterialsInner;
import com.bytedance.ads.model.FileMaterialListV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class FileMaterialListV2ResponseData {
  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<FileMaterialListV2ResponseDataMaterialsInner> materials = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private FileMaterialListV2ResponseDataPageInfo pageInfo = null;

  public FileMaterialListV2ResponseData() {
  }

  public FileMaterialListV2ResponseData materials(List<FileMaterialListV2ResponseDataMaterialsInner> materials) {
    
    this.materials = materials;
    return this;
  }

  public FileMaterialListV2ResponseData addMaterialsItem(FileMaterialListV2ResponseDataMaterialsInner materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

   /**
   * 
   * @return materials
  **/
  @javax.annotation.Nullable
  public List<FileMaterialListV2ResponseDataMaterialsInner> getMaterials() {
    return materials;
  }


  public void setMaterials(List<FileMaterialListV2ResponseDataMaterialsInner> materials) {
    this.materials = materials;
  }


  public FileMaterialListV2ResponseData pageInfo(FileMaterialListV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public FileMaterialListV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(FileMaterialListV2ResponseDataPageInfo pageInfo) {
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
    FileMaterialListV2ResponseData fileMaterialListV2ResponseData = (FileMaterialListV2ResponseData) o;
    return Objects.equals(this.materials, fileMaterialListV2ResponseData.materials) &&
        Objects.equals(this.pageInfo, fileMaterialListV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materials, pageInfo);
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
    sb.append("class FileMaterialListV2ResponseData {\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
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
    openapiFields.add("materials");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileMaterialListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileMaterialListV2ResponseData
  */
  public static FileMaterialListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialListV2ResponseData.class);
  }

 /**
  * Convert an instance of FileMaterialListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

