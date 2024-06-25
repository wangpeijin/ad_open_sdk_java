/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative;
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
 * QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner {
  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_SETTING = "creative_setting";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SETTING)
  private QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting creativeSetting = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE = "programmatic_creative";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE)
  private QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreative = null;

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner creativeMaterialMode(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner creativeSetting(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting creativeSetting) {
    
    this.creativeSetting = creativeSetting;
    return this;
  }

   /**
   * Get creativeSetting
   * @return creativeSetting
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting getCreativeSetting() {
    return creativeSetting;
  }


  public void setCreativeSetting(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerCreativeSetting creativeSetting) {
    this.creativeSetting = creativeSetting;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner programmaticCreative(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreative) {
    
    this.programmaticCreative = programmaticCreative;
    return this;
  }

   /**
   * Get programmaticCreative
   * @return programmaticCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative getProgrammaticCreative() {
    return programmaticCreative;
  }


  public void setProgrammaticCreative(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreative) {
    this.programmaticCreative = programmaticCreative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner = (QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner) o;
    return Objects.equals(this.creativeMaterialMode, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.creativeMaterialMode) &&
        Objects.equals(this.creativeSetting, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.creativeSetting) &&
        Objects.equals(this.productId, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.productId) &&
        Objects.equals(this.programmaticCreative, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.programmaticCreative);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeMaterialMode, creativeSetting, productId, programmaticCreative);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner {\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    creativeSetting: ").append(toIndentedString(creativeSetting)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    programmaticCreative: ").append(toIndentedString(programmaticCreative)).append("\n");
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
    openapiFields.add("creative_material_mode");
    openapiFields.add("creative_setting");
    openapiFields.add("product_id");
    openapiFields.add("programmatic_creative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner
  */
  public static QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

