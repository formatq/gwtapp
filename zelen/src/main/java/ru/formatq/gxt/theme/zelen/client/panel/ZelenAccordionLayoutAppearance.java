/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.panel;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.panel.AccordionLayoutBaseAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;

public class ZelenAccordionLayoutAppearance extends AccordionLayoutBaseAppearance {
  
  public interface ZelenAccordionLayoutResources extends ContentPanelResources {

    @Source({"com/sencha/gxt/theme/base/client/panel/ContentPanel.css", "ZelenContentPanel.css"})
    @Override
    ZelenAccordionLayoutStyle style();

  }

  public interface ZelenAccordionLayoutStyle extends ContentPanelStyle {

  }
  
  public ZelenAccordionLayoutAppearance() {
    super(GWT.<ZelenAccordionLayoutResources> create(ZelenAccordionLayoutResources.class));
  }

  public ZelenAccordionLayoutAppearance(ZelenAccordionLayoutResources resources) {
    super(resources);
  }
  
  @Override
  public HeaderDefaultAppearance getHeaderAppearance() {
    return new ZelenAccordionHeaderAppearance();
  }
}
