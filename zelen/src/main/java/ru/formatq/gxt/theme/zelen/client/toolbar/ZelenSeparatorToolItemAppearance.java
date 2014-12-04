/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance;

public class ZelenSeparatorToolItemAppearance extends SeparatorToolItemDefaultAppearance {

  public interface ZelenSeparatorToolItemResources extends SeparatorToolItemResources {
    @Override
    @Source(value = "separatorBackground.gif")
    public ImageResource background();
  }
  
  public ZelenSeparatorToolItemAppearance() {
    this(GWT.<ZelenSeparatorToolItemResources>create(ZelenSeparatorToolItemResources.class), GWT.<Template>create(Template.class));
  }
  
  public ZelenSeparatorToolItemAppearance(ZelenSeparatorToolItemResources resources, Template template) {
    super(resources, template);
  }

}
