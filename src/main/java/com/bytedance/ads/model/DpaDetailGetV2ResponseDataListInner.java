/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerBrandInfo;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerImageUrlsInner;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerLandingInfo;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerPriceInfo;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerShopKeeperInfo;
import com.bytedance.ads.model.DpaDetailGetV2ResponseDataListInnerVideosInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * DpaDetailGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class DpaDetailGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<Long> age = null;

  public static final String SERIALIZED_NAME_BOUGHT = "bought";
  @SerializedName(SERIALIZED_NAME_BOUGHT)
  private Long bought = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private DpaDetailGetV2ResponseDataListInnerBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Long comments = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY = "first_category";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY)
  private String firstCategory = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY_ID = "first_category_id";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_ID)
  private String firstCategoryId = null;

  public static final String SERIALIZED_NAME_HAS_VIDEO = "has_video";
  @SerializedName(SERIALIZED_NAME_HAS_VIDEO)
  private Integer hasVideo = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private List<DpaDetailGetV2ResponseDataListInnerImageUrlsInner> imageUrls = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private List<String> label = null;

  public static final String SERIALIZED_NAME_LANDING_INFO = "landing_info";
  @SerializedName(SERIALIZED_NAME_LANDING_INFO)
  private DpaDetailGetV2ResponseDataListInnerLandingInfo landingInfo = null;

  public static final String SERIALIZED_NAME_MARK = "mark";
  @SerializedName(SERIALIZED_NAME_MARK)
  private Double mark = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OFFLINE_TIME = "offline_time";
  @SerializedName(SERIALIZED_NAME_OFFLINE_TIME)
  private Long offlineTime = null;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private Long onlineTime = null;

  public static final String SERIALIZED_NAME_OUTER_ID = "outer_id";
  @SerializedName(SERIALIZED_NAME_OUTER_ID)
  private String outerId = null;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private Long platformId = null;

  public static final String SERIALIZED_NAME_PRICE_INFO = "price_info";
  @SerializedName(SERIALIZED_NAME_PRICE_INFO)
  private DpaDetailGetV2ResponseDataListInnerPriceInfo priceInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROFESSION = "profession";
  @SerializedName(SERIALIZED_NAME_PROFESSION)
  private Map<String, String> profession = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_INFO = "shop_keeper_info";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_INFO)
  private DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperInfo = null;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock = null;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "sub_category";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private String subCategory = null;

  public static final String SERIALIZED_NAME_SUB_CATEGORY_ID = "sub_category_id";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_ID)
  private String subCategoryId = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY = "third_category";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY)
  private String thirdCategory = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_ID = "third_category_id";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_ID)
  private String thirdCategoryId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private String video = null;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<DpaDetailGetV2ResponseDataListInnerVideosInner> videos = null;

  public DpaDetailGetV2ResponseDataListInner() {
  }

  public DpaDetailGetV2ResponseDataListInner age(List<Long> age) {
    
    this.age = age;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addAgeItem(Long ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<Long> getAge() {
    return age;
  }


  public void setAge(List<Long> age) {
    this.age = age;
  }


  public DpaDetailGetV2ResponseDataListInner bought(Long bought) {
    
    this.bought = bought;
    return this;
  }

   /**
   * 
   * @return bought
  **/
  @javax.annotation.Nullable
  public Long getBought() {
    return bought;
  }


  public void setBought(Long bought) {
    this.bought = bought;
  }


  public DpaDetailGetV2ResponseDataListInner brandInfo(DpaDetailGetV2ResponseDataListInnerBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2ResponseDataListInnerBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(DpaDetailGetV2ResponseDataListInnerBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public DpaDetailGetV2ResponseDataListInner city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addCityItem(String cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public DpaDetailGetV2ResponseDataListInner comments(Long comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * 
   * @return comments
  **/
  @javax.annotation.Nullable
  public Long getComments() {
    return comments;
  }


  public void setComments(Long comments) {
    this.comments = comments;
  }


  public DpaDetailGetV2ResponseDataListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DpaDetailGetV2ResponseDataListInner feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * 
   * @return feature
  **/
  @javax.annotation.Nullable
  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public DpaDetailGetV2ResponseDataListInner firstCategory(String firstCategory) {
    
    this.firstCategory = firstCategory;
    return this;
  }

   /**
   * 
   * @return firstCategory
  **/
  @javax.annotation.Nullable
  public String getFirstCategory() {
    return firstCategory;
  }


  public void setFirstCategory(String firstCategory) {
    this.firstCategory = firstCategory;
  }


  public DpaDetailGetV2ResponseDataListInner firstCategoryId(String firstCategoryId) {
    
    this.firstCategoryId = firstCategoryId;
    return this;
  }

   /**
   * 
   * @return firstCategoryId
  **/
  @javax.annotation.Nullable
  public String getFirstCategoryId() {
    return firstCategoryId;
  }


  public void setFirstCategoryId(String firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }


  public DpaDetailGetV2ResponseDataListInner hasVideo(Integer hasVideo) {
    
    this.hasVideo = hasVideo;
    return this;
  }

   /**
   * 
   * @return hasVideo
  **/
  @javax.annotation.Nullable
  public Integer getHasVideo() {
    return hasVideo;
  }


  public void setHasVideo(Integer hasVideo) {
    this.hasVideo = hasVideo;
  }


  public DpaDetailGetV2ResponseDataListInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public DpaDetailGetV2ResponseDataListInner imageUrls(List<DpaDetailGetV2ResponseDataListInnerImageUrlsInner> imageUrls) {
    
    this.imageUrls = imageUrls;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addImageUrlsItem(DpaDetailGetV2ResponseDataListInnerImageUrlsInner imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * 
   * @return imageUrls
  **/
  @javax.annotation.Nullable
  public List<DpaDetailGetV2ResponseDataListInnerImageUrlsInner> getImageUrls() {
    return imageUrls;
  }


  public void setImageUrls(List<DpaDetailGetV2ResponseDataListInnerImageUrlsInner> imageUrls) {
    this.imageUrls = imageUrls;
  }


  public DpaDetailGetV2ResponseDataListInner label(List<String> label) {
    
    this.label = label;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public List<String> getLabel() {
    return label;
  }


  public void setLabel(List<String> label) {
    this.label = label;
  }


  public DpaDetailGetV2ResponseDataListInner landingInfo(DpaDetailGetV2ResponseDataListInnerLandingInfo landingInfo) {
    
    this.landingInfo = landingInfo;
    return this;
  }

   /**
   * Get landingInfo
   * @return landingInfo
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2ResponseDataListInnerLandingInfo getLandingInfo() {
    return landingInfo;
  }


  public void setLandingInfo(DpaDetailGetV2ResponseDataListInnerLandingInfo landingInfo) {
    this.landingInfo = landingInfo;
  }


  public DpaDetailGetV2ResponseDataListInner mark(Double mark) {
    
    this.mark = mark;
    return this;
  }

   /**
   * 
   * @return mark
  **/
  @javax.annotation.Nullable
  public Double getMark() {
    return mark;
  }


  public void setMark(Double mark) {
    this.mark = mark;
  }


  public DpaDetailGetV2ResponseDataListInner name(String name) {
    
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


  public DpaDetailGetV2ResponseDataListInner offlineTime(Long offlineTime) {
    
    this.offlineTime = offlineTime;
    return this;
  }

   /**
   * 
   * @return offlineTime
  **/
  @javax.annotation.Nullable
  public Long getOfflineTime() {
    return offlineTime;
  }


  public void setOfflineTime(Long offlineTime) {
    this.offlineTime = offlineTime;
  }


  public DpaDetailGetV2ResponseDataListInner onlineTime(Long onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  public Long getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(Long onlineTime) {
    this.onlineTime = onlineTime;
  }


  public DpaDetailGetV2ResponseDataListInner outerId(String outerId) {
    
    this.outerId = outerId;
    return this;
  }

   /**
   * 
   * @return outerId
  **/
  @javax.annotation.Nullable
  public String getOuterId() {
    return outerId;
  }


  public void setOuterId(String outerId) {
    this.outerId = outerId;
  }


  public DpaDetailGetV2ResponseDataListInner platformId(Long platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * 
   * @return platformId
  **/
  @javax.annotation.Nullable
  public Long getPlatformId() {
    return platformId;
  }


  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }


  public DpaDetailGetV2ResponseDataListInner priceInfo(DpaDetailGetV2ResponseDataListInnerPriceInfo priceInfo) {
    
    this.priceInfo = priceInfo;
    return this;
  }

   /**
   * Get priceInfo
   * @return priceInfo
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2ResponseDataListInnerPriceInfo getPriceInfo() {
    return priceInfo;
  }


  public void setPriceInfo(DpaDetailGetV2ResponseDataListInnerPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }


  public DpaDetailGetV2ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaDetailGetV2ResponseDataListInner profession(Map<String, String> profession) {
    
    this.profession = profession;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner putProfessionItem(String key, String professionItem) {
    if (this.profession == null) {
      this.profession = new HashMap<>();
    }
    this.profession.put(key, professionItem);
    return this;
  }

   /**
   * 
   * @return profession
  **/
  @javax.annotation.Nullable
  public Map<String, String> getProfession() {
    return profession;
  }


  public void setProfession(Map<String, String> profession) {
    this.profession = profession;
  }


  public DpaDetailGetV2ResponseDataListInner province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 
   * @return province
  **/
  @javax.annotation.Nullable
  public List<String> getProvince() {
    return province;
  }


  public void setProvince(List<String> province) {
    this.province = province;
  }


  public DpaDetailGetV2ResponseDataListInner shopKeeperInfo(DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperInfo) {
    
    this.shopKeeperInfo = shopKeeperInfo;
    return this;
  }

   /**
   * Get shopKeeperInfo
   * @return shopKeeperInfo
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo getShopKeeperInfo() {
    return shopKeeperInfo;
  }


  public void setShopKeeperInfo(DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperInfo) {
    this.shopKeeperInfo = shopKeeperInfo;
  }


  public DpaDetailGetV2ResponseDataListInner spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 
   * @return spuId
  **/
  @javax.annotation.Nullable
  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public DpaDetailGetV2ResponseDataListInner status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public DpaDetailGetV2ResponseDataListInner stock(Integer stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * 
   * @return stock
  **/
  @javax.annotation.Nullable
  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public DpaDetailGetV2ResponseDataListInner subCategory(String subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * 
   * @return subCategory
  **/
  @javax.annotation.Nullable
  public String getSubCategory() {
    return subCategory;
  }


  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public DpaDetailGetV2ResponseDataListInner subCategoryId(String subCategoryId) {
    
    this.subCategoryId = subCategoryId;
    return this;
  }

   /**
   * 
   * @return subCategoryId
  **/
  @javax.annotation.Nullable
  public String getSubCategoryId() {
    return subCategoryId;
  }


  public void setSubCategoryId(String subCategoryId) {
    this.subCategoryId = subCategoryId;
  }


  public DpaDetailGetV2ResponseDataListInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DpaDetailGetV2ResponseDataListInner thirdCategory(String thirdCategory) {
    
    this.thirdCategory = thirdCategory;
    return this;
  }

   /**
   * 
   * @return thirdCategory
  **/
  @javax.annotation.Nullable
  public String getThirdCategory() {
    return thirdCategory;
  }


  public void setThirdCategory(String thirdCategory) {
    this.thirdCategory = thirdCategory;
  }


  public DpaDetailGetV2ResponseDataListInner thirdCategoryId(String thirdCategoryId) {
    
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

   /**
   * 
   * @return thirdCategoryId
  **/
  @javax.annotation.Nullable
  public String getThirdCategoryId() {
    return thirdCategoryId;
  }


  public void setThirdCategoryId(String thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }


  public DpaDetailGetV2ResponseDataListInner title(String title) {
    
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


  public DpaDetailGetV2ResponseDataListInner titles(List<String> titles) {
    
    this.titles = titles;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * 
   * @return titles
  **/
  @javax.annotation.Nullable
  public List<String> getTitles() {
    return titles;
  }


  public void setTitles(List<String> titles) {
    this.titles = titles;
  }


  public DpaDetailGetV2ResponseDataListInner video(String video) {
    
    this.video = video;
    return this;
  }

   /**
   * 
   * @return video
  **/
  @javax.annotation.Nullable
  public String getVideo() {
    return video;
  }


  public void setVideo(String video) {
    this.video = video;
  }


  public DpaDetailGetV2ResponseDataListInner videos(List<DpaDetailGetV2ResponseDataListInnerVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public DpaDetailGetV2ResponseDataListInner addVideosItem(DpaDetailGetV2ResponseDataListInnerVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 
   * @return videos
  **/
  @javax.annotation.Nullable
  public List<DpaDetailGetV2ResponseDataListInnerVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<DpaDetailGetV2ResponseDataListInnerVideosInner> videos) {
    this.videos = videos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaDetailGetV2ResponseDataListInner dpaDetailGetV2ResponseDataListInner = (DpaDetailGetV2ResponseDataListInner) o;
    return Objects.equals(this.age, dpaDetailGetV2ResponseDataListInner.age) &&
        Objects.equals(this.bought, dpaDetailGetV2ResponseDataListInner.bought) &&
        Objects.equals(this.brandInfo, dpaDetailGetV2ResponseDataListInner.brandInfo) &&
        Objects.equals(this.city, dpaDetailGetV2ResponseDataListInner.city) &&
        Objects.equals(this.comments, dpaDetailGetV2ResponseDataListInner.comments) &&
        Objects.equals(this.description, dpaDetailGetV2ResponseDataListInner.description) &&
        Objects.equals(this.feature, dpaDetailGetV2ResponseDataListInner.feature) &&
        Objects.equals(this.firstCategory, dpaDetailGetV2ResponseDataListInner.firstCategory) &&
        Objects.equals(this.firstCategoryId, dpaDetailGetV2ResponseDataListInner.firstCategoryId) &&
        Objects.equals(this.hasVideo, dpaDetailGetV2ResponseDataListInner.hasVideo) &&
        Objects.equals(this.imageUrl, dpaDetailGetV2ResponseDataListInner.imageUrl) &&
        Objects.equals(this.imageUrls, dpaDetailGetV2ResponseDataListInner.imageUrls) &&
        Objects.equals(this.label, dpaDetailGetV2ResponseDataListInner.label) &&
        Objects.equals(this.landingInfo, dpaDetailGetV2ResponseDataListInner.landingInfo) &&
        Objects.equals(this.mark, dpaDetailGetV2ResponseDataListInner.mark) &&
        Objects.equals(this.name, dpaDetailGetV2ResponseDataListInner.name) &&
        Objects.equals(this.offlineTime, dpaDetailGetV2ResponseDataListInner.offlineTime) &&
        Objects.equals(this.onlineTime, dpaDetailGetV2ResponseDataListInner.onlineTime) &&
        Objects.equals(this.outerId, dpaDetailGetV2ResponseDataListInner.outerId) &&
        Objects.equals(this.platformId, dpaDetailGetV2ResponseDataListInner.platformId) &&
        Objects.equals(this.priceInfo, dpaDetailGetV2ResponseDataListInner.priceInfo) &&
        Objects.equals(this.productId, dpaDetailGetV2ResponseDataListInner.productId) &&
        Objects.equals(this.profession, dpaDetailGetV2ResponseDataListInner.profession) &&
        Objects.equals(this.province, dpaDetailGetV2ResponseDataListInner.province) &&
        Objects.equals(this.shopKeeperInfo, dpaDetailGetV2ResponseDataListInner.shopKeeperInfo) &&
        Objects.equals(this.spuId, dpaDetailGetV2ResponseDataListInner.spuId) &&
        Objects.equals(this.status, dpaDetailGetV2ResponseDataListInner.status) &&
        Objects.equals(this.stock, dpaDetailGetV2ResponseDataListInner.stock) &&
        Objects.equals(this.subCategory, dpaDetailGetV2ResponseDataListInner.subCategory) &&
        Objects.equals(this.subCategoryId, dpaDetailGetV2ResponseDataListInner.subCategoryId) &&
        Objects.equals(this.tags, dpaDetailGetV2ResponseDataListInner.tags) &&
        Objects.equals(this.thirdCategory, dpaDetailGetV2ResponseDataListInner.thirdCategory) &&
        Objects.equals(this.thirdCategoryId, dpaDetailGetV2ResponseDataListInner.thirdCategoryId) &&
        Objects.equals(this.title, dpaDetailGetV2ResponseDataListInner.title) &&
        Objects.equals(this.titles, dpaDetailGetV2ResponseDataListInner.titles) &&
        Objects.equals(this.video, dpaDetailGetV2ResponseDataListInner.video) &&
        Objects.equals(this.videos, dpaDetailGetV2ResponseDataListInner.videos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, bought, brandInfo, city, comments, description, feature, firstCategory, firstCategoryId, hasVideo, imageUrl, imageUrls, label, landingInfo, mark, name, offlineTime, onlineTime, outerId, platformId, priceInfo, productId, profession, province, shopKeeperInfo, spuId, status, stock, subCategory, subCategoryId, tags, thirdCategory, thirdCategoryId, title, titles, video, videos);
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
    sb.append("class DpaDetailGetV2ResponseDataListInner {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    bought: ").append(toIndentedString(bought)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    firstCategory: ").append(toIndentedString(firstCategory)).append("\n");
    sb.append("    firstCategoryId: ").append(toIndentedString(firstCategoryId)).append("\n");
    sb.append("    hasVideo: ").append(toIndentedString(hasVideo)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    landingInfo: ").append(toIndentedString(landingInfo)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlineTime: ").append(toIndentedString(offlineTime)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    outerId: ").append(toIndentedString(outerId)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    shopKeeperInfo: ").append(toIndentedString(shopKeeperInfo)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdCategory: ").append(toIndentedString(thirdCategory)).append("\n");
    sb.append("    thirdCategoryId: ").append(toIndentedString(thirdCategoryId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("bought");
    openapiFields.add("brand_info");
    openapiFields.add("city");
    openapiFields.add("comments");
    openapiFields.add("description");
    openapiFields.add("feature");
    openapiFields.add("first_category");
    openapiFields.add("first_category_id");
    openapiFields.add("has_video");
    openapiFields.add("image_url");
    openapiFields.add("image_urls");
    openapiFields.add("label");
    openapiFields.add("landing_info");
    openapiFields.add("mark");
    openapiFields.add("name");
    openapiFields.add("offline_time");
    openapiFields.add("online_time");
    openapiFields.add("outer_id");
    openapiFields.add("platform_id");
    openapiFields.add("price_info");
    openapiFields.add("product_id");
    openapiFields.add("profession");
    openapiFields.add("province");
    openapiFields.add("shop_keeper_info");
    openapiFields.add("spu_id");
    openapiFields.add("status");
    openapiFields.add("stock");
    openapiFields.add("sub_category");
    openapiFields.add("sub_category_id");
    openapiFields.add("tags");
    openapiFields.add("third_category");
    openapiFields.add("third_category_id");
    openapiFields.add("title");
    openapiFields.add("titles");
    openapiFields.add("video");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaDetailGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaDetailGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaDetailGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaDetailGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaDetailGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaDetailGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaDetailGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaDetailGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaDetailGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaDetailGetV2ResponseDataListInner
  */
  public static DpaDetailGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaDetailGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaDetailGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

