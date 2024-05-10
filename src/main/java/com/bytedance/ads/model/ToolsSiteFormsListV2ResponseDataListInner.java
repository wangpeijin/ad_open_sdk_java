/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * ToolsSiteFormsListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsSiteFormsListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_FORM_ID = "form_id";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private Long formId = null;

  public static final String SERIALIZED_NAME_FORM_INDEX = "form_index";
  @SerializedName(SERIALIZED_NAME_FORM_INDEX)
  private Long formIndex = null;

  public static final String SERIALIZED_NAME_FORM_NAME = "form_name";
  @SerializedName(SERIALIZED_NAME_FORM_NAME)
  private String formName = null;

  public ToolsSiteFormsListV2ResponseDataListInner() {
  }

  public ToolsSiteFormsListV2ResponseDataListInner formId(Long formId) {
    
    this.formId = formId;
    return this;
  }

   /**
   * 
   * @return formId
  **/
  @javax.annotation.Nullable
  public Long getFormId() {
    return formId;
  }


  public void setFormId(Long formId) {
    this.formId = formId;
  }


  public ToolsSiteFormsListV2ResponseDataListInner formIndex(Long formIndex) {
    
    this.formIndex = formIndex;
    return this;
  }

   /**
   * 
   * @return formIndex
  **/
  @javax.annotation.Nullable
  public Long getFormIndex() {
    return formIndex;
  }


  public void setFormIndex(Long formIndex) {
    this.formIndex = formIndex;
  }


  public ToolsSiteFormsListV2ResponseDataListInner formName(String formName) {
    
    this.formName = formName;
    return this;
  }

   /**
   * 
   * @return formName
  **/
  @javax.annotation.Nullable
  public String getFormName() {
    return formName;
  }


  public void setFormName(String formName) {
    this.formName = formName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteFormsListV2ResponseDataListInner toolsSiteFormsListV2ResponseDataListInner = (ToolsSiteFormsListV2ResponseDataListInner) o;
    return Objects.equals(this.formId, toolsSiteFormsListV2ResponseDataListInner.formId) &&
        Objects.equals(this.formIndex, toolsSiteFormsListV2ResponseDataListInner.formIndex) &&
        Objects.equals(this.formName, toolsSiteFormsListV2ResponseDataListInner.formName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, formIndex, formName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteFormsListV2ResponseDataListInner {\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    formIndex: ").append(toIndentedString(formIndex)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
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
    openapiFields.add("form_id");
    openapiFields.add("form_index");
    openapiFields.add("form_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteFormsListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteFormsListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteFormsListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteFormsListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteFormsListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteFormsListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteFormsListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteFormsListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteFormsListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteFormsListV2ResponseDataListInner
  */
  public static ToolsSiteFormsListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteFormsListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsSiteFormsListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

