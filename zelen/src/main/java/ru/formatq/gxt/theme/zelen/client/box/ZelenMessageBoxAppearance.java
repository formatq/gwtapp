/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.box;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import ru.formatq.gxt.theme.zelen.client.window.ZelenWindowAppearance;

public class ZelenMessageBoxAppearance extends ZelenWindowAppearance {

  public interface ZelenMessageBoxResources extends ZelenWindowResources, ClientBundle {

    @Source({
        "com/sencha/gxt/theme/base/client/panel/ContentPanel.css",
        "com/sencha/gxt/theme/zelen/client/window/ZelenWindow.css"})
    @Override
    ZelenWindowStyle style();

  }

  public ZelenMessageBoxAppearance() {
    super((ZelenMessageBoxResources) GWT.create(ZelenMessageBoxResources.class));
  }
}
