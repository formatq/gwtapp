/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.dom.client.Element;
import com.sencha.gxt.widget.core.client.menu.HeaderMenuItem.HeaderMenuItemAppearance;

public class ZelenHeaderMenuItemAppearance extends ZelenItemAppearance implements HeaderMenuItemAppearance {

  public interface ZelenHeaderMenuItemResources extends ZelenItemResources {

    @Source("ZelenHeaderMenuItem.css")
    ZelenHeaderMenuItemStyle headerStyle();

  }

  public interface ZelenHeaderMenuItemStyle extends CssResource {

    public String menuText();

  }

  private ZelenHeaderMenuItemStyle headerStyle;

  public ZelenHeaderMenuItemAppearance() {
    this(GWT.<ZelenHeaderMenuItemResources> create(ZelenHeaderMenuItemResources.class));
  }

  public ZelenHeaderMenuItemAppearance(ZelenHeaderMenuItemResources resources) {
    super(resources);
    headerStyle = resources.headerStyle();
    headerStyle.ensureInjected();
  }

  @Override
  public void applyItemStyle(Element element) {
    element.addClassName(headerStyle.menuText());
  }

}
