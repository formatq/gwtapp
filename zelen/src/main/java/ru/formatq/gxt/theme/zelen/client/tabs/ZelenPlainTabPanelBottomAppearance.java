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
import ru.formatq.gxt.theme.zelen.client.tabs.ZelenPlainTabPanelAppearance.ZelenPlainTabPanelResources;
import ru.formatq.gxt.theme.zelen.client.tabs.ZelenPlainTabPanelAppearance.ZelenPlainTabPanelStyle;
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel.PlainTabPanelBottomAppearance;

/**
 * A zelen-coloured appearance for {@link PlainTabPanel} with tabs below the
 * content area. This appearance differs from
 * {@link ZelenTabPanelBottomAppearance} in that it has a simplified tab strip.
 */
public class ZelenPlainTabPanelBottomAppearance extends ZelenTabPanelBottomAppearance implements PlainTabPanelBottomAppearance {

  public interface PlainTabPanelBottomTemplates extends BottomTemplate {

    @XTemplate(source = "TabPanelBottom.html")
    SafeHtml render(TabPanelStyle style);

    @XTemplate(source = "PlainTabPanelBottom.html")
    SafeHtml renderPlain(ZelenPlainTabPanelStyle style);

  }

  protected PlainTabPanelBottomTemplates template;
  protected ZelenPlainTabPanelResources resources;

  public ZelenPlainTabPanelBottomAppearance() {
    this(GWT.<ZelenPlainTabPanelResources> create(ZelenPlainTabPanelResources.class),
        GWT.<PlainTabPanelBottomTemplates> create(PlainTabPanelBottomTemplates.class),
        GWT.<ItemTemplate> create(ItemTemplate.class));
  }

  public ZelenPlainTabPanelBottomAppearance(ZelenPlainTabPanelResources resources, PlainTabPanelBottomTemplates template,
                                            ItemTemplate itemTemplate) {
    super(resources, template, itemTemplate);
    this.resources = resources;
    this.template = template;
  }

  @Override
  public void render(SafeHtmlBuilder builder) {
    builder.append(template.renderPlain(resources.style()));
  }

}
