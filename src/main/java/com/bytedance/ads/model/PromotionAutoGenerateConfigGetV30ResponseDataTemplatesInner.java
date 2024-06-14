/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner;
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
 * PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA = "template_img_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMG_SCHEMA)
  private List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner> templateImgSchema = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA = "template_text_schema";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TEXT_SCHEMA)
  private List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner> templateTextSchema = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType templateType = null;

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner() {
  }

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner templateId(Long templateId) {
    
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


  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner templateImgSchema(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner> templateImgSchema) {
    
    this.templateImgSchema = templateImgSchema;
    return this;
  }

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner addTemplateImgSchemaItem(PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner templateImgSchemaItem) {
    if (this.templateImgSchema == null) {
      this.templateImgSchema = new ArrayList<>();
    }
    this.templateImgSchema.add(templateImgSchemaItem);
    return this;
  }

   /**
   * 模板填充的图片内容
   * @return templateImgSchema
  **/
  @javax.annotation.Nullable
  public List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner> getTemplateImgSchema() {
    return templateImgSchema;
  }


  public void setTemplateImgSchema(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateImgSchemaInner> templateImgSchema) {
    this.templateImgSchema = templateImgSchema;
  }


  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner templateTextSchema(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner> templateTextSchema) {
    
    this.templateTextSchema = templateTextSchema;
    return this;
  }

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner addTemplateTextSchemaItem(PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner templateTextSchemaItem) {
    if (this.templateTextSchema == null) {
      this.templateTextSchema = new ArrayList<>();
    }
    this.templateTextSchema.add(templateTextSchemaItem);
    return this;
  }

   /**
   * 模板填充的文本内容
   * @return templateTextSchema
  **/
  @javax.annotation.Nullable
  public List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner> getTemplateTextSchema() {
    return templateTextSchema;
  }


  public void setTemplateTextSchema(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner> templateTextSchema) {
    this.templateTextSchema = templateTextSchema;
  }


  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner templateType(PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @javax.annotation.Nullable
  public PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType getTemplateType() {
    return templateType;
  }


  public void setTemplateType(PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType templateType) {
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
    PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner promotionAutoGenerateConfigGetV30ResponseDataTemplatesInner = (PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner) o;
    return Objects.equals(this.templateId, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.templateId) &&
        Objects.equals(this.templateImgSchema, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.templateImgSchema) &&
        Objects.equals(this.templateTextSchema, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.templateTextSchema) &&
        Objects.equals(this.templateType, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.templateType);
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
    sb.append("class PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner {\n");
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
       if (!PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner
  */
  public static PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

