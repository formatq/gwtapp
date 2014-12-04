/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.resizable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance;

public class ZelenResizableAppearance extends ResizableBaseAppearance {

  public interface ZelenResizableResources extends ResizableResources, ClientBundle {

    ImageResource handleEast();

    ImageResource handleNortheast();

    ImageResource handleNorthwest();

    ImageResource handleSouth();

    ImageResource handleSoutheast();

    ImageResource handleSouthwest();

    @Source({"com/sencha/gxt/theme/base/client/resizable/Resizable.css", "ZelenResizable.css"})
    ZelenResizableStyle style();

  }

  public interface ZelenResizableStyle extends ResizableStyle {
  }

  public ZelenResizableAppearance() {
    this(GWT.<ZelenResizableResources> create(ZelenResizableResources.class));
  }

  public ZelenResizableAppearance(ResizableResources resources) {
    super(resources);
  }

}
