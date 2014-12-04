/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.container;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.container.BorderLayoutBaseAppearance;

public class ZelenBorderLayoutAppearance extends BorderLayoutBaseAppearance {

  public interface ZelenBorderLayoutResources extends BorderLayoutResources {
    @Override
    @Source({"com/sencha/gxt/theme/base/client/container/BorderLayout.css", "ZelenBorderLayout.css"})
    public ZelenBorderLayoutStyle css();
  }

  public interface ZelenBorderLayoutStyle extends BorderLayoutStyle {

  }

  public ZelenBorderLayoutAppearance() {
    super(GWT.<ZelenBorderLayoutResources> create(ZelenBorderLayoutResources.class));
  }

}
