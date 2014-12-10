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
import com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance;

public class ZelenMenuItemAppearance extends MenuItemBaseAppearance {

  public interface ZelenMenuItemResources extends MenuItemBaseAppearance.MenuItemResources, ClientBundle {

    ImageResource menuParent();

    @Override
    @Source({"com/sencha/gxt/theme/base/client/menu/Item.css",
            "ru/formatq/gxt/theme/zelen/client/menu/ZelenItem.css",
            "com/sencha/gxt/theme/base/client/menu/MenuItem.css",
            "ZelenMenuItem.css"})
    ZelenMenuItemStyle style();

    ImageResource itemOver();
  }

  public interface ZelenMenuItemStyle extends MenuItemBaseAppearance.MenuItemStyle {
  }

  public ZelenMenuItemAppearance() {
    this(GWT.<ZelenMenuItemResources> create(ZelenMenuItemResources.class),
        GWT.<MenuItemTemplate> create(MenuItemTemplate.class));
  }

  public ZelenMenuItemAppearance(ZelenMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
  }

}
