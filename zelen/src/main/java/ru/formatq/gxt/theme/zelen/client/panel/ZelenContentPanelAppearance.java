/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.panel;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;

public class ZelenContentPanelAppearance extends ContentPanelBaseAppearance {

  public interface ZelenContentPanelResources extends ContentPanelResources {

    @Source({"com/sencha/gxt/theme/base/client/panel/ContentPanel.css", "ZelenContentPanel.css"})
    @Override
    ZelenContentPanelStyle style();

  }

  public interface ZelenContentPanelStyle extends ContentPanelStyle {

  }

  public ZelenContentPanelAppearance() {
    super(GWT.<ZelenContentPanelResources> create(ZelenContentPanelResources.class),
        GWT.<ContentPanelTemplate> create(ContentPanelTemplate.class));
  }

  public ZelenContentPanelAppearance(ZelenContentPanelResources resources) {
    super(resources, GWT.<ContentPanelTemplate> create(ContentPanelTemplate.class));
  }

  @Override
  public HeaderDefaultAppearance getHeaderAppearance() {
    return new ZelenHeaderAppearance();
  }

}
