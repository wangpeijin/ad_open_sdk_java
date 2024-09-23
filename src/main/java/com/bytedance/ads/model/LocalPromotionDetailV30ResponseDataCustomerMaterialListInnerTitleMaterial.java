/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.21
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
 * 标题
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-23T20:22:05.728466681+08:00[Asia/Shanghai]")
public class LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial {
  public static final String SERIALIZED_NAME_LEGO_MATERIAL_ID = "lego_material_id";
  @SerializedName(SERIALIZED_NAME_LEGO_MATERIAL_ID)
  private Long legoMaterialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial() {
  }

  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial legoMaterialId(Long legoMaterialId) {
    
    this.legoMaterialId = legoMaterialId;
    return this;
  }

   /**
   * 标题素材库id
   * @return legoMaterialId
  **/
  @javax.annotation.Nullable
  public Long getLegoMaterialId() {
    return legoMaterialId;
  }


  public void setLegoMaterialId(Long legoMaterialId) {
    this.legoMaterialId = legoMaterialId;
  }


  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 标题素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题内容
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial localPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial = (LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial) o;
    return Objects.equals(this.legoMaterialId, localPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.legoMaterialId) &&
        Objects.equals(this.materialId, localPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.materialId) &&
        Objects.equals(this.title, localPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legoMaterialId, materialId, title);
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
    sb.append("class LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial {\n");
    sb.append("    legoMaterialId: ").append(toIndentedString(legoMaterialId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("lego_material_id");
    openapiFields.add("material_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial>() {
           @Override
           public void write(JsonWriter out, LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial
  */
  public static LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial.class);
  }

 /**
  * Convert an instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
