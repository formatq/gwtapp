/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

public class ZelenHeaderFramedAppearance extends ZelenHeaderAppearance {

  public interface ZelenHeaderFramedStyle extends HeaderStyle {

  }

  public interface ZelenFramedHeaderResources extends HeaderResources {

    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css", "ZelenHeader.css", "ZelenFramedHeader.css"})
    ZelenHeaderFramedStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource headerBackground();
  }

  public ZelenHeaderFramedAppearance() {
    this(GWT.<ZelenFramedHeaderResources> create(ZelenFramedHeaderResources.class), GWT.<Template> create(Template.class));
  }

  public ZelenHeaderFramedAppearance(ZelenFramedHeaderResources resources, Template template) {
    super(resources, template);
  }
}
