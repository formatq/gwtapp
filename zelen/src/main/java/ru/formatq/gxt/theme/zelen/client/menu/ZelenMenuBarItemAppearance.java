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
import com.sencha.gxt.theme.base.client.menu.MenuBarItemBaseAppearance;

public class ZelenMenuBarItemAppearance extends MenuBarItemBaseAppearance {

  public interface ZelenMenuBarItemResources extends MenuBarItemResources, ClientBundle {
    @Source({"com/sencha/gxt/theme/base/client/menu/MenuBarItem.css", "ZelenMenuBarItem.css"})
    ZelenMenuBarItemStyle css();
  }
  
  public interface ZelenMenuBarItemStyle extends MenuBarItemStyle {
  }
  
  public ZelenMenuBarItemAppearance() {
    this(GWT.<ZelenMenuBarItemResources>create(ZelenMenuBarItemResources.class));
  }
  
  public ZelenMenuBarItemAppearance(ZelenMenuBarItemResources resources) {
    super(resources);
  }

}
