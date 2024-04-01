/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange.Adapter.class)
public enum ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange {
  
  LOCAL_ONLY("LOCAL_ONLY"),
  
  UNION_ONLY("UNION_ONLY"),
  
  UNIVERSAL_DELIVERY("UNIVERSAL_DELIVERY");

  private String value;

  ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange fromValue(String value) {
    for (ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange b : ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange.fromValue(value);
    }
  }
}

