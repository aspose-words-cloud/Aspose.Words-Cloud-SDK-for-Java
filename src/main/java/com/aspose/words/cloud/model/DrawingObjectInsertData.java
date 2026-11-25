/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DrawingObjectInsertData.java">
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
 * Drawing object element for insert with the image passed by reference.
 */
@ApiModel(description = "Drawing object element for insert with the image passed by reference.")
public class DrawingObjectInsertData extends DrawingObjectInsert {
    @SerializedName("ImageReference")
    protected FileReference imageReference;
    /**
     * Gets or sets the reference to the image file.
     * Source "Storage": the reference is either a storage path to the image located in the folder of the document or in one of its subfolders,
     * or an absolute HTTP(S) URL to download the image from. For online methods any storage path is allowed.
     * Source "Request": the reference is the name of the multipart request part that contains the image.
    * @return imageReference
    **/
    @ApiModelProperty(value = "Gets or sets the reference to the image file. Source \"Storage\": the reference is either a storage path to the image located in the folder of the document or in one of its subfolders, or an absolute HTTP(S) URL to download the image from. For online methods any storage path is allowed. Source \"Request\": the reference is the name of the multipart request part that contains the image.")
    public FileReference getImageReference() {
        return imageReference;
    }

    public DrawingObjectInsertData imageReference(FileReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    public void setImageReference(FileReference imageReference) {
        this.imageReference = imageReference;
    }


    public DrawingObjectInsertData() {
        super();
        this.imageReference = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
        super.getFilesContent(resultFilesContent);
        if (this.imageReference != null) {
            this.imageReference.getFilesContent(resultFilesContent);
        }

    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();
        if (this.imageReference == null) {
            throw new ApiException(400, "Property ImageReference in DrawingObjectInsertData is required.");
        }

        if (this.imageReference != null) {
            this.imageReference.validate();
        }

    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DrawingObjectInsertData drawingObjectInsertData = (DrawingObjectInsertData) o;
        return
            Objects.equals(this.imageReference, drawingObjectInsertData.imageReference) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageReference, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObjectInsertData {\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    relativeHorizontalPosition: ").append(toIndentedString(getRelativeHorizontalPosition())).append("\n");
    sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
    sb.append("    relativeVerticalPosition: ").append(toIndentedString(getRelativeVerticalPosition())).append("\n");
    sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
    sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
    sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
    sb.append("    wrapType: ").append(toIndentedString(getWrapType())).append("\n");
    sb.append("    aspectRatioLocked: ").append(toIndentedString(getAspectRatioLocked())).append("\n");
    sb.append("    imageReference: ").append(toIndentedString(getImageReference())).append("\n");
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
