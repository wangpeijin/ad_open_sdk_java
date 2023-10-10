/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2TemplatesTemplateType;
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
 * CreativeAutoGenerateConfigCreateV2RequestTemplatesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class CreativeAutoGenerateConfigCreateV2RequestTemplatesInner {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA = "template_img_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA)
  private List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner> templateImgSchema = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA = "template_text_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA)
  private List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner> templateTextSchema = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private CreativeAutoGenerateConfigCreateV2TemplatesTemplateType templateType = null;

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner() {
  }

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner templateImgSchema(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner> templateImgSchema) {
    
    this.templateImgSchema = templateImgSchema;
    return this;
  }

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner addTemplateImgSchemaItem(CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner templateImgSchemaItem) {
    if (this.templateImgSchema == null) {
      this.templateImgSchema = new ArrayList<>();
    }
    this.templateImgSchema.add(templateImgSchemaItem);
    return this;
  }

   /**
   * 模板填充的图片内容，不填写则表示使用默认填充值
   * @return templateImgSchema
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner> getTemplateImgSchema() {
    return templateImgSchema;
  }


  public void setTemplateImgSchema(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner> templateImgSchema) {
    this.templateImgSchema = templateImgSchema;
  }


  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner templateTextSchema(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner> templateTextSchema) {
    
    this.templateTextSchema = templateTextSchema;
    return this;
  }

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner addTemplateTextSchemaItem(CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner templateTextSchemaItem) {
    if (this.templateTextSchema == null) {
      this.templateTextSchema = new ArrayList<>();
    }
    this.templateTextSchema.add(templateTextSchemaItem);
    return this;
  }

   /**
   * 模板填充的文本内容，不填写则表示使用默认填充值
   * @return templateTextSchema
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner> getTemplateTextSchema() {
    return templateTextSchema;
  }


  public void setTemplateTextSchema(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateTextSchemaInner> templateTextSchema) {
    this.templateTextSchema = templateTextSchema;
  }


  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner templateType(CreativeAutoGenerateConfigCreateV2TemplatesTemplateType templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @javax.annotation.Nullable
  public CreativeAutoGenerateConfigCreateV2TemplatesTemplateType getTemplateType() {
    return templateType;
  }


  public void setTemplateType(CreativeAutoGenerateConfigCreateV2TemplatesTemplateType templateType) {
    this.templateType = templateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigCreateV2RequestTemplatesInner creativeAutoGenerateConfigCreateV2RequestTemplatesInner = (CreativeAutoGenerateConfigCreateV2RequestTemplatesInner) o;
    return Objects.equals(this.templateId, creativeAutoGenerateConfigCreateV2RequestTemplatesInner.templateId) &&
        Objects.equals(this.templateImgSchema, creativeAutoGenerateConfigCreateV2RequestTemplatesInner.templateImgSchema) &&
        Objects.equals(this.templateTextSchema, creativeAutoGenerateConfigCreateV2RequestTemplatesInner.templateTextSchema) &&
        Objects.equals(this.templateType, creativeAutoGenerateConfigCreateV2RequestTemplatesInner.templateType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateImgSchema, templateTextSchema, templateType);
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
    sb.append("class CreativeAutoGenerateConfigCreateV2RequestTemplatesInner {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateImgSchema: ").append(toIndentedString(templateImgSchema)).append("\n");
    sb.append("    templateTextSchema: ").append(toIndentedString(templateTextSchema)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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
    openapiFields.add("template_id");
    openapiFields.add("template_img_schema");
    openapiFields.add("template_text_schema");
    openapiFields.add("template_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_id");
    openapiRequiredFields.add("template_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigCreateV2RequestTemplatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigCreateV2RequestTemplatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigCreateV2RequestTemplatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigCreateV2RequestTemplatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigCreateV2RequestTemplatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInner
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigCreateV2RequestTemplatesInner
  */
  public static CreativeAutoGenerateConfigCreateV2RequestTemplatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigCreateV2RequestTemplatesInner.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

