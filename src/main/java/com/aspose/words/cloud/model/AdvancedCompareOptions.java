/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AdvancedCompareOptions.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Allows to set advanced compare options.
 */
@ApiModel(description = "Allows to set advanced compare options.")
public class AdvancedCompareOptions implements ModelIfc {
    @SerializedName("CompareListDefinitions")
    protected Boolean compareListDefinitions;

    @SerializedName("IgnoreDmlUniqueId")
    protected Boolean ignoreDmlUniqueId;

    @SerializedName("IgnoreStoreItemId")
    protected Boolean ignoreStoreItemId;
    /**
     * Gets or sets the value indicating whether list definition contents are compared instead of list definition Ids.
     * Default value is false.
    * @return compareListDefinitions
    **/
    @ApiModelProperty(value = "Gets or sets the value indicating whether list definition contents are compared instead of list definition Ids. Default value is false.")
    public Boolean getCompareListDefinitions() {
        return compareListDefinitions;
    }

    public AdvancedCompareOptions compareListDefinitions(Boolean compareListDefinitions) {
        this.compareListDefinitions = compareListDefinitions;
        return this;
    }

    public void setCompareListDefinitions(Boolean compareListDefinitions) {
        this.compareListDefinitions = compareListDefinitions;
    }


    /**
     * Gets or sets the value indicating whether to ignore difference in DrawingML unique Id.
     * Default value is false.
    * @return ignoreDmlUniqueId
    **/
    @ApiModelProperty(value = "Gets or sets the value indicating whether to ignore difference in DrawingML unique Id. Default value is false.")
    public Boolean getIgnoreDmlUniqueId() {
        return ignoreDmlUniqueId;
    }

    public AdvancedCompareOptions ignoreDmlUniqueId(Boolean ignoreDmlUniqueId) {
        this.ignoreDmlUniqueId = ignoreDmlUniqueId;
        return this;
    }

    public void setIgnoreDmlUniqueId(Boolean ignoreDmlUniqueId) {
        this.ignoreDmlUniqueId = ignoreDmlUniqueId;
    }


    /**
     * Gets or sets the value indicating whether to ignore difference in StructuredDocumentTag store item Id.
     * Default value is false.
    * @return ignoreStoreItemId
    **/
    @ApiModelProperty(value = "Gets or sets the value indicating whether to ignore difference in StructuredDocumentTag store item Id. Default value is false.")
    public Boolean getIgnoreStoreItemId() {
        return ignoreStoreItemId;
    }

    public AdvancedCompareOptions ignoreStoreItemId(Boolean ignoreStoreItemId) {
        this.ignoreStoreItemId = ignoreStoreItemId;
        return this;
    }

    public void setIgnoreStoreItemId(Boolean ignoreStoreItemId) {
        this.ignoreStoreItemId = ignoreStoreItemId;
    }


    public AdvancedCompareOptions() {
        this.compareListDefinitions = null;
        this.ignoreDmlUniqueId = null;
        this.ignoreStoreItemId = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AdvancedCompareOptions advancedCompareOptions = (AdvancedCompareOptions) o;
        return
            Objects.equals(this.compareListDefinitions, advancedCompareOptions.compareListDefinitions) &&
            Objects.equals(this.ignoreDmlUniqueId, advancedCompareOptions.ignoreDmlUniqueId) &&
            Objects.equals(this.ignoreStoreItemId, advancedCompareOptions.ignoreStoreItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareListDefinitions, ignoreDmlUniqueId, ignoreStoreItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedCompareOptions {\n");
    sb.append("    compareListDefinitions: ").append(toIndentedString(getCompareListDefinitions())).append("\n");
    sb.append("    ignoreDmlUniqueId: ").append(toIndentedString(getIgnoreDmlUniqueId())).append("\n");
    sb.append("    ignoreStoreItemId: ").append(toIndentedString(getIgnoreStoreItemId())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
