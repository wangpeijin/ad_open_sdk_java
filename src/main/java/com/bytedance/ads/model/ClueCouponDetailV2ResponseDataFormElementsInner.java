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
import com.bytedance.ads.model.ClueCouponDetailV2DataFormElementsAllowEmpty;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormElementsElementType;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormElementsIsUnique;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ClueCouponDetailV2ResponseDataFormElementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ClueCouponDetailV2ResponseDataFormElementsInner {
  public static final String SERIALIZED_NAME_ALLOW_EMPTY = "allow_empty";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY)
  private ClueCouponDetailV2DataFormElementsAllowEmpty allowEmpty = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Long defaultValue = null;

  public static final String SERIALIZED_NAME_ELEMENT_ID = "element_id";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private Long elementId = null;

  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "element_type";
  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private ClueCouponDetailV2DataFormElementsElementType elementType = null;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "is_unique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private ClueCouponDetailV2DataFormElementsIsUnique isUnique = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_LAYER = "layer";
  @SerializedName(SERIALIZED_NAME_LAYER)
  private Long layer = null;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Long sequence = null;

  public ClueCouponDetailV2ResponseDataFormElementsInner() {
  }

  public ClueCouponDetailV2ResponseDataFormElementsInner allowEmpty(ClueCouponDetailV2DataFormElementsAllowEmpty allowEmpty) {
    
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormElementsAllowEmpty getAllowEmpty() {
    return allowEmpty;
  }


  public void setAllowEmpty(ClueCouponDetailV2DataFormElementsAllowEmpty allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner defaultValue(Long defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * 
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  public Long getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * 
   * @return elementId
  **/
  @javax.annotation.Nullable
  public Long getElementId() {
    return elementId;
  }


  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner elementType(ClueCouponDetailV2DataFormElementsElementType elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormElementsElementType getElementType() {
    return elementType;
  }


  public void setElementType(ClueCouponDetailV2DataFormElementsElementType elementType) {
    this.elementType = elementType;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner isUnique(ClueCouponDetailV2DataFormElementsIsUnique isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * Get isUnique
   * @return isUnique
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormElementsIsUnique getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(ClueCouponDetailV2DataFormElementsIsUnique isUnique) {
    this.isUnique = isUnique;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner layer(Long layer) {
    
    this.layer = layer;
    return this;
  }

   /**
   * 
   * @return layer
  **/
  @javax.annotation.Nullable
  public Long getLayer() {
    return layer;
  }


  public void setLayer(Long layer) {
    this.layer = layer;
  }


  public ClueCouponDetailV2ResponseDataFormElementsInner sequence(Long sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * 
   * @return sequence
  **/
  @javax.annotation.Nullable
  public Long getSequence() {
    return sequence;
  }


  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataFormElementsInner clueCouponDetailV2ResponseDataFormElementsInner = (ClueCouponDetailV2ResponseDataFormElementsInner) o;
    return Objects.equals(this.allowEmpty, clueCouponDetailV2ResponseDataFormElementsInner.allowEmpty) &&
        Objects.equals(this.defaultValue, clueCouponDetailV2ResponseDataFormElementsInner.defaultValue) &&
        Objects.equals(this.elementId, clueCouponDetailV2ResponseDataFormElementsInner.elementId) &&
        Objects.equals(this.elementType, clueCouponDetailV2ResponseDataFormElementsInner.elementType) &&
        Objects.equals(this.isUnique, clueCouponDetailV2ResponseDataFormElementsInner.isUnique) &&
        Objects.equals(this.label, clueCouponDetailV2ResponseDataFormElementsInner.label) &&
        Objects.equals(this.layer, clueCouponDetailV2ResponseDataFormElementsInner.layer) &&
        Objects.equals(this.sequence, clueCouponDetailV2ResponseDataFormElementsInner.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, defaultValue, elementId, elementType, isUnique, label, layer, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataFormElementsInner {\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("allow_empty");
    openapiFields.add("default_value");
    openapiFields.add("element_id");
    openapiFields.add("element_type");
    openapiFields.add("is_unique");
    openapiFields.add("label");
    openapiFields.add("layer");
    openapiFields.add("sequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataFormElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataFormElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataFormElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataFormElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataFormElementsInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataFormElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataFormElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataFormElementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataFormElementsInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataFormElementsInner
  */
  public static ClueCouponDetailV2ResponseDataFormElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataFormElementsInner.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataFormElementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

