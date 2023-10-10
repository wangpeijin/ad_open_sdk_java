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
import com.bytedance.ads.model.QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_LIVE_ORDER_SETTLE_COST_PER_PRODUCT7D = "ad_live_order_settle_cost_per_product_7d";
  @SerializedName(SERIALIZED_NAME_AD_LIVE_ORDER_SETTLE_COST_PER_PRODUCT7D)
  private Double adLiveOrderSettleCostPerProduct7d = null;

  public static final String SERIALIZED_NAME_AD_LIVE_ORDER_SETTLE_ROI_PER_PRODUCT7D = "ad_live_order_settle_roi_per_product_7d";
  @SerializedName(SERIALIZED_NAME_AD_LIVE_ORDER_SETTLE_ROI_PER_PRODUCT7D)
  private Double adLiveOrderSettleRoiPerProduct7d = null;

  public static final String SERIALIZED_NAME_EXPLAIN_STATUS = "explain_status";
  @SerializedName(SERIALIZED_NAME_EXPLAIN_STATUS)
  private QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus explainStatus = null;

  public static final String SERIALIZED_NAME_IMG_URL = "img_url";
  @SerializedName(SERIALIZED_NAME_IMG_URL)
  private String imgUrl = null;

  public static final String SERIALIZED_NAME_LIVE_COST_PER_PRODUCT = "live_cost_per_product";
  @SerializedName(SERIALIZED_NAME_LIVE_COST_PER_PRODUCT)
  private Double liveCostPerProduct = null;

  public static final String SERIALIZED_NAME_LIVE_ORDER_REFUND_AMOUNT = "live_order_refund_amount";
  @SerializedName(SERIALIZED_NAME_LIVE_ORDER_REFUND_AMOUNT)
  private Double liveOrderRefundAmount = null;

  public static final String SERIALIZED_NAME_LIVE_ORDER_SETTLE_AMOUNT7D = "live_order_settle_amount_7d";
  @SerializedName(SERIALIZED_NAME_LIVE_ORDER_SETTLE_AMOUNT7D)
  private Double liveOrderSettleAmount7d = null;

  public static final String SERIALIZED_NAME_LIVE_ORDER_SETTLE_COUNT7D = "live_order_settle_count_7d";
  @SerializedName(SERIALIZED_NAME_LIVE_ORDER_SETTLE_COUNT7D)
  private Long liveOrderSettleCount7d = null;

  public static final String SERIALIZED_NAME_LIVE_ORDER_SETTLE_COUNT_RATE7DLIVE_ORDER_SETTLE_COUNT_RATE7D = "live_order_settle_count_rate_7dlive_order_settle_count_rate_7d";
  @SerializedName(SERIALIZED_NAME_LIVE_ORDER_SETTLE_COUNT_RATE7DLIVE_ORDER_SETTLE_COUNT_RATE7D)
  private Double liveOrderSettleCountRate7dliveOrderSettleCountRate7d = null;

  public static final String SERIALIZED_NAME_LIVE_PAY_ORDER_COUNT_ALIAS = "live_pay_order_count_alias";
  @SerializedName(SERIALIZED_NAME_LIVE_PAY_ORDER_COUNT_ALIAS)
  private Long livePayOrderCountAlias = null;

  public static final String SERIALIZED_NAME_LIVE_PAY_ORDER_GMV_ALIAS = "live_pay_order_gmv_alias";
  @SerializedName(SERIALIZED_NAME_LIVE_PAY_ORDER_GMV_ALIAS)
  private Double livePayOrderGmvAlias = null;

  public static final String SERIALIZED_NAME_LIVE_PAY_ORDER_ROI_PER_PRODUCT = "live_pay_order_roi_per_product";
  @SerializedName(SERIALIZED_NAME_LIVE_PAY_ORDER_ROI_PER_PRODUCT)
  private Double livePayOrderRoiPerProduct = null;

  public static final String SERIALIZED_NAME_LIVE_PRODUCT_INVENTORY = "live_product_Inventory";
  @SerializedName(SERIALIZED_NAME_LIVE_PRODUCT_INVENTORY)
  private Long liveProductInventory = null;

  public static final String SERIALIZED_NAME_LIVE_PRODUCT_BIND_TIME = "live_product_bind_time";
  @SerializedName(SERIALIZED_NAME_LIVE_PRODUCT_BIND_TIME)
  private String liveProductBindTime = null;

  public static final String SERIALIZED_NAME_LIVE_PRODUCT_EXPLAIN_CNT = "live_product_explain_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_PRODUCT_EXPLAIN_CNT)
  private Long liveProductExplainCnt = null;

  public static final String SERIALIZED_NAME_LIVE_PRODUCT_PRICE = "live_product_price";
  @SerializedName(SERIALIZED_NAME_LIVE_PRODUCT_PRICE)
  private Double liveProductPrice = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_PAY_ORDER_COUNT = "luban_live_pay_order_count";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_PAY_ORDER_COUNT)
  private Long lubanLivePayOrderCount = null;

  public static final String SERIALIZED_NAME_LUBAN_LIVE_PAY_ORDER_GMV = "luban_live_pay_order_gmv";
  @SerializedName(SERIALIZED_NAME_LUBAN_LIVE_PAY_ORDER_GMV)
  private Double lubanLivePayOrderGmv = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_CLICK_PAY_UCNT_RATIO = "product_click_pay_ucnt_ratio";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CLICK_PAY_UCNT_RATIO)
  private Double productClickPayUcntRatio = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TOTAL_LIVE_PAY_ORDER_GPM_ECOM = "total_live_pay_order_gpm_ecom";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIVE_PAY_ORDER_GPM_ECOM)
  private Double totalLivePayOrderGpmEcom = null;

  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner() {
  }

  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner adLiveOrderSettleCostPerProduct7d(Double adLiveOrderSettleCostPerProduct7d) {
    
    this.adLiveOrderSettleCostPerProduct7d = adLiveOrderSettleCostPerProduct7d;
    return this;
  }

   /**
   * 
   * @return adLiveOrderSettleCostPerProduct7d
  **/
  @javax.annotation.Nullable
  public Double getAdLiveOrderSettleCostPerProduct7d() {
    return adLiveOrderSettleCostPerProduct7d;
  }


  public void setAdLiveOrderSettleCostPerProduct7d(Double adLiveOrderSettleCostPerProduct7d) {
    this.adLiveOrderSettleCostPerProduct7d = adLiveOrderSettleCostPerProduct7d;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner adLiveOrderSettleRoiPerProduct7d(Double adLiveOrderSettleRoiPerProduct7d) {
    
    this.adLiveOrderSettleRoiPerProduct7d = adLiveOrderSettleRoiPerProduct7d;
    return this;
  }

   /**
   * 
   * @return adLiveOrderSettleRoiPerProduct7d
  **/
  @javax.annotation.Nullable
  public Double getAdLiveOrderSettleRoiPerProduct7d() {
    return adLiveOrderSettleRoiPerProduct7d;
  }


  public void setAdLiveOrderSettleRoiPerProduct7d(Double adLiveOrderSettleRoiPerProduct7d) {
    this.adLiveOrderSettleRoiPerProduct7d = adLiveOrderSettleRoiPerProduct7d;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner explainStatus(QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus explainStatus) {
    
    this.explainStatus = explainStatus;
    return this;
  }

   /**
   * Get explainStatus
   * @return explainStatus
  **/
  @javax.annotation.Nullable
  public QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus getExplainStatus() {
    return explainStatus;
  }


  public void setExplainStatus(QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus explainStatus) {
    this.explainStatus = explainStatus;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner imgUrl(String imgUrl) {
    
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * 
   * @return imgUrl
  **/
  @javax.annotation.Nullable
  public String getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveCostPerProduct(Double liveCostPerProduct) {
    
    this.liveCostPerProduct = liveCostPerProduct;
    return this;
  }

   /**
   * 
   * @return liveCostPerProduct
  **/
  @javax.annotation.Nullable
  public Double getLiveCostPerProduct() {
    return liveCostPerProduct;
  }


  public void setLiveCostPerProduct(Double liveCostPerProduct) {
    this.liveCostPerProduct = liveCostPerProduct;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveOrderRefundAmount(Double liveOrderRefundAmount) {
    
    this.liveOrderRefundAmount = liveOrderRefundAmount;
    return this;
  }

   /**
   * 
   * @return liveOrderRefundAmount
  **/
  @javax.annotation.Nullable
  public Double getLiveOrderRefundAmount() {
    return liveOrderRefundAmount;
  }


  public void setLiveOrderRefundAmount(Double liveOrderRefundAmount) {
    this.liveOrderRefundAmount = liveOrderRefundAmount;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveOrderSettleAmount7d(Double liveOrderSettleAmount7d) {
    
    this.liveOrderSettleAmount7d = liveOrderSettleAmount7d;
    return this;
  }

   /**
   * 
   * @return liveOrderSettleAmount7d
  **/
  @javax.annotation.Nullable
  public Double getLiveOrderSettleAmount7d() {
    return liveOrderSettleAmount7d;
  }


  public void setLiveOrderSettleAmount7d(Double liveOrderSettleAmount7d) {
    this.liveOrderSettleAmount7d = liveOrderSettleAmount7d;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveOrderSettleCount7d(Long liveOrderSettleCount7d) {
    
    this.liveOrderSettleCount7d = liveOrderSettleCount7d;
    return this;
  }

   /**
   * 
   * @return liveOrderSettleCount7d
  **/
  @javax.annotation.Nullable
  public Long getLiveOrderSettleCount7d() {
    return liveOrderSettleCount7d;
  }


  public void setLiveOrderSettleCount7d(Long liveOrderSettleCount7d) {
    this.liveOrderSettleCount7d = liveOrderSettleCount7d;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveOrderSettleCountRate7dliveOrderSettleCountRate7d(Double liveOrderSettleCountRate7dliveOrderSettleCountRate7d) {
    
    this.liveOrderSettleCountRate7dliveOrderSettleCountRate7d = liveOrderSettleCountRate7dliveOrderSettleCountRate7d;
    return this;
  }

   /**
   * 
   * @return liveOrderSettleCountRate7dliveOrderSettleCountRate7d
  **/
  @javax.annotation.Nullable
  public Double getLiveOrderSettleCountRate7dliveOrderSettleCountRate7d() {
    return liveOrderSettleCountRate7dliveOrderSettleCountRate7d;
  }


  public void setLiveOrderSettleCountRate7dliveOrderSettleCountRate7d(Double liveOrderSettleCountRate7dliveOrderSettleCountRate7d) {
    this.liveOrderSettleCountRate7dliveOrderSettleCountRate7d = liveOrderSettleCountRate7dliveOrderSettleCountRate7d;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner livePayOrderCountAlias(Long livePayOrderCountAlias) {
    
    this.livePayOrderCountAlias = livePayOrderCountAlias;
    return this;
  }

   /**
   * 
   * @return livePayOrderCountAlias
  **/
  @javax.annotation.Nullable
  public Long getLivePayOrderCountAlias() {
    return livePayOrderCountAlias;
  }


  public void setLivePayOrderCountAlias(Long livePayOrderCountAlias) {
    this.livePayOrderCountAlias = livePayOrderCountAlias;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner livePayOrderGmvAlias(Double livePayOrderGmvAlias) {
    
    this.livePayOrderGmvAlias = livePayOrderGmvAlias;
    return this;
  }

   /**
   * 
   * @return livePayOrderGmvAlias
  **/
  @javax.annotation.Nullable
  public Double getLivePayOrderGmvAlias() {
    return livePayOrderGmvAlias;
  }


  public void setLivePayOrderGmvAlias(Double livePayOrderGmvAlias) {
    this.livePayOrderGmvAlias = livePayOrderGmvAlias;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner livePayOrderRoiPerProduct(Double livePayOrderRoiPerProduct) {
    
    this.livePayOrderRoiPerProduct = livePayOrderRoiPerProduct;
    return this;
  }

   /**
   * 
   * @return livePayOrderRoiPerProduct
  **/
  @javax.annotation.Nullable
  public Double getLivePayOrderRoiPerProduct() {
    return livePayOrderRoiPerProduct;
  }


  public void setLivePayOrderRoiPerProduct(Double livePayOrderRoiPerProduct) {
    this.livePayOrderRoiPerProduct = livePayOrderRoiPerProduct;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveProductInventory(Long liveProductInventory) {
    
    this.liveProductInventory = liveProductInventory;
    return this;
  }

   /**
   * 
   * @return liveProductInventory
  **/
  @javax.annotation.Nullable
  public Long getLiveProductInventory() {
    return liveProductInventory;
  }


  public void setLiveProductInventory(Long liveProductInventory) {
    this.liveProductInventory = liveProductInventory;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveProductBindTime(String liveProductBindTime) {
    
    this.liveProductBindTime = liveProductBindTime;
    return this;
  }

   /**
   * 
   * @return liveProductBindTime
  **/
  @javax.annotation.Nullable
  public String getLiveProductBindTime() {
    return liveProductBindTime;
  }


  public void setLiveProductBindTime(String liveProductBindTime) {
    this.liveProductBindTime = liveProductBindTime;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveProductExplainCnt(Long liveProductExplainCnt) {
    
    this.liveProductExplainCnt = liveProductExplainCnt;
    return this;
  }

   /**
   * 
   * @return liveProductExplainCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveProductExplainCnt() {
    return liveProductExplainCnt;
  }


  public void setLiveProductExplainCnt(Long liveProductExplainCnt) {
    this.liveProductExplainCnt = liveProductExplainCnt;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner liveProductPrice(Double liveProductPrice) {
    
    this.liveProductPrice = liveProductPrice;
    return this;
  }

   /**
   * 
   * @return liveProductPrice
  **/
  @javax.annotation.Nullable
  public Double getLiveProductPrice() {
    return liveProductPrice;
  }


  public void setLiveProductPrice(Double liveProductPrice) {
    this.liveProductPrice = liveProductPrice;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner lubanLivePayOrderCount(Long lubanLivePayOrderCount) {
    
    this.lubanLivePayOrderCount = lubanLivePayOrderCount;
    return this;
  }

   /**
   * 
   * @return lubanLivePayOrderCount
  **/
  @javax.annotation.Nullable
  public Long getLubanLivePayOrderCount() {
    return lubanLivePayOrderCount;
  }


  public void setLubanLivePayOrderCount(Long lubanLivePayOrderCount) {
    this.lubanLivePayOrderCount = lubanLivePayOrderCount;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner lubanLivePayOrderGmv(Double lubanLivePayOrderGmv) {
    
    this.lubanLivePayOrderGmv = lubanLivePayOrderGmv;
    return this;
  }

   /**
   * 
   * @return lubanLivePayOrderGmv
  **/
  @javax.annotation.Nullable
  public Double getLubanLivePayOrderGmv() {
    return lubanLivePayOrderGmv;
  }


  public void setLubanLivePayOrderGmv(Double lubanLivePayOrderGmv) {
    this.lubanLivePayOrderGmv = lubanLivePayOrderGmv;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner productId(Long productId) {
    
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


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner productClickPayUcntRatio(Double productClickPayUcntRatio) {
    
    this.productClickPayUcntRatio = productClickPayUcntRatio;
    return this;
  }

   /**
   * 
   * @return productClickPayUcntRatio
  **/
  @javax.annotation.Nullable
  public Double getProductClickPayUcntRatio() {
    return productClickPayUcntRatio;
  }


  public void setProductClickPayUcntRatio(Double productClickPayUcntRatio) {
    this.productClickPayUcntRatio = productClickPayUcntRatio;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner title(String title) {
    
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


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner totalLivePayOrderGpmEcom(Double totalLivePayOrderGpmEcom) {
    
    this.totalLivePayOrderGpmEcom = totalLivePayOrderGpmEcom;
    return this;
  }

   /**
   * 
   * @return totalLivePayOrderGpmEcom
  **/
  @javax.annotation.Nullable
  public Double getTotalLivePayOrderGpmEcom() {
    return totalLivePayOrderGpmEcom;
  }


  public void setTotalLivePayOrderGpmEcom(Double totalLivePayOrderGpmEcom) {
    this.totalLivePayOrderGpmEcom = totalLivePayOrderGpmEcom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner = (QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner) o;
    return Objects.equals(this.adLiveOrderSettleCostPerProduct7d, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.adLiveOrderSettleCostPerProduct7d) &&
        Objects.equals(this.adLiveOrderSettleRoiPerProduct7d, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.adLiveOrderSettleRoiPerProduct7d) &&
        Objects.equals(this.explainStatus, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.explainStatus) &&
        Objects.equals(this.imgUrl, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.imgUrl) &&
        Objects.equals(this.liveCostPerProduct, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveCostPerProduct) &&
        Objects.equals(this.liveOrderRefundAmount, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveOrderRefundAmount) &&
        Objects.equals(this.liveOrderSettleAmount7d, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveOrderSettleAmount7d) &&
        Objects.equals(this.liveOrderSettleCount7d, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveOrderSettleCount7d) &&
        Objects.equals(this.liveOrderSettleCountRate7dliveOrderSettleCountRate7d, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveOrderSettleCountRate7dliveOrderSettleCountRate7d) &&
        Objects.equals(this.livePayOrderCountAlias, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.livePayOrderCountAlias) &&
        Objects.equals(this.livePayOrderGmvAlias, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.livePayOrderGmvAlias) &&
        Objects.equals(this.livePayOrderRoiPerProduct, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.livePayOrderRoiPerProduct) &&
        Objects.equals(this.liveProductInventory, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveProductInventory) &&
        Objects.equals(this.liveProductBindTime, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveProductBindTime) &&
        Objects.equals(this.liveProductExplainCnt, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveProductExplainCnt) &&
        Objects.equals(this.liveProductPrice, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.liveProductPrice) &&
        Objects.equals(this.lubanLivePayOrderCount, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.lubanLivePayOrderCount) &&
        Objects.equals(this.lubanLivePayOrderGmv, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.lubanLivePayOrderGmv) &&
        Objects.equals(this.productId, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.productId) &&
        Objects.equals(this.productClickPayUcntRatio, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.productClickPayUcntRatio) &&
        Objects.equals(this.title, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.title) &&
        Objects.equals(this.totalLivePayOrderGpmEcom, qianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.totalLivePayOrderGpmEcom);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLiveOrderSettleCostPerProduct7d, adLiveOrderSettleRoiPerProduct7d, explainStatus, imgUrl, liveCostPerProduct, liveOrderRefundAmount, liveOrderSettleAmount7d, liveOrderSettleCount7d, liveOrderSettleCountRate7dliveOrderSettleCountRate7d, livePayOrderCountAlias, livePayOrderGmvAlias, livePayOrderRoiPerProduct, liveProductInventory, liveProductBindTime, liveProductExplainCnt, liveProductPrice, lubanLivePayOrderCount, lubanLivePayOrderGmv, productId, productClickPayUcntRatio, title, totalLivePayOrderGpmEcom);
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
    sb.append("class QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner {\n");
    sb.append("    adLiveOrderSettleCostPerProduct7d: ").append(toIndentedString(adLiveOrderSettleCostPerProduct7d)).append("\n");
    sb.append("    adLiveOrderSettleRoiPerProduct7d: ").append(toIndentedString(adLiveOrderSettleRoiPerProduct7d)).append("\n");
    sb.append("    explainStatus: ").append(toIndentedString(explainStatus)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    liveCostPerProduct: ").append(toIndentedString(liveCostPerProduct)).append("\n");
    sb.append("    liveOrderRefundAmount: ").append(toIndentedString(liveOrderRefundAmount)).append("\n");
    sb.append("    liveOrderSettleAmount7d: ").append(toIndentedString(liveOrderSettleAmount7d)).append("\n");
    sb.append("    liveOrderSettleCount7d: ").append(toIndentedString(liveOrderSettleCount7d)).append("\n");
    sb.append("    liveOrderSettleCountRate7dliveOrderSettleCountRate7d: ").append(toIndentedString(liveOrderSettleCountRate7dliveOrderSettleCountRate7d)).append("\n");
    sb.append("    livePayOrderCountAlias: ").append(toIndentedString(livePayOrderCountAlias)).append("\n");
    sb.append("    livePayOrderGmvAlias: ").append(toIndentedString(livePayOrderGmvAlias)).append("\n");
    sb.append("    livePayOrderRoiPerProduct: ").append(toIndentedString(livePayOrderRoiPerProduct)).append("\n");
    sb.append("    liveProductInventory: ").append(toIndentedString(liveProductInventory)).append("\n");
    sb.append("    liveProductBindTime: ").append(toIndentedString(liveProductBindTime)).append("\n");
    sb.append("    liveProductExplainCnt: ").append(toIndentedString(liveProductExplainCnt)).append("\n");
    sb.append("    liveProductPrice: ").append(toIndentedString(liveProductPrice)).append("\n");
    sb.append("    lubanLivePayOrderCount: ").append(toIndentedString(lubanLivePayOrderCount)).append("\n");
    sb.append("    lubanLivePayOrderGmv: ").append(toIndentedString(lubanLivePayOrderGmv)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productClickPayUcntRatio: ").append(toIndentedString(productClickPayUcntRatio)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalLivePayOrderGpmEcom: ").append(toIndentedString(totalLivePayOrderGpmEcom)).append("\n");
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
    openapiFields.add("ad_live_order_settle_cost_per_product_7d");
    openapiFields.add("ad_live_order_settle_roi_per_product_7d");
    openapiFields.add("explain_status");
    openapiFields.add("img_url");
    openapiFields.add("live_cost_per_product");
    openapiFields.add("live_order_refund_amount");
    openapiFields.add("live_order_settle_amount_7d");
    openapiFields.add("live_order_settle_count_7d");
    openapiFields.add("live_order_settle_count_rate_7dlive_order_settle_count_rate_7d");
    openapiFields.add("live_pay_order_count_alias");
    openapiFields.add("live_pay_order_gmv_alias");
    openapiFields.add("live_pay_order_roi_per_product");
    openapiFields.add("live_product_Inventory");
    openapiFields.add("live_product_bind_time");
    openapiFields.add("live_product_explain_cnt");
    openapiFields.add("live_product_price");
    openapiFields.add("luban_live_pay_order_count");
    openapiFields.add("luban_live_pay_order_gmv");
    openapiFields.add("productId");
    openapiFields.add("product_click_pay_ucnt_ratio");
    openapiFields.add("title");
    openapiFields.add("total_live_pay_order_gpm_ecom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner
  */
  public static QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

