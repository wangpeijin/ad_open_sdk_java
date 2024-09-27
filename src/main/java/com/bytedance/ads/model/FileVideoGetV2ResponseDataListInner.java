/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * FileVideoGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class FileVideoGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_BIT_RATE = "bit_rate";
  @SerializedName(SERIALIZED_NAME_BIT_RATE)
  private Long bitRate = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_TAGS = "organization_tags";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_TAGS)
  private List<String> organizationTags = null;

  public static final String SERIALIZED_NAME_POSTER_URL = "poster_url";
  @SerializedName(SERIALIZED_NAME_POSTER_URL)
  private String posterUrl = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_STAR_AUTHOR_ID = "star_author_id";
  @SerializedName(SERIALIZED_NAME_STAR_AUTHOR_ID)
  private String starAuthorId = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public FileVideoGetV2ResponseDataListInner() {
  }

  public FileVideoGetV2ResponseDataListInner bitRate(Long bitRate) {
    
    this.bitRate = bitRate;
    return this;
  }

   /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id 
   * @return bitRate
  **/
  @javax.annotation.Nullable
  public Long getBitRate() {
    return bitRate;
  }


  public void setBitRate(Long bitRate) {
    this.bitRate = bitRate;
  }


  public FileVideoGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 素材的上传时间，格式：\&quot;yyyy-mm-dd HH:MM:SS\&quot; 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public FileVideoGetV2ResponseDataListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 码率，单位bps 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public FileVideoGetV2ResponseDataListInner filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 素材的文件名 
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileVideoGetV2ResponseDataListInner format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * 视频格式 
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public FileVideoGetV2ResponseDataListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 视频高度 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public FileVideoGetV2ResponseDataListInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 视频ID 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FileVideoGetV2ResponseDataListInner labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public FileVideoGetV2ResponseDataListInner addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 视频标签 
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public FileVideoGetV2ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 视频时长 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileVideoGetV2ResponseDataListInner organizationTags(List<String> organizationTags) {
    
    this.organizationTags = organizationTags;
    return this;
  }

  public FileVideoGetV2ResponseDataListInner addOrganizationTagsItem(String organizationTagsItem) {
    if (this.organizationTags == null) {
      this.organizationTags = new ArrayList<>();
    }
    this.organizationTags.add(organizationTagsItem);
    return this;
  }

   /**
   * 
   * @return organizationTags
  **/
  @javax.annotation.Nullable
  public List<String> getOrganizationTags() {
    return organizationTags;
  }


  public void setOrganizationTags(List<String> organizationTags) {
    this.organizationTags = organizationTags;
  }


  public FileVideoGetV2ResponseDataListInner posterUrl(String posterUrl) {
    
    this.posterUrl = posterUrl;
    return this;
  }

   /**
   * 视频首帧截图，仅限同主体进行素材预览查看，若非同主体会返回“素材所属主体与开发者主体不一致无法获取URL” 
   * @return posterUrl
  **/
  @javax.annotation.Nullable
  public String getPosterUrl() {
    return posterUrl;
  }


  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }


  public FileVideoGetV2ResponseDataListInner signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 视频md5值 
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public FileVideoGetV2ResponseDataListInner size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 视频大小 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public FileVideoGetV2ResponseDataListInner source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 素材来源，详见【附录-素材来源】 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public FileVideoGetV2ResponseDataListInner starAuthorId(String starAuthorId) {
    
    this.starAuthorId = starAuthorId;
    return this;
  }

   /**
   * 
   * @return starAuthorId
  **/
  @javax.annotation.Nullable
  public String getStarAuthorId() {
    return starAuthorId;
  }


  public void setStarAuthorId(String starAuthorId) {
    this.starAuthorId = starAuthorId;
  }


  public FileVideoGetV2ResponseDataListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 视频地址，仅限同主体进行素材预览查看，若非同主体会返回“素材所属主体与开发者主体不一致无法获取URL” 链接仅做预览使用，预览链接有效期为1小时
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FileVideoGetV2ResponseDataListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 视频宽度 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoGetV2ResponseDataListInner fileVideoGetV2ResponseDataListInner = (FileVideoGetV2ResponseDataListInner) o;
    return Objects.equals(this.bitRate, fileVideoGetV2ResponseDataListInner.bitRate) &&
        Objects.equals(this.createTime, fileVideoGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.duration, fileVideoGetV2ResponseDataListInner.duration) &&
        Objects.equals(this.filename, fileVideoGetV2ResponseDataListInner.filename) &&
        Objects.equals(this.format, fileVideoGetV2ResponseDataListInner.format) &&
        Objects.equals(this.height, fileVideoGetV2ResponseDataListInner.height) &&
        Objects.equals(this.id, fileVideoGetV2ResponseDataListInner.id) &&
        Objects.equals(this.labels, fileVideoGetV2ResponseDataListInner.labels) &&
        Objects.equals(this.materialId, fileVideoGetV2ResponseDataListInner.materialId) &&
        Objects.equals(this.organizationTags, fileVideoGetV2ResponseDataListInner.organizationTags) &&
        Objects.equals(this.posterUrl, fileVideoGetV2ResponseDataListInner.posterUrl) &&
        Objects.equals(this.signature, fileVideoGetV2ResponseDataListInner.signature) &&
        Objects.equals(this.size, fileVideoGetV2ResponseDataListInner.size) &&
        Objects.equals(this.source, fileVideoGetV2ResponseDataListInner.source) &&
        Objects.equals(this.starAuthorId, fileVideoGetV2ResponseDataListInner.starAuthorId) &&
        Objects.equals(this.url, fileVideoGetV2ResponseDataListInner.url) &&
        Objects.equals(this.width, fileVideoGetV2ResponseDataListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitRate, createTime, duration, filename, format, height, id, labels, materialId, organizationTags, posterUrl, signature, size, source, starAuthorId, url, width);
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
    sb.append("class FileVideoGetV2ResponseDataListInner {\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    organizationTags: ").append(toIndentedString(organizationTags)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    starAuthorId: ").append(toIndentedString(starAuthorId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("bit_rate");
    openapiFields.add("create_time");
    openapiFields.add("duration");
    openapiFields.add("filename");
    openapiFields.add("format");
    openapiFields.add("height");
    openapiFields.add("id");
    openapiFields.add("labels");
    openapiFields.add("material_id");
    openapiFields.add("organization_tags");
    openapiFields.add("poster_url");
    openapiFields.add("signature");
    openapiFields.add("size");
    openapiFields.add("source");
    openapiFields.add("star_author_id");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileVideoGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileVideoGetV2ResponseDataListInner
  */
  public static FileVideoGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileVideoGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

