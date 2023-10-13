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
import com.bytedance.ads.model.CreativeTemplateDetailGetV2DataTemplateIndex;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2DataTemplatePos;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class CreativeTemplateDetailGetV2ResponseData {
  public static final String SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA = "template_img_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA)
  private List<CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner> templateImgSchema = null;

  public static final String SERIALIZED_NAME_TEMPLATE_INDEX = "template_index";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_INDEX)
  private CreativeTemplateDetailGetV2DataTemplateIndex templateIndex = null;

  public static final String SERIALIZED_NAME_TEMPLATE_POS = "template_pos";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_POS)
  private CreativeTemplateDetailGetV2DataTemplatePos templatePos = null;

  public static final String SERIALIZED_NAME_TEMPLATE_POS_CUSTOM = "template_pos_custom";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_POS_CUSTOM)
  private List<Long> templatePosCustom = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA = "template_text_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA)
  private List<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner> templateTextSchema = null;

  public CreativeTemplateDetailGetV2ResponseData() {
  }

  public CreativeTemplateDetailGetV2ResponseData templateImgSchema(List<CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner> templateImgSchema) {
    
    this.templateImgSchema = templateImgSchema;
    return this;
  }

  public CreativeTemplateDetailGetV2ResponseData addTemplateImgSchemaItem(CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner templateImgSchemaItem) {
    if (this.templateImgSchema == null) {
      this.templateImgSchema = new ArrayList<>();
    }
    this.templateImgSchema.add(templateImgSchemaItem);
    return this;
  }

   /**
   * 模板填充的图片内容列表
   * @return templateImgSchema
  **/
  @javax.annotation.Nullable
  public List<CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner> getTemplateImgSchema() {
    return templateImgSchema;
  }


  public void setTemplateImgSchema(List<CreativeTemplateDetailGetV2ResponseDataTemplateImgSchemaInner> templateImgSchema) {
    this.templateImgSchema = templateImgSchema;
  }


  public CreativeTemplateDetailGetV2ResponseData templateIndex(CreativeTemplateDetailGetV2DataTemplateIndex templateIndex) {
    
    this.templateIndex = templateIndex;
    return this;
  }

   /**
   * Get templateIndex
   * @return templateIndex
  **/
  @javax.annotation.Nullable
  public CreativeTemplateDetailGetV2DataTemplateIndex getTemplateIndex() {
    return templateIndex;
  }


  public void setTemplateIndex(CreativeTemplateDetailGetV2DataTemplateIndex templateIndex) {
    this.templateIndex = templateIndex;
  }


  public CreativeTemplateDetailGetV2ResponseData templatePos(CreativeTemplateDetailGetV2DataTemplatePos templatePos) {
    
    this.templatePos = templatePos;
    return this;
  }

   /**
   * Get templatePos
   * @return templatePos
  **/
  @javax.annotation.Nullable
  public CreativeTemplateDetailGetV2DataTemplatePos getTemplatePos() {
    return templatePos;
  }


  public void setTemplatePos(CreativeTemplateDetailGetV2DataTemplatePos templatePos) {
    this.templatePos = templatePos;
  }


  public CreativeTemplateDetailGetV2ResponseData templatePosCustom(List<Long> templatePosCustom) {
    
    this.templatePosCustom = templatePosCustom;
    return this;
  }

  public CreativeTemplateDetailGetV2ResponseData addTemplatePosCustomItem(Long templatePosCustomItem) {
    if (this.templatePosCustom == null) {
      this.templatePosCustom = new ArrayList<>();
    }
    this.templatePosCustom.add(templatePosCustomItem);
    return this;
  }

   /**
   * 当模板与素材的位置关系为自定义时，该值表示素材出现在模板中基于左上角[x,y]的坐标，单位为像素
   * @return templatePosCustom
  **/
  @javax.annotation.Nullable
  public List<Long> getTemplatePosCustom() {
    return templatePosCustom;
  }


  public void setTemplatePosCustom(List<Long> templatePosCustom) {
    this.templatePosCustom = templatePosCustom;
  }


  public CreativeTemplateDetailGetV2ResponseData templateTextSchema(List<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner> templateTextSchema) {
    
    this.templateTextSchema = templateTextSchema;
    return this;
  }

  public CreativeTemplateDetailGetV2ResponseData addTemplateTextSchemaItem(CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner templateTextSchemaItem) {
    if (this.templateTextSchema == null) {
      this.templateTextSchema = new ArrayList<>();
    }
    this.templateTextSchema.add(templateTextSchemaItem);
    return this;
  }

   /**
   * 模板填充的文本内容列表
   * @return templateTextSchema
  **/
  @javax.annotation.Nullable
  public List<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner> getTemplateTextSchema() {
    return templateTextSchema;
  }


  public void setTemplateTextSchema(List<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner> templateTextSchema) {
    this.templateTextSchema = templateTextSchema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeTemplateDetailGetV2ResponseData creativeTemplateDetailGetV2ResponseData = (CreativeTemplateDetailGetV2ResponseData) o;
    return Objects.equals(this.templateImgSchema, creativeTemplateDetailGetV2ResponseData.templateImgSchema) &&
        Objects.equals(this.templateIndex, creativeTemplateDetailGetV2ResponseData.templateIndex) &&
        Objects.equals(this.templatePos, creativeTemplateDetailGetV2ResponseData.templatePos) &&
        Objects.equals(this.templatePosCustom, creativeTemplateDetailGetV2ResponseData.templatePosCustom) &&
        Objects.equals(this.templateTextSchema, creativeTemplateDetailGetV2ResponseData.templateTextSchema);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateImgSchema, templateIndex, templatePos, templatePosCustom, templateTextSchema);
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
    sb.append("class CreativeTemplateDetailGetV2ResponseData {\n");
    sb.append("    templateImgSchema: ").append(toIndentedString(templateImgSchema)).append("\n");
    sb.append("    templateIndex: ").append(toIndentedString(templateIndex)).append("\n");
    sb.append("    templatePos: ").append(toIndentedString(templatePos)).append("\n");
    sb.append("    templatePosCustom: ").append(toIndentedString(templatePosCustom)).append("\n");
    sb.append("    templateTextSchema: ").append(toIndentedString(templateTextSchema)).append("\n");
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
    openapiFields.add("template_img_schema");
    openapiFields.add("template_index");
    openapiFields.add("template_pos");
    openapiFields.add("template_pos_custom");
    openapiFields.add("template_text_schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeTemplateDetailGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeTemplateDetailGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeTemplateDetailGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeTemplateDetailGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeTemplateDetailGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CreativeTemplateDetailGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeTemplateDetailGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeTemplateDetailGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeTemplateDetailGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CreativeTemplateDetailGetV2ResponseData
  */
  public static CreativeTemplateDetailGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeTemplateDetailGetV2ResponseData.class);
  }

 /**
  * Convert an instance of CreativeTemplateDetailGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

