/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.field;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance;

public class ZelenFieldSetAppearance extends FieldSetDefaultAppearance {

  public interface ZelenFieldSetResources extends FieldSetResources {
    
    @Override
    @Source({"com/sencha/gxt/theme/base/client/field/FieldSet.css", "ZelenFieldSet.css"})
    public ZelenFieldSetStyle css();
  }
  
  public interface ZelenFieldSetStyle extends FieldSetStyle {
    
  }
  
  
  public ZelenFieldSetAppearance() {
    this(GWT.<ZelenFieldSetResources>create(ZelenFieldSetResources.class));
  }
  
  public ZelenFieldSetAppearance(ZelenFieldSetResources resources) {
    super(resources);
  }
  
}
