/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueFormDetailV2ResponseDataElementsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsClueFormDetailV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<ToolsClueFormDetailV2ResponseDataElementsInner> elements = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle = null;

  public static final String SERIALIZED_NAME_SUBMIT_TEXT = "submit_text";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TEXT)
  private String submitText = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public ToolsClueFormDetailV2ResponseData() {
  }

  public ToolsClueFormDetailV2ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueFormDetailV2ResponseData elements(List<ToolsClueFormDetailV2ResponseDataElementsInner> elements) {
    
    this.elements = elements;
    return this;
  }

  public ToolsClueFormDetailV2ResponseData addElementsItem(ToolsClueFormDetailV2ResponseDataElementsInner elementsItem) {
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
  public List<ToolsClueFormDetailV2ResponseDataElementsInner> getElements() {
    return elements;
  }


  public void setElements(List<ToolsClueFormDetailV2ResponseDataElementsInner> elements) {
    this.elements = elements;
  }


  public ToolsClueFormDetailV2ResponseData instanceId(Long instanceId) {
    
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


  public ToolsClueFormDetailV2ResponseData name(String name) {
    
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


  public ToolsClueFormDetailV2ResponseData subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 
   * @return subTitle
  **/
  @javax.annotation.Nullable
  public String getSubTitle() {
    return subTitle;
  }


  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public ToolsClueFormDetailV2ResponseData submitText(String submitText) {
    
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


  public ToolsClueFormDetailV2ResponseData title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
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
    ToolsClueFormDetailV2ResponseData toolsClueFormDetailV2ResponseData = (ToolsClueFormDetailV2ResponseData) o;
    return Objects.equals(this.advertiserId, toolsClueFormDetailV2ResponseData.advertiserId) &&
        Objects.equals(this.elements, toolsClueFormDetailV2ResponseData.elements) &&
        Objects.equals(this.instanceId, toolsClueFormDetailV2ResponseData.instanceId) &&
        Objects.equals(this.name, toolsClueFormDetailV2ResponseData.name) &&
        Objects.equals(this.subTitle, toolsClueFormDetailV2ResponseData.subTitle) &&
        Objects.equals(this.submitText, toolsClueFormDetailV2ResponseData.submitText) &&
        Objects.equals(this.title, toolsClueFormDetailV2ResponseData.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, elements, instanceId, name, subTitle, submitText, title);
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
    sb.append("class ToolsClueFormDetailV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    submitText: ").append(toIndentedString(submitText)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("elements");
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("sub_title");
    openapiFields.add("submit_text");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueFormDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueFormDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueFormDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueFormDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueFormDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueFormDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueFormDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueFormDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueFormDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueFormDetailV2ResponseData
  */
  public static ToolsClueFormDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueFormDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueFormDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

