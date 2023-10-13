/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueFormCreateV2EnableLayer;
import com.bytedance.ads.model.ClueFormCreateV2RequestElementsInner;
import com.bytedance.ads.model.ClueFormCreateV2RequestExtendInfo;
import com.bytedance.ads.model.ClueFormCreateV2ValidateType;
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
 * ClueFormCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class ClueFormCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<ClueFormCreateV2RequestElementsInner> elements = null;

  public static final String SERIALIZED_NAME_ENABLE_LAYER = "enable_layer";
  @SerializedName(SERIALIZED_NAME_ENABLE_LAYER)
  private ClueFormCreateV2EnableLayer enableLayer = null;

  public static final String SERIALIZED_NAME_EXTEND_INFO = "extend_info";
  @SerializedName(SERIALIZED_NAME_EXTEND_INFO)
  private ClueFormCreateV2RequestExtendInfo extendInfo = null;

  public static final String SERIALIZED_NAME_LAYER_SUBMIT_TEXT = "layer_submit_text";
  @SerializedName(SERIALIZED_NAME_LAYER_SUBMIT_TEXT)
  private String layerSubmitText = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUBMIT_TEXT = "submit_text";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TEXT)
  private String submitText = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueFormCreateV2ValidateType validateType = null;

  public ClueFormCreateV2Request() {
  }

  public ClueFormCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueFormCreateV2Request elements(List<ClueFormCreateV2RequestElementsInner> elements) {
    
    this.elements = elements;
    return this;
  }

  public ClueFormCreateV2Request addElementsItem(ClueFormCreateV2RequestElementsInner elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * 
   * @return elements
  **/
  @javax.annotation.Nonnull
  public List<ClueFormCreateV2RequestElementsInner> getElements() {
    return elements;
  }


  public void setElements(List<ClueFormCreateV2RequestElementsInner> elements) {
    this.elements = elements;
  }


  public ClueFormCreateV2Request enableLayer(ClueFormCreateV2EnableLayer enableLayer) {
    
    this.enableLayer = enableLayer;
    return this;
  }

   /**
   * Get enableLayer
   * @return enableLayer
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2EnableLayer getEnableLayer() {
    return enableLayer;
  }


  public void setEnableLayer(ClueFormCreateV2EnableLayer enableLayer) {
    this.enableLayer = enableLayer;
  }


  public ClueFormCreateV2Request extendInfo(ClueFormCreateV2RequestExtendInfo extendInfo) {
    
    this.extendInfo = extendInfo;
    return this;
  }

   /**
   * Get extendInfo
   * @return extendInfo
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2RequestExtendInfo getExtendInfo() {
    return extendInfo;
  }


  public void setExtendInfo(ClueFormCreateV2RequestExtendInfo extendInfo) {
    this.extendInfo = extendInfo;
  }


  public ClueFormCreateV2Request layerSubmitText(String layerSubmitText) {
    
    this.layerSubmitText = layerSubmitText;
    return this;
  }

   /**
   * 
   * @return layerSubmitText
  **/
  @javax.annotation.Nullable
  public String getLayerSubmitText() {
    return layerSubmitText;
  }


  public void setLayerSubmitText(String layerSubmitText) {
    this.layerSubmitText = layerSubmitText;
  }


  public ClueFormCreateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueFormCreateV2Request submitText(String submitText) {
    
    this.submitText = submitText;
    return this;
  }

   /**
   * 
   * @return submitText
  **/
  @javax.annotation.Nonnull
  public String getSubmitText() {
    return submitText;
  }


  public void setSubmitText(String submitText) {
    this.submitText = submitText;
  }


  public ClueFormCreateV2Request validateType(ClueFormCreateV2ValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nonnull
  public ClueFormCreateV2ValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueFormCreateV2ValidateType validateType) {
    this.validateType = validateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueFormCreateV2Request clueFormCreateV2Request = (ClueFormCreateV2Request) o;
    return Objects.equals(this.advertiserId, clueFormCreateV2Request.advertiserId) &&
        Objects.equals(this.elements, clueFormCreateV2Request.elements) &&
        Objects.equals(this.enableLayer, clueFormCreateV2Request.enableLayer) &&
        Objects.equals(this.extendInfo, clueFormCreateV2Request.extendInfo) &&
        Objects.equals(this.layerSubmitText, clueFormCreateV2Request.layerSubmitText) &&
        Objects.equals(this.name, clueFormCreateV2Request.name) &&
        Objects.equals(this.submitText, clueFormCreateV2Request.submitText) &&
        Objects.equals(this.validateType, clueFormCreateV2Request.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, elements, enableLayer, extendInfo, layerSubmitText, name, submitText, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    enableLayer: ").append(toIndentedString(enableLayer)).append("\n");
    sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
    sb.append("    layerSubmitText: ").append(toIndentedString(layerSubmitText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submitText: ").append(toIndentedString(submitText)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("elements");
    openapiFields.add("enable_layer");
    openapiFields.add("extend_info");
    openapiFields.add("layer_submit_text");
    openapiFields.add("name");
    openapiFields.add("submit_text");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("elements");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("submit_text");
    openapiRequiredFields.add("validate_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueFormCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueFormCreateV2Request
  */
  public static ClueFormCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormCreateV2Request.class);
  }

 /**
  * Convert an instance of ClueFormCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

