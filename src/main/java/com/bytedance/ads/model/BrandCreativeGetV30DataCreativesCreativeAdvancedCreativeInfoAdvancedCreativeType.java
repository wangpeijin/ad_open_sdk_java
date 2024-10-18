/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType.Adapter.class)
public enum BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_50(50l),
  
  NUMBER_8(8l);

  private Long value;

  BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType fromValue(Long value) {
    for (BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType b : BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType.fromValue(value);
    }
  }
}

