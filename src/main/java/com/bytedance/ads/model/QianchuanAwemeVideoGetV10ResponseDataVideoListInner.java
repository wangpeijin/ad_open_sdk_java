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
import com.bytedance.ads.model.QianchuanAwemeVideoGetV10DataVideoListIsImage;
import com.bytedance.ads.model.QianchuanAwemeVideoGetV10DataVideoListIsRecommend;
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
 * QianchuanAwemeVideoGetV10ResponseDataVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanAwemeVideoGetV10ResponseDataVideoListInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMG_URL = "img_url";
  @SerializedName(SERIALIZED_NAME_IMG_URL)
  private List<String> imgUrl = null;

  public static final String SERIALIZED_NAME_IS_AI_CREATE = "is_ai_create";
  @SerializedName(SERIALIZED_NAME_IS_AI_CREATE)
  private Boolean isAiCreate = null;

  public static final String SERIALIZED_NAME_IS_IMAGE = "is_image";
  @SerializedName(SERIALIZED_NAME_IS_IMAGE)
  private QianchuanAwemeVideoGetV10DataVideoListIsImage isImage = null;

  public static final String SERIALIZED_NAME_IS_RECOMMEND = "is_recommend";
  @SerializedName(SERIALIZED_NAME_IS_RECOMMEND)
  private QianchuanAwemeVideoGetV10DataVideoListIsRecommend isRecommend = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner() {
  }

  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音短视频 ID
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 视频时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner height(Long height) {
    
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


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner imgUrl(List<String> imgUrl) {
    
    this.imgUrl = imgUrl;
    return this;
  }

  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner addImgUrlItem(String imgUrlItem) {
    if (this.imgUrl == null) {
      this.imgUrl = new ArrayList<>();
    }
    this.imgUrl.add(imgUrlItem);
    return this;
  }

   /**
   * 图集列表
   * @return imgUrl
  **/
  @javax.annotation.Nullable
  public List<String> getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(List<String> imgUrl) {
    this.imgUrl = imgUrl;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner isAiCreate(Boolean isAiCreate) {
    
    this.isAiCreate = isAiCreate;
    return this;
  }

   /**
   * 是否为AI生成的视频
   * @return isAiCreate
  **/
  @javax.annotation.Nullable
  public Boolean getIsAiCreate() {
    return isAiCreate;
  }


  public void setIsAiCreate(Boolean isAiCreate) {
    this.isAiCreate = isAiCreate;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner isImage(QianchuanAwemeVideoGetV10DataVideoListIsImage isImage) {
    
    this.isImage = isImage;
    return this;
  }

   /**
   * Get isImage
   * @return isImage
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeVideoGetV10DataVideoListIsImage getIsImage() {
    return isImage;
  }


  public void setIsImage(QianchuanAwemeVideoGetV10DataVideoListIsImage isImage) {
    this.isImage = isImage;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner isRecommend(QianchuanAwemeVideoGetV10DataVideoListIsRecommend isRecommend) {
    
    this.isRecommend = isRecommend;
    return this;
  }

   /**
   * Get isRecommend
   * @return isRecommend
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeVideoGetV10DataVideoListIsRecommend getIsRecommend() {
    return isRecommend;
  }


  public void setIsRecommend(QianchuanAwemeVideoGetV10DataVideoListIsRecommend isRecommend) {
    this.isRecommend = isRecommend;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 抖音中的视频标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 视频地址，链接1小时过期
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner videoCoverUrl(String videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

   /**
   * 视频封面图片url
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public String getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(String videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public QianchuanAwemeVideoGetV10ResponseDataVideoListInner width(Long width) {
    
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
    QianchuanAwemeVideoGetV10ResponseDataVideoListInner qianchuanAwemeVideoGetV10ResponseDataVideoListInner = (QianchuanAwemeVideoGetV10ResponseDataVideoListInner) o;
    return Objects.equals(this.awemeItemId, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.awemeItemId) &&
        Objects.equals(this.duration, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.duration) &&
        Objects.equals(this.height, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.height) &&
        Objects.equals(this.imgUrl, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.imgUrl) &&
        Objects.equals(this.isAiCreate, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.isAiCreate) &&
        Objects.equals(this.isImage, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.isImage) &&
        Objects.equals(this.isRecommend, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.isRecommend) &&
        Objects.equals(this.title, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.title) &&
        Objects.equals(this.url, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.url) &&
        Objects.equals(this.videoCoverUrl, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.videoCoverUrl) &&
        Objects.equals(this.width, qianchuanAwemeVideoGetV10ResponseDataVideoListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, duration, height, imgUrl, isAiCreate, isImage, isRecommend, title, url, videoCoverUrl, width);
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
    sb.append("class QianchuanAwemeVideoGetV10ResponseDataVideoListInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    isAiCreate: ").append(toIndentedString(isAiCreate)).append("\n");
    sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
    sb.append("    isRecommend: ").append(toIndentedString(isRecommend)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("duration");
    openapiFields.add("height");
    openapiFields.add("img_url");
    openapiFields.add("is_ai_create");
    openapiFields.add("is_image");
    openapiFields.add("is_recommend");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("video_cover_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeVideoGetV10ResponseDataVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeVideoGetV10ResponseDataVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeVideoGetV10ResponseDataVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeVideoGetV10ResponseDataVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeVideoGetV10ResponseDataVideoListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeVideoGetV10ResponseDataVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeVideoGetV10ResponseDataVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeVideoGetV10ResponseDataVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeVideoGetV10ResponseDataVideoListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeVideoGetV10ResponseDataVideoListInner
  */
  public static QianchuanAwemeVideoGetV10ResponseDataVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeVideoGetV10ResponseDataVideoListInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeVideoGetV10ResponseDataVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

