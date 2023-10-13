/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10CreativeListPromotionCardMaterialButtonSmartOptimization;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial {
  public static final String SERIALIZED_NAME_ACTION_BUTTON = "action_button";
  @SerializedName(SERIALIZED_NAME_ACTION_BUTTON)
  private String actionButton = null;

  public static final String SERIALIZED_NAME_BUTTON_SMART_OPTIMIZATION = "button_smart_optimization";
  @SerializedName(SERIALIZED_NAME_BUTTON_SMART_OPTIMIZATION)
  private QianchuanAdUpdateV10CreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_SELLING_POINTS = "selling_points";
  @SerializedName(SERIALIZED_NAME_SELLING_POINTS)
  private List<String> sellingPoints = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial() {
  }

  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial actionButton(String actionButton) {
    
    this.actionButton = actionButton;
    return this;
  }

   /**
   * 
   * @return actionButton
  **/
  @javax.annotation.Nullable
  public String getActionButton() {
    return actionButton;
  }


  public void setActionButton(String actionButton) {
    this.actionButton = actionButton;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial buttonSmartOptimization(QianchuanAdUpdateV10CreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization) {
    
    this.buttonSmartOptimization = buttonSmartOptimization;
    return this;
  }

   /**
   * Get buttonSmartOptimization
   * @return buttonSmartOptimization
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10CreativeListPromotionCardMaterialButtonSmartOptimization getButtonSmartOptimization() {
    return buttonSmartOptimization;
  }


  public void setButtonSmartOptimization(QianchuanAdUpdateV10CreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization) {
    this.buttonSmartOptimization = buttonSmartOptimization;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial sellingPoints(List<String> sellingPoints) {
    
    this.sellingPoints = sellingPoints;
    return this;
  }

  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial addSellingPointsItem(String sellingPointsItem) {
    if (this.sellingPoints == null) {
      this.sellingPoints = new ArrayList<>();
    }
    this.sellingPoints.add(sellingPointsItem);
    return this;
  }

   /**
   * 
   * @return sellingPoints
  **/
  @javax.annotation.Nullable
  public List<String> getSellingPoints() {
    return sellingPoints;
  }


  public void setSellingPoints(List<String> sellingPoints) {
    this.sellingPoints = sellingPoints;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial title(String title) {
    
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
    QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial = (QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial) o;
    return Objects.equals(this.actionButton, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.actionButton) &&
        Objects.equals(this.buttonSmartOptimization, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.buttonSmartOptimization) &&
        Objects.equals(this.componentId, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.componentId) &&
        Objects.equals(this.id, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.id) &&
        Objects.equals(this.imageId, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.imageId) &&
        Objects.equals(this.sellingPoints, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.sellingPoints) &&
        Objects.equals(this.title, qianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionButton, buttonSmartOptimization, componentId, id, imageId, sellingPoints, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial {\n");
    sb.append("    actionButton: ").append(toIndentedString(actionButton)).append("\n");
    sb.append("    buttonSmartOptimization: ").append(toIndentedString(buttonSmartOptimization)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sellingPoints: ").append(toIndentedString(sellingPoints)).append("\n");
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
    openapiFields.add("action_button");
    openapiFields.add("button_smart_optimization");
    openapiFields.add("component_id");
    openapiFields.add("id");
    openapiFields.add("image_id");
    openapiFields.add("selling_points");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial
  */
  public static QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

