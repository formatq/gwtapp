/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.menu.MenuBarBaseAppearance;

public class ZelenMenuBarAppearance extends MenuBarBaseAppearance {

  public interface ZelenMenuBarResources extends MenuBarResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/menu/MenuBar.css", "ZelenMenuBar.css"})
    ZelenMenuBarStyle css();

    @ImageOptions(repeatStyle=RepeatStyle.Horizontal)
    ImageResource background();

  }

  public interface ZelenMenuBarStyle extends MenuBarStyle {
  }

  public ZelenMenuBarAppearance() {
    this(GWT.<ZelenMenuBarResources> create(ZelenMenuBarResources.class));
  }

  public ZelenMenuBarAppearance(ZelenMenuBarResources resources) {
    super(resources);
  }

}
