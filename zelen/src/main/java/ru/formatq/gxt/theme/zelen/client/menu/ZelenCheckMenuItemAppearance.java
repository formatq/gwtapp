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
import com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance;
import ru.formatq.gxt.theme.zelen.client.menu.ZelenMenuItemAppearance.ZelenMenuItemResources;

public class ZelenCheckMenuItemAppearance extends CheckMenuItemBaseAppearance {

  public interface ZelenCheckMenuItemResources extends CheckMenuItemResources, ZelenMenuItemResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/menu/CheckMenuItem.css", "ZelenCheckMenuItem.css"})
    ZelenCheckMenuItemStyle checkStyle();

  }

  public interface ZelenCheckMenuItemStyle extends CheckMenuItemStyle {
  }

  public ZelenCheckMenuItemAppearance() {
    this(GWT.<ZelenCheckMenuItemResources> create(ZelenCheckMenuItemResources.class),
        GWT.<MenuItemTemplate> create(MenuItemTemplate.class));
  }

  public ZelenCheckMenuItemAppearance(ZelenCheckMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
  }

}
