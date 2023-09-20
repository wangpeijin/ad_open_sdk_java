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
import com.bytedance.ads.model.ClueFormDetailV2DataFormEnableLayer;
import com.bytedance.ads.model.ClueFormDetailV2DataFormFormType;
import com.bytedance.ads.model.ClueFormDetailV2DataFormIsDel;
import com.bytedance.ads.model.ClueFormDetailV2DataFormValidateType;
import com.bytedance.ads.model.ClueFormDetailV2ResponseDataFormElementsInner;
import com.bytedance.ads.model.ClueFormDetailV2ResponseDataFormExtendInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ClueFormDetailV2ResponseDataForm {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<ClueFormDetailV2ResponseDataFormElementsInner> elements = null;

  public static final String SERIALIZED_NAME_ENABLE_LAYER = "enable_layer";
  @SerializedName(SERIALIZED_NAME_ENABLE_LAYER)
  private ClueFormDetailV2DataFormEnableLayer enableLayer = null;

  public static final String SERIALIZED_NAME_EXTEND_INFO = "extend_info";
  @SerializedName(SERIALIZED_NAME_EXTEND_INFO)
  private ClueFormDetailV2ResponseDataFormExtendInfo extendInfo = null;

  public static final String SERIALIZED_NAME_FORM_TYPE = "form_type";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private ClueFormDetailV2DataFormFormType formType = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IS_DEL = "is_del";
  @SerializedName(SERIALIZED_NAME_IS_DEL)
  private ClueFormDetailV2DataFormIsDel isDel = null;

  public static final String SERIALIZED_NAME_LAYER_SUBMIT_TEXT = "layer_submit_text";
  @SerializedName(SERIALIZED_NAME_LAYER_SUBMIT_TEXT)
  private String layerSubmitText = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUBMIT_TEXT = "submit_text";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TEXT)
  private String submitText = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueFormDetailV2DataFormValidateType validateType = null;

  public ClueFormDetailV2ResponseDataForm() {
  }

  
  public ClueFormDetailV2ResponseDataForm(
     String createTime, 
     String updateTime
  ) {
    this();
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public ClueFormDetailV2ResponseDataForm elements(List<ClueFormDetailV2ResponseDataFormElementsInner> elements) {
    
    this.elements = elements;
    return this;
  }

  public ClueFormDetailV2ResponseDataForm addElementsItem(ClueFormDetailV2ResponseDataFormElementsInner elementsItem) {
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
  @javax.annotation.Nullable
  public List<ClueFormDetailV2ResponseDataFormElementsInner> getElements() {
    return elements;
  }


  public void setElements(List<ClueFormDetailV2ResponseDataFormElementsInner> elements) {
    this.elements = elements;
  }


  public ClueFormDetailV2ResponseDataForm enableLayer(ClueFormDetailV2DataFormEnableLayer enableLayer) {
    
    this.enableLayer = enableLayer;
    return this;
  }

   /**
   * Get enableLayer
   * @return enableLayer
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2DataFormEnableLayer getEnableLayer() {
    return enableLayer;
  }


  public void setEnableLayer(ClueFormDetailV2DataFormEnableLayer enableLayer) {
    this.enableLayer = enableLayer;
  }


  public ClueFormDetailV2ResponseDataForm extendInfo(ClueFormDetailV2ResponseDataFormExtendInfo extendInfo) {
    
    this.extendInfo = extendInfo;
    return this;
  }

   /**
   * Get extendInfo
   * @return extendInfo
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2ResponseDataFormExtendInfo getExtendInfo() {
    return extendInfo;
  }


  public void setExtendInfo(ClueFormDetailV2ResponseDataFormExtendInfo extendInfo) {
    this.extendInfo = extendInfo;
  }


  public ClueFormDetailV2ResponseDataForm formType(ClueFormDetailV2DataFormFormType formType) {
    
    this.formType = formType;
    return this;
  }

   /**
   * Get formType
   * @return formType
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2DataFormFormType getFormType() {
    return formType;
  }


  public void setFormType(ClueFormDetailV2DataFormFormType formType) {
    this.formType = formType;
  }


  public ClueFormDetailV2ResponseDataForm instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueFormDetailV2ResponseDataForm isDel(ClueFormDetailV2DataFormIsDel isDel) {
    
    this.isDel = isDel;
    return this;
  }

   /**
   * Get isDel
   * @return isDel
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2DataFormIsDel getIsDel() {
    return isDel;
  }


  public void setIsDel(ClueFormDetailV2DataFormIsDel isDel) {
    this.isDel = isDel;
  }


  public ClueFormDetailV2ResponseDataForm layerSubmitText(String layerSubmitText) {
    
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


  public ClueFormDetailV2ResponseDataForm name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueFormDetailV2ResponseDataForm submitText(String submitText) {
    
    this.submitText = submitText;
    return this;
  }

   /**
   * 
   * @return submitText
  **/
  @javax.annotation.Nullable
  public String getSubmitText() {
    return submitText;
  }


  public void setSubmitText(String submitText) {
    this.submitText = submitText;
  }


   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }




  public ClueFormDetailV2ResponseDataForm validateType(ClueFormDetailV2DataFormValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nullable
  public ClueFormDetailV2DataFormValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueFormDetailV2DataFormValidateType validateType) {
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
    ClueFormDetailV2ResponseDataForm clueFormDetailV2ResponseDataForm = (ClueFormDetailV2ResponseDataForm) o;
    return Objects.equals(this.createTime, clueFormDetailV2ResponseDataForm.createTime) &&
        Objects.equals(this.elements, clueFormDetailV2ResponseDataForm.elements) &&
        Objects.equals(this.enableLayer, clueFormDetailV2ResponseDataForm.enableLayer) &&
        Objects.equals(this.extendInfo, clueFormDetailV2ResponseDataForm.extendInfo) &&
        Objects.equals(this.formType, clueFormDetailV2ResponseDataForm.formType) &&
        Objects.equals(this.instanceId, clueFormDetailV2ResponseDataForm.instanceId) &&
        Objects.equals(this.isDel, clueFormDetailV2ResponseDataForm.isDel) &&
        Objects.equals(this.layerSubmitText, clueFormDetailV2ResponseDataForm.layerSubmitText) &&
        Objects.equals(this.name, clueFormDetailV2ResponseDataForm.name) &&
        Objects.equals(this.submitText, clueFormDetailV2ResponseDataForm.submitText) &&
        Objects.equals(this.updateTime, clueFormDetailV2ResponseDataForm.updateTime) &&
        Objects.equals(this.validateType, clueFormDetailV2ResponseDataForm.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, elements, enableLayer, extendInfo, formType, instanceId, isDel, layerSubmitText, name, submitText, updateTime, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormDetailV2ResponseDataForm {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    enableLayer: ").append(toIndentedString(enableLayer)).append("\n");
    sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isDel: ").append(toIndentedString(isDel)).append("\n");
    sb.append("    layerSubmitText: ").append(toIndentedString(layerSubmitText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submitText: ").append(toIndentedString(submitText)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("elements");
    openapiFields.add("enable_layer");
    openapiFields.add("extend_info");
    openapiFields.add("form_type");
    openapiFields.add("instance_id");
    openapiFields.add("is_del");
    openapiFields.add("layer_submit_text");
    openapiFields.add("name");
    openapiFields.add("submit_text");
    openapiFields.add("update_time");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormDetailV2ResponseDataForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormDetailV2ResponseDataForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormDetailV2ResponseDataForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormDetailV2ResponseDataForm.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormDetailV2ResponseDataForm>() {
           @Override
           public void write(JsonWriter out, ClueFormDetailV2ResponseDataForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormDetailV2ResponseDataForm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormDetailV2ResponseDataForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormDetailV2ResponseDataForm
  * @throws IOException if the JSON string is invalid with respect to ClueFormDetailV2ResponseDataForm
  */
  public static ClueFormDetailV2ResponseDataForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormDetailV2ResponseDataForm.class);
  }

 /**
  * Convert an instance of ClueFormDetailV2ResponseDataForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

