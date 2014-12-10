/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.button.IconButton.IconButtonAppearance;

public  class ZelenIconButtonAppearance implements IconButtonAppearance {

  public interface ToolButtonResources extends ClientBundle {
    
    @Source("IconButton.css")
    IconButtonStyle style();
  }
  
  public interface IconButtonStyle extends CssResource {
    String button();
  }
  

  public interface Template extends XTemplates {
    @XTemplate(source = "IconButton.html")
    SafeHtml render(IconButtonStyle style);
  }

  private final Template template;
  private final IconButtonStyle style;
  
  public ZelenIconButtonAppearance() {
    this(GWT.<ToolButtonResources>create(ToolButtonResources.class));
  }
  
  public ZelenIconButtonAppearance(ToolButtonResources resources) {
    this.style = resources.style();
    this.style.ensureInjected();
    
    this.template = GWT.create(Template.class);
  }

  @Override
  public void render(SafeHtmlBuilder sb) {
    sb.append(template.render(style));
  }

  @Override
  public XElement getIconElem(XElement parent) {
    return parent;
  }

}
