/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gwtapp.theme.client.base.status;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance;
import ru.formatq.gwtapp.theme.client.ThemeDetails;
import com.sencha.gxt.widget.core.client.Status.BoxStatusAppearance;

public class Css3BoxStatusAppearance extends BoxStatusBaseAppearance implements BoxStatusAppearance {

  public interface Css3BoxStatusResources extends BoxStatusResources, ClientBundle {
    @Override
    @Source("Css3BoxStatus.css")
    Css3BoxStatusStyle style();

    ThemeDetails theme();
  }

  public interface Css3BoxStatusStyle extends BoxStatusStyle {

  }

  public Css3BoxStatusAppearance() {
    super(GWT.<Css3BoxStatusResources>create(Css3BoxStatusResources.class),
            GWT.<BoxTemplate>create(BoxTemplate.class));
  }
}
