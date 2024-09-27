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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ServeMarketCidVerifyTokenV10DataDevStatus.Adapter.class)
public enum ServeMarketCidVerifyTokenV10DataDevStatus {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l);

  private Long value;

  ServeMarketCidVerifyTokenV10DataDevStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServeMarketCidVerifyTokenV10DataDevStatus fromValue(Long value) {
    for (ServeMarketCidVerifyTokenV10DataDevStatus b : ServeMarketCidVerifyTokenV10DataDevStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServeMarketCidVerifyTokenV10DataDevStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServeMarketCidVerifyTokenV10DataDevStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServeMarketCidVerifyTokenV10DataDevStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ServeMarketCidVerifyTokenV10DataDevStatus.fromValue(value);
    }
  }
}

