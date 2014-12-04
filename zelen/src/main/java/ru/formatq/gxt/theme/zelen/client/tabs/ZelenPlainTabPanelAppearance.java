/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel.PlainTabPanelAppearance;

/**
 * A zelen-colored appearance for {@link PlainTabPanel}. This appearance differs
 * from {@link ZelenTabPanelAppearance} in that it has a simplified tab strip.
 */
public class ZelenPlainTabPanelAppearance extends ZelenTabPanelAppearance implements PlainTabPanelAppearance {

  public interface ZelenPlainTabPanelResources extends ZelenTabPanelResources {

    @Source({
        "com/sencha/gxt/theme/base/client/tabs/TabPanel.css", "ZelenTabPanel.css",
        "com/sencha/gxt/theme/base/client/tabs/PlainTabPanel.css", "ZelenPlainTabPanel.css"})
    ZelenPlainTabPanelStyle style();

  }

  public interface ZelenPlainTabPanelStyle extends ZelenTabPanelStyle {

    String tabStripSpacer();

  }

  public interface PlainTabPanelTemplates extends Template {

    @XTemplate(source = "com/sencha/gxt/theme/base/client/tabs/TabPanel.html")
    SafeHtml render(TabPanelStyle style);

    @XTemplate(source = "com/sencha/gxt/theme/base/client/tabs/PlainTabPanel.html")
    SafeHtml renderPlain(ZelenPlainTabPanelStyle style);

  }

  private final PlainTabPanelTemplates template;
  private final ZelenPlainTabPanelStyle style;

  public ZelenPlainTabPanelAppearance() {
    this(GWT.<ZelenPlainTabPanelResources> create(ZelenPlainTabPanelResources.class),
        GWT.<PlainTabPanelTemplates> create(PlainTabPanelTemplates.class),
        GWT.<ItemTemplate> create(ItemTemplate.class));
  }

  public ZelenPlainTabPanelAppearance(ZelenPlainTabPanelResources resources, PlainTabPanelTemplates template,
                                      ItemTemplate itemTemplate) {
    super(resources, template, itemTemplate);
    this.style = resources.style();
    this.template = template;
  }

  @Override
  public void render(SafeHtmlBuilder builder) {
    builder.append(template.renderPlain(style));
  }

}
